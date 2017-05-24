// $ANTLR 3.5.2 RegexSimple.g 2017-05-23 22:28:10

package uk.co.badgersinfoil.metaas.impl.parser.regexsimple;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RegexSimpleLexer extends Lexer {
	public static final int EOF=-1;
	public static final int CONTINUING_IDENTIFIER_CHAR=4;
	public static final int CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE=5;
	public static final int ESC=6;
	public static final int HEX_DIGIT=7;
	public static final int HEX_ESCAPE=8;
	public static final int NON_TERMINATOR=9;
	public static final int NULL_ESCAPE=10;
	public static final int ORDINARY_REGEXP_CHAR=11;
	public static final int REGEXP_BODY=12;
	public static final int REGEXP_CHAR=13;
	public static final int REGEXP_DELIMITER=14;
	public static final int REGEXP_FLAG=15;
	public static final int REGEXP_FLAGS=16;
	public static final int REGEXP_LITERAL=17;
	public static final int TERMINATOR=18;
	public static final int UNICODE_ALPHANUMERIC=19;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public RegexSimpleLexer() {} 
	public RegexSimpleLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public RegexSimpleLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "RegexSimple.g"; }

	// $ANTLR start "REGEXP_DELIMITER"
	public final void mREGEXP_DELIMITER() throws RecognitionException {
		try {
			int _type = REGEXP_DELIMITER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RegexSimple.g:102:2: ( '/' )
			// RegexSimple.g:102:4: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REGEXP_DELIMITER"

	// $ANTLR start "REGEXP_FLAG"
	public final void mREGEXP_FLAG() throws RecognitionException {
		try {
			int _type = REGEXP_FLAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RegexSimple.g:106:2: ( CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE | NULL_ESCAPE )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
				alt1=1;
			}
			else if ( (LA1_0=='\\') ) {
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='U'||LA1_2=='u'||LA1_2=='x') ) {
					alt1=1;
				}
				else if ( (LA1_2=='_') ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// RegexSimple.g:106:4: CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE
					{
					mCONTINUING_IDENTIFIER_CHAR_OR_ESCAPE(); 

					}
					break;
				case 2 :
					// RegexSimple.g:107:4: NULL_ESCAPE
					{
					mNULL_ESCAPE(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REGEXP_FLAG"

	// $ANTLR start "REGEXP_CHAR"
	public final void mREGEXP_CHAR() throws RecognitionException {
		try {
			int _type = REGEXP_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// RegexSimple.g:111:2: ( ORDINARY_REGEXP_CHAR | ESC NON_TERMINATOR )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '.')||(LA2_0 >= '0' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
				alt2=1;
			}
			else if ( (LA2_0=='\\') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// RegexSimple.g:111:4: ORDINARY_REGEXP_CHAR
					{
					mORDINARY_REGEXP_CHAR(); 

					}
					break;
				case 2 :
					// RegexSimple.g:112:4: ESC NON_TERMINATOR
					{
					mESC(); 

					mNON_TERMINATOR(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REGEXP_CHAR"

	// $ANTLR start "TERMINATOR"
	public final void mTERMINATOR() throws RecognitionException {
		try {
			// RegexSimple.g:116:2: ( '\\n' | '\\r' )
			// RegexSimple.g:
			{
			if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
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
	// $ANTLR end "TERMINATOR"

	// $ANTLR start "ORDINARY_REGEXP_CHAR"
	public final void mORDINARY_REGEXP_CHAR() throws RecognitionException {
		try {
			// RegexSimple.g:120:2: (~ ( '\\n' | '\\r' | '\\\\' | '/' ) )
			// RegexSimple.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
	// $ANTLR end "ORDINARY_REGEXP_CHAR"

	// $ANTLR start "NON_TERMINATOR"
	public final void mNON_TERMINATOR() throws RecognitionException {
		try {
			// RegexSimple.g:124:2: (~ TERMINATOR )
			// RegexSimple.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
	// $ANTLR end "NON_TERMINATOR"

	// $ANTLR start "ESC"
	public final void mESC() throws RecognitionException {
		try {
			// RegexSimple.g:128:2: ( '\\\\' )
			// RegexSimple.g:128:4: '\\\\'
			{
			match('\\'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC"

	// $ANTLR start "NULL_ESCAPE"
	public final void mNULL_ESCAPE() throws RecognitionException {
		try {
			// RegexSimple.g:132:2: ( ESC '_' )
			// RegexSimple.g:132:4: ESC '_'
			{
			mESC(); 

			match('_'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL_ESCAPE"

	// $ANTLR start "CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE"
	public final void mCONTINUING_IDENTIFIER_CHAR_OR_ESCAPE() throws RecognitionException {
		try {
			// RegexSimple.g:136:2: ( CONTINUING_IDENTIFIER_CHAR | ESC HEX_ESCAPE )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='$'||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
				alt3=1;
			}
			else if ( (LA3_0=='\\') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// RegexSimple.g:136:4: CONTINUING_IDENTIFIER_CHAR
					{
					mCONTINUING_IDENTIFIER_CHAR(); 

					}
					break;
				case 2 :
					// RegexSimple.g:137:4: ESC HEX_ESCAPE
					{
					mESC(); 

					mHEX_ESCAPE(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE"

	// $ANTLR start "CONTINUING_IDENTIFIER_CHAR"
	public final void mCONTINUING_IDENTIFIER_CHAR() throws RecognitionException {
		try {
			// RegexSimple.g:141:2: ( UNICODE_ALPHANUMERIC | '$' | '_' )
			// RegexSimple.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "CONTINUING_IDENTIFIER_CHAR"

	// $ANTLR start "UNICODE_ALPHANUMERIC"
	public final void mUNICODE_ALPHANUMERIC() throws RecognitionException {
		try {
			// RegexSimple.g:146:2: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
			// RegexSimple.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "UNICODE_ALPHANUMERIC"

	// $ANTLR start "HEX_ESCAPE"
	public final void mHEX_ESCAPE() throws RecognitionException {
		try {
			// RegexSimple.g:150:2: ( 'x' HEX_DIGIT HEX_DIGIT | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 'x':
				{
				alt4=1;
				}
				break;
			case 'u':
				{
				alt4=2;
				}
				break;
			case 'U':
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// RegexSimple.g:150:4: 'x' HEX_DIGIT HEX_DIGIT
					{
					match('x'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					}
					break;
				case 2 :
					// RegexSimple.g:151:4: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
					{
					match('u'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					}
					break;
				case 3 :
					// RegexSimple.g:152:4: 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
					{
					match('U'); 
					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					mHEX_DIGIT(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_ESCAPE"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// RegexSimple.g:156:2: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
			// RegexSimple.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
	// $ANTLR end "HEX_DIGIT"

	@Override
	public void mTokens() throws RecognitionException {
		// RegexSimple.g:1:8: ( REGEXP_DELIMITER | REGEXP_FLAG | REGEXP_CHAR )
		int alt5=3;
		int LA5_0 = input.LA(1);
		if ( (LA5_0=='/') ) {
			alt5=1;
		}
		else if ( (LA5_0=='$'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
			alt5=2;
		}
		else if ( (LA5_0=='\\') ) {
			int LA5_3 = input.LA(2);
			if ( (LA5_3=='x') ) {
				int LA5_6 = input.LA(3);
				if ( ((LA5_6 >= '0' && LA5_6 <= '9')||(LA5_6 >= 'A' && LA5_6 <= 'F')||(LA5_6 >= 'a' && LA5_6 <= 'f')) ) {
					alt5=2;
				}

				else {
					alt5=3;
				}

			}
			else if ( (LA5_3=='u') ) {
				int LA5_7 = input.LA(3);
				if ( ((LA5_7 >= '0' && LA5_7 <= '9')||(LA5_7 >= 'A' && LA5_7 <= 'F')||(LA5_7 >= 'a' && LA5_7 <= 'f')) ) {
					alt5=2;
				}

				else {
					alt5=3;
				}

			}
			else if ( (LA5_3=='U') ) {
				int LA5_8 = input.LA(3);
				if ( ((LA5_8 >= '0' && LA5_8 <= '9')||(LA5_8 >= 'A' && LA5_8 <= 'F')||(LA5_8 >= 'a' && LA5_8 <= 'f')) ) {
					alt5=2;
				}

				else {
					alt5=3;
				}

			}
			else if ( (LA5_3=='_') ) {
				alt5=2;
			}
			else if ( ((LA5_3 >= '\u0000' && LA5_3 <= '\t')||(LA5_3 >= '\u000B' && LA5_3 <= '\f')||(LA5_3 >= '\u000E' && LA5_3 <= 'T')||(LA5_3 >= 'V' && LA5_3 <= '^')||(LA5_3 >= '`' && LA5_3 <= 't')||(LA5_3 >= 'v' && LA5_3 <= 'w')||(LA5_3 >= 'y' && LA5_3 <= '\uFFFF')) ) {
				alt5=3;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 5, 3, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

		}
		else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '#')||(LA5_0 >= '%' && LA5_0 <= '.')||(LA5_0 >= ':' && LA5_0 <= '@')||LA5_0=='['||(LA5_0 >= ']' && LA5_0 <= '^')||LA5_0=='`'||(LA5_0 >= '{' && LA5_0 <= '\uFFFF')) ) {
			alt5=3;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}

		switch (alt5) {
			case 1 :
				// RegexSimple.g:1:10: REGEXP_DELIMITER
				{
				mREGEXP_DELIMITER(); 

				}
				break;
			case 2 :
				// RegexSimple.g:1:27: REGEXP_FLAG
				{
				mREGEXP_FLAG(); 

				}
				break;
			case 3 :
				// RegexSimple.g:1:39: REGEXP_CHAR
				{
				mREGEXP_CHAR(); 

				}
				break;

		}
	}



}
