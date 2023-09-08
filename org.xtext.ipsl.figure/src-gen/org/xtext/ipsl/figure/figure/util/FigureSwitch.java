/**
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.figure.figure.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.ipsl.figure.figure.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.ipsl.figure.figure.FigurePackage
 * @generated
 */
public class FigureSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FigurePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FigureSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FigurePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FigurePackage.PROGRAMME:
      {
        PROGRAMME programme = (PROGRAMME)theEObject;
        T result = casePROGRAMME(programme);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FigurePackage.FIGURE:
      {
        FIGURE figure = (FIGURE)theEObject;
        T result = caseFIGURE(figure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FigurePackage.CARRE:
      {
        CARRE carre = (CARRE)theEObject;
        T result = caseCARRE(carre);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FigurePackage.RECTANGLE:
      {
        RECTANGLE rectangle = (RECTANGLE)theEObject;
        T result = caseRECTANGLE(rectangle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FigurePackage.CERCLE:
      {
        CERCLE cercle = (CERCLE)theEObject;
        T result = caseCERCLE(cercle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FigurePackage.RETURN:
      {
        RETURN return_ = (RETURN)theEObject;
        T result = caseRETURN(return_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FigurePackage.REEL:
      {
        REEL reel = (REEL)theEObject;
        T result = caseREEL(reel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PROGRAMME</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PROGRAMME</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePROGRAMME(PROGRAMME object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FIGURE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FIGURE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFIGURE(FIGURE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CARRE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CARRE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCARRE(CARRE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RECTANGLE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RECTANGLE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRECTANGLE(RECTANGLE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CERCLE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CERCLE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCERCLE(CERCLE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RETURN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RETURN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRETURN(RETURN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>REEL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>REEL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseREEL(REEL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FigureSwitch