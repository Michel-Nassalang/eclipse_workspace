/**
 * generated by Xtext 2.29.0
 */
package org.xtext.ipsl.calcul.calcul;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MODALITE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ipsl.calcul.calcul.MODALITE#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.xtext.ipsl.calcul.calcul.CalculPackage#getMODALITE()
 * @model
 * @generated
 */
public interface MODALITE extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Double}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see org.xtext.ipsl.calcul.calcul.CalculPackage#getMODALITE_Values()
   * @model unique="false"
   * @generated
   */
  EList<Double> getValues();

} // MODALITE
