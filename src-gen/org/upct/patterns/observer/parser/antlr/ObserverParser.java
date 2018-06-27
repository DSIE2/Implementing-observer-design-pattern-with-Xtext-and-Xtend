/*
 * generated by Xtext 2.12.0
 */
package org.upct.patterns.observer.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.upct.patterns.observer.parser.antlr.internal.InternalObserverParser;
import org.upct.patterns.observer.services.ObserverGrammarAccess;

public class ObserverParser extends AbstractAntlrParser {

	@Inject
	private ObserverGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalObserverParser createParser(XtextTokenStream stream) {
		return new InternalObserverParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public ObserverGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ObserverGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}