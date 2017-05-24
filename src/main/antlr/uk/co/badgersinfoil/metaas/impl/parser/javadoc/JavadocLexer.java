// $ANTLR 3.5.2 Javadoc.g 2017-05-23 22:28:34

package uk.co.badgersinfoil.metaas.impl.parser.javadoc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JavadocLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AT=4;
	public static final int ATWORD=5;
	public static final int DESCRIPTION=6;
	public static final int INLINE_TAG=7;
	public static final int JAVADOC=8;
	public static final int LBRACE=9;
	public static final int NL=10;
	public static final int PARA_TAG=11;
	public static final int RBRACE=12;
	public static final int STARS=13;
	public static final int TEXT_LINE=14;
	public static final int WORD=15;
	public static final int WORD_TAIL=16;
	public static final int WS=17;

		protected void mismatch(IntStream input, int ttype, BitSet follow)
			throws RecognitionException
		{
			throw new MismatchedTokenException(ttype, input);
		}


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public JavadocLexer() {} 
	public JavadocLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavadocLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Javadoc.g"; }

	// $ANTLR start "STARS"
	public final void mSTARS() throws RecognitionException {
		try {
			int _type = STARS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Javadoc.g:129:6: ( ( '*' )+ )
			// Javadoc.g:129:9: ( '*' )+
			{
			// Javadoc.g:129:9: ( '*' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='*') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Javadoc.g:129:9: '*'
					{
					match('*'); 
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
	// $ANTLR end "STARS"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Javadoc.g:131:7: ( '{' )
			// Javadoc.g:131:10: '{'
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
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Javadoc.g:132:7: ( '}' )
			// Javadoc.g:132:10: '}'
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
	// $ANTLR end "RBRACE"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Javadoc.g:133:3: ( '@' )
			// Javadoc.g:133:6: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Javadoc.g:135:3: ( ( ' ' | '\\t' )+ )
			// Javadoc.g:135:6: ( ' ' | '\\t' )+
			{
			// Javadoc.g:135:6: ( ' ' | '\\t' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\t'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Javadoc.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Javadoc.g:141:2: ( ( '\\r\\n' | '\\r' | '\\n' ) ( WS )? ( STARS ( WS )? )? )
			// Javadoc.g:141:5: ( '\\r\\n' | '\\r' | '\\n' ) ( WS )? ( STARS ( WS )? )?
			{
			// Javadoc.g:141:5: ( '\\r\\n' | '\\r' | '\\n' )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='\n') ) {
					alt3=1;
				}

				else {
					alt3=2;
				}

			}
			else if ( (LA3_0=='\n') ) {
				alt3=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Javadoc.g:141:6: '\\r\\n'
					{
					match("\r\n"); 

					}
					break;
				case 2 :
					// Javadoc.g:141:15: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// Javadoc.g:141:22: '\\n'
					{
					match('\n'); 
					}
					break;

			}

			// Javadoc.g:141:28: ( WS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\t'||LA4_0==' ') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Javadoc.g:141:28: WS
					{
					mWS(); 

					}
					break;

			}

			// Javadoc.g:141:32: ( STARS ( WS )? )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='*') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Javadoc.g:141:33: STARS ( WS )?
					{
					mSTARS(); 

					// Javadoc.g:141:39: ( WS )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='\t'||LA5_0==' ') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Javadoc.g:141:39: WS
							{
							mWS(); 

							}
							break;

					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NL"

	// $ANTLR start "ATWORD"
	public final void mATWORD() throws RecognitionException {
		try {
			int _type = ATWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Javadoc.g:143:7: ( '@' WORD WORD_TAIL )
			// Javadoc.g:143:10: '@' WORD WORD_TAIL
			{
			match('@'); 
			mWORD(); 

			mWORD_TAIL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATWORD"

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			int _type = WORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Javadoc.g:145:5: (~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' | '@' ) WORD_TAIL )
			// Javadoc.g:145:8: ~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' | '@' ) WORD_TAIL
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'z')||input.LA(1)=='|'||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mWORD_TAIL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORD"

	// $ANTLR start "WORD_TAIL"
	public final void mWORD_TAIL() throws RecognitionException {
		try {
			// Javadoc.g:150:10: ( (~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' ) )* )
			// Javadoc.g:150:12: (~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' ) )*
			{
			// Javadoc.g:150:12: (~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\b')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\u001F')||(LA7_0 >= '!' && LA7_0 <= 'z')||LA7_0=='|'||(LA7_0 >= '~' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Javadoc.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= 'z')||input.LA(1)=='|'||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
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
					break loop7;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORD_TAIL"

	@Override
	public void mTokens() throws RecognitionException {
		// Javadoc.g:1:8: ( STARS | LBRACE | RBRACE | AT | WS | NL | ATWORD | WORD )
		int alt8=8;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// Javadoc.g:1:10: STARS
				{
				mSTARS(); 

				}
				break;
			case 2 :
				// Javadoc.g:1:16: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 3 :
				// Javadoc.g:1:23: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 4 :
				// Javadoc.g:1:30: AT
				{
				mAT(); 

				}
				break;
			case 5 :
				// Javadoc.g:1:33: WS
				{
				mWS(); 

				}
				break;
			case 6 :
				// Javadoc.g:1:36: NL
				{
				mNL(); 

				}
				break;
			case 7 :
				// Javadoc.g:1:39: ATWORD
				{
				mATWORD(); 

				}
				break;
			case 8 :
				// Javadoc.g:1:46: WORD
				{
				mWORD(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\1\uffff\1\10\2\uffff\1\12\4\uffff\1\10\2\uffff";
	static final String DFA8_eofS =
		"\14\uffff";
	static final String DFA8_minS =
		"\2\0\2\uffff\1\0\4\uffff\1\0\2\uffff";
	static final String DFA8_maxS =
		"\2\uffff\2\uffff\1\uffff\4\uffff\1\uffff\2\uffff";
	static final String DFA8_acceptS =
		"\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\10\1\1\1\uffff\1\4\1\7";
	static final String DFA8_specialS =
		"\1\3\1\1\2\uffff\1\0\4\uffff\1\2\2\uffff}>";
	static final String[] DFA8_transitionS = {
			"\11\7\1\5\1\6\2\7\1\6\22\7\1\5\11\7\1\1\25\7\1\4\72\7\1\2\1\7\1\3\uff82"+
			"\7",
			"\11\7\2\uffff\2\7\1\uffff\22\7\1\uffff\11\7\1\11\120\7\1\uffff\1\7\1"+
			"\uffff\uff82\7",
			"",
			"",
			"\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\37\13\1\uffff\72\13\1\uffff"+
			"\1\13\1\uffff\uff82\13",
			"",
			"",
			"",
			"",
			"\11\7\2\uffff\2\7\1\uffff\22\7\1\uffff\11\7\1\11\120\7\1\uffff\1\7\1"+
			"\uffff\uff82\7",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( STARS | LBRACE | RBRACE | AT | WS | NL | ATWORD | WORD );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA8_4 = input.LA(1);
						s = -1;
						if ( ((LA8_4 >= '\u0000' && LA8_4 <= '\b')||(LA8_4 >= '\u000B' && LA8_4 <= '\f')||(LA8_4 >= '\u000E' && LA8_4 <= '\u001F')||(LA8_4 >= '!' && LA8_4 <= '?')||(LA8_4 >= 'A' && LA8_4 <= 'z')||LA8_4=='|'||(LA8_4 >= '~' && LA8_4 <= '\uFFFF')) ) {s = 11;}
						else s = 10;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA8_1 = input.LA(1);
						s = -1;
						if ( (LA8_1=='*') ) {s = 9;}
						else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '\b')||(LA8_1 >= '\u000B' && LA8_1 <= '\f')||(LA8_1 >= '\u000E' && LA8_1 <= '\u001F')||(LA8_1 >= '!' && LA8_1 <= ')')||(LA8_1 >= '+' && LA8_1 <= 'z')||LA8_1=='|'||(LA8_1 >= '~' && LA8_1 <= '\uFFFF')) ) {s = 7;}
						else s = 8;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA8_9 = input.LA(1);
						s = -1;
						if ( (LA8_9=='*') ) {s = 9;}
						else if ( ((LA8_9 >= '\u0000' && LA8_9 <= '\b')||(LA8_9 >= '\u000B' && LA8_9 <= '\f')||(LA8_9 >= '\u000E' && LA8_9 <= '\u001F')||(LA8_9 >= '!' && LA8_9 <= ')')||(LA8_9 >= '+' && LA8_9 <= 'z')||LA8_9=='|'||(LA8_9 >= '~' && LA8_9 <= '\uFFFF')) ) {s = 7;}
						else s = 8;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA8_0 = input.LA(1);
						s = -1;
						if ( (LA8_0=='*') ) {s = 1;}
						else if ( (LA8_0=='{') ) {s = 2;}
						else if ( (LA8_0=='}') ) {s = 3;}
						else if ( (LA8_0=='@') ) {s = 4;}
						else if ( (LA8_0=='\t'||LA8_0==' ') ) {s = 5;}
						else if ( (LA8_0=='\n'||LA8_0=='\r') ) {s = 6;}
						else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\b')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\u001F')||(LA8_0 >= '!' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '?')||(LA8_0 >= 'A' && LA8_0 <= 'z')||LA8_0=='|'||(LA8_0 >= '~' && LA8_0 <= '\uFFFF')) ) {s = 7;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 8, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
