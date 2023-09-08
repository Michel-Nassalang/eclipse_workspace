/*
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.mydsl.serializer;

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
import org.xtext.ipsl.mydsl.monDsl.Attribute;
import org.xtext.ipsl.mydsl.monDsl.AttributeType;
import org.xtext.ipsl.mydsl.monDsl.BasicType;
import org.xtext.ipsl.mydsl.monDsl.Entity;
import org.xtext.ipsl.mydsl.monDsl.EntityType;
import org.xtext.ipsl.mydsl.monDsl.Model;
import org.xtext.ipsl.mydsl.monDsl.MonDslPackage;
import org.xtext.ipsl.mydsl.services.MonDslGrammarAccess;

@SuppressWarnings("all")
public class MonDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MonDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MonDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MonDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case MonDslPackage.ATTRIBUTE_TYPE:
				sequence_AttributeType(context, (AttributeType) semanticObject); 
				return; 
			case MonDslPackage.BASIC_TYPE:
				sequence_BasicType(context, (BasicType) semanticObject); 
				return; 
			case MonDslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case MonDslPackage.ENTITY_TYPE:
				sequence_EntityType(context, (EntityType) semanticObject); 
				return; 
			case MonDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AttributeType returns AttributeType
	 *
	 * Constraint:
	 *     (elementType=ElementType (array?='[' length=INT?)?)
	 * </pre>
	 */
	protected void sequence_AttributeType(ISerializationContext context, AttributeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (type=AttributeType name=ID)
	 * </pre>
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MonDslPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MonDslPackage.Literals.ATTRIBUTE__TYPE));
			if (transientValues.isValueTransient(semanticObject, MonDslPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MonDslPackage.Literals.ATTRIBUTE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ElementType returns BasicType
	 *     BasicType returns BasicType
	 *
	 * Constraint:
	 *     (typeName='string' | typeName='int' | typeName='boolean')
	 * </pre>
	 */
	protected void sequence_BasicType(ISerializationContext context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ElementType returns EntityType
	 *     EntityType returns EntityType
	 *
	 * Constraint:
	 *     entity=[Entity|ID]
	 * </pre>
	 */
	protected void sequence_EntityType(ISerializationContext context, EntityType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MonDslPackage.Literals.ENTITY_TYPE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MonDslPackage.Literals.ENTITY_TYPE__ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1(), semanticObject.eGet(MonDslPackage.Literals.ENTITY_TYPE__ENTITY, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID superType=[Entity|ID]? attributes+=Attribute*)
	 * </pre>
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     entities+=Entity+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}