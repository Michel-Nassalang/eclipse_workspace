/**
 */
package football.util;

import football.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see football.FootballPackage
 * @generated
 */
public class FootballValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FootballValidator INSTANCE = new FootballValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "football";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Q2' of 'Tournoi'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TOURNOI__Q2 = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Q1' of 'Equipe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EQUIPE__Q1 = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Q3' of 'Equipe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EQUIPE__Q3 = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootballValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FootballPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FootballPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case FootballPackage.TOURNOI:
				return validateTournoi((Tournoi)value, diagnostics, context);
			case FootballPackage.JOUEUR:
				return validateJoueur((Joueur)value, diagnostics, context);
			case FootballPackage.EQUIPE:
				return validateEquipe((Equipe)value, diagnostics, context);
			case FootballPackage.MATCH:
				return validateMatch((Match)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTournoi(Tournoi tournoi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tournoi, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tournoi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tournoi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tournoi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tournoi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tournoi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tournoi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tournoi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tournoi, diagnostics, context);
		if (result || diagnostics != null) result &= validateTournoi_q2(tournoi, diagnostics, context);
		return result;
	}

	/**
	 * Validates the q2 constraint of '<em>Tournoi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTournoi_q2(Tournoi tournoi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tournoi.q2(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoueur(Joueur joueur, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(joueur, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquipe(Equipe equipe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equipe, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(equipe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(equipe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(equipe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(equipe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(equipe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(equipe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(equipe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(equipe, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipe_q3(equipe, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipe_q1(equipe, diagnostics, context);
		return result;
	}

	/**
	 * Validates the q3 constraint of '<em>Equipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquipe_q3(Equipe equipe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return equipe.q3(diagnostics, context);
	}

	/**
	 * Validates the q1 constraint of '<em>Equipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquipe_q1(Equipe equipe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return equipe.q1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(match, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FootballValidator
