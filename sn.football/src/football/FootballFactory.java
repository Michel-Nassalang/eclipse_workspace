/**
 */
package football;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see football.FootballPackage
 * @generated
 */
public interface FootballFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FootballFactory eINSTANCE = football.impl.FootballFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Tournoi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tournoi</em>'.
	 * @generated
	 */
	Tournoi createTournoi();

	/**
	 * Returns a new object of class '<em>Joueur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joueur</em>'.
	 * @generated
	 */
	Joueur createJoueur();

	/**
	 * Returns a new object of class '<em>Equipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equipe</em>'.
	 * @generated
	 */
	Equipe createEquipe();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FootballPackage getFootballPackage();

} //FootballFactory
