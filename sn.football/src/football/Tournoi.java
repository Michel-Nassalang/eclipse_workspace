/**
 */
package football;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournoi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football.Tournoi#getDate <em>Date</em>}</li>
 *   <li>{@link football.Tournoi#isTpro <em>Tpro</em>}</li>
 *   <li>{@link football.Tournoi#getMatch <em>Match</em>}</li>
 *   <li>{@link football.Tournoi#getEquipe <em>Equipe</em>}</li>
 * </ul>
 *
 * @see football.FootballPackage#getTournoi()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='q2'"
 * @generated
 */
public interface Tournoi extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see football.FootballPackage#getTournoi_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link football.Tournoi#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Tpro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tpro</em>' attribute.
	 * @see #setTpro(boolean)
	 * @see football.FootballPackage#getTournoi_Tpro()
	 * @model required="true"
	 * @generated
	 */
	boolean isTpro();

	/**
	 * Sets the value of the '{@link football.Tournoi#isTpro <em>Tpro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tpro</em>' attribute.
	 * @see #isTpro()
	 * @generated
	 */
	void setTpro(boolean value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' reference list.
	 * The list contents are of type {@link football.Match}.
	 * It is bidirectional and its opposite is '{@link football.Match#getTournoi <em>Tournoi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference list.
	 * @see football.FootballPackage#getTournoi_Match()
	 * @see football.Match#getTournoi
	 * @model opposite="tournoi" required="true"
	 * @generated
	 */
	EList<Match> getMatch();

	/**
	 * Returns the value of the '<em><b>Equipe</b></em>' reference list.
	 * The list contents are of type {@link football.Equipe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipe</em>' reference list.
	 * @see football.FootballPackage#getTournoi_Equipe()
	 * @model lower="2"
	 * @generated
	 */
	EList<Equipe> getEquipe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='tpro implies equipe-&gt;forAll(pro = true)'"
	 * @generated
	 */
	boolean q2(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tournoi
