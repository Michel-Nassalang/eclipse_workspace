/**
 */
package Enseignement.util;

import Enseignement.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Enseignement.EnseignementPackage
 * @generated
 */
public class EnseignementValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EnseignementValidator INSTANCE = new EnseignementValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Enseignement";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Somme Heures Effectuees' of 'Enseignant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENSEIGNANT__SOMME_HEURES_EFFECTUEES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au moins un professeur' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__AU_MOINS_UN_PROFESSEUR = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nom unique enseignant' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__NOM_UNIQUE_ENSEIGNANT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Chef unique et age depasse 40' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__CHEF_UNIQUE_ET_AGE_DEPASSE_40 = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Etudiant admis si moyenne superieure ou egale a10' of 'Etudiant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ETUDIANT__ETUDIANT_ADMIS_SI_MOYENNE_SUPERIEURE_OU_EGALE_A10 = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

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
	public EnseignementValidator() {
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
	  return EnseignementPackage.eINSTANCE;
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
			case EnseignementPackage.DOMAINE:
				return validateDomaine((Domaine)value, diagnostics, context);
			case EnseignementPackage.ENSEIGNANT:
				return validateEnseignant((Enseignant)value, diagnostics, context);
			case EnseignementPackage.DEPARTEMENT:
				return validateDepartement((Departement)value, diagnostics, context);
			case EnseignementPackage.UNIVERSITE:
				return validateUniversite((Universite)value, diagnostics, context);
			case EnseignementPackage.ETUDIANT:
				return validateEtudiant((Etudiant)value, diagnostics, context);
			case EnseignementPackage.NOTE:
				return validateNote((Note)value, diagnostics, context);
			case EnseignementPackage.MATIERE:
				return validateMatiere((Matiere)value, diagnostics, context);
			case EnseignementPackage.TITRE:
				return validateTitre((Titre)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomaine(Domaine domaine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domaine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnseignant(Enseignant enseignant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enseignant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enseignant, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnseignant_SommeHeuresEffectuees(enseignant, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SommeHeuresEffectuees constraint of '<em>Enseignant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnseignant_SommeHeuresEffectuees(Enseignant enseignant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return enseignant.SommeHeuresEffectuees(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(departement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartement_chef_unique_et_age_depasse_40(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartement_au_moins_un_professeur(departement, diagnostics, context);
		if (result || diagnostics != null) result &= validateDepartement_nom_unique_enseignant(departement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the chef_unique_et_age_depasse_40 constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_chef_unique_et_age_depasse_40(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return departement.chef_unique_et_age_depasse_40(diagnostics, context);
	}

	/**
	 * Validates the au_moins_un_professeur constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_au_moins_un_professeur(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return departement.au_moins_un_professeur(diagnostics, context);
	}

	/**
	 * Validates the nom_unique_enseignant constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_nom_unique_enseignant(Departement departement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return departement.nom_unique_enseignant(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversite(Universite universite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(universite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtudiant(Etudiant etudiant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(etudiant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(etudiant, diagnostics, context);
		if (result || diagnostics != null) result &= validateEtudiant_etudiant_admis_si_moyenne_superieure_ou_egale_a_10(etudiant, diagnostics, context);
		return result;
	}

	/**
	 * Validates the etudiant_admis_si_moyenne_superieure_ou_egale_a_10 constraint of '<em>Etudiant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtudiant_etudiant_admis_si_moyenne_superieure_ou_egale_a_10(Etudiant etudiant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return etudiant.etudiant_admis_si_moyenne_superieure_ou_egale_a_10(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(note, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatiere(Matiere matiere, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(matiere, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitre(Titre titre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //EnseignementValidator
