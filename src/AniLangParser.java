// Generated from /Users/tluszczyk/dev/JAVA/AGH/semV/MIAK/AniLang/AniLangParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AniLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Open_Parenthesis=1, Close_Parenthesis=2, Open_Bracket=3, Close_Bracket=4, 
		Open_Square_Bracket=5, Close_Square_Bracket=6, Dot=7, Comma=8, Semicolon=9, 
		TypeSeparator=10, Assign=11, ComparationToken=12, Not=13, Plus=14, Minus=15, 
		Star_Slash_Mod=16, Power=17, And=18, Or=19, Then=20, End=21, If=22, Else_If=23, 
		Else=24, For=25, While=26, Outer=27, Return=28, Break=29, Continue=30, 
		Print=31, Println=32, CreateScene=33, CreateBox=34, BuildScene=35, Type=36, 
		White_Sign=37, Int=38, Double=39, Number=40, Bool=41, Id=42, Comment=43;
	public static final int
		RULE_program = 0, RULE_id = 1, RULE_atom = 2, RULE_escape_statement = 3, 
		RULE_function_declaration = 4, RULE_function_call = 5, RULE_expr = 6, 
		RULE_expr_1 = 7, RULE_expr_2 = 8, RULE_expr_3 = 9, RULE_expr_4 = 10, RULE_expr_5 = 11, 
		RULE_expr_6 = 12, RULE_expr_7 = 13, RULE_expr_8 = 14, RULE_unary_operator = 15, 
		RULE_declaration_stat = 16, RULE_assignment_stat = 17, RULE_else_stat = 18, 
		RULE_else_if_stat = 19, RULE_if_stat = 20, RULE_for_stat = 21, RULE_while_stat = 22, 
		RULE_print = 23, RULE_println = 24, RULE_createScene = 25, RULE_createBox = 26, 
		RULE_buildScene = 27, RULE_block_stat = 28, RULE_blockless_stat = 29, 
		RULE_stat_with_semicolon = 30, RULE_then = 31, RULE_end = 32, RULE_block = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "id", "atom", "escape_statement", "function_declaration", 
			"function_call", "expr", "expr_1", "expr_2", "expr_3", "expr_4", "expr_5", 
			"expr_6", "expr_7", "expr_8", "unary_operator", "declaration_stat", "assignment_stat", 
			"else_stat", "else_if_stat", "if_stat", "for_stat", "while_stat", "print", 
			"println", "createScene", "createBox", "buildScene", "block_stat", "blockless_stat", 
			"stat_with_semicolon", "then", "end", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "','", "';'", 
			"'::'", "'='", null, "'!'", "'+'", "'-'", null, "'**'", "'and'", "'or'", 
			"'then'", "'end'", "'if'", "'else if'", "'else'", "'for'", "'while'", 
			"'outer'", "'return'", "'break'", "'continue'", "'print'", "'println'", 
			"'createScene'", "'createBox'", "'buildScene'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Open_Parenthesis", "Close_Parenthesis", "Open_Bracket", "Close_Bracket", 
			"Open_Square_Bracket", "Close_Square_Bracket", "Dot", "Comma", "Semicolon", 
			"TypeSeparator", "Assign", "ComparationToken", "Not", "Plus", "Minus", 
			"Star_Slash_Mod", "Power", "And", "Or", "Then", "End", "If", "Else_If", 
			"Else", "For", "While", "Outer", "Return", "Break", "Continue", "Print", 
			"Println", "CreateScene", "CreateBox", "BuildScene", "Type", "White_Sign", 
			"Int", "Double", "Number", "Bool", "Id", "Comment"
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
	public String getGrammarFileName() { return "AniLangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AniLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Block_statContext> block_stat() {
			return getRuleContexts(Block_statContext.class);
		}
		public Block_statContext block_stat(int i) {
			return getRuleContext(Block_statContext.class,i);
		}
		public List<Stat_with_semicolonContext> stat_with_semicolon() {
			return getRuleContexts(Stat_with_semicolonContext.class);
		}
		public Stat_with_semicolonContext stat_with_semicolon(int i) {
			return getRuleContext(Stat_with_semicolonContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << For) | (1L << While) | (1L << Outer) | (1L << Return) | (1L << Break) | (1L << Continue) | (1L << Print) | (1L << Println) | (1L << CreateScene) | (1L << CreateBox) | (1L << BuildScene) | (1L << Type) | (1L << Id))) != 0)) {
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(68);
					block_stat();
					}
					break;
				case 2:
					{
					setState(69);
					stat_with_semicolon();
					}
					break;
				}
				}
				setState(74);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(AniLangParser.Id, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(Id);
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

	public static class AtomContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Int() { return getToken(AniLangParser.Int, 0); }
		public TerminalNode Double() { return getToken(AniLangParser.Double, 0); }
		public TerminalNode Bool() { return getToken(AniLangParser.Bool, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				id();
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(Int);
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(Double);
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(Bool);
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

	public static class Escape_statementContext extends ParserRuleContext {
		public Escape_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape_statement; }
	 
		public Escape_statementContext() { }
		public void copyFrom(Escape_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnStatContext extends Escape_statementContext {
		public TerminalNode Return() { return getToken(AniLangParser.Return, 0); }
		public ReturnStatContext(Escape_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatContext extends Escape_statementContext {
		public TerminalNode Break() { return getToken(AniLangParser.Break, 0); }
		public BreakStatContext(Escape_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterBreakStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitBreakStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitBreakStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatContext extends Escape_statementContext {
		public TerminalNode Continue() { return getToken(AniLangParser.Continue, 0); }
		public ContinueStatContext(Escape_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterContinueStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitContinueStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitContinueStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnValueStatContext extends Escape_statementContext {
		public TerminalNode Return() { return getToken(AniLangParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnValueStatContext(Escape_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterReturnValueStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitReturnValueStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitReturnValueStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Escape_statementContext escape_statement() throws RecognitionException {
		Escape_statementContext _localctx = new Escape_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_escape_statement);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new BreakStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(Break);
				}
				break;
			case 2:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(Return);
				}
				break;
			case 3:
				_localctx = new ReturnValueStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(Return);
				setState(86);
				expr();
				}
				break;
			case 4:
				_localctx = new ContinueStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(Continue);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public List<TerminalNode> Type() { return getTokens(AniLangParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(AniLangParser.Type, i);
		}
		public List<TerminalNode> TypeSeparator() { return getTokens(AniLangParser.TypeSeparator); }
		public TerminalNode TypeSeparator(int i) {
			return getToken(AniLangParser.TypeSeparator, i);
		}
		public List<TerminalNode> Id() { return getTokens(AniLangParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(AniLangParser.Id, i);
		}
		public TerminalNode Open_Parenthesis() { return getToken(AniLangParser.Open_Parenthesis, 0); }
		public TerminalNode Close_Parenthesis() { return getToken(AniLangParser.Close_Parenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AniLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AniLangParser.Comma, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(Type);
			setState(91);
			match(TypeSeparator);
			setState(92);
			match(Id);
			setState(93);
			match(Open_Parenthesis);
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				{
				setState(95);
				match(Type);
				setState(96);
				match(TypeSeparator);
				setState(97);
				match(Id);
				}
				}
				break;
			case 3:
				{
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						match(Type);
						setState(99);
						match(TypeSeparator);
						setState(100);
						match(Id);
						setState(101);
						match(Comma);
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				{
				setState(107);
				match(Type);
				setState(108);
				match(TypeSeparator);
				setState(109);
				match(Id);
				}
				}
				break;
			}
			setState(112);
			match(Close_Parenthesis);
			setState(113);
			block();
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
		public TerminalNode Id() { return getToken(AniLangParser.Id, 0); }
		public TerminalNode Open_Parenthesis() { return getToken(AniLangParser.Open_Parenthesis, 0); }
		public TerminalNode Close_Parenthesis() { return getToken(AniLangParser.Close_Parenthesis, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AniLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AniLangParser.Comma, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_call);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(Id);
			setState(116);
			match(Open_Parenthesis);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				{
				setState(118);
				expr();
				}
				}
				break;
			case 3:
				{
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(119);
						expr();
						setState(120);
						match(Comma);
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				{
				setState(127);
				expr();
				}
				}
				break;
			}
			setState(130);
			match(Close_Parenthesis);
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
		public List<Expr_1Context> expr_1() {
			return getRuleContexts(Expr_1Context.class);
		}
		public Expr_1Context expr_1(int i) {
			return getRuleContext(Expr_1Context.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(AniLangParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(AniLangParser.Or, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			expr_1();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(133);
				match(Or);
				setState(134);
				expr_1();
				}
				}
				setState(139);
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

	public static class Expr_1Context extends ParserRuleContext {
		public List<Expr_2Context> expr_2() {
			return getRuleContexts(Expr_2Context.class);
		}
		public Expr_2Context expr_2(int i) {
			return getRuleContext(Expr_2Context.class,i);
		}
		public List<TerminalNode> And() { return getTokens(AniLangParser.And); }
		public TerminalNode And(int i) {
			return getToken(AniLangParser.And, i);
		}
		public Expr_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterExpr_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitExpr_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitExpr_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_1Context expr_1() throws RecognitionException {
		Expr_1Context _localctx = new Expr_1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			expr_2();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(141);
				match(And);
				setState(142);
				expr_2();
				}
				}
				setState(147);
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

	public static class Expr_2Context extends ParserRuleContext {
		public List<Expr_3Context> expr_3() {
			return getRuleContexts(Expr_3Context.class);
		}
		public Expr_3Context expr_3(int i) {
			return getRuleContext(Expr_3Context.class,i);
		}
		public TerminalNode ComparationToken() { return getToken(AniLangParser.ComparationToken, 0); }
		public Expr_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterExpr_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitExpr_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitExpr_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_2Context expr_2() throws RecognitionException {
		Expr_2Context _localctx = new Expr_2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expr_3();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ComparationToken) {
				{
				setState(149);
				match(ComparationToken);
				setState(150);
				expr_3();
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

	public static class Expr_3Context extends ParserRuleContext {
		public List<Expr_4Context> expr_4() {
			return getRuleContexts(Expr_4Context.class);
		}
		public Expr_4Context expr_4(int i) {
			return getRuleContext(Expr_4Context.class,i);
		}
		public List<TerminalNode> Minus() { return getTokens(AniLangParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(AniLangParser.Minus, i);
		}
		public Expr_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterExpr_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitExpr_3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitExpr_3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_3Context expr_3() throws RecognitionException {
		Expr_3Context _localctx = new Expr_3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			expr_4();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Minus) {
				{
				{
				setState(154);
				match(Minus);
				setState(155);
				expr_4();
				}
				}
				setState(160);
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

	public static class Expr_4Context extends ParserRuleContext {
		public List<Expr_5Context> expr_5() {
			return getRuleContexts(Expr_5Context.class);
		}
		public Expr_5Context expr_5(int i) {
			return getRuleContext(Expr_5Context.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(AniLangParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(AniLangParser.Plus, i);
		}
		public Expr_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterExpr_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitExpr_4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitExpr_4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_4Context expr_4() throws RecognitionException {
		Expr_4Context _localctx = new Expr_4Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expr_5();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus) {
				{
				{
				setState(162);
				match(Plus);
				setState(163);
				expr_5();
				}
				}
				setState(168);
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

	public static class Expr_5Context extends ParserRuleContext {
		public List<Expr_6Context> expr_6() {
			return getRuleContexts(Expr_6Context.class);
		}
		public Expr_6Context expr_6(int i) {
			return getRuleContext(Expr_6Context.class,i);
		}
		public List<TerminalNode> Star_Slash_Mod() { return getTokens(AniLangParser.Star_Slash_Mod); }
		public TerminalNode Star_Slash_Mod(int i) {
			return getToken(AniLangParser.Star_Slash_Mod, i);
		}
		public Expr_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterExpr_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitExpr_5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitExpr_5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_5Context expr_5() throws RecognitionException {
		Expr_5Context _localctx = new Expr_5Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			expr_6();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Star_Slash_Mod) {
				{
				{
				setState(170);
				match(Star_Slash_Mod);
				setState(171);
				expr_6();
				}
				}
				setState(176);
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

	public static class Expr_6Context extends ParserRuleContext {
		public Expr_7Context expr_7() {
			return getRuleContext(Expr_7Context.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Expr_6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterExpr_6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitExpr_6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitExpr_6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_6Context expr_6() throws RecognitionException {
		Expr_6Context _localctx = new Expr_6Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Not || _la==Minus) {
				{
				setState(177);
				unary_operator();
				}
			}

			setState(180);
			expr_7();
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

	public static class Expr_7Context extends ParserRuleContext {
		public List<Expr_8Context> expr_8() {
			return getRuleContexts(Expr_8Context.class);
		}
		public Expr_8Context expr_8(int i) {
			return getRuleContext(Expr_8Context.class,i);
		}
		public List<TerminalNode> Power() { return getTokens(AniLangParser.Power); }
		public TerminalNode Power(int i) {
			return getToken(AniLangParser.Power, i);
		}
		public Expr_7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterExpr_7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitExpr_7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitExpr_7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_7Context expr_7() throws RecognitionException {
		Expr_7Context _localctx = new Expr_7Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expr_8();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Power) {
				{
				{
				setState(183);
				match(Power);
				setState(184);
				expr_8();
				}
				}
				setState(189);
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

	public static class Expr_8Context extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode Outer() { return getToken(AniLangParser.Outer, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode Open_Parenthesis() { return getToken(AniLangParser.Open_Parenthesis, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Close_Parenthesis() { return getToken(AniLangParser.Close_Parenthesis, 0); }
		public Expr_8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterExpr_8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitExpr_8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitExpr_8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_8Context expr_8() throws RecognitionException {
		Expr_8Context _localctx = new Expr_8Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_8);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(Outer);
				setState(192);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(Open_Parenthesis);
				setState(195);
				expr();
				setState(196);
				match(Close_Parenthesis);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(AniLangParser.Not, 0); }
		public TerminalNode Minus() { return getToken(AniLangParser.Minus, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(_la==Not || _la==Minus) ) {
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

	public static class Declaration_statContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(AniLangParser.Type, 0); }
		public TerminalNode TypeSeparator() { return getToken(AniLangParser.TypeSeparator, 0); }
		public TerminalNode Id() { return getToken(AniLangParser.Id, 0); }
		public TerminalNode Assign() { return getToken(AniLangParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Declaration_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterDeclaration_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitDeclaration_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitDeclaration_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_statContext declaration_stat() throws RecognitionException {
		Declaration_statContext _localctx = new Declaration_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(Type);
			setState(203);
			match(TypeSeparator);
			setState(204);
			match(Id);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(205);
				match(Assign);
				setState(206);
				expr();
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

	public static class Assignment_statContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(AniLangParser.Id, 0); }
		public TerminalNode Assign() { return getToken(AniLangParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Outer() { return getToken(AniLangParser.Outer, 0); }
		public Assignment_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterAssignment_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitAssignment_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitAssignment_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statContext assignment_stat() throws RecognitionException {
		Assignment_statContext _localctx = new Assignment_statContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Outer) {
				{
				setState(209);
				match(Outer);
				}
			}

			setState(212);
			match(Id);
			setState(213);
			match(Assign);
			setState(214);
			expr();
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

	public static class Else_statContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(AniLangParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterElse_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitElse_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitElse_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statContext else_stat() throws RecognitionException {
		Else_statContext _localctx = new Else_statContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_else_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(Else);
			setState(217);
			block();
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

	public static class Else_if_statContext extends ParserRuleContext {
		public TerminalNode Else_If() { return getToken(AniLangParser.Else_If, 0); }
		public TerminalNode Open_Parenthesis() { return getToken(AniLangParser.Open_Parenthesis, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Close_Parenthesis() { return getToken(AniLangParser.Close_Parenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_if_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterElse_if_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitElse_if_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitElse_if_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_statContext else_if_stat() throws RecognitionException {
		Else_if_statContext _localctx = new Else_if_statContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_else_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(Else_If);
			setState(220);
			match(Open_Parenthesis);
			setState(221);
			expr();
			setState(222);
			match(Close_Parenthesis);
			setState(223);
			block();
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

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AniLangParser.If, 0); }
		public TerminalNode Open_Parenthesis() { return getToken(AniLangParser.Open_Parenthesis, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Close_Parenthesis() { return getToken(AniLangParser.Close_Parenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Else_if_statContext> else_if_stat() {
			return getRuleContexts(Else_if_statContext.class);
		}
		public Else_if_statContext else_if_stat(int i) {
			return getRuleContext(Else_if_statContext.class,i);
		}
		public Else_statContext else_stat() {
			return getRuleContext(Else_statContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(If);
			setState(226);
			match(Open_Parenthesis);
			setState(227);
			expr();
			setState(228);
			match(Close_Parenthesis);
			setState(229);
			block();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else_If) {
				{
				{
				setState(230);
				else_if_stat();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(236);
				else_stat();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(AniLangParser.For, 0); }
		public TerminalNode Open_Parenthesis() { return getToken(AniLangParser.Open_Parenthesis, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(AniLangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(AniLangParser.Semicolon, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Close_Parenthesis() { return getToken(AniLangParser.Close_Parenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Assignment_statContext assignment_stat() {
			return getRuleContext(Assignment_statContext.class,0);
		}
		public Declaration_statContext declaration_stat() {
			return getRuleContext(Declaration_statContext.class,0);
		}
		public Blockless_statContext blockless_stat() {
			return getRuleContext(Blockless_statContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitFor_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(For);
			setState(240);
			match(Open_Parenthesis);
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Outer:
			case Id:
				{
				setState(241);
				assignment_stat();
				}
				break;
			case Type:
				{
				setState(242);
				declaration_stat();
				}
				break;
			case Semicolon:
				break;
			default:
				break;
			}
			setState(245);
			match(Semicolon);
			setState(246);
			expr();
			setState(247);
			match(Semicolon);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Outer) | (1L << Return) | (1L << Break) | (1L << Continue) | (1L << Print) | (1L << Println) | (1L << CreateScene) | (1L << CreateBox) | (1L << BuildScene) | (1L << Type) | (1L << Id))) != 0)) {
				{
				setState(248);
				blockless_stat();
				}
			}

			setState(251);
			match(Close_Parenthesis);
			setState(252);
			block();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(AniLangParser.While, 0); }
		public TerminalNode Open_Parenthesis() { return getToken(AniLangParser.Open_Parenthesis, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Close_Parenthesis() { return getToken(AniLangParser.Close_Parenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(While);
			setState(255);
			match(Open_Parenthesis);
			setState(256);
			expr();
			setState(257);
			match(Close_Parenthesis);
			setState(258);
			block();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(AniLangParser.Print, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(Print);
			setState(261);
			expr();
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode Println() { return getToken(AniLangParser.Println, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(Println);
			setState(264);
			expr();
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

	public static class CreateSceneContext extends ParserRuleContext {
		public TerminalNode CreateScene() { return getToken(AniLangParser.CreateScene, 0); }
		public TerminalNode Open_Parenthesis() { return getToken(AniLangParser.Open_Parenthesis, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Comma() { return getToken(AniLangParser.Comma, 0); }
		public TerminalNode Close_Parenthesis() { return getToken(AniLangParser.Close_Parenthesis, 0); }
		public CreateSceneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createScene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterCreateScene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitCreateScene(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitCreateScene(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSceneContext createScene() throws RecognitionException {
		CreateSceneContext _localctx = new CreateSceneContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_createScene);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(CreateScene);
			setState(267);
			match(Open_Parenthesis);
			setState(268);
			expr();
			setState(269);
			match(Comma);
			setState(270);
			expr();
			setState(271);
			match(Close_Parenthesis);
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

	public static class CreateBoxContext extends ParserRuleContext {
		public TerminalNode CreateBox() { return getToken(AniLangParser.CreateBox, 0); }
		public TerminalNode Open_Parenthesis() { return getToken(AniLangParser.Open_Parenthesis, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AniLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AniLangParser.Comma, i);
		}
		public TerminalNode Close_Parenthesis() { return getToken(AniLangParser.Close_Parenthesis, 0); }
		public CreateBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createBox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterCreateBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitCreateBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitCreateBox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateBoxContext createBox() throws RecognitionException {
		CreateBoxContext _localctx = new CreateBoxContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_createBox);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(CreateBox);
			setState(274);
			match(Open_Parenthesis);
			setState(275);
			expr();
			setState(276);
			match(Comma);
			setState(277);
			expr();
			setState(278);
			match(Comma);
			setState(279);
			expr();
			setState(280);
			match(Comma);
			setState(281);
			expr();
			setState(282);
			match(Comma);
			setState(283);
			expr();
			setState(284);
			match(Comma);
			setState(285);
			expr();
			setState(286);
			match(Comma);
			setState(287);
			expr();
			setState(288);
			match(Comma);
			setState(289);
			expr();
			setState(290);
			match(Comma);
			setState(291);
			expr();
			setState(292);
			match(Close_Parenthesis);
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

	public static class BuildSceneContext extends ParserRuleContext {
		public TerminalNode BuildScene() { return getToken(AniLangParser.BuildScene, 0); }
		public TerminalNode Open_Parenthesis() { return getToken(AniLangParser.Open_Parenthesis, 0); }
		public TerminalNode Close_Parenthesis() { return getToken(AniLangParser.Close_Parenthesis, 0); }
		public BuildSceneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildScene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterBuildScene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitBuildScene(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitBuildScene(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildSceneContext buildScene() throws RecognitionException {
		BuildSceneContext _localctx = new BuildSceneContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_buildScene);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(BuildScene);
			setState(295);
			match(Open_Parenthesis);
			setState(296);
			match(Close_Parenthesis);
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

	public static class Block_statContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Block_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterBlock_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitBlock_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitBlock_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statContext block_stat() throws RecognitionException {
		Block_statContext _localctx = new Block_statContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block_stat);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				function_declaration();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				if_stat();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				for_stat();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				while_stat();
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

	public static class Blockless_statContext extends ParserRuleContext {
		public Assignment_statContext assignment_stat() {
			return getRuleContext(Assignment_statContext.class,0);
		}
		public Declaration_statContext declaration_stat() {
			return getRuleContext(Declaration_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Escape_statementContext escape_statement() {
			return getRuleContext(Escape_statementContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public CreateSceneContext createScene() {
			return getRuleContext(CreateSceneContext.class,0);
		}
		public CreateBoxContext createBox() {
			return getRuleContext(CreateBoxContext.class,0);
		}
		public BuildSceneContext buildScene() {
			return getRuleContext(BuildSceneContext.class,0);
		}
		public Blockless_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockless_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterBlockless_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitBlockless_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitBlockless_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Blockless_statContext blockless_stat() throws RecognitionException {
		Blockless_statContext _localctx = new Blockless_statContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_blockless_stat);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				assignment_stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				declaration_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				escape_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				println();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				createScene();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				createBox();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(312);
				buildScene();
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

	public static class Stat_with_semicolonContext extends ParserRuleContext {
		public Blockless_statContext blockless_stat() {
			return getRuleContext(Blockless_statContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(AniLangParser.Semicolon, 0); }
		public Stat_with_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_with_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterStat_with_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitStat_with_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitStat_with_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_with_semicolonContext stat_with_semicolon() throws RecognitionException {
		Stat_with_semicolonContext _localctx = new Stat_with_semicolonContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stat_with_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			blockless_stat();
			setState(316);
			match(Semicolon);
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

	public static class ThenContext extends ParserRuleContext {
		public TerminalNode Then() { return getToken(AniLangParser.Then, 0); }
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(Then);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(AniLangParser.End, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(End);
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

	public static class BlockContext extends ParserRuleContext {
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<Block_statContext> block_stat() {
			return getRuleContexts(Block_statContext.class);
		}
		public Block_statContext block_stat(int i) {
			return getRuleContext(Block_statContext.class,i);
		}
		public List<Stat_with_semicolonContext> stat_with_semicolon() {
			return getRuleContexts(Stat_with_semicolonContext.class);
		}
		public Stat_with_semicolonContext stat_with_semicolon(int i) {
			return getRuleContext(Stat_with_semicolonContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AniLangParserListener ) ((AniLangParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AniLangParserVisitor ) return ((AniLangParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			then();
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << For) | (1L << While) | (1L << Outer) | (1L << Return) | (1L << Break) | (1L << Continue) | (1L << Print) | (1L << Println) | (1L << CreateScene) | (1L << CreateBox) | (1L << BuildScene) | (1L << Type) | (1L << Id))) != 0)) {
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(324);
						block_stat();
						}
						break;
					case 2:
						{
						setState(325);
						stat_with_semicolon();
						}
						break;
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(333);
			end();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0152\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\6\5\6q\n\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7"+
		"\5\7\u0083\n\7\3\7\3\7\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3"+
		"\t\3\t\3\t\7\t\u0092\n\t\f\t\16\t\u0095\13\t\3\n\3\n\3\n\5\n\u009a\n\n"+
		"\3\13\3\13\3\13\7\13\u009f\n\13\f\13\16\13\u00a2\13\13\3\f\3\f\3\f\7\f"+
		"\u00a7\n\f\f\f\16\f\u00aa\13\f\3\r\3\r\3\r\7\r\u00af\n\r\f\r\16\r\u00b2"+
		"\13\r\3\16\5\16\u00b5\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u00bc\n\17\f"+
		"\17\16\17\u00bf\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c9"+
		"\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00d2\n\22\3\23\5\23\u00d5"+
		"\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00ea\n\26\f\26\16\26\u00ed\13\26"+
		"\3\26\5\26\u00f0\n\26\3\27\3\27\3\27\3\27\5\27\u00f6\n\27\3\27\3\27\3"+
		"\27\3\27\5\27\u00fc\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\5\36\u0131\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u013c"+
		"\n\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\7#\u0149\n#\f#\16#\u014c\13#"+
		"\5#\u014e\n#\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BD\2\3\4\2\17\17\21\21\2\u015d\2J\3\2\2\2\4M\3\2"+
		"\2\2\6S\3\2\2\2\bZ\3\2\2\2\n\\\3\2\2\2\fu\3\2\2\2\16\u0086\3\2\2\2\20"+
		"\u008e\3\2\2\2\22\u0096\3\2\2\2\24\u009b\3\2\2\2\26\u00a3\3\2\2\2\30\u00ab"+
		"\3\2\2\2\32\u00b4\3\2\2\2\34\u00b8\3\2\2\2\36\u00c8\3\2\2\2 \u00ca\3\2"+
		"\2\2\"\u00cc\3\2\2\2$\u00d4\3\2\2\2&\u00da\3\2\2\2(\u00dd\3\2\2\2*\u00e3"+
		"\3\2\2\2,\u00f1\3\2\2\2.\u0100\3\2\2\2\60\u0106\3\2\2\2\62\u0109\3\2\2"+
		"\2\64\u010c\3\2\2\2\66\u0113\3\2\2\28\u0128\3\2\2\2:\u0130\3\2\2\2<\u013b"+
		"\3\2\2\2>\u013d\3\2\2\2@\u0140\3\2\2\2B\u0142\3\2\2\2D\u0144\3\2\2\2F"+
		"I\5:\36\2GI\5> \2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\3"+
		"\3\2\2\2LJ\3\2\2\2MN\7,\2\2N\5\3\2\2\2OT\5\4\3\2PT\7(\2\2QT\7)\2\2RT\7"+
		"+\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\7\3\2\2\2U[\7\37\2\2V["+
		"\7\36\2\2WX\7\36\2\2X[\5\16\b\2Y[\7 \2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2"+
		"ZY\3\2\2\2[\t\3\2\2\2\\]\7&\2\2]^\7\f\2\2^_\7,\2\2_p\7\3\2\2`q\3\2\2\2"+
		"ab\7&\2\2bc\7\f\2\2cq\7,\2\2de\7&\2\2ef\7\f\2\2fg\7,\2\2gi\7\n\2\2hd\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7&\2\2no\7"+
		"\f\2\2oq\7,\2\2p`\3\2\2\2pa\3\2\2\2pj\3\2\2\2qr\3\2\2\2rs\7\4\2\2st\5"+
		"D#\2t\13\3\2\2\2uv\7,\2\2v\u0082\7\3\2\2w\u0083\3\2\2\2x\u0083\5\16\b"+
		"\2yz\5\16\b\2z{\7\n\2\2{}\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~"+
		"\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\5\16\b\2\u0082"+
		"w\3\2\2\2\u0082x\3\2\2\2\u0082~\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
		"\7\4\2\2\u0085\r\3\2\2\2\u0086\u008b\5\20\t\2\u0087\u0088\7\25\2\2\u0088"+
		"\u008a\5\20\t\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\17\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0093\5\22\n\2\u008f\u0090\7\24\2\2\u0090\u0092\5\22\n\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\21\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0099\5\24\13\2\u0097\u0098\7\16"+
		"\2\2\u0098\u009a\5\24\13\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\23\3\2\2\2\u009b\u00a0\5\26\f\2\u009c\u009d\7\21\2\2\u009d\u009f\5\26"+
		"\f\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a8\5\30\r"+
		"\2\u00a4\u00a5\7\20\2\2\u00a5\u00a7\5\30\r\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\27\3\2\2"+
		"\2\u00aa\u00a8\3\2\2\2\u00ab\u00b0\5\32\16\2\u00ac\u00ad\7\22\2\2\u00ad"+
		"\u00af\5\32\16\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\31\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\5 \21\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\5\34\17\2\u00b7\33\3\2\2\2\u00b8\u00bd\5\36\20\2\u00b9"+
		"\u00ba\7\23\2\2\u00ba\u00bc\5\36\20\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\35\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c9\5\6\4\2\u00c1\u00c2\7\35\2\2\u00c2\u00c9\5"+
		"\4\3\2\u00c3\u00c9\5\f\7\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6\5\16\b\2\u00c6"+
		"\u00c7\7\4\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c1\3\2"+
		"\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00cb"+
		"\t\2\2\2\u00cb!\3\2\2\2\u00cc\u00cd\7&\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00d1"+
		"\7,\2\2\u00cf\u00d0\7\r\2\2\u00d0\u00d2\5\16\b\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2#\3\2\2\2\u00d3\u00d5\7\35\2\2\u00d4\u00d3\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\u00d8"+
		"\7\r\2\2\u00d8\u00d9\5\16\b\2\u00d9%\3\2\2\2\u00da\u00db\7\32\2\2\u00db"+
		"\u00dc\5D#\2\u00dc\'\3\2\2\2\u00dd\u00de\7\31\2\2\u00de\u00df\7\3\2\2"+
		"\u00df\u00e0\5\16\b\2\u00e0\u00e1\7\4\2\2\u00e1\u00e2\5D#\2\u00e2)\3\2"+
		"\2\2\u00e3\u00e4\7\30\2\2\u00e4\u00e5\7\3\2\2\u00e5\u00e6\5\16\b\2\u00e6"+
		"\u00e7\7\4\2\2\u00e7\u00eb\5D#\2\u00e8\u00ea\5(\25\2\u00e9\u00e8\3\2\2"+
		"\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\5&\24\2\u00ef\u00ee\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0+\3\2\2\2\u00f1\u00f2\7\33\2\2\u00f2\u00f5\7\3\2\2"+
		"\u00f3\u00f6\5$\23\2\u00f4\u00f6\5\"\22\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\13\2\2"+
		"\u00f8\u00f9\5\16\b\2\u00f9\u00fb\7\13\2\2\u00fa\u00fc\5<\37\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\4\2\2\u00fe"+
		"\u00ff\5D#\2\u00ff-\3\2\2\2\u0100\u0101\7\34\2\2\u0101\u0102\7\3\2\2\u0102"+
		"\u0103\5\16\b\2\u0103\u0104\7\4\2\2\u0104\u0105\5D#\2\u0105/\3\2\2\2\u0106"+
		"\u0107\7!\2\2\u0107\u0108\5\16\b\2\u0108\61\3\2\2\2\u0109\u010a\7\"\2"+
		"\2\u010a\u010b\5\16\b\2\u010b\63\3\2\2\2\u010c\u010d\7#\2\2\u010d\u010e"+
		"\7\3\2\2\u010e\u010f\5\16\b\2\u010f\u0110\7\n\2\2\u0110\u0111\5\16\b\2"+
		"\u0111\u0112\7\4\2\2\u0112\65\3\2\2\2\u0113\u0114\7$\2\2\u0114\u0115\7"+
		"\3\2\2\u0115\u0116\5\16\b\2\u0116\u0117\7\n\2\2\u0117\u0118\5\16\b\2\u0118"+
		"\u0119\7\n\2\2\u0119\u011a\5\16\b\2\u011a\u011b\7\n\2\2\u011b\u011c\5"+
		"\16\b\2\u011c\u011d\7\n\2\2\u011d\u011e\5\16\b\2\u011e\u011f\7\n\2\2\u011f"+
		"\u0120\5\16\b\2\u0120\u0121\7\n\2\2\u0121\u0122\5\16\b\2\u0122\u0123\7"+
		"\n\2\2\u0123\u0124\5\16\b\2\u0124\u0125\7\n\2\2\u0125\u0126\5\16\b\2\u0126"+
		"\u0127\7\4\2\2\u0127\67\3\2\2\2\u0128\u0129\7%\2\2\u0129\u012a\7\3\2\2"+
		"\u012a\u012b\7\4\2\2\u012b9\3\2\2\2\u012c\u0131\5\n\6\2\u012d\u0131\5"+
		"*\26\2\u012e\u0131\5,\27\2\u012f\u0131\5.\30\2\u0130\u012c\3\2\2\2\u0130"+
		"\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131;\3\2\2\2"+
		"\u0132\u013c\5$\23\2\u0133\u013c\5\"\22\2\u0134\u013c\5\f\7\2\u0135\u013c"+
		"\5\b\5\2\u0136\u013c\5\60\31\2\u0137\u013c\5\62\32\2\u0138\u013c\5\64"+
		"\33\2\u0139\u013c\5\66\34\2\u013a\u013c\58\35\2\u013b\u0132\3\2\2\2\u013b"+
		"\u0133\3\2\2\2\u013b\u0134\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2"+
		"\2\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013c=\3\2\2\2\u013d\u013e\5<\37\2\u013e\u013f\7\13\2\2"+
		"\u013f?\3\2\2\2\u0140\u0141\7\26\2\2\u0141A\3\2\2\2\u0142\u0143\7\27\2"+
		"\2\u0143C\3\2\2\2\u0144\u014d\5@!\2\u0145\u014e\3\2\2\2\u0146\u0149\5"+
		":\36\2\u0147\u0149\5> \2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u014a\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\5B\"\2\u0150E\3\2\2\2\36HJSZjp~\u0082\u008b"+
		"\u0093\u0099\u00a0\u00a8\u00b0\u00b4\u00bd\u00c8\u00d1\u00d4\u00eb\u00ef"+
		"\u00f5\u00fb\u0130\u013b\u0148\u014a\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}