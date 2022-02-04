// Generated from /Users/tluszczyk/dev/JAVA/AGH/semV/MIAK/AniLang/AniLangLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AniLangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Lowercase", "Uppercase", "PositiveDigit", "Digit", "Open_Parenthesis", 
			"Close_Parenthesis", "Open_Bracket", "Close_Bracket", "Open_Square_Bracket", 
			"Close_Square_Bracket", "Dot", "Comma", "Semicolon", "TypeSeparator", 
			"Assign", "True", "False", "Lesser", "Greater", "Leq", "Geq", "Equals", 
			"ComparationToken", "Not", "Plus", "Minus", "Star", "Slash", "Mod", "Star_Slash_Mod", 
			"Power", "And", "Or", "Then", "End", "If", "Else_If", "Else", "For", 
			"While", "Outer", "Return", "Break", "Continue", "Print", "Println", 
			"CreateScene", "CreateBox", "BuildScene", "Type", "White_Sign", "Int", 
			"Double", "Number", "Bool", "Id", "Comment"
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


	public AniLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AniLangLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u01ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00b2\n\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\5\37\u00c3\n\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0150"+
		"\n\63\3\64\6\64\u0153\n\64\r\64\16\64\u0154\3\64\3\64\3\65\3\65\7\65\u015b"+
		"\n\65\f\65\16\65\u015e\13\65\3\65\5\65\u0161\n\65\3\66\3\66\7\66\u0165"+
		"\n\66\f\66\16\66\u0168\13\66\3\66\3\66\7\66\u016c\n\66\f\66\16\66\u016f"+
		"\13\66\3\66\3\66\3\66\3\66\7\66\u0175\n\66\f\66\16\66\u0178\13\66\5\66"+
		"\u017a\n\66\3\67\3\67\5\67\u017e\n\67\38\38\58\u0182\n8\39\39\59\u0186"+
		"\n9\39\39\39\79\u018b\n9\f9\169\u018e\139\3:\3:\3:\3:\7:\u0194\n:\f:\16"+
		":\u0197\13:\3:\5:\u019a\n:\3:\3:\3:\3:\3:\7:\u01a1\n:\f:\16:\u01a4\13"+
		":\3:\3:\5:\u01a8\n:\3:\3:\3\u01a2\2;\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21"+
		"\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\2#\2%\2\'\2)\2+\2-\2/\16\61\17"+
		"\63\20\65\21\67\29\2;\2=\22?\23A\24C\25E\26G\27I\30K\31M\32O\33Q\34S\35"+
		"U\36W\37Y [!]\"_#a$c%e&g\'i(k)m*o+q,s-\3\2\b\3\2c|\3\2C\\\3\2\63;\3\2"+
		"\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u01b6\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5"+
		"w\3\2\2\2\7y\3\2\2\2\t{\3\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081\3\2"+
		"\2\2\21\u0083\3\2\2\2\23\u0085\3\2\2\2\25\u0087\3\2\2\2\27\u0089\3\2\2"+
		"\2\31\u008b\3\2\2\2\33\u008d\3\2\2\2\35\u008f\3\2\2\2\37\u0092\3\2\2\2"+
		"!\u0094\3\2\2\2#\u0099\3\2\2\2%\u009f\3\2\2\2\'\u00a1\3\2\2\2)\u00a3\3"+
		"\2\2\2+\u00a6\3\2\2\2-\u00a9\3\2\2\2/\u00b1\3\2\2\2\61\u00b3\3\2\2\2\63"+
		"\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3\2\2\29\u00bb\3\2\2\2;\u00bd"+
		"\3\2\2\2=\u00c2\3\2\2\2?\u00c4\3\2\2\2A\u00c7\3\2\2\2C\u00cb\3\2\2\2E"+
		"\u00ce\3\2\2\2G\u00d3\3\2\2\2I\u00d7\3\2\2\2K\u00da\3\2\2\2M\u00e2\3\2"+
		"\2\2O\u00e7\3\2\2\2Q\u00eb\3\2\2\2S\u00f1\3\2\2\2U\u00f7\3\2\2\2W\u00fe"+
		"\3\2\2\2Y\u0104\3\2\2\2[\u010d\3\2\2\2]\u0113\3\2\2\2_\u011b\3\2\2\2a"+
		"\u0127\3\2\2\2c\u0131\3\2\2\2e\u014f\3\2\2\2g\u0152\3\2\2\2i\u0160\3\2"+
		"\2\2k\u0179\3\2\2\2m\u017d\3\2\2\2o\u0181\3\2\2\2q\u0185\3\2\2\2s\u01a7"+
		"\3\2\2\2uv\t\2\2\2v\4\3\2\2\2wx\t\3\2\2x\6\3\2\2\2yz\t\4\2\2z\b\3\2\2"+
		"\2{|\t\5\2\2|\n\3\2\2\2}~\7*\2\2~\f\3\2\2\2\177\u0080\7+\2\2\u0080\16"+
		"\3\2\2\2\u0081\u0082\7}\2\2\u0082\20\3\2\2\2\u0083\u0084\7\177\2\2\u0084"+
		"\22\3\2\2\2\u0085\u0086\7]\2\2\u0086\24\3\2\2\2\u0087\u0088\7_\2\2\u0088"+
		"\26\3\2\2\2\u0089\u008a\7\60\2\2\u008a\30\3\2\2\2\u008b\u008c\7.\2\2\u008c"+
		"\32\3\2\2\2\u008d\u008e\7=\2\2\u008e\34\3\2\2\2\u008f\u0090\7<\2\2\u0090"+
		"\u0091\7<\2\2\u0091\36\3\2\2\2\u0092\u0093\7?\2\2\u0093 \3\2\2\2\u0094"+
		"\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7w\2\2\u0097\u0098\7g\2\2"+
		"\u0098\"\3\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n"+
		"\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e$\3\2\2\2\u009f\u00a0"+
		"\7>\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7"+
		">\2\2\u00a4\u00a5\7?\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7?\2\2\u00ab.\3"+
		"\2\2\2\u00ac\u00b2\5%\23\2\u00ad\u00b2\5\'\24\2\u00ae\u00b2\5)\25\2\u00af"+
		"\u00b2\5+\26\2\u00b0\u00b2\5-\27\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2"+
		"\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\60\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6"+
		"\64\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8\66\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba"+
		"8\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc:\3\2\2\2\u00bd\u00be\7\'\2\2\u00be"+
		"<\3\2\2\2\u00bf\u00c3\5\67\34\2\u00c0\u00c3\59\35\2\u00c1\u00c3\5;\36"+
		"\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3>"+
		"\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c6\7,\2\2\u00c6@\3\2\2\2\u00c7\u00c8"+
		"\7c\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7f\2\2\u00caB\3\2\2\2\u00cb\u00cc"+
		"\7q\2\2\u00cc\u00cd\7t\2\2\u00cdD\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0"+
		"\7j\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2F\3\2\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7f\2\2\u00d6H\3\2\2\2\u00d7\u00d8"+
		"\7k\2\2\u00d8\u00d9\7h\2\2\u00d9J\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc"+
		"\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7\"\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7h\2\2\u00e1L\3\2\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"\u00e4\7n\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e6N\3\2\2\2\u00e7"+
		"\u00e8\7h\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7t\2\2\u00eaP\3\2\2\2\u00eb"+
		"\u00ec\7y\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7n\2\2"+
		"\u00ef\u00f0\7g\2\2\u00f0R\3\2\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7w\2"+
		"\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7t\2\2\u00f6T\3\2"+
		"\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb"+
		"\7w\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7p\2\2\u00fdV\3\2\2\2\u00fe\u00ff"+
		"\7d\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7g\2\2\u0101\u0102\7c\2\2\u0102"+
		"\u0103\7m\2\2\u0103X\3\2\2\2\u0104\u0105\7e\2\2\u0105\u0106\7q\2\2\u0106"+
		"\u0107\7p\2\2\u0107\u0108\7v\2\2\u0108\u0109\7k\2\2\u0109\u010a\7p\2\2"+
		"\u010a\u010b\7w\2\2\u010b\u010c\7g\2\2\u010cZ\3\2\2\2\u010d\u010e\7r\2"+
		"\2\u010e\u010f\7t\2\2\u010f\u0110\7k\2\2\u0110\u0111\7p\2\2\u0111\u0112"+
		"\7v\2\2\u0112\\\3\2\2\2\u0113\u0114\7r\2\2\u0114\u0115\7t\2\2\u0115\u0116"+
		"\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118\7v\2\2\u0118\u0119\7n\2\2\u0119"+
		"\u011a\7p\2\2\u011a^\3\2\2\2\u011b\u011c\7e\2\2\u011c\u011d\7t\2\2\u011d"+
		"\u011e\7g\2\2\u011e\u011f\7c\2\2\u011f\u0120\7v\2\2\u0120\u0121\7g\2\2"+
		"\u0121\u0122\7U\2\2\u0122\u0123\7e\2\2\u0123\u0124\7g\2\2\u0124\u0125"+
		"\7p\2\2\u0125\u0126\7g\2\2\u0126`\3\2\2\2\u0127\u0128\7e\2\2\u0128\u0129"+
		"\7t\2\2\u0129\u012a\7g\2\2\u012a\u012b\7c\2\2\u012b\u012c\7v\2\2\u012c"+
		"\u012d\7g\2\2\u012d\u012e\7D\2\2\u012e\u012f\7q\2\2\u012f\u0130\7z\2\2"+
		"\u0130b\3\2\2\2\u0131\u0132\7d\2\2\u0132\u0133\7w\2\2\u0133\u0134\7k\2"+
		"\2\u0134\u0135\7n\2\2\u0135\u0136\7f\2\2\u0136\u0137\7U\2\2\u0137\u0138"+
		"\7e\2\2\u0138\u0139\7g\2\2\u0139\u013a\7p\2\2\u013a\u013b\7g\2\2\u013b"+
		"d\3\2\2\2\u013c\u013d\7k\2\2\u013d\u013e\7p\2\2\u013e\u0150\7v\2\2\u013f"+
		"\u0140\7d\2\2\u0140\u0141\7q\2\2\u0141\u0142\7q\2\2\u0142\u0150\7n\2\2"+
		"\u0143\u0144\7u\2\2\u0144\u0145\7v\2\2\u0145\u0146\7t\2\2\u0146\u0147"+
		"\7k\2\2\u0147\u0148\7p\2\2\u0148\u0150\7i\2\2\u0149\u014a\7f\2\2\u014a"+
		"\u014b\7q\2\2\u014b\u014c\7w\2\2\u014c\u014d\7d\2\2\u014d\u014e\7n\2\2"+
		"\u014e\u0150\7g\2\2\u014f\u013c\3\2\2\2\u014f\u013f\3\2\2\2\u014f\u0143"+
		"\3\2\2\2\u014f\u0149\3\2\2\2\u0150f\3\2\2\2\u0151\u0153\t\6\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b\64\2\2\u0157h\3\2\2\2\u0158\u015c"+
		"\5\7\4\2\u0159\u015b\5\t\5\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0161\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015f\u0161\7\62\2\2\u0160\u0158\3\2\2\2\u0160\u015f\3\2\2\2\u0161"+
		"j\3\2\2\2\u0162\u0166\5\7\4\2\u0163\u0165\5\t\5\2\u0164\u0163\3\2\2\2"+
		"\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016d\7\60\2\2\u016a\u016c\5\t\5\2"+
		"\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u017a\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\62\2\2"+
		"\u0171\u0172\7\60\2\2\u0172\u0176\3\2\2\2\u0173\u0175\5\t\5\2\u0174\u0173"+
		"\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u0162\3\2\2\2\u0179\u0170\3\2"+
		"\2\2\u017al\3\2\2\2\u017b\u017e\5i\65\2\u017c\u017e\5k\66\2\u017d\u017b"+
		"\3\2\2\2\u017d\u017c\3\2\2\2\u017en\3\2\2\2\u017f\u0182\5#\22\2\u0180"+
		"\u0182\5!\21\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182p\3\2\2\2"+
		"\u0183\u0186\5\3\2\2\u0184\u0186\5\5\3\2\u0185\u0183\3\2\2\2\u0185\u0184"+
		"\3\2\2\2\u0186\u018c\3\2\2\2\u0187\u018b\5\3\2\2\u0188\u018b\5\5\3\2\u0189"+
		"\u018b\5\t\5\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2"+
		"\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"r\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\61\2\2\u0190\u0191\7\61\2"+
		"\2\u0191\u0195\3\2\2\2\u0192\u0194\n\7\2\2\u0193\u0192\3\2\2\2\u0194\u0197"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u019a\7\17\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3"+
		"\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a8\7\f\2\2\u019c\u019d\7\61\2\2\u019d"+
		"\u019e\7,\2\2\u019e\u01a2\3\2\2\2\u019f\u01a1\13\2\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7,\2\2\u01a6\u01a8\7\61"+
		"\2\2\u01a7\u018f\3\2\2\2\u01a7\u019c\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\b:\3\2\u01aat\3\2\2\2\26\2\u00b1\u00c2\u014f\u0154\u015c\u0160"+
		"\u0166\u016d\u0176\u0179\u017d\u0181\u0185\u018a\u018c\u0195\u0199\u01a2"+
		"\u01a7\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}