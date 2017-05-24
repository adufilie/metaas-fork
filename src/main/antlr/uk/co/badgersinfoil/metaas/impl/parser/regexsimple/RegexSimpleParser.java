// $ANTLR 3.5.2 RegexSimple.g 2017-05-23 22:28:10

package uk.co.badgersinfoil.metaas.impl.parser.regexsimple;

import uk.co.badgersinfoil.metaas.impl.antlr.LinkedListTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


/**
 * Provides a simple scanner that can recognose the extent of a regular
 * expression within the surrounding actionscript program, without parsing
 * it 'fully'.  This should be the simplest possible handling that
 * will allow the 'outer' actionscript grammar to find the end of the
 * regular expression literal, anc continue parsing the rest of the code.
 */
@SuppressWarnings("all")
public class RegexSimpleParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONTINUING_IDENTIFIER_CHAR", 
		"CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE", "ESC", "HEX_DIGIT", "HEX_ESCAPE", 
		"NON_TERMINATOR", "NULL_ESCAPE", "ORDINARY_REGEXP_CHAR", "REGEXP_BODY", 
		"REGEXP_CHAR", "REGEXP_DELIMITER", "REGEXP_FLAG", "REGEXP_FLAGS", "REGEXP_LITERAL", 
		"TERMINATOR", "UNICODE_ALPHANUMERIC"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public RegexSimpleParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public RegexSimpleParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return RegexSimpleParser.tokenNames; }
	@Override public String getGrammarFileName() { return "RegexSimple.g"; }


		// disable standard error handling; be strict
		protected void mismatch(IntStream input, int ttype, BitSet follow)
			throws RecognitionException
		{
			throw new MismatchedTokenException(ttype, input);
		}

		private RegexSimpleLexer lexer;
		private CharStream cs;

		public void setInput(RegexSimpleLexer lexer, CharStream cs) {
			this.lexer = lexer;
			this.cs = cs;
		}

		/**
		 * Returns the input left unconsumed after the last parse operation.
		 * Because of lookahead in the parser, there is no guarantee that the
		 * lexer has not consumed input ahead of the current parse-point for
		 * any abritrary rule. This method is only intended to grab the
		 * remaining input after recognising 'regexpLiteral'.
		 */
		public String getInputTail() {
			return cs.substring(cs.index()-1, cs.size()-1);
		}


	public static class regexpLiteral_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "regexpLiteral"
	// RegexSimple.g:81:1: regexpLiteral : s= REGEXP_DELIMITER regexpBody REGEXP_DELIMITER ( regexpFlags )? -> ^( REGEXP_LITERAL[$s] regexpBody ( regexpFlags )? ) ;
	public final RegexSimpleParser.regexpLiteral_return regexpLiteral() throws RecognitionException {
		RegexSimpleParser.regexpLiteral_return retval = new RegexSimpleParser.regexpLiteral_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token s=null;
		Token REGEXP_DELIMITER2=null;
		ParserRuleReturnScope regexpBody1 =null;
		ParserRuleReturnScope regexpFlags3 =null;

		LinkedListTree s_tree=null;
		LinkedListTree REGEXP_DELIMITER2_tree=null;
		RewriteRuleTokenStream stream_REGEXP_DELIMITER=new RewriteRuleTokenStream(adaptor,"token REGEXP_DELIMITER");
		RewriteRuleSubtreeStream stream_regexpBody=new RewriteRuleSubtreeStream(adaptor,"rule regexpBody");
		RewriteRuleSubtreeStream stream_regexpFlags=new RewriteRuleSubtreeStream(adaptor,"rule regexpFlags");

		try {
			// RegexSimple.g:82:2: (s= REGEXP_DELIMITER regexpBody REGEXP_DELIMITER ( regexpFlags )? -> ^( REGEXP_LITERAL[$s] regexpBody ( regexpFlags )? ) )
			// RegexSimple.g:82:4: s= REGEXP_DELIMITER regexpBody REGEXP_DELIMITER ( regexpFlags )?
			{
			s=(Token)match(input,REGEXP_DELIMITER,FOLLOW_REGEXP_DELIMITER_in_regexpLiteral87);  
			stream_REGEXP_DELIMITER.add(s);

			pushFollow(FOLLOW_regexpBody_in_regexpLiteral89);
			regexpBody1=regexpBody();
			state._fsp--;

			stream_regexpBody.add(regexpBody1.getTree());
			REGEXP_DELIMITER2=(Token)match(input,REGEXP_DELIMITER,FOLLOW_REGEXP_DELIMITER_in_regexpLiteral91);  
			stream_REGEXP_DELIMITER.add(REGEXP_DELIMITER2);

			// RegexSimple.g:83:3: ( regexpFlags )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==REGEXP_FLAG) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// RegexSimple.g:83:3: regexpFlags
					{
					pushFollow(FOLLOW_regexpFlags_in_regexpLiteral95);
					regexpFlags3=regexpFlags();
					state._fsp--;

					stream_regexpFlags.add(regexpFlags3.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: regexpFlags, regexpBody
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 84:3: -> ^( REGEXP_LITERAL[$s] regexpBody ( regexpFlags )? )
			{
				// RegexSimple.g:84:6: ^( REGEXP_LITERAL[$s] regexpBody ( regexpFlags )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(REGEXP_LITERAL, s), root_1);
				adaptor.addChild(root_1, stream_regexpBody.nextTree());
				// RegexSimple.g:84:38: ( regexpFlags )?
				if ( stream_regexpFlags.hasNext() ) {
					adaptor.addChild(root_1, stream_regexpFlags.nextTree());
				}
				stream_regexpFlags.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "regexpLiteral"


	public static class regexpBody_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "regexpBody"
	// RegexSimple.g:87:1: regexpBody : ( bodyChar )+ -> ^( REGEXP_BODY ( bodyChar )+ ) ;
	public final RegexSimpleParser.regexpBody_return regexpBody() throws RecognitionException {
		RegexSimpleParser.regexpBody_return retval = new RegexSimpleParser.regexpBody_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope bodyChar4 =null;

		RewriteRuleSubtreeStream stream_bodyChar=new RewriteRuleSubtreeStream(adaptor,"rule bodyChar");

		try {
			// RegexSimple.g:88:2: ( ( bodyChar )+ -> ^( REGEXP_BODY ( bodyChar )+ ) )
			// RegexSimple.g:88:4: ( bodyChar )+
			{
			// RegexSimple.g:88:4: ( bodyChar )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==REGEXP_CHAR||LA2_0==REGEXP_FLAG) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// RegexSimple.g:88:4: bodyChar
					{
					pushFollow(FOLLOW_bodyChar_in_regexpBody121);
					bodyChar4=bodyChar();
					state._fsp--;

					stream_bodyChar.add(bodyChar4.getTree());
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// AST REWRITE
			// elements: bodyChar
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 89:3: -> ^( REGEXP_BODY ( bodyChar )+ )
			{
				// RegexSimple.g:89:6: ^( REGEXP_BODY ( bodyChar )+ )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(REGEXP_BODY, "REGEXP_BODY"), root_1);
				if ( !(stream_bodyChar.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_bodyChar.hasNext() ) {
					adaptor.addChild(root_1, stream_bodyChar.nextTree());
				}
				stream_bodyChar.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "regexpBody"


	public static class bodyChar_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "bodyChar"
	// RegexSimple.g:92:1: bodyChar : ( REGEXP_CHAR | REGEXP_FLAG );
	public final RegexSimpleParser.bodyChar_return bodyChar() throws RecognitionException {
		RegexSimpleParser.bodyChar_return retval = new RegexSimpleParser.bodyChar_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set5=null;

		LinkedListTree set5_tree=null;

		try {
			// RegexSimple.g:93:2: ( REGEXP_CHAR | REGEXP_FLAG )
			// RegexSimple.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set5=input.LT(1);
			if ( input.LA(1)==REGEXP_CHAR||input.LA(1)==REGEXP_FLAG ) {
				input.consume();
				adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set5));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bodyChar"


	public static class regexpFlags_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "regexpFlags"
	// RegexSimple.g:96:1: regexpFlags : ( REGEXP_FLAG )+ -> ^( REGEXP_FLAGS ( REGEXP_FLAG )+ ) ;
	public final RegexSimpleParser.regexpFlags_return regexpFlags() throws RecognitionException {
		RegexSimpleParser.regexpFlags_return retval = new RegexSimpleParser.regexpFlags_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token REGEXP_FLAG6=null;

		LinkedListTree REGEXP_FLAG6_tree=null;
		RewriteRuleTokenStream stream_REGEXP_FLAG=new RewriteRuleTokenStream(adaptor,"token REGEXP_FLAG");

		try {
			// RegexSimple.g:97:2: ( ( REGEXP_FLAG )+ -> ^( REGEXP_FLAGS ( REGEXP_FLAG )+ ) )
			// RegexSimple.g:97:4: ( REGEXP_FLAG )+
			{
			// RegexSimple.g:97:4: ( REGEXP_FLAG )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==REGEXP_FLAG) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// RegexSimple.g:97:4: REGEXP_FLAG
					{
					REGEXP_FLAG6=(Token)match(input,REGEXP_FLAG,FOLLOW_REGEXP_FLAG_in_regexpFlags159);  
					stream_REGEXP_FLAG.add(REGEXP_FLAG6);

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// AST REWRITE
			// elements: REGEXP_FLAG
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 98:3: -> ^( REGEXP_FLAGS ( REGEXP_FLAG )+ )
			{
				// RegexSimple.g:98:6: ^( REGEXP_FLAGS ( REGEXP_FLAG )+ )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(REGEXP_FLAGS, "REGEXP_FLAGS"), root_1);
				if ( !(stream_REGEXP_FLAG.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_REGEXP_FLAG.hasNext() ) {
					adaptor.addChild(root_1, stream_REGEXP_FLAG.nextNode());
				}
				stream_REGEXP_FLAG.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "regexpFlags"

	// Delegated rules



	public static final BitSet FOLLOW_REGEXP_DELIMITER_in_regexpLiteral87 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_regexpBody_in_regexpLiteral89 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_REGEXP_DELIMITER_in_regexpLiteral91 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_regexpFlags_in_regexpLiteral95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bodyChar_in_regexpBody121 = new BitSet(new long[]{0x000000000000A002L});
	public static final BitSet FOLLOW_REGEXP_FLAG_in_regexpFlags159 = new BitSet(new long[]{0x0000000000008002L});
}
