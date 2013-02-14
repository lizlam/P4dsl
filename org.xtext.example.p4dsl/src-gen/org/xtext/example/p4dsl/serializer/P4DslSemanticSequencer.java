package org.xtext.example.p4dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.p4dsl.p4Dsl.Add;
import org.xtext.example.p4dsl.p4Dsl.Client;
import org.xtext.example.p4dsl.p4Dsl.Delete;
import org.xtext.example.p4dsl.p4Dsl.Edit;
import org.xtext.example.p4dsl.p4Dsl.Model;
import org.xtext.example.p4dsl.p4Dsl.P4DslPackage;
import org.xtext.example.p4dsl.p4Dsl.Port;
import org.xtext.example.p4dsl.p4Dsl.User;
import org.xtext.example.p4dsl.services.P4DslGrammarAccess;

@SuppressWarnings("all")
public class P4DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private P4DslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == P4DslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case P4DslPackage.ADD:
				if(context == grammarAccess.getAddRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getFileBasedCommandRule() ||
				   context == grammarAccess.getP4CommandRule()) {
					sequence_Add(context, (Add) semanticObject); 
					return; 
				}
				else break;
			case P4DslPackage.CLIENT:
				if(context == grammarAccess.getClientRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getP4CommandRule() ||
				   context == grammarAccess.getPUCFlagRule()) {
					sequence_Client(context, (Client) semanticObject); 
					return; 
				}
				else break;
			case P4DslPackage.DELETE:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getDeleteRule() ||
				   context == grammarAccess.getFileBasedCommandRule() ||
				   context == grammarAccess.getP4CommandRule()) {
					sequence_Delete(context, (Delete) semanticObject); 
					return; 
				}
				else break;
			case P4DslPackage.EDIT:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getEditRule() ||
				   context == grammarAccess.getFileBasedCommandRule() ||
				   context == grammarAccess.getP4CommandRule()) {
					sequence_Edit(context, (Edit) semanticObject); 
					return; 
				}
				else break;
			case P4DslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case P4DslPackage.PORT:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getP4CommandRule() ||
				   context == grammarAccess.getPUCFlagRule() ||
				   context == grammarAccess.getPortRule()) {
					sequence_Port(context, (Port) semanticObject); 
					return; 
				}
				else break;
			case P4DslPackage.USER:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getP4CommandRule() ||
				   context == grammarAccess.getPUCFlagRule() ||
				   context == grammarAccess.getUserRule()) {
					sequence_User(context, (User) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=FILE
	 */
	protected void sequence_Add(EObject context, Add semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, P4DslPackage.Literals.P4_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, P4DslPackage.Literals.P4_COMMAND__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddAccess().getNameFILEParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID p4command+=P4Command)
	 */
	protected void sequence_Client(EObject context, Client semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=FILE
	 */
	protected void sequence_Delete(EObject context, Delete semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, P4DslPackage.Literals.P4_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, P4DslPackage.Literals.P4_COMMAND__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeleteAccess().getNameFILEParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=FILE
	 */
	protected void sequence_Edit(EObject context, Edit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, P4DslPackage.Literals.P4_COMMAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, P4DslPackage.Literals.P4_COMMAND__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEditAccess().getNameFILEParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     command+=Command*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=P4PORT p4command+=P4Command)
	 */
	protected void sequence_Port(EObject context, Port semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID p4command+=P4Command)
	 */
	protected void sequence_User(EObject context, User semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
