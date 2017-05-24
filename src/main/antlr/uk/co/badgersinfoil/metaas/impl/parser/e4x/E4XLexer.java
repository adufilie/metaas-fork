// $ANTLR 3.5.2 E4X.g 2017-05-23 22:28:41

package uk.co.badgersinfoil.metaas.impl.parser.e4x;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class E4XLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int UNICODE_DIGIT=4;
	public static final int UNICODE_LETTER=5;
	public static final int XML_APOSTROPHE=6;
	public static final int XML_ASSIGN=7;
	public static final int XML_ATTRIBUTE=8;
	public static final int XML_CDATA=9;
	public static final int XML_COMMENT=10;
	public static final int XML_ELEMENT=11;
	public static final int XML_EMPTY_ELEMENT=12;
	public static final int XML_EXPRESSION=13;
	public static final int XML_LCHEVRON=14;
	public static final int XML_LIST=15;
	public static final int XML_NAME=16;
	public static final int XML_NAME_PART=17;
	public static final int XML_NAME_START=18;
	public static final int XML_PI=19;
	public static final int XML_PI_END=20;
	public static final int XML_PI_START=21;
	public static final int XML_QUOTE=22;
	public static final int XML_TEXT=23;
	public static final int XML_TEXT_NODE=24;
	public static final int XML_WS=25;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public E4XLexer() {} 
	public E4XLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public E4XLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "E4X.g"; }

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:6:7: ( '/>' )
			// E4X.g:6:9: '/>'
			{
			match("/>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:7:7: ( '</' )
			// E4X.g:7:9: '</'
			{
			match("</"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:8:7: ( '</>' )
			// E4X.g:8:9: '</>'
			{
			match("</>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:9:7: ( '>' )
			// E4X.g:9:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:10:7: ( '{' )
			// E4X.g:10:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:11:7: ( '}' )
			// E4X.g:11:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "XML_LCHEVRON"
	public final void mXML_LCHEVRON() throws RecognitionException {
		try {
			int _type = XML_LCHEVRON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:174:15: ( '<' )
			// E4X.g:174:17: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_LCHEVRON"

	// $ANTLR start "XML_ASSIGN"
	public final void mXML_ASSIGN() throws RecognitionException {
		try {
			int _type = XML_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:176:13: ( '=' )
			// E4X.g:176:15: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_ASSIGN"

	// $ANTLR start "XML_WS"
	public final void mXML_WS() throws RecognitionException {
		try {
			int _type = XML_WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:178:10: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// E4X.g:178:12: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// E4X.g:178:12: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// E4X.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_WS"

	// $ANTLR start "XML_NAME"
	public final void mXML_NAME() throws RecognitionException {
		try {
			int _type = XML_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:180:11: ( XML_NAME_START ( XML_NAME_PART )* )
			// E4X.g:180:13: XML_NAME_START ( XML_NAME_PART )*
			{
			mXML_NAME_START(); 

			// E4X.g:180:28: ( XML_NAME_PART )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '-' && LA2_0 <= '.')||(LA2_0 >= '0' && LA2_0 <= ':')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// E4X.g:
					{
					if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_NAME"

	// $ANTLR start "XML_APOSTROPHE"
	public final void mXML_APOSTROPHE() throws RecognitionException {
		try {
			int _type = XML_APOSTROPHE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:188:17: ( '\\'' )
			// E4X.g:188:19: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_APOSTROPHE"

	// $ANTLR start "XML_QUOTE"
	public final void mXML_QUOTE() throws RecognitionException {
		try {
			int _type = XML_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:190:12: ( '\"' )
			// E4X.g:190:14: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_QUOTE"

	// $ANTLR start "XML_PI_START"
	public final void mXML_PI_START() throws RecognitionException {
		try {
			int _type = XML_PI_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:192:15: ( '<?' )
			// E4X.g:192:17: '<?'
			{
			match("<?"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_PI_START"

	// $ANTLR start "XML_PI_END"
	public final void mXML_PI_END() throws RecognitionException {
		try {
			int _type = XML_PI_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:193:13: ( '?>' )
			// E4X.g:193:15: '?>'
			{
			match("?>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_PI_END"

	// $ANTLR start "XML_COMMENT"
	public final void mXML_COMMENT() throws RecognitionException {
		try {
			int _type = XML_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:196:14: ( '<!--' ( options {greedy=false; } : . )* '-->' )
			// E4X.g:196:16: '<!--' ( options {greedy=false; } : . )* '-->'
			{
			match("<!--"); 

			// E4X.g:196:23: ( options {greedy=false; } : . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='-') ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1=='-') ) {
						int LA3_3 = input.LA(3);
						if ( (LA3_3=='>') ) {
							alt3=2;
						}
						else if ( ((LA3_3 >= '\u0000' && LA3_3 <= '=')||(LA3_3 >= '?' && LA3_3 <= '\uFFFF')) ) {
							alt3=1;
						}

					}
					else if ( ((LA3_1 >= '\u0000' && LA3_1 <= ',')||(LA3_1 >= '.' && LA3_1 <= '\uFFFF')) ) {
						alt3=1;
					}

				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ',')||(LA3_0 >= '.' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// E4X.g:196:51: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop3;
				}
			}

			match("-->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_COMMENT"

	// $ANTLR start "XML_CDATA"
	public final void mXML_CDATA() throws RecognitionException {
		try {
			int _type = XML_CDATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:198:12: ( '<![CDATA[' ( options {greedy=false; } : . )* ']]>' )
			// E4X.g:198:14: '<![CDATA[' ( options {greedy=false; } : . )* ']]>'
			{
			match("<![CDATA["); 

			// E4X.g:198:26: ( options {greedy=false; } : . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==']') ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1==']') ) {
						int LA4_3 = input.LA(3);
						if ( (LA4_3=='>') ) {
							alt4=2;
						}
						else if ( ((LA4_3 >= '\u0000' && LA4_3 <= '=')||(LA4_3 >= '?' && LA4_3 <= '\uFFFF')) ) {
							alt4=1;
						}

					}
					else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '\\')||(LA4_1 >= '^' && LA4_1 <= '\uFFFF')) ) {
						alt4=1;
					}

				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\\')||(LA4_0 >= '^' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// E4X.g:198:54: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop4;
				}
			}

			match("]]>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_CDATA"

	// $ANTLR start "XML_NAME_START"
	public final void mXML_NAME_START() throws RecognitionException {
		try {
			// E4X.g:200:25: ( UNICODE_LETTER | '_' | ':' )
			// E4X.g:
			{
			if ( input.LA(1)==':'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_NAME_START"

	// $ANTLR start "XML_NAME_PART"
	public final void mXML_NAME_PART() throws RecognitionException {
		try {
			// E4X.g:201:24: ( UNICODE_LETTER | UNICODE_DIGIT | '.' | '-' | '_' | ':' )
			// E4X.g:
			{
			if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_NAME_PART"

	// $ANTLR start "UNICODE_LETTER"
	public final void mUNICODE_LETTER() throws RecognitionException {
		try {
			// E4X.g:204:25: ( 'a' .. 'z' | 'A' .. 'Z' )
			// E4X.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_LETTER"

	// $ANTLR start "UNICODE_DIGIT"
	public final void mUNICODE_DIGIT() throws RecognitionException {
		try {
			// E4X.g:205:24: ( '0' .. '9' )
			// E4X.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_DIGIT"

	// $ANTLR start "XML_TEXT"
	public final void mXML_TEXT() throws RecognitionException {
		try {
			int _type = XML_TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E4X.g:208:2: ( (~ ( XML_LCHEVRON | '{' ) ) )
			// E4X.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ';')||(input.LA(1) >= '=' && input.LA(1) <= 'z')||(input.LA(1) >= '|' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XML_TEXT"

	@Override
	public void mTokens() throws RecognitionException {
		// E4X.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | XML_LCHEVRON | XML_ASSIGN | XML_WS | XML_NAME | XML_APOSTROPHE | XML_QUOTE | XML_PI_START | XML_PI_END | XML_COMMENT | XML_CDATA | XML_TEXT )
		int alt5=17;
		int LA5_0 = input.LA(1);
		if ( (LA5_0=='/') ) {
			int LA5_1 = input.LA(2);
			if ( (LA5_1=='>') ) {
				alt5=1;
			}

			else {
				alt5=17;
			}

		}
		else if ( (LA5_0=='<') ) {
			switch ( input.LA(2) ) {
			case '/':
				{
				int LA5_14 = input.LA(3);
				if ( (LA5_14=='>') ) {
					alt5=3;
				}

				else {
					alt5=2;
				}

				}
				break;
			case '?':
				{
				alt5=13;
				}
				break;
			case '!':
				{
				int LA5_16 = input.LA(3);
				if ( (LA5_16=='-') ) {
					alt5=15;
				}
				else if ( (LA5_16=='[') ) {
					alt5=16;
				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 5, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				alt5=7;
			}
		}
		else if ( (LA5_0=='>') ) {
			alt5=4;
		}
		else if ( (LA5_0=='{') ) {
			alt5=5;
		}
		else if ( (LA5_0=='}') ) {
			alt5=6;
		}
		else if ( (LA5_0=='=') ) {
			alt5=8;
		}
		else if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
			alt5=9;
		}
		else if ( (LA5_0==':'||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
			alt5=10;
		}
		else if ( (LA5_0=='\'') ) {
			alt5=11;
		}
		else if ( (LA5_0=='\"') ) {
			alt5=12;
		}
		else if ( (LA5_0=='?') ) {
			int LA5_11 = input.LA(2);
			if ( (LA5_11=='>') ) {
				alt5=14;
			}

			else {
				alt5=17;
			}

		}
		else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\b')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\u001F')||LA5_0=='!'||(LA5_0 >= '#' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '.')||(LA5_0 >= '0' && LA5_0 <= '9')||LA5_0==';'||LA5_0=='@'||(LA5_0 >= '[' && LA5_0 <= '^')||LA5_0=='`'||LA5_0=='|'||(LA5_0 >= '~' && LA5_0 <= '\uFFFF')) ) {
			alt5=17;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}

		switch (alt5) {
			case 1 :
				// E4X.g:1:10: T__26
				{
				mT__26(); 

				}
				break;
			case 2 :
				// E4X.g:1:16: T__27
				{
				mT__27(); 

				}
				break;
			case 3 :
				// E4X.g:1:22: T__28
				{
				mT__28(); 

				}
				break;
			case 4 :
				// E4X.g:1:28: T__29
				{
				mT__29(); 

				}
				break;
			case 5 :
				// E4X.g:1:34: T__30
				{
				mT__30(); 

				}
				break;
			case 6 :
				// E4X.g:1:40: T__31
				{
				mT__31(); 

				}
				break;
			case 7 :
				// E4X.g:1:46: XML_LCHEVRON
				{
				mXML_LCHEVRON(); 

				}
				break;
			case 8 :
				// E4X.g:1:59: XML_ASSIGN
				{
				mXML_ASSIGN(); 

				}
				break;
			case 9 :
				// E4X.g:1:70: XML_WS
				{
				mXML_WS(); 

				}
				break;
			case 10 :
				// E4X.g:1:77: XML_NAME
				{
				mXML_NAME(); 

				}
				break;
			case 11 :
				// E4X.g:1:86: XML_APOSTROPHE
				{
				mXML_APOSTROPHE(); 

				}
				break;
			case 12 :
				// E4X.g:1:101: XML_QUOTE
				{
				mXML_QUOTE(); 

				}
				break;
			case 13 :
				// E4X.g:1:111: XML_PI_START
				{
				mXML_PI_START(); 

				}
				break;
			case 14 :
				// E4X.g:1:124: XML_PI_END
				{
				mXML_PI_END(); 

				}
				break;
			case 15 :
				// E4X.g:1:135: XML_COMMENT
				{
				mXML_COMMENT(); 

				}
				break;
			case 16 :
				// E4X.g:1:147: XML_CDATA
				{
				mXML_CDATA(); 

				}
				break;
			case 17 :
				// E4X.g:1:157: XML_TEXT
				{
				mXML_TEXT(); 

				}
				break;

		}
	}



}
