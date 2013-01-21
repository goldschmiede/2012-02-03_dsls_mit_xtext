package de.goldschmiede.mapdsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap;
import de.goldschmiede.mapdsl.mapDsl.Import;
import de.goldschmiede.mapdsl.mapDsl.MapDslPackage;
import de.goldschmiede.mapdsl.mapDsl.Mapping;
import de.goldschmiede.mapdsl.mapDsl.Model;
import de.goldschmiede.mapdsl.services.MapDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractMapDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected MapDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MapDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MapDslPackage.ATTRIBUTE_MOVE_MAP:
				if(context == grammarAccess.getAttributeMapRule() ||
				   context == grammarAccess.getAttributeMoveMapRule()) {
					sequence_AttributeMoveMap(context, (AttributeMoveMap) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.MAPPING:
				if(context == grammarAccess.getMappingRule()) {
					sequence_Mapping(context, (Mapping) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (sourceAttribute=[Attribute|QualifiedName] targetAttribute=[Attribute|QualifiedName])
	 */
	protected void sequence_AttributeMoveMap(EObject context, AttributeMoveMap semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MapDslPackage.Literals.ATTRIBUTE_MOVE_MAP__SOURCE_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapDslPackage.Literals.ATTRIBUTE_MOVE_MAP__SOURCE_ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, MapDslPackage.Literals.ATTRIBUTE_MOVE_MAP__TARGET_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapDslPackage.Literals.ATTRIBUTE_MOVE_MAP__TARGET_ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeMoveMapAccess().getSourceAttributeAttributeQualifiedNameParserRuleCall_0_0_1(), semanticObject.getSourceAttribute());
		feeder.accept(grammarAccess.getAttributeMoveMapAccess().getTargetAttributeAttributeQualifiedNameParserRuleCall_2_0_1(), semanticObject.getTargetAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcards
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MapDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardsParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sourceType=[BusinessObject|QualifiedName] targetType=[BusinessObject|QualifiedName] attributeMap+=AttributeMap*)
	 */
	protected void sequence_Mapping(EObject context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* maps+=Mapping*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
