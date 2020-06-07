// Generated from tools/DrawGraph.g4 by ANTLR 4.7.1

package  tools;
import java.util.*;
import java.lang.Math;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawGraphLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, DIV=3, MUL=4, POWER=5, SEMICO=6, L_BRACKET=7, R_BRACKET=8, 
		COMMA=9, CONST_ID=10, ORIGIN=11, SCALE=12, ROT=13, IS=14, TO=15, STEP=16, 
		DRAW=17, FOR=18, FROM=19, COLOR=20, DOTSIZE=21, STYLE=22, T1=23, ID=24, 
		WS=25, COMMENT=26, ErrText=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "MINUS", "DIV", "MUL", "POWER", "SEMICO", "L_BRACKET", "R_BRACKET", 
		"COMMA", "CONST_ID", "Integer", "Digits", "Real", "Fraction", "Exponent", 
		"NamedConst", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
		"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
		"ORIGIN", "SCALE", "ROT", "IS", "TO", "STEP", "DRAW", "FOR", "FROM", "COLOR", 
		"DOTSIZE", "STYLE", "T1", "ID", "WS", "COMMENT", "ErrText"
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


	public DrawGraphLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DrawGraph.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0161\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\5\13\u0090\n\13\3\f\3\f\3\r\6\r\u0095\n\r\r\r\16\r\u0096"+
		"\3\16\3\16\5\16\u009b\n\16\3\16\3\16\3\16\5\16\u00a0\n\16\3\17\5\17\u00a3"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00aa\n\17\3\20\3\20\5\20\u00ae\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bb"+
		"\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/"+
		"\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\38\38\39\39\79\u0133\n9\f9\169\u0136\139\3:\6:\u0139\n:\r:\16:\u013a"+
		"\3:\3:\3;\3;\3;\3;\7;\u0143\n;\f;\16;\u0146\13;\3;\3;\3;\3;\7;\u014c\n"+
		";\f;\16;\u014f\13;\3;\3;\3;\3;\7;\u0155\n;\f;\16;\u0158\13;\3;\3;\5;\u015c"+
		"\n;\3;\3;\3<\3<\3\u0156\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\rY\16[\17]\20_\21a\22"+
		"c\23e\24g\25i\26k\27m\30o\31q\32s\33u\34w\35\3\2\"\3\2\62;\4\2GGgg\4\2"+
		"--//\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4"+
		"\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0153\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7}\3\2\2\2\t\177"+
		"\3\2\2\2\13\u0081\3\2\2\2\r\u0084\3\2\2\2\17\u0086\3\2\2\2\21\u0088\3"+
		"\2\2\2\23\u008a\3\2\2\2\25\u008f\3\2\2\2\27\u0091\3\2\2\2\31\u0094\3\2"+
		"\2\2\33\u009f\3\2\2\2\35\u00a9\3\2\2\2\37\u00ab\3\2\2\2!\u00ba\3\2\2\2"+
		"#\u00bc\3\2\2\2%\u00be\3\2\2\2\'\u00c0\3\2\2\2)\u00c2\3\2\2\2+\u00c4\3"+
		"\2\2\2-\u00c6\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00cc\3\2\2\2"+
		"\65\u00ce\3\2\2\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d6"+
		"\3\2\2\2?\u00d8\3\2\2\2A\u00da\3\2\2\2C\u00dc\3\2\2\2E\u00de\3\2\2\2G"+
		"\u00e0\3\2\2\2I\u00e2\3\2\2\2K\u00e4\3\2\2\2M\u00e6\3\2\2\2O\u00e8\3\2"+
		"\2\2Q\u00ea\3\2\2\2S\u00ec\3\2\2\2U\u00ee\3\2\2\2W\u00f0\3\2\2\2Y\u00f7"+
		"\3\2\2\2[\u00fd\3\2\2\2]\u0101\3\2\2\2_\u0104\3\2\2\2a\u0107\3\2\2\2c"+
		"\u010c\3\2\2\2e\u0111\3\2\2\2g\u0115\3\2\2\2i\u011a\3\2\2\2k\u0120\3\2"+
		"\2\2m\u0128\3\2\2\2o\u012e\3\2\2\2q\u0130\3\2\2\2s\u0138\3\2\2\2u\u015b"+
		"\3\2\2\2w\u015f\3\2\2\2yz\7-\2\2z\4\3\2\2\2{|\7/\2\2|\6\3\2\2\2}~\7\61"+
		"\2\2~\b\3\2\2\2\177\u0080\7,\2\2\u0080\n\3\2\2\2\u0081\u0082\7,\2\2\u0082"+
		"\u0083\7,\2\2\u0083\f\3\2\2\2\u0084\u0085\7=\2\2\u0085\16\3\2\2\2\u0086"+
		"\u0087\7*\2\2\u0087\20\3\2\2\2\u0088\u0089\7+\2\2\u0089\22\3\2\2\2\u008a"+
		"\u008b\7.\2\2\u008b\24\3\2\2\2\u008c\u0090\5\27\f\2\u008d\u0090\5\33\16"+
		"\2\u008e\u0090\5!\21\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\26\3\2\2\2\u0091\u0092\5\31\r\2\u0092\30\3\2\2\2\u0093"+
		"\u0095\t\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\32\3\2\2\2\u0098\u009a\5\35\17\2\u0099"+
		"\u009b\5\37\20\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a0\3"+
		"\2\2\2\u009c\u009d\5\31\r\2\u009d\u009e\5\37\20\2\u009e\u00a0\3\2\2\2"+
		"\u009f\u0098\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\34\3\2\2\2\u00a1\u00a3"+
		"\5\31\r\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\u00a5\7\60\2\2\u00a5\u00aa\5\31\r\2\u00a6\u00a7\5\31\r\2\u00a7"+
		"\u00a8\7\60\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00a6\3"+
		"\2\2\2\u00aa\36\3\2\2\2\u00ab\u00ad\t\3\2\2\u00ac\u00ae\t\4\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5\31"+
		"\r\2\u00b0 \3\2\2\2\u00b1\u00b2\7r\2\2\u00b2\u00bb\7k\2\2\u00b3\u00b4"+
		"\7R\2\2\u00b4\u00bb\7K\2\2\u00b5\u00b6\7R\2\2\u00b6\u00bb\7k\2\2\u00b7"+
		"\u00b8\7r\2\2\u00b8\u00bb\7K\2\2\u00b9\u00bb\t\3\2\2\u00ba\u00b1\3\2\2"+
		"\2\u00ba\u00b3\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\t\5\2\2\u00bd$\3\2\2\2\u00be\u00bf"+
		"\t\6\2\2\u00bf&\3\2\2\2\u00c0\u00c1\t\7\2\2\u00c1(\3\2\2\2\u00c2\u00c3"+
		"\t\b\2\2\u00c3*\3\2\2\2\u00c4\u00c5\t\3\2\2\u00c5,\3\2\2\2\u00c6\u00c7"+
		"\t\t\2\2\u00c7.\3\2\2\2\u00c8\u00c9\t\n\2\2\u00c9\60\3\2\2\2\u00ca\u00cb"+
		"\t\13\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\t\f\2\2\u00cd\64\3\2\2\2\u00ce"+
		"\u00cf\t\r\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\t\16\2\2\u00d18\3\2\2\2\u00d2"+
		"\u00d3\t\17\2\2\u00d3:\3\2\2\2\u00d4\u00d5\t\20\2\2\u00d5<\3\2\2\2\u00d6"+
		"\u00d7\t\21\2\2\u00d7>\3\2\2\2\u00d8\u00d9\t\22\2\2\u00d9@\3\2\2\2\u00da"+
		"\u00db\t\23\2\2\u00dbB\3\2\2\2\u00dc\u00dd\t\24\2\2\u00ddD\3\2\2\2\u00de"+
		"\u00df\t\25\2\2\u00dfF\3\2\2\2\u00e0\u00e1\t\26\2\2\u00e1H\3\2\2\2\u00e2"+
		"\u00e3\t\27\2\2\u00e3J\3\2\2\2\u00e4\u00e5\t\30\2\2\u00e5L\3\2\2\2\u00e6"+
		"\u00e7\t\31\2\2\u00e7N\3\2\2\2\u00e8\u00e9\t\32\2\2\u00e9P\3\2\2\2\u00ea"+
		"\u00eb\t\33\2\2\u00ebR\3\2\2\2\u00ec\u00ed\t\34\2\2\u00edT\3\2\2\2\u00ee"+
		"\u00ef\t\35\2\2\u00efV\3\2\2\2\u00f0\u00f1\5? \2\u00f1\u00f2\5E#\2\u00f2"+
		"\u00f3\5\63\32\2\u00f3\u00f4\5/\30\2\u00f4\u00f5\5\63\32\2\u00f5\u00f6"+
		"\5=\37\2\u00f6X\3\2\2\2\u00f7\u00f8\5G$\2\u00f8\u00f9\5\'\24\2\u00f9\u00fa"+
		"\5#\22\2\u00fa\u00fb\59\35\2\u00fb\u00fc\5+\26\2\u00fcZ\3\2\2\2\u00fd"+
		"\u00fe\5E#\2\u00fe\u00ff\5? \2\u00ff\u0100\5I%\2\u0100\\\3\2\2\2\u0101"+
		"\u0102\5\63\32\2\u0102\u0103\5G$\2\u0103^\3\2\2\2\u0104\u0105\5I%\2\u0105"+
		"\u0106\5? \2\u0106`\3\2\2\2\u0107\u0108\5G$\2\u0108\u0109\5I%\2\u0109"+
		"\u010a\5+\26\2\u010a\u010b\5A!\2\u010bb\3\2\2\2\u010c\u010d\5)\25\2\u010d"+
		"\u010e\5E#\2\u010e\u010f\5#\22\2\u010f\u0110\5O(\2\u0110d\3\2\2\2\u0111"+
		"\u0112\5-\27\2\u0112\u0113\5? \2\u0113\u0114\5E#\2\u0114f\3\2\2\2\u0115"+
		"\u0116\5-\27\2\u0116\u0117\5E#\2\u0117\u0118\5? \2\u0118\u0119\5;\36\2"+
		"\u0119h\3\2\2\2\u011a\u011b\5\'\24\2\u011b\u011c\5? \2\u011c\u011d\59"+
		"\35\2\u011d\u011e\5? \2\u011e\u011f\5E#\2\u011fj\3\2\2\2\u0120\u0121\5"+
		")\25\2\u0121\u0122\5? \2\u0122\u0123\5I%\2\u0123\u0124\5G$\2\u0124\u0125"+
		"\5\63\32\2\u0125\u0126\5U+\2\u0126\u0127\5+\26\2\u0127l\3\2\2\2\u0128"+
		"\u0129\5G$\2\u0129\u012a\5I%\2\u012a\u012b\5S*\2\u012b\u012c\59\35\2\u012c"+
		"\u012d\5+\26\2\u012dn\3\2\2\2\u012e\u012f\5I%\2\u012fp\3\2\2\2\u0130\u0134"+
		"\t\36\2\2\u0131\u0133\t\37\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135r\3\2\2\2\u0136\u0134\3"+
		"\2\2\2\u0137\u0139\t \2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b:"+
		"\2\2\u013dt\3\2\2\2\u013e\u013f\7\61\2\2\u013f\u0140\7\61\2\2\u0140\u0144"+
		"\3\2\2\2\u0141\u0143\n!\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u015c\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0147\u0148\7/\2\2\u0148\u0149\7/\2\2\u0149\u014d\3\2\2\2\u014a\u014c"+
		"\n!\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u015c\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7\61"+
		"\2\2\u0151\u0152\7,\2\2\u0152\u0156\3\2\2\2\u0153\u0155\13\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0157\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7,\2\2\u015a"+
		"\u015c\7\61\2\2\u015b\u013e\3\2\2\2\u015b\u0147\3\2\2\2\u015b\u0150\3"+
		"\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b;\2\2\u015ev\3\2\2\2\u015f\u0160"+
		"\13\2\2\2\u0160x\3\2\2\2\21\2\u008f\u0096\u009a\u009f\u00a2\u00a9\u00ad"+
		"\u00ba\u0134\u013a\u0144\u014d\u0156\u015b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}