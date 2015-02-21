package org.spp.cocome.types.serializer;

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
import org.spp.cocome.types.services.TypesGrammarAccess;
import org.spp.cocome.types.types.BooleanLiteral;
import org.spp.cocome.types.types.CharLiteral;
import org.spp.cocome.types.types.CollectionType;
import org.spp.cocome.types.types.EntityRelationship;
import org.spp.cocome.types.types.EntityType;
import org.spp.cocome.types.types.EnumerationLiteral;
import org.spp.cocome.types.types.EnumerationType;
import org.spp.cocome.types.types.Import;
import org.spp.cocome.types.types.MapType;
import org.spp.cocome.types.types.MappedByReference;
import org.spp.cocome.types.types.Model;
import org.spp.cocome.types.types.NumberLiteral;
import org.spp.cocome.types.types.PrimitiveType;
import org.spp.cocome.types.types.Property;
import org.spp.cocome.types.types.PropertyReference;
import org.spp.cocome.types.types.StringLiteral;
import org.spp.cocome.types.types.TypeReference;
import org.spp.cocome.types.types.TypesPackage;

@SuppressWarnings("all")
public class TypesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TypesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.CHAR_LITERAL:
				if(context == grammarAccess.getCharLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_CharLiteral(context, (CharLiteral) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.COLLECTION_TYPE:
				if(context == grammarAccess.getCollectionTypeRule() ||
				   context == grammarAccess.getDeclarationTypeReferenceRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_CollectionType(context, (CollectionType) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.ENTITY_RELATIONSHIP:
				if(context == grammarAccess.getEntityRelationshipRule()) {
					sequence_EntityRelationship(context, (EntityRelationship) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.ENTITY_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getEntityTypeRule() ||
				   context == grammarAccess.getNamedTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_EntityType(context, (EntityType) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.ENUMERATION_LITERAL:
				if(context == grammarAccess.getEnumerationLiteralRule()) {
					sequence_EnumerationLiteral(context, (EnumerationLiteral) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.ENUMERATION_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getEnumerationTypeRule() ||
				   context == grammarAccess.getNamedTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_EnumerationType(context, (EnumerationType) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.MAP_TYPE:
				if(context == grammarAccess.getDeclarationTypeReferenceRule() ||
				   context == grammarAccess.getMapTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MapType(context, (MapType) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.MAPPED_BY_REFERENCE:
				if(context == grammarAccess.getMappedByReferenceRule()) {
					sequence_MappedByReference(context, (MappedByReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumberLiteralRule()) {
					sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.PRIMITIVE_TYPE:
				if(context == grammarAccess.getNamedTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PrimitiveType(context, (PrimitiveType) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.PROPERTY_REFERENCE:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getPropertyReferenceRule()) {
					sequence_PropertyReference(context, (PropertyReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.TYPE_REFERENCE:
				if(context == grammarAccess.getDeclarationTypeReferenceRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_TypeReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.BOOLEAN_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=CHARACTER
	 */
	protected void sequence_CharLiteral(EObject context, CharLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.CHAR_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.CHAR_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCharLiteralAccess().getValueCHARACTERTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reference=TypeReference size=INT?)
	 */
	protected void sequence_CollectionType(EObject context, CollectionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=EntityRelationshipKind mappedBy=MappedByReference?)
	 */
	protected void sequence_EntityRelationship(EObject context, EntityRelationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (storageModifier=TypeStorageModifier? name=ID parent=[ComplexType|QualifiedName]? properties+=Property*)
	 */
	protected void sequence_EntityType(EObject context, EntityType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EnumerationLiteral(EObject context, EnumerationLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.ENUMERATION_LITERAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.ENUMERATION_LITERAL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent=[EnumerationType|QualifiedName]? literals+=EnumerationLiteral literals+=EnumerationLiteral*)
	 */
	protected void sequence_EnumerationType(EObject context, EnumerationType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reference=TypeReference mapType=TypeReference size=INT?)
	 */
	protected void sequence_MapType(EObject context, MapType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=[Property|ID] path=MappedByReference?)
	 */
	protected void sequence_MappedByReference(EObject context, MappedByReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* types+=ComplexType*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PrimitiveType(EObject context, PrimitiveType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.NAMED_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.NAMED_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     reference=[Property|ID]
	 */
	protected void sequence_PropertyReference(EObject context, PropertyReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.PROPERTY_REFERENCE__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.PROPERTY_REFERENCE__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyReferenceAccess().getReferencePropertyIDTerminalRuleCall_0_1(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         storageModifier=PropertyStorageModifier? 
	 *         type=DeclarationTypeReference 
	 *         name=ID 
	 *         relationship=EntityRelationship? 
	 *         orderBy=PropertyReference? 
	 *         mapKey=PropertyReference? 
	 *         literal=Literal?
	 *     )
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     reference=[NamedType|ID]
	 */
	protected void sequence_TypeReference(EObject context, TypeReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypesPackage.Literals.TYPE_REFERENCE__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypesPackage.Literals.TYPE_REFERENCE__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeIDTerminalRuleCall_0_1(), semanticObject.getReference());
		feeder.finish();
	}
}
