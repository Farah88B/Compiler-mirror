parser grammar TemplateParser;

 options { tokenVocab=TemplateLexer; }

 /*  PAGE  */
 page
     : (htmlDocument | content)* EOF
     ;

 /*
      HTML DOCUMENT
  */
 htmlDocument
     : doctype? htmlElement
     ;

 /*  GENERAL CONTENT  */
 content
     : node
     ;

 /*
    NODES
   */
 node
     : htmlElement
     | selfClosingTag
     | styleBlock
     | jinjaBlock
     | jinjaExpr
     | textContent
     | unmatchedTag
     | malformedJinja
     | JINJA_COMMENT
     ;

 /* TEXT CONTENT */
 textContent
     : TEXT #plainText
     | WS #whitespaceText
     ;

 /*
    DOCTYPE
  */
 doctype
     : DOCTYPE
     ;

 /*
         HTML Parsing Rules
 */
 htmlElement
     : openingTag (node | textContent)* closingTag #pairedHtmlElement
     | openingTag (node | textContent)* #unclosedHtmlElement
     ;

 openingTag
     : TAG_OPEN tagName=TAG_NAME attrs=attribute* TAG_CLOSE
     ;

 closingTag
     : TAG_OPEN SLASH tagName=TAG_NAME TAG_CLOSE
     ;

 selfClosingTag
     : TAG_OPEN tagName=TAG_NAME attrs=attribute* SLASH? TAG_CLOSE #selfClosingElement
     ;

 attribute
     : attrName=TAG_NAME (EQUAL attrValue=attributeValue)? #htmlAttribute
     ;

 attributeValue
     : DOUBLE_QUOTE_STRING #doubleQuotedAttribute
     | SINGLE_QUOTE_STRING #singleQuotedAttribute
     | UNQUOTED_VALUE #unquotedAttribute
     ;

 // Handle unmatched closing tags gracefully
 unmatchedTag
     : TAG_OPEN SLASH tagName=TAG_NAME TAG_CLOSE #unmatchedClosingTag
     ;

 /*
  STYLE BLOCK Wich is the CSS Parsing Rules
  */

 styleBlock
     : STYLE_OPEN rules=styleRule* STYLE_CLOSE
     ;

 styleRule
     : selectors=selectorList LBRACE declarations=declarationList RBRACE
     ;

 // SELECTOR LIST
 selectorList
     : selector (COMMA STYLE_WS* selector)*
     ;

 selector
     : selectorPart (STYLE_WS+ selectorPart)*
     ;

 selectorPart
     : STAR #universalSelector
     | HASH STYLE_IDENT #idSelector
     | DOT STYLE_IDENT #classSelector
     | STYLE_IDENT #typeSelector
     | COLON STYLE_IDENT #pseudoClassSelector
     | DOUBLE_COLON STYLE_IDENT #pseudoElementSelector
     | LBRACKET attributeSelector RBRACKET #attributeSelectorPart
     | COLON STYLE_IDENT LPAREN (NUMBER | STYLE_IDENT) RPAREN #pseudoClassWithArgSelector
     ;

 attributeSelector
     : STYLE_IDENT #simpleAttributeSelector
     | STYLE_IDENT op=(EQUAL | TILDE_EQUAL | PIPE_EQUAL | CARET_EQUAL | DOLLAR_EQUAL | STAR_EQUAL) value=STYLE_STRING #comparisonAttributeSelector
     ;

 //  DECLARATIONS
 declarationList
     : declaration*
     ;

 declaration
     : property=STYLE_IDENT COLON val=declarationValue SEMI
     ;

 // DECLARATION VALUE
 declarationValue
     : valPart=styleValuePart (STYLE_WS* valPart=styleValuePart)*
     ;

 styleValuePart
     : STYLE_STRING #stringStyleValue
     | numVal=numericValueType unit=UNIT? #numericStyleValue
     | STYLE_IDENT #identifierStyleValue
     | COLOR_HEX #colorStyleValue
     | functionCall #functionStyleValue
     | URL #urlStyleValue
     | HASH #hashStyleValue
     | COMMA #commaStyleValue
     | LPAREN #lparenStyleValue
     | RPAREN #rparenStyleValue
     | LBRACKET #lbracketStyleValue
     | RBRACKET #rbracketStyleValue
     | DOT #dotStyleValue
     | STAR #starStyleValue
     | COLON #colonStyleValue
     | STYLE_OTHER #otherStyleValue
     ;

 numericValueType
     : NUMBER #integerNumType
     | DECIMAL #decimalNumType
     ;

 functionCall
     : funcName=STYLE_IDENT LPAREN args=valueList? RPAREN
     ;

 valueList
     : styleValuePart (COMMA styleValuePart)*
     ;

 /*
        JINJA Parsing Rules
  */

 jinjaExpr
     : JINJA_EXPR_OPEN body=jinjaExpressionBody JINJA_EXPR_CLOSE #jinjaExpression
     ;

 jinjaExpressionBody
     : (JINJA_EXPR_IDENT
       | JINJA_EXPR_NUMBER
       | JINJA_EXPR_STRING
       | JINJA_EXPR_OPERATOR
       | JINJA_EXPR_PUNCT
       | JINJA_EXPR_WS
       | JINJA_EXPR_EQ
       | JINJA_EXPR_NE
       | JINJA_EXPR_GT
       | JINJA_EXPR_LT
       | JINJA_EXPR_GE
       | JINJA_EXPR_LE
       | JINJA_EXPR_AND
       | JINJA_EXPR_OR
       | JINJA_EXPR_NOT
       | JINJA_EXPR_IN
       )*
     ;

 jinjaBlock
     : jinjaSimple #simpleJinjaBlock
     | jinjaContainer #containerJinjaBlock
     ;

 // Simple Jinja statements (no body)
 jinjaSimple
     : JINJA_STMT_OPEN body=jinjaSimpleBody JINJA_STMT_CLOSE
     ;

 jinjaSimpleBody
     : (jinjaKeyword
       | JINJA_IDENT
       | JINJA_STRING
       | JINJA_NUMBER
       | JINJA_OPERATOR
       | JINJA_PUNCT
       | JINJA_WS
       | JINJA_EQ
       | JINJA_NE
       | JINJA_GT
       | JINJA_LT
       | JINJA_GE
       | JINJA_LE
       | JINJA_AND
       | JINJA_OR
       | JINJA_NOT
       | JINJA_IN
       )+
     ;

 // Container Jinja statements (with body)
 jinjaContainer
     : JINJA_STMT_OPEN start=jinjaContainerStart JINJA_STMT_CLOSE
       body=node*
       JINJA_STMT_OPEN end=jinjaContainerEnd JINJA_STMT_CLOSE
     ;

 jinjaContainerStart
     : JINJA_IF expression=jinjaExpressionBody #ifStatementStart
     | JINJA_FOR expression=jinjaExpressionBody #forStatementStart
     | JINJA_BLOCK name=JINJA_IDENT #blockStatementStart
     | JINJA_MACRO name=JINJA_IDENT #macroStatementStart
     ;

 jinjaContainerEnd
     : JINJA_ENDIF #ifStatementEnd
     | JINJA_ENDFOR #forStatementEnd
     | JINJA_ENDBLOCK #blockStatementEnd
     | JINJA_ENDMACRO #macroStatementEnd
     ;

 jinjaKeyword
     : JINJA_IF | JINJA_ELSE | JINJA_ELIF | JINJA_ENDIF
     | JINJA_FOR | JINJA_ENDFOR
     | JINJA_BLOCK | JINJA_ENDBLOCK
     | JINJA_MACRO | JINJA_ENDMACRO
     | JINJA_SET | JINJA_INCLUDE | JINJA_EXTENDS | JINJA_IMPORT
     | JINJA_EQ | JINJA_NE | JINJA_GT | JINJA_LT | JINJA_GE | JINJA_LE
     | JINJA_AND | JINJA_OR | JINJA_NOT | JINJA_IN
     ;

 // Handle malformed Jinja tags
 malformedJinja
     : JINJA_STMT_OPEN .*? #malformedJinjaStatement
     | JINJA_EXPR_OPEN .*? #malformedJinjaExpression
                ;