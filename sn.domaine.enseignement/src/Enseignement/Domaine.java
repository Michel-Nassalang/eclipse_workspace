/**
 */
package Enseignement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domaine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.Domaine#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link Enseignement.Domaine#getDepartements <em>Departements</em>}</li>
 *   <li>{@link Enseignement.Domaine#getUniversites <em>Universites</em>}</li>
 *   <li>{@link Enseignement.Domaine#getEtudiants <em>Etudiants</em>}</li>
 *   <li>{@link Enseignement.Domaine#getNotes <em>Notes</em>}</li>
 *   <li>{@link Enseignement.Domaine#getMatieres <em>Matieres</em>}</li>
 * </ul>
 *
 * @see Enseignement.EnseignementPackage#getDomaine()
 * @model
 * @generated
 */
public interface Domaine extends EObject {
	/**
	 * Returns the value of the '<em><b>Enseignants</b></em>' containment reference list.
	 * The list contents are of type {@link Enseignement.Enseignant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseignants</em>' containment reference list.
	 * @see Enseignement.EnseignementPackage#getDomaine_Enseignants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enseignant> getEnseignants();

	/**
	 * Returns the value of the '<em><b>Departements</b></em>' containment reference list.
	 * The list contents are of type {@link Enseignement.Departement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departements</em>' containment reference list.
	 * @see Enseignement.EnseignementPackage#getDomaine_Departements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Departement> getDepartements();

	/**
	 * Returns the value of the '<em><b>Universites</b></em>' containment reference list.
	 * The list contents are of type {@link Enseignement.Universite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universites</em>' containment reference list.
	 * @see Enseignement.EnseignementPackage#getDomaine_Universites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Universite> getUniversites();

	/**
	 * Returns the value of the '<em><b>Etudiants</b></em>' containment reference list.
	 * The list contents are of type {@link Enseignement.Etudiant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etudiants</em>' containment reference list.
	 * @see Enseignement.EnseignementPackage#getDomaine_Etudiants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Etudiant> getEtudiants();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link Enseignement.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see Enseignement.EnseignementPackage#getDomaine_Notes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNotes();

	/**
	 * Returns the value of the '<em><b>Matieres</b></em>' containment reference list.
	 * The list contents are of type {@link Enseignement.Matiere}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matieres</em>' containment reference list.
	 * @see Enseignement.EnseignementPackage#getDomaine_Matieres()
	 * @model containment="true"
	 * @generated
	 */
	EList<Matiere> getMatieres();

} // Domaine
