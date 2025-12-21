// Generated from C:/Users/HP/Desktop/JAVA PROJECT/htmlJinjaCompiler/src/antlr/TemplateParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemplateParser}.
 */
public interface TemplateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TemplateParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(TemplateParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(TemplateParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(TemplateParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(TemplateParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(TemplateParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(TemplateParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(TemplateParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(TemplateParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link TemplateParser#textContent}.
	 * @param ctx the parse tree
	 */
	void enterPlainText(TemplateParser.PlainTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link TemplateParser#textContent}.
	 * @param ctx the parse tree
	 */
	void exitPlainText(TemplateParser.PlainTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whitespaceText}
	 * labeled alternative in {@link TemplateParser#textContent}.
	 * @param ctx the parse tree
	 */
	void enterWhitespaceText(TemplateParser.WhitespaceTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whitespaceText}
	 * labeled alternative in {@link TemplateParser#textContent}.
	 * @param ctx the parse tree
	 */
	void exitWhitespaceText(TemplateParser.WhitespaceTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(TemplateParser.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(TemplateParser.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pairedHtmlElement}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterPairedHtmlElement(TemplateParser.PairedHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pairedHtmlElement}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitPairedHtmlElement(TemplateParser.PairedHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unclosedHtmlElement}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterUnclosedHtmlElement(TemplateParser.UnclosedHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unclosedHtmlElement}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitUnclosedHtmlElement(TemplateParser.UnclosedHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#openingTag}.
	 * @param ctx the parse tree
	 */
	void enterOpeningTag(TemplateParser.OpeningTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#openingTag}.
	 * @param ctx the parse tree
	 */
	void exitOpeningTag(TemplateParser.OpeningTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void enterClosingTag(TemplateParser.ClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#closingTag}.
	 * @param ctx the parse tree
	 */
	void exitClosingTag(TemplateParser.ClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link TemplateParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(TemplateParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link TemplateParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(TemplateParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlAttribute}
	 * labeled alternative in {@link TemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(TemplateParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlAttribute}
	 * labeled alternative in {@link TemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(TemplateParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleQuotedAttribute}
	 * labeled alternative in {@link TemplateParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterDoubleQuotedAttribute(TemplateParser.DoubleQuotedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleQuotedAttribute}
	 * labeled alternative in {@link TemplateParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitDoubleQuotedAttribute(TemplateParser.DoubleQuotedAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleQuotedAttribute}
	 * labeled alternative in {@link TemplateParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterSingleQuotedAttribute(TemplateParser.SingleQuotedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleQuotedAttribute}
	 * labeled alternative in {@link TemplateParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitSingleQuotedAttribute(TemplateParser.SingleQuotedAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedAttribute}
	 * labeled alternative in {@link TemplateParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedAttribute(TemplateParser.UnquotedAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedAttribute}
	 * labeled alternative in {@link TemplateParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedAttribute(TemplateParser.UnquotedAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unmatchedClosingTag}
	 * labeled alternative in {@link TemplateParser#unmatchedTag}.
	 * @param ctx the parse tree
	 */
	void enterUnmatchedClosingTag(TemplateParser.UnmatchedClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unmatchedClosingTag}
	 * labeled alternative in {@link TemplateParser#unmatchedTag}.
	 * @param ctx the parse tree
	 */
	void exitUnmatchedClosingTag(TemplateParser.UnmatchedClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#styleBlock}.
	 * @param ctx the parse tree
	 */
	void enterStyleBlock(TemplateParser.StyleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#styleBlock}.
	 * @param ctx the parse tree
	 */
	void exitStyleBlock(TemplateParser.StyleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#styleRule}.
	 * @param ctx the parse tree
	 */
	void enterStyleRule(TemplateParser.StyleRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#styleRule}.
	 * @param ctx the parse tree
	 */
	void exitStyleRule(TemplateParser.StyleRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void enterSelectorList(TemplateParser.SelectorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void exitSelectorList(TemplateParser.SelectorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(TemplateParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(TemplateParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code universalSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void enterUniversalSelector(TemplateParser.UniversalSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code universalSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void exitUniversalSelector(TemplateParser.UniversalSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(TemplateParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(TemplateParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(TemplateParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(TemplateParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(TemplateParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(TemplateParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoClassSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClassSelector(TemplateParser.PseudoClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoClassSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClassSelector(TemplateParser.PseudoClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoElementSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void enterPseudoElementSelector(TemplateParser.PseudoElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoElementSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void exitPseudoElementSelector(TemplateParser.PseudoElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributeSelectorPart}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSelectorPart(TemplateParser.AttributeSelectorPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributeSelectorPart}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSelectorPart(TemplateParser.AttributeSelectorPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoClassWithArgSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClassWithArgSelector(TemplateParser.PseudoClassWithArgSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoClassWithArgSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClassWithArgSelector(TemplateParser.PseudoClassWithArgSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleAttributeSelector}
	 * labeled alternative in {@link TemplateParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAttributeSelector(TemplateParser.SimpleAttributeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAttributeSelector}
	 * labeled alternative in {@link TemplateParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAttributeSelector(TemplateParser.SimpleAttributeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonAttributeSelector}
	 * labeled alternative in {@link TemplateParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void enterComparisonAttributeSelector(TemplateParser.ComparisonAttributeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonAttributeSelector}
	 * labeled alternative in {@link TemplateParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void exitComparisonAttributeSelector(TemplateParser.ComparisonAttributeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(TemplateParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(TemplateParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TemplateParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TemplateParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#declarationValue}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationValue(TemplateParser.DeclarationValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#declarationValue}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationValue(TemplateParser.DeclarationValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterStringStyleValue(TemplateParser.StringStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitStringStyleValue(TemplateParser.StringStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterNumericStyleValue(TemplateParser.NumericStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitNumericStyleValue(TemplateParser.NumericStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierStyleValue(TemplateParser.IdentifierStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierStyleValue(TemplateParser.IdentifierStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterColorStyleValue(TemplateParser.ColorStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitColorStyleValue(TemplateParser.ColorStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStyleValue(TemplateParser.FunctionStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStyleValue(TemplateParser.FunctionStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code urlStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterUrlStyleValue(TemplateParser.UrlStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code urlStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitUrlStyleValue(TemplateParser.UrlStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterHashStyleValue(TemplateParser.HashStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitHashStyleValue(TemplateParser.HashStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterCommaStyleValue(TemplateParser.CommaStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitCommaStyleValue(TemplateParser.CommaStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lparenStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterLparenStyleValue(TemplateParser.LparenStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lparenStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitLparenStyleValue(TemplateParser.LparenStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rparenStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterRparenStyleValue(TemplateParser.RparenStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rparenStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitRparenStyleValue(TemplateParser.RparenStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lbracketStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterLbracketStyleValue(TemplateParser.LbracketStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lbracketStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitLbracketStyleValue(TemplateParser.LbracketStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rbracketStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterRbracketStyleValue(TemplateParser.RbracketStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rbracketStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitRbracketStyleValue(TemplateParser.RbracketStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterDotStyleValue(TemplateParser.DotStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitDotStyleValue(TemplateParser.DotStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterStarStyleValue(TemplateParser.StarStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitStarStyleValue(TemplateParser.StarStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colonStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterColonStyleValue(TemplateParser.ColonStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colonStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitColonStyleValue(TemplateParser.ColonStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otherStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void enterOtherStyleValue(TemplateParser.OtherStyleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 */
	void exitOtherStyleValue(TemplateParser.OtherStyleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerNumType}
	 * labeled alternative in {@link TemplateParser#numericValueType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerNumType(TemplateParser.IntegerNumTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerNumType}
	 * labeled alternative in {@link TemplateParser#numericValueType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerNumType(TemplateParser.IntegerNumTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalNumType}
	 * labeled alternative in {@link TemplateParser#numericValueType}.
	 * @param ctx the parse tree
	 */
	void enterDecimalNumType(TemplateParser.DecimalNumTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalNumType}
	 * labeled alternative in {@link TemplateParser#numericValueType}.
	 * @param ctx the parse tree
	 */
	void exitDecimalNumType(TemplateParser.DecimalNumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TemplateParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TemplateParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(TemplateParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(TemplateParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jinjaExpression}
	 * labeled alternative in {@link TemplateParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(TemplateParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jinjaExpression}
	 * labeled alternative in {@link TemplateParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(TemplateParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#jinjaExpressionBody}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionBody(TemplateParser.JinjaExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#jinjaExpressionBody}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionBody(TemplateParser.JinjaExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleJinjaBlock}
	 * labeled alternative in {@link TemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterSimpleJinjaBlock(TemplateParser.SimpleJinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleJinjaBlock}
	 * labeled alternative in {@link TemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitSimpleJinjaBlock(TemplateParser.SimpleJinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerJinjaBlock}
	 * labeled alternative in {@link TemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterContainerJinjaBlock(TemplateParser.ContainerJinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerJinjaBlock}
	 * labeled alternative in {@link TemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitContainerJinjaBlock(TemplateParser.ContainerJinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#jinjaSimple}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSimple(TemplateParser.JinjaSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#jinjaSimple}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSimple(TemplateParser.JinjaSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#jinjaSimpleBody}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSimpleBody(TemplateParser.JinjaSimpleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#jinjaSimpleBody}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSimpleBody(TemplateParser.JinjaSimpleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#jinjaContainer}.
	 * @param ctx the parse tree
	 */
	void enterJinjaContainer(TemplateParser.JinjaContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#jinjaContainer}.
	 * @param ctx the parse tree
	 */
	void exitJinjaContainer(TemplateParser.JinjaContainerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementStart(TemplateParser.IfStatementStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementStart(TemplateParser.IfStatementStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 */
	void enterForStatementStart(TemplateParser.ForStatementStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 */
	void exitForStatementStart(TemplateParser.ForStatementStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementStart(TemplateParser.BlockStatementStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementStart(TemplateParser.BlockStatementStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code macroStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 */
	void enterMacroStatementStart(TemplateParser.MacroStatementStartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code macroStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 */
	void exitMacroStatementStart(TemplateParser.MacroStatementStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementEnd(TemplateParser.IfStatementEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementEnd(TemplateParser.IfStatementEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 */
	void enterForStatementEnd(TemplateParser.ForStatementEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 */
	void exitForStatementEnd(TemplateParser.ForStatementEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementEnd(TemplateParser.BlockStatementEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementEnd(TemplateParser.BlockStatementEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code macroStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 */
	void enterMacroStatementEnd(TemplateParser.MacroStatementEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code macroStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 */
	void exitMacroStatementEnd(TemplateParser.MacroStatementEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#jinjaKeyword}.
	 * @param ctx the parse tree
	 */
	void enterJinjaKeyword(TemplateParser.JinjaKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#jinjaKeyword}.
	 * @param ctx the parse tree
	 */
	void exitJinjaKeyword(TemplateParser.JinjaKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code malformedJinjaStatement}
	 * labeled alternative in {@link TemplateParser#malformedJinja}.
	 * @param ctx the parse tree
	 */
	void enterMalformedJinjaStatement(TemplateParser.MalformedJinjaStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code malformedJinjaStatement}
	 * labeled alternative in {@link TemplateParser#malformedJinja}.
	 * @param ctx the parse tree
	 */
	void exitMalformedJinjaStatement(TemplateParser.MalformedJinjaStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code malformedJinjaExpression}
	 * labeled alternative in {@link TemplateParser#malformedJinja}.
	 * @param ctx the parse tree
	 */
	void enterMalformedJinjaExpression(TemplateParser.MalformedJinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code malformedJinjaExpression}
	 * labeled alternative in {@link TemplateParser#malformedJinja}.
	 * @param ctx the parse tree
	 */
	void exitMalformedJinjaExpression(TemplateParser.MalformedJinjaExpressionContext ctx);
}