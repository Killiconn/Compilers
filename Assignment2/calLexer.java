// Generated from cal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, ASSIGN=3, PLUS=4, NEG=5, LOGNEG=6, EQUAL=7, NOEQ=8, LESS=9, 
		LESSEQ=10, GREAT=11, GREATEQ=12, SEMI=13, LBR=14, RBR=15, COMMA=16, COLON=17, 
		Variable=18, Constant=19, Return=20, Integer=21, Boolean=22, Void=23, 
		Main=24, If=25, Else=26, True=27, False=28, While=29, Begin=30, End=31, 
		Is=32, Skip=33, WS=34, COMMENT_1=35, COMMENT_2=36, ID=37, NUMBER=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "Digit", "Letter", 
		"Underscore", "Brackets", "Comment_open", "Comment_close", "OR", "AND", 
		"ASSIGN", "PLUS", "NEG", "LOGNEG", "EQUAL", "NOEQ", "LESS", "LESSEQ", 
		"GREAT", "GREATEQ", "SEMI", "LBR", "RBR", "COMMA", "COLON", "Variable", 
		"Constant", "Return", "Integer", "Boolean", "Void", "Main", "If", "Else", 
		"True", "False", "While", "Begin", "End", "Is", "Skip", "WS", "COMMENT_1", 
		"COMMENT_2", "ID", "NUMBER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'|'", "'&'", "':='", "'+'", "'-'", "'~'", "'='", "'!='", "'<'", 
		"'<='", "'>'", "'>='", "';'", "'('", "')'", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OR", "AND", "ASSIGN", "PLUS", "NEG", "LOGNEG", "EQUAL", "NOEQ", 
		"LESS", "LESSEQ", "GREAT", "GREATEQ", "SEMI", "LBR", "RBR", "COMMA", "COLON", 
		"Variable", "Constant", "Return", "Integer", "Boolean", "Void", "Main", 
		"If", "Else", "True", "False", "While", "Begin", "End", "Is", "Skip", 
		"WS", "COMMENT_1", "COMMENT_2", "ID", "NUMBER"
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


	public calLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u018f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		")\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"8\38\38\38\38\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3"+
		"=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3"+
		"A\3A\3B\3B\3B\3B\3B\3C\6C\u0158\nC\rC\16C\u0159\3C\3C\3D\3D\3D\3D\7D\u0162"+
		"\nD\fD\16D\u0165\13D\3D\3D\3E\3E\3E\7E\u016c\nE\fE\16E\u016f\13E\3E\3"+
		"E\3E\3E\3F\3F\3F\3F\7F\u0179\nF\fF\16F\u017c\13F\3G\3G\7G\u0180\nG\fG"+
		"\16G\u0183\13G\3G\3G\3G\7G\u0188\nG\fG\16G\u018b\13G\3G\5G\u018e\nG\3"+
		"\u016d\2H\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2"+
		"\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2"+
		"C\3E\4G\5I\6K\7M\bO\tQ\nS\13U\fW\rY\16[\17]\20_\21a\22c\23e\24g\25i\26"+
		"k\27m\30o\31q\32s\33u\34w\35y\36{\37} \177!\u0081\"\u0083#\u0085$\u0087"+
		"%\u0089&\u008b\'\u008d(\3\2\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg"+
		"\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2P"+
		"Ppp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4"+
		"\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\3\2\63;\3\2\62\62\2\u0179\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\3\u008f\3\2\2\2\5\u0091\3\2\2\2\7\u0093\3\2\2\2\t\u0095\3\2\2\2\13"+
		"\u0097\3\2\2\2\r\u0099\3\2\2\2\17\u009b\3\2\2\2\21\u009d\3\2\2\2\23\u009f"+
		"\3\2\2\2\25\u00a1\3\2\2\2\27\u00a3\3\2\2\2\31\u00a5\3\2\2\2\33\u00a7\3"+
		"\2\2\2\35\u00a9\3\2\2\2\37\u00ab\3\2\2\2!\u00ad\3\2\2\2#\u00af\3\2\2\2"+
		"%\u00b1\3\2\2\2\'\u00b3\3\2\2\2)\u00b5\3\2\2\2+\u00b7\3\2\2\2-\u00b9\3"+
		"\2\2\2/\u00bb\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2\65\u00c1\3\2\2"+
		"\2\67\u00c3\3\2\2\29\u00c5\3\2\2\2;\u00c7\3\2\2\2=\u00c9\3\2\2\2?\u00cc"+
		"\3\2\2\2A\u00cf\3\2\2\2C\u00d2\3\2\2\2E\u00d4\3\2\2\2G\u00d6\3\2\2\2I"+
		"\u00d9\3\2\2\2K\u00db\3\2\2\2M\u00dd\3\2\2\2O\u00df\3\2\2\2Q\u00e1\3\2"+
		"\2\2S\u00e4\3\2\2\2U\u00e6\3\2\2\2W\u00e9\3\2\2\2Y\u00eb\3\2\2\2[\u00ee"+
		"\3\2\2\2]\u00f0\3\2\2\2_\u00f2\3\2\2\2a\u00f4\3\2\2\2c\u00f6\3\2\2\2e"+
		"\u00f8\3\2\2\2g\u0101\3\2\2\2i\u010a\3\2\2\2k\u0111\3\2\2\2m\u0119\3\2"+
		"\2\2o\u0121\3\2\2\2q\u0126\3\2\2\2s\u012b\3\2\2\2u\u012e\3\2\2\2w\u0133"+
		"\3\2\2\2y\u0138\3\2\2\2{\u013e\3\2\2\2}\u0144\3\2\2\2\177\u014a\3\2\2"+
		"\2\u0081\u014e\3\2\2\2\u0083\u0151\3\2\2\2\u0085\u0157\3\2\2\2\u0087\u015d"+
		"\3\2\2\2\u0089\u0168\3\2\2\2\u008b\u0174\3\2\2\2\u008d\u018d\3\2\2\2\u008f"+
		"\u0090\t\2\2\2\u0090\4\3\2\2\2\u0091\u0092\t\3\2\2\u0092\6\3\2\2\2\u0093"+
		"\u0094\t\4\2\2\u0094\b\3\2\2\2\u0095\u0096\t\5\2\2\u0096\n\3\2\2\2\u0097"+
		"\u0098\t\6\2\2\u0098\f\3\2\2\2\u0099\u009a\t\7\2\2\u009a\16\3\2\2\2\u009b"+
		"\u009c\t\b\2\2\u009c\20\3\2\2\2\u009d\u009e\t\t\2\2\u009e\22\3\2\2\2\u009f"+
		"\u00a0\t\n\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\t\13\2\2\u00a2\26\3\2\2\2"+
		"\u00a3\u00a4\t\f\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\t\r\2\2\u00a6\32\3\2"+
		"\2\2\u00a7\u00a8\t\16\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\t\17\2\2\u00aa"+
		"\36\3\2\2\2\u00ab\u00ac\t\20\2\2\u00ac \3\2\2\2\u00ad\u00ae\t\21\2\2\u00ae"+
		"\"\3\2\2\2\u00af\u00b0\t\22\2\2\u00b0$\3\2\2\2\u00b1\u00b2\t\23\2\2\u00b2"+
		"&\3\2\2\2\u00b3\u00b4\t\24\2\2\u00b4(\3\2\2\2\u00b5\u00b6\t\25\2\2\u00b6"+
		"*\3\2\2\2\u00b7\u00b8\t\26\2\2\u00b8,\3\2\2\2\u00b9\u00ba\t\27\2\2\u00ba"+
		".\3\2\2\2\u00bb\u00bc\t\30\2\2\u00bc\60\3\2\2\2\u00bd\u00be\t\31\2\2\u00be"+
		"\62\3\2\2\2\u00bf\u00c0\t\32\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\t\33\2\2"+
		"\u00c2\66\3\2\2\2\u00c3\u00c4\t\34\2\2\u00c48\3\2\2\2\u00c5\u00c6\t\35"+
		"\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7a\2\2\u00c8<\3\2\2\2\u00c9\u00ca\7*\2"+
		"\2\u00ca\u00cb\7+\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce"+
		"\7,\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0\u00d1\7\61\2\2\u00d1B"+
		"\3\2\2\2\u00d2\u00d3\7~\2\2\u00d3D\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5F\3"+
		"\2\2\2\u00d6\u00d7\7<\2\2\u00d7\u00d8\7?\2\2\u00d8H\3\2\2\2\u00d9\u00da"+
		"\7-\2\2\u00daJ\3\2\2\2\u00db\u00dc\7/\2\2\u00dcL\3\2\2\2\u00dd\u00de\7"+
		"\u0080\2\2\u00deN\3\2\2\2\u00df\u00e0\7?\2\2\u00e0P\3\2\2\2\u00e1\u00e2"+
		"\7#\2\2\u00e2\u00e3\7?\2\2\u00e3R\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5T\3"+
		"\2\2\2\u00e6\u00e7\7>\2\2\u00e7\u00e8\7?\2\2\u00e8V\3\2\2\2\u00e9\u00ea"+
		"\7@\2\2\u00eaX\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec\u00ed\7?\2\2\u00edZ\3"+
		"\2\2\2\u00ee\u00ef\7=\2\2\u00ef\\\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1^\3"+
		"\2\2\2\u00f2\u00f3\7+\2\2\u00f3`\3\2\2\2\u00f4\u00f5\7.\2\2\u00f5b\3\2"+
		"\2\2\u00f6\u00f7\7<\2\2\u00f7d\3\2\2\2\u00f8\u00f9\5-\27\2\u00f9\u00fa"+
		"\5\3\2\2\u00fa\u00fb\5%\23\2\u00fb\u00fc\5\23\n\2\u00fc\u00fd\5\3\2\2"+
		"\u00fd\u00fe\5\5\3\2\u00fe\u00ff\5\31\r\2\u00ff\u0100\5\13\6\2\u0100f"+
		"\3\2\2\2\u0101\u0102\5\7\4\2\u0102\u0103\5\37\20\2\u0103\u0104\5\35\17"+
		"\2\u0104\u0105\5\'\24\2\u0105\u0106\5)\25\2\u0106\u0107\5\3\2\2\u0107"+
		"\u0108\5\35\17\2\u0108\u0109\5)\25\2\u0109h\3\2\2\2\u010a\u010b\5%\23"+
		"\2\u010b\u010c\5\13\6\2\u010c\u010d\5)\25\2\u010d\u010e\5+\26\2\u010e"+
		"\u010f\5%\23\2\u010f\u0110\5\35\17\2\u0110j\3\2\2\2\u0111\u0112\5\23\n"+
		"\2\u0112\u0113\5\35\17\2\u0113\u0114\5)\25\2\u0114\u0115\5\13\6\2\u0115"+
		"\u0116\5\17\b\2\u0116\u0117\5\13\6\2\u0117\u0118\5%\23\2\u0118l\3\2\2"+
		"\2\u0119\u011a\5\5\3\2\u011a\u011b\5\37\20\2\u011b\u011c\5\37\20\2\u011c"+
		"\u011d\5\31\r\2\u011d\u011e\5\13\6\2\u011e\u011f\5\3\2\2\u011f\u0120\5"+
		"\35\17\2\u0120n\3\2\2\2\u0121\u0122\5-\27\2\u0122\u0123\5\37\20\2\u0123"+
		"\u0124\5\23\n\2\u0124\u0125\5\t\5\2\u0125p\3\2\2\2\u0126\u0127\5\33\16"+
		"\2\u0127\u0128\5\3\2\2\u0128\u0129\5\23\n\2\u0129\u012a\5\35\17\2\u012a"+
		"r\3\2\2\2\u012b\u012c\5\23\n\2\u012c\u012d\5\r\7\2\u012dt\3\2\2\2\u012e"+
		"\u012f\5\13\6\2\u012f\u0130\5\31\r\2\u0130\u0131\5\'\24\2\u0131\u0132"+
		"\5\13\6\2\u0132v\3\2\2\2\u0133\u0134\5)\25\2\u0134\u0135\5%\23\2\u0135"+
		"\u0136\5+\26\2\u0136\u0137\5\13\6\2\u0137x\3\2\2\2\u0138\u0139\5\r\7\2"+
		"\u0139\u013a\5\3\2\2\u013a\u013b\5\31\r\2\u013b\u013c\5\'\24\2\u013c\u013d"+
		"\5\13\6\2\u013dz\3\2\2\2\u013e\u013f\5/\30\2\u013f\u0140\5\21\t\2\u0140"+
		"\u0141\5\23\n\2\u0141\u0142\5\31\r\2\u0142\u0143\5\13\6\2\u0143|\3\2\2"+
		"\2\u0144\u0145\5\5\3\2\u0145\u0146\5\13\6\2\u0146\u0147\5\17\b\2\u0147"+
		"\u0148\5\23\n\2\u0148\u0149\5\35\17\2\u0149~\3\2\2\2\u014a\u014b\5\13"+
		"\6\2\u014b\u014c\5\35\17\2\u014c\u014d\5\t\5\2\u014d\u0080\3\2\2\2\u014e"+
		"\u014f\5\23\n\2\u014f\u0150\5\'\24\2\u0150\u0082\3\2\2\2\u0151\u0152\5"+
		"\'\24\2\u0152\u0153\5\27\f\2\u0153\u0154\5\23\n\2\u0154\u0155\5!\21\2"+
		"\u0155\u0084\3\2\2\2\u0156\u0158\t\36\2\2\u0157\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\bC\2\2\u015c\u0086\3\2\2\2\u015d\u015e\7\61\2\2\u015e\u015f\7\61"+
		"\2\2\u015f\u0163\3\2\2\2\u0160\u0162\n\37\2\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0166\u0167\bD\2\2\u0167\u0088\3\2\2\2\u0168"+
		"\u016d\5? \2\u0169\u016c\5\u0089E\2\u016a\u016c\13\2\2\2\u016b\u0169\3"+
		"\2\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016e\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\5A"+
		"!\2\u0171\u0172\3\2\2\2\u0172\u0173\bE\2\2\u0173\u008a\3\2\2\2\u0174\u017a"+
		"\59\35\2\u0175\u0179\59\35\2\u0176\u0179\5\67\34\2\u0177\u0179\5;\36\2"+
		"\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\u017c"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u008c\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u0181\t \2\2\u017e\u0180\5\67\34\2\u017f\u017e\3"+
		"\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u018e\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\5K&\2\u0185\u0189\t \2"+
		"\2\u0186\u0188\5\67\34\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018c\u018e\t!\2\2\u018d\u017d\3\2\2\2\u018d\u0184\3\2\2\2\u018d"+
		"\u018c\3\2\2\2\u018e\u008e\3\2\2\2\f\2\u0159\u0163\u016b\u016d\u0178\u017a"+
		"\u0181\u0189\u018d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}