/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.domainmodel.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.domainmodel.domainmodel.Define;
import org.xtext.example.domainmodel.domainmodel.DomainmodelPackage;
import org.xtext.example.domainmodel.domainmodel.Function;
import org.xtext.example.domainmodel.domainmodel.Model;
import org.xtext.example.domainmodel.services.DomainmodelGrammarAccess;

@SuppressWarnings("all")
public class DomainmodelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DomainmodelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DomainmodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DomainmodelPackage.DEFINE:
				sequence_Define(context, (Define) semanticObject); 
				return; 
			case DomainmodelPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case DomainmodelPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     myDSL returns Define
	 *     Define returns Define
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Define(ISerializationContext context, Define semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.MY_DSL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.MY_DSL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     myDSL returns Function
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (name=ID (name=ID name=ID*)*)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     myDSL+=myDSL+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
