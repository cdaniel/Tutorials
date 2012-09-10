package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.InsuranceGrammarAccess;

@SuppressWarnings("all")
public class InsuranceSyntacticSequencer extends AbstractSyntacticSequencer {

	protected InsuranceGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Product_POWIAZANEPRODUKTYKeyword_15_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (InsuranceGrammarAccess) access;
		match_Product_POWIAZANEPRODUKTYKeyword_15_0_q = new TokenAlias(false, true, grammarAccess.getProductAccess().getPOWIAZANEPRODUKTYKeyword_15_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Product_POWIAZANEPRODUKTYKeyword_15_0_q.equals(syntax))
				emit_Product_POWIAZANEPRODUKTYKeyword_15_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'POWIAZANE PRODUKTY='?
	 */
	protected void emit_Product_POWIAZANEPRODUKTYKeyword_15_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
