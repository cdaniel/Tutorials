package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.mydsl.insurance.InsurancePackage;
import org.xtext.example.mydsl.insurance.Model;
import org.xtext.example.mydsl.insurance.Product;
import org.xtext.example.mydsl.services.InsuranceGrammarAccess;

@SuppressWarnings("all")
public class InsuranceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private InsuranceGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == InsurancePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case InsurancePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case InsurancePackage.PRODUCT:
				if(context == grammarAccess.getProductRule()) {
					sequence_Product(context, (Product) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     products+=Product*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         avgDamages=INT 
	 *         occurrences=INT 
	 *         earnings=INT 
	 *         cost=INT 
	 *         selling=YesNo 
	 *         connected+=[Product|ID]*
	 *     )
	 */
	protected void sequence_Product(EObject context, Product semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
