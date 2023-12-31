/**
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.figure.figure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CERCLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ipsl.figure.figure.CERCLE#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.ipsl.figure.figure.CERCLE#getDebut <em>Debut</em>}</li>
 *   <li>{@link org.xtext.ipsl.figure.figure.CERCLE#getRayon <em>Rayon</em>}</li>
 *   <li>{@link org.xtext.ipsl.figure.figure.CERCLE#getRetour <em>Retour</em>}</li>
 *   <li>{@link org.xtext.ipsl.figure.figure.CERCLE#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.xtext.ipsl.figure.figure.FigurePackage#getCERCLE()
 * @model
 * @generated
 */
public interface CERCLE extends EObject
{
  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see org.xtext.ipsl.figure.figure.FigurePackage#getCERCLE_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.figure.figure.CERCLE#getNom <em>Nom</em>}' attribute.
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
   * @see #setDebut(String)
   * @see org.xtext.ipsl.figure.figure.FigurePackage#getCERCLE_Debut()
   * @model
   * @generated
   */
  String getDebut();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.figure.figure.CERCLE#getDebut <em>Debut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debut</em>' attribute.
   * @see #getDebut()
   * @generated
   */
  void setDebut(String value);

  /**
   * Returns the value of the '<em><b>Rayon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rayon</em>' containment reference.
   * @see #setRayon(REEL)
   * @see org.xtext.ipsl.figure.figure.FigurePackage#getCERCLE_Rayon()
   * @model containment="true"
   * @generated
   */
  REEL getRayon();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.figure.figure.CERCLE#getRayon <em>Rayon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rayon</em>' containment reference.
   * @see #getRayon()
   * @generated
   */
  void setRayon(REEL value);

  /**
   * Returns the value of the '<em><b>Retour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retour</em>' containment reference.
   * @see #setRetour(RETURN)
   * @see org.xtext.ipsl.figure.figure.FigurePackage#getCERCLE_Retour()
   * @model containment="true"
   * @generated
   */
  RETURN getRetour();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.figure.figure.CERCLE#getRetour <em>Retour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Retour</em>' containment reference.
   * @see #getRetour()
   * @generated
   */
  void setRetour(RETURN value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see org.xtext.ipsl.figure.figure.FigurePackage#getCERCLE_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.figure.figure.CERCLE#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

} // CERCLE
