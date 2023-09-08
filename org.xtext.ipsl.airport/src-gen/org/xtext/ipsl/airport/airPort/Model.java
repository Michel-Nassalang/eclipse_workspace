/**
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.airport.airPort;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ipsl.airport.airPort.Model#getAvions <em>Avions</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.Model#getAeroports <em>Aeroports</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.Model#getLignes <em>Lignes</em>}</li>
 * </ul>
 *
 * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Avions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ipsl.airport.airPort.Avion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Avions</em>' containment reference list.
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getModel_Avions()
   * @model containment="true"
   * @generated
   */
  EList<Avion> getAvions();

  /**
   * Returns the value of the '<em><b>Aeroports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ipsl.airport.airPort.Aeroport}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aeroports</em>' containment reference list.
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getModel_Aeroports()
   * @model containment="true"
   * @generated
   */
  EList<Aeroport> getAeroports();

  /**
   * Returns the value of the '<em><b>Lignes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ipsl.airport.airPort.Ligne}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lignes</em>' containment reference list.
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#getModel_Lignes()
   * @model containment="true"
   * @generated
   */
  EList<Ligne> getLignes();

} // Model
