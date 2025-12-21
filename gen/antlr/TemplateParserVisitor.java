// Generated from C:/Users/HP/Desktop/JAVA PROJECT/htmlJinjaCompiler/src/antlr/TemplateParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TemplateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TemplateParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(TemplateParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(TemplateParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(TemplateParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(TemplateParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link TemplateParser#textContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainText(TemplateParser.PlainTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whitespaceText}
	 * labeled alternative in {@link TemplateParser#textContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespaceText(TemplateParser.WhitespaceTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctype(TemplateParser.DoctypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pairedHtmlElement}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairedHtmlElement(TemplateParser.PairedHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unclosedHtmlElement}
	 * labeled alternative in {@link TemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnclosedHtmlElement(TemplateParser.UnclosedHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#openingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpeningTag(TemplateParser.OpeningTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#closingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosingTag(TemplateParser.ClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link TemplateParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(TemplateParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlAttribute}
	 * labeled alternative in {@link TemplateParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(TemplateParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleQuotedAttribute}
	 * labeled alternative in {@link TemplateParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleQuotedAttribute(TemplateParser.DoubleQuotedAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleQuotedAttribute}
	 * labeled alternative in {@link TemplateParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQuotedAttribute(TemplateParser.SingleQuotedAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedAttribute}
	 * labeled alternative in {@link TemplateParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedAttribute(TemplateParser.UnquotedAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unmatchedClosingTag}
	 * labeled alternative in {@link TemplateParser#unmatchedTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnmatchedClosingTag(TemplateParser.UnmatchedClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#styleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleBlock(TemplateParser.StyleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#styleRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleRule(TemplateParser.StyleRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#selectorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorList(TemplateParser.SelectorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(TemplateParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code universalSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalSelector(TemplateParser.UniversalSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(TemplateParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(TemplateParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(TemplateParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoClassSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClassSelector(TemplateParser.PseudoClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoElementSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoElementSelector(TemplateParser.PseudoElementSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributeSelectorPart}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSelectorPart(TemplateParser.AttributeSelectorPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoClassWithArgSelector}
	 * labeled alternative in {@link TemplateParser#selectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClassWithArgSelector(TemplateParser.PseudoClassWithArgSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAttributeSelector}
	 * labeled alternative in {@link TemplateParser#attributeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAttributeSelector(TemplateParser.SimpleAttributeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonAttributeSelector}
	 * labeled alternative in {@link TemplateParser#attributeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonAttributeSelector(TemplateParser.ComparisonAttributeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(TemplateParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TemplateParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#declarationValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationValue(TemplateParser.DeclarationValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringStyleValue(TemplateParser.StringStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericStyleValue(TemplateParser.NumericStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierStyleValue(TemplateParser.IdentifierStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colorStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorStyleValue(TemplateParser.ColorStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStyleValue(TemplateParser.FunctionStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code urlStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlStyleValue(TemplateParser.UrlStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashStyleValue(TemplateParser.HashStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaStyleValue(TemplateParser.CommaStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lparenStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLparenStyleValue(TemplateParser.LparenStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rparenStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRparenStyleValue(TemplateParser.RparenStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lbracketStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbracketStyleValue(TemplateParser.LbracketStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rbracketStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbracketStyleValue(TemplateParser.RbracketStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotStyleValue(TemplateParser.DotStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarStyleValue(TemplateParser.StarStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colonStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonStyleValue(TemplateParser.ColonStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code otherStyleValue}
	 * labeled alternative in {@link TemplateParser#styleValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherStyleValue(TemplateParser.OtherStyleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerNumType}
	 * labeled alternative in {@link TemplateParser#numericValueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerNumType(TemplateParser.IntegerNumTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalNumType}
	 * labeled alternative in {@link TemplateParser#numericValueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalNumType(TemplateParser.DecimalNumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TemplateParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(TemplateParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jinjaExpression}
	 * labeled alternative in {@link TemplateParser#jinjaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(TemplateParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#jinjaExpressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpressionBody(TemplateParser.JinjaExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleJinjaBlock}
	 * labeled alternative in {@link TemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleJinjaBlock(TemplateParser.SimpleJinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerJinjaBlock}
	 * labeled alternative in {@link TemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerJinjaBlock(TemplateParser.ContainerJinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#jinjaSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSimple(TemplateParser.JinjaSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#jinjaSimpleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSimpleBody(TemplateParser.JinjaSimpleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#jinjaContainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaContainer(TemplateParser.JinjaContainerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementStart(TemplateParser.IfStatementStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementStart(TemplateParser.ForStatementStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementStart(TemplateParser.BlockStatementStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code macroStatementStart}
	 * labeled alternative in {@link TemplateParser#jinjaContainerStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroStatementStart(TemplateParser.MacroStatementStartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementEnd(TemplateParser.IfStatementEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementEnd(TemplateParser.ForStatementEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementEnd(TemplateParser.BlockStatementEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code macroStatementEnd}
	 * labeled alternative in {@link TemplateParser#jinjaContainerEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroStatementEnd(TemplateParser.MacroStatementEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateParser#jinjaKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaKeyword(TemplateParser.JinjaKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code malformedJinjaStatement}
	 * labeled alternative in {@link TemplateParser#malformedJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMalformedJinjaStatement(TemplateParser.MalformedJinjaStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code malformedJinjaExpression}
	 * labeled alternative in {@link TemplateParser#malformedJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMalformedJinjaExpression(TemplateParser.MalformedJinjaExpressionContext ctx);
}