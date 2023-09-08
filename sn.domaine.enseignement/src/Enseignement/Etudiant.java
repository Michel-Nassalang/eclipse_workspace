/**
 */
package Enseignement;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etudiant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.Etudiant#getNom <em>Nom</em>}</li>
 *   <li>{@link Enseignement.Etudiant#getDdn <em>Ddn</em>}</li>
 *   <li>{@link Enseignement.Etudiant#getResultats <em>Resultats</em>}</li>
 * </ul>
 *
 * @see Enseignement.EnseignementPackage#getEtudiant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='etudiant_admis_si_moyenne_superieure_ou_egale_a_10'"
 * @generated
 */
public interface Etudiant extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see Enseignement.EnseignementPackage#getEtudiant_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link Enseignement.Etudiant#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Ddn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddn</em>' attribute.
	 * @see #setDdn(Date)
	 * @see Enseignement.EnseignementPackage#getEtudiant_Ddn()
	 * @model
	 * @generated
	 */
	Date getDdn();

	/**
	 * Sets the value of the '{@link Enseignement.Etudiant#getDdn <em>Ddn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ddn</em>' attribute.
	 * @see #getDdn()
	 * @generated
	 */
	void setDdn(Date value);

	/**
	 * Returns the value of the '<em><b>Resultats</b></em>' reference list.
	 * The list contents are of type {@link Enseignement.Note}.
	 * It is bidirectional and its opposite is '{@link Enseignement.Note#getEtudiant <em>Etudiant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultats</em>' reference list.
	 * @see Enseignement.EnseignementPackage#getEtudiant_Resultats()
	 * @see Enseignement.Note#getEtudiant
	 * @model opposite="etudiant" required="true"
	 * @generated
	 */
	EList<Note> getResultats();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean estAdmis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	int age();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='resultats-&gt;forAll(n | n.val &gt;= 10.0)'"
	 * @generated
	 */
	boolean etudiant_admis_si_moyenne_superieure_ou_egale_a_10(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Etudiant
