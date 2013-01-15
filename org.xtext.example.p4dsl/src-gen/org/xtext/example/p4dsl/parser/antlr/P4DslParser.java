/*
* generated by Xtext
*/
package org.xtext.example.p4dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.p4dsl.services.P4DslGrammarAccess;

public class P4DslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private P4DslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.p4dsl.parser.antlr.internal.InternalP4DslParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.p4dsl.parser.antlr.internal.InternalP4DslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public P4DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(P4DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}