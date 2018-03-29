// Generated from SyntaticAnalyzer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyntaticAnalyzerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATER=1, GREATEREQUAL=2, LESS=3, LESSEQUAL=4, EQUAL=5, NOTEQUAL=6, ADD=7, 
		MINUS=8, STAR=9, SLASH=10, MOD=11, NOT=12, AND=13, OR=14, LCURLY=15, RCURLY=16, 
		LSQUARE=17, RSQUARE=18, LPAREN=19, RPAREN=20, EQUALS=21, SEMICO=22, DOT=23, 
		COMMA=24, WHILE=25, FOR=26, SWITCH=27, CASE=28, DEFAULT=29, IF=30, ELSE=31, 
		BREAK=32, RETURN=33, INT=34, BOOLEAN=35, STRING=36, DOUBLE=37, VOID=38, 
		OBJECT=39, TYPE=40, WHITESPACE=41, SINGLE_LINE_COMMENT=42, MULTI_LINE_COMMENT=43, 
		NUMBER=44, TRUE=45, FALSE=46, STRING_LITERAL=47, ID=48, ESCAPE_CHAR=49;
	public static final int
		RULE_type = 0, RULE_declaration = 1;
	public static final String[] ruleNames = {
		"type", "declaration"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'!'", "'&&'", "'||'", "'{'", "'}'", "'['", "']'", "'('", 
		"')'", "'='", "';'", "'.'", "','", "'while'", "'for'", "'switch'", "'case'", 
		"'default'", "'if'", "'else'", "'break'", "'return'", "'int'", "'boolean'", 
		"'string'", "'double'", "'void'", "'object'", null, null, null, null, 
		null, "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GREATER", "GREATEREQUAL", "LESS", "LESSEQUAL", "EQUAL", "NOTEQUAL", 
		"ADD", "MINUS", "STAR", "SLASH", "MOD", "NOT", "AND", "OR", "LCURLY", 
		"RCURLY", "LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "EQUALS", "SEMICO", 
		"DOT", "COMMA", "WHILE", "FOR", "SWITCH", "CASE", "DEFAULT", "IF", "ELSE", 
		"BREAK", "RETURN", "INT", "BOOLEAN", "STRING", "DOUBLE", "VOID", "OBJECT", 
		"TYPE", "WHITESPACE", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "NUMBER", 
		"TRUE", "FALSE", "STRING_LITERAL", "ID", "ESCAPE_CHAR"
	};
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
	public String getGrammarFileName() { return "SyntaticAnalyzer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SyntaticAnalyzerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SyntaticAnalyzerParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(SyntaticAnalyzerParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(SyntaticAnalyzerParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(SyntaticAnalyzerParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(SyntaticAnalyzerParser.VOID, 0); }
		public TerminalNode OBJECT() { return getToken(SyntaticAnalyzerParser.OBJECT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaticAnalyzerListener ) ((SyntaticAnalyzerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaticAnalyzerListener ) ((SyntaticAnalyzerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT))) != 0)) ) {
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SyntaticAnalyzerParser.ID, 0); }
		public List<TerminalNode> LSQUARE() { return getTokens(SyntaticAnalyzerParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(SyntaticAnalyzerParser.LSQUARE, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SyntaticAnalyzerParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SyntaticAnalyzerParser.NUMBER, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(SyntaticAnalyzerParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(SyntaticAnalyzerParser.RSQUARE, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaticAnalyzerListener ) ((SyntaticAnalyzerListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaticAnalyzerListener ) ((SyntaticAnalyzerListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			type();
			setState(7);
			match(ID);
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSQUARE) {
				{
				{
				setState(8);
				match(LSQUARE);
				setState(9);
				match(NUMBER);
				setState(10);
				match(RSQUARE);
				}
				}
				setState(15);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\23\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\16\n\3\f\3\16\3\21\13\3\3\3\2\2\4"+
		"\2\4\2\3\3\2$)\2\21\2\6\3\2\2\2\4\b\3\2\2\2\6\7\t\2\2\2\7\3\3\2\2\2\b"+
		"\t\5\2\2\2\t\17\7\62\2\2\n\13\7\23\2\2\13\f\7.\2\2\f\16\7\24\2\2\r\n\3"+
		"\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\5\3\2\2\2\21\17\3\2"+
		"\2\2\3\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}