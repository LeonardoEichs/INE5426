// Generated from AMZ_synt.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AMZ_syntLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATER=1, GREATEREQUAL=2, LESS=3, LESSEQUAL=4, EQUAL=5, NOTEQUAL=6, ADD=7, 
		MINUS=8, STAR=9, SLASH=10, MOD=11, NOT=12, AND=13, OR=14, LCURLY=15, RCURLY=16, 
		LSQUARE=17, RSQUARE=18, LPAREN=19, RPAREN=20, EQUALS=21, SEMICO=22, COLON=23, 
		DOT=24, COMMA=25, IMPORT=26, WHILE=27, FOR=28, SWITCH=29, CASE=30, DEFAULT=31, 
		IF=32, ELSE=33, BREAK=34, RETURN=35, INT=36, BOOLEAN=37, STRING=38, DOUBLE=39, 
		VOID=40, OBJECT=41, WHITESPACE=42, SINGLE_LINE_COMMENT=43, MULTI_LINE_COMMENT=44, 
		NUMBER=45, TRUE=46, FALSE=47, STRING_LITERAL=48, ID=49, ESCAPE_CHAR=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"GREATER", "GREATEREQUAL", "LESS", "LESSEQUAL", "EQUAL", "NOTEQUAL", "ADD", 
		"MINUS", "STAR", "SLASH", "MOD", "NOT", "AND", "OR", "LCURLY", "RCURLY", 
		"LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "EQUALS", "SEMICO", "COLON", 
		"DOT", "COMMA", "IMPORT", "WHILE", "FOR", "SWITCH", "CASE", "DEFAULT", 
		"IF", "ELSE", "BREAK", "RETURN", "INT", "BOOLEAN", "STRING", "DOUBLE", 
		"VOID", "OBJECT", "WHITESPACE", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
		"DIGIT", "NUMBER", "TRUE", "FALSE", "STRING_LITERAL", "LETTER_LOWER", 
		"LETTER_UPPER", "ID", "ESCAPE_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'!'", "'&&'", "'||'", "'{'", "'}'", "'['", "']'", "'('", 
		"')'", "'='", "';'", "':'", "'.'", "','", "'#import'", "'while'", "'for'", 
		"'switch'", "'case'", "'default'", "'if'", "'else'", "'break'", "'return'", 
		"'int'", null, "'string'", "'double'", "'void'", "'object'", null, null, 
		null, null, "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GREATER", "GREATEREQUAL", "LESS", "LESSEQUAL", "EQUAL", "NOTEQUAL", 
		"ADD", "MINUS", "STAR", "SLASH", "MOD", "NOT", "AND", "OR", "LCURLY", 
		"RCURLY", "LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "EQUALS", "SEMICO", 
		"COLON", "DOT", "COMMA", "IMPORT", "WHILE", "FOR", "SWITCH", "CASE", "DEFAULT", 
		"IF", "ELSE", "BREAK", "RETURN", "INT", "BOOLEAN", "STRING", "DOUBLE", 
		"VOID", "OBJECT", "WHITESPACE", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
		"NUMBER", "TRUE", "FALSE", "STRING_LITERAL", "ID", "ESCAPE_CHAR"
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


	public AMZ_syntLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AMZ_synt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u017e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\5&\u00f0\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\6+\u010d\n+\r+\16+\u010e\3+\3"+
		"+\3,\3,\3,\3,\7,\u0117\n,\f,\16,\u011a\13,\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\6-\u0125\n-\r-\16-\u0126\3-\7-\u012a\n-\f-\16-\u012d\13-\3-\7-\u0130"+
		"\n-\f-\16-\u0133\13-\3-\3-\3-\3-\3-\3.\3.\3/\6/\u013d\n/\r/\16/\u013e"+
		"\3/\6/\u0142\n/\r/\16/\u0143\3/\3/\7/\u0148\n/\f/\16/\u014b\13/\3/\3/"+
		"\6/\u014f\n/\r/\16/\u0150\5/\u0153\n/\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0164\n\62\f\62\16\62"+
		"\u0167\13\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\7"+
		"\65\u0174\n\65\f\65\16\65\u0177\13\65\3\66\3\66\3\66\3\66\5\66\u017d\n"+
		"\66\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]/_\60a\61c\62e\2g\2i\63"+
		"k\64\3\2\13\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\4\2,,\61\61\3\2\62;\6\2\f"+
		"\f\17\17$$^^\7\2$$^^ppttvv\3\2c|\3\2C\\\2\u018e\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7r\3\2\2\2\tt\3\2\2\2\13w\3\2\2\2\rz\3\2"+
		"\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085"+
		"\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2\2\35\u008c\3\2\2\2\37\u008f\3"+
		"\2\2\2!\u0091\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u0099"+
		"\3\2\2\2+\u009b\3\2\2\2-\u009d\3\2\2\2/\u009f\3\2\2\2\61\u00a1\3\2\2\2"+
		"\63\u00a3\3\2\2\2\65\u00a5\3\2\2\2\67\u00ad\3\2\2\29\u00b3\3\2\2\2;\u00b7"+
		"\3\2\2\2=\u00be\3\2\2\2?\u00c3\3\2\2\2A\u00cb\3\2\2\2C\u00ce\3\2\2\2E"+
		"\u00d3\3\2\2\2G\u00d9\3\2\2\2I\u00e0\3\2\2\2K\u00ef\3\2\2\2M\u00f1\3\2"+
		"\2\2O\u00f8\3\2\2\2Q\u00ff\3\2\2\2S\u0104\3\2\2\2U\u010c\3\2\2\2W\u0112"+
		"\3\2\2\2Y\u011f\3\2\2\2[\u0139\3\2\2\2]\u0152\3\2\2\2_\u0154\3\2\2\2a"+
		"\u0159\3\2\2\2c\u015f\3\2\2\2e\u016a\3\2\2\2g\u016c\3\2\2\2i\u016e\3\2"+
		"\2\2k\u017c\3\2\2\2mn\7@\2\2n\4\3\2\2\2op\7@\2\2pq\7?\2\2q\6\3\2\2\2r"+
		"s\7>\2\2s\b\3\2\2\2tu\7>\2\2uv\7?\2\2v\n\3\2\2\2wx\7?\2\2xy\7?\2\2y\f"+
		"\3\2\2\2z{\7#\2\2{|\7?\2\2|\16\3\2\2\2}~\7-\2\2~\20\3\2\2\2\177\u0080"+
		"\7/\2\2\u0080\22\3\2\2\2\u0081\u0082\7,\2\2\u0082\24\3\2\2\2\u0083\u0084"+
		"\7\61\2\2\u0084\26\3\2\2\2\u0085\u0086\7\'\2\2\u0086\30\3\2\2\2\u0087"+
		"\u0088\7#\2\2\u0088\32\3\2\2\2\u0089\u008a\7(\2\2\u008a\u008b\7(\2\2\u008b"+
		"\34\3\2\2\2\u008c\u008d\7~\2\2\u008d\u008e\7~\2\2\u008e\36\3\2\2\2\u008f"+
		"\u0090\7}\2\2\u0090 \3\2\2\2\u0091\u0092\7\177\2\2\u0092\"\3\2\2\2\u0093"+
		"\u0094\7]\2\2\u0094$\3\2\2\2\u0095\u0096\7_\2\2\u0096&\3\2\2\2\u0097\u0098"+
		"\7*\2\2\u0098(\3\2\2\2\u0099\u009a\7+\2\2\u009a*\3\2\2\2\u009b\u009c\7"+
		"?\2\2\u009c,\3\2\2\2\u009d\u009e\7=\2\2\u009e.\3\2\2\2\u009f\u00a0\7<"+
		"\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\7\60\2\2\u00a2\62\3\2\2\2\u00a3\u00a4"+
		"\7.\2\2\u00a4\64\3\2\2\2\u00a5\u00a6\7%\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8"+
		"\7o\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7t\2\2\u00ab"+
		"\u00ac\7v\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7y\2\2\u00ae\u00af\7j\2\2\u00af"+
		"\u00b0\7k\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7g\2\2\u00b28\3\2\2\2\u00b3"+
		"\u00b4\7h\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7t\2\2\u00b6:\3\2\2\2\u00b7"+
		"\u00b8\7u\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7v\2\2"+
		"\u00bb\u00bc\7e\2\2\u00bc\u00bd\7j\2\2\u00bd<\3\2\2\2\u00be\u00bf\7e\2"+
		"\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2\u00c2>\3\2"+
		"\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7v\2\2\u00ca"+
		"@\3\2\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7h\2\2\u00cdB\3\2\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		"D\3\2\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\u00d8\7m\2\2\u00d8F\3\2\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7t\2\2"+
		"\u00de\u00df\7p\2\2\u00dfH\3\2\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2"+
		"\2\u00e2\u00e3\7v\2\2\u00e3J\3\2\2\2\u00e4\u00e5\7d\2\2\u00e5\u00e6\7"+
		"q\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea"+
		"\7c\2\2\u00ea\u00f0\7p\2\2\u00eb\u00ec\7d\2\2\u00ec\u00ed\7q\2\2\u00ed"+
		"\u00ee\7q\2\2\u00ee\u00f0\7n\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00eb\3\2\2"+
		"\2\u00f0L\3\2\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7"+
		"t\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7i\2\2\u00f7N"+
		"\3\2\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7w\2\2\u00fb"+
		"\u00fc\7d\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7g\2\2\u00feP\3\2\2\2\u00ff"+
		"\u0100\7x\2\2\u0100\u0101\7q\2\2\u0101\u0102\7k\2\2\u0102\u0103\7f\2\2"+
		"\u0103R\3\2\2\2\u0104\u0105\7q\2\2\u0105\u0106\7d\2\2\u0106\u0107\7l\2"+
		"\2\u0107\u0108\7g\2\2\u0108\u0109\7e\2\2\u0109\u010a\7v\2\2\u010aT\3\2"+
		"\2\2\u010b\u010d\t\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\b+"+
		"\2\2\u0111V\3\2\2\2\u0112\u0113\7\61\2\2\u0113\u0114\7\61\2\2\u0114\u0118"+
		"\3\2\2\2\u0115\u0117\n\3\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011b\u011c\7\f\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b,\2\2\u011e"+
		"X\3\2\2\2\u011f\u0120\7\61\2\2\u0120\u0121\7,\2\2\u0121\u012b\3\2\2\2"+
		"\u0122\u012a\n\4\2\2\u0123\u0125\7,\2\2\u0124\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\n\5\2\2\u0129\u0122\3\2\2\2\u0129\u0124\3\2\2\2\u012a\u012d\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0131\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u0130\7,\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\7,\2\2\u0135\u0136\7\61\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\b-\2\2\u0138Z\3\2\2\2\u0139\u013a\t\6\2\2\u013a\\\3\2"+
		"\2\2\u013b\u013d\5[.\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0153\3\2\2\2\u0140\u0142\5[.\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0149\7\60\2\2\u0146\u0148\5[.\2\u0147"+
		"\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u0153\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\7\60\2\2\u014d"+
		"\u014f\5[.\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2"+
		"\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u013c\3\2\2\2\u0152\u0141"+
		"\3\2\2\2\u0152\u014c\3\2\2\2\u0153^\3\2\2\2\u0154\u0155\7v\2\2\u0155\u0156"+
		"\7t\2\2\u0156\u0157\7w\2\2\u0157\u0158\7g\2\2\u0158`\3\2\2\2\u0159\u015a"+
		"\7h\2\2\u015a\u015b\7c\2\2\u015b\u015c\7n\2\2\u015c\u015d\7u\2\2\u015d"+
		"\u015e\7g\2\2\u015eb\3\2\2\2\u015f\u0165\7$\2\2\u0160\u0164\n\7\2\2\u0161"+
		"\u0162\7^\2\2\u0162\u0164\t\b\2\2\u0163\u0160\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7$\2\2\u0169d\3\2\2\2\u016a"+
		"\u016b\t\t\2\2\u016bf\3\2\2\2\u016c\u016d\t\n\2\2\u016dh\3\2\2\2\u016e"+
		"\u0175\5e\63\2\u016f\u0174\5e\63\2\u0170\u0174\5g\64\2\u0171\u0174\5["+
		".\2\u0172\u0174\7a\2\2\u0173\u016f\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176j\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7^\2\2\u0179"+
		"\u017d\7v\2\2\u017a\u017b\7^\2\2\u017b\u017d\7p\2\2\u017c\u0178\3\2\2"+
		"\2\u017c\u017a\3\2\2\2\u017dl\3\2\2\2\24\2\u00ef\u010e\u0118\u0126\u0129"+
		"\u012b\u0131\u013e\u0143\u0149\u0150\u0152\u0163\u0165\u0173\u0175\u017c"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}