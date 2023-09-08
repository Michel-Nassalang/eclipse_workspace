/**
 */
package Enseignement.impl;

import Enseignement.Departement;
import Enseignement.Domaine;
import Enseignement.Enseignant;
import Enseignement.EnseignementFactory;
import Enseignement.EnseignementPackage;
import Enseignement.Etudiant;
import Enseignement.Matiere;
import Enseignement.Note;
import Enseignement.Titre;
import Enseignement.Universite;

import Enseignement.util.EnseignementValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnseignementPackageImpl extends EPackageImpl implements EnseignementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domaineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enseignantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etudiantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matiereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum titreEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Enseignement.EnseignementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnseignementPackageImpl() {
		super(eNS_URI, EnseignementFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EnseignementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnseignementPackage init() {
		if (isInited) return (EnseignementPackage)EPackage.Registry.INSTANCE.getEPackage(EnseignementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnseignementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnseignementPackageImpl theEnseignementPackage = registeredEnseignementPackage instanceof EnseignementPackageImpl ? (EnseignementPackageImpl)registeredEnseignementPackage : new EnseignementPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEnseignementPackage.createPackageContents();

		// Initialize created meta-data
		theEnseignementPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEnseignementPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EnseignementValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEnseignementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnseignementPackage.eNS_URI, theEnseignementPackage);
		return theEnseignementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomaine() {
		return domaineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomaine_Enseignants() {
		return (EReference)domaineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomaine_Departements() {
		return (EReference)domaineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomaine_Universites() {
		return (EReference)domaineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomaine_Etudiants() {
		return (EReference)domaineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomaine_Notes() {
		return (EReference)domaineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomaine_Matieres() {
		return (EReference)domaineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnseignant() {
		return enseignantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Nom() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Debut() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Salaire() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Titre() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Service() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnseignant_Age() {
		return (EAttribute)enseignantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnseignant_Specialisations() {
		return (EReference)enseignantEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnseignant_Enseignements() {
		return (EReference)enseignantEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnseignant__Operation__Matiere() {
		return enseignantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnseignant__AugmenterSal__int() {
		return enseignantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnseignant__SommeHeuresEffectuees__DiagnosticChain_Map() {
		return enseignantEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartement() {
		return departementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartement_Nom() {
		return (EAttribute)departementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Responsable() {
		return (EReference)departementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartement_Employes() {
		return (EReference)departementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__Ajouter__Enseignant() {
		return departementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__Au_moins_un_professeur__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__Nom_unique_enseignant__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDepartement__Chef_unique_et_age_depasse_40__DiagnosticChain_Map() {
		return departementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversite() {
		return universiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniversite_Nom() {
		return (EAttribute)universiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniversite_Sigle() {
		return (EAttribute)universiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversite_Inscrits() {
		return (EReference)universiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversite_Facultes() {
		return (EReference)universiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtudiant() {
		return etudiantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtudiant_Nom() {
		return (EAttribute)etudiantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtudiant_Ddn() {
		return (EAttribute)etudiantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtudiant_Resultats() {
		return (EReference)etudiantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEtudiant__EstAdmis() {
		return etudiantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEtudiant__Age() {
		return etudiantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEtudiant__Etudiant_admis_si_moyenne_superieure_ou_egale_a_10__DiagnosticChain_Map() {
		return etudiantEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Date() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_IdNote() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Val() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNote_Matiere() {
		return (EReference)noteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNote_Etudiant() {
		return (EReference)noteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatiere() {
		return matiereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatiere_Heure() {
		return (EAttribute)matiereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatiere_Nom() {
		return (EAttribute)matiereEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatiere_Resultats() {
		return (EReference)matiereEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatiere_Specialistes() {
		return (EReference)matiereEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatiere_Prof() {
		return (EReference)matiereEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTitre() {
		return titreEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnseignementFactory getEnseignementFactory() {
		return (EnseignementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domaineEClass = createEClass(DOMAINE);
		createEReference(domaineEClass, DOMAINE__ENSEIGNANTS);
		createEReference(domaineEClass, DOMAINE__DEPARTEMENTS);
		createEReference(domaineEClass, DOMAINE__UNIVERSITES);
		createEReference(domaineEClass, DOMAINE__ETUDIANTS);
		createEReference(domaineEClass, DOMAINE__NOTES);
		createEReference(domaineEClass, DOMAINE__MATIERES);

		enseignantEClass = createEClass(ENSEIGNANT);
		createEAttribute(enseignantEClass, ENSEIGNANT__NOM);
		createEAttribute(enseignantEClass, ENSEIGNANT__DEBUT);
		createEAttribute(enseignantEClass, ENSEIGNANT__SALAIRE);
		createEAttribute(enseignantEClass, ENSEIGNANT__TITRE);
		createEAttribute(enseignantEClass, ENSEIGNANT__SERVICE);
		createEAttribute(enseignantEClass, ENSEIGNANT__AGE);
		createEReference(enseignantEClass, ENSEIGNANT__SPECIALISATIONS);
		createEReference(enseignantEClass, ENSEIGNANT__ENSEIGNEMENTS);
		createEOperation(enseignantEClass, ENSEIGNANT___OPERATION__MATIERE);
		createEOperation(enseignantEClass, ENSEIGNANT___AUGMENTER_SAL__INT);
		createEOperation(enseignantEClass, ENSEIGNANT___SOMME_HEURES_EFFECTUEES__DIAGNOSTICCHAIN_MAP);

		departementEClass = createEClass(DEPARTEMENT);
		createEAttribute(departementEClass, DEPARTEMENT__NOM);
		createEReference(departementEClass, DEPARTEMENT__RESPONSABLE);
		createEReference(departementEClass, DEPARTEMENT__EMPLOYES);
		createEOperation(departementEClass, DEPARTEMENT___AJOUTER__ENSEIGNANT);
		createEOperation(departementEClass, DEPARTEMENT___AU_MOINS_UN_PROFESSEUR__DIAGNOSTICCHAIN_MAP);
		createEOperation(departementEClass, DEPARTEMENT___NOM_UNIQUE_ENSEIGNANT__DIAGNOSTICCHAIN_MAP);
		createEOperation(departementEClass, DEPARTEMENT___CHEF_UNIQUE_ET_AGE_DEPASSE_40__DIAGNOSTICCHAIN_MAP);

		universiteEClass = createEClass(UNIVERSITE);
		createEAttribute(universiteEClass, UNIVERSITE__NOM);
		createEAttribute(universiteEClass, UNIVERSITE__SIGLE);
		createEReference(universiteEClass, UNIVERSITE__INSCRITS);
		createEReference(universiteEClass, UNIVERSITE__FACULTES);

		etudiantEClass = createEClass(ETUDIANT);
		createEAttribute(etudiantEClass, ETUDIANT__NOM);
		createEAttribute(etudiantEClass, ETUDIANT__DDN);
		createEReference(etudiantEClass, ETUDIANT__RESULTATS);
		createEOperation(etudiantEClass, ETUDIANT___EST_ADMIS);
		createEOperation(etudiantEClass, ETUDIANT___AGE);
		createEOperation(etudiantEClass, ETUDIANT___ETUDIANT_ADMIS_SI_MOYENNE_SUPERIEURE_OU_EGALE_A10__DIAGNOSTICCHAIN_MAP);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__DATE);
		createEAttribute(noteEClass, NOTE__ID_NOTE);
		createEAttribute(noteEClass, NOTE__VAL);
		createEReference(noteEClass, NOTE__MATIERE);
		createEReference(noteEClass, NOTE__ETUDIANT);

		matiereEClass = createEClass(MATIERE);
		createEAttribute(matiereEClass, MATIERE__HEURE);
		createEAttribute(matiereEClass, MATIERE__NOM);
		createEReference(matiereEClass, MATIERE__RESULTATS);
		createEReference(matiereEClass, MATIERE__SPECIALISTES);
		createEReference(matiereEClass, MATIERE__PROF);

		// Create enums
		titreEEnum = createEEnum(TITRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(domaineEClass, Domaine.class, "Domaine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomaine_Enseignants(), this.getEnseignant(), null, "enseignants", null, 0, -1, Domaine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomaine_Departements(), this.getDepartement(), null, "departements", null, 0, -1, Domaine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomaine_Universites(), this.getUniversite(), null, "universites", null, 0, -1, Domaine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomaine_Etudiants(), this.getEtudiant(), null, "etudiants", null, 0, -1, Domaine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomaine_Notes(), this.getNote(), null, "notes", null, 0, -1, Domaine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomaine_Matieres(), this.getMatiere(), null, "matieres", null, 0, -1, Domaine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enseignantEClass, Enseignant.class, "Enseignant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnseignant_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Debut(), ecorePackage.getEDate(), "debut", null, 0, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Salaire(), ecorePackage.getEFloat(), "salaire", "0.0", 1, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Titre(), this.getTitre(), "titre", "MA", 0, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Service(), ecorePackage.getEInt(), "service", null, 1, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnseignant_Age(), ecorePackage.getEInt(), "age", null, 1, 1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnseignant_Specialisations(), this.getMatiere(), this.getMatiere_Specialistes(), "specialisations", null, 0, -1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnseignant_Enseignements(), this.getMatiere(), this.getMatiere_Prof(), "enseignements", null, 1, -1, Enseignant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEnseignant__Operation__Matiere(), null, "operation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatiere(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnseignant__AugmenterSal__int(), null, "augmenterSal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnseignant__SommeHeuresEffectuees__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SommeHeuresEffectuees", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(departementEClass, Departement.class, "Departement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartement_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Responsable(), this.getEnseignant(), null, "responsable", null, 0, 1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartement_Employes(), this.getEnseignant(), null, "employes", null, 0, -1, Departement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDepartement__Ajouter__Enseignant(), null, "ajouter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnseignant(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDepartement__Au_moins_un_professeur__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "au_moins_un_professeur", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDepartement__Nom_unique_enseignant__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nom_unique_enseignant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDepartement__Chef_unique_et_age_depasse_40__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "chef_unique_et_age_depasse_40", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(universiteEClass, Universite.class, "Universite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversite_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Universite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversite_Sigle(), ecorePackage.getEString(), "sigle", null, 0, 1, Universite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversite_Inscrits(), this.getEtudiant(), null, "inscrits", null, 0, -1, Universite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversite_Facultes(), this.getDepartement(), null, "facultes", null, 1, -1, Universite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etudiantEClass, Etudiant.class, "Etudiant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEtudiant_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Etudiant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtudiant_Ddn(), ecorePackage.getEDate(), "ddn", null, 0, 1, Etudiant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtudiant_Resultats(), this.getNote(), this.getNote_Etudiant(), "resultats", null, 1, -1, Etudiant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEtudiant__EstAdmis(), ecorePackage.getEBoolean(), "estAdmis", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEtudiant__Age(), ecorePackage.getEInt(), "age", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEtudiant__Etudiant_admis_si_moyenne_superieure_ou_egale_a_10__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "etudiant_admis_si_moyenne_superieure_ou_egale_a_10", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_IdNote(), ecorePackage.getEInt(), "idNote", null, 1, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Val(), ecorePackage.getEDouble(), "val", "0.0", 1, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNote_Matiere(), this.getMatiere(), this.getMatiere_Resultats(), "matiere", null, 1, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNote_Etudiant(), this.getEtudiant(), this.getEtudiant_Resultats(), "etudiant", null, 1, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matiereEClass, Matiere.class, "Matiere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatiere_Heure(), ecorePackage.getEInt(), "heure", null, 1, 1, Matiere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatiere_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Matiere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatiere_Resultats(), this.getNote(), this.getNote_Matiere(), "resultats", null, 0, -1, Matiere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatiere_Specialistes(), this.getEnseignant(), this.getEnseignant_Specialisations(), "specialistes", null, 0, -1, Matiere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatiere_Prof(), this.getEnseignant(), this.getEnseignant_Enseignements(), "prof", null, 1, 1, Matiere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(titreEEnum, Titre.class, "Titre");
		addEEnumLiteral(titreEEnum, Titre.MA);
		addEEnumLiteral(titreEEnum, Titre.MC);
		addEEnumLiteral(titreEEnum, Titre.PR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (enseignantEClass,
		   source,
		   new String[] {
			   "constraints", "SommeHeuresEffectuees"
		   });
		addAnnotation
		  (departementEClass,
		   source,
		   new String[] {
			   "constraints", "chef_unique_et_age_depasse_40"
		   });
		addAnnotation
		  (etudiantEClass,
		   source,
		   new String[] {
			   "constraints", "etudiant_admis_si_moyenne_superieure_ou_egale_a_10"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getEnseignant__SommeHeuresEffectuees__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tservice = enseignements.heure->sum()"
		   });
		addAnnotation
		  (getDepartement__Au_moins_un_professeur__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "employes->exists(e: Enseignant | e.titre = Titre::PR)"
		   });
		addAnnotation
		  (getDepartement__Nom_unique_enseignant__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "employes->forAll(e1, e2 : Enseignant | e1 <> e2 implies e1.nom <> e2.nom)"
		   });
		addAnnotation
		  (getDepartement__Chef_unique_et_age_depasse_40__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "responsable->size() = 1 and responsable.age > 40"
		   });
		addAnnotation
		  (getEtudiant__Etudiant_admis_si_moyenne_superieure_ou_egale_a_10__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "resultats->forAll(n | n.val >= 10.0)"
		   });
	}

} //EnseignementPackageImpl
