/*
 * generated by Xtext 2.29.0
 */
package org.xtext.ipsl.calcul.serializer;

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
import org.xtext.ipsl.calcul.calcul.CALCUL;
import org.xtext.ipsl.calcul.calcul.CalculPackage;
import org.xtext.ipsl.calcul.calcul.EFFECTIF;
import org.xtext.ipsl.calcul.calcul.MODALITE;
import org.xtext.ipsl.calcul.calcul.STATISTIQUE;
import org.xtext.ipsl.calcul.services.CalculGrammarAccess;

@SuppressWarnings("all")
public class CalculSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CalculGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CalculPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CalculPackage.CALCUL:
				sequence_CALCUL(context, (CALCUL) semanticObject); 
				return; 
			case CalculPackage.EFFECTIF:
				sequence_EFFECTIF(context, (EFFECTIF) semanticObject); 
				return; 
			case CalculPackage.MODALITE:
				sequence_MODALITE(context, (MODALITE) semanticObject); 
				return; 
			case CalculPackage.STATISTIQUE:
				sequence_STATISTIQUE(context, (STATISTIQUE) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     CALCUL returns CALCUL
	 *
	 * Constraint:
	 *     operation=STATISTIQUE
	 * </pre>
	 */
	protected void sequence_CALCUL(ISerializationContext context, CALCUL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CalculPackage.Literals.CALCUL__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalculPackage.Literals.CALCUL__OPERATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCALCULAccess().getOperationSTATISTIQUEParserRuleCall_0(), semanticObject.getOperation());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EFFECTIF returns EFFECTIF
	 *
	 * Constraint:
	 *     (values+=REEL values+=REEL*)
	 * </pre>
	 */
	protected void sequence_EFFECTIF(ISerializationContext context, EFFECTIF semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MODALITE returns MODALITE
	 *
	 * Constraint:
	 *     (values+=REEL values+=REEL*)
	 * </pre>
	 */
	protected void sequence_MODALITE(ISerializationContext context, MODALITE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     STATISTIQUE returns STATISTIQUE
	 *
	 * Constraint:
	 *     (
	 *         nom=ID 
	 *         debut=DEBUT 
	 *         modalite=MODALITE 
	 *         effectif=EFFECTIF 
	 *         resultat=RETOUR 
	 *         end=END
	 *     )
	 * </pre>
	 */
	protected void sequence_STATISTIQUE(ISerializationContext context, STATISTIQUE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CalculPackage.Literals.STATISTIQUE__NOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalculPackage.Literals.STATISTIQUE__NOM));
			if (transientValues.isValueTransient(semanticObject, CalculPackage.Literals.STATISTIQUE__DEBUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalculPackage.Literals.STATISTIQUE__DEBUT));
			if (transientValues.isValueTransient(semanticObject, CalculPackage.Literals.STATISTIQUE__MODALITE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalculPackage.Literals.STATISTIQUE__MODALITE));
			if (transientValues.isValueTransient(semanticObject, CalculPackage.Literals.STATISTIQUE__EFFECTIF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalculPackage.Literals.STATISTIQUE__EFFECTIF));
			if (transientValues.isValueTransient(semanticObject, CalculPackage.Literals.STATISTIQUE__RESULTAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalculPackage.Literals.STATISTIQUE__RESULTAT));
			if (transientValues.isValueTransient(semanticObject, CalculPackage.Literals.STATISTIQUE__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CalculPackage.Literals.STATISTIQUE__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSTATISTIQUEAccess().getNomIDTerminalRuleCall_1_0(), semanticObject.getNom());
		feeder.accept(grammarAccess.getSTATISTIQUEAccess().getDebutDEBUTParserRuleCall_2_0(), semanticObject.getDebut());
		feeder.accept(grammarAccess.getSTATISTIQUEAccess().getModaliteMODALITEParserRuleCall_4_0(), semanticObject.getModalite());
		feeder.accept(grammarAccess.getSTATISTIQUEAccess().getEffectifEFFECTIFParserRuleCall_6_0(), semanticObject.getEffectif());
		feeder.accept(grammarAccess.getSTATISTIQUEAccess().getResultatRETOURParserRuleCall_8_0(), semanticObject.getResultat());
		feeder.accept(grammarAccess.getSTATISTIQUEAccess().getEndENDParserRuleCall_10_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
}
