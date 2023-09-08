/**
 */
package football;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football.Match#isVictoire <em>Victoire</em>}</li>
 *   <li>{@link football.Match#getAffronte <em>Affronte</em>}</li>
 *   <li>{@link football.Match#getTournoi <em>Tournoi</em>}</li>
 * </ul>
 *
 * @see football.FootballPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Victoire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victoire</em>' attribute.
	 * @see #setVictoire(boolean)
	 * @see football.FootballPackage#getMatch_Victoire()
	 * @model required="true"
	 * @generated
	 */
	boolean isVictoire();

	/**
	 * Sets the value of the '{@link football.Match#isVictoire <em>Victoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victoire</em>' attribute.
	 * @see #isVictoire()
	 * @generated
	 */
	void setVictoire(boolean value);

	/**
	 * Returns the value of the '<em><b>Affronte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link football.Equipe#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affronte</em>' reference.
	 * @see #setAffronte(Equipe)
	 * @see football.FootballPackage#getMatch_Affronte()
	 * @see football.Equipe#getMatch
	 * @model opposite="match" required="true"
	 * @generated
	 */
	Equipe getAffronte();

	/**
	 * Sets the value of the '{@link football.Match#getAffronte <em>Affronte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affronte</em>' reference.
	 * @see #getAffronte()
	 * @generated
	 */
	void setAffronte(Equipe value);

	/**
	 * Returns the value of the '<em><b>Tournoi</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link football.Tournoi#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournoi</em>' reference.
	 * @see #setTournoi(Tournoi)
	 * @see football.FootballPackage#getMatch_Tournoi()
	 * @see football.Tournoi#getMatch
	 * @model opposite="match" required="true"
	 * @generated
	 */
	Tournoi getTournoi();

	/**
	 * Sets the value of the '{@link football.Match#getTournoi <em>Tournoi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tournoi</em>' reference.
	 * @see #getTournoi()
	 * @generated
	 */
	void setTournoi(Tournoi value);

} // Match
