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
		Star_Slash=16, Power=17, And=18, Or=19, Then=20, End=21, If=22, Else_If=23, 
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
			"ComparationToken", "Not", "Plus", "Minus", "Star", "Slash", "Star_Slash", 
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
			"Star_Slash", "Power", "And", "Or", "Then", "End", "If", "Else_If", "Else", 
			"For", "While", "Outer", "Return", "Break", "Continue", "Print", "Println", 
			"CreateScene", "CreateBox", "BuildScene", "Type", "White_Sign", "Int", 
			"Double", "Number", "Bool", "Id", "Comment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u01a6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00b0\n\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\5\36\u00be\n\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u014b\n\62\3\63\6\63\u014e\n\63\r\63\16\63\u014f"+
		"\3\63\3\63\3\64\3\64\7\64\u0156\n\64\f\64\16\64\u0159\13\64\3\64\5\64"+
		"\u015c\n\64\3\65\3\65\7\65\u0160\n\65\f\65\16\65\u0163\13\65\3\65\3\65"+
		"\7\65\u0167\n\65\f\65\16\65\u016a\13\65\3\65\3\65\3\65\3\65\7\65\u0170"+
		"\n\65\f\65\16\65\u0173\13\65\5\65\u0175\n\65\3\66\3\66\5\66\u0179\n\66"+
		"\3\67\3\67\5\67\u017d\n\67\38\38\58\u0181\n8\38\38\38\78\u0186\n8\f8\16"+
		"8\u0189\138\39\39\39\39\79\u018f\n9\f9\169\u0192\139\39\59\u0195\n9\3"+
		"9\39\39\39\39\79\u019c\n9\f9\169\u019f\139\39\39\59\u01a3\n9\39\39\3\u019d"+
		"\2:\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f"+
		"\37\r!\2#\2%\2\'\2)\2+\2-\2/\16\61\17\63\20\65\21\67\29\2;\22=\23?\24"+
		"A\25C\26E\27G\30I\31K\32M\33O\34Q\35S\36U\37W Y![\"]#_$a%c&e\'g(i)k*m"+
		"+o,q-\3\2\b\3\2c|\3\2C\\\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\2\u01b1\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13"+
		"{\3\2\2\2\r}\3\2\2\2\17\177\3\2\2\2\21\u0081\3\2\2\2\23\u0083\3\2\2\2"+
		"\25\u0085\3\2\2\2\27\u0087\3\2\2\2\31\u0089\3\2\2\2\33\u008b\3\2\2\2\35"+
		"\u008d\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u0097\3\2\2\2%\u009d\3"+
		"\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a4\3\2\2\2-\u00a7\3\2\2\2/\u00af"+
		"\3\2\2\2\61\u00b1\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3"+
		"\2\2\29\u00b9\3\2\2\2;\u00bd\3\2\2\2=\u00bf\3\2\2\2?\u00c2\3\2\2\2A\u00c6"+
		"\3\2\2\2C\u00c9\3\2\2\2E\u00ce\3\2\2\2G\u00d2\3\2\2\2I\u00d5\3\2\2\2K"+
		"\u00dd\3\2\2\2M\u00e2\3\2\2\2O\u00e6\3\2\2\2Q\u00ec\3\2\2\2S\u00f2\3\2"+
		"\2\2U\u00f9\3\2\2\2W\u00ff\3\2\2\2Y\u0108\3\2\2\2[\u010e\3\2\2\2]\u0116"+
		"\3\2\2\2_\u0122\3\2\2\2a\u012c\3\2\2\2c\u014a\3\2\2\2e\u014d\3\2\2\2g"+
		"\u015b\3\2\2\2i\u0174\3\2\2\2k\u0178\3\2\2\2m\u017c\3\2\2\2o\u0180\3\2"+
		"\2\2q\u01a2\3\2\2\2st\t\2\2\2t\4\3\2\2\2uv\t\3\2\2v\6\3\2\2\2wx\t\4\2"+
		"\2x\b\3\2\2\2yz\t\5\2\2z\n\3\2\2\2{|\7*\2\2|\f\3\2\2\2}~\7+\2\2~\16\3"+
		"\2\2\2\177\u0080\7}\2\2\u0080\20\3\2\2\2\u0081\u0082\7\177\2\2\u0082\22"+
		"\3\2\2\2\u0083\u0084\7]\2\2\u0084\24\3\2\2\2\u0085\u0086\7_\2\2\u0086"+
		"\26\3\2\2\2\u0087\u0088\7\60\2\2\u0088\30\3\2\2\2\u0089\u008a\7.\2\2\u008a"+
		"\32\3\2\2\2\u008b\u008c\7=\2\2\u008c\34\3\2\2\2\u008d\u008e\7<\2\2\u008e"+
		"\u008f\7<\2\2\u008f\36\3\2\2\2\u0090\u0091\7?\2\2\u0091 \3\2\2\2\u0092"+
		"\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095\7w\2\2\u0095\u0096\7g\2\2"+
		"\u0096\"\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7c\2\2\u0099\u009a\7n"+
		"\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c$\3\2\2\2\u009d\u009e"+
		"\7>\2\2\u009e&\3\2\2\2\u009f\u00a0\7@\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7"+
		">\2\2\u00a2\u00a3\7?\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\u00a6"+
		"\7?\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8\u00a9\7?\2\2\u00a9.\3"+
		"\2\2\2\u00aa\u00b0\5%\23\2\u00ab\u00b0\5\'\24\2\u00ac\u00b0\5)\25\2\u00ad"+
		"\u00b0\5+\26\2\u00ae\u00b0\5-\27\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2"+
		"\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\60\3\2\2\2\u00b1\u00b2\7#\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4"+
		"\64\3\2\2\2\u00b5\u00b6\7/\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8"+
		"8\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba:\3\2\2\2\u00bb\u00be\5\67\34\2\u00bc"+
		"\u00be\59\35\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be<\3\2\2\2"+
		"\u00bf\u00c0\7,\2\2\u00c0\u00c1\7,\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7c\2"+
		"\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7f\2\2\u00c5@\3\2\2\2\u00c6\u00c7\7"+
		"q\2\2\u00c7\u00c8\7t\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb"+
		"\7j\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cdD\3\2\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7f\2\2\u00d1F\3\2\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d4\7h\2\2\u00d4H\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7"+
		"\7n\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7\"\2\2\u00da"+
		"\u00db\7k\2\2\u00db\u00dc\7h\2\2\u00dcJ\3\2\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7n\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1L\3\2\2\2\u00e2"+
		"\u00e3\7h\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7t\2\2\u00e5N\3\2\2\2\u00e6"+
		"\u00e7\7y\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7n\2\2"+
		"\u00ea\u00eb\7g\2\2\u00ebP\3\2\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7w\2"+
		"\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7t\2\2\u00f1R\3\2"+
		"\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6"+
		"\7w\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7p\2\2\u00f8T\3\2\2\2\u00f9\u00fa"+
		"\7d\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7c\2\2\u00fd"+
		"\u00fe\7m\2\2\u00feV\3\2\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7q\2\2\u0101"+
		"\u0102\7p\2\2\u0102\u0103\7v\2\2\u0103\u0104\7k\2\2\u0104\u0105\7p\2\2"+
		"\u0105\u0106\7w\2\2\u0106\u0107\7g\2\2\u0107X\3\2\2\2\u0108\u0109\7r\2"+
		"\2\u0109\u010a\7t\2\2\u010a\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c\u010d"+
		"\7v\2\2\u010dZ\3\2\2\2\u010e\u010f\7r\2\2\u010f\u0110\7t\2\2\u0110\u0111"+
		"\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7v\2\2\u0113\u0114\7n\2\2\u0114"+
		"\u0115\7p\2\2\u0115\\\3\2\2\2\u0116\u0117\7e\2\2\u0117\u0118\7t\2\2\u0118"+
		"\u0119\7g\2\2\u0119\u011a\7c\2\2\u011a\u011b\7v\2\2\u011b\u011c\7g\2\2"+
		"\u011c\u011d\7U\2\2\u011d\u011e\7e\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7p\2\2\u0120\u0121\7g\2\2\u0121^\3\2\2\2\u0122\u0123\7e\2\2\u0123\u0124"+
		"\7t\2\2\u0124\u0125\7g\2\2\u0125\u0126\7c\2\2\u0126\u0127\7v\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7D\2\2\u0129\u012a\7q\2\2\u012a\u012b\7z\2\2"+
		"\u012b`\3\2\2\2\u012c\u012d\7d\2\2\u012d\u012e\7w\2\2\u012e\u012f\7k\2"+
		"\2\u012f\u0130\7n\2\2\u0130\u0131\7f\2\2\u0131\u0132\7U\2\2\u0132\u0133"+
		"\7e\2\2\u0133\u0134\7g\2\2\u0134\u0135\7p\2\2\u0135\u0136\7g\2\2\u0136"+
		"b\3\2\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139\u014b\7v\2\2\u013a"+
		"\u013b\7d\2\2\u013b\u013c\7q\2\2\u013c\u013d\7q\2\2\u013d\u014b\7n\2\2"+
		"\u013e\u013f\7u\2\2\u013f\u0140\7v\2\2\u0140\u0141\7t\2\2\u0141\u0142"+
		"\7k\2\2\u0142\u0143\7p\2\2\u0143\u014b\7i\2\2\u0144\u0145\7f\2\2\u0145"+
		"\u0146\7q\2\2\u0146\u0147\7w\2\2\u0147\u0148\7d\2\2\u0148\u0149\7n\2\2"+
		"\u0149\u014b\7g\2\2\u014a\u0137\3\2\2\2\u014a\u013a\3\2\2\2\u014a\u013e"+
		"\3\2\2\2\u014a\u0144\3\2\2\2\u014bd\3\2\2\2\u014c\u014e\t\6\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b\63\2\2\u0152f\3\2\2\2\u0153\u0157"+
		"\5\7\4\2\u0154\u0156\5\t\5\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015c\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015c\7\62\2\2\u015b\u0153\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"h\3\2\2\2\u015d\u0161\5\7\4\2\u015e\u0160\5\t\5\2\u015f\u015e\3\2\2\2"+
		"\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0168\7\60\2\2\u0165\u0167\5\t\5\2"+
		"\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u0175\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\62\2\2"+
		"\u016c\u016d\7\60\2\2\u016d\u0171\3\2\2\2\u016e\u0170\5\t\5\2\u016f\u016e"+
		"\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u015d\3\2\2\2\u0174\u016b\3\2"+
		"\2\2\u0175j\3\2\2\2\u0176\u0179\5g\64\2\u0177\u0179\5i\65\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0177\3\2\2\2\u0179l\3\2\2\2\u017a\u017d\5#\22\2\u017b"+
		"\u017d\5!\21\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017dn\3\2\2\2"+
		"\u017e\u0181\5\3\2\2\u017f\u0181\5\5\3\2\u0180\u017e\3\2\2\2\u0180\u017f"+
		"\3\2\2\2\u0181\u0187\3\2\2\2\u0182\u0186\5\3\2\2\u0183\u0186\5\5\3\2\u0184"+
		"\u0186\5\t\5\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2"+
		"\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"p\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7\61\2\2\u018b\u018c\7\61\2"+
		"\2\u018c\u0190\3\2\2\2\u018d\u018f\n\7\2\2\u018e\u018d\3\2\2\2\u018f\u0192"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0195\7\17\2\2\u0194\u0193\3\2\2\2\u0194\u0195\3"+
		"\2\2\2\u0195\u0196\3\2\2\2\u0196\u01a3\7\f\2\2\u0197\u0198\7\61\2\2\u0198"+
		"\u0199\7,\2\2\u0199\u019d\3\2\2\2\u019a\u019c\13\2\2\2\u019b\u019a\3\2"+
		"\2\2\u019c\u019f\3\2\2\2\u019d\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7,\2\2\u01a1\u01a3\7\61"+
		"\2\2\u01a2\u018a\3\2\2\2\u01a2\u0197\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a5\b9\3\2\u01a5r\3\2\2\2\26\2\u00af\u00bd\u014a\u014f\u0157\u015b"+
		"\u0161\u0168\u0171\u0174\u0178\u017c\u0180\u0185\u0187\u0190\u0194\u019d"+
		"\u01a2\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}