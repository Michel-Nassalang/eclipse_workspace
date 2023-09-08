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
 * A representation of the model object '<em><b>Enseignant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.Enseignant#getNom <em>Nom</em>}</li>
 *   <li>{@link Enseignement.Enseignant#getDebut <em>Debut</em>}</li>
 *   <li>{@link Enseignement.Enseignant#getSalaire <em>Salaire</em>}</li>
 *   <li>{@link Enseignement.Enseignant#getTitre <em>Titre</em>}</li>
 *   <li>{@link Enseignement.Enseignant#getService <em>Service</em>}</li>
 *   <li>{@link Enseignement.Enseignant#getAge <em>Age</em>}</li>
 *   <li>{@link Enseignement.Enseignant#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link Enseignement.Enseignant#getEnseignements <em>Enseignements</em>}</li>
 * </ul>
 *
 * @see Enseignement.EnseignementPackage#getEnseignant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SommeHeuresEffectuees'"
 * @generated
 */
public interface Enseignant extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see Enseignement.EnseignementPackage#getEnseignant_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link Enseignement.Enseignant#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' attribute.
	 * @see #setDebut(Date)
	 * @see Enseignement.EnseignementPackage#getEnseignant_Debut()
	 * @model
	 * @generated
	 */
	Date getDebut();

	/**
	 * Sets the value of the '{@link Enseignement.Enseignant#getDebut <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' attribute.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Salaire</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salaire</em>' attribute.
	 * @see #setSalaire(float)
	 * @see Enseignement.EnseignementPackage#getEnseignant_Salaire()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getSalaire();

	/**
	 * Sets the value of the '{@link Enseignement.Enseignant#getSalaire <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salaire</em>' attribute.
	 * @see #getSalaire()
	 * @generated
	 */
	void setSalaire(float value);

	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * The default value is <code>"MA"</code>.
	 * The literals are from the enumeration {@link Enseignement.Titre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see Enseignement.Titre
	 * @see #setTitre(Titre)
	 * @see Enseignement.EnseignementPackage#getEnseignant_Titre()
	 * @model default="MA"
	 * @generated
	 */
	Titre getTitre();

	/**
	 * Sets the value of the '{@link Enseignement.Enseignant#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see Enseignement.Titre
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(Titre value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(int)
	 * @see Enseignement.EnseignementPackage#getEnseignant_Service()
	 * @model required="true"
	 * @generated
	 */
	int getService();

	/**
	 * Sets the value of the '{@link Enseignement.Enseignant#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(int value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see Enseignement.EnseignementPackage#getEnseignant_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link Enseignement.Enseignant#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' reference list.
	 * The list contents are of type {@link Enseignement.Matiere}.
	 * It is bidirectional and its opposite is '{@link Enseignement.Matiere#getSpecialistes <em>Specialistes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' reference list.
	 * @see Enseignement.EnseignementPackage#getEnseignant_Specialisations()
	 * @see Enseignement.Matiere#getSpecialistes
	 * @model opposite="specialistes"
	 * @generated
	 */
	EList<Matiere> getSpecialisations();

	/**
	 * Returns the value of the '<em><b>Enseignements</b></em>' reference list.
	 * The list contents are of type {@link Enseignement.Matiere}.
	 * It is bidirectional and its opposite is '{@link Enseignement.Matiere#getProf <em>Prof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseignements</em>' reference list.
	 * @see Enseignement.EnseignementPackage#getEnseignant_Enseignements()
	 * @see Enseignement.Matiere#getProf
	 * @model opposite="prof" required="true"
	 * @generated
	 */
	EList<Matiere> getEnseignements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void operation(Matiere m);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vRequired="true"
	 * @generated
	 */
	void augmenterSal(int v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tservice = enseignements.heure-&gt;sum()'"
	 * @generated
	 */
	boolean SommeHeuresEffectuees(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Enseignant
