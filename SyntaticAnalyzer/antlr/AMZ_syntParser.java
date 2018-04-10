// Generated from AMZ_synt.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AMZ_syntParser extends Parser {
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
	public static final int
		RULE_eval = 0, RULE_import_file = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_id_optional_array = 4, RULE_array_position = 5, RULE_unary_operator = 6, 
		RULE_arithmetic_binary_op_higher_prec = 7, RULE_arithmetic_binary_op_lower_prec = 8, 
		RULE_comparison_op_higher_prec = 9, RULE_comparison_op_lower_prec = 10, 
		RULE_logic_binary_op_higher_prec = 11, RULE_logic_binary_op_lower_prec = 12, 
		RULE_expression = 13, RULE_value = 14, RULE_function_call = 15, RULE_arguments = 16, 
		RULE_object_literal = 17, RULE_object_element = 18, RULE_array_literal = 19, 
		RULE_command = 20, RULE_simple_command = 21, RULE_block_command = 22, 
		RULE_command_block = 23, RULE_while_block = 24, RULE_for_block = 25, RULE_if_block = 26, 
		RULE_switch_block = 27, RULE_case_block = 28, RULE_default_block = 29, 
		RULE_function_block = 30, RULE_parameters = 31;
	public static final String[] ruleNames = {
		"eval", "import_file", "declaration", "type", "id_optional_array", "array_position", 
		"unary_operator", "arithmetic_binary_op_higher_prec", "arithmetic_binary_op_lower_prec", 
		"comparison_op_higher_prec", "comparison_op_lower_prec", "logic_binary_op_higher_prec", 
		"logic_binary_op_lower_prec", "expression", "value", "function_call", 
		"arguments", "object_literal", "object_element", "array_literal", "command", 
		"simple_command", "block_command", "command_block", "while_block", "for_block", 
		"if_block", "switch_block", "case_block", "default_block", "function_block", 
		"parameters"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'!'", "'&&'", "'||'", "'{'", "'}'", "'['", "']'", "'('", 
		"')'", "'='", "';'", "':'", "'.'", "','", "'#import'", "'while'", "'for'", 
		"'switch'", "'case'", "'default'", "'if'", "'else'", "'break'", "'return'", 
		"'int'", "'boolean'", "'string'", "'double'", "'void'", "'object'", null, 
		null, null, null, "'true'", "'false'"
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

	@Override
	public String getGrammarFileName() { return "AMZ_synt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AMZ_syntParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AMZ_syntParser.EOF, 0); }
		public List<Import_fileContext> import_file() {
			return getRuleContexts(Import_fileContext.class);
		}
		public Import_fileContext import_file(int i) {
			return getRuleContext(Import_fileContext.class,i);
		}
		public List<Function_blockContext> function_block() {
			return getRuleContexts(Function_blockContext.class);
		}
		public Function_blockContext function_block(int i) {
			return getRuleContext(Function_blockContext.class,i);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(64);
				import_file();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT))) != 0)) {
				{
				{
				setState(70);
				function_block();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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

	public static class Import_fileContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AMZ_syntParser.IMPORT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AMZ_syntParser.STRING_LITERAL, 0); }
		public TerminalNode SEMICO() { return getToken(AMZ_syntParser.SEMICO, 0); }
		public Import_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterImport_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitImport_file(this);
		}
	}

	public final Import_fileContext import_file() throws RecognitionException {
		Import_fileContext _localctx = new Import_fileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IMPORT);
			setState(79);
			match(STRING_LITERAL);
			setState(80);
			match(SEMICO);
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
		public Id_optional_arrayContext id_optional_array() {
			return getRuleContext(Id_optional_arrayContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			type();
			setState(83);
			id_optional_array();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AMZ_syntParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(AMZ_syntParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(AMZ_syntParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(AMZ_syntParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(AMZ_syntParser.VOID, 0); }
		public TerminalNode OBJECT() { return getToken(AMZ_syntParser.OBJECT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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

	public static class Id_optional_arrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AMZ_syntParser.ID, 0); }
		public List<Array_positionContext> array_position() {
			return getRuleContexts(Array_positionContext.class);
		}
		public Array_positionContext array_position(int i) {
			return getRuleContext(Array_positionContext.class,i);
		}
		public Id_optional_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_optional_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterId_optional_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitId_optional_array(this);
		}
	}

	public final Id_optional_arrayContext id_optional_array() throws RecognitionException {
		Id_optional_arrayContext _localctx = new Id_optional_arrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id_optional_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ID);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					array_position();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Array_positionContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(AMZ_syntParser.LSQUARE, 0); }
		public TerminalNode NUMBER() { return getToken(AMZ_syntParser.NUMBER, 0); }
		public TerminalNode RSQUARE() { return getToken(AMZ_syntParser.RSQUARE, 0); }
		public Array_positionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterArray_position(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitArray_position(this);
		}
	}

	public final Array_positionContext array_position() throws RecognitionException {
		Array_positionContext _localctx = new Array_positionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LSQUARE);
			setState(95);
			match(NUMBER);
			setState(96);
			match(RSQUARE);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(AMZ_syntParser.NOT, 0); }
		public TerminalNode ADD() { return getToken(AMZ_syntParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(AMZ_syntParser.MINUS, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
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

	public static class Arithmetic_binary_op_higher_precContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(AMZ_syntParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(AMZ_syntParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(AMZ_syntParser.MOD, 0); }
		public Arithmetic_binary_op_higher_precContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_binary_op_higher_prec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterArithmetic_binary_op_higher_prec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitArithmetic_binary_op_higher_prec(this);
		}
	}

	public final Arithmetic_binary_op_higher_precContext arithmetic_binary_op_higher_prec() throws RecognitionException {
		Arithmetic_binary_op_higher_precContext _localctx = new Arithmetic_binary_op_higher_precContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arithmetic_binary_op_higher_prec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << MOD))) != 0)) ) {
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

	public static class Arithmetic_binary_op_lower_precContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(AMZ_syntParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(AMZ_syntParser.MINUS, 0); }
		public Arithmetic_binary_op_lower_precContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_binary_op_lower_prec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterArithmetic_binary_op_lower_prec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitArithmetic_binary_op_lower_prec(this);
		}
	}

	public final Arithmetic_binary_op_lower_precContext arithmetic_binary_op_lower_prec() throws RecognitionException {
		Arithmetic_binary_op_lower_precContext _localctx = new Arithmetic_binary_op_lower_precContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arithmetic_binary_op_lower_prec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==MINUS) ) {
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

	public static class Comparison_op_higher_precContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(AMZ_syntParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(AMZ_syntParser.GREATEREQUAL, 0); }
		public TerminalNode LESS() { return getToken(AMZ_syntParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(AMZ_syntParser.LESSEQUAL, 0); }
		public Comparison_op_higher_precContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_op_higher_prec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterComparison_op_higher_prec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitComparison_op_higher_prec(this);
		}
	}

	public final Comparison_op_higher_precContext comparison_op_higher_prec() throws RecognitionException {
		Comparison_op_higher_precContext _localctx = new Comparison_op_higher_precContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison_op_higher_prec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << GREATEREQUAL) | (1L << LESS) | (1L << LESSEQUAL))) != 0)) ) {
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

	public static class Comparison_op_lower_precContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AMZ_syntParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(AMZ_syntParser.NOTEQUAL, 0); }
		public Comparison_op_lower_precContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_op_lower_prec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterComparison_op_lower_prec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitComparison_op_lower_prec(this);
		}
	}

	public final Comparison_op_lower_precContext comparison_op_lower_prec() throws RecognitionException {
		Comparison_op_lower_precContext _localctx = new Comparison_op_lower_precContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparison_op_lower_prec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
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

	public static class Logic_binary_op_higher_precContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(AMZ_syntParser.AND, 0); }
		public Logic_binary_op_higher_precContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_binary_op_higher_prec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterLogic_binary_op_higher_prec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitLogic_binary_op_higher_prec(this);
		}
	}

	public final Logic_binary_op_higher_precContext logic_binary_op_higher_prec() throws RecognitionException {
		Logic_binary_op_higher_precContext _localctx = new Logic_binary_op_higher_precContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logic_binary_op_higher_prec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(AND);
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

	public static class Logic_binary_op_lower_precContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(AMZ_syntParser.OR, 0); }
		public Logic_binary_op_lower_precContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_binary_op_lower_prec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterLogic_binary_op_lower_prec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitLogic_binary_op_lower_prec(this);
		}
	}

	public final Logic_binary_op_lower_precContext logic_binary_op_lower_prec() throws RecognitionException {
		Logic_binary_op_lower_precContext _localctx = new Logic_binary_op_lower_precContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logic_binary_op_lower_prec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(OR);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AMZ_syntParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(AMZ_syntParser.RPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(AMZ_syntParser.ID, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<Array_positionContext> array_position() {
			return getRuleContexts(Array_positionContext.class);
		}
		public Array_positionContext array_position(int i) {
			return getRuleContext(Array_positionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AMZ_syntParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AMZ_syntParser.DOT, i);
		}
		public List<Id_optional_arrayContext> id_optional_array() {
			return getRuleContexts(Id_optional_arrayContext.class);
		}
		public Id_optional_arrayContext id_optional_array(int i) {
			return getRuleContext(Id_optional_arrayContext.class,i);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Arithmetic_binary_op_higher_precContext arithmetic_binary_op_higher_prec() {
			return getRuleContext(Arithmetic_binary_op_higher_precContext.class,0);
		}
		public Arithmetic_binary_op_lower_precContext arithmetic_binary_op_lower_prec() {
			return getRuleContext(Arithmetic_binary_op_lower_precContext.class,0);
		}
		public Comparison_op_higher_precContext comparison_op_higher_prec() {
			return getRuleContext(Comparison_op_higher_precContext.class,0);
		}
		public Comparison_op_lower_precContext comparison_op_lower_prec() {
			return getRuleContext(Comparison_op_lower_precContext.class,0);
		}
		public Logic_binary_op_higher_precContext logic_binary_op_higher_prec() {
			return getRuleContext(Logic_binary_op_higher_precContext.class,0);
		}
		public Logic_binary_op_lower_precContext logic_binary_op_lower_prec() {
			return getRuleContext(Logic_binary_op_lower_precContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(113);
				match(LPAREN);
				setState(114);
				expression(0);
				setState(115);
				match(RPAREN);
				}
				break;
			case LCURLY:
			case LSQUARE:
			case NUMBER:
			case TRUE:
			case FALSE:
			case STRING_LITERAL:
			case ID:
				{
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(117);
					value();
					}
					break;
				case 2:
					{
					setState(118);
					match(ID);
					}
					break;
				case 3:
					{
					setState(119);
					function_call();
					}
					break;
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						array_position();
						}
						} 
					}
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						match(DOT);
						setState(129);
						id_optional_array();
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case ADD:
			case MINUS:
			case NOT:
				{
				setState(135);
				unary_operator();
				setState(136);
				expression(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(141);
						arithmetic_binary_op_higher_prec();
						setState(142);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(145);
						arithmetic_binary_op_lower_prec();
						setState(146);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(149);
						comparison_op_higher_prec();
						setState(150);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(153);
						comparison_op_lower_prec();
						setState(154);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(157);
						logic_binary_op_higher_prec();
						setState(158);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(161);
						logic_binary_op_lower_prec();
						setState(162);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AMZ_syntParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AMZ_syntParser.STRING_LITERAL, 0); }
		public Object_literalContext object_literal() {
			return getRuleContext(Object_literalContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(AMZ_syntParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AMZ_syntParser.FALSE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(NUMBER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(STRING_LITERAL);
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				object_literal();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				array_literal();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				match(FALSE);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AMZ_syntParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AMZ_syntParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AMZ_syntParser.RPAREN, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			{
			setState(178);
			match(LPAREN);
			setState(179);
			arguments();
			setState(180);
			match(RPAREN);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AMZ_syntParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AMZ_syntParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(182);
				expression(0);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(183);
					match(COMMA);
					setState(184);
					expression(0);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Object_literalContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AMZ_syntParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AMZ_syntParser.RCURLY, 0); }
		public List<Object_elementContext> object_element() {
			return getRuleContexts(Object_elementContext.class);
		}
		public Object_elementContext object_element(int i) {
			return getRuleContext(Object_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AMZ_syntParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AMZ_syntParser.COMMA, i);
		}
		public Object_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterObject_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitObject_literal(this);
		}
	}

	public final Object_literalContext object_literal() throws RecognitionException {
		Object_literalContext _localctx = new Object_literalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_object_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(LCURLY);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT))) != 0)) {
				{
				setState(193);
				object_element();
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(194);
					match(COMMA);
					setState(195);
					object_element();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(203);
			match(RCURLY);
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

	public static class Object_elementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AMZ_syntParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Object_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterObject_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitObject_element(this);
		}
	}

	public final Object_elementContext object_element() throws RecognitionException {
		Object_elementContext _localctx = new Object_elementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_object_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			declaration();
			setState(206);
			match(COLON);
			setState(207);
			expression(0);
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

	public static class Array_literalContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(AMZ_syntParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(AMZ_syntParser.RSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AMZ_syntParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AMZ_syntParser.COMMA, i);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitArray_literal(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(LSQUARE);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(210);
				expression(0);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(211);
					match(COMMA);
					setState(212);
					expression(0);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(220);
			match(RSQUARE);
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

	public static class CommandContext extends ParserRuleContext {
		public Simple_commandContext simple_command() {
			return getRuleContext(Simple_commandContext.class,0);
		}
		public TerminalNode SEMICO() { return getToken(AMZ_syntParser.SEMICO, 0); }
		public Block_commandContext block_command() {
			return getRuleContext(Block_commandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_command);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case MINUS:
			case NOT:
			case LCURLY:
			case LSQUARE:
			case LPAREN:
			case BREAK:
			case RETURN:
			case INT:
			case BOOLEAN:
			case STRING:
			case DOUBLE:
			case VOID:
			case OBJECT:
			case NUMBER:
			case TRUE:
			case FALSE:
			case STRING_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				simple_command();
				setState(223);
				match(SEMICO);
				}
				break;
			case WHILE:
			case FOR:
			case SWITCH:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				block_command();
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

	public static class Simple_commandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AMZ_syntParser.EQUALS, 0); }
		public List<Id_optional_arrayContext> id_optional_array() {
			return getRuleContexts(Id_optional_arrayContext.class);
		}
		public Id_optional_arrayContext id_optional_array(int i) {
			return getRuleContext(Id_optional_arrayContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AMZ_syntParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AMZ_syntParser.DOT, i);
		}
		public TerminalNode BREAK() { return getToken(AMZ_syntParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(AMZ_syntParser.RETURN, 0); }
		public Simple_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterSimple_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitSimple_command(this);
		}
	}

	public final Simple_commandContext simple_command() throws RecognitionException {
		Simple_commandContext _localctx = new Simple_commandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simple_command);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				declaration();
				setState(230);
				match(EQUALS);
				setState(231);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				id_optional_array();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(235);
					match(DOT);
					setState(236);
					id_optional_array();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(EQUALS);
				setState(243);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(BREAK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				match(RETURN);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(247);
					expression(0);
					}
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

	public static class Block_commandContext extends ParserRuleContext {
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public Switch_blockContext switch_block() {
			return getRuleContext(Switch_blockContext.class,0);
		}
		public Block_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterBlock_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitBlock_command(this);
		}
	}

	public final Block_commandContext block_command() throws RecognitionException {
		Block_commandContext _localctx = new Block_commandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block_command);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				while_block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				if_block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				for_block();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				switch_block();
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

	public static class Command_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(AMZ_syntParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AMZ_syntParser.RCURLY, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Command_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterCommand_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitCommand_block(this);
		}
	}

	public final Command_blockContext command_block() throws RecognitionException {
		Command_blockContext _localctx = new Command_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_command_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(LCURLY);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << IF) | (1L << BREAK) | (1L << RETURN) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(259);
				command();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(RCURLY);
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AMZ_syntParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AMZ_syntParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AMZ_syntParser.RPAREN, 0); }
		public Command_blockContext command_block() {
			return getRuleContext(Command_blockContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitWhile_block(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(WHILE);
			setState(268);
			match(LPAREN);
			setState(269);
			expression(0);
			setState(270);
			match(RPAREN);
			setState(271);
			command_block();
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

	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AMZ_syntParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AMZ_syntParser.LPAREN, 0); }
		public List<TerminalNode> SEMICO() { return getTokens(AMZ_syntParser.SEMICO); }
		public TerminalNode SEMICO(int i) {
			return getToken(AMZ_syntParser.SEMICO, i);
		}
		public TerminalNode RPAREN() { return getToken(AMZ_syntParser.RPAREN, 0); }
		public Command_blockContext command_block() {
			return getRuleContext(Command_blockContext.class,0);
		}
		public List<Simple_commandContext> simple_command() {
			return getRuleContexts(Simple_commandContext.class);
		}
		public Simple_commandContext simple_command(int i) {
			return getRuleContext(Simple_commandContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterFor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitFor_block(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(FOR);
			setState(274);
			match(LPAREN);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << BREAK) | (1L << RETURN) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(275);
				simple_command();
				}
			}

			setState(278);
			match(SEMICO);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(279);
				expression(0);
				}
			}

			setState(282);
			match(SEMICO);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << BREAK) | (1L << RETURN) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(283);
				simple_command();
				}
			}

			setState(286);
			match(RPAREN);
			setState(287);
			command_block();
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

	public static class If_blockContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(AMZ_syntParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(AMZ_syntParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AMZ_syntParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AMZ_syntParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AMZ_syntParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AMZ_syntParser.RPAREN, i);
		}
		public List<Command_blockContext> command_block() {
			return getRuleContexts(Command_blockContext.class);
		}
		public Command_blockContext command_block(int i) {
			return getRuleContext(Command_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(AMZ_syntParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(AMZ_syntParser.ELSE, i);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitIf_block(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IF);
			setState(290);
			match(LPAREN);
			setState(291);
			expression(0);
			setState(292);
			match(RPAREN);
			setState(293);
			command_block();
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					match(ELSE);
					setState(295);
					match(IF);
					setState(296);
					match(LPAREN);
					setState(297);
					expression(0);
					setState(298);
					match(RPAREN);
					setState(299);
					command_block();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(306);
				match(ELSE);
				setState(307);
				command_block();
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

	public static class Switch_blockContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(AMZ_syntParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(AMZ_syntParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AMZ_syntParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(AMZ_syntParser.LCURLY, 0); }
		public Default_blockContext default_block() {
			return getRuleContext(Default_blockContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(AMZ_syntParser.RCURLY, 0); }
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public Switch_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterSwitch_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitSwitch_block(this);
		}
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switch_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(SWITCH);
			setState(311);
			match(LPAREN);
			setState(312);
			expression(0);
			setState(313);
			match(RPAREN);
			setState(314);
			match(LCURLY);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(315);
				case_block();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			default_block();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(322);
				case_block();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(RCURLY);
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

	public static class Case_blockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AMZ_syntParser.CASE, 0); }
		public TerminalNode LPAREN() { return getToken(AMZ_syntParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AMZ_syntParser.RPAREN, 0); }
		public Command_blockContext command_block() {
			return getRuleContext(Command_blockContext.class,0);
		}
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterCase_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitCase_block(this);
		}
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_case_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(CASE);
			setState(331);
			match(LPAREN);
			setState(332);
			expression(0);
			setState(333);
			match(RPAREN);
			setState(334);
			command_block();
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

	public static class Default_blockContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(AMZ_syntParser.DEFAULT, 0); }
		public Command_blockContext command_block() {
			return getRuleContext(Command_blockContext.class,0);
		}
		public Default_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterDefault_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitDefault_block(this);
		}
	}

	public final Default_blockContext default_block() throws RecognitionException {
		Default_blockContext _localctx = new Default_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_default_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(DEFAULT);
			setState(337);
			command_block();
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

	public static class Function_blockContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AMZ_syntParser.LPAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AMZ_syntParser.RPAREN, 0); }
		public Command_blockContext command_block() {
			return getRuleContext(Command_blockContext.class,0);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitFunction_block(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			declaration();
			setState(340);
			match(LPAREN);
			setState(341);
			parameters();
			setState(342);
			match(RPAREN);
			setState(343);
			command_block();
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

	public static class ParametersContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AMZ_syntParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AMZ_syntParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT))) != 0)) {
				{
				setState(345);
				declaration();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(346);
					match(COMMA);
					setState(347);
					declaration();
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0166\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17{\n\17\3\17\7\17~\n"+
		"\17\f\17\16\17\u0081\13\17\3\17\3\17\7\17\u0085\n\17\f\17\16\17\u0088"+
		"\13\17\3\17\3\17\3\17\5\17\u008d\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u00a7\n\17\f\17\16\17\u00aa\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00b2\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\7\22\u00bc\n\22\f\22\16\22\u00bf\13\22\5\22\u00c1\n\22\3\23\3\23"+
		"\3\23\3\23\7\23\u00c7\n\23\f\23\16\23\u00ca\13\23\5\23\u00cc\n\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00d8\n\25\f\25\16"+
		"\25\u00db\13\25\5\25\u00dd\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00e5"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00f0\n\27\f\27"+
		"\16\27\u00f3\13\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00fb\n\27\5\27"+
		"\u00fd\n\27\3\30\3\30\3\30\3\30\5\30\u0103\n\30\3\31\3\31\7\31\u0107\n"+
		"\31\f\31\16\31\u010a\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\5\33\u0117\n\33\3\33\3\33\5\33\u011b\n\33\3\33\3\33\5\33\u011f"+
		"\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0130\n\34\f\34\16\34\u0133\13\34\3\34\3\34\5\34\u0137"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u013f\n\35\f\35\16\35\u0142\13"+
		"\35\3\35\3\35\7\35\u0146\n\35\f\35\16\35\u0149\13\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\7!\u015f"+
		"\n!\f!\16!\u0162\13!\5!\u0164\n!\3!\2\3\34\"\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\b\3\2&+\4\2\t\n\16\16\3\2\13"+
		"\r\3\2\t\n\3\2\3\6\3\2\7\b\2\u0174\2E\3\2\2\2\4P\3\2\2\2\6T\3\2\2\2\b"+
		"W\3\2\2\2\nY\3\2\2\2\f`\3\2\2\2\16d\3\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24"+
		"j\3\2\2\2\26l\3\2\2\2\30n\3\2\2\2\32p\3\2\2\2\34\u008c\3\2\2\2\36\u00b1"+
		"\3\2\2\2 \u00b3\3\2\2\2\"\u00c0\3\2\2\2$\u00c2\3\2\2\2&\u00cf\3\2\2\2"+
		"(\u00d3\3\2\2\2*\u00e4\3\2\2\2,\u00fc\3\2\2\2.\u0102\3\2\2\2\60\u0104"+
		"\3\2\2\2\62\u010d\3\2\2\2\64\u0113\3\2\2\2\66\u0123\3\2\2\28\u0138\3\2"+
		"\2\2:\u014c\3\2\2\2<\u0152\3\2\2\2>\u0155\3\2\2\2@\u0163\3\2\2\2BD\5\4"+
		"\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3\2\2\2GE\3\2\2\2HJ\5>"+
		" \2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\2"+
		"\2\3O\3\3\2\2\2PQ\7\34\2\2QR\7\62\2\2RS\7\30\2\2S\5\3\2\2\2TU\5\b\5\2"+
		"UV\5\n\6\2V\7\3\2\2\2WX\t\2\2\2X\t\3\2\2\2Y]\7\63\2\2Z\\\5\f\7\2[Z\3\2"+
		"\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\13\3\2\2\2_]\3\2\2\2`a\7\23\2\2a"+
		"b\7/\2\2bc\7\24\2\2c\r\3\2\2\2de\t\3\2\2e\17\3\2\2\2fg\t\4\2\2g\21\3\2"+
		"\2\2hi\t\5\2\2i\23\3\2\2\2jk\t\6\2\2k\25\3\2\2\2lm\t\7\2\2m\27\3\2\2\2"+
		"no\7\17\2\2o\31\3\2\2\2pq\7\20\2\2q\33\3\2\2\2rs\b\17\1\2st\7\25\2\2t"+
		"u\5\34\17\2uv\7\26\2\2v\u008d\3\2\2\2w{\5\36\20\2x{\7\63\2\2y{\5 \21\2"+
		"zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\177\3\2\2\2|~\5\f\7\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0086\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\7\32\2\2\u0083\u0085\5\n\6\2\u0084\u0082\3\2\2\2"+
		"\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008d"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5\16\b\2\u008a\u008b\5\34\17"+
		"\t\u008b\u008d\3\2\2\2\u008cr\3\2\2\2\u008cz\3\2\2\2\u008c\u0089\3\2\2"+
		"\2\u008d\u00a8\3\2\2\2\u008e\u008f\f\b\2\2\u008f\u0090\5\20\t\2\u0090"+
		"\u0091\5\34\17\t\u0091\u00a7\3\2\2\2\u0092\u0093\f\7\2\2\u0093\u0094\5"+
		"\22\n\2\u0094\u0095\5\34\17\b\u0095\u00a7\3\2\2\2\u0096\u0097\f\6\2\2"+
		"\u0097\u0098\5\24\13\2\u0098\u0099\5\34\17\7\u0099\u00a7\3\2\2\2\u009a"+
		"\u009b\f\5\2\2\u009b\u009c\5\26\f\2\u009c\u009d\5\34\17\6\u009d\u00a7"+
		"\3\2\2\2\u009e\u009f\f\4\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\5\34\17"+
		"\5\u00a1\u00a7\3\2\2\2\u00a2\u00a3\f\3\2\2\u00a3\u00a4\5\32\16\2\u00a4"+
		"\u00a5\5\34\17\4\u00a5\u00a7\3\2\2\2\u00a6\u008e\3\2\2\2\u00a6\u0092\3"+
		"\2\2\2\u00a6\u0096\3\2\2\2\u00a6\u009a\3\2\2\2\u00a6\u009e\3\2\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\35\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b2\7/\2\2\u00ac\u00b2"+
		"\7\62\2\2\u00ad\u00b2\5$\23\2\u00ae\u00b2\5(\25\2\u00af\u00b2\7\60\2\2"+
		"\u00b0\u00b2\7\61\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad"+
		"\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\37\3\2\2\2\u00b3\u00b4\7\63\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\5\""+
		"\22\2\u00b6\u00b7\7\26\2\2\u00b7!\3\2\2\2\u00b8\u00bd\5\34\17\2\u00b9"+
		"\u00ba\7\33\2\2\u00ba\u00bc\5\34\17\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1#\3\2\2\2"+
		"\u00c2\u00cb\7\21\2\2\u00c3\u00c8\5&\24\2\u00c4\u00c5\7\33\2\2\u00c5\u00c7"+
		"\5&\24\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00c3\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\22\2\2\u00ce"+
		"%\3\2\2\2\u00cf\u00d0\5\6\4\2\u00d0\u00d1\7\31\2\2\u00d1\u00d2\5\34\17"+
		"\2\u00d2\'\3\2\2\2\u00d3\u00dc\7\23\2\2\u00d4\u00d9\5\34\17\2\u00d5\u00d6"+
		"\7\33\2\2\u00d6\u00d8\5\34\17\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2"+
		"\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\7\24\2\2\u00df)\3\2\2\2\u00e0\u00e1\5,\27\2\u00e1\u00e2\7\30\2"+
		"\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\5.\30\2\u00e4\u00e0\3\2\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e5+\3\2\2\2\u00e6\u00fd\5\34\17\2\u00e7\u00e8\5\6\4\2\u00e8"+
		"\u00e9\7\27\2\2\u00e9\u00ea\5\34\17\2\u00ea\u00fd\3\2\2\2\u00eb\u00fd"+
		"\5\6\4\2\u00ec\u00f1\5\n\6\2\u00ed\u00ee\7\32\2\2\u00ee\u00f0\5\n\6\2"+
		"\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\27\2\2"+
		"\u00f5\u00f6\5\34\17\2\u00f6\u00fd\3\2\2\2\u00f7\u00fd\7$\2\2\u00f8\u00fa"+
		"\7%\2\2\u00f9\u00fb\5\34\17\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2"+
		"\u00fb\u00fd\3\2\2\2\u00fc\u00e6\3\2\2\2\u00fc\u00e7\3\2\2\2\u00fc\u00eb"+
		"\3\2\2\2\u00fc\u00ec\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd"+
		"-\3\2\2\2\u00fe\u0103\5\62\32\2\u00ff\u0103\5\66\34\2\u0100\u0103\5\64"+
		"\33\2\u0101\u0103\58\35\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103/\3\2\2\2\u0104\u0108\7\21\2\2"+
		"\u0105\u0107\5*\26\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\7\22\2\2\u010c\61\3\2\2\2\u010d\u010e\7\35\2\2\u010e\u010f\7\25"+
		"\2\2\u010f\u0110\5\34\17\2\u0110\u0111\7\26\2\2\u0111\u0112\5\60\31\2"+
		"\u0112\63\3\2\2\2\u0113\u0114\7\36\2\2\u0114\u0116\7\25\2\2\u0115\u0117"+
		"\5,\27\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011a\7\30\2\2\u0119\u011b\5\34\17\2\u011a\u0119\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\7\30\2\2\u011d\u011f\5,\27\2"+
		"\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\7\26\2\2\u0121\u0122\5\60\31\2\u0122\65\3\2\2\2\u0123\u0124\7\"\2\2\u0124"+
		"\u0125\7\25\2\2\u0125\u0126\5\34\17\2\u0126\u0127\7\26\2\2\u0127\u0131"+
		"\5\60\31\2\u0128\u0129\7#\2\2\u0129\u012a\7\"\2\2\u012a\u012b\7\25\2\2"+
		"\u012b\u012c\5\34\17\2\u012c\u012d\7\26\2\2\u012d\u012e\5\60\31\2\u012e"+
		"\u0130\3\2\2\2\u012f\u0128\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0136\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0135\7#\2\2\u0135\u0137\5\60\31\2\u0136\u0134\3\2\2\2\u0136\u0137\3"+
		"\2\2\2\u0137\67\3\2\2\2\u0138\u0139\7\37\2\2\u0139\u013a\7\25\2\2\u013a"+
		"\u013b\5\34\17\2\u013b\u013c\7\26\2\2\u013c\u0140\7\21\2\2\u013d\u013f"+
		"\5:\36\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0147\5<"+
		"\37\2\u0144\u0146\5:\36\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u014b\7\22\2\2\u014b9\3\2\2\2\u014c\u014d\7 \2\2\u014d\u014e"+
		"\7\25\2\2\u014e\u014f\5\34\17\2\u014f\u0150\7\26\2\2\u0150\u0151\5\60"+
		"\31\2\u0151;\3\2\2\2\u0152\u0153\7!\2\2\u0153\u0154\5\60\31\2\u0154=\3"+
		"\2\2\2\u0155\u0156\5\6\4\2\u0156\u0157\7\25\2\2\u0157\u0158\5@!\2\u0158"+
		"\u0159\7\26\2\2\u0159\u015a\5\60\31\2\u015a?\3\2\2\2\u015b\u0160\5\6\4"+
		"\2\u015c\u015d\7\33\2\2\u015d\u015f\5\6\4\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u015b\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"A\3\2\2\2!EK]z\177\u0086\u008c\u00a6\u00a8\u00b1\u00bd\u00c0\u00c8\u00cb"+
		"\u00d9\u00dc\u00e4\u00f1\u00fa\u00fc\u0102\u0108\u0116\u011a\u011e\u0131"+
		"\u0136\u0140\u0147\u0160\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}