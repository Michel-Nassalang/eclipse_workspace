/**
 */
package football;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see football.FootballFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface FootballPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "football";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://football.gouv.sn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "football";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FootballPackage eINSTANCE = football.impl.FootballPackageImpl.init();

	/**
	 * The meta object id for the '{@link football.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football.impl.ModelImpl
	 * @see football.impl.FootballPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Tournois</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TOURNOIS = 0;

	/**
	 * The feature id for the '<em><b>Joueurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__JOUEURS = 1;

	/**
	 * The feature id for the '<em><b>Matchs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MATCHS = 2;

	/**
	 * The feature id for the '<em><b>Equipes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EQUIPES = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link football.impl.TournoiImpl <em>Tournoi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football.impl.TournoiImpl
	 * @see football.impl.FootballPackageImpl#getTournoi()
	 * @generated
	 */
	int TOURNOI = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNOI__DATE = 0;

	/**
	 * The feature id for the '<em><b>Tpro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNOI__TPRO = 1;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNOI__MATCH = 2;

	/**
	 * The feature id for the '<em><b>Equipe</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNOI__EQUIPE = 3;

	/**
	 * The number of structural features of the '<em>Tournoi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNOI_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Q2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNOI___Q2__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Tournoi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNOI_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link football.impl.JoueurImpl <em>Joueur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football.impl.JoueurImpl
	 * @see football.impl.FootballPackageImpl#getJoueur()
	 * @generated
	 */
	int JOUEUR = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__NOM = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__AGE = 1;

	/**
	 * The feature id for the '<em><b>Equipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR__EQUIPE = 2;

	/**
	 * The number of structural features of the '<em>Joueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Joueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link football.impl.EquipeImpl <em>Equipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football.impl.EquipeImpl
	 * @see football.impl.FootballPackageImpl#getEquipe()
	 * @generated
	 */
	int EQUIPE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Pro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPE__PRO = 1;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPE__MATCH = 2;

	/**
	 * The feature id for the '<em><b>Joueur</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPE__JOUEUR = 3;

	/**
	 * The feature id for the '<em><b>Tournoi</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPE__TOURNOI = 4;

	/**
	 * The number of structural features of the '<em>Equipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Q1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPE___Q1__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Q3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPE___Q3__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Equipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link football.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football.impl.MatchImpl
	 * @see football.impl.FootballPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 4;

	/**
	 * The feature id for the '<em><b>Victoire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__VICTOIRE = 0;

	/**
	 * The feature id for the '<em><b>Affronte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AFFRONTE = 1;

	/**
	 * The feature id for the '<em><b>Tournoi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TOURNOI = 2;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link football.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see football.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link football.Model#getTournois <em>Tournois</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tournois</em>'.
	 * @see football.Model#getTournois()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Tournois();

	/**
	 * Returns the meta object for the containment reference list '{@link football.Model#getJoueurs <em>Joueurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joueurs</em>'.
	 * @see football.Model#getJoueurs()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Joueurs();

	/**
	 * Returns the meta object for the reference list '{@link football.Model#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matchs</em>'.
	 * @see football.Model#getMatchs()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Matchs();

	/**
	 * Returns the meta object for the containment reference list '{@link football.Model#getEquipes <em>Equipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipes</em>'.
	 * @see football.Model#getEquipes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Equipes();

	/**
	 * Returns the meta object for class '{@link football.Tournoi <em>Tournoi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tournoi</em>'.
	 * @see football.Tournoi
	 * @generated
	 */
	EClass getTournoi();

	/**
	 * Returns the meta object for the attribute '{@link football.Tournoi#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see football.Tournoi#getDate()
	 * @see #getTournoi()
	 * @generated
	 */
	EAttribute getTournoi_Date();

	/**
	 * Returns the meta object for the attribute '{@link football.Tournoi#isTpro <em>Tpro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tpro</em>'.
	 * @see football.Tournoi#isTpro()
	 * @see #getTournoi()
	 * @generated
	 */
	EAttribute getTournoi_Tpro();

	/**
	 * Returns the meta object for the reference list '{@link football.Tournoi#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Match</em>'.
	 * @see football.Tournoi#getMatch()
	 * @see #getTournoi()
	 * @generated
	 */
	EReference getTournoi_Match();

	/**
	 * Returns the meta object for the reference list '{@link football.Tournoi#getEquipe <em>Equipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equipe</em>'.
	 * @see football.Tournoi#getEquipe()
	 * @see #getTournoi()
	 * @generated
	 */
	EReference getTournoi_Equipe();

	/**
	 * Returns the meta object for the '{@link football.Tournoi#q2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Q2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Q2</em>' operation.
	 * @see football.Tournoi#q2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTournoi__Q2__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link football.Joueur <em>Joueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joueur</em>'.
	 * @see football.Joueur
	 * @generated
	 */
	EClass getJoueur();

	/**
	 * Returns the meta object for the attribute '{@link football.Joueur#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see football.Joueur#getNom()
	 * @see #getJoueur()
	 * @generated
	 */
	EAttribute getJoueur_Nom();

	/**
	 * Returns the meta object for the attribute '{@link football.Joueur#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see football.Joueur#getAge()
	 * @see #getJoueur()
	 * @generated
	 */
	EAttribute getJoueur_Age();

	/**
	 * Returns the meta object for the reference '{@link football.Joueur#getEquipe <em>Equipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equipe</em>'.
	 * @see football.Joueur#getEquipe()
	 * @see #getJoueur()
	 * @generated
	 */
	EReference getJoueur_Equipe();

	/**
	 * Returns the meta object for class '{@link football.Equipe <em>Equipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipe</em>'.
	 * @see football.Equipe
	 * @generated
	 */
	EClass getEquipe();

	/**
	 * Returns the meta object for the attribute '{@link football.Equipe#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see football.Equipe#getNom()
	 * @see #getEquipe()
	 * @generated
	 */
	EAttribute getEquipe_Nom();

	/**
	 * Returns the meta object for the attribute '{@link football.Equipe#isPro <em>Pro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pro</em>'.
	 * @see football.Equipe#isPro()
	 * @see #getEquipe()
	 * @generated
	 */
	EAttribute getEquipe_Pro();

	/**
	 * Returns the meta object for the reference list '{@link football.Equipe#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Match</em>'.
	 * @see football.Equipe#getMatch()
	 * @see #getEquipe()
	 * @generated
	 */
	EReference getEquipe_Match();

	/**
	 * Returns the meta object for the reference list '{@link football.Equipe#getJoueur <em>Joueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Joueur</em>'.
	 * @see football.Equipe#getJoueur()
	 * @see #getEquipe()
	 * @generated
	 */
	EReference getEquipe_Joueur();

	/**
	 * Returns the meta object for the reference list '{@link football.Equipe#getTournoi <em>Tournoi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tournoi</em>'.
	 * @see football.Equipe#getTournoi()
	 * @see #getEquipe()
	 * @generated
	 */
	EReference getEquipe_Tournoi();

	/**
	 * Returns the meta object for the '{@link football.Equipe#q1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Q1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Q1</em>' operation.
	 * @see football.Equipe#q1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEquipe__Q1__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link football.Equipe#q3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Q3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Q3</em>' operation.
	 * @see football.Equipe#q3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEquipe__Q3__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link football.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see football.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link football.Match#isVictoire <em>Victoire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victoire</em>'.
	 * @see football.Match#isVictoire()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Victoire();

	/**
	 * Returns the meta object for the reference '{@link football.Match#getAffronte <em>Affronte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affronte</em>'.
	 * @see football.Match#getAffronte()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Affronte();

	/**
	 * Returns the meta object for the reference '{@link football.Match#getTournoi <em>Tournoi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tournoi</em>'.
	 * @see football.Match#getTournoi()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Tournoi();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FootballFactory getFootballFactory();

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
		 * The meta object literal for the '{@link football.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football.impl.ModelImpl
		 * @see football.impl.FootballPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Tournois</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TOURNOIS = eINSTANCE.getModel_Tournois();

		/**
		 * The meta object literal for the '<em><b>Joueurs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__JOUEURS = eINSTANCE.getModel_Joueurs();

		/**
		 * The meta object literal for the '<em><b>Matchs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MATCHS = eINSTANCE.getModel_Matchs();

		/**
		 * The meta object literal for the '<em><b>Equipes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__EQUIPES = eINSTANCE.getModel_Equipes();

		/**
		 * The meta object literal for the '{@link football.impl.TournoiImpl <em>Tournoi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football.impl.TournoiImpl
		 * @see football.impl.FootballPackageImpl#getTournoi()
		 * @generated
		 */
		EClass TOURNOI = eINSTANCE.getTournoi();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNOI__DATE = eINSTANCE.getTournoi_Date();

		/**
		 * The meta object literal for the '<em><b>Tpro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNOI__TPRO = eINSTANCE.getTournoi_Tpro();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNOI__MATCH = eINSTANCE.getTournoi_Match();

		/**
		 * The meta object literal for the '<em><b>Equipe</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNOI__EQUIPE = eINSTANCE.getTournoi_Equipe();

		/**
		 * The meta object literal for the '<em><b>Q2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOURNOI___Q2__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTournoi__Q2__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link football.impl.JoueurImpl <em>Joueur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football.impl.JoueurImpl
		 * @see football.impl.FootballPackageImpl#getJoueur()
		 * @generated
		 */
		EClass JOUEUR = eINSTANCE.getJoueur();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOUEUR__NOM = eINSTANCE.getJoueur_Nom();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOUEUR__AGE = eINSTANCE.getJoueur_Age();

		/**
		 * The meta object literal for the '<em><b>Equipe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOUEUR__EQUIPE = eINSTANCE.getJoueur_Equipe();

		/**
		 * The meta object literal for the '{@link football.impl.EquipeImpl <em>Equipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football.impl.EquipeImpl
		 * @see football.impl.FootballPackageImpl#getEquipe()
		 * @generated
		 */
		EClass EQUIPE = eINSTANCE.getEquipe();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPE__NOM = eINSTANCE.getEquipe_Nom();

		/**
		 * The meta object literal for the '<em><b>Pro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPE__PRO = eINSTANCE.getEquipe_Pro();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPE__MATCH = eINSTANCE.getEquipe_Match();

		/**
		 * The meta object literal for the '<em><b>Joueur</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPE__JOUEUR = eINSTANCE.getEquipe_Joueur();

		/**
		 * The meta object literal for the '<em><b>Tournoi</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPE__TOURNOI = eINSTANCE.getEquipe_Tournoi();

		/**
		 * The meta object literal for the '<em><b>Q1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUIPE___Q1__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEquipe__Q1__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Q3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUIPE___Q3__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEquipe__Q3__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link football.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football.impl.MatchImpl
		 * @see football.impl.FootballPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Victoire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__VICTOIRE = eINSTANCE.getMatch_Victoire();

		/**
		 * The meta object literal for the '<em><b>Affronte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__AFFRONTE = eINSTANCE.getMatch_Affronte();

		/**
		 * The meta object literal for the '<em><b>Tournoi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__TOURNOI = eINSTANCE.getMatch_Tournoi();

	}

} //FootballPackage
