// Generated from C:/Users/HP/Desktop/JAVA PROJECT/htmlJinjaCompiler/src/antlr/TemplateParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, HTML_COMMENT=2, CDATA=3, JINJA_STMT_OPEN=4, JINJA_EXPR_OPEN=5, 
		JINJA_COMMENT=6, STYLE_OPEN=7, TAG_OPEN=8, TEXT=9, WS=10, UNEXPECTED_CHAR=11, 
		TAG_NAME=12, SLASH=13, EQUAL=14, DOUBLE_QUOTE_STRING=15, SINGLE_QUOTE_STRING=16, 
		UNQUOTED_VALUE=17, TAG_CLOSE=18, TAG_WS=19, STYLE_CLOSE=20, LBRACE=21, 
		RBRACE=22, COLON=23, SEMI=24, COMMA=25, DOT=26, HASH=27, STAR=28, LPAREN=29, 
		RPAREN=30, LBRACKET=31, RBRACKET=32, DOUBLE_COLON=33, TILDE_EQUAL=34, 
		PIPE_EQUAL=35, CARET_EQUAL=36, DOLLAR_EQUAL=37, STAR_EQUAL=38, DECIMAL=39, 
		NUMBER=40, UNIT=41, COLOR_HEX=42, STYLE_IDENT=43, STYLE_STRING=44, URL=45, 
		STYLE_WS=46, STYLE_OTHER=47, JINJA_STMT_CLOSE=48, JINJA_IF=49, JINJA_ELSE=50, 
		JINJA_ELIF=51, JINJA_ENDIF=52, JINJA_FOR=53, JINJA_ENDFOR=54, JINJA_BLOCK=55, 
		JINJA_ENDBLOCK=56, JINJA_MACRO=57, JINJA_ENDMACRO=58, JINJA_SET=59, JINJA_INCLUDE=60, 
		JINJA_EXTENDS=61, JINJA_IMPORT=62, JINJA_EQ=63, JINJA_NE=64, JINJA_GT=65, 
		JINJA_LT=66, JINJA_GE=67, JINJA_LE=68, JINJA_AND=69, JINJA_OR=70, JINJA_NOT=71, 
		JINJA_IN=72, JINJA_IDENT=73, JINJA_STRING=74, JINJA_NUMBER=75, JINJA_OPERATOR=76, 
		JINJA_PUNCT=77, JINJA_WS=78, JINJA_BODY=79, JINJA_EXPR_CLOSE=80, JINJA_EXPR_EQ=81, 
		JINJA_EXPR_NE=82, JINJA_EXPR_GT=83, JINJA_EXPR_LT=84, JINJA_EXPR_GE=85, 
		JINJA_EXPR_LE=86, JINJA_EXPR_AND=87, JINJA_EXPR_OR=88, JINJA_EXPR_NOT=89, 
		JINJA_EXPR_IN=90, JINJA_EXPR_IDENT=91, JINJA_EXPR_NUMBER=92, JINJA_EXPR_STRING=93, 
		JINJA_EXPR_OPERATOR=94, JINJA_EXPR_PUNCT=95, JINJA_EXPR_WS=96, JINJA_EXPR_BODY=97;
	public static final int
		RULE_page = 0, RULE_htmlDocument = 1, RULE_content = 2, RULE_node = 3, 
		RULE_textContent = 4, RULE_doctype = 5, RULE_htmlElement = 6, RULE_openingTag = 7, 
		RULE_closingTag = 8, RULE_selfClosingTag = 9, RULE_attribute = 10, RULE_attributeValue = 11, 
		RULE_unmatchedTag = 12, RULE_styleBlock = 13, RULE_styleRule = 14, RULE_selectorList = 15, 
		RULE_selector = 16, RULE_selectorPart = 17, RULE_attributeSelector = 18, 
		RULE_declarationList = 19, RULE_declaration = 20, RULE_declarationValue = 21, 
		RULE_styleValuePart = 22, RULE_numericValueType = 23, RULE_functionCall = 24, 
		RULE_valueList = 25, RULE_jinjaExpr = 26, RULE_jinjaExpressionBody = 27, 
		RULE_jinjaBlock = 28, RULE_jinjaSimple = 29, RULE_jinjaSimpleBody = 30, 
		RULE_jinjaContainer = 31, RULE_jinjaContainerStart = 32, RULE_jinjaContainerEnd = 33, 
		RULE_jinjaKeyword = 34, RULE_malformedJinja = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "htmlDocument", "content", "node", "textContent", "doctype", 
			"htmlElement", "openingTag", "closingTag", "selfClosingTag", "attribute", 
			"attributeValue", "unmatchedTag", "styleBlock", "styleRule", "selectorList", 
			"selector", "selectorPart", "attributeSelector", "declarationList", "declaration", 
			"declarationValue", "styleValuePart", "numericValueType", "functionCall", 
			"valueList", "jinjaExpr", "jinjaExpressionBody", "jinjaBlock", "jinjaSimple", 
			"jinjaSimpleBody", "jinjaContainer", "jinjaContainerStart", "jinjaContainerEnd", 
			"jinjaKeyword", "malformedJinja"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'{%'", "'{{'", null, "'<style>'", null, null, 
			null, null, null, "'/'", "'='", null, null, null, null, null, "'</style>'", 
			"'{'", "'}'", "':'", "';'", "','", "'.'", "'#'", "'*'", "'('", "')'", 
			"'['", "']'", "'::'", "'~='", "'|='", "'^='", "'$='", "'*='", null, null, 
			null, null, null, null, null, null, null, "'%}'", "'if'", "'else'", "'elif'", 
			"'endif'", "'for'", "'endfor'", "'block'", "'endblock'", "'macro'", "'endmacro'", 
			"'set'", "'include'", "'extends'", "'import'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "HTML_COMMENT", "CDATA", "JINJA_STMT_OPEN", "JINJA_EXPR_OPEN", 
			"JINJA_COMMENT", "STYLE_OPEN", "TAG_OPEN", "TEXT", "WS", "UNEXPECTED_CHAR", 
			"TAG_NAME", "SLASH", "EQUAL", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", 
			"UNQUOTED_VALUE", "TAG_CLOSE", "TAG_WS", "STYLE_CLOSE", "LBRACE", "RBRACE", 
			"COLON", "SEMI", "COMMA", "DOT", "HASH", "STAR", "LPAREN", "RPAREN", 
			"LBRACKET", "RBRACKET", "DOUBLE_COLON", "TILDE_EQUAL", "PIPE_EQUAL", 
			"CARET_EQUAL", "DOLLAR_EQUAL", "STAR_EQUAL", "DECIMAL", "NUMBER", "UNIT", 
			"COLOR_HEX", "STYLE_IDENT", "STYLE_STRING", "URL", "STYLE_WS", "STYLE_OTHER", 
			"JINJA_STMT_CLOSE", "JINJA_IF", "JINJA_ELSE", "JINJA_ELIF", "JINJA_ENDIF", 
			"JINJA_FOR", "JINJA_ENDFOR", "JINJA_BLOCK", "JINJA_ENDBLOCK", "JINJA_MACRO", 
			"JINJA_ENDMACRO", "JINJA_SET", "JINJA_INCLUDE", "JINJA_EXTENDS", "JINJA_IMPORT", 
			"JINJA_EQ", "JINJA_NE", "JINJA_GT", "JINJA_LT", "JINJA_GE", "JINJA_LE", 
			"JINJA_AND", "JINJA_OR", "JINJA_NOT", "JINJA_IN", "JINJA_IDENT", "JINJA_STRING", 
			"JINJA_NUMBER", "JINJA_OPERATOR", "JINJA_PUNCT", "JINJA_WS", "JINJA_BODY", 
			"JINJA_EXPR_CLOSE", "JINJA_EXPR_EQ", "JINJA_EXPR_NE", "JINJA_EXPR_GT", 
			"JINJA_EXPR_LT", "JINJA_EXPR_GE", "JINJA_EXPR_LE", "JINJA_EXPR_AND", 
			"JINJA_EXPR_OR", "JINJA_EXPR_NOT", "JINJA_EXPR_IN", "JINJA_EXPR_IDENT", 
			"JINJA_EXPR_NUMBER", "JINJA_EXPR_STRING", "JINJA_EXPR_OPERATOR", "JINJA_EXPR_PUNCT", 
			"JINJA_EXPR_WS", "JINJA_EXPR_BODY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TemplateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TemplateParser.EOF, 0); }
		public List<HtmlDocumentContext> htmlDocument() {
			return getRuleContexts(HtmlDocumentContext.class);
		}
		public HtmlDocumentContext htmlDocument(int i) {
			return getRuleContext(HtmlDocumentContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2034L) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(72);
					htmlDocument();
					}
					break;
				case 2:
					{
					setState(73);
					content();
					}
					break;
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOCTYPE) {
				{
				setState(81);
				doctype();
				}
			}

			setState(84);
			htmlElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			node();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public StyleBlockContext styleBlock() {
			return getRuleContext(StyleBlockContext.class,0);
		}
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public TextContentContext textContent() {
			return getRuleContext(TextContentContext.class,0);
		}
		public UnmatchedTagContext unmatchedTag() {
			return getRuleContext(UnmatchedTagContext.class,0);
		}
		public MalformedJinjaContext malformedJinja() {
			return getRuleContext(MalformedJinjaContext.class,0);
		}
		public TerminalNode JINJA_COMMENT() { return getToken(TemplateParser.JINJA_COMMENT, 0); }
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_node);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				htmlElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				selfClosingTag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				styleBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				jinjaBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				jinjaExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				textContent();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				unmatchedTag();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				malformedJinja();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(96);
				match(JINJA_COMMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContentContext extends ParserRuleContext {
		public TextContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textContent; }
	 
		public TextContentContext() { }
		public void copyFrom(TextContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhitespaceTextContext extends TextContentContext {
		public TerminalNode WS() { return getToken(TemplateParser.WS, 0); }
		public WhitespaceTextContext(TextContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterWhitespaceText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitWhitespaceText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitWhitespaceText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainTextContext extends TextContentContext {
		public TerminalNode TEXT() { return getToken(TemplateParser.TEXT, 0); }
		public PlainTextContext(TextContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterPlainText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitPlainText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitPlainText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContentContext textContent() throws RecognitionException {
		TextContentContext _localctx = new TextContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_textContent);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				_localctx = new PlainTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(TEXT);
				}
				break;
			case WS:
				_localctx = new WhitespaceTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeContext extends ParserRuleContext {
		public TerminalNode DOCTYPE() { return getToken(TemplateParser.DOCTYPE, 0); }
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDoctype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDoctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_doctype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(DOCTYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnclosedHtmlElementContext extends HtmlElementContext {
		public OpeningTagContext openingTag() {
			return getRuleContext(OpeningTagContext.class,0);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public List<TextContentContext> textContent() {
			return getRuleContexts(TextContentContext.class);
		}
		public TextContentContext textContent(int i) {
			return getRuleContext(TextContentContext.class,i);
		}
		public UnclosedHtmlElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterUnclosedHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitUnclosedHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitUnclosedHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PairedHtmlElementContext extends HtmlElementContext {
		public OpeningTagContext openingTag() {
			return getRuleContext(OpeningTagContext.class,0);
		}
		public ClosingTagContext closingTag() {
			return getRuleContext(ClosingTagContext.class,0);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public List<TextContentContext> textContent() {
			return getRuleContexts(TextContentContext.class);
		}
		public TextContentContext textContent(int i) {
			return getRuleContext(TextContentContext.class,i);
		}
		public PairedHtmlElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterPairedHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitPairedHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitPairedHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlElement);
		try {
			int _alt;
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PairedHtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				openingTag();
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(108);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(106);
							node();
							}
							break;
						case 2:
							{
							setState(107);
							textContent();
							}
							break;
						}
						} 
					}
					setState(112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(113);
				closingTag();
				}
				break;
			case 2:
				_localctx = new UnclosedHtmlElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				openingTag();
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(118);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(116);
							node();
							}
							break;
						case 2:
							{
							setState(117);
							textContent();
							}
							break;
						}
						} 
					}
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpeningTagContext extends ParserRuleContext {
		public Token tagName;
		public AttributeContext attrs;
		public TerminalNode TAG_OPEN() { return getToken(TemplateParser.TAG_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(TemplateParser.TAG_CLOSE, 0); }
		public TerminalNode TAG_NAME() { return getToken(TemplateParser.TAG_NAME, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public OpeningTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterOpeningTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitOpeningTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitOpeningTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpeningTagContext openingTag() throws RecognitionException {
		OpeningTagContext _localctx = new OpeningTagContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_openingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(TAG_OPEN);
			setState(126);
			((OpeningTagContext)_localctx).tagName = match(TAG_NAME);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(127);
				((OpeningTagContext)_localctx).attrs = attribute();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClosingTagContext extends ParserRuleContext {
		public Token tagName;
		public TerminalNode TAG_OPEN() { return getToken(TemplateParser.TAG_OPEN, 0); }
		public TerminalNode SLASH() { return getToken(TemplateParser.SLASH, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(TemplateParser.TAG_CLOSE, 0); }
		public TerminalNode TAG_NAME() { return getToken(TemplateParser.TAG_NAME, 0); }
		public ClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosingTagContext closingTag() throws RecognitionException {
		ClosingTagContext _localctx = new ClosingTagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_closingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(TAG_OPEN);
			setState(136);
			match(SLASH);
			setState(137);
			((ClosingTagContext)_localctx).tagName = match(TAG_NAME);
			setState(138);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
	 
		public SelfClosingTagContext() { }
		public void copyFrom(SelfClosingTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends SelfClosingTagContext {
		public Token tagName;
		public AttributeContext attrs;
		public TerminalNode TAG_OPEN() { return getToken(TemplateParser.TAG_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(TemplateParser.TAG_CLOSE, 0); }
		public TerminalNode TAG_NAME() { return getToken(TemplateParser.TAG_NAME, 0); }
		public TerminalNode SLASH() { return getToken(TemplateParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfClosingElementContext(SelfClosingTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selfClosingTag);
		int _la;
		try {
			_localctx = new SelfClosingElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(TAG_OPEN);
			setState(141);
			((SelfClosingElementContext)_localctx).tagName = match(TAG_NAME);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(142);
				((SelfClosingElementContext)_localctx).attrs = attribute();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(148);
				match(SLASH);
				}
			}

			setState(151);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends AttributeContext {
		public Token attrName;
		public AttributeValueContext attrValue;
		public TerminalNode TAG_NAME() { return getToken(TemplateParser.TAG_NAME, 0); }
		public TerminalNode EQUAL() { return getToken(TemplateParser.EQUAL, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public HtmlAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute);
		int _la;
		try {
			_localctx = new HtmlAttributeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((HtmlAttributeContext)_localctx).attrName = match(TAG_NAME);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(154);
				match(EQUAL);
				setState(155);
				((HtmlAttributeContext)_localctx).attrValue = attributeValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
	 
		public AttributeValueContext() { }
		public void copyFrom(AttributeValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedAttributeContext extends AttributeValueContext {
		public TerminalNode UNQUOTED_VALUE() { return getToken(TemplateParser.UNQUOTED_VALUE, 0); }
		public UnquotedAttributeContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterUnquotedAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitUnquotedAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitUnquotedAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleQuotedAttributeContext extends AttributeValueContext {
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(TemplateParser.DOUBLE_QUOTE_STRING, 0); }
		public DoubleQuotedAttributeContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDoubleQuotedAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDoubleQuotedAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDoubleQuotedAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleQuotedAttributeContext extends AttributeValueContext {
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(TemplateParser.SINGLE_QUOTE_STRING, 0); }
		public SingleQuotedAttributeContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterSingleQuotedAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitSingleQuotedAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitSingleQuotedAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributeValue);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTE_STRING:
				_localctx = new DoubleQuotedAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(DOUBLE_QUOTE_STRING);
				}
				break;
			case SINGLE_QUOTE_STRING:
				_localctx = new SingleQuotedAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(SINGLE_QUOTE_STRING);
				}
				break;
			case UNQUOTED_VALUE:
				_localctx = new UnquotedAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(UNQUOTED_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnmatchedTagContext extends ParserRuleContext {
		public UnmatchedTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unmatchedTag; }
	 
		public UnmatchedTagContext() { }
		public void copyFrom(UnmatchedTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnmatchedClosingTagContext extends UnmatchedTagContext {
		public Token tagName;
		public TerminalNode TAG_OPEN() { return getToken(TemplateParser.TAG_OPEN, 0); }
		public TerminalNode SLASH() { return getToken(TemplateParser.SLASH, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(TemplateParser.TAG_CLOSE, 0); }
		public TerminalNode TAG_NAME() { return getToken(TemplateParser.TAG_NAME, 0); }
		public UnmatchedClosingTagContext(UnmatchedTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterUnmatchedClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitUnmatchedClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitUnmatchedClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnmatchedTagContext unmatchedTag() throws RecognitionException {
		UnmatchedTagContext _localctx = new UnmatchedTagContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unmatchedTag);
		try {
			_localctx = new UnmatchedClosingTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(TAG_OPEN);
			setState(164);
			match(SLASH);
			setState(165);
			((UnmatchedClosingTagContext)_localctx).tagName = match(TAG_NAME);
			setState(166);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleBlockContext extends ParserRuleContext {
		public StyleRuleContext rules;
		public TerminalNode STYLE_OPEN() { return getToken(TemplateParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_CLOSE() { return getToken(TemplateParser.STYLE_CLOSE, 0); }
		public List<StyleRuleContext> styleRule() {
			return getRuleContexts(StyleRuleContext.class);
		}
		public StyleRuleContext styleRule(int i) {
			return getRuleContext(StyleRuleContext.class,i);
		}
		public StyleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterStyleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitStyleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitStyleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleBlockContext styleBlock() throws RecognitionException {
		StyleBlockContext _localctx = new StyleBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_styleBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(STYLE_OPEN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8807308591104L) != 0)) {
				{
				{
				setState(169);
				((StyleBlockContext)_localctx).rules = styleRule();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(STYLE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleRuleContext extends ParserRuleContext {
		public SelectorListContext selectors;
		public DeclarationListContext declarations;
		public TerminalNode LBRACE() { return getToken(TemplateParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateParser.RBRACE, 0); }
		public SelectorListContext selectorList() {
			return getRuleContext(SelectorListContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public StyleRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterStyleRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitStyleRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitStyleRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleRuleContext styleRule() throws RecognitionException {
		StyleRuleContext _localctx = new StyleRuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_styleRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((StyleRuleContext)_localctx).selectors = selectorList();
			setState(178);
			match(LBRACE);
			setState(179);
			((StyleRuleContext)_localctx).declarations = declarationList();
			setState(180);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorListContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TemplateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TemplateParser.COMMA, i);
		}
		public List<TerminalNode> STYLE_WS() { return getTokens(TemplateParser.STYLE_WS); }
		public TerminalNode STYLE_WS(int i) {
			return getToken(TemplateParser.STYLE_WS, i);
		}
		public SelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitSelectorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitSelectorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorListContext selectorList() throws RecognitionException {
		SelectorListContext _localctx = new SelectorListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			selector();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STYLE_WS) {
					{
					{
					setState(184);
					match(STYLE_WS);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				selector();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<SelectorPartContext> selectorPart() {
			return getRuleContexts(SelectorPartContext.class);
		}
		public SelectorPartContext selectorPart(int i) {
			return getRuleContext(SelectorPartContext.class,i);
		}
		public List<TerminalNode> STYLE_WS() { return getTokens(TemplateParser.STYLE_WS); }
		public TerminalNode STYLE_WS(int i) {
			return getToken(TemplateParser.STYLE_WS, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			selectorPart();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE_WS) {
				{
				{
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(197);
					match(STYLE_WS);
					}
					}
					setState(200); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STYLE_WS );
				setState(202);
				selectorPart();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorPartContext extends ParserRuleContext {
		public SelectorPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorPart; }
	 
		public SelectorPartContext() { }
		public void copyFrom(SelectorPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends SelectorPartContext {
		public TerminalNode STYLE_IDENT() { return getToken(TemplateParser.STYLE_IDENT, 0); }
		public TypeSelectorContext(SelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends SelectorPartContext {
		public TerminalNode HASH() { return getToken(TemplateParser.HASH, 0); }
		public TerminalNode STYLE_IDENT() { return getToken(TemplateParser.STYLE_IDENT, 0); }
		public IdSelectorContext(SelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeSelectorPartContext extends SelectorPartContext {
		public TerminalNode LBRACKET() { return getToken(TemplateParser.LBRACKET, 0); }
		public AttributeSelectorContext attributeSelector() {
			return getRuleContext(AttributeSelectorContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(TemplateParser.RBRACKET, 0); }
		public AttributeSelectorPartContext(SelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterAttributeSelectorPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitAttributeSelectorPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitAttributeSelectorPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends SelectorPartContext {
		public TerminalNode DOT() { return getToken(TemplateParser.DOT, 0); }
		public TerminalNode STYLE_IDENT() { return getToken(TemplateParser.STYLE_IDENT, 0); }
		public ClassSelectorContext(SelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassSelectorContext extends SelectorPartContext {
		public TerminalNode COLON() { return getToken(TemplateParser.COLON, 0); }
		public TerminalNode STYLE_IDENT() { return getToken(TemplateParser.STYLE_IDENT, 0); }
		public PseudoClassSelectorContext(SelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterPseudoClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitPseudoClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitPseudoClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassWithArgSelectorContext extends SelectorPartContext {
		public TerminalNode COLON() { return getToken(TemplateParser.COLON, 0); }
		public List<TerminalNode> STYLE_IDENT() { return getTokens(TemplateParser.STYLE_IDENT); }
		public TerminalNode STYLE_IDENT(int i) {
			return getToken(TemplateParser.STYLE_IDENT, i);
		}
		public TerminalNode LPAREN() { return getToken(TemplateParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TemplateParser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(TemplateParser.NUMBER, 0); }
		public PseudoClassWithArgSelectorContext(SelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterPseudoClassWithArgSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitPseudoClassWithArgSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitPseudoClassWithArgSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UniversalSelectorContext extends SelectorPartContext {
		public TerminalNode STAR() { return getToken(TemplateParser.STAR, 0); }
		public UniversalSelectorContext(SelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterUniversalSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitUniversalSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitUniversalSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PseudoElementSelectorContext extends SelectorPartContext {
		public TerminalNode DOUBLE_COLON() { return getToken(TemplateParser.DOUBLE_COLON, 0); }
		public TerminalNode STYLE_IDENT() { return getToken(TemplateParser.STYLE_IDENT, 0); }
		public PseudoElementSelectorContext(SelectorPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterPseudoElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitPseudoElementSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitPseudoElementSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorPartContext selectorPart() throws RecognitionException {
		SelectorPartContext _localctx = new SelectorPartContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectorPart);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new UniversalSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(STAR);
				}
				break;
			case 2:
				_localctx = new IdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(HASH);
				setState(210);
				match(STYLE_IDENT);
				}
				break;
			case 3:
				_localctx = new ClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(DOT);
				setState(212);
				match(STYLE_IDENT);
				}
				break;
			case 4:
				_localctx = new TypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(STYLE_IDENT);
				}
				break;
			case 5:
				_localctx = new PseudoClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(COLON);
				setState(215);
				match(STYLE_IDENT);
				}
				break;
			case 6:
				_localctx = new PseudoElementSelectorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(DOUBLE_COLON);
				setState(217);
				match(STYLE_IDENT);
				}
				break;
			case 7:
				_localctx = new AttributeSelectorPartContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				match(LBRACKET);
				setState(219);
				attributeSelector();
				setState(220);
				match(RBRACKET);
				}
				break;
			case 8:
				_localctx = new PseudoClassWithArgSelectorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				match(COLON);
				setState(223);
				match(STYLE_IDENT);
				setState(224);
				match(LPAREN);
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==STYLE_IDENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeSelectorContext extends ParserRuleContext {
		public AttributeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSelector; }
	 
		public AttributeSelectorContext() { }
		public void copyFrom(AttributeSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonAttributeSelectorContext extends AttributeSelectorContext {
		public Token op;
		public Token value;
		public TerminalNode STYLE_IDENT() { return getToken(TemplateParser.STYLE_IDENT, 0); }
		public TerminalNode STYLE_STRING() { return getToken(TemplateParser.STYLE_STRING, 0); }
		public TerminalNode EQUAL() { return getToken(TemplateParser.EQUAL, 0); }
		public TerminalNode TILDE_EQUAL() { return getToken(TemplateParser.TILDE_EQUAL, 0); }
		public TerminalNode PIPE_EQUAL() { return getToken(TemplateParser.PIPE_EQUAL, 0); }
		public TerminalNode CARET_EQUAL() { return getToken(TemplateParser.CARET_EQUAL, 0); }
		public TerminalNode DOLLAR_EQUAL() { return getToken(TemplateParser.DOLLAR_EQUAL, 0); }
		public TerminalNode STAR_EQUAL() { return getToken(TemplateParser.STAR_EQUAL, 0); }
		public ComparisonAttributeSelectorContext(AttributeSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterComparisonAttributeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitComparisonAttributeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitComparisonAttributeSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAttributeSelectorContext extends AttributeSelectorContext {
		public TerminalNode STYLE_IDENT() { return getToken(TemplateParser.STYLE_IDENT, 0); }
		public SimpleAttributeSelectorContext(AttributeSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterSimpleAttributeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitSimpleAttributeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitSimpleAttributeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSelectorContext attributeSelector() throws RecognitionException {
		AttributeSelectorContext _localctx = new AttributeSelectorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attributeSelector);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new SimpleAttributeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(STYLE_IDENT);
				}
				break;
			case 2:
				_localctx = new ComparisonAttributeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(STYLE_IDENT);
				setState(231);
				((ComparisonAttributeSelectorContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 532575961088L) != 0)) ) {
					((ComparisonAttributeSelectorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				((ComparisonAttributeSelectorContext)_localctx).value = match(STYLE_STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE_IDENT) {
				{
				{
				setState(235);
				declaration();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Token property;
		public DeclarationValueContext val;
		public TerminalNode COLON() { return getToken(TemplateParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(TemplateParser.SEMI, 0); }
		public TerminalNode STYLE_IDENT() { return getToken(TemplateParser.STYLE_IDENT, 0); }
		public DeclarationValueContext declarationValue() {
			return getRuleContext(DeclarationValueContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((DeclarationContext)_localctx).property = match(STYLE_IDENT);
			setState(242);
			match(COLON);
			setState(243);
			((DeclarationContext)_localctx).val = declarationValue();
			setState(244);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationValueContext extends ParserRuleContext {
		public StyleValuePartContext valPart;
		public List<StyleValuePartContext> styleValuePart() {
			return getRuleContexts(StyleValuePartContext.class);
		}
		public StyleValuePartContext styleValuePart(int i) {
			return getRuleContext(StyleValuePartContext.class,i);
		}
		public List<TerminalNode> STYLE_WS() { return getTokens(TemplateParser.STYLE_WS); }
		public TerminalNode STYLE_WS(int i) {
			return getToken(TemplateParser.STYLE_WS, i);
		}
		public DeclarationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDeclarationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDeclarationValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDeclarationValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationValueContext declarationValue() throws RecognitionException {
		DeclarationValueContext _localctx = new DeclarationValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declarationValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((DeclarationValueContext)_localctx).valPart = styleValuePart();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 278734762409984L) != 0)) {
				{
				{
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STYLE_WS) {
					{
					{
					setState(247);
					match(STYLE_WS);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				((DeclarationValueContext)_localctx).valPart = styleValuePart();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleValuePartContext extends ParserRuleContext {
		public StyleValuePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleValuePart; }
	 
		public StyleValuePartContext() { }
		public void copyFrom(StyleValuePartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringStyleValueContext extends StyleValuePartContext {
		public TerminalNode STYLE_STRING() { return getToken(TemplateParser.STYLE_STRING, 0); }
		public StringStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterStringStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitStringStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitStringStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColonStyleValueContext extends StyleValuePartContext {
		public TerminalNode COLON() { return getToken(TemplateParser.COLON, 0); }
		public ColonStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterColonStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitColonStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitColonStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaStyleValueContext extends StyleValuePartContext {
		public TerminalNode COMMA() { return getToken(TemplateParser.COMMA, 0); }
		public CommaStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterCommaStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitCommaStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitCommaStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RparenStyleValueContext extends StyleValuePartContext {
		public TerminalNode RPAREN() { return getToken(TemplateParser.RPAREN, 0); }
		public RparenStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterRparenStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitRparenStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitRparenStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorStyleValueContext extends StyleValuePartContext {
		public TerminalNode COLOR_HEX() { return getToken(TemplateParser.COLOR_HEX, 0); }
		public ColorStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterColorStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitColorStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitColorStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStyleValueContext extends StyleValuePartContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterFunctionStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitFunctionStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitFunctionStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RbracketStyleValueContext extends StyleValuePartContext {
		public TerminalNode RBRACKET() { return getToken(TemplateParser.RBRACKET, 0); }
		public RbracketStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterRbracketStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitRbracketStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitRbracketStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericStyleValueContext extends StyleValuePartContext {
		public NumericValueTypeContext numVal;
		public Token unit;
		public NumericValueTypeContext numericValueType() {
			return getRuleContext(NumericValueTypeContext.class,0);
		}
		public TerminalNode UNIT() { return getToken(TemplateParser.UNIT, 0); }
		public NumericStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterNumericStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitNumericStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitNumericStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlStyleValueContext extends StyleValuePartContext {
		public TerminalNode URL() { return getToken(TemplateParser.URL, 0); }
		public UrlStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterUrlStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitUrlStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitUrlStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LbracketStyleValueContext extends StyleValuePartContext {
		public TerminalNode LBRACKET() { return getToken(TemplateParser.LBRACKET, 0); }
		public LbracketStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterLbracketStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitLbracketStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitLbracketStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotStyleValueContext extends StyleValuePartContext {
		public TerminalNode DOT() { return getToken(TemplateParser.DOT, 0); }
		public DotStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDotStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDotStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDotStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierStyleValueContext extends StyleValuePartContext {
		public TerminalNode STYLE_IDENT() { return getToken(TemplateParser.STYLE_IDENT, 0); }
		public IdentifierStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterIdentifierStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitIdentifierStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitIdentifierStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HashStyleValueContext extends StyleValuePartContext {
		public TerminalNode HASH() { return getToken(TemplateParser.HASH, 0); }
		public HashStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterHashStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitHashStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitHashStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LparenStyleValueContext extends StyleValuePartContext {
		public TerminalNode LPAREN() { return getToken(TemplateParser.LPAREN, 0); }
		public LparenStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterLparenStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitLparenStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitLparenStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarStyleValueContext extends StyleValuePartContext {
		public TerminalNode STAR() { return getToken(TemplateParser.STAR, 0); }
		public StarStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterStarStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitStarStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitStarStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OtherStyleValueContext extends StyleValuePartContext {
		public TerminalNode STYLE_OTHER() { return getToken(TemplateParser.STYLE_OTHER, 0); }
		public OtherStyleValueContext(StyleValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterOtherStyleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitOtherStyleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitOtherStyleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleValuePartContext styleValuePart() throws RecognitionException {
		StyleValuePartContext _localctx = new StyleValuePartContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_styleValuePart);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new StringStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(STYLE_STRING);
				}
				break;
			case 2:
				_localctx = new NumericStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				((NumericStyleValueContext)_localctx).numVal = numericValueType();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(261);
					((NumericStyleValueContext)_localctx).unit = match(UNIT);
					}
				}

				}
				break;
			case 3:
				_localctx = new IdentifierStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(STYLE_IDENT);
				}
				break;
			case 4:
				_localctx = new ColorStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(COLOR_HEX);
				}
				break;
			case 5:
				_localctx = new FunctionStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				functionCall();
				}
				break;
			case 6:
				_localctx = new UrlStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				match(URL);
				}
				break;
			case 7:
				_localctx = new HashStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				match(HASH);
				}
				break;
			case 8:
				_localctx = new CommaStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				match(COMMA);
				}
				break;
			case 9:
				_localctx = new LparenStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(270);
				match(LPAREN);
				}
				break;
			case 10:
				_localctx = new RparenStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(271);
				match(RPAREN);
				}
				break;
			case 11:
				_localctx = new LbracketStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(272);
				match(LBRACKET);
				}
				break;
			case 12:
				_localctx = new RbracketStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(273);
				match(RBRACKET);
				}
				break;
			case 13:
				_localctx = new DotStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(274);
				match(DOT);
				}
				break;
			case 14:
				_localctx = new StarStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(275);
				match(STAR);
				}
				break;
			case 15:
				_localctx = new ColonStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(276);
				match(COLON);
				}
				break;
			case 16:
				_localctx = new OtherStyleValueContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(277);
				match(STYLE_OTHER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericValueTypeContext extends ParserRuleContext {
		public NumericValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericValueType; }
	 
		public NumericValueTypeContext() { }
		public void copyFrom(NumericValueTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalNumTypeContext extends NumericValueTypeContext {
		public TerminalNode DECIMAL() { return getToken(TemplateParser.DECIMAL, 0); }
		public DecimalNumTypeContext(NumericValueTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDecimalNumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDecimalNumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDecimalNumType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerNumTypeContext extends NumericValueTypeContext {
		public TerminalNode NUMBER() { return getToken(TemplateParser.NUMBER, 0); }
		public IntegerNumTypeContext(NumericValueTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterIntegerNumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitIntegerNumType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitIntegerNumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericValueTypeContext numericValueType() throws RecognitionException {
		NumericValueTypeContext _localctx = new NumericValueTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numericValueType);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new IntegerNumTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(NUMBER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalNumTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public Token funcName;
		public ValueListContext args;
		public TerminalNode LPAREN() { return getToken(TemplateParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TemplateParser.RPAREN, 0); }
		public TerminalNode STYLE_IDENT() { return getToken(TemplateParser.STYLE_IDENT, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((FunctionCallContext)_localctx).funcName = match(STYLE_IDENT);
			setState(285);
			match(LPAREN);
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(286);
				((FunctionCallContext)_localctx).args = valueList();
				}
				break;
			}
			setState(289);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ParserRuleContext {
		public List<StyleValuePartContext> styleValuePart() {
			return getRuleContexts(StyleValuePartContext.class);
		}
		public StyleValuePartContext styleValuePart(int i) {
			return getRuleContext(StyleValuePartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TemplateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TemplateParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			styleValuePart();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(292);
				match(COMMA);
				setState(293);
				styleValuePart();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprContext extends ParserRuleContext {
		public JinjaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpr; }
	 
		public JinjaExprContext() { }
		public void copyFrom(JinjaExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionContext extends JinjaExprContext {
		public JinjaExpressionBodyContext body;
		public TerminalNode JINJA_EXPR_OPEN() { return getToken(TemplateParser.JINJA_EXPR_OPEN, 0); }
		public TerminalNode JINJA_EXPR_CLOSE() { return getToken(TemplateParser.JINJA_EXPR_CLOSE, 0); }
		public JinjaExpressionBodyContext jinjaExpressionBody() {
			return getRuleContext(JinjaExpressionBodyContext.class,0);
		}
		public JinjaExpressionContext(JinjaExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprContext jinjaExpr() throws RecognitionException {
		JinjaExprContext _localctx = new JinjaExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jinjaExpr);
		try {
			_localctx = new JinjaExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(JINJA_EXPR_OPEN);
			setState(300);
			((JinjaExpressionContext)_localctx).body = jinjaExpressionBody();
			setState(301);
			match(JINJA_EXPR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionBodyContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_EXPR_IDENT() { return getTokens(TemplateParser.JINJA_EXPR_IDENT); }
		public TerminalNode JINJA_EXPR_IDENT(int i) {
			return getToken(TemplateParser.JINJA_EXPR_IDENT, i);
		}
		public List<TerminalNode> JINJA_EXPR_NUMBER() { return getTokens(TemplateParser.JINJA_EXPR_NUMBER); }
		public TerminalNode JINJA_EXPR_NUMBER(int i) {
			return getToken(TemplateParser.JINJA_EXPR_NUMBER, i);
		}
		public List<TerminalNode> JINJA_EXPR_STRING() { return getTokens(TemplateParser.JINJA_EXPR_STRING); }
		public TerminalNode JINJA_EXPR_STRING(int i) {
			return getToken(TemplateParser.JINJA_EXPR_STRING, i);
		}
		public List<TerminalNode> JINJA_EXPR_OPERATOR() { return getTokens(TemplateParser.JINJA_EXPR_OPERATOR); }
		public TerminalNode JINJA_EXPR_OPERATOR(int i) {
			return getToken(TemplateParser.JINJA_EXPR_OPERATOR, i);
		}
		public List<TerminalNode> JINJA_EXPR_PUNCT() { return getTokens(TemplateParser.JINJA_EXPR_PUNCT); }
		public TerminalNode JINJA_EXPR_PUNCT(int i) {
			return getToken(TemplateParser.JINJA_EXPR_PUNCT, i);
		}
		public List<TerminalNode> JINJA_EXPR_WS() { return getTokens(TemplateParser.JINJA_EXPR_WS); }
		public TerminalNode JINJA_EXPR_WS(int i) {
			return getToken(TemplateParser.JINJA_EXPR_WS, i);
		}
		public List<TerminalNode> JINJA_EXPR_EQ() { return getTokens(TemplateParser.JINJA_EXPR_EQ); }
		public TerminalNode JINJA_EXPR_EQ(int i) {
			return getToken(TemplateParser.JINJA_EXPR_EQ, i);
		}
		public List<TerminalNode> JINJA_EXPR_NE() { return getTokens(TemplateParser.JINJA_EXPR_NE); }
		public TerminalNode JINJA_EXPR_NE(int i) {
			return getToken(TemplateParser.JINJA_EXPR_NE, i);
		}
		public List<TerminalNode> JINJA_EXPR_GT() { return getTokens(TemplateParser.JINJA_EXPR_GT); }
		public TerminalNode JINJA_EXPR_GT(int i) {
			return getToken(TemplateParser.JINJA_EXPR_GT, i);
		}
		public List<TerminalNode> JINJA_EXPR_LT() { return getTokens(TemplateParser.JINJA_EXPR_LT); }
		public TerminalNode JINJA_EXPR_LT(int i) {
			return getToken(TemplateParser.JINJA_EXPR_LT, i);
		}
		public List<TerminalNode> JINJA_EXPR_GE() { return getTokens(TemplateParser.JINJA_EXPR_GE); }
		public TerminalNode JINJA_EXPR_GE(int i) {
			return getToken(TemplateParser.JINJA_EXPR_GE, i);
		}
		public List<TerminalNode> JINJA_EXPR_LE() { return getTokens(TemplateParser.JINJA_EXPR_LE); }
		public TerminalNode JINJA_EXPR_LE(int i) {
			return getToken(TemplateParser.JINJA_EXPR_LE, i);
		}
		public List<TerminalNode> JINJA_EXPR_AND() { return getTokens(TemplateParser.JINJA_EXPR_AND); }
		public TerminalNode JINJA_EXPR_AND(int i) {
			return getToken(TemplateParser.JINJA_EXPR_AND, i);
		}
		public List<TerminalNode> JINJA_EXPR_OR() { return getTokens(TemplateParser.JINJA_EXPR_OR); }
		public TerminalNode JINJA_EXPR_OR(int i) {
			return getToken(TemplateParser.JINJA_EXPR_OR, i);
		}
		public List<TerminalNode> JINJA_EXPR_NOT() { return getTokens(TemplateParser.JINJA_EXPR_NOT); }
		public TerminalNode JINJA_EXPR_NOT(int i) {
			return getToken(TemplateParser.JINJA_EXPR_NOT, i);
		}
		public List<TerminalNode> JINJA_EXPR_IN() { return getTokens(TemplateParser.JINJA_EXPR_IN); }
		public TerminalNode JINJA_EXPR_IN(int i) {
			return getToken(TemplateParser.JINJA_EXPR_IN, i);
		}
		public JinjaExpressionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpressionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaExpressionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaExpressionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaExpressionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionBodyContext jinjaExpressionBody() throws RecognitionException {
		JinjaExpressionBodyContext _localctx = new JinjaExpressionBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jinjaExpressionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 65535L) != 0)) {
				{
				{
				setState(303);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 65535L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockContext extends ParserRuleContext {
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
	 
		public JinjaBlockContext() { }
		public void copyFrom(JinjaBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerJinjaBlockContext extends JinjaBlockContext {
		public JinjaContainerContext jinjaContainer() {
			return getRuleContext(JinjaContainerContext.class,0);
		}
		public ContainerJinjaBlockContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterContainerJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitContainerJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitContainerJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleJinjaBlockContext extends JinjaBlockContext {
		public JinjaSimpleContext jinjaSimple() {
			return getRuleContext(JinjaSimpleContext.class,0);
		}
		public SimpleJinjaBlockContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterSimpleJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitSimpleJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitSimpleJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_jinjaBlock);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new SimpleJinjaBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				jinjaSimple();
				}
				break;
			case 2:
				_localctx = new ContainerJinjaBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				jinjaContainer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSimpleContext extends ParserRuleContext {
		public JinjaSimpleBodyContext body;
		public TerminalNode JINJA_STMT_OPEN() { return getToken(TemplateParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(TemplateParser.JINJA_STMT_CLOSE, 0); }
		public JinjaSimpleBodyContext jinjaSimpleBody() {
			return getRuleContext(JinjaSimpleBodyContext.class,0);
		}
		public JinjaSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaSimpleContext jinjaSimple() throws RecognitionException {
		JinjaSimpleContext _localctx = new JinjaSimpleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jinjaSimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(JINJA_STMT_OPEN);
			setState(314);
			((JinjaSimpleContext)_localctx).body = jinjaSimpleBody();
			setState(315);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSimpleBodyContext extends ParserRuleContext {
		public List<JinjaKeywordContext> jinjaKeyword() {
			return getRuleContexts(JinjaKeywordContext.class);
		}
		public JinjaKeywordContext jinjaKeyword(int i) {
			return getRuleContext(JinjaKeywordContext.class,i);
		}
		public List<TerminalNode> JINJA_IDENT() { return getTokens(TemplateParser.JINJA_IDENT); }
		public TerminalNode JINJA_IDENT(int i) {
			return getToken(TemplateParser.JINJA_IDENT, i);
		}
		public List<TerminalNode> JINJA_STRING() { return getTokens(TemplateParser.JINJA_STRING); }
		public TerminalNode JINJA_STRING(int i) {
			return getToken(TemplateParser.JINJA_STRING, i);
		}
		public List<TerminalNode> JINJA_NUMBER() { return getTokens(TemplateParser.JINJA_NUMBER); }
		public TerminalNode JINJA_NUMBER(int i) {
			return getToken(TemplateParser.JINJA_NUMBER, i);
		}
		public List<TerminalNode> JINJA_OPERATOR() { return getTokens(TemplateParser.JINJA_OPERATOR); }
		public TerminalNode JINJA_OPERATOR(int i) {
			return getToken(TemplateParser.JINJA_OPERATOR, i);
		}
		public List<TerminalNode> JINJA_PUNCT() { return getTokens(TemplateParser.JINJA_PUNCT); }
		public TerminalNode JINJA_PUNCT(int i) {
			return getToken(TemplateParser.JINJA_PUNCT, i);
		}
		public List<TerminalNode> JINJA_WS() { return getTokens(TemplateParser.JINJA_WS); }
		public TerminalNode JINJA_WS(int i) {
			return getToken(TemplateParser.JINJA_WS, i);
		}
		public List<TerminalNode> JINJA_EQ() { return getTokens(TemplateParser.JINJA_EQ); }
		public TerminalNode JINJA_EQ(int i) {
			return getToken(TemplateParser.JINJA_EQ, i);
		}
		public List<TerminalNode> JINJA_NE() { return getTokens(TemplateParser.JINJA_NE); }
		public TerminalNode JINJA_NE(int i) {
			return getToken(TemplateParser.JINJA_NE, i);
		}
		public List<TerminalNode> JINJA_GT() { return getTokens(TemplateParser.JINJA_GT); }
		public TerminalNode JINJA_GT(int i) {
			return getToken(TemplateParser.JINJA_GT, i);
		}
		public List<TerminalNode> JINJA_LT() { return getTokens(TemplateParser.JINJA_LT); }
		public TerminalNode JINJA_LT(int i) {
			return getToken(TemplateParser.JINJA_LT, i);
		}
		public List<TerminalNode> JINJA_GE() { return getTokens(TemplateParser.JINJA_GE); }
		public TerminalNode JINJA_GE(int i) {
			return getToken(TemplateParser.JINJA_GE, i);
		}
		public List<TerminalNode> JINJA_LE() { return getTokens(TemplateParser.JINJA_LE); }
		public TerminalNode JINJA_LE(int i) {
			return getToken(TemplateParser.JINJA_LE, i);
		}
		public List<TerminalNode> JINJA_AND() { return getTokens(TemplateParser.JINJA_AND); }
		public TerminalNode JINJA_AND(int i) {
			return getToken(TemplateParser.JINJA_AND, i);
		}
		public List<TerminalNode> JINJA_OR() { return getTokens(TemplateParser.JINJA_OR); }
		public TerminalNode JINJA_OR(int i) {
			return getToken(TemplateParser.JINJA_OR, i);
		}
		public List<TerminalNode> JINJA_NOT() { return getTokens(TemplateParser.JINJA_NOT); }
		public TerminalNode JINJA_NOT(int i) {
			return getToken(TemplateParser.JINJA_NOT, i);
		}
		public List<TerminalNode> JINJA_IN() { return getTokens(TemplateParser.JINJA_IN); }
		public TerminalNode JINJA_IN(int i) {
			return getToken(TemplateParser.JINJA_IN, i);
		}
		public JinjaSimpleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaSimpleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaSimpleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaSimpleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaSimpleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaSimpleBodyContext jinjaSimpleBody() throws RecognitionException {
		JinjaSimpleBodyContext _localctx = new JinjaSimpleBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_jinjaSimpleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(317);
					jinjaKeyword();
					}
					break;
				case 2:
					{
					setState(318);
					match(JINJA_IDENT);
					}
					break;
				case 3:
					{
					setState(319);
					match(JINJA_STRING);
					}
					break;
				case 4:
					{
					setState(320);
					match(JINJA_NUMBER);
					}
					break;
				case 5:
					{
					setState(321);
					match(JINJA_OPERATOR);
					}
					break;
				case 6:
					{
					setState(322);
					match(JINJA_PUNCT);
					}
					break;
				case 7:
					{
					setState(323);
					match(JINJA_WS);
					}
					break;
				case 8:
					{
					setState(324);
					match(JINJA_EQ);
					}
					break;
				case 9:
					{
					setState(325);
					match(JINJA_NE);
					}
					break;
				case 10:
					{
					setState(326);
					match(JINJA_GT);
					}
					break;
				case 11:
					{
					setState(327);
					match(JINJA_LT);
					}
					break;
				case 12:
					{
					setState(328);
					match(JINJA_GE);
					}
					break;
				case 13:
					{
					setState(329);
					match(JINJA_LE);
					}
					break;
				case 14:
					{
					setState(330);
					match(JINJA_AND);
					}
					break;
				case 15:
					{
					setState(331);
					match(JINJA_OR);
					}
					break;
				case 16:
					{
					setState(332);
					match(JINJA_NOT);
					}
					break;
				case 17:
					{
					setState(333);
					match(JINJA_IN);
					}
					break;
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 1073741823L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaContainerContext extends ParserRuleContext {
		public JinjaContainerStartContext start;
		public NodeContext body;
		public JinjaContainerEndContext end;
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(TemplateParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(TemplateParser.JINJA_STMT_OPEN, i);
		}
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(TemplateParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(TemplateParser.JINJA_STMT_CLOSE, i);
		}
		public JinjaContainerStartContext jinjaContainerStart() {
			return getRuleContext(JinjaContainerStartContext.class,0);
		}
		public JinjaContainerEndContext jinjaContainerEnd() {
			return getRuleContext(JinjaContainerEndContext.class,0);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public JinjaContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaContainer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaContainerContext jinjaContainer() throws RecognitionException {
		JinjaContainerContext _localctx = new JinjaContainerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_jinjaContainer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(JINJA_STMT_OPEN);
			setState(339);
			((JinjaContainerContext)_localctx).start = jinjaContainerStart();
			setState(340);
			match(JINJA_STMT_CLOSE);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					((JinjaContainerContext)_localctx).body = node();
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(347);
			match(JINJA_STMT_OPEN);
			setState(348);
			((JinjaContainerContext)_localctx).end = jinjaContainerEnd();
			setState(349);
			match(JINJA_STMT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaContainerStartContext extends ParserRuleContext {
		public JinjaContainerStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaContainerStart; }
	 
		public JinjaContainerStartContext() { }
		public void copyFrom(JinjaContainerStartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MacroStatementStartContext extends JinjaContainerStartContext {
		public Token name;
		public TerminalNode JINJA_MACRO() { return getToken(TemplateParser.JINJA_MACRO, 0); }
		public TerminalNode JINJA_IDENT() { return getToken(TemplateParser.JINJA_IDENT, 0); }
		public MacroStatementStartContext(JinjaContainerStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterMacroStatementStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitMacroStatementStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitMacroStatementStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementStartContext extends JinjaContainerStartContext {
		public JinjaExpressionBodyContext expression;
		public TerminalNode JINJA_IF() { return getToken(TemplateParser.JINJA_IF, 0); }
		public JinjaExpressionBodyContext jinjaExpressionBody() {
			return getRuleContext(JinjaExpressionBodyContext.class,0);
		}
		public IfStatementStartContext(JinjaContainerStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterIfStatementStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitIfStatementStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitIfStatementStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementStartContext extends JinjaContainerStartContext {
		public JinjaExpressionBodyContext expression;
		public TerminalNode JINJA_FOR() { return getToken(TemplateParser.JINJA_FOR, 0); }
		public JinjaExpressionBodyContext jinjaExpressionBody() {
			return getRuleContext(JinjaExpressionBodyContext.class,0);
		}
		public ForStatementStartContext(JinjaContainerStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterForStatementStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitForStatementStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitForStatementStart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementStartContext extends JinjaContainerStartContext {
		public Token name;
		public TerminalNode JINJA_BLOCK() { return getToken(TemplateParser.JINJA_BLOCK, 0); }
		public TerminalNode JINJA_IDENT() { return getToken(TemplateParser.JINJA_IDENT, 0); }
		public BlockStatementStartContext(JinjaContainerStartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterBlockStatementStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitBlockStatementStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitBlockStatementStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaContainerStartContext jinjaContainerStart() throws RecognitionException {
		JinjaContainerStartContext _localctx = new JinjaContainerStartContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_jinjaContainerStart);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_IF:
				_localctx = new IfStatementStartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(JINJA_IF);
				setState(352);
				((IfStatementStartContext)_localctx).expression = jinjaExpressionBody();
				}
				break;
			case JINJA_FOR:
				_localctx = new ForStatementStartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(JINJA_FOR);
				setState(354);
				((ForStatementStartContext)_localctx).expression = jinjaExpressionBody();
				}
				break;
			case JINJA_BLOCK:
				_localctx = new BlockStatementStartContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(JINJA_BLOCK);
				setState(356);
				((BlockStatementStartContext)_localctx).name = match(JINJA_IDENT);
				}
				break;
			case JINJA_MACRO:
				_localctx = new MacroStatementStartContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(JINJA_MACRO);
				setState(358);
				((MacroStatementStartContext)_localctx).name = match(JINJA_IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaContainerEndContext extends ParserRuleContext {
		public JinjaContainerEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaContainerEnd; }
	 
		public JinjaContainerEndContext() { }
		public void copyFrom(JinjaContainerEndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MacroStatementEndContext extends JinjaContainerEndContext {
		public TerminalNode JINJA_ENDMACRO() { return getToken(TemplateParser.JINJA_ENDMACRO, 0); }
		public MacroStatementEndContext(JinjaContainerEndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterMacroStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitMacroStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitMacroStatementEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementEndContext extends JinjaContainerEndContext {
		public TerminalNode JINJA_ENDIF() { return getToken(TemplateParser.JINJA_ENDIF, 0); }
		public IfStatementEndContext(JinjaContainerEndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterIfStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitIfStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitIfStatementEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementEndContext extends JinjaContainerEndContext {
		public TerminalNode JINJA_ENDBLOCK() { return getToken(TemplateParser.JINJA_ENDBLOCK, 0); }
		public BlockStatementEndContext(JinjaContainerEndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterBlockStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitBlockStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitBlockStatementEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementEndContext extends JinjaContainerEndContext {
		public TerminalNode JINJA_ENDFOR() { return getToken(TemplateParser.JINJA_ENDFOR, 0); }
		public ForStatementEndContext(JinjaContainerEndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterForStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitForStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitForStatementEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaContainerEndContext jinjaContainerEnd() throws RecognitionException {
		JinjaContainerEndContext _localctx = new JinjaContainerEndContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_jinjaContainerEnd);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_ENDIF:
				_localctx = new IfStatementEndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(JINJA_ENDIF);
				}
				break;
			case JINJA_ENDFOR:
				_localctx = new ForStatementEndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(JINJA_ENDFOR);
				}
				break;
			case JINJA_ENDBLOCK:
				_localctx = new BlockStatementEndContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(JINJA_ENDBLOCK);
				}
				break;
			case JINJA_ENDMACRO:
				_localctx = new MacroStatementEndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(JINJA_ENDMACRO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaKeywordContext extends ParserRuleContext {
		public TerminalNode JINJA_IF() { return getToken(TemplateParser.JINJA_IF, 0); }
		public TerminalNode JINJA_ELSE() { return getToken(TemplateParser.JINJA_ELSE, 0); }
		public TerminalNode JINJA_ELIF() { return getToken(TemplateParser.JINJA_ELIF, 0); }
		public TerminalNode JINJA_ENDIF() { return getToken(TemplateParser.JINJA_ENDIF, 0); }
		public TerminalNode JINJA_FOR() { return getToken(TemplateParser.JINJA_FOR, 0); }
		public TerminalNode JINJA_ENDFOR() { return getToken(TemplateParser.JINJA_ENDFOR, 0); }
		public TerminalNode JINJA_BLOCK() { return getToken(TemplateParser.JINJA_BLOCK, 0); }
		public TerminalNode JINJA_ENDBLOCK() { return getToken(TemplateParser.JINJA_ENDBLOCK, 0); }
		public TerminalNode JINJA_MACRO() { return getToken(TemplateParser.JINJA_MACRO, 0); }
		public TerminalNode JINJA_ENDMACRO() { return getToken(TemplateParser.JINJA_ENDMACRO, 0); }
		public TerminalNode JINJA_SET() { return getToken(TemplateParser.JINJA_SET, 0); }
		public TerminalNode JINJA_INCLUDE() { return getToken(TemplateParser.JINJA_INCLUDE, 0); }
		public TerminalNode JINJA_EXTENDS() { return getToken(TemplateParser.JINJA_EXTENDS, 0); }
		public TerminalNode JINJA_IMPORT() { return getToken(TemplateParser.JINJA_IMPORT, 0); }
		public TerminalNode JINJA_EQ() { return getToken(TemplateParser.JINJA_EQ, 0); }
		public TerminalNode JINJA_NE() { return getToken(TemplateParser.JINJA_NE, 0); }
		public TerminalNode JINJA_GT() { return getToken(TemplateParser.JINJA_GT, 0); }
		public TerminalNode JINJA_LT() { return getToken(TemplateParser.JINJA_LT, 0); }
		public TerminalNode JINJA_GE() { return getToken(TemplateParser.JINJA_GE, 0); }
		public TerminalNode JINJA_LE() { return getToken(TemplateParser.JINJA_LE, 0); }
		public TerminalNode JINJA_AND() { return getToken(TemplateParser.JINJA_AND, 0); }
		public TerminalNode JINJA_OR() { return getToken(TemplateParser.JINJA_OR, 0); }
		public TerminalNode JINJA_NOT() { return getToken(TemplateParser.JINJA_NOT, 0); }
		public TerminalNode JINJA_IN() { return getToken(TemplateParser.JINJA_IN, 0); }
		public JinjaKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterJinjaKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitJinjaKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitJinjaKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaKeywordContext jinjaKeyword() throws RecognitionException {
		JinjaKeywordContext _localctx = new JinjaKeywordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_jinjaKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 16777215L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MalformedJinjaContext extends ParserRuleContext {
		public MalformedJinjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_malformedJinja; }
	 
		public MalformedJinjaContext() { }
		public void copyFrom(MalformedJinjaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MalformedJinjaStatementContext extends MalformedJinjaContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(TemplateParser.JINJA_STMT_OPEN, 0); }
		public MalformedJinjaStatementContext(MalformedJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterMalformedJinjaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitMalformedJinjaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitMalformedJinjaStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MalformedJinjaExpressionContext extends MalformedJinjaContext {
		public TerminalNode JINJA_EXPR_OPEN() { return getToken(TemplateParser.JINJA_EXPR_OPEN, 0); }
		public MalformedJinjaExpressionContext(MalformedJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterMalformedJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitMalformedJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitMalformedJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MalformedJinjaContext malformedJinja() throws RecognitionException {
		MalformedJinjaContext _localctx = new MalformedJinjaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_malformedJinja);
		try {
			int _alt;
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_STMT_OPEN:
				_localctx = new MalformedJinjaStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(JINJA_STMT_OPEN);
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(370);
						matchWildcard();
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				break;
			case JINJA_EXPR_OPEN:
				_localctx = new MalformedJinjaExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(JINJA_EXPR_OPEN);
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(377);
						matchWildcard();
						}
						} 
					}
					setState(382);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001a\u0182\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0005\u0000K\b\u0000\n\u0000\f\u0000"+
		"N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001S\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003b\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004f\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"m\b\u0006\n\u0006\f\u0006p\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006w\b\u0006\n\u0006\f\u0006z\t\u0006"+
		"\u0003\u0006|\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0081\b\u0007\n\u0007\f\u0007\u0084\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0090"+
		"\b\t\n\t\f\t\u0093\t\t\u0001\t\u0003\t\u0096\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u009d\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00a2\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0005\r\u00ab\b\r\n\r\f\r\u00ae\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00ba\b\u000f\n\u000f\f\u000f\u00bd\t\u000f\u0001"+
		"\u000f\u0005\u000f\u00c0\b\u000f\n\u000f\f\u000f\u00c3\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u00c7\b\u0010\u000b\u0010\f\u0010\u00c8\u0001"+
		"\u0010\u0005\u0010\u00cc\b\u0010\n\u0010\f\u0010\u00cf\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00e4\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00ea\b\u0012\u0001\u0013\u0005\u0013\u00ed\b\u0013\n\u0013"+
		"\f\u0013\u00f0\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u00f9\b\u0015\n\u0015"+
		"\f\u0015\u00fc\t\u0015\u0001\u0015\u0005\u0015\u00ff\b\u0015\n\u0015\f"+
		"\u0015\u0102\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0107"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0117\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u011b\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0120\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0127\b\u0019\n\u0019\f\u0019\u012a\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0005\u001b\u0131\b\u001b"+
		"\n\u001b\f\u001b\u0134\t\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0138"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u014f\b\u001e\u000b"+
		"\u001e\f\u001e\u0150\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u0157\b\u001f\n\u001f\f\u001f\u015a\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0168\b \u0001!\u0001!\u0001!\u0001!\u0003!\u016e\b!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0005#\u0174\b#\n#\f#\u0177\t#\u0001#\u0001#"+
		"\u0005#\u017b\b#\n#\f#\u017e\t#\u0003#\u0180\b#\u0001#\u0002\u0175\u017c"+
		"\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0004\u0002\u0000((++\u0002"+
		"\u0000\u000e\u000e\"&\u0001\u0000Q`\u0001\u00001H\u01b4\u0000L\u0001\u0000"+
		"\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000\u0000"+
		"\u0006a\u0001\u0000\u0000\u0000\be\u0001\u0000\u0000\u0000\ng\u0001\u0000"+
		"\u0000\u0000\f{\u0001\u0000\u0000\u0000\u000e}\u0001\u0000\u0000\u0000"+
		"\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000\u0000"+
		"\u0014\u0099\u0001\u0000\u0000\u0000\u0016\u00a1\u0001\u0000\u0000\u0000"+
		"\u0018\u00a3\u0001\u0000\u0000\u0000\u001a\u00a8\u0001\u0000\u0000\u0000"+
		"\u001c\u00b1\u0001\u0000\u0000\u0000\u001e\u00b6\u0001\u0000\u0000\u0000"+
		" \u00c4\u0001\u0000\u0000\u0000\"\u00e3\u0001\u0000\u0000\u0000$\u00e9"+
		"\u0001\u0000\u0000\u0000&\u00ee\u0001\u0000\u0000\u0000(\u00f1\u0001\u0000"+
		"\u0000\u0000*\u00f6\u0001\u0000\u0000\u0000,\u0116\u0001\u0000\u0000\u0000"+
		".\u011a\u0001\u0000\u0000\u00000\u011c\u0001\u0000\u0000\u00002\u0123"+
		"\u0001\u0000\u0000\u00004\u012b\u0001\u0000\u0000\u00006\u0132\u0001\u0000"+
		"\u0000\u00008\u0137\u0001\u0000\u0000\u0000:\u0139\u0001\u0000\u0000\u0000"+
		"<\u014e\u0001\u0000\u0000\u0000>\u0152\u0001\u0000\u0000\u0000@\u0167"+
		"\u0001\u0000\u0000\u0000B\u016d\u0001\u0000\u0000\u0000D\u016f\u0001\u0000"+
		"\u0000\u0000F\u017f\u0001\u0000\u0000\u0000HK\u0003\u0002\u0001\u0000"+
		"IK\u0003\u0004\u0002\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005"+
		"\u0000\u0000\u0001P\u0001\u0001\u0000\u0000\u0000QS\u0003\n\u0005\u0000"+
		"RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0003\f\u0006\u0000U\u0003\u0001\u0000\u0000\u0000VW\u0003\u0006"+
		"\u0003\u0000W\u0005\u0001\u0000\u0000\u0000Xb\u0003\f\u0006\u0000Yb\u0003"+
		"\u0012\t\u0000Zb\u0003\u001a\r\u0000[b\u00038\u001c\u0000\\b\u00034\u001a"+
		"\u0000]b\u0003\b\u0004\u0000^b\u0003\u0018\f\u0000_b\u0003F#\u0000`b\u0005"+
		"\u0006\u0000\u0000aX\u0001\u0000\u0000\u0000aY\u0001\u0000\u0000\u0000"+
		"aZ\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000a\\\u0001\u0000\u0000"+
		"\u0000a]\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000b\u0007\u0001\u0000\u0000\u0000"+
		"cf\u0005\t\u0000\u0000df\u0005\n\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000f\t\u0001\u0000\u0000\u0000gh\u0005\u0001\u0000"+
		"\u0000h\u000b\u0001\u0000\u0000\u0000in\u0003\u000e\u0007\u0000jm\u0003"+
		"\u0006\u0003\u0000km\u0003\b\u0004\u0000lj\u0001\u0000\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000qr\u0003\u0010\b\u0000r|\u0001\u0000\u0000\u0000sx\u0003\u000e\u0007"+
		"\u0000tw\u0003\u0006\u0003\u0000uw\u0003\b\u0004\u0000vt\u0001\u0000\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{i\u0001\u0000\u0000\u0000{s\u0001\u0000\u0000\u0000"+
		"|\r\u0001\u0000\u0000\u0000}~\u0005\b\u0000\u0000~\u0082\u0005\f\u0000"+
		"\u0000\u007f\u0081\u0003\u0014\n\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0012\u0000\u0000"+
		"\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u0088\u0005\b\u0000\u0000\u0088"+
		"\u0089\u0005\r\u0000\u0000\u0089\u008a\u0005\f\u0000\u0000\u008a\u008b"+
		"\u0005\u0012\u0000\u0000\u008b\u0011\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\b\u0000\u0000\u008d\u0091\u0005\f\u0000\u0000\u008e\u0090\u0003"+
		"\u0014\n\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u0005\r\u0000\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\u0012\u0000\u0000\u0098\u0013\u0001\u0000\u0000"+
		"\u0000\u0099\u009c\u0005\f\u0000\u0000\u009a\u009b\u0005\u000e\u0000\u0000"+
		"\u009b\u009d\u0003\u0016\u000b\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u0015\u0001\u0000\u0000\u0000"+
		"\u009e\u00a2\u0005\u000f\u0000\u0000\u009f\u00a2\u0005\u0010\u0000\u0000"+
		"\u00a0\u00a2\u0005\u0011\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\b\u0000\u0000\u00a4"+
		"\u00a5\u0005\r\u0000\u0000\u00a5\u00a6\u0005\f\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0012\u0000\u0000\u00a7\u0019\u0001\u0000\u0000\u0000\u00a8\u00ac"+
		"\u0005\u0007\u0000\u0000\u00a9\u00ab\u0003\u001c\u000e\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u0014\u0000\u0000\u00b0\u001b\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0003\u001e\u000f\u0000\u00b2\u00b3\u0005\u0015\u0000\u0000\u00b3\u00b4"+
		"\u0003&\u0013\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u001d\u0001"+
		"\u0000\u0000\u0000\u00b6\u00c1\u0003 \u0010\u0000\u00b7\u00bb\u0005\u0019"+
		"\u0000\u0000\u00b8\u00ba\u0005.\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c0\u0003 \u0010\u0000"+
		"\u00bf\u00b7\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u001f\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00cd\u0003\"\u0011\u0000\u00c5\u00c7\u0005.\u0000\u0000\u00c6"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003\"\u0011\u0000\u00cb\u00c6"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce!\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00e4\u0005"+
		"\u001c\u0000\u0000\u00d1\u00d2\u0005\u001b\u0000\u0000\u00d2\u00e4\u0005"+
		"+\u0000\u0000\u00d3\u00d4\u0005\u001a\u0000\u0000\u00d4\u00e4\u0005+\u0000"+
		"\u0000\u00d5\u00e4\u0005+\u0000\u0000\u00d6\u00d7\u0005\u0017\u0000\u0000"+
		"\u00d7\u00e4\u0005+\u0000\u0000\u00d8\u00d9\u0005!\u0000\u0000\u00d9\u00e4"+
		"\u0005+\u0000\u0000\u00da\u00db\u0005\u001f\u0000\u0000\u00db\u00dc\u0003"+
		"$\u0012\u0000\u00dc\u00dd\u0005 \u0000\u0000\u00dd\u00e4\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\u0017\u0000\u0000\u00df\u00e0\u0005+\u0000\u0000"+
		"\u00e0\u00e1\u0005\u001d\u0000\u0000\u00e1\u00e2\u0007\u0000\u0000\u0000"+
		"\u00e2\u00e4\u0005\u001e\u0000\u0000\u00e3\u00d0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00d1\u0001\u0000\u0000\u0000\u00e3\u00d3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00d5\u0001\u0000\u0000\u0000\u00e3\u00d6\u0001\u0000\u0000\u0000"+
		"\u00e3\u00d8\u0001\u0000\u0000\u0000\u00e3\u00da\u0001\u0000\u0000\u0000"+
		"\u00e3\u00de\u0001\u0000\u0000\u0000\u00e4#\u0001\u0000\u0000\u0000\u00e5"+
		"\u00ea\u0005+\u0000\u0000\u00e6\u00e7\u0005+\u0000\u0000\u00e7\u00e8\u0007"+
		"\u0001\u0000\u0000\u00e8\u00ea\u0005,\u0000\u0000\u00e9\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00ea%\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ed\u0003(\u0014\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\'\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005+\u0000\u0000\u00f2\u00f3"+
		"\u0005\u0017\u0000\u0000\u00f3\u00f4\u0003*\u0015\u0000\u00f4\u00f5\u0005"+
		"\u0018\u0000\u0000\u00f5)\u0001\u0000\u0000\u0000\u00f6\u0100\u0003,\u0016"+
		"\u0000\u00f7\u00f9\u0005.\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003,\u0016\u0000\u00fe"+
		"\u00fa\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		"+\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0117"+
		"\u0005,\u0000\u0000\u0104\u0106\u0003.\u0017\u0000\u0105\u0107\u0005)"+
		"\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u0117\u0001\u0000\u0000\u0000\u0108\u0117\u0005+\u0000"+
		"\u0000\u0109\u0117\u0005*\u0000\u0000\u010a\u0117\u00030\u0018\u0000\u010b"+
		"\u0117\u0005-\u0000\u0000\u010c\u0117\u0005\u001b\u0000\u0000\u010d\u0117"+
		"\u0005\u0019\u0000\u0000\u010e\u0117\u0005\u001d\u0000\u0000\u010f\u0117"+
		"\u0005\u001e\u0000\u0000\u0110\u0117\u0005\u001f\u0000\u0000\u0111\u0117"+
		"\u0005 \u0000\u0000\u0112\u0117\u0005\u001a\u0000\u0000\u0113\u0117\u0005"+
		"\u001c\u0000\u0000\u0114\u0117\u0005\u0017\u0000\u0000\u0115\u0117\u0005"+
		"/\u0000\u0000\u0116\u0103\u0001\u0000\u0000\u0000\u0116\u0104\u0001\u0000"+
		"\u0000\u0000\u0116\u0108\u0001\u0000\u0000\u0000\u0116\u0109\u0001\u0000"+
		"\u0000\u0000\u0116\u010a\u0001\u0000\u0000\u0000\u0116\u010b\u0001\u0000"+
		"\u0000\u0000\u0116\u010c\u0001\u0000\u0000\u0000\u0116\u010d\u0001\u0000"+
		"\u0000\u0000\u0116\u010e\u0001\u0000\u0000\u0000\u0116\u010f\u0001\u0000"+
		"\u0000\u0000\u0116\u0110\u0001\u0000\u0000\u0000\u0116\u0111\u0001\u0000"+
		"\u0000\u0000\u0116\u0112\u0001\u0000\u0000\u0000\u0116\u0113\u0001\u0000"+
		"\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0115\u0001\u0000"+
		"\u0000\u0000\u0117-\u0001\u0000\u0000\u0000\u0118\u011b\u0005(\u0000\u0000"+
		"\u0119\u011b\u0005\'\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a"+
		"\u0119\u0001\u0000\u0000\u0000\u011b/\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0005+\u0000\u0000\u011d\u011f\u0005\u001d\u0000\u0000\u011e\u0120\u0003"+
		"2\u0019\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u001e"+
		"\u0000\u0000\u01221\u0001\u0000\u0000\u0000\u0123\u0128\u0003,\u0016\u0000"+
		"\u0124\u0125\u0005\u0019\u0000\u0000\u0125\u0127\u0003,\u0016\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"3\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0005\u0005\u0000\u0000\u012c\u012d\u00036\u001b\u0000\u012d\u012e\u0005"+
		"P\u0000\u0000\u012e5\u0001\u0000\u0000\u0000\u012f\u0131\u0007\u0002\u0000"+
		"\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u01337\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0135\u0138\u0003:\u001d\u0000\u0136\u0138\u0003>\u001f\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u01389\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0005\u0004\u0000\u0000\u013a\u013b\u0003"+
		"<\u001e\u0000\u013b\u013c\u00050\u0000\u0000\u013c;\u0001\u0000\u0000"+
		"\u0000\u013d\u014f\u0003D\"\u0000\u013e\u014f\u0005I\u0000\u0000\u013f"+
		"\u014f\u0005J\u0000\u0000\u0140\u014f\u0005K\u0000\u0000\u0141\u014f\u0005"+
		"L\u0000\u0000\u0142\u014f\u0005M\u0000\u0000\u0143\u014f\u0005N\u0000"+
		"\u0000\u0144\u014f\u0005?\u0000\u0000\u0145\u014f\u0005@\u0000\u0000\u0146"+
		"\u014f\u0005A\u0000\u0000\u0147\u014f\u0005B\u0000\u0000\u0148\u014f\u0005"+
		"C\u0000\u0000\u0149\u014f\u0005D\u0000\u0000\u014a\u014f\u0005E\u0000"+
		"\u0000\u014b\u014f\u0005F\u0000\u0000\u014c\u014f\u0005G\u0000\u0000\u014d"+
		"\u014f\u0005H\u0000\u0000\u014e\u013d\u0001\u0000\u0000\u0000\u014e\u013e"+
		"\u0001\u0000\u0000\u0000\u014e\u013f\u0001\u0000\u0000\u0000\u014e\u0140"+
		"\u0001\u0000\u0000\u0000\u014e\u0141\u0001\u0000\u0000\u0000\u014e\u0142"+
		"\u0001\u0000\u0000\u0000\u014e\u0143\u0001\u0000\u0000\u0000\u014e\u0144"+
		"\u0001\u0000\u0000\u0000\u014e\u0145\u0001\u0000\u0000\u0000\u014e\u0146"+
		"\u0001\u0000\u0000\u0000\u014e\u0147\u0001\u0000\u0000\u0000\u014e\u0148"+
		"\u0001\u0000\u0000\u0000\u014e\u0149\u0001\u0000\u0000\u0000\u014e\u014a"+
		"\u0001\u0000\u0000\u0000\u014e\u014b\u0001\u0000\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151=\u0001\u0000\u0000\u0000\u0152\u0153\u0005"+
		"\u0004\u0000\u0000\u0153\u0154\u0003@ \u0000\u0154\u0158\u00050\u0000"+
		"\u0000\u0155\u0157\u0003\u0006\u0003\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000\u0000"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0004\u0000"+
		"\u0000\u015c\u015d\u0003B!\u0000\u015d\u015e\u00050\u0000\u0000\u015e"+
		"?\u0001\u0000\u0000\u0000\u015f\u0160\u00051\u0000\u0000\u0160\u0168\u0003"+
		"6\u001b\u0000\u0161\u0162\u00055\u0000\u0000\u0162\u0168\u00036\u001b"+
		"\u0000\u0163\u0164\u00057\u0000\u0000\u0164\u0168\u0005I\u0000\u0000\u0165"+
		"\u0166\u00059\u0000\u0000\u0166\u0168\u0005I\u0000\u0000\u0167\u015f\u0001"+
		"\u0000\u0000\u0000\u0167\u0161\u0001\u0000\u0000\u0000\u0167\u0163\u0001"+
		"\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168A\u0001\u0000"+
		"\u0000\u0000\u0169\u016e\u00054\u0000\u0000\u016a\u016e\u00056\u0000\u0000"+
		"\u016b\u016e\u00058\u0000\u0000\u016c\u016e\u0005:\u0000\u0000\u016d\u0169"+
		"\u0001\u0000\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016eC\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0007\u0003\u0000\u0000\u0170E\u0001\u0000"+
		"\u0000\u0000\u0171\u0175\u0005\u0004\u0000\u0000\u0172\u0174\t\u0000\u0000"+
		"\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000"+
		"\u0000\u0176\u0180\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000"+
		"\u0000\u0178\u017c\u0005\u0005\u0000\u0000\u0179\u017b\t\u0000\u0000\u0000"+
		"\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000"+
		"\u017d\u0180\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000"+
		"\u017f\u0171\u0001\u0000\u0000\u0000\u017f\u0178\u0001\u0000\u0000\u0000"+
		"\u0180G\u0001\u0000\u0000\u0000(JLRaelnvx{\u0082\u0091\u0095\u009c\u00a1"+
		"\u00ac\u00bb\u00c1\u00c8\u00cd\u00e3\u00e9\u00ee\u00fa\u0100\u0106\u0116"+
		"\u011a\u011f\u0128\u0132\u0137\u014e\u0150\u0158\u0167\u016d\u0175\u017c"+
		"\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}