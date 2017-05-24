// $ANTLR 3.5.2 E4X.g 2017-05-23 22:28:41

package uk.co.badgersinfoil.metaas.impl.parser.e4x;

import uk.co.badgersinfoil.metaas.impl.antlr.LinkedListTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class E4XParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "UNICODE_DIGIT", "UNICODE_LETTER", 
		"XML_APOSTROPHE", "XML_ASSIGN", "XML_ATTRIBUTE", "XML_CDATA", "XML_COMMENT", 
		"XML_ELEMENT", "XML_EMPTY_ELEMENT", "XML_EXPRESSION", "XML_LCHEVRON", 
		"XML_LIST", "XML_NAME", "XML_NAME_PART", "XML_NAME_START", "XML_PI", "XML_PI_END", 
		"XML_PI_START", "XML_QUOTE", "XML_TEXT", "XML_TEXT_NODE", "XML_WS", "'/>'", 
		"'</'", "'</>'", "'>'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public E4XParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public E4XParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return E4XParser.tokenNames; }
	@Override public String getGrammarFileName() { return "E4X.g"; }


		// disable standard error handling; be strict
		protected void mismatch(IntStream input, int ttype, BitSet follow)
			throws RecognitionException
		{
			throw new MismatchedTokenException(ttype, input);
		}

		private E4XLexer lexer;
		private CharStream cs;

		public void setInput(E4XLexer lexer, CharStream cs) {
			this.lexer = lexer;
			this.cs = cs;
		}

		/**
		 * Returns the input left unconsumed after the last parse operation.
		 * Because of lookahead in the parser, there is no guarantee that the
		 * lexer has not consumed input ahead of the current parse-point for
		 * any abritrary rule. This method is only intended to grab the
		 * remaining input after recognising 'xmlPrimary'.
		 */
		public String getInputTail() {
			return cs.substring(cs.index()-1, cs.size()-1);
		}


	public static class xmlMarkup_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlMarkup"
	// E4X.g:81:1: xmlMarkup : ( XML_COMMENT | XML_CDATA | xmlProcessingInstruction );
	public final E4XParser.xmlMarkup_return xmlMarkup() throws RecognitionException {
		E4XParser.xmlMarkup_return retval = new E4XParser.xmlMarkup_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token XML_COMMENT1=null;
		Token XML_CDATA2=null;
		ParserRuleReturnScope xmlProcessingInstruction3 =null;

		LinkedListTree XML_COMMENT1_tree=null;
		LinkedListTree XML_CDATA2_tree=null;

		try {
			// E4X.g:82:2: ( XML_COMMENT | XML_CDATA | xmlProcessingInstruction )
			int alt1=3;
			switch ( input.LA(1) ) {
			case XML_COMMENT:
				{
				alt1=1;
				}
				break;
			case XML_CDATA:
				{
				alt1=2;
				}
				break;
			case XML_PI_START:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// E4X.g:82:4: XML_COMMENT
					{
					root_0 = (LinkedListTree)adaptor.nil();


					XML_COMMENT1=(Token)match(input,XML_COMMENT,FOLLOW_XML_COMMENT_in_xmlMarkup109); 
					XML_COMMENT1_tree = (LinkedListTree)adaptor.create(XML_COMMENT1);
					adaptor.addChild(root_0, XML_COMMENT1_tree);

					}
					break;
				case 2 :
					// E4X.g:83:4: XML_CDATA
					{
					root_0 = (LinkedListTree)adaptor.nil();


					XML_CDATA2=(Token)match(input,XML_CDATA,FOLLOW_XML_CDATA_in_xmlMarkup114); 
					XML_CDATA2_tree = (LinkedListTree)adaptor.create(XML_CDATA2);
					adaptor.addChild(root_0, XML_CDATA2_tree);

					}
					break;
				case 3 :
					// E4X.g:84:4: xmlProcessingInstruction
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlProcessingInstruction_in_xmlMarkup119);
					xmlProcessingInstruction3=xmlProcessingInstruction();
					state._fsp--;

					adaptor.addChild(root_0, xmlProcessingInstruction3.getTree());

					}
					break;

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
	// $ANTLR end "xmlMarkup"


	public static class xmlPrimary_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlPrimary"
	// E4X.g:88:1: xmlPrimary : ( xmlListInitialiser | xmlInitialiser );
	public final E4XParser.xmlPrimary_return xmlPrimary() throws RecognitionException {
		E4XParser.xmlPrimary_return retval = new E4XParser.xmlPrimary_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope xmlListInitialiser4 =null;
		ParserRuleReturnScope xmlInitialiser5 =null;


		try {
			// E4X.g:89:2: ( xmlListInitialiser | xmlInitialiser )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==XML_LCHEVRON) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==29) ) {
					alt2=1;
				}
				else if ( (LA2_1==XML_NAME||LA2_1==30) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA2_0 >= XML_CDATA && LA2_0 <= XML_COMMENT)||LA2_0==XML_PI_START) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// E4X.g:90:2: xmlListInitialiser
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlListInitialiser_in_xmlPrimary133);
					xmlListInitialiser4=xmlListInitialiser();
					state._fsp--;

					adaptor.addChild(root_0, xmlListInitialiser4.getTree());

					}
					break;
				case 2 :
					// E4X.g:91:5: xmlInitialiser
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlInitialiser_in_xmlPrimary139);
					xmlInitialiser5=xmlInitialiser();
					state._fsp--;

					adaptor.addChild(root_0, xmlInitialiser5.getTree());

					}
					break;

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
	// $ANTLR end "xmlPrimary"


	public static class xmlInitialiser_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlInitialiser"
	// E4X.g:94:1: xmlInitialiser : ( xmlMarkup | xmlElement );
	public final E4XParser.xmlInitialiser_return xmlInitialiser() throws RecognitionException {
		E4XParser.xmlInitialiser_return retval = new E4XParser.xmlInitialiser_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope xmlMarkup6 =null;
		ParserRuleReturnScope xmlElement7 =null;


		try {
			// E4X.g:95:2: ( xmlMarkup | xmlElement )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= XML_CDATA && LA3_0 <= XML_COMMENT)||LA3_0==XML_PI_START) ) {
				alt3=1;
			}
			else if ( (LA3_0==XML_LCHEVRON) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// E4X.g:95:4: xmlMarkup
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlMarkup_in_xmlInitialiser150);
					xmlMarkup6=xmlMarkup();
					state._fsp--;

					adaptor.addChild(root_0, xmlMarkup6.getTree());

					}
					break;
				case 2 :
					// E4X.g:96:4: xmlElement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlElement_in_xmlInitialiser155);
					xmlElement7=xmlElement();
					state._fsp--;

					adaptor.addChild(root_0, xmlElement7.getTree());

					}
					break;

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
	// $ANTLR end "xmlInitialiser"


	public static class xmlElement_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlElement"
	// E4X.g:99:1: xmlElement : ( XML_LCHEVRON xmlTagContent ( XML_WS )? -> xmlTagContent ) ( '/>' -> ^( XML_EMPTY_ELEMENT $xmlElement) | '>' ( xmlElementContent )* '</' xmlTagName ( XML_WS )? '>' -> ^( XML_ELEMENT $xmlElement xmlTagName ( xmlElementContent )* ) ) ;
	public final E4XParser.xmlElement_return xmlElement() throws RecognitionException {
		E4XParser.xmlElement_return retval = new E4XParser.xmlElement_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token XML_LCHEVRON8=null;
		Token XML_WS10=null;
		Token string_literal11=null;
		Token char_literal12=null;
		Token string_literal14=null;
		Token XML_WS16=null;
		Token char_literal17=null;
		ParserRuleReturnScope xmlTagContent9 =null;
		ParserRuleReturnScope xmlElementContent13 =null;
		ParserRuleReturnScope xmlTagName15 =null;

		LinkedListTree XML_LCHEVRON8_tree=null;
		LinkedListTree XML_WS10_tree=null;
		LinkedListTree string_literal11_tree=null;
		LinkedListTree char_literal12_tree=null;
		LinkedListTree string_literal14_tree=null;
		LinkedListTree XML_WS16_tree=null;
		LinkedListTree char_literal17_tree=null;
		RewriteRuleTokenStream stream_XML_LCHEVRON=new RewriteRuleTokenStream(adaptor,"token XML_LCHEVRON");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_XML_WS=new RewriteRuleTokenStream(adaptor,"token XML_WS");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_xmlTagName=new RewriteRuleSubtreeStream(adaptor,"rule xmlTagName");
		RewriteRuleSubtreeStream stream_xmlTagContent=new RewriteRuleSubtreeStream(adaptor,"rule xmlTagContent");
		RewriteRuleSubtreeStream stream_xmlElementContent=new RewriteRuleSubtreeStream(adaptor,"rule xmlElementContent");

		try {
			// E4X.g:100:2: ( ( XML_LCHEVRON xmlTagContent ( XML_WS )? -> xmlTagContent ) ( '/>' -> ^( XML_EMPTY_ELEMENT $xmlElement) | '>' ( xmlElementContent )* '</' xmlTagName ( XML_WS )? '>' -> ^( XML_ELEMENT $xmlElement xmlTagName ( xmlElementContent )* ) ) )
			// E4X.g:100:4: ( XML_LCHEVRON xmlTagContent ( XML_WS )? -> xmlTagContent ) ( '/>' -> ^( XML_EMPTY_ELEMENT $xmlElement) | '>' ( xmlElementContent )* '</' xmlTagName ( XML_WS )? '>' -> ^( XML_ELEMENT $xmlElement xmlTagName ( xmlElementContent )* ) )
			{
			// E4X.g:100:4: ( XML_LCHEVRON xmlTagContent ( XML_WS )? -> xmlTagContent )
			// E4X.g:100:5: XML_LCHEVRON xmlTagContent ( XML_WS )?
			{
			XML_LCHEVRON8=(Token)match(input,XML_LCHEVRON,FOLLOW_XML_LCHEVRON_in_xmlElement167);  
			stream_XML_LCHEVRON.add(XML_LCHEVRON8);

			pushFollow(FOLLOW_xmlTagContent_in_xmlElement169);
			xmlTagContent9=xmlTagContent();
			state._fsp--;

			stream_xmlTagContent.add(xmlTagContent9.getTree());
			// E4X.g:100:32: ( XML_WS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==XML_WS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// E4X.g:100:32: XML_WS
					{
					XML_WS10=(Token)match(input,XML_WS,FOLLOW_XML_WS_in_xmlElement171);  
					stream_XML_WS.add(XML_WS10);

					}
					break;

			}

			// AST REWRITE
			// elements: xmlTagContent
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 100:40: -> xmlTagContent
			{
				adaptor.addChild(root_0, stream_xmlTagContent.nextTree());
			}


			retval.tree = root_0;

			}

			// E4X.g:101:3: ( '/>' -> ^( XML_EMPTY_ELEMENT $xmlElement) | '>' ( xmlElementContent )* '</' xmlTagName ( XML_WS )? '>' -> ^( XML_ELEMENT $xmlElement xmlTagName ( xmlElementContent )* ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==26) ) {
				alt7=1;
			}
			else if ( (LA7_0==29) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// E4X.g:102:4: '/>'
					{
					string_literal11=(Token)match(input,26,FOLLOW_26_in_xmlElement186);  
					stream_26.add(string_literal11);

					// AST REWRITE
					// elements: xmlElement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 103:4: -> ^( XML_EMPTY_ELEMENT $xmlElement)
					{
						// E4X.g:103:7: ^( XML_EMPTY_ELEMENT $xmlElement)
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_EMPTY_ELEMENT, "XML_EMPTY_ELEMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// E4X.g:105:6: '>' ( xmlElementContent )* '</' xmlTagName ( XML_WS )? '>'
					{
					char_literal12=(Token)match(input,29,FOLLOW_29_in_xmlElement206);  
					stream_29.add(char_literal12);

					// E4X.g:105:10: ( xmlElementContent )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= XML_APOSTROPHE && LA5_0 <= XML_ASSIGN)||(LA5_0 >= XML_CDATA && LA5_0 <= XML_COMMENT)||LA5_0==XML_LCHEVRON||LA5_0==XML_NAME||(LA5_0 >= XML_PI_START && LA5_0 <= XML_TEXT)||LA5_0==XML_WS||LA5_0==30) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// E4X.g:105:10: xmlElementContent
							{
							pushFollow(FOLLOW_xmlElementContent_in_xmlElement208);
							xmlElementContent13=xmlElementContent();
							state._fsp--;

							stream_xmlElementContent.add(xmlElementContent13.getTree());
							}
							break;

						default :
							break loop5;
						}
					}

					string_literal14=(Token)match(input,27,FOLLOW_27_in_xmlElement211);  
					stream_27.add(string_literal14);

					pushFollow(FOLLOW_xmlTagName_in_xmlElement213);
					xmlTagName15=xmlTagName();
					state._fsp--;

					stream_xmlTagName.add(xmlTagName15.getTree());
					// E4X.g:105:45: ( XML_WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==XML_WS) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// E4X.g:105:45: XML_WS
							{
							XML_WS16=(Token)match(input,XML_WS,FOLLOW_XML_WS_in_xmlElement215);  
							stream_XML_WS.add(XML_WS16);

							}
							break;

					}

					char_literal17=(Token)match(input,29,FOLLOW_29_in_xmlElement218);  
					stream_29.add(char_literal17);

					// AST REWRITE
					// elements: xmlElementContent, xmlTagName, xmlElement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 106:4: -> ^( XML_ELEMENT $xmlElement xmlTagName ( xmlElementContent )* )
					{
						// E4X.g:106:7: ^( XML_ELEMENT $xmlElement xmlTagName ( xmlElementContent )* )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_ELEMENT, "XML_ELEMENT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_xmlTagName.nextTree());
						// E4X.g:106:44: ( xmlElementContent )*
						while ( stream_xmlElementContent.hasNext() ) {
							adaptor.addChild(root_1, stream_xmlElementContent.nextTree());
						}
						stream_xmlElementContent.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

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
	// $ANTLR end "xmlElement"


	public static class xmlTagContent_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlTagContent"
	// E4X.g:110:1: xmlTagContent : xmlTagName ( xmlAttributes )? ;
	public final E4XParser.xmlTagContent_return xmlTagContent() throws RecognitionException {
		E4XParser.xmlTagContent_return retval = new E4XParser.xmlTagContent_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope xmlTagName18 =null;
		ParserRuleReturnScope xmlAttributes19 =null;


		try {
			// E4X.g:111:2: ( xmlTagName ( xmlAttributes )? )
			// E4X.g:111:4: xmlTagName ( xmlAttributes )?
			{
			root_0 = (LinkedListTree)adaptor.nil();


			pushFollow(FOLLOW_xmlTagName_in_xmlTagContent251);
			xmlTagName18=xmlTagName();
			state._fsp--;

			adaptor.addChild(root_0, xmlTagName18.getTree());

			// E4X.g:111:15: ( xmlAttributes )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==XML_WS) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==XML_NAME||LA8_1==30) ) {
					alt8=1;
				}
			}
			switch (alt8) {
				case 1 :
					// E4X.g:111:15: xmlAttributes
					{
					pushFollow(FOLLOW_xmlAttributes_in_xmlTagContent253);
					xmlAttributes19=xmlAttributes();
					state._fsp--;

					adaptor.addChild(root_0, xmlAttributes19.getTree());

					}
					break;

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
	// $ANTLR end "xmlTagContent"


	public static class xmlEmbeddedExpression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlEmbeddedExpression"
	// E4X.g:114:1: xmlEmbeddedExpression : '{' ( expression )? '}' -> ^( XML_EXPRESSION ( expression )? ) ;
	public final E4XParser.xmlEmbeddedExpression_return xmlEmbeddedExpression() throws RecognitionException {
		E4XParser.xmlEmbeddedExpression_return retval = new E4XParser.xmlEmbeddedExpression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token char_literal20=null;
		Token char_literal22=null;
		ParserRuleReturnScope expression21 =null;

		LinkedListTree char_literal20_tree=null;
		LinkedListTree char_literal22_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// E4X.g:115:2: ( '{' ( expression )? '}' -> ^( XML_EXPRESSION ( expression )? ) )
			// E4X.g:115:4: '{' ( expression )? '}'
			{
			char_literal20=(Token)match(input,30,FOLLOW_30_in_xmlEmbeddedExpression265);  
			stream_30.add(char_literal20);

			// E4X.g:115:8: ( expression )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= XML_APOSTROPHE && LA9_0 <= XML_ASSIGN)||LA9_0==XML_NAME||(LA9_0 >= XML_QUOTE && LA9_0 <= XML_TEXT)||LA9_0==XML_WS||LA9_0==30) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// E4X.g:115:8: expression
					{
					pushFollow(FOLLOW_expression_in_xmlEmbeddedExpression267);
					expression21=expression();
					state._fsp--;

					stream_expression.add(expression21.getTree());
					}
					break;

			}

			char_literal22=(Token)match(input,31,FOLLOW_31_in_xmlEmbeddedExpression270);  
			stream_31.add(char_literal22);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 115:24: -> ^( XML_EXPRESSION ( expression )? )
			{
				// E4X.g:115:27: ^( XML_EXPRESSION ( expression )? )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_EXPRESSION, "XML_EXPRESSION"), root_1);
				// E4X.g:115:44: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

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
	// $ANTLR end "xmlEmbeddedExpression"


	public static class expression_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// E4X.g:120:1: expression : ( xmlText | xmlAttributeValue )+ ;
	public final E4XParser.expression_return expression() throws RecognitionException {
		E4XParser.expression_return retval = new E4XParser.expression_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope xmlText23 =null;
		ParserRuleReturnScope xmlAttributeValue24 =null;


		try {
			// E4X.g:121:2: ( ( xmlText | xmlAttributeValue )+ )
			// E4X.g:121:4: ( xmlText | xmlAttributeValue )+
			{
			root_0 = (LinkedListTree)adaptor.nil();


			// E4X.g:121:4: ( xmlText | xmlAttributeValue )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=3;
				switch ( input.LA(1) ) {
				case XML_APOSTROPHE:
					{
					switch ( input.LA(2) ) {
					case 31:
						{
						alt10=1;
						}
						break;
					case XML_APOSTROPHE:
						{
						alt10=1;
						}
						break;
					case 30:
						{
						alt10=1;
						}
						break;
					case XML_QUOTE:
						{
						alt10=1;
						}
						break;
					case XML_ASSIGN:
					case XML_NAME:
					case XML_TEXT:
					case XML_WS:
						{
						alt10=1;
						}
						break;
					case UNICODE_DIGIT:
					case UNICODE_LETTER:
					case XML_ATTRIBUTE:
					case XML_CDATA:
					case XML_COMMENT:
					case XML_ELEMENT:
					case XML_EMPTY_ELEMENT:
					case XML_EXPRESSION:
					case XML_LIST:
					case XML_NAME_PART:
					case XML_NAME_START:
					case XML_PI:
					case XML_PI_END:
					case XML_PI_START:
					case XML_TEXT_NODE:
					case 26:
					case 27:
					case 28:
					case 29:
						{
						alt10=2;
						}
						break;
					}
					}
					break;
				case 30:
					{
					alt10=2;
					}
					break;
				case XML_QUOTE:
					{
					switch ( input.LA(2) ) {
					case 31:
						{
						alt10=1;
						}
						break;
					case XML_APOSTROPHE:
						{
						alt10=1;
						}
						break;
					case 30:
						{
						alt10=1;
						}
						break;
					case XML_QUOTE:
						{
						alt10=1;
						}
						break;
					case XML_ASSIGN:
					case XML_NAME:
					case XML_TEXT:
					case XML_WS:
						{
						alt10=1;
						}
						break;
					case UNICODE_DIGIT:
					case UNICODE_LETTER:
					case XML_ATTRIBUTE:
					case XML_CDATA:
					case XML_COMMENT:
					case XML_ELEMENT:
					case XML_EMPTY_ELEMENT:
					case XML_EXPRESSION:
					case XML_LIST:
					case XML_NAME_PART:
					case XML_NAME_START:
					case XML_PI:
					case XML_PI_END:
					case XML_PI_START:
					case XML_TEXT_NODE:
					case 26:
					case 27:
					case 28:
					case 29:
						{
						alt10=2;
						}
						break;
					}
					}
					break;
				case XML_ASSIGN:
				case XML_NAME:
				case XML_TEXT:
				case XML_WS:
					{
					alt10=1;
					}
					break;
				}
				switch (alt10) {
				case 1 :
					// E4X.g:122:4: xmlText
					{
					pushFollow(FOLLOW_xmlText_in_expression297);
					xmlText23=xmlText();
					state._fsp--;

					adaptor.addChild(root_0, xmlText23.getTree());

					}
					break;
				case 2 :
					// E4X.g:123:5: xmlAttributeValue
					{
					pushFollow(FOLLOW_xmlAttributeValue_in_expression303);
					xmlAttributeValue24=xmlAttributeValue();
					state._fsp--;

					adaptor.addChild(root_0, xmlAttributeValue24.getTree());

					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
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
	// $ANTLR end "expression"


	public static class xmlText_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlText"
	// E4X.g:127:1: xmlText : ( XML_TEXT | XML_ASSIGN | XML_APOSTROPHE | XML_QUOTE | XML_NAME | XML_WS );
	public final E4XParser.xmlText_return xmlText() throws RecognitionException {
		E4XParser.xmlText_return retval = new E4XParser.xmlText_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token set25=null;

		LinkedListTree set25_tree=null;

		try {
			// E4X.g:128:2: ( XML_TEXT | XML_ASSIGN | XML_APOSTROPHE | XML_QUOTE | XML_NAME | XML_WS )
			// E4X.g:
			{
			root_0 = (LinkedListTree)adaptor.nil();


			set25=input.LT(1);
			if ( (input.LA(1) >= XML_APOSTROPHE && input.LA(1) <= XML_ASSIGN)||input.LA(1)==XML_NAME||(input.LA(1) >= XML_QUOTE && input.LA(1) <= XML_TEXT)||input.LA(1)==XML_WS ) {
				input.consume();
				adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set25));
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
	// $ANTLR end "xmlText"


	public static class xmlTagName_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlTagName"
	// E4X.g:131:1: xmlTagName : ( xmlEmbeddedExpression | XML_NAME );
	public final E4XParser.xmlTagName_return xmlTagName() throws RecognitionException {
		E4XParser.xmlTagName_return retval = new E4XParser.xmlTagName_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token XML_NAME27=null;
		ParserRuleReturnScope xmlEmbeddedExpression26 =null;

		LinkedListTree XML_NAME27_tree=null;

		try {
			// E4X.g:132:2: ( xmlEmbeddedExpression | XML_NAME )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==30) ) {
				alt11=1;
			}
			else if ( (LA11_0==XML_NAME) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// E4X.g:132:4: xmlEmbeddedExpression
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlEmbeddedExpression_in_xmlTagName350);
					xmlEmbeddedExpression26=xmlEmbeddedExpression();
					state._fsp--;

					adaptor.addChild(root_0, xmlEmbeddedExpression26.getTree());

					}
					break;
				case 2 :
					// E4X.g:133:4: XML_NAME
					{
					root_0 = (LinkedListTree)adaptor.nil();


					XML_NAME27=(Token)match(input,XML_NAME,FOLLOW_XML_NAME_in_xmlTagName355); 
					XML_NAME27_tree = (LinkedListTree)adaptor.create(XML_NAME27);
					adaptor.addChild(root_0, XML_NAME27_tree);

					}
					break;

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
	// $ANTLR end "xmlTagName"


	public static class xmlAttributes_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlAttributes"
	// E4X.g:136:1: xmlAttributes : ( xmlAttribute )+ ;
	public final E4XParser.xmlAttributes_return xmlAttributes() throws RecognitionException {
		E4XParser.xmlAttributes_return retval = new E4XParser.xmlAttributes_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope xmlAttribute28 =null;


		try {
			// E4X.g:137:2: ( ( xmlAttribute )+ )
			// E4X.g:137:4: ( xmlAttribute )+
			{
			root_0 = (LinkedListTree)adaptor.nil();


			// E4X.g:137:4: ( xmlAttribute )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==XML_WS) ) {
					int LA12_1 = input.LA(2);
					if ( (LA12_1==XML_NAME||LA12_1==30) ) {
						alt12=1;
					}

				}

				switch (alt12) {
				case 1 :
					// E4X.g:138:4: xmlAttribute
					{
					pushFollow(FOLLOW_xmlAttribute_in_xmlAttributes371);
					xmlAttribute28=xmlAttribute();
					state._fsp--;

					adaptor.addChild(root_0, xmlAttribute28.getTree());

					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
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
	// $ANTLR end "xmlAttributes"


	public static class xmlAttribute_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlAttribute"
	// E4X.g:142:1: xmlAttribute : XML_WS xmlAttributeName ( XML_WS )? XML_ASSIGN ( XML_WS )? xmlAttributeValue -> ^( XML_ATTRIBUTE xmlAttributeName xmlAttributeValue ) ;
	public final E4XParser.xmlAttribute_return xmlAttribute() throws RecognitionException {
		E4XParser.xmlAttribute_return retval = new E4XParser.xmlAttribute_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token XML_WS29=null;
		Token XML_WS31=null;
		Token XML_ASSIGN32=null;
		Token XML_WS33=null;
		ParserRuleReturnScope xmlAttributeName30 =null;
		ParserRuleReturnScope xmlAttributeValue34 =null;

		LinkedListTree XML_WS29_tree=null;
		LinkedListTree XML_WS31_tree=null;
		LinkedListTree XML_ASSIGN32_tree=null;
		LinkedListTree XML_WS33_tree=null;
		RewriteRuleTokenStream stream_XML_ASSIGN=new RewriteRuleTokenStream(adaptor,"token XML_ASSIGN");
		RewriteRuleTokenStream stream_XML_WS=new RewriteRuleTokenStream(adaptor,"token XML_WS");
		RewriteRuleSubtreeStream stream_xmlAttributeName=new RewriteRuleSubtreeStream(adaptor,"rule xmlAttributeName");
		RewriteRuleSubtreeStream stream_xmlAttributeValue=new RewriteRuleSubtreeStream(adaptor,"rule xmlAttributeValue");

		try {
			// E4X.g:143:2: ( XML_WS xmlAttributeName ( XML_WS )? XML_ASSIGN ( XML_WS )? xmlAttributeValue -> ^( XML_ATTRIBUTE xmlAttributeName xmlAttributeValue ) )
			// E4X.g:143:4: XML_WS xmlAttributeName ( XML_WS )? XML_ASSIGN ( XML_WS )? xmlAttributeValue
			{
			XML_WS29=(Token)match(input,XML_WS,FOLLOW_XML_WS_in_xmlAttribute387);  
			stream_XML_WS.add(XML_WS29);

			pushFollow(FOLLOW_xmlAttributeName_in_xmlAttribute389);
			xmlAttributeName30=xmlAttributeName();
			state._fsp--;

			stream_xmlAttributeName.add(xmlAttributeName30.getTree());
			// E4X.g:143:28: ( XML_WS )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==XML_WS) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// E4X.g:143:28: XML_WS
					{
					XML_WS31=(Token)match(input,XML_WS,FOLLOW_XML_WS_in_xmlAttribute391);  
					stream_XML_WS.add(XML_WS31);

					}
					break;

			}

			XML_ASSIGN32=(Token)match(input,XML_ASSIGN,FOLLOW_XML_ASSIGN_in_xmlAttribute394);  
			stream_XML_ASSIGN.add(XML_ASSIGN32);

			// E4X.g:143:47: ( XML_WS )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==XML_WS) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// E4X.g:143:47: XML_WS
					{
					XML_WS33=(Token)match(input,XML_WS,FOLLOW_XML_WS_in_xmlAttribute396);  
					stream_XML_WS.add(XML_WS33);

					}
					break;

			}

			pushFollow(FOLLOW_xmlAttributeValue_in_xmlAttribute399);
			xmlAttributeValue34=xmlAttributeValue();
			state._fsp--;

			stream_xmlAttributeValue.add(xmlAttributeValue34.getTree());
			// AST REWRITE
			// elements: xmlAttributeName, xmlAttributeValue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 144:3: -> ^( XML_ATTRIBUTE xmlAttributeName xmlAttributeValue )
			{
				// E4X.g:144:6: ^( XML_ATTRIBUTE xmlAttributeName xmlAttributeValue )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_ATTRIBUTE, "XML_ATTRIBUTE"), root_1);
				adaptor.addChild(root_1, stream_xmlAttributeName.nextTree());
				adaptor.addChild(root_1, stream_xmlAttributeValue.nextTree());
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
	// $ANTLR end "xmlAttribute"


	public static class xmlAttributeName_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlAttributeName"
	// E4X.g:147:1: xmlAttributeName : ( xmlEmbeddedExpression | XML_NAME );
	public final E4XParser.xmlAttributeName_return xmlAttributeName() throws RecognitionException {
		E4XParser.xmlAttributeName_return retval = new E4XParser.xmlAttributeName_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token XML_NAME36=null;
		ParserRuleReturnScope xmlEmbeddedExpression35 =null;

		LinkedListTree XML_NAME36_tree=null;

		try {
			// E4X.g:148:2: ( xmlEmbeddedExpression | XML_NAME )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==30) ) {
				alt15=1;
			}
			else if ( (LA15_0==XML_NAME) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// E4X.g:148:4: xmlEmbeddedExpression
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlEmbeddedExpression_in_xmlAttributeName422);
					xmlEmbeddedExpression35=xmlEmbeddedExpression();
					state._fsp--;

					adaptor.addChild(root_0, xmlEmbeddedExpression35.getTree());

					}
					break;
				case 2 :
					// E4X.g:149:4: XML_NAME
					{
					root_0 = (LinkedListTree)adaptor.nil();


					XML_NAME36=(Token)match(input,XML_NAME,FOLLOW_XML_NAME_in_xmlAttributeName427); 
					XML_NAME36_tree = (LinkedListTree)adaptor.create(XML_NAME36);
					adaptor.addChild(root_0, XML_NAME36_tree);

					}
					break;

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
	// $ANTLR end "xmlAttributeName"


	public static class xmlAttributeValue_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlAttributeValue"
	// E4X.g:152:1: xmlAttributeValue : ( xmlEmbeddedExpression | XML_APOSTROPHE ! (~ ( XML_LCHEVRON | XML_APOSTROPHE ) )* XML_APOSTROPHE !| XML_QUOTE ! (~ ( XML_LCHEVRON | XML_QUOTE ) )* XML_QUOTE !);
	public final E4XParser.xmlAttributeValue_return xmlAttributeValue() throws RecognitionException {
		E4XParser.xmlAttributeValue_return retval = new E4XParser.xmlAttributeValue_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token XML_APOSTROPHE38=null;
		Token set39=null;
		Token XML_APOSTROPHE40=null;
		Token XML_QUOTE41=null;
		Token set42=null;
		Token XML_QUOTE43=null;
		ParserRuleReturnScope xmlEmbeddedExpression37 =null;

		LinkedListTree XML_APOSTROPHE38_tree=null;
		LinkedListTree set39_tree=null;
		LinkedListTree XML_APOSTROPHE40_tree=null;
		LinkedListTree XML_QUOTE41_tree=null;
		LinkedListTree set42_tree=null;
		LinkedListTree XML_QUOTE43_tree=null;

		try {
			// E4X.g:153:2: ( xmlEmbeddedExpression | XML_APOSTROPHE ! (~ ( XML_LCHEVRON | XML_APOSTROPHE ) )* XML_APOSTROPHE !| XML_QUOTE ! (~ ( XML_LCHEVRON | XML_QUOTE ) )* XML_QUOTE !)
			int alt18=3;
			switch ( input.LA(1) ) {
			case 30:
				{
				alt18=1;
				}
				break;
			case XML_APOSTROPHE:
				{
				alt18=2;
				}
				break;
			case XML_QUOTE:
				{
				alt18=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// E4X.g:153:4: xmlEmbeddedExpression
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlEmbeddedExpression_in_xmlAttributeValue438);
					xmlEmbeddedExpression37=xmlEmbeddedExpression();
					state._fsp--;

					adaptor.addChild(root_0, xmlEmbeddedExpression37.getTree());

					}
					break;
				case 2 :
					// E4X.g:154:4: XML_APOSTROPHE ! (~ ( XML_LCHEVRON | XML_APOSTROPHE ) )* XML_APOSTROPHE !
					{
					root_0 = (LinkedListTree)adaptor.nil();


					XML_APOSTROPHE38=(Token)match(input,XML_APOSTROPHE,FOLLOW_XML_APOSTROPHE_in_xmlAttributeValue443); 
					// E4X.g:154:20: (~ ( XML_LCHEVRON | XML_APOSTROPHE ) )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= UNICODE_DIGIT && LA16_0 <= UNICODE_LETTER)||(LA16_0 >= XML_ASSIGN && LA16_0 <= XML_EXPRESSION)||(LA16_0 >= XML_LIST && LA16_0 <= 31)) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// E4X.g:
							{
							set39=input.LT(1);
							if ( (input.LA(1) >= UNICODE_DIGIT && input.LA(1) <= UNICODE_LETTER)||(input.LA(1) >= XML_ASSIGN && input.LA(1) <= XML_EXPRESSION)||(input.LA(1) >= XML_LIST && input.LA(1) <= 31) ) {
								input.consume();
								adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set39));
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop16;
						}
					}

					XML_APOSTROPHE40=(Token)match(input,XML_APOSTROPHE,FOLLOW_XML_APOSTROPHE_in_xmlAttributeValue458); 
					}
					break;
				case 3 :
					// E4X.g:155:4: XML_QUOTE ! (~ ( XML_LCHEVRON | XML_QUOTE ) )* XML_QUOTE !
					{
					root_0 = (LinkedListTree)adaptor.nil();


					XML_QUOTE41=(Token)match(input,XML_QUOTE,FOLLOW_XML_QUOTE_in_xmlAttributeValue464); 
					// E4X.g:155:15: (~ ( XML_LCHEVRON | XML_QUOTE ) )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( ((LA17_0 >= UNICODE_DIGIT && LA17_0 <= XML_EXPRESSION)||(LA17_0 >= XML_LIST && LA17_0 <= XML_PI_START)||(LA17_0 >= XML_TEXT && LA17_0 <= 31)) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// E4X.g:
							{
							set42=input.LT(1);
							if ( (input.LA(1) >= UNICODE_DIGIT && input.LA(1) <= XML_EXPRESSION)||(input.LA(1) >= XML_LIST && input.LA(1) <= XML_PI_START)||(input.LA(1) >= XML_TEXT && input.LA(1) <= 31) ) {
								input.consume();
								adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set42));
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop17;
						}
					}

					XML_QUOTE43=(Token)match(input,XML_QUOTE,FOLLOW_XML_QUOTE_in_xmlAttributeValue479); 
					}
					break;

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
	// $ANTLR end "xmlAttributeValue"


	public static class xmlElementContent_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlElementContent"
	// E4X.g:158:1: xmlElementContent : ( xmlEmbeddedExpression | xmlMarkup | xmlText -> ^( XML_TEXT_NODE xmlText ) | xmlElement );
	public final E4XParser.xmlElementContent_return xmlElementContent() throws RecognitionException {
		E4XParser.xmlElementContent_return retval = new E4XParser.xmlElementContent_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		ParserRuleReturnScope xmlEmbeddedExpression44 =null;
		ParserRuleReturnScope xmlMarkup45 =null;
		ParserRuleReturnScope xmlText46 =null;
		ParserRuleReturnScope xmlElement47 =null;

		RewriteRuleSubtreeStream stream_xmlText=new RewriteRuleSubtreeStream(adaptor,"rule xmlText");

		try {
			// E4X.g:159:2: ( xmlEmbeddedExpression | xmlMarkup | xmlText -> ^( XML_TEXT_NODE xmlText ) | xmlElement )
			int alt19=4;
			switch ( input.LA(1) ) {
			case 30:
				{
				alt19=1;
				}
				break;
			case XML_CDATA:
			case XML_COMMENT:
			case XML_PI_START:
				{
				alt19=2;
				}
				break;
			case XML_APOSTROPHE:
			case XML_ASSIGN:
			case XML_NAME:
			case XML_QUOTE:
			case XML_TEXT:
			case XML_WS:
				{
				alt19=3;
				}
				break;
			case XML_LCHEVRON:
				{
				alt19=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// E4X.g:159:4: xmlEmbeddedExpression
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlEmbeddedExpression_in_xmlElementContent491);
					xmlEmbeddedExpression44=xmlEmbeddedExpression();
					state._fsp--;

					adaptor.addChild(root_0, xmlEmbeddedExpression44.getTree());

					}
					break;
				case 2 :
					// E4X.g:160:4: xmlMarkup
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlMarkup_in_xmlElementContent496);
					xmlMarkup45=xmlMarkup();
					state._fsp--;

					adaptor.addChild(root_0, xmlMarkup45.getTree());

					}
					break;
				case 3 :
					// E4X.g:161:4: xmlText
					{
					pushFollow(FOLLOW_xmlText_in_xmlElementContent501);
					xmlText46=xmlText();
					state._fsp--;

					stream_xmlText.add(xmlText46.getTree());
					// AST REWRITE
					// elements: xmlText
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (LinkedListTree)adaptor.nil();
					// 161:12: -> ^( XML_TEXT_NODE xmlText )
					{
						// E4X.g:161:15: ^( XML_TEXT_NODE xmlText )
						{
						LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
						root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_TEXT_NODE, "XML_TEXT_NODE"), root_1);
						adaptor.addChild(root_1, stream_xmlText.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// E4X.g:162:4: xmlElement
					{
					root_0 = (LinkedListTree)adaptor.nil();


					pushFollow(FOLLOW_xmlElement_in_xmlElementContent514);
					xmlElement47=xmlElement();
					state._fsp--;

					adaptor.addChild(root_0, xmlElement47.getTree());

					}
					break;

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
	// $ANTLR end "xmlElementContent"


	public static class xmlListInitialiser_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlListInitialiser"
	// E4X.g:165:1: xmlListInitialiser : XML_LCHEVRON '>' ( xmlElementContent )* '</>' -> ^( XML_LIST ( xmlElementContent )* ) ;
	public final E4XParser.xmlListInitialiser_return xmlListInitialiser() throws RecognitionException {
		E4XParser.xmlListInitialiser_return retval = new E4XParser.xmlListInitialiser_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token XML_LCHEVRON48=null;
		Token char_literal49=null;
		Token string_literal51=null;
		ParserRuleReturnScope xmlElementContent50 =null;

		LinkedListTree XML_LCHEVRON48_tree=null;
		LinkedListTree char_literal49_tree=null;
		LinkedListTree string_literal51_tree=null;
		RewriteRuleTokenStream stream_XML_LCHEVRON=new RewriteRuleTokenStream(adaptor,"token XML_LCHEVRON");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_xmlElementContent=new RewriteRuleSubtreeStream(adaptor,"rule xmlElementContent");

		try {
			// E4X.g:166:2: ( XML_LCHEVRON '>' ( xmlElementContent )* '</>' -> ^( XML_LIST ( xmlElementContent )* ) )
			// E4X.g:166:4: XML_LCHEVRON '>' ( xmlElementContent )* '</>'
			{
			XML_LCHEVRON48=(Token)match(input,XML_LCHEVRON,FOLLOW_XML_LCHEVRON_in_xmlListInitialiser525);  
			stream_XML_LCHEVRON.add(XML_LCHEVRON48);

			char_literal49=(Token)match(input,29,FOLLOW_29_in_xmlListInitialiser527);  
			stream_29.add(char_literal49);

			// E4X.g:166:21: ( xmlElementContent )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= XML_APOSTROPHE && LA20_0 <= XML_ASSIGN)||(LA20_0 >= XML_CDATA && LA20_0 <= XML_COMMENT)||LA20_0==XML_LCHEVRON||LA20_0==XML_NAME||(LA20_0 >= XML_PI_START && LA20_0 <= XML_TEXT)||LA20_0==XML_WS||LA20_0==30) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// E4X.g:166:21: xmlElementContent
					{
					pushFollow(FOLLOW_xmlElementContent_in_xmlListInitialiser529);
					xmlElementContent50=xmlElementContent();
					state._fsp--;

					stream_xmlElementContent.add(xmlElementContent50.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			string_literal51=(Token)match(input,28,FOLLOW_28_in_xmlListInitialiser532);  
			stream_28.add(string_literal51);

			// AST REWRITE
			// elements: xmlElementContent
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 167:3: -> ^( XML_LIST ( xmlElementContent )* )
			{
				// E4X.g:167:6: ^( XML_LIST ( xmlElementContent )* )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_LIST, "XML_LIST"), root_1);
				// E4X.g:167:17: ( xmlElementContent )*
				while ( stream_xmlElementContent.hasNext() ) {
					adaptor.addChild(root_1, stream_xmlElementContent.nextTree());
				}
				stream_xmlElementContent.reset();

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
	// $ANTLR end "xmlListInitialiser"


	public static class xmlProcessingInstruction_return extends ParserRuleReturnScope {
		LinkedListTree tree;
		@Override
		public LinkedListTree getTree() { return tree; }
	};


	// $ANTLR start "xmlProcessingInstruction"
	// E4X.g:170:1: xmlProcessingInstruction : XML_PI_START xmlTagContent XML_PI_END -> ^( XML_PI xmlTagContent ) ;
	public final E4XParser.xmlProcessingInstruction_return xmlProcessingInstruction() throws RecognitionException {
		E4XParser.xmlProcessingInstruction_return retval = new E4XParser.xmlProcessingInstruction_return();
		retval.start = input.LT(1);

		LinkedListTree root_0 = null;

		Token XML_PI_START52=null;
		Token XML_PI_END54=null;
		ParserRuleReturnScope xmlTagContent53 =null;

		LinkedListTree XML_PI_START52_tree=null;
		LinkedListTree XML_PI_END54_tree=null;
		RewriteRuleTokenStream stream_XML_PI_END=new RewriteRuleTokenStream(adaptor,"token XML_PI_END");
		RewriteRuleTokenStream stream_XML_PI_START=new RewriteRuleTokenStream(adaptor,"token XML_PI_START");
		RewriteRuleSubtreeStream stream_xmlTagContent=new RewriteRuleSubtreeStream(adaptor,"rule xmlTagContent");

		try {
			// E4X.g:171:2: ( XML_PI_START xmlTagContent XML_PI_END -> ^( XML_PI xmlTagContent ) )
			// E4X.g:171:4: XML_PI_START xmlTagContent XML_PI_END
			{
			XML_PI_START52=(Token)match(input,XML_PI_START,FOLLOW_XML_PI_START_in_xmlProcessingInstruction555);  
			stream_XML_PI_START.add(XML_PI_START52);

			pushFollow(FOLLOW_xmlTagContent_in_xmlProcessingInstruction557);
			xmlTagContent53=xmlTagContent();
			state._fsp--;

			stream_xmlTagContent.add(xmlTagContent53.getTree());
			XML_PI_END54=(Token)match(input,XML_PI_END,FOLLOW_XML_PI_END_in_xmlProcessingInstruction559);  
			stream_XML_PI_END.add(XML_PI_END54);

			// AST REWRITE
			// elements: xmlTagContent
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (LinkedListTree)adaptor.nil();
			// 171:42: -> ^( XML_PI xmlTagContent )
			{
				// E4X.g:171:45: ^( XML_PI xmlTagContent )
				{
				LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
				root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_PI, "XML_PI"), root_1);
				adaptor.addChild(root_1, stream_xmlTagContent.nextTree());
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
	// $ANTLR end "xmlProcessingInstruction"

	// Delegated rules



	public static final BitSet FOLLOW_XML_COMMENT_in_xmlMarkup109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XML_CDATA_in_xmlMarkup114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlProcessingInstruction_in_xmlMarkup119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlListInitialiser_in_xmlPrimary133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlInitialiser_in_xmlPrimary139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlMarkup_in_xmlInitialiser150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlElement_in_xmlInitialiser155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XML_LCHEVRON_in_xmlElement167 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_xmlTagContent_in_xmlElement169 = new BitSet(new long[]{0x0000000026000000L});
	public static final BitSet FOLLOW_XML_WS_in_xmlElement171 = new BitSet(new long[]{0x0000000024000000L});
	public static final BitSet FOLLOW_26_in_xmlElement186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_xmlElement206 = new BitSet(new long[]{0x000000004AE146C0L});
	public static final BitSet FOLLOW_xmlElementContent_in_xmlElement208 = new BitSet(new long[]{0x000000004AE146C0L});
	public static final BitSet FOLLOW_27_in_xmlElement211 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_xmlTagName_in_xmlElement213 = new BitSet(new long[]{0x0000000022000000L});
	public static final BitSet FOLLOW_XML_WS_in_xmlElement215 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_xmlElement218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlTagName_in_xmlTagContent251 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_xmlAttributes_in_xmlTagContent253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_xmlEmbeddedExpression265 = new BitSet(new long[]{0x00000000C2C100C0L});
	public static final BitSet FOLLOW_expression_in_xmlEmbeddedExpression267 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_xmlEmbeddedExpression270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlText_in_expression297 = new BitSet(new long[]{0x0000000042C100C2L});
	public static final BitSet FOLLOW_xmlAttributeValue_in_expression303 = new BitSet(new long[]{0x0000000042C100C2L});
	public static final BitSet FOLLOW_xmlEmbeddedExpression_in_xmlTagName350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XML_NAME_in_xmlTagName355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlAttribute_in_xmlAttributes371 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_XML_WS_in_xmlAttribute387 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_xmlAttributeName_in_xmlAttribute389 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_XML_WS_in_xmlAttribute391 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_XML_ASSIGN_in_xmlAttribute394 = new BitSet(new long[]{0x0000000042400040L});
	public static final BitSet FOLLOW_XML_WS_in_xmlAttribute396 = new BitSet(new long[]{0x0000000040400040L});
	public static final BitSet FOLLOW_xmlAttributeValue_in_xmlAttribute399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlEmbeddedExpression_in_xmlAttributeName422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XML_NAME_in_xmlAttributeName427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlEmbeddedExpression_in_xmlAttributeValue438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XML_APOSTROPHE_in_xmlAttributeValue443 = new BitSet(new long[]{0x00000000FFFFBFF0L});
	public static final BitSet FOLLOW_XML_APOSTROPHE_in_xmlAttributeValue458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XML_QUOTE_in_xmlAttributeValue464 = new BitSet(new long[]{0x00000000FFFFBFF0L});
	public static final BitSet FOLLOW_XML_QUOTE_in_xmlAttributeValue479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlEmbeddedExpression_in_xmlElementContent491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlMarkup_in_xmlElementContent496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlText_in_xmlElementContent501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xmlElement_in_xmlElementContent514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XML_LCHEVRON_in_xmlListInitialiser525 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_xmlListInitialiser527 = new BitSet(new long[]{0x0000000052E146C0L});
	public static final BitSet FOLLOW_xmlElementContent_in_xmlListInitialiser529 = new BitSet(new long[]{0x0000000052E146C0L});
	public static final BitSet FOLLOW_28_in_xmlListInitialiser532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XML_PI_START_in_xmlProcessingInstruction555 = new BitSet(new long[]{0x0000000040010000L});
	public static final BitSet FOLLOW_xmlTagContent_in_xmlProcessingInstruction557 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_XML_PI_END_in_xmlProcessingInstruction559 = new BitSet(new long[]{0x0000000000000002L});
}
