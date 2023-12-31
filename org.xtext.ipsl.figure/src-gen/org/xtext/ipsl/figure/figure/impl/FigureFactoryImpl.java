/**
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.figure.figure.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.ipsl.figure.figure.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FigureFactoryImpl extends EFactoryImpl implements FigureFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FigureFactory init()
  {
    try
    {
      FigureFactory theFigureFactory = (FigureFactory)EPackage.Registry.INSTANCE.getEFactory(FigurePackage.eNS_URI);
      if (theFigureFactory != null)
      {
        return theFigureFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FigureFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FigureFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FigurePackage.PROGRAMME: return createPROGRAMME();
      case FigurePackage.FIGURE: return createFIGURE();
      case FigurePackage.CARRE: return createCARRE();
      case FigurePackage.RECTANGLE: return createRECTANGLE();
      case FigurePackage.CERCLE: return createCERCLE();
      case FigurePackage.RETURN: return createRETURN();
      case FigurePackage.REEL: return createREEL();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PROGRAMME createPROGRAMME()
  {
    PROGRAMMEImpl programme = new PROGRAMMEImpl();
    return programme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FIGURE createFIGURE()
  {
    FIGUREImpl figure = new FIGUREImpl();
    return figure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CARRE createCARRE()
  {
    CARREImpl carre = new CARREImpl();
    return carre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RECTANGLE createRECTANGLE()
  {
    RECTANGLEImpl rectangle = new RECTANGLEImpl();
    return rectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CERCLE createCERCLE()
  {
    CERCLEImpl cercle = new CERCLEImpl();
    return cercle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RETURN createRETURN()
  {
    RETURNImpl return_ = new RETURNImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public REEL createREEL()
  {
    REELImpl reel = new REELImpl();
    return reel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FigurePackage getFigurePackage()
  {
    return (FigurePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FigurePackage getPackage()
  {
    return FigurePackage.eINSTANCE;
  }

} //FigureFactoryImpl
