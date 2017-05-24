// $ANTLR 3.5.2 Javadoc.g 2017-05-23 22:28:34

package uk.co.badgersinfoil.metaas.impl.parser.javadoc;

import uk.co.badgersinfoil.metaas.impl.antlr.LinkedListTree;
import uk.co.badgersinfoil.metaas.impl.antlr.LinkedListToken;
import uk.co.badgersinfoil.metaas.impl.TokenBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class JavadocParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AT", "ATWORD", "DESCRIPTION", 
		"INLINE_TAG", "JAVADOC", "LBRACE", "NL", "PARA_TAG", "RBRACE", "STARS", 
		"TEXT_LINE", "WORD", "WORD_TAIL", "WS"
	};
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JavadocParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavadocParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return JavadocParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Javadoc.g"; }


		protected void mismatch(IntStream input, int ttype, BitSet follow)
			throws RecognitionException
		{
			throw new MismatchedTokenException(ttype, input);
		}

		private void placeholder(LinkedListTree imaginary) {
			if (imaginary.getChildCount() > 0) {
				return;
			}

			LinkedListToken tok = (LinkedListToken)input.LT(1);
			LinkedListToken placeholder = TokenBuilder.newPlaceholder(imaginary);
			tok.beforeInsert(placeholder);
		}



	public static class comment_body_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "comment_body"
	// Javadoc.g:78:1: comment_body : d= description ( paragraph_tag )* EOF -> ^( JAVADOC description ( paragraph_tag )* ) ;
	public final JavadocParser.comment_body_return comment_body() throws RecognitionException {
		JavadocParser.comment_body_return retval = new JavadocParser.comment_body_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope d =null;
		ParserRuleReturnScope paragraph_tag1 =null;

		LinkedListTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_description=new RewriteRuleSubtreeStream(adaptor,"rule description");
		RewriteRuleSubtreeStream stream_paragraph_tag=new RewriteRuleSubtreeStream(adaptor,"rule paragraph_tag");

		try {
			// Javadoc.g:79:2: (d= description ( paragraph_tag )* EOF -> ^( JAVADOC description ( paragraph_tag )* ) )
			// Javadoc.g:79:4: d= description ( paragraph_tag )* EOF
			{
			pushFollow(FOLLOW_description_in_comment_body110);
			d=description();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_description.add(d.getTree());
			if ( state.backtracking==0 ) {placeholder((d!=null?((LinkedListTree)d.getTree()):null));}
			// Javadoc.g:80:3: ( paragraph_tag )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ATWORD) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Javadoc.g:80:3: paragraph_tag
					{
					pushFollow(FOLLOW_paragraph_tag_in_comment_body116);
					paragraph_tag1=paragraph_tag();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paragraph_tag.add(paragraph_tag1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_comment_body121); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: description, paragraph_tag
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 82:3: -> ^( JAVADOC description ( paragraph_tag )* )
			{
				// Javadoc.g:82:6: ^( JAVADOC description ( paragraph_tag )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(JAVADOC, "JAVADOC"), root_1);
				adaptor.addChild(root_1, stream_description.nextTree());
				// Javadoc.g:82:28: ( paragraph_tag )*
				while ( stream_paragraph_tag.hasNext() ) {
					adaptor.addChild(root_1, stream_paragraph_tag.nextTree());
				}
				stream_paragraph_tag.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comment_body"


	public static class description_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "description"
	// Javadoc.g:85:1: description : ( text_line )* -> ^( DESCRIPTION ( text_line )* ) ;
	public final JavadocParser.description_return description() throws RecognitionException {
		JavadocParser.description_return retval = new JavadocParser.description_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope text_line3 =null;

		RewriteRuleSubtreeStream stream_text_line=new RewriteRuleSubtreeStream(adaptor,"rule text_line");

		try {
			// Javadoc.g:86:2: ( ( text_line )* -> ^( DESCRIPTION ( text_line )* ) )
			// Javadoc.g:86:4: ( text_line )*
			{
			// Javadoc.g:86:4: ( text_line )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==AT||(LA2_0 >= LBRACE && LA2_0 <= NL)||(LA2_0 >= RBRACE && LA2_0 <= STARS)||LA2_0==WORD||LA2_0==WS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Javadoc.g:86:4: text_line
					{
					pushFollow(FOLLOW_text_line_in_description145);
					text_line3=text_line();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_text_line.add(text_line3.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			// AST REWRITE
			// elements: text_line
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 87:3: -> ^( DESCRIPTION ( text_line )* )
			{
				// Javadoc.g:87:6: ^( DESCRIPTION ( text_line )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(DESCRIPTION, "DESCRIPTION"), root_1);
				// Javadoc.g:87:20: ( text_line )*
				while ( stream_text_line.hasNext() ) {
					adaptor.addChild(root_1, stream_text_line.nextTree());
				}
				stream_text_line.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "description"


	public static class text_line_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "text_line"
	// Javadoc.g:90:1: text_line : ( text_line_start ( text_line_content )* ( NL | EOF !) | NL );
	public final JavadocParser.text_line_return text_line() throws RecognitionException {
		JavadocParser.text_line_return retval = new JavadocParser.text_line_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token NL6=null;
		Token EOF7=null;
		Token NL8=null;
		ParserRuleReturnScope text_line_start4 =null;
		ParserRuleReturnScope text_line_content5 =null;

		LinkedListTree NL6_tree=null;
		LinkedListTree EOF7_tree=null;
		LinkedListTree NL8_tree=null;

		try {
			// Javadoc.g:91:2: ( text_line_start ( text_line_content )* ( NL | EOF !) | NL )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==AT||LA5_0==LBRACE||(LA5_0 >= RBRACE && LA5_0 <= STARS)||LA5_0==WORD||LA5_0==WS) ) {
				alt5=1;
			}
			else if ( (LA5_0==NL) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// Javadoc.g:91:4: text_line_start ( text_line_content )* ( NL | EOF !)
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_text_line_start_in_text_line168);
					text_line_start4=text_line_start();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, text_line_start4.getTree());

					// Javadoc.g:92:3: ( text_line_content )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= AT && LA3_0 <= ATWORD)||LA3_0==LBRACE||(LA3_0 >= RBRACE && LA3_0 <= STARS)||LA3_0==WORD||LA3_0==WS) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// Javadoc.g:92:3: text_line_content
							{
							pushFollow(FOLLOW_text_line_content_in_text_line172);
							text_line_content5=text_line_content();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, text_line_content5.getTree());

							}
							break;

						default :
							break loop3;
						}
					}

					// Javadoc.g:93:3: ( NL | EOF !)
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==NL) ) {
						alt4=1;
					}
					else if ( (LA4_0==EOF) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// Javadoc.g:93:4: NL
							{
							NL6=(Token)match(input,NL,FOLLOW_NL_in_text_line178); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NL6_tree = (LinkedListTree)adaptor.create(NL6);
							adaptor.addChild(root_0, NL6_tree);
							}

							}
							break;
						case 2 :
							// Javadoc.g:93:9: EOF !
							{
							EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_text_line182); if (state.failed) return retval;
							}
							break;

					}

					}
					break;
				case 2 :
					// Javadoc.g:94:4: NL
					{
					root_0 = (LinkedListTree)adaptor.nil();


					NL8=(Token)match(input,NL,FOLLOW_NL_in_text_line189); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NL8_tree = (LinkedListTree)adaptor.create(NL8);
					adaptor.addChild(root_0, NL8_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "text_line"


	public static class text_line_start_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "text_line_start"
	// Javadoc.g:97:1: text_line_start : ( ( LBRACE ATWORD )=> inline_tag | WORD | STARS | WS | LBRACE | RBRACE | AT );
	public final JavadocParser.text_line_start_return text_line_start() throws RecognitionException {
		JavadocParser.text_line_start_return retval = new JavadocParser.text_line_start_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token WORD10=null;
		Token STARS11=null;
		Token WS12=null;
		Token LBRACE13=null;
		Token RBRACE14=null;
		Token AT15=null;
		ParserRuleReturnScope inline_tag9 =null;

		LinkedListTree WORD10_tree=null;
		LinkedListTree STARS11_tree=null;
		LinkedListTree WS12_tree=null;
		LinkedListTree LBRACE13_tree=null;
		LinkedListTree RBRACE14_tree=null;
		LinkedListTree AT15_tree=null;

		try {
			// Javadoc.g:98:2: ( ( LBRACE ATWORD )=> inline_tag | WORD | STARS | WS | LBRACE | RBRACE | AT )
			int alt6=7;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// Javadoc.g:98:4: ( LBRACE ATWORD )=> inline_tag
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_inline_tag_in_text_line_start207);
					inline_tag9=inline_tag();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, inline_tag9.getTree());

					}
					break;
				case 2 :
					// Javadoc.g:99:4: WORD
					{
					root_0 = (LinkedListTree)adaptor.nil();


					WORD10=(Token)match(input,WORD,FOLLOW_WORD_in_text_line_start212); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WORD10_tree = (LinkedListTree)adaptor.create(WORD10);
					adaptor.addChild(root_0, WORD10_tree);
					}

					}
					break;
				case 3 :
					// Javadoc.g:99:11: STARS
					{
					root_0 = (LinkedListTree)adaptor.nil();


					STARS11=(Token)match(input,STARS,FOLLOW_STARS_in_text_line_start216); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STARS11_tree = (LinkedListTree)adaptor.create(STARS11);
					adaptor.addChild(root_0, STARS11_tree);
					}

					}
					break;
				case 4 :
					// Javadoc.g:99:19: WS
					{
					root_0 = (LinkedListTree)adaptor.nil();


					WS12=(Token)match(input,WS,FOLLOW_WS_in_text_line_start220); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WS12_tree = (LinkedListTree)adaptor.create(WS12);
					adaptor.addChild(root_0, WS12_tree);
					}

					}
					break;
				case 5 :
					// Javadoc.g:99:24: LBRACE
					{
					root_0 = (LinkedListTree)adaptor.nil();


					LBRACE13=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_text_line_start224); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LBRACE13_tree = (LinkedListTree)adaptor.create(LBRACE13);
					adaptor.addChild(root_0, LBRACE13_tree);
					}

					}
					break;
				case 6 :
					// Javadoc.g:99:33: RBRACE
					{
					root_0 = (LinkedListTree)adaptor.nil();


					RBRACE14=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_text_line_start228); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RBRACE14_tree = (LinkedListTree)adaptor.create(RBRACE14);
					adaptor.addChild(root_0, RBRACE14_tree);
					}

					}
					break;
				case 7 :
					// Javadoc.g:99:42: AT
					{
					root_0 = (LinkedListTree)adaptor.nil();


					AT15=(Token)match(input,AT,FOLLOW_AT_in_text_line_start232); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT15_tree = (LinkedListTree)adaptor.create(AT15);
					adaptor.addChild(root_0, AT15_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "text_line_start"


	public static class text_line_content_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "text_line_content"
	// Javadoc.g:102:1: text_line_content : ( ( LBRACE ATWORD )=> inline_tag | WORD | STARS | WS | LBRACE | RBRACE | AT | ATWORD );
	public final JavadocParser.text_line_content_return text_line_content() throws RecognitionException {
		JavadocParser.text_line_content_return retval = new JavadocParser.text_line_content_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token WORD17=null;
		Token STARS18=null;
		Token WS19=null;
		Token LBRACE20=null;
		Token RBRACE21=null;
		Token AT22=null;
		Token ATWORD23=null;
		ParserRuleReturnScope inline_tag16 =null;

		LinkedListTree WORD17_tree=null;
		LinkedListTree STARS18_tree=null;
		LinkedListTree WS19_tree=null;
		LinkedListTree LBRACE20_tree=null;
		LinkedListTree RBRACE21_tree=null;
		LinkedListTree AT22_tree=null;
		LinkedListTree ATWORD23_tree=null;

		try {
			// Javadoc.g:103:2: ( ( LBRACE ATWORD )=> inline_tag | WORD | STARS | WS | LBRACE | RBRACE | AT | ATWORD )
			int alt7=8;
			alt7 = dfa7.predict(input);
			switch (alt7) {
				case 1 :
					// Javadoc.g:103:4: ( LBRACE ATWORD )=> inline_tag
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_inline_tag_in_text_line_content250);
					inline_tag16=inline_tag();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, inline_tag16.getTree());

					}
					break;
				case 2 :
					// Javadoc.g:104:4: WORD
					{
					root_0 = (LinkedListTree)adaptor.nil();


					WORD17=(Token)match(input,WORD,FOLLOW_WORD_in_text_line_content255); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WORD17_tree = (LinkedListTree)adaptor.create(WORD17);
					adaptor.addChild(root_0, WORD17_tree);
					}

					}
					break;
				case 3 :
					// Javadoc.g:104:11: STARS
					{
					root_0 = (LinkedListTree)adaptor.nil();


					STARS18=(Token)match(input,STARS,FOLLOW_STARS_in_text_line_content259); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STARS18_tree = (LinkedListTree)adaptor.create(STARS18);
					adaptor.addChild(root_0, STARS18_tree);
					}

					}
					break;
				case 4 :
					// Javadoc.g:104:19: WS
					{
					root_0 = (LinkedListTree)adaptor.nil();


					WS19=(Token)match(input,WS,FOLLOW_WS_in_text_line_content263); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WS19_tree = (LinkedListTree)adaptor.create(WS19);
					adaptor.addChild(root_0, WS19_tree);
					}

					}
					break;
				case 5 :
					// Javadoc.g:104:24: LBRACE
					{
					root_0 = (LinkedListTree)adaptor.nil();


					LBRACE20=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_text_line_content267); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LBRACE20_tree = (LinkedListTree)adaptor.create(LBRACE20);
					adaptor.addChild(root_0, LBRACE20_tree);
					}

					}
					break;
				case 6 :
					// Javadoc.g:104:33: RBRACE
					{
					root_0 = (LinkedListTree)adaptor.nil();


					RBRACE21=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_text_line_content271); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RBRACE21_tree = (LinkedListTree)adaptor.create(RBRACE21);
					adaptor.addChild(root_0, RBRACE21_tree);
					}

					}
					break;
				case 7 :
					// Javadoc.g:104:42: AT
					{
					root_0 = (LinkedListTree)adaptor.nil();


					AT22=(Token)match(input,AT,FOLLOW_AT_in_text_line_content275); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT22_tree = (LinkedListTree)adaptor.create(AT22);
					adaptor.addChild(root_0, AT22_tree);
					}

					}
					break;
				case 8 :
					// Javadoc.g:104:47: ATWORD
					{
					root_0 = (LinkedListTree)adaptor.nil();


					ATWORD23=(Token)match(input,ATWORD,FOLLOW_ATWORD_in_text_line_content279); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ATWORD23_tree = (LinkedListTree)adaptor.create(ATWORD23);
					adaptor.addChild(root_0, ATWORD23_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "text_line_content"


	public static class inline_tag_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "inline_tag"
	// Javadoc.g:107:1: inline_tag : LBRACE ATWORD ( inline_tag_content )* RBRACE -> ^( INLINE_TAG ATWORD ( inline_tag_content )* ) ;
	public final JavadocParser.inline_tag_return inline_tag() throws RecognitionException {
		JavadocParser.inline_tag_return retval = new JavadocParser.inline_tag_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token LBRACE24=null;
		Token ATWORD25=null;
		Token RBRACE27=null;
		ParserRuleReturnScope inline_tag_content26 =null;

		LinkedListTree LBRACE24_tree=null;
		LinkedListTree ATWORD25_tree=null;
		LinkedListTree RBRACE27_tree=null;
		RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
		RewriteRuleTokenStream stream_ATWORD=new RewriteRuleTokenStream(adaptor,"token ATWORD");
		RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
		RewriteRuleSubtreeStream stream_inline_tag_content=new RewriteRuleSubtreeStream(adaptor,"rule inline_tag_content");

		try {
			// Javadoc.g:108:2: ( LBRACE ATWORD ( inline_tag_content )* RBRACE -> ^( INLINE_TAG ATWORD ( inline_tag_content )* ) )
			// Javadoc.g:108:4: LBRACE ATWORD ( inline_tag_content )* RBRACE
			{
			LBRACE24=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_inline_tag290); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE24);

			ATWORD25=(Token)match(input,ATWORD,FOLLOW_ATWORD_in_inline_tag292); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ATWORD.add(ATWORD25);

			// Javadoc.g:108:18: ( inline_tag_content )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==AT||LA8_0==NL||LA8_0==STARS||LA8_0==WORD||LA8_0==WS) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Javadoc.g:108:18: inline_tag_content
					{
					pushFollow(FOLLOW_inline_tag_content_in_inline_tag294);
					inline_tag_content26=inline_tag_content();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_inline_tag_content.add(inline_tag_content26.getTree());
					}
					break;

				default :
					break loop8;
				}
			}

			RBRACE27=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_inline_tag297); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE27);

			// AST REWRITE
			// elements: inline_tag_content, ATWORD
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 109:3: -> ^( INLINE_TAG ATWORD ( inline_tag_content )* )
			{
				// Javadoc.g:109:6: ^( INLINE_TAG ATWORD ( inline_tag_content )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(INLINE_TAG, "INLINE_TAG"), root_1);
				adaptor.addChild(root_1, stream_ATWORD.nextNode());
				// Javadoc.g:109:26: ( inline_tag_content )*
				while ( stream_inline_tag_content.hasNext() ) {
					adaptor.addChild(root_1, stream_inline_tag_content.nextTree());
				}
				stream_inline_tag_content.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inline_tag"


	public static class inline_tag_content_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "inline_tag_content"
	// Javadoc.g:112:1: inline_tag_content : ( WORD | STARS | WS | AT | NL );
	public final JavadocParser.inline_tag_content_return inline_tag_content() throws RecognitionException {
		JavadocParser.inline_tag_content_return retval = new JavadocParser.inline_tag_content_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set28=null;

		LinkedListTree set28_tree=null;

		try {
			// Javadoc.g:113:2: ( WORD | STARS | WS | AT | NL )
			// Javadoc.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set28=input.LT(1);
			if ( input.LA(1)==AT||input.LA(1)==NL||input.LA(1)==STARS||input.LA(1)==WORD||input.LA(1)==WS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set28));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inline_tag_content"


	public static class paragraph_tag_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "paragraph_tag"
	// Javadoc.g:116:1: paragraph_tag : ATWORD paragraph_tag_tail -> ^( PARA_TAG ATWORD paragraph_tag_tail ) ;
	public final JavadocParser.paragraph_tag_return paragraph_tag() throws RecognitionException {
		JavadocParser.paragraph_tag_return retval = new JavadocParser.paragraph_tag_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token ATWORD29=null;
		ParserRuleReturnScope paragraph_tag_tail30 =null;

		LinkedListTree ATWORD29_tree=null;
		RewriteRuleTokenStream stream_ATWORD=new RewriteRuleTokenStream(adaptor,"token ATWORD");
		RewriteRuleSubtreeStream stream_paragraph_tag_tail=new RewriteRuleSubtreeStream(adaptor,"rule paragraph_tag_tail");

		try {
			// Javadoc.g:117:2: ( ATWORD paragraph_tag_tail -> ^( PARA_TAG ATWORD paragraph_tag_tail ) )
			// Javadoc.g:117:4: ATWORD paragraph_tag_tail
			{
			ATWORD29=(Token)match(input,ATWORD,FOLLOW_ATWORD_in_paragraph_tag348); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ATWORD.add(ATWORD29);

			pushFollow(FOLLOW_paragraph_tag_tail_in_paragraph_tag350);
			paragraph_tag_tail30=paragraph_tag_tail();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_paragraph_tag_tail.add(paragraph_tag_tail30.getTree());
			// AST REWRITE
			// elements: ATWORD, paragraph_tag_tail
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 118:3: -> ^( PARA_TAG ATWORD paragraph_tag_tail )
			{
				// Javadoc.g:118:6: ^( PARA_TAG ATWORD paragraph_tag_tail )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PARA_TAG, "PARA_TAG"), root_1);
				adaptor.addChild(root_1, stream_ATWORD.nextNode());
				adaptor.addChild(root_1, stream_paragraph_tag_tail.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paragraph_tag"


	public static class paragraph_tag_tail_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "paragraph_tag_tail"
	// Javadoc.g:121:1: paragraph_tag_tail : ( text_line_content )* ( NL ( text_line )* | EOF ) -> ( text_line_content )* ( NL )? ( text_line )* ;
	public final JavadocParser.paragraph_tag_tail_return paragraph_tag_tail() throws RecognitionException {
		JavadocParser.paragraph_tag_tail_return retval = new JavadocParser.paragraph_tag_tail_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token NL32=null;
		Token EOF34=null;
		ParserRuleReturnScope text_line_content31 =null;
		ParserRuleReturnScope text_line33 =null;

		LinkedListTree NL32_tree=null;
		LinkedListTree EOF34_tree=null;
		RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_text_line=new RewriteRuleSubtreeStream(adaptor,"rule text_line");
		RewriteRuleSubtreeStream stream_text_line_content=new RewriteRuleSubtreeStream(adaptor,"rule text_line_content");

		try {
			// Javadoc.g:122:2: ( ( text_line_content )* ( NL ( text_line )* | EOF ) -> ( text_line_content )* ( NL )? ( text_line )* )
			// Javadoc.g:122:4: ( text_line_content )* ( NL ( text_line )* | EOF )
			{
			// Javadoc.g:122:4: ( text_line_content )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= AT && LA9_0 <= ATWORD)||LA9_0==LBRACE||(LA9_0 >= RBRACE && LA9_0 <= STARS)||LA9_0==WORD||LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Javadoc.g:122:4: text_line_content
					{
					pushFollow(FOLLOW_text_line_content_in_paragraph_tag_tail373);
					text_line_content31=text_line_content();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_text_line_content.add(text_line_content31.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// Javadoc.g:123:3: ( NL ( text_line )* | EOF )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==NL) ) {
				alt11=1;
			}
			else if ( (LA11_0==EOF) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// Javadoc.g:123:5: NL ( text_line )*
					{
					NL32=(Token)match(input,NL,FOLLOW_NL_in_paragraph_tag_tail380); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NL.add(NL32);

					// Javadoc.g:123:8: ( text_line )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==AT||(LA10_0 >= LBRACE && LA10_0 <= NL)||(LA10_0 >= RBRACE && LA10_0 <= STARS)||LA10_0==WORD||LA10_0==WS) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Javadoc.g:123:8: text_line
							{
							pushFollow(FOLLOW_text_line_in_paragraph_tag_tail382);
							text_line33=text_line();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_text_line.add(text_line33.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;
				case 2 :
					// Javadoc.g:124:5: EOF
					{
					EOF34=(Token)match(input,EOF,FOLLOW_EOF_in_paragraph_tag_tail389); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EOF.add(EOF34);

					}
					break;

			}

			// AST REWRITE
			// elements: text_line_content, text_line, NL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 126:3: -> ( text_line_content )* ( NL )? ( text_line )*
			{
				// Javadoc.g:126:6: ( text_line_content )*
				while ( stream_text_line_content.hasNext() ) {
					adaptor.addChild(root_0, stream_text_line_content.nextTree());
				}
				stream_text_line_content.reset();

				// Javadoc.g:126:25: ( NL )?
				if ( stream_NL.hasNext() ) {
					adaptor.addChild(root_0, stream_NL.nextNode());
				}
				stream_NL.reset();

				// Javadoc.g:126:29: ( text_line )*
				while ( stream_text_line.hasNext() ) {
					adaptor.addChild(root_0, stream_text_line.nextTree());
				}
				stream_text_line.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paragraph_tag_tail"

	// $ANTLR start synpred1_Javadoc
	public final void synpred1_Javadoc_fragment() throws RecognitionException {
		// Javadoc.g:98:4: ( LBRACE ATWORD )
		// Javadoc.g:98:5: LBRACE ATWORD
		{
		match(input,LBRACE,FOLLOW_LBRACE_in_synpred1_Javadoc201); if (state.failed) return;

		match(input,ATWORD,FOLLOW_ATWORD_in_synpred1_Javadoc203); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Javadoc

	// $ANTLR start synpred2_Javadoc
	public final void synpred2_Javadoc_fragment() throws RecognitionException {
		// Javadoc.g:103:4: ( LBRACE ATWORD )
		// Javadoc.g:103:5: LBRACE ATWORD
		{
		match(input,LBRACE,FOLLOW_LBRACE_in_synpred2_Javadoc244); if (state.failed) return;

		match(input,ATWORD,FOLLOW_ATWORD_in_synpred2_Javadoc246); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Javadoc

	// Delegated rules

	public final boolean synpred2_Javadoc() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Javadoc_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Javadoc() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Javadoc_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA6 dfa6 = new DFA6(this);
	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA6_eotS =
		"\120\uffff";
	static final String DFA6_eofS =
		"\1\uffff\1\10\5\uffff\1\10\10\uffff\1\10\1\uffff\1\10\2\uffff\3\10\70"+
		"\uffff";
	static final String DFA6_minS =
		"\2\4\5\uffff\1\4\10\uffff\1\4\1\0\1\4\2\uffff\3\4\1\uffff\2\0\3\uffff"+
		"\4\0\12\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff"+
		"\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff";
	static final String DFA6_maxS =
		"\2\21\5\uffff\1\21\10\uffff\1\21\1\0\1\21\2\uffff\3\21\1\uffff\2\0\3\uffff"+
		"\4\0\12\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff"+
		"\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff";
	static final String DFA6_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\6\1\7\1\uffff\1\5\42\uffff\1\1\44\uffff";
	static final String DFA6_specialS =
		"\21\uffff\1\0\7\uffff\1\1\1\2\3\uffff\1\3\1\4\1\5\1\6\12\uffff\1\7\1\10"+
		"\1\11\2\uffff\1\12\1\13\1\14\1\uffff\1\15\1\16\1\17\2\uffff\1\20\1\21"+
		"\1\22\1\uffff\1\23\1\24\1\25\2\uffff\1\26\1\27\1\30\1\uffff\1\31\1\32"+
		"\1\33\2\uffff\1\34\1\35\1\36\1\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\6\4\uffff\1\1\2\uffff\1\5\1\3\1\uffff\1\2\1\uffff\1\4",
			"\1\10\1\7\3\uffff\2\10\1\uffff\2\10\1\uffff\1\10\1\uffff\1\10",
			"",
			"",
			"",
			"",
			"",
			"\1\27\1\10\3\uffff\1\10\1\20\1\uffff\1\21\1\25\1\uffff\1\22\1\uffff"+
			"\1\26",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\40\1\10\3\uffff\1\10\1\41\1\uffff\1\31\1\36\1\uffff\1\32\1\uffff"+
			"\1\37",
			"\1\uffff",
			"\1\63\1\10\3\uffff\1\10\1\55\1\uffff\1\54\1\61\1\uffff\1\56\1\uffff"+
			"\1\62",
			"",
			"",
			"\1\74\1\10\3\uffff\1\10\1\66\1\uffff\1\65\1\72\1\uffff\1\67\1\uffff"+
			"\1\73",
			"\1\105\1\10\3\uffff\1\10\1\77\1\uffff\1\76\1\103\1\uffff\1\100\1\uffff"+
			"\1\104",
			"\1\116\1\10\3\uffff\1\10\1\110\1\uffff\1\107\1\114\1\uffff\1\111\1\uffff"+
			"\1\115",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "97:1: text_line_start : ( ( LBRACE ATWORD )=> inline_tag | WORD | STARS | WS | LBRACE | RBRACE | AT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_17 = input.LA(1);
						 
						int index6_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_17);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA6_25 = input.LA(1);
						 
						int index6_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_25);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA6_26 = input.LA(1);
						 
						int index6_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_26);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA6_30 = input.LA(1);
						 
						int index6_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_30);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA6_31 = input.LA(1);
						 
						int index6_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_31);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA6_32 = input.LA(1);
						 
						int index6_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_32);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA6_33 = input.LA(1);
						 
						int index6_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_33);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA6_44 = input.LA(1);
						 
						int index6_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_44);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA6_45 = input.LA(1);
						 
						int index6_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_45);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA6_46 = input.LA(1);
						 
						int index6_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_46);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA6_49 = input.LA(1);
						 
						int index6_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_49);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA6_50 = input.LA(1);
						 
						int index6_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_50);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA6_51 = input.LA(1);
						 
						int index6_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_51);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA6_53 = input.LA(1);
						 
						int index6_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_53);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA6_54 = input.LA(1);
						 
						int index6_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_54);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA6_55 = input.LA(1);
						 
						int index6_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_55);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA6_58 = input.LA(1);
						 
						int index6_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_58);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA6_59 = input.LA(1);
						 
						int index6_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_59);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA6_60 = input.LA(1);
						 
						int index6_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_60);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA6_62 = input.LA(1);
						 
						int index6_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_62);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA6_63 = input.LA(1);
						 
						int index6_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_63);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA6_64 = input.LA(1);
						 
						int index6_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_64);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA6_67 = input.LA(1);
						 
						int index6_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_67);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA6_68 = input.LA(1);
						 
						int index6_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_68);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA6_69 = input.LA(1);
						 
						int index6_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_69);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA6_71 = input.LA(1);
						 
						int index6_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_71);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA6_72 = input.LA(1);
						 
						int index6_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_72);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA6_73 = input.LA(1);
						 
						int index6_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_73);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA6_76 = input.LA(1);
						 
						int index6_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_76);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA6_77 = input.LA(1);
						 
						int index6_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_77);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA6_78 = input.LA(1);
						 
						int index6_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Javadoc()) ) {s = 43;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index6_78);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 6, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA7_eotS =
		"\121\uffff";
	static final String DFA7_eofS =
		"\1\uffff\1\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\2\uffff\3\11\70"+
		"\uffff";
	static final String DFA7_minS =
		"\2\4\6\uffff\1\4\10\uffff\1\4\1\0\1\4\2\uffff\3\4\1\uffff\2\0\3\uffff"+
		"\4\0\12\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff"+
		"\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff";
	static final String DFA7_maxS =
		"\2\21\6\uffff\1\21\10\uffff\1\21\1\0\1\21\2\uffff\3\21\1\uffff\2\0\3\uffff"+
		"\4\0\12\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff"+
		"\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\6\1\7\1\10\1\uffff\1\5\42\uffff\1\1\44\uffff";
	static final String DFA7_specialS =
		"\22\uffff\1\0\7\uffff\1\1\1\2\3\uffff\1\3\1\4\1\5\1\6\12\uffff\1\7\1\10"+
		"\1\11\2\uffff\1\12\1\13\1\14\1\uffff\1\15\1\16\1\17\2\uffff\1\20\1\21"+
		"\1\22\1\uffff\1\23\1\24\1\25\2\uffff\1\26\1\27\1\30\1\uffff\1\31\1\32"+
		"\1\33\2\uffff\1\34\1\35\1\36\1\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\6\1\7\3\uffff\1\1\2\uffff\1\5\1\3\1\uffff\1\2\1\uffff\1\4",
			"\1\11\1\10\3\uffff\2\11\1\uffff\2\11\1\uffff\1\11\1\uffff\1\11",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\30\1\11\3\uffff\1\11\1\21\1\uffff\1\22\1\26\1\uffff\1\23\1\uffff"+
			"\1\27",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\41\1\11\3\uffff\1\11\1\42\1\uffff\1\32\1\37\1\uffff\1\33\1\uffff"+
			"\1\40",
			"\1\uffff",
			"\1\64\1\11\3\uffff\1\11\1\56\1\uffff\1\55\1\62\1\uffff\1\57\1\uffff"+
			"\1\63",
			"",
			"",
			"\1\75\1\11\3\uffff\1\11\1\67\1\uffff\1\66\1\73\1\uffff\1\70\1\uffff"+
			"\1\74",
			"\1\106\1\11\3\uffff\1\11\1\100\1\uffff\1\77\1\104\1\uffff\1\101\1\uffff"+
			"\1\105",
			"\1\117\1\11\3\uffff\1\11\1\111\1\uffff\1\110\1\115\1\uffff\1\112\1\uffff"+
			"\1\116",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "102:1: text_line_content : ( ( LBRACE ATWORD )=> inline_tag | WORD | STARS | WS | LBRACE | RBRACE | AT | ATWORD );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA7_18 = input.LA(1);
						 
						int index7_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_18);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA7_26 = input.LA(1);
						 
						int index7_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_26);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA7_27 = input.LA(1);
						 
						int index7_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_27);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA7_31 = input.LA(1);
						 
						int index7_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_31);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA7_32 = input.LA(1);
						 
						int index7_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_32);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA7_33 = input.LA(1);
						 
						int index7_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_33);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA7_34 = input.LA(1);
						 
						int index7_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_34);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA7_45 = input.LA(1);
						 
						int index7_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_45);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA7_46 = input.LA(1);
						 
						int index7_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_46);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA7_47 = input.LA(1);
						 
						int index7_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_47);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA7_50 = input.LA(1);
						 
						int index7_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_50);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA7_51 = input.LA(1);
						 
						int index7_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_51);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA7_52 = input.LA(1);
						 
						int index7_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_52);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA7_54 = input.LA(1);
						 
						int index7_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_54);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA7_55 = input.LA(1);
						 
						int index7_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_55);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA7_56 = input.LA(1);
						 
						int index7_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_56);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA7_59 = input.LA(1);
						 
						int index7_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_59);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA7_60 = input.LA(1);
						 
						int index7_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_60);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA7_61 = input.LA(1);
						 
						int index7_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_61);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA7_63 = input.LA(1);
						 
						int index7_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_63);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA7_64 = input.LA(1);
						 
						int index7_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_64);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA7_65 = input.LA(1);
						 
						int index7_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_65);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA7_68 = input.LA(1);
						 
						int index7_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_68);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA7_69 = input.LA(1);
						 
						int index7_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_69);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA7_70 = input.LA(1);
						 
						int index7_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_70);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA7_72 = input.LA(1);
						 
						int index7_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_72);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA7_73 = input.LA(1);
						 
						int index7_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_73);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA7_74 = input.LA(1);
						 
						int index7_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_74);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA7_77 = input.LA(1);
						 
						int index7_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_77);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA7_78 = input.LA(1);
						 
						int index7_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_78);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA7_79 = input.LA(1);
						 
						int index7_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Javadoc()) ) {s = 44;}
						else if ( (true) ) {s = 9;}
						 
						input.seek(index7_79);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 7, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_description_in_comment_body110 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paragraph_tag_in_comment_body116 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EOF_in_comment_body121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_text_line_in_description145 = new BitSet(new long[]{0x000000000002B612L});
	public static final BitSet FOLLOW_text_line_start_in_text_line168 = new BitSet(new long[]{0x000000000002B630L});
	public static final BitSet FOLLOW_text_line_content_in_text_line172 = new BitSet(new long[]{0x000000000002B630L});
	public static final BitSet FOLLOW_NL_in_text_line178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_text_line182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NL_in_text_line189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inline_tag_in_text_line_start207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_text_line_start212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STARS_in_text_line_start216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_text_line_start220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_text_line_start224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_text_line_start228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_text_line_start232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inline_tag_in_text_line_content250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WORD_in_text_line_content255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STARS_in_text_line_content259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_text_line_content263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_text_line_content267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_text_line_content271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_text_line_content275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATWORD_in_text_line_content279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_inline_tag290 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ATWORD_in_inline_tag292 = new BitSet(new long[]{0x000000000002B410L});
	public static final BitSet FOLLOW_inline_tag_content_in_inline_tag294 = new BitSet(new long[]{0x000000000002B410L});
	public static final BitSet FOLLOW_RBRACE_in_inline_tag297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATWORD_in_paragraph_tag348 = new BitSet(new long[]{0x000000000002B630L});
	public static final BitSet FOLLOW_paragraph_tag_tail_in_paragraph_tag350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_text_line_content_in_paragraph_tag_tail373 = new BitSet(new long[]{0x000000000002B630L});
	public static final BitSet FOLLOW_NL_in_paragraph_tag_tail380 = new BitSet(new long[]{0x000000000002B612L});
	public static final BitSet FOLLOW_text_line_in_paragraph_tag_tail382 = new BitSet(new long[]{0x000000000002B612L});
	public static final BitSet FOLLOW_EOF_in_paragraph_tag_tail389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_synpred1_Javadoc201 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ATWORD_in_synpred1_Javadoc203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_synpred2_Javadoc244 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ATWORD_in_synpred2_Javadoc246 = new BitSet(new long[]{0x0000000000000002L});
}
