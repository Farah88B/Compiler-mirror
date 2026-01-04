//package Visitor;
//
//import antlr.TemplateParser;
//import antlr.TemplateParserBaseVisitor;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.TerminalNode;
//import symbol_table.Symbol;
//import symbol_table.SymbolTable;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class SymbolTableVisitor extends TemplateParserBaseVisitor<Void> {
//
//    private final SymbolTable symTab;
//    private final Set<String> jinjaKeywords;
//
//    public SymbolTableVisitor() {
//        this.symTab = new SymbolTable();
//        this.jinjaKeywords = new HashSet<>();
//        initKeywords();
//    }
//
//    private void initKeywords() {
//        String[] keywords = {"if", "else", "elif", "endif", "for", "endfor", "in", "and", "or", "not",
//                "set", "macro", "endmacro", "block", "endblock", "extends", "include",
//                "import", "is", "None", "True", "False", "recursive", "loop", "super"};
//        for (String k : keywords) {
//            jinjaKeywords.add(k);
//        }
//    }
//
//    public SymbolTable getSymbolTable() {
//        return this.symTab;
//    }
//
//    @Override
//    public Void visitPage(TemplateParser.PageContext ctx) {
//        symTab.enterScope("GLOBAL");
//        for (int i = 0; i < ctx.content().size(); i++) {
//            visit(ctx.content(i));
//        }
//        return null;
//    }
//
//    @Override
//    public Void visitContent(TemplateParser.ContentContext ctx) {
//        return visit(ctx.node());
//    }
//
//    // Ignoring HTML/CSS
//    @Override public Void visitDoctypeNode(TemplateParser.DoctypeNodeContext ctx) { return null; }
//    @Override public Void visitPairedHtmlElement(TemplateParser.PairedHtmlElementContext ctx) { return visitChildren(ctx); }
//    @Override public Void visitSelfClosingElement(TemplateParser.SelfClosingElementContext ctx) { return visitChildren(ctx); }
//    @Override public Void visitStyleBlockNode(TemplateParser.StyleBlockNodeContext ctx) { return visitChildren(ctx); }
//    @Override public Void visitStyleRuleNode(TemplateParser.StyleRuleNodeContext ctx) { return visitChildren(ctx); }
//    @Override public Void visitDeclarationNode(TemplateParser.DeclarationNodeContext ctx) { return visitChildren(ctx); }
//
//    // =========================================================
//    // JINJA LOGIC
//    // =========================================================
//
//    @Override
//    public Void visitJinjaContainerNode(TemplateParser.JinjaContainerNodeContext ctx) {
//        boolean isScopeCreatingBlock =
//                ctx.start instanceof TemplateParser.ForStatementStartContext ||
//                        ctx.start instanceof TemplateParser.MacroStatementStartContext ||
//                        ctx.start instanceof TemplateParser.BlockStatementStartContext;
//
//        if (isScopeCreatingBlock) {
//            String scopeType = "UNKNOWN";
//            if (ctx.start instanceof TemplateParser.ForStatementStartContext) scopeType = "FOR_LOOP";
//            if (ctx.start instanceof TemplateParser.MacroStatementStartContext) scopeType = "MACRO";
//            if (ctx.start instanceof TemplateParser.BlockStatementStartContext) scopeType = "BLOCK";
//            symTab.enterScope(scopeType);
//        }
//
//        visit(ctx.start); // Process Start (Inserts variables)
//
//        for (int i = 0; i < ctx.content().size(); i++) {
//            visit(ctx.content(i)); // Process Body (Checks variables)
//        }
//
//        visit(ctx.end);
//
//        if (isScopeCreatingBlock) {
//            symTab.exitScope();
//        }
//
//        return null;
//    }
//
//    @Override
//    public Void visitJinjaSimpleNode(TemplateParser.JinjaSimpleNodeContext ctx) {
//        // التعامل مع {% set x = 10 %}
//        TemplateParser.JinjaStatementBodyContext body = ctx.body;
//        if (body != null) {
//            parseSetStatement(body, ctx.start.getLine());
//        }
//        return null;
//    }
//
//    @Override
//    public Void visitForStatementStart(TemplateParser.ForStatementStartContext ctx) {
//        // التعامل مع {% for p in products %}
//        TemplateParser.JinjaStatementBodyContext body = ctx.body;
//        if (body != null) {
//            parseForStatement(body, ctx.start.getLine());
//        }
//        return null;
//    }
//
//    @Override
//    public Void visitMacroStatementStart(TemplateParser.MacroStatementStartContext ctx) {
//        String macroName = ctx.name.getText();
//        symTab.insert(macroName, "Macro", "function", symTab.getCurrentScope().getScopeType(), ctx.start.getLine());
//        return null;
//    }
//
//    @Override
//    public Void visitBlockStatementStart(TemplateParser.BlockStatementStartContext ctx) {
//        String blockName = ctx.name.getText();
//        symTab.insert(blockName, "Block", "block", symTab.getCurrentScope().getScopeType(), ctx.start.getLine());
//        return null;
//    }
//
//    @Override
//    public Void visitIfStatementStart(TemplateParser.IfStatementStartContext ctx) {
//        TemplateParser.JinjaStatementBodyContext body = ctx.body;
//        if (body != null) {
//            parseConditionBody(body, ctx.start.getLine());
//        }
//        return null;
//    }
//
//    @Override
//    public Void visitElifStatementStart(TemplateParser.ElifStatementStartContext ctx) {
//        TemplateParser.JinjaStatementBodyContext body = ctx.body;
//        if (body != null) {
//            parseConditionBody(body, ctx.start.getLine());
//        }
//        return null;
//    }
//
//    @Override
//    public Void visitJinjaExpression(TemplateParser.JinjaExpressionContext ctx) {
//        String expressionText = ctx.body.getText();
//        resolveVariablesInExpression(expressionText, ctx.start.getLine());
//        return null;
//    }
//
//    // =========================================================
//    // SMART PARSING HELPERS (Replacing String split)
//    // =========================================================
//
//    private void parseSetStatement(TemplateParser.JinjaStatementBodyContext ctx, int line) {
//        // البنية المتوقعة: set var = value
//        // نقوم بالمرور على الأبناء لاستخراج var
//        boolean foundEqual = false;
//        String varName = null;
//        StringBuilder valueExpr = new StringBuilder();
//
//        for (ParseTree child : ctx.children) {
//            if (child instanceof TerminalNode) {
//                TerminalNode node = (TerminalNode) child;
//                if (node.getSymbol().getType() == TemplateParser.EQUAL) {
//                    foundEqual = true;
//                } else if (!foundEqual && node.getSymbol().getType() == TemplateParser.JINJA_IDENT) {
//                    // هذا هو اسم المتغير إذا كنا قبل علامة المساواة
//                    if (varName == null) {
//                        varName = node.getText();
//                    }
//                } else if (foundEqual) {
//                    // كل شيء بعد يساوي هو قيمة
//                    valueExpr.append(node.getText()).append(" ");
//                }
//            } else if (child instanceof TemplateParser.JinjaKeywordContext) {
//                // كلمة set
//                if (foundEqual) valueExpr.append(child.getText()).append(" ");
//            }
//        }
//
//        if (varName != null) {
//            symTab.insert(varName, "Local Variable", "variable", symTab.getCurrentScope().getScopeType(), line);
//            // التحقق من المتغيرات في القيمة
//            if (valueExpr.length() > 0) {
//                resolveVariablesInExpression(valueExpr.toString(), line);
//            }
//        }
//    }
//
//    private void parseForStatement(TemplateParser.JinjaStatementBodyContext ctx, int line) {
//        // البنية: var in iterable
//        boolean foundIn = false;
//        String loopVar = null;
//        String iterable = "";
//
//        for (ParseTree child : ctx.children) {
//            if (child instanceof TerminalNode) {
//                TerminalNode node = (TerminalNode) child;
//                if (node.getSymbol().getType() == TemplateParser.JINJA_IDENT) {
//                    if (!foundIn) {
//                        loopVar = node.getText(); // المتغير قبل in
//                    } else {
//                        iterable = node.getText(); // المتغير بعد in
//                    }
//                }
//            } else if (child instanceof TemplateParser.JinjaKeywordContext) {
//                if ("in".equals(child.getText())) {
//                    foundIn = true;
//                }
//            }
//        }
//
//        if (loopVar != null) {
//            symTab.insert(loopVar, "Iterator", "variable", symTab.getCurrentScope().getScopeType(), line);
//            if (!iterable.isEmpty()) {
//                resolveVariablesInExpression(iterable, line);
//            }
//        }
//    }
//
//    private void parseConditionBody(TemplateParser.JinjaStatementBodyContext ctx, int line) {
//        // نجمع النص الكامل للشرط للتحقق من المتغيرات
//        // بما أن الـ AST لا يعطينا "نص الشرط" معزولاً، سنعيد بناء النص
//        StringBuilder conditionText = new StringBuilder();
//        for (ParseTree child : ctx.children) {
//            // نتجاهل if/elif لأنها في الجذر
//            if (!(child instanceof TemplateParser.JinjaKeywordContext) ||
//                    (!"if".equals(child.getText()) && !"elif".equals(child.getText()))) {
//                conditionText.append(child.getText()).append(" ");
//            }
//        }
//        if (conditionText.length() > 0) {
//            resolveVariablesInExpression(conditionText.toString(), line);
//        }
//    }
//
//    // =========================================================
//    // EXPRESSION RESOLVER
//    // =========================================================
//
//    private void resolveVariablesInExpression(String expressionText, int line) {
//        // regex لاستخراج المعرفات: obj.prop سيتم استخراج obj و prop
//        Pattern pattern = Pattern.compile("\\b[a-zA-Z_][a-zA-Z0-9_]*\\b");
//        Matcher matcher = pattern.matcher(expressionText);
//
//        while (matcher.find()) {
//            String identifier = matcher.group();
//            int start = matcher.start();
//            int end = matcher.end();
//
//            // التحقق مما إذا كان هذا المعرف جزءاً من خاصية كائن (Property Access)
//            // مثال: في "p.name"، 'p' هو المتغير، و '.' موجودة بعده.
//            // إذا كان الحرف التالي هو نقطة، فإن هذا المعرف هو الكائن، ويجب التحقق منه.
//            // إذا كان الحرف السابق هو نقطة، فهذه خاصية (property)، وعادة لا نتحقق منها في Jinja الديناميكي.
//
//            boolean isProperty = false;
//            if (start > 0 && expressionText.charAt(start - 1) == '.') {
//                isProperty = true;
//            }
//
//            if (jinjaKeywords.contains(identifier)) continue;
//
//            // إذا كان الخاصية (property) مثل name في p.name، نتخطاه لأننا لا نملك تعريفات الكلاسات
//            if (isProperty) continue;
//
//            Symbol symbol = symTab.lookup(identifier);
//            if (symbol == null) {
//                System.err.println("SEMANTIC ERROR at line " + line + ": Undefined variable '" + identifier + "'");
//            }
//        }
//    }
//}

package Visitor;

import antlr.TemplateParser;
import antlr.TemplateParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbol_table.Symbol;
import symbol_table.SymbolTable;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolTableVisitor extends TemplateParserBaseVisitor<Void> {

    private final SymbolTable symTab;
    private final Set<String> jinjaKeywords;

    public SymbolTableVisitor() {
        this.symTab = new SymbolTable();
        this.jinjaKeywords = new HashSet<>();
        initKeywords();
    }

    private void initKeywords() {
        String[] keywords = {"if", "else", "elif", "endif", "for", "endfor", "in", "and", "or", "not",
                "set", "macro", "endmacro", "block", "endblock", "extends", "include",
                "import", "is", "None", "True", "False", "recursive", "loop", "super"};
        for (String k : keywords) {
            jinjaKeywords.add(k);
        }
    }

    public SymbolTable getSymbolTable() {
        return this.symTab;
    }

    @Override
    public Void visitPage(TemplateParser.PageContext ctx) {
        symTab.enterScope("GLOBAL");
        for (int i = 0; i < ctx.content().size(); i++) {
            visit(ctx.content(i));
        }
        return null;
    }

    @Override
    public Void visitContent(TemplateParser.ContentContext ctx) {
        return visit(ctx.node());
    }


    @Override public Void visitDoctypeNode(TemplateParser.DoctypeNodeContext ctx) { return null; }
    @Override public Void visitPairedHtmlElement(TemplateParser.PairedHtmlElementContext ctx) { return visitChildren(ctx); }
    @Override public Void visitSelfClosingElement(TemplateParser.SelfClosingElementContext ctx) { return visitChildren(ctx); }
    @Override public Void visitStyleBlockNode(TemplateParser.StyleBlockNodeContext ctx) { return visitChildren(ctx); }
    @Override public Void visitStyleRuleNode(TemplateParser.StyleRuleNodeContext ctx) { return visitChildren(ctx); }
    @Override public Void visitDeclarationNode(TemplateParser.DeclarationNodeContext ctx) { return visitChildren(ctx); }


// jinja
    @Override
    public Void visitJinjaContainerNode(TemplateParser.JinjaContainerNodeContext ctx) {
        boolean isScopeCreatingBlock =
                ctx.start instanceof TemplateParser.ForStatementStartContext ||
                        ctx.start instanceof TemplateParser.MacroStatementStartContext ||
                        ctx.start instanceof TemplateParser.BlockStatementStartContext;

        if (isScopeCreatingBlock) {
            String scopeType = "UNKNOWN";
            if (ctx.start instanceof TemplateParser.ForStatementStartContext) scopeType = "FOR_LOOP";
            if (ctx.start instanceof TemplateParser.MacroStatementStartContext) scopeType = "MACRO";
            if (ctx.start instanceof TemplateParser.BlockStatementStartContext) scopeType = "BLOCK";
            symTab.enterScope(scopeType);
        }

        visit(ctx.start);

        for (int i = 0; i < ctx.content().size(); i++) {
            visit(ctx.content(i));
        }

        visit(ctx.end);

        if (isScopeCreatingBlock) {
            symTab.exitScope();
        }

        return null;
    }

    @Override
    public Void visitJinjaSimpleNode(TemplateParser.JinjaSimpleNodeContext ctx) {
        TemplateParser.JinjaStatementBodyContext body = ctx.body;
        if (body != null) {
            parseSetStatement(body, ctx.getStart().getLine());
        }
        return null;
    }

    @Override
    public Void visitForStatementStart(TemplateParser.ForStatementStartContext ctx) {
        TemplateParser.JinjaStatementBodyContext body = ctx.body;
        if (body != null) {
            parseForStatement(body, ctx.getStart().getLine());
        }
        return null;
    }

    @Override
    public Void visitMacroStatementStart(TemplateParser.MacroStatementStartContext ctx) {
        String macroName = ctx.name.getText();

        symTab.insert(macroName, "Macro", "function", symTab.getCurrentScope().getScopeType(), ctx.getStart().getLine());
        return null;
    }

    @Override
    public Void visitBlockStatementStart(TemplateParser.BlockStatementStartContext ctx) {
        String blockName = ctx.name.getText();

        symTab.insert(blockName, "Block", "block", symTab.getCurrentScope().getScopeType(), ctx.getStart().getLine());
        return null;
    }

    @Override
    public Void visitIfStatementStart(TemplateParser.IfStatementStartContext ctx) {
        TemplateParser.JinjaStatementBodyContext body = ctx.body;
        if (body != null) {
            parseConditionBody(body, ctx.getStart().getLine());
        }
        return null;
    }

    @Override
    public Void visitElifStatementStart(TemplateParser.ElifStatementStartContext ctx) {
        TemplateParser.JinjaStatementBodyContext body = ctx.body;
        if (body != null) {
            parseConditionBody(body, ctx.getStart().getLine());
        }
        return null;
    }

    @Override
    public Void visitJinjaExpression(TemplateParser.JinjaExpressionContext ctx) {
        String expressionText = ctx.body.getText();
        resolveVariablesInExpression(expressionText, ctx.start.getLine());
        return null;
    }


    private void parseSetStatement(TemplateParser.JinjaStatementBodyContext ctx, int line) {
        boolean foundEqual = false;
        String varName = null;
        StringBuilder valueExpr = new StringBuilder();

        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode) {
                TerminalNode node = (TerminalNode) child;
                String text = node.getText();

                if ("=".equals(text)) {
                    foundEqual = true;
                } else if (!foundEqual && node.getSymbol().getType() == TemplateParser.JINJA_IDENT) {
                    if (varName == null) {
                        varName = text;
                    }
                } else if (foundEqual) {
                    valueExpr.append(text).append(" ");
                }
            }
        }


        if (varName != null) {
            symTab.insert(varName, "Local Variable", "variable", symTab.getCurrentScope().getScopeType(), line);
            if (valueExpr.length() > 0) {
                resolveVariablesInExpression(valueExpr.toString(), line);
            }
        }
    }


    private void parseForStatement(TemplateParser.JinjaStatementBodyContext ctx, int line) {
        boolean foundIn = false;
        String loopVar = null;
        String iterable = "";

        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode) {
                TerminalNode node = (TerminalNode) child;
                String text = node.getText();
                int type = node.getSymbol().getType();

                if ("in".equals(text)) {
                    foundIn = true;
                } else if (type == TemplateParser.JINJA_IDENT) {
                    if (!foundIn) {
                        loopVar = text;
                    } else {
                        iterable = text;
                    }
                }
            } else if (child instanceof TemplateParser.JinjaKeywordContext) {
                if ("in".equals(child.getText())) {
                    foundIn = true;
                }
            }
        }
        if (loopVar != null) {
            symTab.insert(loopVar, "Iterator", "variable", symTab.getCurrentScope().getScopeType(), line);
            if (!iterable.isEmpty()) {
                resolveVariablesInExpression(iterable, line);
            }
        }
    }

    private void parseConditionBody(TemplateParser.JinjaStatementBodyContext ctx, int line) {
        StringBuilder conditionText = new StringBuilder();
        for (ParseTree child : ctx.children) {
            if (!(child instanceof TemplateParser.JinjaKeywordContext) ||
                    (!"if".equals(child.getText()) && !"elif".equals(child.getText()))) {
                conditionText.append(child.getText()).append(" ");
            }
        }
        if (conditionText.length() > 0) {
            resolveVariablesInExpression(conditionText.toString(), line);
        }
    }



    private void resolveVariablesInExpression(String expressionText, int line) {

        String cleanedText = expressionText.replaceAll("\\s+", "");

        Pattern pattern = Pattern.compile("\\b[a-zA-Z_][a-zA-Z0-9_]*\\b");
        Matcher matcher = pattern.matcher(cleanedText);

        while (matcher.find()) {
            String identifier = matcher.group();
            int start = matcher.start();
            int end = matcher.end();


            boolean isProperty = false;

            if (start > 0 && cleanedText.charAt(start - 1) == '.') {
                isProperty = true;
            }

            if (jinjaKeywords.contains(identifier)) continue;


            if (isProperty) continue;

            Symbol symbol = symTab.lookup(identifier);
            if (symbol == null) {
                System.err.println("SEMANTIC ERROR at line " + line + ": Undefined variable '" + identifier + "'");
            }
        }
    }
}