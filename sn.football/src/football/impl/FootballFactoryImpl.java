/**
 */
package football.impl;

import football.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FootballFactoryImpl extends EFactoryImpl implements FootballFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FootballFactory init() {
		try {
			FootballFactory theFootballFactory = (FootballFactory)EPackage.Registry.INSTANCE.getEFactory(FootballPackage.eNS_URI);
			if (theFootballFactory != null) {
				return theFootballFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FootballFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootballFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FootballPackage.MODEL: return createModel();
			case FootballPackage.TOURNOI: return createTournoi();
			case FootballPackage.JOUEUR: return createJoueur();
			case FootballPackage.EQUIPE: return createEquipe();
			case FootballPackage.MATCH: return createMatch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournoi createTournoi() {
		TournoiImpl tournoi = new TournoiImpl();
		return tournoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joueur createJoueur() {
		JoueurImpl joueur = new JoueurImpl();
		return joueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipe createEquipe() {
		EquipeImpl equipe = new EquipeImpl();
		return equipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootballPackage getFootballPackage() {
		return (FootballPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FootballPackage getPackage() {
		return FootballPackage.eINSTANCE;
	}

} //FootballFactoryImpl
