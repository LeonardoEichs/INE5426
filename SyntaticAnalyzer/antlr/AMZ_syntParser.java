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
		DOT=24, COMMA=25, WHILE=26, FOR=27, SWITCH=28, CASE=29, DEFAULT=30, IF=31, 
		ELSE=32, BREAK=33, RETURN=34, INT=35, BOOLEAN=36, STRING=37, DOUBLE=38, 
		VOID=39, OBJECT=40, WHITESPACE=41, SINGLE_LINE_COMMENT=42, MULTI_LINE_COMMENT=43, 
		NUMBER=44, TRUE=45, FALSE=46, STRING_LITERAL=47, ID=48, ESCAPE_CHAR=49;
	public static final int
		RULE_eval = 0, RULE_declaration = 1, RULE_type = 2, RULE_id_optional_array = 3, 
		RULE_array_position = 4, RULE_unary_operator = 5, RULE_arithmetic_binary_op_higher_prec = 6, 
		RULE_arithmetic_binary_op_lower_prec = 7, RULE_comparison_op_higher_prec = 8, 
		RULE_comparison_op_lower_prec = 9, RULE_logic_binary_op_higher_prec = 10, 
		RULE_logic_binary_op_lower_prec = 11, RULE_expression = 12, RULE_value = 13, 
		RULE_function_call = 14, RULE_arguments = 15, RULE_object_literal = 16, 
		RULE_object_element = 17, RULE_array_literal = 18, RULE_command = 19, 
		RULE_simple_command = 20, RULE_block_command = 21, RULE_command_block = 22, 
		RULE_while_block = 23, RULE_for_block = 24, RULE_if_block = 25, RULE_switch_block = 26, 
		RULE_function_block = 27, RULE_parameters = 28;
	public static final String[] ruleNames = {
		"eval", "declaration", "type", "id_optional_array", "array_position", 
		"unary_operator", "arithmetic_binary_op_higher_prec", "arithmetic_binary_op_lower_prec", 
		"comparison_op_higher_prec", "comparison_op_lower_prec", "logic_binary_op_higher_prec", 
		"logic_binary_op_lower_prec", "expression", "value", "function_call", 
		"arguments", "object_literal", "object_element", "array_literal", "command", 
		"simple_command", "block_command", "command_block", "while_block", "for_block", 
		"if_block", "switch_block", "function_block", "parameters"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'!'", "'&&'", "'||'", "'{'", "'}'", "'['", "']'", "'('", 
		"')'", "'='", "';'", "':'", "'.'", "','", "'while'", "'for'", "'switch'", 
		"'case'", "'default'", "'if'", "'else'", "'break'", "'return'", "'int'", 
		null, "'string'", "'double'", "'void'", "'object'", null, null, null, 
		null, "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "GREATER", "GREATEREQUAL", "LESS", "LESSEQUAL", "EQUAL", "NOTEQUAL", 
		"ADD", "MINUS", "STAR", "SLASH", "MOD", "NOT", "AND", "OR", "LCURLY", 
		"RCURLY", "LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "EQUALS", "SEMICO", 
		"COLON", "DOT", "COMMA", "WHILE", "FOR", "SWITCH", "CASE", "DEFAULT", 
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT))) != 0)) {
				{
				{
				setState(58);
				function_block();
				}
				}
				setState(63);
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
		enterRule(_localctx, 2, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			type();
			setState(65);
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
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
		enterRule(_localctx, 6, RULE_id_optional_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					array_position();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		enterRule(_localctx, 8, RULE_array_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LSQUARE);
			setState(77);
			match(NUMBER);
			setState(78);
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
		enterRule(_localctx, 10, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
		enterRule(_localctx, 12, RULE_arithmetic_binary_op_higher_prec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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
		enterRule(_localctx, 14, RULE_arithmetic_binary_op_lower_prec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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
		enterRule(_localctx, 16, RULE_comparison_op_higher_prec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 18, RULE_comparison_op_lower_prec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		enterRule(_localctx, 20, RULE_logic_binary_op_higher_prec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		enterRule(_localctx, 22, RULE_logic_binary_op_lower_prec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(95);
				match(LPAREN);
				setState(96);
				expression(0);
				setState(97);
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
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(99);
					value();
					}
					break;
				case 2:
					{
					setState(100);
					match(ID);
					}
					break;
				case 3:
					{
					setState(101);
					function_call();
					}
					break;
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(104);
						array_position();
						}
						} 
					}
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						match(DOT);
						setState(111);
						id_optional_array();
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case ADD:
			case MINUS:
			case NOT:
				{
				setState(117);
				unary_operator();
				setState(118);
				expression(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(123);
						arithmetic_binary_op_higher_prec();
						setState(124);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(127);
						arithmetic_binary_op_lower_prec();
						setState(128);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(131);
						comparison_op_higher_prec();
						setState(132);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(135);
						comparison_op_lower_prec();
						setState(136);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(139);
						logic_binary_op_higher_prec();
						setState(140);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(143);
						logic_binary_op_lower_prec();
						setState(144);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(NUMBER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(STRING_LITERAL);
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				object_literal();
				}
				break;
			case LSQUARE:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				array_literal();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
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
		enterRule(_localctx, 28, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ID);
			{
			setState(160);
			match(LPAREN);
			setState(161);
			arguments();
			setState(162);
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
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(164);
				expression(0);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(165);
					match(COMMA);
					setState(166);
					expression(0);
					}
					}
					setState(171);
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
		enterRule(_localctx, 32, RULE_object_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LCURLY);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT))) != 0)) {
				{
				setState(175);
				object_element();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(176);
					match(COMMA);
					setState(177);
					object_element();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(185);
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
		enterRule(_localctx, 34, RULE_object_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			declaration();
			setState(188);
			match(COLON);
			setState(189);
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
		enterRule(_localctx, 36, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LSQUARE);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(192);
				expression(0);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(193);
					match(COMMA);
					setState(194);
					expression(0);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(202);
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
		enterRule(_localctx, 38, RULE_command);
		try {
			setState(208);
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
				setState(204);
				simple_command();
				setState(205);
				match(SEMICO);
				}
				break;
			case WHILE:
			case FOR:
			case SWITCH:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
		public Id_optional_arrayContext id_optional_array() {
			return getRuleContext(Id_optional_arrayContext.class,0);
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
		enterRule(_localctx, 40, RULE_simple_command);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				declaration();
				setState(212);
				match(EQUALS);
				setState(213);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				id_optional_array();
				setState(217);
				match(EQUALS);
				setState(218);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(BREAK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				match(RETURN);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(222);
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
		enterRule(_localctx, 42, RULE_block_command);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				while_block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				if_block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				for_block();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
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
		enterRule(_localctx, 44, RULE_command_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LCURLY);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << WHILE) | (1L << FOR) | (1L << SWITCH) | (1L << IF) | (1L << BREAK) | (1L << RETURN) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(234);
				command();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
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
		enterRule(_localctx, 46, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(WHILE);
			setState(243);
			match(LPAREN);
			setState(244);
			expression(0);
			setState(245);
			match(RPAREN);
			setState(246);
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
		enterRule(_localctx, 48, RULE_for_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(FOR);
			setState(249);
			match(LPAREN);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << BREAK) | (1L << RETURN) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(250);
				simple_command();
				}
			}

			setState(253);
			match(SEMICO);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(254);
				expression(0);
				}
			}

			setState(257);
			match(SEMICO);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT) | (1L << LCURLY) | (1L << LSQUARE) | (1L << LPAREN) | (1L << BREAK) | (1L << RETURN) | (1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(258);
				simple_command();
				}
			}

			setState(261);
			match(RPAREN);
			setState(262);
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
		enterRule(_localctx, 50, RULE_if_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(IF);
			setState(265);
			match(LPAREN);
			setState(266);
			expression(0);
			setState(267);
			match(RPAREN);
			setState(268);
			command_block();
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					match(ELSE);
					setState(270);
					match(IF);
					setState(271);
					match(LPAREN);
					setState(272);
					expression(0);
					setState(273);
					match(RPAREN);
					setState(274);
					command_block();
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(281);
				match(ELSE);
				setState(282);
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
		enterRule(_localctx, 52, RULE_switch_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(SWITCH);
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
		enterRule(_localctx, 54, RULE_function_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			declaration();
			setState(288);
			match(LPAREN);
			setState(289);
			parameters();
			setState(290);
			match(RPAREN);
			setState(291);
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
		enterRule(_localctx, 56, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DOUBLE) | (1L << VOID) | (1L << OBJECT))) != 0)) {
				{
				setState(293);
				declaration();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(294);
					match(COMMA);
					setState(295);
					declaration();
					}
					}
					setState(300);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0132\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16i\n\16\3\16\7\16l\n\16\f\16\16"+
		"\16o\13\16\3\16\3\16\7\16s\n\16\f\16\16\16v\13\16\3\16\3\16\3\16\5\16"+
		"{\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0095\n\16"+
		"\f\16\16\16\u0098\13\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a0\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00aa\n\21\f\21\16\21\u00ad"+
		"\13\21\5\21\u00af\n\21\3\22\3\22\3\22\3\22\7\22\u00b5\n\22\f\22\16\22"+
		"\u00b8\13\22\5\22\u00ba\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\7\24\u00c6\n\24\f\24\16\24\u00c9\13\24\5\24\u00cb\n\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\5\25\u00d3\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e2\n\26\5\26\u00e4\n\26\3"+
		"\27\3\27\3\27\3\27\5\27\u00ea\n\27\3\30\3\30\7\30\u00ee\n\30\f\30\16\30"+
		"\u00f1\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5"+
		"\32\u00fe\n\32\3\32\3\32\5\32\u0102\n\32\3\32\3\32\5\32\u0106\n\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u0117\n\33\f\33\16\33\u011a\13\33\3\33\3\33\5\33\u011e\n\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u012b\n\36\f\36"+
		"\16\36\u012e\13\36\5\36\u0130\n\36\3\36\2\3\32\37\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\b\3\2%*\4\2\t\n\16\16\3\2"+
		"\13\r\3\2\t\n\3\2\3\6\3\2\7\b\2\u013f\2?\3\2\2\2\4B\3\2\2\2\6E\3\2\2\2"+
		"\bG\3\2\2\2\nN\3\2\2\2\fR\3\2\2\2\16T\3\2\2\2\20V\3\2\2\2\22X\3\2\2\2"+
		"\24Z\3\2\2\2\26\\\3\2\2\2\30^\3\2\2\2\32z\3\2\2\2\34\u009f\3\2\2\2\36"+
		"\u00a1\3\2\2\2 \u00ae\3\2\2\2\"\u00b0\3\2\2\2$\u00bd\3\2\2\2&\u00c1\3"+
		"\2\2\2(\u00d2\3\2\2\2*\u00e3\3\2\2\2,\u00e9\3\2\2\2.\u00eb\3\2\2\2\60"+
		"\u00f4\3\2\2\2\62\u00fa\3\2\2\2\64\u010a\3\2\2\2\66\u011f\3\2\2\28\u0121"+
		"\3\2\2\2:\u012f\3\2\2\2<>\58\35\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@\3\3\2\2\2A?\3\2\2\2BC\5\6\4\2CD\5\b\5\2D\5\3\2\2\2EF\t\2\2\2F\7"+
		"\3\2\2\2GK\7\62\2\2HJ\5\n\6\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"L\t\3\2\2\2MK\3\2\2\2NO\7\23\2\2OP\7.\2\2PQ\7\24\2\2Q\13\3\2\2\2RS\t\3"+
		"\2\2S\r\3\2\2\2TU\t\4\2\2U\17\3\2\2\2VW\t\5\2\2W\21\3\2\2\2XY\t\6\2\2"+
		"Y\23\3\2\2\2Z[\t\7\2\2[\25\3\2\2\2\\]\7\17\2\2]\27\3\2\2\2^_\7\20\2\2"+
		"_\31\3\2\2\2`a\b\16\1\2ab\7\25\2\2bc\5\32\16\2cd\7\26\2\2d{\3\2\2\2ei"+
		"\5\34\17\2fi\7\62\2\2gi\5\36\20\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2im\3\2"+
		"\2\2jl\5\n\6\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nt\3\2\2\2om\3\2"+
		"\2\2pq\7\32\2\2qs\5\b\5\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u{\3"+
		"\2\2\2vt\3\2\2\2wx\5\f\7\2xy\5\32\16\ty{\3\2\2\2z`\3\2\2\2zh\3\2\2\2z"+
		"w\3\2\2\2{\u0096\3\2\2\2|}\f\b\2\2}~\5\16\b\2~\177\5\32\16\t\177\u0095"+
		"\3\2\2\2\u0080\u0081\f\7\2\2\u0081\u0082\5\20\t\2\u0082\u0083\5\32\16"+
		"\b\u0083\u0095\3\2\2\2\u0084\u0085\f\6\2\2\u0085\u0086\5\22\n\2\u0086"+
		"\u0087\5\32\16\7\u0087\u0095\3\2\2\2\u0088\u0089\f\5\2\2\u0089\u008a\5"+
		"\24\13\2\u008a\u008b\5\32\16\6\u008b\u0095\3\2\2\2\u008c\u008d\f\4\2\2"+
		"\u008d\u008e\5\26\f\2\u008e\u008f\5\32\16\5\u008f\u0095\3\2\2\2\u0090"+
		"\u0091\f\3\2\2\u0091\u0092\5\30\r\2\u0092\u0093\5\32\16\4\u0093\u0095"+
		"\3\2\2\2\u0094|\3\2\2\2\u0094\u0080\3\2\2\2\u0094\u0084\3\2\2\2\u0094"+
		"\u0088\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u0090\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\33\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u00a0\7.\2\2\u009a\u00a0\7\61\2\2\u009b\u00a0\5\"\22\2"+
		"\u009c\u00a0\5&\24\2\u009d\u00a0\7/\2\2\u009e\u00a0\7\60\2\2\u009f\u0099"+
		"\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\7\62\2"+
		"\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7\26\2\2\u00a5"+
		"\37\3\2\2\2\u00a6\u00ab\5\32\16\2\u00a7\u00a8\7\33\2\2\u00a8\u00aa\5\32"+
		"\16\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00a6\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af!\3\2\2\2\u00b0\u00b9\7\21\2\2\u00b1\u00b6"+
		"\5$\23\2\u00b2\u00b3\7\33\2\2\u00b3\u00b5\5$\23\2\u00b4\u00b2\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\7\22\2\2\u00bc#\3\2\2\2\u00bd\u00be\5\4\3\2"+
		"\u00be\u00bf\7\31\2\2\u00bf\u00c0\5\32\16\2\u00c0%\3\2\2\2\u00c1\u00ca"+
		"\7\23\2\2\u00c2\u00c7\5\32\16\2\u00c3\u00c4\7\33\2\2\u00c4\u00c6\5\32"+
		"\16\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00c2\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\24\2\2\u00cd"+
		"\'\3\2\2\2\u00ce\u00cf\5*\26\2\u00cf\u00d0\7\30\2\2\u00d0\u00d3\3\2\2"+
		"\2\u00d1\u00d3\5,\27\2\u00d2\u00ce\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3)"+
		"\3\2\2\2\u00d4\u00e4\5\32\16\2\u00d5\u00d6\5\4\3\2\u00d6\u00d7\7\27\2"+
		"\2\u00d7\u00d8\5\32\16\2\u00d8\u00e4\3\2\2\2\u00d9\u00e4\5\4\3\2\u00da"+
		"\u00db\5\b\5\2\u00db\u00dc\7\27\2\2\u00dc\u00dd\5\32\16\2\u00dd\u00e4"+
		"\3\2\2\2\u00de\u00e4\7#\2\2\u00df\u00e1\7$\2\2\u00e0\u00e2\5\32\16\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00d4\3\2"+
		"\2\2\u00e3\u00d5\3\2\2\2\u00e3\u00d9\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3"+
		"\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4+\3\2\2\2\u00e5\u00ea\5\60\31"+
		"\2\u00e6\u00ea\5\64\33\2\u00e7\u00ea\5\62\32\2\u00e8\u00ea\5\66\34\2\u00e9"+
		"\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2"+
		"\2\2\u00ea-\3\2\2\2\u00eb\u00ef\7\21\2\2\u00ec\u00ee\5(\25\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\22\2\2\u00f3/\3\2\2\2"+
		"\u00f4\u00f5\7\34\2\2\u00f5\u00f6\7\25\2\2\u00f6\u00f7\5\32\16\2\u00f7"+
		"\u00f8\7\26\2\2\u00f8\u00f9\5.\30\2\u00f9\61\3\2\2\2\u00fa\u00fb\7\35"+
		"\2\2\u00fb\u00fd\7\25\2\2\u00fc\u00fe\5*\26\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\7\30\2\2\u0100\u0102\5"+
		"\32\16\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\7\30\2\2\u0104\u0106\5*\26\2\u0105\u0104\3\2\2\2\u0105\u0106\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\26\2\2\u0108\u0109\5.\30\2\u0109"+
		"\63\3\2\2\2\u010a\u010b\7!\2\2\u010b\u010c\7\25\2\2\u010c\u010d\5\32\16"+
		"\2\u010d\u010e\7\26\2\2\u010e\u0118\5.\30\2\u010f\u0110\7\"\2\2\u0110"+
		"\u0111\7!\2\2\u0111\u0112\7\25\2\2\u0112\u0113\5\32\16\2\u0113\u0114\7"+
		"\26\2\2\u0114\u0115\5.\30\2\u0115\u0117\3\2\2\2\u0116\u010f\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011d\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\"\2\2\u011c\u011e\5.\30\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\65\3\2\2\2\u011f\u0120\7\36\2"+
		"\2\u0120\67\3\2\2\2\u0121\u0122\5\4\3\2\u0122\u0123\7\25\2\2\u0123\u0124"+
		"\5:\36\2\u0124\u0125\7\26\2\2\u0125\u0126\5.\30\2\u01269\3\2\2\2\u0127"+
		"\u012c\5\4\3\2\u0128\u0129\7\33\2\2\u0129\u012b\5\4\3\2\u012a\u0128\3"+
		"\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130;\3\2\2\2\35?Khmtz\u0094\u0096\u009f\u00ab\u00ae\u00b6\u00b9"+
		"\u00c7\u00ca\u00d2\u00e1\u00e3\u00e9\u00ef\u00fd\u0101\u0105\u0118\u011d"+
		"\u012c\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}