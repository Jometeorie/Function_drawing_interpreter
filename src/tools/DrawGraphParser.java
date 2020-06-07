// Generated from tools/DrawGraph.g4 by ANTLR 4.7.1

package  tools;
import java.util.*;
import java.lang.Math;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawGraphParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, DIV=3, MUL=4, POWER=5, SEMICO=6, L_BRACKET=7, R_BRACKET=8, 
		COMMA=9, CONST_ID=10, ORIGIN=11, SCALE=12, ROT=13, IS=14, TO=15, STEP=16, 
		DRAW=17, FOR=18, FROM=19, COLOR=20, DOTSIZE=21, STYLE=22, T1=23, ID=24, 
		WS=25, COMMENT=26, ErrText=27;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_originStatement = 2, RULE_scaleStatement = 3, 
		RULE_rotStatement = 4, RULE_forStatement = 5, RULE_colorStatement = 6, 
		RULE_dotSizeStatement = 7, RULE_styleStatement = 8, RULE_expr = 9;
	public static final String[] ruleNames = {
		"program", "statement", "originStatement", "scaleStatement", "rotStatement", 
		"forStatement", "colorStatement", "dotSizeStatement", "styleStatement", 
		"expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'/'", "'*'", "'**'", "';'", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "DIV", "MUL", "POWER", "SEMICO", "L_BRACKET", "R_BRACKET", 
		"COMMA", "CONST_ID", "ORIGIN", "SCALE", "ROT", "IS", "TO", "STEP", "DRAW", 
		"FOR", "FROM", "COLOR", "DOTSIZE", "STYLE", "T1", "ID", "WS", "COMMENT", 
		"ErrText"
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
	public String getGrammarFileName() { return "DrawGraph.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawGraphParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ORIGIN) | (1L << SCALE) | (1L << ROT) | (1L << FOR) | (1L << COLOR) | (1L << DOTSIZE) | (1L << STYLE))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public OriginStatementContext originStatement() {
			return getRuleContext(OriginStatementContext.class,0);
		}
		public ScaleStatementContext scaleStatement() {
			return getRuleContext(ScaleStatementContext.class,0);
		}
		public RotStatementContext rotStatement() {
			return getRuleContext(RotStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ColorStatementContext colorStatement() {
			return getRuleContext(ColorStatementContext.class,0);
		}
		public DotSizeStatementContext dotSizeStatement() {
			return getRuleContext(DotSizeStatementContext.class,0);
		}
		public StyleStatementContext styleStatement() {
			return getRuleContext(StyleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORIGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				originStatement();
				}
				break;
			case SCALE:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				scaleStatement();
				}
				break;
			case ROT:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				rotStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				forStatement();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(29);
				colorStatement();
				}
				break;
			case DOTSIZE:
				enterOuterAlt(_localctx, 6);
				{
				setState(30);
				dotSizeStatement();
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(31);
				styleStatement();
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

	public static class OriginStatementContext extends ParserRuleContext {
		public TerminalNode ORIGIN() { return getToken(DrawGraphParser.ORIGIN, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DrawGraphParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public OriginStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterOriginStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitOriginStatement(this);
		}
	}

	public final OriginStatementContext originStatement() throws RecognitionException {
		OriginStatementContext _localctx = new OriginStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_originStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ORIGIN);
			setState(35);
			match(IS);
			setState(36);
			match(L_BRACKET);
			setState(37);
			expr(0);
			setState(38);
			match(COMMA);
			setState(39);
			expr(0);
			setState(40);
			match(R_BRACKET);
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

	public static class ScaleStatementContext extends ParserRuleContext {
		public TerminalNode SCALE() { return getToken(DrawGraphParser.SCALE, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DrawGraphParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public ScaleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterScaleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitScaleStatement(this);
		}
	}

	public final ScaleStatementContext scaleStatement() throws RecognitionException {
		ScaleStatementContext _localctx = new ScaleStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scaleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(SCALE);
			setState(43);
			match(IS);
			setState(44);
			match(L_BRACKET);
			setState(45);
			expr(0);
			setState(46);
			match(COMMA);
			setState(47);
			expr(0);
			setState(48);
			match(R_BRACKET);
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

	public static class RotStatementContext extends ParserRuleContext {
		public TerminalNode ROT() { return getToken(DrawGraphParser.ROT, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RotStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterRotStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitRotStatement(this);
		}
	}

	public final RotStatementContext rotStatement() throws RecognitionException {
		RotStatementContext _localctx = new RotStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rotStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ROT);
			setState(51);
			match(IS);
			setState(52);
			expr(0);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DrawGraphParser.FOR, 0); }
		public TerminalNode T1() { return getToken(DrawGraphParser.T1, 0); }
		public TerminalNode FROM() { return getToken(DrawGraphParser.FROM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(DrawGraphParser.TO, 0); }
		public TerminalNode STEP() { return getToken(DrawGraphParser.STEP, 0); }
		public TerminalNode DRAW() { return getToken(DrawGraphParser.DRAW, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(DrawGraphParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(FOR);
			setState(55);
			match(T1);
			setState(56);
			match(FROM);
			setState(57);
			expr(0);
			setState(58);
			match(TO);
			setState(59);
			expr(0);
			setState(60);
			match(STEP);
			setState(61);
			expr(0);
			setState(62);
			match(DRAW);
			setState(63);
			match(L_BRACKET);
			setState(64);
			expr(0);
			setState(65);
			match(COMMA);
			setState(66);
			expr(0);
			setState(67);
			match(R_BRACKET);
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

	public static class ColorStatementContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DrawGraphParser.COLOR, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DrawGraphParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DrawGraphParser.COMMA, i);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public ColorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterColorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitColorStatement(this);
		}
	}

	public final ColorStatementContext colorStatement() throws RecognitionException {
		ColorStatementContext _localctx = new ColorStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_colorStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(COLOR);
			setState(70);
			match(IS);
			setState(71);
			match(L_BRACKET);
			setState(72);
			expr(0);
			setState(73);
			match(COMMA);
			setState(74);
			expr(0);
			setState(75);
			match(COMMA);
			setState(76);
			expr(0);
			setState(77);
			match(R_BRACKET);
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

	public static class DotSizeStatementContext extends ParserRuleContext {
		public TerminalNode DOTSIZE() { return getToken(DrawGraphParser.DOTSIZE, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DotSizeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotSizeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterDotSizeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitDotSizeStatement(this);
		}
	}

	public final DotSizeStatementContext dotSizeStatement() throws RecognitionException {
		DotSizeStatementContext _localctx = new DotSizeStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dotSizeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(DOTSIZE);
			setState(80);
			match(IS);
			setState(81);
			expr(0);
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

	public static class StyleStatementContext extends ParserRuleContext {
		public Token styleType;
		public TerminalNode STYLE() { return getToken(DrawGraphParser.STYLE, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public TerminalNode ID() { return getToken(DrawGraphParser.ID, 0); }
		public StyleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterStyleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitStyleStatement(this);
		}
	}

	public final StyleStatementContext styleStatement() throws RecognitionException {
		StyleStatementContext _localctx = new StyleStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_styleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(STYLE);
			setState(84);
			match(IS);
			setState(85);
			((StyleStatementContext)_localctx).styleType = match(ID);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PowerExprContext extends ExprContext {
		public ExprContext op;
		public TerminalNode POWER() { return getToken(DrawGraphParser.POWER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitPowerExpr(this);
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(DrawGraphParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DrawGraphParser.DIV, 0); }
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitMulDivExpr(this);
		}
	}
	public static class VarTContext extends ExprContext {
		public TerminalNode T1() { return getToken(DrawGraphParser.T1, 0); }
		public VarTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterVarT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitVarT(this);
		}
	}
	public static class ConstContext extends ExprContext {
		public TerminalNode CONST_ID() { return getToken(DrawGraphParser.CONST_ID, 0); }
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitConst(this);
		}
	}
	public static class PlusMinusExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(DrawGraphParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DrawGraphParser.MINUS, 0); }
		public PlusMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterPlusMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitPlusMinusExpr(this);
		}
	}
	public static class NestedExprContext extends ExprContext {
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public NestedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterNestedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitNestedExpr(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(DrawGraphParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DrawGraphParser.MINUS, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitUnaryExpr(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public Token func;
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public TerminalNode ID() { return getToken(DrawGraphParser.ID, 0); }
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitFuncExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				expr(7);
				}
				break;
			case CONST_ID:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(CONST_ID);
				}
				break;
			case T1:
				{
				_localctx = new VarTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T1);
				}
				break;
			case ID:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				((FuncExprContext)_localctx).func = match(ID);
				setState(93);
				match(L_BRACKET);
				setState(94);
				expr(0);
				setState(95);
				match(R_BRACKET);
				}
				break;
			case L_BRACKET:
				{
				_localctx = new NestedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(L_BRACKET);
				setState(98);
				expr(0);
				setState(99);
				match(R_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExprContext(_parentctx, _parentState));
						((PowerExprContext)_localctx).op = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(104);
						match(POWER);
						setState(105);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(107);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(110);
						((PlusMinusExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"h\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13s\n\13\f\13\16"+
		"\13v\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\3\4\3\2\5\6\2"+
		"{\2\27\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b,\3\2\2\2\n\64\3\2\2\2\f8\3\2\2"+
		"\2\16G\3\2\2\2\20Q\3\2\2\2\22U\3\2\2\2\24g\3\2\2\2\26\30\5\4\3\2\27\26"+
		"\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33#\5"+
		"\6\4\2\34#\5\b\5\2\35#\5\n\6\2\36#\5\f\7\2\37#\5\16\b\2 #\5\20\t\2!#\5"+
		"\22\n\2\"\33\3\2\2\2\"\34\3\2\2\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3\2\2"+
		"\2\" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\7\r\2\2%&\7\20\2\2&\'\7\t\2\2\'"+
		"(\5\24\13\2()\7\13\2\2)*\5\24\13\2*+\7\n\2\2+\7\3\2\2\2,-\7\16\2\2-.\7"+
		"\20\2\2./\7\t\2\2/\60\5\24\13\2\60\61\7\13\2\2\61\62\5\24\13\2\62\63\7"+
		"\n\2\2\63\t\3\2\2\2\64\65\7\17\2\2\65\66\7\20\2\2\66\67\5\24\13\2\67\13"+
		"\3\2\2\289\7\24\2\29:\7\31\2\2:;\7\25\2\2;<\5\24\13\2<=\7\21\2\2=>\5\24"+
		"\13\2>?\7\22\2\2?@\5\24\13\2@A\7\23\2\2AB\7\t\2\2BC\5\24\13\2CD\7\13\2"+
		"\2DE\5\24\13\2EF\7\n\2\2F\r\3\2\2\2GH\7\26\2\2HI\7\20\2\2IJ\7\t\2\2JK"+
		"\5\24\13\2KL\7\13\2\2LM\5\24\13\2MN\7\13\2\2NO\5\24\13\2OP\7\n\2\2P\17"+
		"\3\2\2\2QR\7\27\2\2RS\7\20\2\2ST\5\24\13\2T\21\3\2\2\2UV\7\30\2\2VW\7"+
		"\20\2\2WX\7\32\2\2X\23\3\2\2\2YZ\b\13\1\2Z[\t\2\2\2[h\5\24\13\t\\h\7\f"+
		"\2\2]h\7\31\2\2^_\7\32\2\2_`\7\t\2\2`a\5\24\13\2ab\7\n\2\2bh\3\2\2\2c"+
		"d\7\t\2\2de\5\24\13\2ef\7\n\2\2fh\3\2\2\2gY\3\2\2\2g\\\3\2\2\2g]\3\2\2"+
		"\2g^\3\2\2\2gc\3\2\2\2ht\3\2\2\2ij\f\n\2\2jk\7\7\2\2ks\5\24\13\nlm\f\b"+
		"\2\2mn\t\3\2\2ns\5\24\13\top\f\7\2\2pq\t\2\2\2qs\5\24\13\bri\3\2\2\2r"+
		"l\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\25\3\2\2\2vt\3\2\2"+
		"\2\7\31\"grt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}