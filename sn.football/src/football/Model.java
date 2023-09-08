/**
 */
package football;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football.Model#getTournois <em>Tournois</em>}</li>
 *   <li>{@link football.Model#getJoueurs <em>Joueurs</em>}</li>
 *   <li>{@link football.Model#getMatchs <em>Matchs</em>}</li>
 *   <li>{@link football.Model#getEquipes <em>Equipes</em>}</li>
 * </ul>
 *
 * @see football.FootballPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Tournois</b></em>' containment reference list.
	 * The list contents are of type {@link football.Tournoi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournois</em>' containment reference list.
	 * @see football.FootballPackage#getModel_Tournois()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tournoi> getTournois();

	/**
	 * Returns the value of the '<em><b>Joueurs</b></em>' containment reference list.
	 * The list contents are of type {@link football.Joueur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joueurs</em>' containment reference list.
	 * @see football.FootballPackage#getModel_Joueurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Joueur> getJoueurs();

	/**
	 * Returns the value of the '<em><b>Matchs</b></em>' reference list.
	 * The list contents are of type {@link football.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchs</em>' reference list.
	 * @see football.FootballPackage#getModel_Matchs()
	 * @model
	 * @generated
	 */
	EList<Match> getMatchs();

	/**
	 * Returns the value of the '<em><b>Equipes</b></em>' containment reference list.
	 * The list contents are of type {@link football.Equipe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipes</em>' containment reference list.
	 * @see football.FootballPackage#getModel_Equipes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Equipe> getEquipes();

} // Model
