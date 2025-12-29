
package Visitor;
import AST.Core.*;
import AST.Css.Rules.*;
import AST.Css.Selectors.*;
import AST.Css.Values.*;
import AST.Jinja.*;
import AST.Html.*;
import antlr.TemplateParser;
import antlr.TemplateParserBaseVisitor;

public class HtmlCssJinjaVisitor extends TemplateParserBaseVisitor<ASTNode> {

    /* ================= PAGE SECTION ================= */

    @Override
    public ASTNode visitPage(TemplateParser.PageContext ctx) {

        PageNode page = new PageNode(ctx.start.getLine());

        for (int i = 0; i < ctx.content().size(); i++) {
            page.addChild(visit(ctx.content(i)));
        }
        return page;
    }

    @Override
    public ASTNode visitContent(TemplateParser.ContentContext ctx) {
        return visit(ctx.node());
    }

    /* ================= HTML SECTION ================= */

    @Override
    public ASTNode visitDoctypeNode(TemplateParser.DoctypeNodeContext ctx) {
        return new DoctypeNode(ctx.getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitPairedHtmlElement(TemplateParser.PairedHtmlElementContext ctx) {
        String tagName = ctx.openingTag().getChild(1).getText();
        HtmlElementNode element = new HtmlElementNode(tagName, ctx.start.getLine());

        // إضافة السمات (Attributes)
        for (int i = 0; i < ctx.openingTag().getChildCount(); i++) {
            if (ctx.openingTag().getChild(i) instanceof TemplateParser.AttributeContext) {
                element.addChild(visit((TemplateParser.AttributeContext) ctx.openingTag().getChild(i)));
            }
        }

        // إضافة المحتوى (Children)
        for (int i = 0; i < ctx.content().size(); i++) {
            element.addChild(visit(ctx.content(i)));
        }

        return element;
    }

    @Override
    public ASTNode visitSelfClosingElement(TemplateParser.SelfClosingElementContext ctx) {
        String tagName = ctx.tagName.getText();
        HtmlElementNode element = new HtmlElementNode(tagName, ctx.start.getLine());

        for (int i = 0; i < ctx.attribute().size(); i++) {
            element.addChild(visit(ctx.attribute(i)));
        }

        return element;
    }

    @Override
    public ASTNode visitHtmlAttribute(TemplateParser.HtmlAttributeContext ctx) {
        String name = ctx.attrName.getText();
        String value = ctx.attrValue != null ? ctx.attrValue.getText() : "";
        return new HtmlAttributeNode(name, value, ctx.start.getLine());
    }

    @Override
    public ASTNode visitTextContentNode(TemplateParser.TextContentNodeContext ctx) {
        String text = ctx.getText().trim();
        if (text.isEmpty()) return null;
        return new TextNode(text, ctx.start.getLine());
    }

    /* ================= CSS RULES SECTION ================= */

    @Override
    public ASTNode visitStyleBlockNode(TemplateParser.StyleBlockNodeContext ctx) {
        StyleBlockNode block = new StyleBlockNode(ctx.start.getLine());

        for (TemplateParser.StyleRuleContext ruleCtx : ctx.styleRule()) {
            block.addChild(visit(ruleCtx));
        }

        return block;
    }

    @Override
    public ASTNode visitStyleRuleNode(TemplateParser.StyleRuleNodeContext ctx) {
        StyleRuleNode rule = new StyleRuleNode("Rule", ctx.start.getLine());
//        String selectorsText = ctx.selectorList().getText();
//
//        // الآن اسم القاعدة سيكون: StyleRule body  (أو أي محدد موجود)
//        StyleRuleNode rule = new StyleRuleNode(selectorsText, ctx.start.getLine());
        // زيارة المحددات
        for (TemplateParser.SelectorContext selCtx : ctx.selectorList().selector()) {
            rule.addChild(visit(selCtx));
        }

        // زيارة التصريحات
        rule.addChild(visit(ctx.declarationList()));

        return rule;
    }

    @Override
    public ASTNode visitDeclarationListNode(TemplateParser.DeclarationListNodeContext ctx) {
        // استخدام الكلاس المخصص بدلاً من Anonymous Class
        DeclarationListNode list = new DeclarationListNode(ctx.start.getLine());
        for (TemplateParser.DeclarationContext decCtx : ctx.declaration()) {
            list.addChild(visit(decCtx));
        }
        return list;
    }

    @Override
    public ASTNode visitDeclarationNode(TemplateParser.DeclarationNodeContext ctx) {
        String property = ctx.property.getText();

        // العقدة الحاوية
        DeclarationNode node = new DeclarationNode(property, "", ctx.start.getLine());

        if (ctx.val != null) {
            // الحل البديل الآمن: الدوران على كل ابن في شجرة ctx.val
            // هذا يتجاوز مشكلة عدم وجود دالة valPart() في الملفات القديمة
            for (int i = 0; i < ctx.val.getChildCount(); i++) {

                // نتأكد أن الابن من النوع المطلوب (StyleValuePart)
                if (ctx.val.getChild(i) instanceof TemplateParser.StyleValuePartContext) {

                    // نقوم بزيارة الابن وتحويله لعقدة
                    ASTNode valueNode = visit(ctx.val.getChild(i));

                    // نضيفه للتعريف إذا لم يكن فارغاً
                    if (valueNode != null) {
                        node.addChild(valueNode);
                    }
                }
            }
        }

        return node;
    }
//    @Override
//    public ASTNode visitDeclarationNode(TemplateParser.DeclarationNodeContext ctx) {
//        String property = ctx.property.getText();
//
//        // نمرر قيمة فارغة للـ String في الـ Constructor لأن القيمة الحقيقية ستكون عقدة ابن (Child Node)
//        DeclarationNode node = new DeclarationNode(property, "", ctx.start.getLine());
//
//        // زيارة القيمة (Value) وإضافتها كابن للعقدة
//        ASTNode valueNode = visit(ctx.val);
//        node.addChild(valueNode);
//
//        return node;
//    }

    /* ================= CSS SELECTORS SECTION ================= */
    @Override
    public ASTNode visitSelector(TemplateParser.SelectorContext ctx) {
        // الحصول على عدد الأجزاء
        int partsCount = ctx.selectorPart().size();

        // الحالة الأولى: محدد بسيط (مثل body) -> لا حاجة للـ CombinedSelector
        if (partsCount == 1) {
            // نقوم بزيارة الجزء الوحيد وإرجاعه مباشرة
            return visit(ctx.selectorPart(0));
        }

        // الحالة الثانية: محدد مركب (مثل div.container, a:hover) -> نحتاج للوعاء
        if (partsCount > 1) {
            CombinedSelectorNode combined = new CombinedSelectorNode(ctx.start.getLine());

            // إضافة كل الجزء كابن للوعاء المركب
            for (TemplateParser.SelectorPartContext partCtx : ctx.selectorPart()) {
                combined.addChild(visit(partCtx));
            }

            return combined;
        }

        return null;
    }
    @Override
    public ASTNode visitTypeSelector(TemplateParser.TypeSelectorContext ctx) {
        return new TypeSelectorNode(ctx.STYLE_IDENT().getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitClassSelector(TemplateParser.ClassSelectorContext ctx) {
        return new ClassSelectorNode(ctx.STYLE_IDENT().getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitIdSelector(TemplateParser.IdSelectorContext ctx) {
        return new IdSelectorNode(ctx.STYLE_IDENT().getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitUniversalSelector(TemplateParser.UniversalSelectorContext ctx) {
        return new UniversalSelectorNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitPseudoClassSelector(TemplateParser.PseudoClassSelectorContext ctx) {
        String name = ctx.STYLE_IDENT().getText();
        return new PseudoClassNode(name, ctx.start.getLine());
    }

    @Override
    public ASTNode visitPseudoClassWithArgSelector(TemplateParser.PseudoClassWithArgSelectorContext ctx) {
        String name = ctx.getChild(1).getText();
        String arg = ctx.getChild(3).getText();
        return new PseudoClassNode(name + "(" + arg + ")", ctx.start.getLine());
    }

    @Override
    public ASTNode visitPseudoElementSelector(TemplateParser.PseudoElementSelectorContext ctx) {
        String name = ctx.STYLE_IDENT().getText();
        return new PseudoElementNode(name, ctx.start.getLine());
    }

    @Override
    public ASTNode visitAttributeSelectorPart(TemplateParser.AttributeSelectorPartContext ctx) {
        String attrText = ctx.attributeSelector().getText();
        return new AttributeSelectorNode("[" + attrText + "]", ctx.start.getLine());
    }

    /* ================= CSS VALUES SECTION ================= */

    @Override
    public ASTNode visitStringStyleValue(TemplateParser.StringStyleValueContext ctx) {
        String val = ctx.getText().replaceAll("^\"|\"$|^'|'$", "");
        return new StringCssValue(val, ctx.start.getLine());
    }

    @Override
    public ASTNode visitNumericStyleValue(TemplateParser.NumericStyleValueContext ctx) {
        String num = ctx.numericValueType().getText();
        String unit = (ctx.unit != null) ? ctx.unit.getText() : "";
        return new NumericCssValue(num, unit, ctx.start.getLine());
    }

    @Override
    public ASTNode visitIdentifierStyleValue(TemplateParser.IdentifierStyleValueContext ctx) {
        return new IdentifierCssValue(ctx.STYLE_IDENT().getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitColorStyleValue(TemplateParser.ColorStyleValueContext ctx) {
        return new ColorCssValue(ctx.COLOR_HEX().getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitFunctionStyleValue(TemplateParser.FunctionStyleValueContext ctx) {
        String funcName = ctx.functionCall().getChild(0).getText();
        return new FunctionCallCssValue(funcName, ctx.start.getLine());
    }

    @Override
    public ASTNode visitUrlStyleValue(TemplateParser.UrlStyleValueContext ctx) {
        return new FunctionCallCssValue("url", ctx.start.getLine());
    }

    /* ================= JINJA STRUCTURE SECTION ================= */

    @Override
    public ASTNode visitJinjaExpression(TemplateParser.JinjaExpressionContext ctx) {
        return new JinjaExpressionNode(ctx.body.getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitJinjaSimpleNode(TemplateParser.JinjaSimpleNodeContext ctx) {
        String body = ctx.body.getText();
        int line = ctx.start.getLine();

        if (body.startsWith("extends")) return new JinjaExtendsNode(body, line);
        if (body.startsWith("include")) return new JinjaIncludeNode(body, line);
        if (body.startsWith("set")) return new JinjaSetNode(body, line);

        return new JinjaNode("JinjaSimple " + body, line) {};
    }

    @Override
    public ASTNode visitJinjaContainerNode(TemplateParser.JinjaContainerNodeContext ctx) {
        ASTNode container = visit(ctx.start);

        for (int i = 0; i < ctx.content().size(); i++) {
            container.addChild(visit(ctx.content(i)));
        }

        ASTNode endNode = visit(ctx.end);
        if (endNode != null) {
            container.addChild(endNode);
        }

        return container;
    }

    /* ================= JINJA CONTROL FLOW SECTION ================= */

    @Override
    public ASTNode visitIfStatementStart(TemplateParser.IfStatementStartContext ctx) {
        return new JinjaIfNode(ctx.body.getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitElseStatementStart(TemplateParser.ElseStatementStartContext ctx) {
        return new JinjaElseNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitElifStatementStart(TemplateParser.ElifStatementStartContext ctx) {
        return new JinjaElifNode(ctx.body.getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitIfStatementEnd(TemplateParser.IfStatementEndContext ctx) {
        return new JinjaEndIfNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitForStatementStart(TemplateParser.ForStatementStartContext ctx) {
        return new JinjaForNode(ctx.body.getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitForStatementEnd(TemplateParser.ForStatementEndContext ctx) {
        return new JinjaEndForNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitBlockStatementStart(TemplateParser.BlockStatementStartContext ctx) {
        return new JinjaBlockNode(ctx.name.getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitBlockStatementEnd(TemplateParser.BlockStatementEndContext ctx) {
        return new JinjaEndBlockNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitMacroStatementStart(TemplateParser.MacroStatementStartContext ctx) {
        return new JinjaMacroNode(ctx.name.getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitMacroStatementEnd(TemplateParser.MacroStatementEndContext ctx) {
        return new JinjaNode("JinjaEndMacro", ctx.start.getLine()){};
    }
}

























//// يدار من خلال visitPage
////    @Override
////    public ASTNode visitHtmlDocument(TemplateParser.HtmlDocumentContext ctx) {
////        return super.visitHtmlDocument(ctx);
////    }



//// تتم معالجتهم داخل visitPairedHtmlElement
////    @Override
////    public ASTNode visitOpeningTagNode(TemplateParser.OpeningTagNodeContext ctx) {
////        return super.visitOpeningTagNode(ctx);
////    }
////
////    @Override
////    public ASTNode visitClosingTagNode(TemplateParser.ClosingTagNodeContext ctx) {
////        return super.visitClosingTagNode(ctx);
////    }




////تتم معالجة القيمة داخل visitHtmlAttribute
////    @Override
////    public ASTNode visitDoubleQuotedAttribute(TemplateParser.DoubleQuotedAttributeContext ctx) {
////        return super.visitDoubleQuotedAttribute(ctx);
////    }
////
////    @Override
////    public ASTNode visitSingleQuotedAttribute(TemplateParser.SingleQuotedAttributeContext ctx) {
////        return super.visitSingleQuotedAttribute(ctx);
////    }
////
////    @Override
////    public ASTNode visitUnquotedAttribute(TemplateParser.UnquotedAttributeContext ctx) {
////        return super.visitUnquotedAttribute(ctx);
////    }




////يدارون داخل  visitStyleRuleNode
////    @Override
////    public ASTNode visitSelectorList(TemplateParser.SelectorListContext ctx) {
////        return super.visitSelectorList(ctx);
////    }
////
////    @Override
////    public ASTNode visitSelector(TemplateParser.SelectorContext ctx) {
////        return super.visitSelector(ctx);
////    }





////تتم معالجتهم داخل visitAttributeSelectorPart
////    @Override
////    public ASTNode visitSimpleAttributeSelector(TemplateParser.SimpleAttributeSelectorContext ctx) {
////        return super.visitSimpleAttributeSelector(ctx);
////    }
////
////    @Override
////    public ASTNode visitComparisonAttributeSelector(TemplateParser.ComparisonAttributeSelectorContext ctx) {
////        return super.visitComparisonAttributeSelector(ctx);
////    }




////يدار داخل visitDeclarationNode
////    @Override
////    public ASTNode visitDeclarationValueNode(TemplateParser.DeclarationValueNodeContext ctx) {
////        return super.visitDeclarationValueNode(ctx);
////    }

////هذه علامات ترقيم وأقواس داخل القيم، لا نحتاج لتمثيلها كعقد منفصلة، فقط تمثل النص.
////    @Override
////    public ASTNode visitHashStyleValue(TemplateParser.HashStyleValueContext ctx) {
////        return super.visitHashStyleValue(ctx);
////    }
////
////    @Override
////    public ASTNode visitCommaStyleValue(TemplateParser.CommaStyleValueContext ctx) {
////        return super.visitCommaStyleValue(ctx);
////    }
////
////    @Override
////    public ASTNode visitLparenStyleValue(TemplateParser.LparenStyleValueContext ctx) {
////        return super.visitLparenStyleValue(ctx);
////    }
////
////    @Override
////    public ASTNode visitRparenStyleValue(TemplateParser.RparenStyleValueContext ctx) {
////        return super.visitRparenStyleValue(ctx);
////    }
////
////    @Override
////    public ASTNode visitLbracketStyleValue(TemplateParser.LbracketStyleValueContext ctx) {
////        return super.visitLbracketStyleValue(ctx);
////    }
////
////    @Override
////    public ASTNode visitRbracketStyleValue(TemplateParser.RbracketStyleValueContext ctx) {
////        return super.visitRbracketStyleValue(ctx);
////    }
////
////    @Override
////    public ASTNode visitDotStyleValue(TemplateParser.DotStyleValueContext ctx) {
////        return super.visitDotStyleValue(ctx);
////    }
////
////    @Override
////    public ASTNode visitStarStyleValue(TemplateParser.StarStyleValueContext ctx) {
////        return super.visitStarStyleValue(ctx);
////    }
////
////    @Override
////    public ASTNode visitColonStyleValue(TemplateParser.ColonStyleValueContext ctx) {
////        return super.visitColonStyleValue(ctx);
////    }
////
////    @Override
////    public ASTNode visitOtherStyleValue(TemplateParser.OtherStyleValueContext ctx) {
////        return super.visitOtherStyleValue(ctx);
////    }
//
//
////تتم معالجتهم داخل visitNumericStyleValue
////    @Override
////    public ASTNode visitIntegerNumType(TemplateParser.IntegerNumTypeContext ctx) {
////        return super.visitIntegerNumType(ctx);
////    }
////
////    @Override
////    public ASTNode visitDecimalNumType(TemplateParser.DecimalNumTypeContext ctx) {
////        return super.visitDecimalNumType(ctx);
////    }
////يدارون داخل visitFunctionStyleValue
////    @Override
////    public ASTNode visitFunctionCallNode(TemplateParser.FunctionCallNodeContext ctx) {
////        return super.visitFunctionCallNode(ctx);
////    }
////
////    @Override
////    public ASTNode visitValueListNode(TemplateParser.ValueListNodeContext ctx) {
////        return super.visitValueListNode(ctx);
////    }



//// نحن نأخذ النص كاملاً (getText) في التوابع الرئيسية، لسنا بحاجة لتحليل كل كلمة منفردة هنا.
////    @Override
////    public ASTNode visitJinjaExpressionBodyNode(TemplateParser.JinjaExpressionBodyNodeContext ctx) {
////        return super.visitJinjaExpressionBodyNode(ctx);
////    }
////    @Override
////    public ASTNode visitJinjaSimpleBodyNode(TemplateParser.JinjaSimpleBodyNodeContext ctx) {
////        return super.visitJinjaSimpleBodyNode(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaStatementBodyNode(TemplateParser.JinjaStatementBodyNodeContext ctx) {
////        return super.visitJinjaStatementBodyNode(ctx);
////    }
////

// //المنطق البرمجي الحقيقي داخل visitJinjaContainerNode و visitJinjaSimpleNode
////    @Override
////    public ASTNode visitContainerJinjaBlock(TemplateParser.ContainerJinjaBlockContext ctx) {
////        return super.visitContainerJinjaBlock(ctx);
////    }
////
////    @Override
////    public ASTNode visitSimpleJinjaBlock(TemplateParser.SimpleJinjaBlockContext ctx) {
////        return super.visitSimpleJinjaBlock(ctx);
////    }




//// هذه كلمات مفتاحية داخل الجملة، تم التعامل معها كنص في التوابع الرئيسية
////    @Override
////    public ASTNode visitJinjaKeywordIf(TemplateParser.JinjaKeywordIfContext ctx) {
////        return super.visitJinjaKeywordIf(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordElse(TemplateParser.JinjaKeywordElseContext ctx) {
////        return super.visitJinjaKeywordElse(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordElif(TemplateParser.JinjaKeywordElifContext ctx) {
////        return super.visitJinjaKeywordElif(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordEndIf(TemplateParser.JinjaKeywordEndIfContext ctx) {
////        return super.visitJinjaKeywordEndIf(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordFor(TemplateParser.JinjaKeywordForContext ctx) {
////        return super.visitJinjaKeywordFor(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordEndFor(TemplateParser.JinjaKeywordEndForContext ctx) {
////        return super.visitJinjaKeywordEndFor(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordBlock(TemplateParser.JinjaKeywordBlockContext ctx) {
////        return super.visitJinjaKeywordBlock(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordEndBlock(TemplateParser.JinjaKeywordEndBlockContext ctx) {
////        return super.visitJinjaKeywordEndBlock(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordMacro(TemplateParser.JinjaKeywordMacroContext ctx) {
////        return super.visitJinjaKeywordMacro(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordEndMacro(TemplateParser.JinjaKeywordEndMacroContext ctx) {
////        return super.visitJinjaKeywordEndMacro(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordSet(TemplateParser.JinjaKeywordSetContext ctx) {
////        return super.visitJinjaKeywordSet(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordInclude(TemplateParser.JinjaKeywordIncludeContext ctx) {
////        return super.visitJinjaKeywordInclude(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordExtends(TemplateParser.JinjaKeywordExtendsContext ctx) {
////        return super.visitJinjaKeywordExtends(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordImport(TemplateParser.JinjaKeywordImportContext ctx) {
////        return super.visitJinjaKeywordImport(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordEq(TemplateParser.JinjaKeywordEqContext ctx) {
////        return super.visitJinjaKeywordEq(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordNe(TemplateParser.JinjaKeywordNeContext ctx) {
////        return super.visitJinjaKeywordNe(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordGe(TemplateParser.JinjaKeywordGeContext ctx) {
////        return super.visitJinjaKeywordGe(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordLe(TemplateParser.JinjaKeywordLeContext ctx) {
////        return super.visitJinjaKeywordLe(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordAnd(TemplateParser.JinjaKeywordAndContext ctx) {
////        return super.visitJinjaKeywordAnd(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordOr(TemplateParser.JinjaKeywordOrContext ctx) {
////        return super.visitJinjaKeywordOr(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordNot(TemplateParser.JinjaKeywordNotContext ctx) {
////        return super.visitJinjaKeywordNot(ctx);
////    }
////
////    @Override
////    public ASTNode visitJinjaKeywordIn(TemplateParser.JinjaKeywordInContext ctx) {
////        return super.visitJinjaKeywordIn(ctx);
////    }



