/**
 */
package Enseignement;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.Departement#getNom <em>Nom</em>}</li>
 *   <li>{@link Enseignement.Departement#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link Enseignement.Departement#getEmployes <em>Employes</em>}</li>
 * </ul>
 *
 * @see Enseignement.EnseignementPackage#getDepartement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='chef_unique_et_age_depasse_40'"
 * @generated
 */
public interface Departement extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see Enseignement.EnseignementPackage#getDepartement_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link Enseignement.Departement#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(Enseignant)
	 * @see Enseignement.EnseignementPackage#getDepartement_Responsable()
	 * @model
	 * @generated
	 */
	Enseignant getResponsable();

	/**
	 * Sets the value of the '{@link Enseignement.Departement#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Enseignant value);

	/**
	 * Returns the value of the '<em><b>Employes</b></em>' containment reference list.
	 * The list contents are of type {@link Enseignement.Enseignant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employes</em>' containment reference list.
	 * @see Enseignement.EnseignementPackage#getDepartement_Employes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enseignant> getEmployes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ajouter(Enseignant e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='employes-&gt;exists(e: Enseignant | e.titre = Titre::PR)'"
	 * @generated
	 */
	boolean au_moins_un_professeur(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='employes-&gt;forAll(e1, e2 : Enseignant | e1 &lt;&gt; e2 implies e1.nom &lt;&gt; e2.nom)'"
	 * @generated
	 */
	boolean nom_unique_enseignant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='responsable-&gt;size() = 1 and responsable.age &gt; 40'"
	 * @generated
	 */
	boolean chef_unique_et_age_depasse_40(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Departement
