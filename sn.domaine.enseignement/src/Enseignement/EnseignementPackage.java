/**
 */
package Enseignement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Enseignement.EnseignementFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface EnseignementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Enseignement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://enseignement.sn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Enseignement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnseignementPackage eINSTANCE = Enseignement.impl.EnseignementPackageImpl.init();

	/**
	 * The meta object id for the '{@link Enseignement.impl.DomaineImpl <em>Domaine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Enseignement.impl.DomaineImpl
	 * @see Enseignement.impl.EnseignementPackageImpl#getDomaine()
	 * @generated
	 */
	int DOMAINE = 0;

	/**
	 * The feature id for the '<em><b>Enseignants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE__ENSEIGNANTS = 0;

	/**
	 * The feature id for the '<em><b>Departements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE__DEPARTEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Universites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE__UNIVERSITES = 2;

	/**
	 * The feature id for the '<em><b>Etudiants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE__ETUDIANTS = 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE__NOTES = 4;

	/**
	 * The feature id for the '<em><b>Matieres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE__MATIERES = 5;

	/**
	 * The number of structural features of the '<em>Domaine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Domaine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Enseignement.impl.EnseignantImpl <em>Enseignant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Enseignement.impl.EnseignantImpl
	 * @see Enseignement.impl.EnseignementPackageImpl#getEnseignant()
	 * @generated
	 */
	int ENSEIGNANT = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__DEBUT = 1;

	/**
	 * The feature id for the '<em><b>Salaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__SALAIRE = 2;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__TITRE = 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__AGE = 5;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__SPECIALISATIONS = 6;

	/**
	 * The feature id for the '<em><b>Enseignements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__ENSEIGNEMENTS = 7;

	/**
	 * The number of structural features of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT___OPERATION__MATIERE = 0;

	/**
	 * The operation id for the '<em>Augmenter Sal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT___AUGMENTER_SAL__INT = 1;

	/**
	 * The operation id for the '<em>Somme Heures Effectuees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT___SOMME_HEURES_EFFECTUEES__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Enseignement.impl.DepartementImpl <em>Departement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Enseignement.impl.DepartementImpl
	 * @see Enseignement.impl.EnseignementPackageImpl#getDepartement()
	 * @generated
	 */
	int DEPARTEMENT = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__RESPONSABLE = 1;

	/**
	 * The feature id for the '<em><b>Employes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__EMPLOYES = 2;

	/**
	 * The number of structural features of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___AJOUTER__ENSEIGNANT = 0;

	/**
	 * The operation id for the '<em>Au moins un professeur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___AU_MOINS_UN_PROFESSEUR__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Nom unique enseignant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___NOM_UNIQUE_ENSEIGNANT__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Chef unique et age depasse 40</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___CHEF_UNIQUE_ET_AGE_DEPASSE_40__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Enseignement.impl.UniversiteImpl <em>Universite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Enseignement.impl.UniversiteImpl
	 * @see Enseignement.impl.EnseignementPackageImpl#getUniversite()
	 * @generated
	 */
	int UNIVERSITE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Sigle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__SIGLE = 1;

	/**
	 * The feature id for the '<em><b>Inscrits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__INSCRITS = 2;

	/**
	 * The feature id for the '<em><b>Facultes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__FACULTES = 3;

	/**
	 * The number of structural features of the '<em>Universite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Universite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Enseignement.impl.EtudiantImpl <em>Etudiant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Enseignement.impl.EtudiantImpl
	 * @see Enseignement.impl.EnseignementPackageImpl#getEtudiant()
	 * @generated
	 */
	int ETUDIANT = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Ddn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__DDN = 1;

	/**
	 * The feature id for the '<em><b>Resultats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT__RESULTATS = 2;

	/**
	 * The number of structural features of the '<em>Etudiant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Est Admis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___EST_ADMIS = 0;

	/**
	 * The operation id for the '<em>Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___AGE = 1;

	/**
	 * The operation id for the '<em>Etudiant admis si moyenne superieure ou egale a10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT___ETUDIANT_ADMIS_SI_MOYENNE_SUPERIEURE_OU_EGALE_A10__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Etudiant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETUDIANT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Enseignement.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Enseignement.impl.NoteImpl
	 * @see Enseignement.impl.EnseignementPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Id Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ID_NOTE = 1;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__VAL = 2;

	/**
	 * The feature id for the '<em><b>Matiere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__MATIERE = 3;

	/**
	 * The feature id for the '<em><b>Etudiant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ETUDIANT = 4;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Enseignement.impl.MatiereImpl <em>Matiere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Enseignement.impl.MatiereImpl
	 * @see Enseignement.impl.EnseignementPackageImpl#getMatiere()
	 * @generated
	 */
	int MATIERE = 6;

	/**
	 * The feature id for the '<em><b>Heure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__HEURE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Resultats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__RESULTATS = 2;

	/**
	 * The feature id for the '<em><b>Specialistes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__SPECIALISTES = 3;

	/**
	 * The feature id for the '<em><b>Prof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE__PROF = 4;

	/**
	 * The number of structural features of the '<em>Matiere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Matiere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATIERE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Enseignement.Titre <em>Titre</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Enseignement.Titre
	 * @see Enseignement.impl.EnseignementPackageImpl#getTitre()
	 * @generated
	 */
	int TITRE = 7;


	/**
	 * Returns the meta object for class '{@link Enseignement.Domaine <em>Domaine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domaine</em>'.
	 * @see Enseignement.Domaine
	 * @generated
	 */
	EClass getDomaine();

	/**
	 * Returns the meta object for the containment reference list '{@link Enseignement.Domaine#getEnseignants <em>Enseignants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enseignants</em>'.
	 * @see Enseignement.Domaine#getEnseignants()
	 * @see #getDomaine()
	 * @generated
	 */
	EReference getDomaine_Enseignants();

	/**
	 * Returns the meta object for the containment reference list '{@link Enseignement.Domaine#getDepartements <em>Departements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departements</em>'.
	 * @see Enseignement.Domaine#getDepartements()
	 * @see #getDomaine()
	 * @generated
	 */
	EReference getDomaine_Departements();

	/**
	 * Returns the meta object for the containment reference list '{@link Enseignement.Domaine#getUniversites <em>Universites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Universites</em>'.
	 * @see Enseignement.Domaine#getUniversites()
	 * @see #getDomaine()
	 * @generated
	 */
	EReference getDomaine_Universites();

	/**
	 * Returns the meta object for the containment reference list '{@link Enseignement.Domaine#getEtudiants <em>Etudiants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Etudiants</em>'.
	 * @see Enseignement.Domaine#getEtudiants()
	 * @see #getDomaine()
	 * @generated
	 */
	EReference getDomaine_Etudiants();

	/**
	 * Returns the meta object for the containment reference list '{@link Enseignement.Domaine#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see Enseignement.Domaine#getNotes()
	 * @see #getDomaine()
	 * @generated
	 */
	EReference getDomaine_Notes();

	/**
	 * Returns the meta object for the containment reference list '{@link Enseignement.Domaine#getMatieres <em>Matieres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matieres</em>'.
	 * @see Enseignement.Domaine#getMatieres()
	 * @see #getDomaine()
	 * @generated
	 */
	EReference getDomaine_Matieres();

	/**
	 * Returns the meta object for class '{@link Enseignement.Enseignant <em>Enseignant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enseignant</em>'.
	 * @see Enseignement.Enseignant
	 * @generated
	 */
	EClass getEnseignant();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Enseignant#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see Enseignement.Enseignant#getNom()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Nom();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Enseignant#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debut</em>'.
	 * @see Enseignement.Enseignant#getDebut()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Debut();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Enseignant#getSalaire <em>Salaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salaire</em>'.
	 * @see Enseignement.Enseignant#getSalaire()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Salaire();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Enseignant#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see Enseignement.Enseignant#getTitre()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Titre();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Enseignant#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see Enseignement.Enseignant#getService()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Service();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Enseignant#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see Enseignement.Enseignant#getAge()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Age();

	/**
	 * Returns the meta object for the reference list '{@link Enseignement.Enseignant#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialisations</em>'.
	 * @see Enseignement.Enseignant#getSpecialisations()
	 * @see #getEnseignant()
	 * @generated
	 */
	EReference getEnseignant_Specialisations();

	/**
	 * Returns the meta object for the reference list '{@link Enseignement.Enseignant#getEnseignements <em>Enseignements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enseignements</em>'.
	 * @see Enseignement.Enseignant#getEnseignements()
	 * @see #getEnseignant()
	 * @generated
	 */
	EReference getEnseignant_Enseignements();

	/**
	 * Returns the meta object for the '{@link Enseignement.Enseignant#operation(Enseignement.Matiere) <em>Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operation</em>' operation.
	 * @see Enseignement.Enseignant#operation(Enseignement.Matiere)
	 * @generated
	 */
	EOperation getEnseignant__Operation__Matiere();

	/**
	 * Returns the meta object for the '{@link Enseignement.Enseignant#augmenterSal(int) <em>Augmenter Sal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Augmenter Sal</em>' operation.
	 * @see Enseignement.Enseignant#augmenterSal(int)
	 * @generated
	 */
	EOperation getEnseignant__AugmenterSal__int();

	/**
	 * Returns the meta object for the '{@link Enseignement.Enseignant#SommeHeuresEffectuees(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Somme Heures Effectuees</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Somme Heures Effectuees</em>' operation.
	 * @see Enseignement.Enseignant#SommeHeuresEffectuees(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEnseignant__SommeHeuresEffectuees__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Enseignement.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departement</em>'.
	 * @see Enseignement.Departement
	 * @generated
	 */
	EClass getDepartement();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Departement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see Enseignement.Departement#getNom()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Nom();

	/**
	 * Returns the meta object for the reference '{@link Enseignement.Departement#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see Enseignement.Departement#getResponsable()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Responsable();

	/**
	 * Returns the meta object for the containment reference list '{@link Enseignement.Departement#getEmployes <em>Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employes</em>'.
	 * @see Enseignement.Departement#getEmployes()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Employes();

	/**
	 * Returns the meta object for the '{@link Enseignement.Departement#ajouter(Enseignement.Enseignant) <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see Enseignement.Departement#ajouter(Enseignement.Enseignant)
	 * @generated
	 */
	EOperation getDepartement__Ajouter__Enseignant();

	/**
	 * Returns the meta object for the '{@link Enseignement.Departement#au_moins_un_professeur(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Au moins un professeur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Au moins un professeur</em>' operation.
	 * @see Enseignement.Departement#au_moins_un_professeur(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__Au_moins_un_professeur__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Enseignement.Departement#nom_unique_enseignant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nom unique enseignant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nom unique enseignant</em>' operation.
	 * @see Enseignement.Departement#nom_unique_enseignant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__Nom_unique_enseignant__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Enseignement.Departement#chef_unique_et_age_depasse_40(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Chef unique et age depasse 40</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Chef unique et age depasse 40</em>' operation.
	 * @see Enseignement.Departement#chef_unique_et_age_depasse_40(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__Chef_unique_et_age_depasse_40__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Enseignement.Universite <em>Universite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universite</em>'.
	 * @see Enseignement.Universite
	 * @generated
	 */
	EClass getUniversite();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Universite#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see Enseignement.Universite#getNom()
	 * @see #getUniversite()
	 * @generated
	 */
	EAttribute getUniversite_Nom();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Universite#getSigle <em>Sigle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigle</em>'.
	 * @see Enseignement.Universite#getSigle()
	 * @see #getUniversite()
	 * @generated
	 */
	EAttribute getUniversite_Sigle();

	/**
	 * Returns the meta object for the reference list '{@link Enseignement.Universite#getInscrits <em>Inscrits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inscrits</em>'.
	 * @see Enseignement.Universite#getInscrits()
	 * @see #getUniversite()
	 * @generated
	 */
	EReference getUniversite_Inscrits();

	/**
	 * Returns the meta object for the reference list '{@link Enseignement.Universite#getFacultes <em>Facultes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facultes</em>'.
	 * @see Enseignement.Universite#getFacultes()
	 * @see #getUniversite()
	 * @generated
	 */
	EReference getUniversite_Facultes();

	/**
	 * Returns the meta object for class '{@link Enseignement.Etudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etudiant</em>'.
	 * @see Enseignement.Etudiant
	 * @generated
	 */
	EClass getEtudiant();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Etudiant#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see Enseignement.Etudiant#getNom()
	 * @see #getEtudiant()
	 * @generated
	 */
	EAttribute getEtudiant_Nom();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Etudiant#getDdn <em>Ddn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ddn</em>'.
	 * @see Enseignement.Etudiant#getDdn()
	 * @see #getEtudiant()
	 * @generated
	 */
	EAttribute getEtudiant_Ddn();

	/**
	 * Returns the meta object for the reference list '{@link Enseignement.Etudiant#getResultats <em>Resultats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resultats</em>'.
	 * @see Enseignement.Etudiant#getResultats()
	 * @see #getEtudiant()
	 * @generated
	 */
	EReference getEtudiant_Resultats();

	/**
	 * Returns the meta object for the '{@link Enseignement.Etudiant#estAdmis() <em>Est Admis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Est Admis</em>' operation.
	 * @see Enseignement.Etudiant#estAdmis()
	 * @generated
	 */
	EOperation getEtudiant__EstAdmis();

	/**
	 * Returns the meta object for the '{@link Enseignement.Etudiant#age() <em>Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Age</em>' operation.
	 * @see Enseignement.Etudiant#age()
	 * @generated
	 */
	EOperation getEtudiant__Age();

	/**
	 * Returns the meta object for the '{@link Enseignement.Etudiant#etudiant_admis_si_moyenne_superieure_ou_egale_a_10(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Etudiant admis si moyenne superieure ou egale a10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Etudiant admis si moyenne superieure ou egale a10</em>' operation.
	 * @see Enseignement.Etudiant#etudiant_admis_si_moyenne_superieure_ou_egale_a_10(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEtudiant__Etudiant_admis_si_moyenne_superieure_ou_egale_a_10__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Enseignement.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see Enseignement.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Note#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see Enseignement.Note#getDate()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Date();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Note#getIdNote <em>Id Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Note</em>'.
	 * @see Enseignement.Note#getIdNote()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_IdNote();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Note#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see Enseignement.Note#getVal()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Val();

	/**
	 * Returns the meta object for the reference '{@link Enseignement.Note#getMatiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matiere</em>'.
	 * @see Enseignement.Note#getMatiere()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Matiere();

	/**
	 * Returns the meta object for the reference '{@link Enseignement.Note#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Etudiant</em>'.
	 * @see Enseignement.Note#getEtudiant()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Etudiant();

	/**
	 * Returns the meta object for class '{@link Enseignement.Matiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matiere</em>'.
	 * @see Enseignement.Matiere
	 * @generated
	 */
	EClass getMatiere();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Matiere#getHeure <em>Heure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure</em>'.
	 * @see Enseignement.Matiere#getHeure()
	 * @see #getMatiere()
	 * @generated
	 */
	EAttribute getMatiere_Heure();

	/**
	 * Returns the meta object for the attribute '{@link Enseignement.Matiere#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see Enseignement.Matiere#getNom()
	 * @see #getMatiere()
	 * @generated
	 */
	EAttribute getMatiere_Nom();

	/**
	 * Returns the meta object for the reference list '{@link Enseignement.Matiere#getResultats <em>Resultats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resultats</em>'.
	 * @see Enseignement.Matiere#getResultats()
	 * @see #getMatiere()
	 * @generated
	 */
	EReference getMatiere_Resultats();

	/**
	 * Returns the meta object for the reference list '{@link Enseignement.Matiere#getSpecialistes <em>Specialistes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialistes</em>'.
	 * @see Enseignement.Matiere#getSpecialistes()
	 * @see #getMatiere()
	 * @generated
	 */
	EReference getMatiere_Specialistes();

	/**
	 * Returns the meta object for the reference '{@link Enseignement.Matiere#getProf <em>Prof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prof</em>'.
	 * @see Enseignement.Matiere#getProf()
	 * @see #getMatiere()
	 * @generated
	 */
	EReference getMatiere_Prof();

	/**
	 * Returns the meta object for enum '{@link Enseignement.Titre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Titre</em>'.
	 * @see Enseignement.Titre
	 * @generated
	 */
	EEnum getTitre();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnseignementFactory getEnseignementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Enseignement.impl.DomaineImpl <em>Domaine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Enseignement.impl.DomaineImpl
		 * @see Enseignement.impl.EnseignementPackageImpl#getDomaine()
		 * @generated
		 */
		EClass DOMAINE = eINSTANCE.getDomaine();

		/**
		 * The meta object literal for the '<em><b>Enseignants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAINE__ENSEIGNANTS = eINSTANCE.getDomaine_Enseignants();

		/**
		 * The meta object literal for the '<em><b>Departements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAINE__DEPARTEMENTS = eINSTANCE.getDomaine_Departements();

		/**
		 * The meta object literal for the '<em><b>Universites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAINE__UNIVERSITES = eINSTANCE.getDomaine_Universites();

		/**
		 * The meta object literal for the '<em><b>Etudiants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAINE__ETUDIANTS = eINSTANCE.getDomaine_Etudiants();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAINE__NOTES = eINSTANCE.getDomaine_Notes();

		/**
		 * The meta object literal for the '<em><b>Matieres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAINE__MATIERES = eINSTANCE.getDomaine_Matieres();

		/**
		 * The meta object literal for the '{@link Enseignement.impl.EnseignantImpl <em>Enseignant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Enseignement.impl.EnseignantImpl
		 * @see Enseignement.impl.EnseignementPackageImpl#getEnseignant()
		 * @generated
		 */
		EClass ENSEIGNANT = eINSTANCE.getEnseignant();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__NOM = eINSTANCE.getEnseignant_Nom();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__DEBUT = eINSTANCE.getEnseignant_Debut();

		/**
		 * The meta object literal for the '<em><b>Salaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__SALAIRE = eINSTANCE.getEnseignant_Salaire();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__TITRE = eINSTANCE.getEnseignant_Titre();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__SERVICE = eINSTANCE.getEnseignant_Service();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__AGE = eINSTANCE.getEnseignant_Age();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEIGNANT__SPECIALISATIONS = eINSTANCE.getEnseignant_Specialisations();

		/**
		 * The meta object literal for the '<em><b>Enseignements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEIGNANT__ENSEIGNEMENTS = eINSTANCE.getEnseignant_Enseignements();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENSEIGNANT___OPERATION__MATIERE = eINSTANCE.getEnseignant__Operation__Matiere();

		/**
		 * The meta object literal for the '<em><b>Augmenter Sal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENSEIGNANT___AUGMENTER_SAL__INT = eINSTANCE.getEnseignant__AugmenterSal__int();

		/**
		 * The meta object literal for the '<em><b>Somme Heures Effectuees</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENSEIGNANT___SOMME_HEURES_EFFECTUEES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEnseignant__SommeHeuresEffectuees__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Enseignement.impl.DepartementImpl <em>Departement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Enseignement.impl.DepartementImpl
		 * @see Enseignement.impl.EnseignementPackageImpl#getDepartement()
		 * @generated
		 */
		EClass DEPARTEMENT = eINSTANCE.getDepartement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__NOM = eINSTANCE.getDepartement_Nom();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__RESPONSABLE = eINSTANCE.getDepartement_Responsable();

		/**
		 * The meta object literal for the '<em><b>Employes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__EMPLOYES = eINSTANCE.getDepartement_Employes();

		/**
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___AJOUTER__ENSEIGNANT = eINSTANCE.getDepartement__Ajouter__Enseignant();

		/**
		 * The meta object literal for the '<em><b>Au moins un professeur</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___AU_MOINS_UN_PROFESSEUR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__Au_moins_un_professeur__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nom unique enseignant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___NOM_UNIQUE_ENSEIGNANT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__Nom_unique_enseignant__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Chef unique et age depasse 40</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___CHEF_UNIQUE_ET_AGE_DEPASSE_40__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDepartement__Chef_unique_et_age_depasse_40__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Enseignement.impl.UniversiteImpl <em>Universite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Enseignement.impl.UniversiteImpl
		 * @see Enseignement.impl.EnseignementPackageImpl#getUniversite()
		 * @generated
		 */
		EClass UNIVERSITE = eINSTANCE.getUniversite();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITE__NOM = eINSTANCE.getUniversite_Nom();

		/**
		 * The meta object literal for the '<em><b>Sigle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITE__SIGLE = eINSTANCE.getUniversite_Sigle();

		/**
		 * The meta object literal for the '<em><b>Inscrits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITE__INSCRITS = eINSTANCE.getUniversite_Inscrits();

		/**
		 * The meta object literal for the '<em><b>Facultes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITE__FACULTES = eINSTANCE.getUniversite_Facultes();

		/**
		 * The meta object literal for the '{@link Enseignement.impl.EtudiantImpl <em>Etudiant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Enseignement.impl.EtudiantImpl
		 * @see Enseignement.impl.EnseignementPackageImpl#getEtudiant()
		 * @generated
		 */
		EClass ETUDIANT = eINSTANCE.getEtudiant();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__NOM = eINSTANCE.getEtudiant_Nom();

		/**
		 * The meta object literal for the '<em><b>Ddn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETUDIANT__DDN = eINSTANCE.getEtudiant_Ddn();

		/**
		 * The meta object literal for the '<em><b>Resultats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETUDIANT__RESULTATS = eINSTANCE.getEtudiant_Resultats();

		/**
		 * The meta object literal for the '<em><b>Est Admis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ETUDIANT___EST_ADMIS = eINSTANCE.getEtudiant__EstAdmis();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ETUDIANT___AGE = eINSTANCE.getEtudiant__Age();

		/**
		 * The meta object literal for the '<em><b>Etudiant admis si moyenne superieure ou egale a10</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ETUDIANT___ETUDIANT_ADMIS_SI_MOYENNE_SUPERIEURE_OU_EGALE_A10__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEtudiant__Etudiant_admis_si_moyenne_superieure_ou_egale_a_10__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Enseignement.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Enseignement.impl.NoteImpl
		 * @see Enseignement.impl.EnseignementPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DATE = eINSTANCE.getNote_Date();

		/**
		 * The meta object literal for the '<em><b>Id Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__ID_NOTE = eINSTANCE.getNote_IdNote();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__VAL = eINSTANCE.getNote_Val();

		/**
		 * The meta object literal for the '<em><b>Matiere</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__MATIERE = eINSTANCE.getNote_Matiere();

		/**
		 * The meta object literal for the '<em><b>Etudiant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__ETUDIANT = eINSTANCE.getNote_Etudiant();

		/**
		 * The meta object literal for the '{@link Enseignement.impl.MatiereImpl <em>Matiere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Enseignement.impl.MatiereImpl
		 * @see Enseignement.impl.EnseignementPackageImpl#getMatiere()
		 * @generated
		 */
		EClass MATIERE = eINSTANCE.getMatiere();

		/**
		 * The meta object literal for the '<em><b>Heure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATIERE__HEURE = eINSTANCE.getMatiere_Heure();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATIERE__NOM = eINSTANCE.getMatiere_Nom();

		/**
		 * The meta object literal for the '<em><b>Resultats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATIERE__RESULTATS = eINSTANCE.getMatiere_Resultats();

		/**
		 * The meta object literal for the '<em><b>Specialistes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATIERE__SPECIALISTES = eINSTANCE.getMatiere_Specialistes();

		/**
		 * The meta object literal for the '<em><b>Prof</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATIERE__PROF = eINSTANCE.getMatiere_Prof();

		/**
		 * The meta object literal for the '{@link Enseignement.Titre <em>Titre</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Enseignement.Titre
		 * @see Enseignement.impl.EnseignementPackageImpl#getTitre()
		 * @generated
		 */
		EEnum TITRE = eINSTANCE.getTitre();

	}

} //EnseignementPackage
