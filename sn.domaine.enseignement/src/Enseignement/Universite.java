/**
 */
package Enseignement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.Universite#getNom <em>Nom</em>}</li>
 *   <li>{@link Enseignement.Universite#getSigle <em>Sigle</em>}</li>
 *   <li>{@link Enseignement.Universite#getInscrits <em>Inscrits</em>}</li>
 *   <li>{@link Enseignement.Universite#getFacultes <em>Facultes</em>}</li>
 * </ul>
 *
 * @see Enseignement.EnseignementPackage#getUniversite()
 * @model
 * @generated
 */
public interface Universite extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see Enseignement.EnseignementPackage#getUniversite_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link Enseignement.Universite#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Sigle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sigle</em>' attribute.
	 * @see #setSigle(String)
	 * @see Enseignement.EnseignementPackage#getUniversite_Sigle()
	 * @model
	 * @generated
	 */
	String getSigle();

	/**
	 * Sets the value of the '{@link Enseignement.Universite#getSigle <em>Sigle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigle</em>' attribute.
	 * @see #getSigle()
	 * @generated
	 */
	void setSigle(String value);

	/**
	 * Returns the value of the '<em><b>Inscrits</b></em>' reference list.
	 * The list contents are of type {@link Enseignement.Etudiant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inscrits</em>' reference list.
	 * @see Enseignement.EnseignementPackage#getUniversite_Inscrits()
	 * @model
	 * @generated
	 */
	EList<Etudiant> getInscrits();

	/**
	 * Returns the value of the '<em><b>Facultes</b></em>' reference list.
	 * The list contents are of type {@link Enseignement.Departement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facultes</em>' reference list.
	 * @see Enseignement.EnseignementPackage#getUniversite_Facultes()
	 * @model required="true"
	 * @generated
	 */
	EList<Departement> getFacultes();

} // Universite
