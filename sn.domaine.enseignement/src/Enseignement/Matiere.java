/**
 */
package Enseignement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matiere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.Matiere#getHeure <em>Heure</em>}</li>
 *   <li>{@link Enseignement.Matiere#getNom <em>Nom</em>}</li>
 *   <li>{@link Enseignement.Matiere#getResultats <em>Resultats</em>}</li>
 *   <li>{@link Enseignement.Matiere#getSpecialistes <em>Specialistes</em>}</li>
 *   <li>{@link Enseignement.Matiere#getProf <em>Prof</em>}</li>
 * </ul>
 *
 * @see Enseignement.EnseignementPackage#getMatiere()
 * @model
 * @generated
 */
public interface Matiere extends EObject {
	/**
	 * Returns the value of the '<em><b>Heure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure</em>' attribute.
	 * @see #setHeure(int)
	 * @see Enseignement.EnseignementPackage#getMatiere_Heure()
	 * @model required="true"
	 * @generated
	 */
	int getHeure();

	/**
	 * Sets the value of the '{@link Enseignement.Matiere#getHeure <em>Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure</em>' attribute.
	 * @see #getHeure()
	 * @generated
	 */
	void setHeure(int value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see Enseignement.EnseignementPackage#getMatiere_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link Enseignement.Matiere#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Resultats</b></em>' reference list.
	 * The list contents are of type {@link Enseignement.Note}.
	 * It is bidirectional and its opposite is '{@link Enseignement.Note#getMatiere <em>Matiere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultats</em>' reference list.
	 * @see Enseignement.EnseignementPackage#getMatiere_Resultats()
	 * @see Enseignement.Note#getMatiere
	 * @model opposite="matiere"
	 * @generated
	 */
	EList<Note> getResultats();

	/**
	 * Returns the value of the '<em><b>Specialistes</b></em>' reference list.
	 * The list contents are of type {@link Enseignement.Enseignant}.
	 * It is bidirectional and its opposite is '{@link Enseignement.Enseignant#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialistes</em>' reference list.
	 * @see Enseignement.EnseignementPackage#getMatiere_Specialistes()
	 * @see Enseignement.Enseignant#getSpecialisations
	 * @model opposite="specialisations"
	 * @generated
	 */
	EList<Enseignant> getSpecialistes();

	/**
	 * Returns the value of the '<em><b>Prof</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Enseignement.Enseignant#getEnseignements <em>Enseignements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prof</em>' reference.
	 * @see #setProf(Enseignant)
	 * @see Enseignement.EnseignementPackage#getMatiere_Prof()
	 * @see Enseignement.Enseignant#getEnseignements
	 * @model opposite="enseignements" required="true"
	 * @generated
	 */
	Enseignant getProf();

	/**
	 * Sets the value of the '{@link Enseignement.Matiere#getProf <em>Prof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prof</em>' reference.
	 * @see #getProf()
	 * @generated
	 */
	void setProf(Enseignant value);

} // Matiere
