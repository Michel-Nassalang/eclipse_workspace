/**
 */
package football;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football.Equipe#getNom <em>Nom</em>}</li>
 *   <li>{@link football.Equipe#isPro <em>Pro</em>}</li>
 *   <li>{@link football.Equipe#getMatch <em>Match</em>}</li>
 *   <li>{@link football.Equipe#getJoueur <em>Joueur</em>}</li>
 *   <li>{@link football.Equipe#getTournoi <em>Tournoi</em>}</li>
 * </ul>
 *
 * @see football.FootballPackage#getEquipe()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='q3'"
 * @generated
 */
public interface Equipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see football.FootballPackage#getEquipe_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link football.Equipe#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Pro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pro</em>' attribute.
	 * @see #setPro(boolean)
	 * @see football.FootballPackage#getEquipe_Pro()
	 * @model required="true"
	 * @generated
	 */
	boolean isPro();

	/**
	 * Sets the value of the '{@link football.Equipe#isPro <em>Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pro</em>' attribute.
	 * @see #isPro()
	 * @generated
	 */
	void setPro(boolean value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' reference list.
	 * The list contents are of type {@link football.Match}.
	 * It is bidirectional and its opposite is '{@link football.Match#getAffronte <em>Affronte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference list.
	 * @see football.FootballPackage#getEquipe_Match()
	 * @see football.Match#getAffronte
	 * @model opposite="affronte"
	 * @generated
	 */
	EList<Match> getMatch();

	/**
	 * Returns the value of the '<em><b>Joueur</b></em>' reference list.
	 * The list contents are of type {@link football.Joueur}.
	 * It is bidirectional and its opposite is '{@link football.Joueur#getEquipe <em>Equipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joueur</em>' reference list.
	 * @see football.FootballPackage#getEquipe_Joueur()
	 * @see football.Joueur#getEquipe
	 * @model opposite="equipe" required="true" upper="5"
	 * @generated
	 */
	EList<Joueur> getJoueur();

	/**
	 * Returns the value of the '<em><b>Tournoi</b></em>' reference list.
	 * The list contents are of type {@link football.Tournoi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournoi</em>' reference list.
	 * @see football.FootballPackage#getEquipe_Tournoi()
	 * @model
	 * @generated
	 */
	EList<Tournoi> getTournoi();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='pro implies joueur-&gt;collect(age)-&gt;select(age | age &lt; 18)-&gt;isEmpty()'"
	 * @generated
	 */
	boolean q1(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='pro implies match-&gt;forAll(affronte.pro)'"
	 * @generated
	 */
	boolean q3(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Equipe
