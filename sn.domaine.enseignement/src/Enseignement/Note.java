/**
 */
package Enseignement;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.Note#getDate <em>Date</em>}</li>
 *   <li>{@link Enseignement.Note#getIdNote <em>Id Note</em>}</li>
 *   <li>{@link Enseignement.Note#getVal <em>Val</em>}</li>
 *   <li>{@link Enseignement.Note#getMatiere <em>Matiere</em>}</li>
 *   <li>{@link Enseignement.Note#getEtudiant <em>Etudiant</em>}</li>
 * </ul>
 *
 * @see Enseignement.EnseignementPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see Enseignement.EnseignementPackage#getNote_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link Enseignement.Note#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Id Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Note</em>' attribute.
	 * @see #setIdNote(int)
	 * @see Enseignement.EnseignementPackage#getNote_IdNote()
	 * @model required="true"
	 * @generated
	 */
	int getIdNote();

	/**
	 * Sets the value of the '{@link Enseignement.Note#getIdNote <em>Id Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Note</em>' attribute.
	 * @see #getIdNote()
	 * @generated
	 */
	void setIdNote(int value);

	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(double)
	 * @see Enseignement.EnseignementPackage#getNote_Val()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getVal();

	/**
	 * Sets the value of the '{@link Enseignement.Note#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(double value);

	/**
	 * Returns the value of the '<em><b>Matiere</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Enseignement.Matiere#getResultats <em>Resultats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matiere</em>' reference.
	 * @see #setMatiere(Matiere)
	 * @see Enseignement.EnseignementPackage#getNote_Matiere()
	 * @see Enseignement.Matiere#getResultats
	 * @model opposite="resultats" required="true"
	 * @generated
	 */
	Matiere getMatiere();

	/**
	 * Sets the value of the '{@link Enseignement.Note#getMatiere <em>Matiere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matiere</em>' reference.
	 * @see #getMatiere()
	 * @generated
	 */
	void setMatiere(Matiere value);

	/**
	 * Returns the value of the '<em><b>Etudiant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Enseignement.Etudiant#getResultats <em>Resultats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etudiant</em>' reference.
	 * @see #setEtudiant(Etudiant)
	 * @see Enseignement.EnseignementPackage#getNote_Etudiant()
	 * @see Enseignement.Etudiant#getResultats
	 * @model opposite="resultats" required="true"
	 * @generated
	 */
	Etudiant getEtudiant();

	/**
	 * Sets the value of the '{@link Enseignement.Note#getEtudiant <em>Etudiant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etudiant</em>' reference.
	 * @see #getEtudiant()
	 * @generated
	 */
	void setEtudiant(Etudiant value);

} // Note
