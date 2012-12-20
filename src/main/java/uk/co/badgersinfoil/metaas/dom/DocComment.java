/*
 * ASDocComment.java
 * 
 * Copyright (c) 2007-2008 David Holroyd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.co.badgersinfoil.metaas.dom;

import java.util.Iterator;


/**
 * Allows manipulation of any 'documentation comment' attached to an
 * ActionScript API element.  You can create a DocComment object for anything
 * implementing the {@link Documentable} interface, even if the element in
 * question has no documentation comment attached right now.  Methods of this
 * interface will create a doc-comment in the source code as required.
 * 
 * <p>For a description of the format of documentation comments as they appear
 * in the source code, see
 * <a href="http://java.sun.com/j2se/javadoc/writingdoccomments/#format">How to
 * Write Doc Comments for the Javadoc Tool</a> (bearing in mind that some of
 * the tags defined for Java docuemtation may not be processed by
 * ActionScript tools).</p>
 * 
 * 
 * <h3>Automatic Comment Formatting</h3>
 * 
 * <p>Documentation comments are formatted with indentation to match the
 * surrounding source code, and a column of asterisks ('*') along the left hand
 * side of the comment block.  Both of these foratting tasks are carried
 * out for you automatically by metaas.  So for example if you create a
 * two-line description as follows,</p>
 * 
 * <pre class="eg">docComment.setDescriptionString("Great\n"+
 *                                "stuff.");</pre>
 * 
 * <p>The generated comment in the source code would have the appropriate
 * indentation, and asterisk characters added to produce a nicely formatted
 * documentation comment,</p>
 * 
 * <pre class="eg">/**
 * * Great
 * * stuff.
 * *<span/>/</pre>
 * 
 * <p>Conversely, when retreving the descriptive text from the comment, this
 * extra formatting is removed before you see it,</p>
 * 
 * <pre class="eg">docComment.getDescriptionString();  <em>=> " Great\n stuff."</em></pre>
 * 
 * 
 * <h3>HTML Formatting</h3>
 * 
 * <p>It's common to include HTML tags in documentation comments to provide
 * some additional formatting in the generated documentation.  metaas doesn't
 * currently check the formatting of any HTML, but future versions may require
 * well-formed XHTML.</p>
 * 
 * 
 * <h3>Inline Tags</h3>
 * 
 * Documentation tools can process special 'inline' documetation tags with
 * in documentation-comment descriptions, for instance
 * <code>{<span>@</span>link com.example.ThatClass}</code>.  Future versions of
 * metaas may expose information about such tags.
 *
 * 
 * <h3>Tagged Paragraphs</h3>
 * 
 * <p>Tagged paragraphs are used in JavaDoc-style comments to provide
 * additional, structured information to tools generating documentation from
 * the source code.  A typical example would be the <code>@see</code> entries
 * in a piece of API documentation, that might be skipped by a documentation
 * tool when producing overview documatation, but will be included in a
 * detailed description of the particular API area.</p>
 * 
 * <p>To add a <code>@see</code> tagged-paragraph to a comment, use
 * {@link #addParaTag(String, String)}.  e.g.</p>
 * 
 * <pre class="eg">docComment.addParaTag("see", "com.example.SomeClass")</pre>
 * 
 * <p>The resulting comment would look something like,</p>
 * 
 * <pre class="eg">/**
 * * <span>@</span>see com.example
 * *<span/>/</pre>
 * 
 * <p>The 'tag' of a tagged paragraph must always start at the beginning of
 * a line.  If <code>@see</code> appears in the middle of a line of text,
 * if is taken to be part of the description, an will not be returned by
 * {@link #findTags(String)} (for example).</p>
 * 
 * <p>To prevent mangled comments being generated by accident, it is an error
 * to include content that might be interpreted as a tagged-paragraph,</p>
 * 
 * <pre class="eg">docComment.setDescription("Funny description.\n"
 *                          "@dave: hahaha");</pre>
 * 
 * <p>will raise a SyntaxException,</p>
 * 
 * <pre>uk.co.badgersinfoil.metaas.SyntaxException: trailing content after description: "@dave"</pre>
 * 
 * <h3>Shortcuts</h3>
 * 
 * <p>Other elements in the metaas API provide shorcuts for accessing specific
 * parts of the documentation-comment structure (e.g. creating or updating
 * specific tagged-paragraphs),</p>
 * <ul>
 *   <li>{@link ASArg#getDescriptionString()},
 *   {@link ASArg#setDescription(String)} for easy access to
 *   <span>@</span>param tags in a method comment</li>
 * 
 *   <li>{@link ASMethod#getReturnDescriptionString()},
 *   {@link ASMethod#setReturnDescription(String)}.</li>
 * </ul>
 * 
 * @see Documentable
 */
public interface DocComment extends ScriptElement {

	/**
	 * Returns the description from this comment.  The description is the
	 * text up until the first tagged paragraph.  For instance, given
	 * the comment,
	 * <pre class="eg">/**
	 * * Test stuff
	 * * @return something
	 * *<span/>/</pre>
	 * This method would return a String something like "Test stuff"
	 */
	public String getDescriptionString();

	/**
	 * Defines the 'description' part of this documentation comment.
	 * 
	 * @throws SyntaxException if the given text contains an end-of-comment
	 *         marker, or a tagged-paragraph
	 * 
	 * @see DocComment#setDescriptionString(String)
	 */
	public void setDescriptionString(String description);

	/**
	 * Returns an iterator over the list of {@link DocTag} elements of this
	 * comment that have a tag name matching the given name.  To find all the
	 * <span>@</span>see tags in the comment, you could use code like,
	 * <pre class="eg">Iterator i = docComment.findTags("see");</pre>
	 * 
	 * <p>If there is currently no comment in the source code corresponding
	 * to this DocComment object, an Iterator will be returned that simply
	 * produces no elements.</p>
	 * 
	 * @param name The paragraph tag name, not including the leading '@'
	 *        symbol.  
	 */
	public Iterator findTags(String name);

	/**
	 * Returns the first tagged paragraph in this documentation comment
	 * that has a tag name matching the name given.
	 * 
	 * @param name The paragraph tag name, not including the leading '@'
	 *        symbol.  
	 */
	public DocTag findFirstTag(String name);

	/**
	 * Removes the given tag from this comment.
	 */
	public void delete(DocTag tag);

	/**
	 * Adds a tagged paragraph with the given tag-name and body text to
	 * the end of this documentation comment.  The name should be given
	 * without the '@'-prefix, and this will be added by metaas.
	 * 
	 * @throws SyntaxException if the given text contains an end-of-comment
	 *         marker, or a tagged-paragraph
	 */
	public void addParaTag(String name, String body);
}