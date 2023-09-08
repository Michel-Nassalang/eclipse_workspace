/**
 */
package football;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joueur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football.Joueur#getNom <em>Nom</em>}</li>
 *   <li>{@link football.Joueur#getAge <em>Age</em>}</li>
 *   <li>{@link football.Joueur#getEquipe <em>Equipe</em>}</li>
 * </ul>
 *
 * @see football.FootballPackage#getJoueur()
 * @model
 * @generated
 */
public interface Joueur extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see football.FootballPackage#getJoueur_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link football.Joueur#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see football.FootballPackage#getJoueur_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link football.Joueur#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Equipe</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link football.Equipe#getJoueur <em>Joueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipe</em>' reference.
	 * @see #setEquipe(Equipe)
	 * @see football.FootballPackage#getJoueur_Equipe()
	 * @see football.Equipe#getJoueur
	 * @model opposite="joueur" required="true"
	 * @generated
	 */
	Equipe getEquipe();

	/**
	 * Sets the value of the '{@link football.Joueur#getEquipe <em>Equipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipe</em>' reference.
	 * @see #getEquipe()
	 * @generated
	 */
	void setEquipe(Equipe value);

} // Joueur
