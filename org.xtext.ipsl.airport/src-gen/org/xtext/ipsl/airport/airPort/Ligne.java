/**
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.airport.airPort;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ligne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ipsl.airport.airPort.Ligne#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.Ligne#getAvion <em>Avion</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.Ligne#getCompagnie <em>Compagnie</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.Ligne#getDepart <em>Depart</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.Ligne#getArrivee <em>Arrivee</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.Ligne#getDuree <em>Duree</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.Ligne#isRegular <em>Regular</em>}</li>
 * </ul>
 *
 * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getLigne()
 * @model
 * @generated
 */
public interface Ligne extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getLigne_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.airport.airPort.Ligne#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Avion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Avion</em>' reference.
   * @see #setAvion(Avion)
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getLigne_Avion()
   * @model
   * @generated
   */
  Avion getAvion();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.airport.airPort.Ligne#getAvion <em>Avion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Avion</em>' reference.
   * @see #getAvion()
   * @generated
   */
  void setAvion(Avion value);

  /**
   * Returns the value of the '<em><b>Compagnie</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compagnie</em>' attribute.
   * @see #setCompagnie(String)
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getLigne_Compagnie()
   * @model
   * @generated
   */
  String getCompagnie();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.airport.airPort.Ligne#getCompagnie <em>Compagnie</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compagnie</em>' attribute.
   * @see #getCompagnie()
   * @generated
   */
  void setCompagnie(String value);

  /**
   * Returns the value of the '<em><b>Depart</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depart</em>' reference.
   * @see #setDepart(CodeOACI)
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getLigne_Depart()
   * @model
   * @generated
   */
  CodeOACI getDepart();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.airport.airPort.Ligne#getDepart <em>Depart</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depart</em>' reference.
   * @see #getDepart()
   * @generated
   */
  void setDepart(CodeOACI value);

  /**
   * Returns the value of the '<em><b>Arrivee</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrivee</em>' reference.
   * @see #setArrivee(CodeOACI)
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getLigne_Arrivee()
   * @model
   * @generated
   */
  CodeOACI getArrivee();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.airport.airPort.Ligne#getArrivee <em>Arrivee</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrivee</em>' reference.
   * @see #getArrivee()
   * @generated
   */
  void setArrivee(CodeOACI value);

  /**
   * Returns the value of the '<em><b>Duree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duree</em>' attribute.
   * @see #setDuree(String)
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getLigne_Duree()
   * @model
   * @generated
   */
  String getDuree();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.airport.airPort.Ligne#getDuree <em>Duree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duree</em>' attribute.
   * @see #getDuree()
   * @generated
   */
  void setDuree(String value);

  /**
   * Returns the value of the '<em><b>Regular</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regular</em>' attribute.
   * @see #setRegular(boolean)
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getLigne_Regular()
   * @model
   * @generated
   */
  boolean isRegular();

  /**
   * Sets the value of the '{@link org.xtext.ipsl.airport.airPort.Ligne#isRegular <em>Regular</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regular</em>' attribute.
   * @see #isRegular()
   * @generated
   */
  void setRegular(boolean value);

} // Ligne