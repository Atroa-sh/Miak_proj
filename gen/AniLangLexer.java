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
		Assign=10, Lesser=11, Greater=12, Leq=13, Geq=14, Equals=15, Not=16, Plus=17, 
		Minus=18, Star=19, Slash=20, And=21, Or=22, If=23, Else_If=24, Else=25, 
		For=26, While=27, White_Sign=28, String=29, Int=30, Double=31, Number=32, 
		Bool=33, Id=34, Comment=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Lowercase", "Uppercase", "Digit", "Open_Parenthesis", "Close_Parenthesis", 
			"Open_Bracket", "Close_Bracket", "Open_Square_Bracket", "Close_Square_Bracket", 
			"Dot", "Comma", "Semicolon", "Assign", "True", "False", "Lesser", "Greater", 
			"Leq", "Geq", "Equals", "Not", "Plus", "Minus", "Star", "Slash", "And", 
			"Or", "If", "Else_If", "Else", "For", "While", "White_Sign", "String", 
			"Int", "Double", "Number", "Bool", "Id", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "','", "';'", 
			"'='", "'<'", "'>'", "'<='", "'>='", "'=='", "'!'", "'+'", "'-'", "'*'", 
			"'/'", "'and'", "'or'", "'if'", "'else if'", "'else'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Open_Parenthesis", "Close_Parenthesis", "Open_Bracket", "Close_Bracket", 
			"Open_Square_Bracket", "Close_Square_Bracket", "Dot", "Comma", "Semicolon", 
			"Assign", "Lesser", "Greater", "Leq", "Geq", "Equals", "Not", "Plus", 
			"Minus", "Star", "Slash", "And", "Or", "If", "Else_If", "Else", "For", 
			"While", "White_Sign", "String", "Int", "Double", "Number", "Bool", "Id", 
			"Comment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\7#\u00ba\n#\f#\16#\u00bd\13#\3#\3#\3$\5$\u00c2\n"+
		"$\3$\6$\u00c5\n$\r$\16$\u00c6\3%\5%\u00ca\n%\3%\6%\u00cd\n%\r%\16%\u00ce"+
		"\3%\3%\6%\u00d3\n%\r%\16%\u00d4\3&\3&\5&\u00d9\n&\3\'\3\'\5\'\u00dd\n"+
		"\'\3(\3(\5(\u00e1\n(\3(\3(\3(\7(\u00e6\n(\f(\16(\u00e9\13(\3)\3)\3)\3"+
		")\7)\u00ef\n)\f)\16)\u00f2\13)\3)\3)\2\2*\3\2\5\2\7\2\t\3\13\4\r\5\17"+
		"\6\21\7\23\b\25\t\27\n\31\13\33\f\35\2\37\2!\r#\16%\17\'\20)\21+\22-\23"+
		"/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%"+
		"\3\2\7\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00ff\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2"+
		"\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2"+
		"\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2"+
		"\2\2\35m\3\2\2\2\37r\3\2\2\2!x\3\2\2\2#z\3\2\2\2%|\3\2\2\2\'\177\3\2\2"+
		"\2)\u0082\3\2\2\2+\u0085\3\2\2\2-\u0087\3\2\2\2/\u0089\3\2\2\2\61\u008b"+
		"\3\2\2\2\63\u008d\3\2\2\2\65\u008f\3\2\2\2\67\u0093\3\2\2\29\u0096\3\2"+
		"\2\2;\u0099\3\2\2\2=\u00a1\3\2\2\2?\u00a6\3\2\2\2A\u00aa\3\2\2\2C\u00b0"+
		"\3\2\2\2E\u00b4\3\2\2\2G\u00c1\3\2\2\2I\u00c9\3\2\2\2K\u00d8\3\2\2\2M"+
		"\u00dc\3\2\2\2O\u00e0\3\2\2\2Q\u00ea\3\2\2\2ST\t\2\2\2T\4\3\2\2\2UV\t"+
		"\3\2\2V\6\3\2\2\2WX\t\4\2\2X\b\3\2\2\2YZ\7*\2\2Z\n\3\2\2\2[\\\7+\2\2\\"+
		"\f\3\2\2\2]^\7}\2\2^\16\3\2\2\2_`\7\177\2\2`\20\3\2\2\2ab\7]\2\2b\22\3"+
		"\2\2\2cd\7_\2\2d\24\3\2\2\2ef\7\60\2\2f\26\3\2\2\2gh\7.\2\2h\30\3\2\2"+
		"\2ij\7=\2\2j\32\3\2\2\2kl\7?\2\2l\34\3\2\2\2mn\7v\2\2no\7t\2\2op\7w\2"+
		"\2pq\7g\2\2q\36\3\2\2\2rs\7h\2\2st\7c\2\2tu\7n\2\2uv\7u\2\2vw\7g\2\2w"+
		" \3\2\2\2xy\7>\2\2y\"\3\2\2\2z{\7@\2\2{$\3\2\2\2|}\7>\2\2}~\7?\2\2~&\3"+
		"\2\2\2\177\u0080\7@\2\2\u0080\u0081\7?\2\2\u0081(\3\2\2\2\u0082\u0083"+
		"\7?\2\2\u0083\u0084\7?\2\2\u0084*\3\2\2\2\u0085\u0086\7#\2\2\u0086,\3"+
		"\2\2\2\u0087\u0088\7-\2\2\u0088.\3\2\2\2\u0089\u008a\7/\2\2\u008a\60\3"+
		"\2\2\2\u008b\u008c\7,\2\2\u008c\62\3\2\2\2\u008d\u008e\7\61\2\2\u008e"+
		"\64\3\2\2\2\u008f\u0090\7c\2\2\u0090\u0091\7p\2\2\u0091\u0092\7f\2\2\u0092"+
		"\66\3\2\2\2\u0093\u0094\7q\2\2\u0094\u0095\7t\2\2\u00958\3\2\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098:\3\2\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d\u009e\7\"\2"+
		"\2\u009e\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0<\3\2\2\2\u00a1\u00a2\7"+
		"g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5>"+
		"\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"@\3\2\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00afB\3\2\2\2\u00b0\u00b1\t\5\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\b\"\2\2\u00b3D\3\2\2\2\u00b4\u00bb\7$\2\2\u00b5"+
		"\u00ba\5\3\2\2\u00b6\u00ba\5\5\3\2\u00b7\u00ba\5\7\4\2\u00b8\u00ba\5C"+
		"\"\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7$\2\2\u00bf"+
		"F\3\2\2\2\u00c0\u00c2\7/\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c5\5\7\4\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7H\3\2\2\2\u00c8\u00ca"+
		"\7/\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00cd\5\7\4\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7\60\2\2\u00d1"+
		"\u00d3\5\7\4\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5J\3\2\2\2\u00d6\u00d9\5G$\2\u00d7\u00d9"+
		"\5I%\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9L\3\2\2\2\u00da\u00dd"+
		"\5\37\20\2\u00db\u00dd\5\35\17\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2"+
		"\2\u00ddN\3\2\2\2\u00de\u00e1\5\3\2\2\u00df\u00e1\5\5\3\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e7\3\2\2\2\u00e2\u00e6\5\3\2\2\u00e3"+
		"\u00e6\5\5\3\2\u00e4\u00e6\5\7\4\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8P\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\61\2\2"+
		"\u00eb\u00ec\7\61\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00ef\n\6\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b)\3\2\u00f4R\3\2\2\2\20"+
		"\2\u00b9\u00bb\u00c1\u00c6\u00c9\u00ce\u00d4\u00d8\u00dc\u00e0\u00e5\u00e7"+
		"\u00f0\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}