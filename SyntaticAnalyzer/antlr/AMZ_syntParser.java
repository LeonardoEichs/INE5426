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
		DOUBLE_LITERAL=45, INTEGER=46, TRUE=47, FALSE=48, STRING_LITERAL=49, ID=50, 
		ESCAPE_CHAR=51;
	public static final int
		RULE_eval = 0, RULE_import_file = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_array_position = 4, RULE_unary_arithm_operator = 5, RULE_unary_bool_operator = 6, 
		RULE_arithmetic_binary_op_higher_prec = 7, RULE_arithmetic_binary_op_lower_prec = 8, 
		RULE_comparison_op_higher_prec = 9, RULE_comparison_op_lower_prec = 10, 
		RULE_logic_binary_op_higher_prec = 11, RULE_logic_binary_op_lower_prec = 12, 
		RULE_expression = 13, RULE_value = 14, RULE_boolean_value = 15, RULE_object_id = 16, 
		RULE_function_call = 17, RULE_arguments = 18, RULE_object_literal = 19, 
		RULE_object_element = 20, RULE_array_literal = 21, RULE_command = 22, 
		RULE_simple_command = 23, RULE_block_command = 24, RULE_command_block = 25, 
		RULE_while_block = 26, RULE_for_block = 27, RULE_if_block = 28, RULE_switch_block = 29, 
		RULE_case_block = 30, RULE_default_block = 31, RULE_function_block = 32, 
		RULE_parameters = 33;
	public static final String[] ruleNames = {
		"eval", "import_file", "declaration", "type", "array_position", "unary_arithm_operator", 
		"unary_bool_operator", "arithmetic_binary_op_higher_prec", "arithmetic_binary_op_lower_prec", 
		"comparison_op_higher_prec", "comparison_op_lower_prec", "logic_binary_op_higher_prec", 
		"logic_binary_op_lower_prec", "expression", "value", "boolean_value", 
		"object_id", "function_call", "arguments", "object_literal", "object_element", 
		"array_literal", "command", "simple_command", "block_command", "command_block", 
		"while_block", "for_block", "if_block", "switch_block", "case_block", 
		"default_block", "function_block", "parameters"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'!'", "'&&'", "'||'", "'{'", "'}'", "'['", "']'", "'('", 
		"')'", "'='", "';'", "':'", "'.'", "','", "'#import'", "'while'", "'for'", 
		"'switch'", "'case'", "'default'", "'if'", "'else'", "'break'", "'return'", 
		"'int'", "'boolean'", "'string'", "'double'", "'void'", "'object'", null, 
		null, null, null, null, "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GREATER", "GREATEREQUAL", "LESS", "LESSEQUAL", "EQUAL", "NOTEQUAL", 
		"ADD", "MINUS", "STAR", "SLASH", "MOD", "NOT", "AND", "OR", "LCURLY", 
		"RCURLY", "LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "EQUALS", "SEMICO", 
		"COLON", "DOT", "COMMA", "IMPORT", "WHILE", "FOR", "SWITCH", "CASE", "DEFAULT", 
		"IF", "ELSE", "BREAK", "RETURN", "INT", "BOOLEAN", "STRING", "DOUBLE", 
		"VOID", "OBJECT", "WHITESPACE", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
		"DOUBLE_LITERAL", "INTEGER", "TRUE", "FALSE", "STRING_LITERAL", "ID", 
		"ESCAPE_CHAR"
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(68);
				import_file();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT))) != 0)) {
				{
				{
				setState(74);
				function_block();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
			setState(82);
			match(IMPORT);
			setState(83);
			match(STRING_LITERAL);
			setState(84);
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
		public TerminalNode ID() { return getToken(AMZ_syntParser.ID, 0); }
		public Array_positionContext array_position() {
			return getRuleContext(Array_positionContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			type();
			setState(87);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(88);
				array_position();
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
			setState(91);
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

	public static class Array_positionContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(AMZ_syntParser.LSQUARE, 0); }
		public TerminalNode INTEGER() { return getToken(AMZ_syntParser.INTEGER, 0); }
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
		enterRule(_localctx, 8, RULE_array_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LSQUARE);
			setState(94);
			match(INTEGER);
			setState(95);
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

	public static class Unary_arithm_operatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(AMZ_syntParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(AMZ_syntParser.MINUS, 0); }
		public Unary_arithm_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_arithm_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterUnary_arithm_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitUnary_arithm_operator(this);
		}
	}

	public final Unary_arithm_operatorContext unary_arithm_operator() throws RecognitionException {
		Unary_arithm_operatorContext _localctx = new Unary_arithm_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unary_arithm_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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

	public static class Unary_bool_operatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(AMZ_syntParser.NOT, 0); }
		public Unary_bool_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_bool_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterUnary_bool_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitUnary_bool_operator(this);
		}
	}

	public final Unary_bool_operatorContext unary_bool_operator() throws RecognitionException {
		Unary_bool_operatorContext _localctx = new Unary_bool_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unary_bool_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(NOT);
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
			setState(101);
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
			setState(103);
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
			setState(105);
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
			setState(107);
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
			setState(109);
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
			setState(111);
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
		public Array_positionContext array_position() {
			return getRuleContext(Array_positionContext.class,0);
		}
		public Object_idContext object_id() {
			return getRuleContext(Object_idContext.class,0);
		}
		public Unary_arithm_operatorContext unary_arithm_operator() {
			return getRuleContext(Unary_arithm_operatorContext.class,0);
		}
		public Unary_bool_operatorContext unary_bool_operator() {
			return getRuleContext(Unary_bool_operatorContext.class,0);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(114);
				match(LPAREN);
				setState(115);
				expression(0);
				setState(116);
				match(RPAREN);
				}
				break;
			case LCURLY:
			case LSQUARE:
			case DOUBLE_LITERAL:
			case INTEGER:
			case TRUE:
			case FALSE:
			case STRING_LITERAL:
			case ID:
				{
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(118);
					value();
					}
					break;
				case 2:
					{
					setState(119);
					match(ID);
					}
					break;
				case 3:
					{
					setState(120);
					function_call();
					}
					break;
				}
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(123);
					array_position();
					}
					break;
				}
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(126);
					object_id();
					}
					break;
				}
				}
				break;
			case ADD:
			case MINUS:
				{
				setState(129);
				unary_arithm_operator();
				setState(130);
				expression(8);
				}
				break;
			case NOT:
				{
				setState(132);
				unary_bool_operator();
				setState(133);
				expression(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(138);
						arithmetic_binary_op_higher_prec();
						setState(139);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(142);
						arithmetic_binary_op_lower_prec();
						setState(143);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(146);
						comparison_op_higher_prec();
						setState(147);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(150);
						comparison_op_lower_prec();
						setState(151);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(154);
						logic_binary_op_higher_prec();
						setState(155);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(158);
						logic_binary_op_lower_prec();
						setState(159);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(165);
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
		public TerminalNode DOUBLE_LITERAL() { return getToken(AMZ_syntParser.DOUBLE_LITERAL, 0); }
		public TerminalNode INTEGER() { return getToken(AMZ_syntParser.INTEGER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AMZ_syntParser.STRING_LITERAL, 0); }
		public Object_literalContext object_literal() {
			return getRuleContext(Object_literalContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Boolean_valueContext boolean_value() {
			return getRuleContext(Boolean_valueContext.class,0);
		}
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(DOUBLE_LITERAL);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(INTEGER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(STRING_LITERAL);
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				object_literal();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				array_literal();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				boolean_value();
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

	public static class Boolean_valueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AMZ_syntParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AMZ_syntParser.FALSE, 0); }
		public Boolean_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterBoolean_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitBoolean_value(this);
		}
	}

	public final Boolean_valueContext boolean_value() throws RecognitionException {
		Boolean_valueContext _localctx = new Boolean_valueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolean_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class Object_idContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AMZ_syntParser.DOT, 0); }
		public TerminalNode ID() { return getToken(AMZ_syntParser.ID, 0); }
		public Array_positionContext array_position() {
			return getRuleContext(Array_positionContext.class,0);
		}
		public Object_idContext object_id() {
			return getRuleContext(Object_idContext.class,0);
		}
		public Object_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).enterObject_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AMZ_syntListener ) ((AMZ_syntListener)listener).exitObject_id(this);
		}
	}

	public final Object_idContext object_id() throws RecognitionException {
		Object_idContext _localctx = new Object_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_object_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(DOT);
			setState(177);
			match(ID);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(178);
				array_position();
				}
				break;
			}
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(181);
				object_id();
				}
				break;
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
		enterRule(_localctx, 34, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			{
			setState(185);
			match(LPAREN);
			setState(186);
			arguments();
			setState(187);
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
		enterRule(_localctx, 36, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << DOUBLE_LITERAL) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(189);
				expression(0);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(190);
					match(COMMA);
					setState(191);
					expression(0);
					}
					}
					setState(196);
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
		enterRule(_localctx, 38, RULE_object_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(LCURLY);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT))) != 0)) {
				{
				setState(200);
				object_element();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(201);
					match(COMMA);
					setState(202);
					object_element();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(210);
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
		enterRule(_localctx, 40, RULE_object_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			declaration();
			setState(213);
			match(COLON);
			setState(214);
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
		enterRule(_localctx, 42, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LSQUARE);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << DOUBLE_LITERAL) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(217);
				expression(0);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(218);
					match(COMMA);
					setState(219);
					expression(0);
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(227);
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
		enterRule(_localctx, 44, RULE_command);
		try {
			setState(233);
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
			case DOUBLE_LITERAL:
			case INTEGER:
			case TRUE:
			case FALSE:
			case STRING_LITERAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				simple_command();
				setState(230);
				match(SEMICO);
				}
				break;
			case WHILE:
			case FOR:
			case SWITCH:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
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
		public TerminalNode ID() { return getToken(AMZ_syntParser.ID, 0); }
		public Array_positionContext array_position() {
			return getRuleContext(Array_positionContext.class,0);
		}
		public Object_idContext object_id() {
			return getRuleContext(Object_idContext.class,0);
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
		enterRule(_localctx, 46, RULE_simple_command);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				declaration();
				setState(237);
				match(EQUALS);
				setState(238);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(ID);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(242);
					array_position();
					}
				}

				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(245);
					object_id();
					}
				}

				setState(248);
				match(EQUALS);
				setState(249);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(BREAK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(RETURN);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << DOUBLE_LITERAL) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(252);
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
		enterRule(_localctx, 48, RULE_block_command);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				while_block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				if_block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				for_block();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
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
		enterRule(_localctx, 50, RULE_command_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LCURLY);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << IF) | (1L << BREAK) | (1L << RETURN) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT) | (1L << DOUBLE_LITERAL) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(264);
				command();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
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
		enterRule(_localctx, 52, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(WHILE);
			setState(273);
			match(LPAREN);
			setState(274);
			expression(0);
			setState(275);
			match(RPAREN);
			setState(276);
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
		enterRule(_localctx, 54, RULE_for_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(FOR);
			setState(279);
			match(LPAREN);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << BREAK) | (1L << RETURN) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT) | (1L << DOUBLE_LITERAL) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(280);
				simple_command();
				}
			}

			setState(283);
			match(SEMICO);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << DOUBLE_LITERAL) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(284);
				expression(0);
				}
			}

			setState(287);
			match(SEMICO);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << BREAK) | (1L << RETURN) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT) | (1L << DOUBLE_LITERAL) | (1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(288);
				simple_command();
				}
			}

			setState(291);
			match(RPAREN);
			setState(292);
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
		enterRule(_localctx, 56, RULE_if_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(IF);
			setState(295);
			match(LPAREN);
			setState(296);
			expression(0);
			setState(297);
			match(RPAREN);
			setState(298);
			command_block();
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					match(ELSE);
					setState(300);
					match(IF);
					setState(301);
					match(LPAREN);
					setState(302);
					expression(0);
					setState(303);
					match(RPAREN);
					setState(304);
					command_block();
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(311);
				match(ELSE);
				setState(312);
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
		enterRule(_localctx, 58, RULE_switch_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(SWITCH);
			setState(316);
			match(LPAREN);
			setState(317);
			expression(0);
			setState(318);
			match(RPAREN);
			setState(319);
			match(LCURLY);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(320);
				case_block();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			default_block();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(327);
				case_block();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
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
		enterRule(_localctx, 60, RULE_case_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(CASE);
			setState(336);
			match(LPAREN);
			setState(337);
			expression(0);
			setState(338);
			match(RPAREN);
			setState(339);
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
		enterRule(_localctx, 62, RULE_default_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(DEFAULT);
			setState(342);
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
		enterRule(_localctx, 64, RULE_function_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			declaration();
			setState(345);
			match(LPAREN);
			setState(346);
			parameters();
			setState(347);
			match(RPAREN);
			setState(348);
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
		enterRule(_localctx, 66, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT))) != 0)) {
				{
				setState(350);
				declaration();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(351);
					match(COMMA);
					setState(352);
					declaration();
					}
					}
					setState(357);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u016b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f\2\16\2Q\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\\\n\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17|\n\17\3\17\5\17\177\n\17"+
		"\3\17\5\17\u0082\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008a\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a4\n\17\f\17"+
		"\16\17\u00a7\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00af\n\20\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u00b6\n\22\3\22\5\22\u00b9\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\7\24\u00c3\n\24\f\24\16\24\u00c6\13\24\5"+
		"\24\u00c8\n\24\3\25\3\25\3\25\3\25\7\25\u00ce\n\25\f\25\16\25\u00d1\13"+
		"\25\5\25\u00d3\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\7\27\u00df\n\27\f\27\16\27\u00e2\13\27\5\27\u00e4\n\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\5\30\u00ec\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00f6\n\31\3\31\5\31\u00f9\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0100"+
		"\n\31\5\31\u0102\n\31\3\32\3\32\3\32\3\32\5\32\u0108\n\32\3\33\3\33\7"+
		"\33\u010c\n\33\f\33\16\33\u010f\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\5\35\u011c\n\35\3\35\3\35\5\35\u0120\n\35\3\35"+
		"\3\35\5\35\u0124\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u0135\n\36\f\36\16\36\u0138\13\36\3\36"+
		"\3\36\5\36\u013c\n\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0144\n\37\f"+
		"\37\16\37\u0147\13\37\3\37\3\37\7\37\u014b\n\37\f\37\16\37\u014e\13\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\7#\u0164\n#\f#\16#\u0167\13#\5#\u0169\n#\3#\2\3\34$\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\b\3\2&+\3\2\t\n\3"+
		"\2\13\r\3\2\3\6\3\2\7\b\3\2\61\62\2\u017b\2I\3\2\2\2\4T\3\2\2\2\6X\3\2"+
		"\2\2\b]\3\2\2\2\n_\3\2\2\2\fc\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2\22i\3\2"+
		"\2\2\24k\3\2\2\2\26m\3\2\2\2\30o\3\2\2\2\32q\3\2\2\2\34\u0089\3\2\2\2"+
		"\36\u00ae\3\2\2\2 \u00b0\3\2\2\2\"\u00b2\3\2\2\2$\u00ba\3\2\2\2&\u00c7"+
		"\3\2\2\2(\u00c9\3\2\2\2*\u00d6\3\2\2\2,\u00da\3\2\2\2.\u00eb\3\2\2\2\60"+
		"\u0101\3\2\2\2\62\u0107\3\2\2\2\64\u0109\3\2\2\2\66\u0112\3\2\2\28\u0118"+
		"\3\2\2\2:\u0128\3\2\2\2<\u013d\3\2\2\2>\u0151\3\2\2\2@\u0157\3\2\2\2B"+
		"\u015a\3\2\2\2D\u0168\3\2\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2"+
		"IJ\3\2\2\2JO\3\2\2\2KI\3\2\2\2LN\5B\"\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TU\7\34\2\2UV\7\63"+
		"\2\2VW\7\30\2\2W\5\3\2\2\2XY\5\b\5\2Y[\7\64\2\2Z\\\5\n\6\2[Z\3\2\2\2["+
		"\\\3\2\2\2\\\7\3\2\2\2]^\t\2\2\2^\t\3\2\2\2_`\7\23\2\2`a\7\60\2\2ab\7"+
		"\24\2\2b\13\3\2\2\2cd\t\3\2\2d\r\3\2\2\2ef\7\16\2\2f\17\3\2\2\2gh\t\4"+
		"\2\2h\21\3\2\2\2ij\t\3\2\2j\23\3\2\2\2kl\t\5\2\2l\25\3\2\2\2mn\t\6\2\2"+
		"n\27\3\2\2\2op\7\17\2\2p\31\3\2\2\2qr\7\20\2\2r\33\3\2\2\2st\b\17\1\2"+
		"tu\7\25\2\2uv\5\34\17\2vw\7\26\2\2w\u008a\3\2\2\2x|\5\36\20\2y|\7\64\2"+
		"\2z|\5$\23\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|~\3\2\2\2}\177\5\n\6\2~}\3"+
		"\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080\u0082\5\"\22\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u008a\3\2\2\2\u0083\u0084\5\f\7\2\u0084"+
		"\u0085\5\34\17\n\u0085\u008a\3\2\2\2\u0086\u0087\5\16\b\2\u0087\u0088"+
		"\5\34\17\t\u0088\u008a\3\2\2\2\u0089s\3\2\2\2\u0089{\3\2\2\2\u0089\u0083"+
		"\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u00a5\3\2\2\2\u008b\u008c\f\b\2\2\u008c"+
		"\u008d\5\20\t\2\u008d\u008e\5\34\17\t\u008e\u00a4\3\2\2\2\u008f\u0090"+
		"\f\7\2\2\u0090\u0091\5\22\n\2\u0091\u0092\5\34\17\b\u0092\u00a4\3\2\2"+
		"\2\u0093\u0094\f\6\2\2\u0094\u0095\5\24\13\2\u0095\u0096\5\34\17\7\u0096"+
		"\u00a4\3\2\2\2\u0097\u0098\f\5\2\2\u0098\u0099\5\26\f\2\u0099\u009a\5"+
		"\34\17\6\u009a\u00a4\3\2\2\2\u009b\u009c\f\4\2\2\u009c\u009d\5\30\r\2"+
		"\u009d\u009e\5\34\17\5\u009e\u00a4\3\2\2\2\u009f\u00a0\f\3\2\2\u00a0\u00a1"+
		"\5\32\16\2\u00a1\u00a2\5\34\17\4\u00a2\u00a4\3\2\2\2\u00a3\u008b\3\2\2"+
		"\2\u00a3\u008f\3\2\2\2\u00a3\u0093\3\2\2\2\u00a3\u0097\3\2\2\2\u00a3\u009b"+
		"\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\35\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00af\7/\2\2"+
		"\u00a9\u00af\7\60\2\2\u00aa\u00af\7\63\2\2\u00ab\u00af\5(\25\2\u00ac\u00af"+
		"\5,\27\2\u00ad\u00af\5 \21\2\u00ae\u00a8\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae"+
		"\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\37\3\2\2\2\u00b0\u00b1\t\7\2\2\u00b1!\3\2\2\2\u00b2\u00b3\7"+
		"\32\2\2\u00b3\u00b5\7\64\2\2\u00b4\u00b6\5\n\6\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\5\"\22\2\u00b8\u00b7\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9#\3\2\2\2\u00ba\u00bb\7\64\2\2\u00bb\u00bc"+
		"\7\25\2\2\u00bc\u00bd\5&\24\2\u00bd\u00be\7\26\2\2\u00be%\3\2\2\2\u00bf"+
		"\u00c4\5\34\17\2\u00c0\u00c1\7\33\2\2\u00c1\u00c3\5\34\17\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\'\3\2\2\2\u00c9\u00d2\7\21\2\2\u00ca\u00cf\5*\26\2\u00cb\u00cc"+
		"\7\33\2\2\u00cc\u00ce\5*\26\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\7\22\2\2\u00d5)\3\2\2\2\u00d6\u00d7\5\6\4\2\u00d7\u00d8\7\31\2"+
		"\2\u00d8\u00d9\5\34\17\2\u00d9+\3\2\2\2\u00da\u00e3\7\23\2\2\u00db\u00e0"+
		"\5\34\17\2\u00dc\u00dd\7\33\2\2\u00dd\u00df\5\34\17\2\u00de\u00dc\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\24\2\2\u00e6-\3\2\2\2\u00e7\u00e8"+
		"\5\60\31\2\u00e8\u00e9\7\30\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00ec\5\62\32"+
		"\2\u00eb\u00e7\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec/\3\2\2\2\u00ed\u0102"+
		"\5\34\17\2\u00ee\u00ef\5\6\4\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\5\34\17"+
		"\2\u00f1\u0102\3\2\2\2\u00f2\u0102\5\6\4\2\u00f3\u00f5\7\64\2\2\u00f4"+
		"\u00f6\5\n\6\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00f9\5\"\22\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\7\27\2\2\u00fb\u0102\5\34\17\2\u00fc\u0102"+
		"\7$\2\2\u00fd\u00ff\7%\2\2\u00fe\u0100\5\34\17\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ed\3\2\2\2\u0101\u00ee\3\2"+
		"\2\2\u0101\u00f2\3\2\2\2\u0101\u00f3\3\2\2\2\u0101\u00fc\3\2\2\2\u0101"+
		"\u00fd\3\2\2\2\u0102\61\3\2\2\2\u0103\u0108\5\66\34\2\u0104\u0108\5:\36"+
		"\2\u0105\u0108\58\35\2\u0106\u0108\5<\37\2\u0107\u0103\3\2\2\2\u0107\u0104"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\63\3\2\2\2\u0109"+
		"\u010d\7\21\2\2\u010a\u010c\5.\30\2\u010b\u010a\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7\22\2\2\u0111\65\3\2\2\2\u0112\u0113\7\35"+
		"\2\2\u0113\u0114\7\25\2\2\u0114\u0115\5\34\17\2\u0115\u0116\7\26\2\2\u0116"+
		"\u0117\5\64\33\2\u0117\67\3\2\2\2\u0118\u0119\7\36\2\2\u0119\u011b\7\25"+
		"\2\2\u011a\u011c\5\60\31\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\7\30\2\2\u011e\u0120\5\34\17\2\u011f\u011e"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\7\30\2\2"+
		"\u0122\u0124\5\60\31\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\7\26\2\2\u0126\u0127\5\64\33\2\u01279\3\2\2\2\u0128"+
		"\u0129\7\"\2\2\u0129\u012a\7\25\2\2\u012a\u012b\5\34\17\2\u012b\u012c"+
		"\7\26\2\2\u012c\u0136\5\64\33\2\u012d\u012e\7#\2\2\u012e\u012f\7\"\2\2"+
		"\u012f\u0130\7\25\2\2\u0130\u0131\5\34\17\2\u0131\u0132\7\26\2\2\u0132"+
		"\u0133\5\64\33\2\u0133\u0135\3\2\2\2\u0134\u012d\3\2\2\2\u0135\u0138\3"+
		"\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013b\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\7#\2\2\u013a\u013c\5\64\33\2\u013b\u0139\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013c;\3\2\2\2\u013d\u013e\7\37\2\2\u013e\u013f"+
		"\7\25\2\2\u013f\u0140\5\34\17\2\u0140\u0141\7\26\2\2\u0141\u0145\7\21"+
		"\2\2\u0142\u0144\5> \2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u014c\5@!\2\u0149\u014b\5> \2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2"+
		"\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0150\7\22\2\2\u0150=\3\2\2\2\u0151\u0152\7 \2\2\u0152"+
		"\u0153\7\25\2\2\u0153\u0154\5\34\17\2\u0154\u0155\7\26\2\2\u0155\u0156"+
		"\5\64\33\2\u0156?\3\2\2\2\u0157\u0158\7!\2\2\u0158\u0159\5\64\33\2\u0159"+
		"A\3\2\2\2\u015a\u015b\5\6\4\2\u015b\u015c\7\25\2\2\u015c\u015d\5D#\2\u015d"+
		"\u015e\7\26\2\2\u015e\u015f\5\64\33\2\u015fC\3\2\2\2\u0160\u0165\5\6\4"+
		"\2\u0161\u0162\7\33\2\2\u0162\u0164\5\6\4\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u0160\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"E\3\2\2\2$IO[{~\u0081\u0089\u00a3\u00a5\u00ae\u00b5\u00b8\u00c4\u00c7"+
		"\u00cf\u00d2\u00e0\u00e3\u00eb\u00f5\u00f8\u00ff\u0101\u0107\u010d\u011b"+
		"\u011f\u0123\u0136\u013b\u0145\u014c\u0165\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}