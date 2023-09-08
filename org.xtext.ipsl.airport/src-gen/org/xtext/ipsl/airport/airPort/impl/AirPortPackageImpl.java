/**
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.airport.airPort.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.ipsl.airport.airPort.Aeroport;
import org.xtext.ipsl.airport.airPort.AirPortFactory;
import org.xtext.ipsl.airport.airPort.AirPortPackage;
import org.xtext.ipsl.airport.airPort.Avion;
import org.xtext.ipsl.airport.airPort.CodeOACI;
import org.xtext.ipsl.airport.airPort.Ligne;
import org.xtext.ipsl.airport.airPort.Model;
import org.xtext.ipsl.airport.airPort.Moteurs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AirPortPackageImpl extends EPackageImpl implements AirPortPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass avionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aeroportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ligneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeOACIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum moteursEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.ipsl.airport.airPort.AirPortPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AirPortPackageImpl()
  {
    super(eNS_URI, AirPortFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link AirPortPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AirPortPackage init()
  {
    if (isInited) return (AirPortPackage)EPackage.Registry.INSTANCE.getEPackage(AirPortPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredAirPortPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    AirPortPackageImpl theAirPortPackage = registeredAirPortPackage instanceof AirPortPackageImpl ? (AirPortPackageImpl)registeredAirPortPackage : new AirPortPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theAirPortPackage.createPackageContents();

    // Initialize created meta-data
    theAirPortPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAirPortPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AirPortPackage.eNS_URI, theAirPortPackage);
    return theAirPortPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Avions()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Aeroports()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Lignes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAvion()
  {
    return avionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAvion_Name()
  {
    return (EAttribute)avionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAvion_Passagers()
  {
    return (EAttribute)avionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAvion_Motorisation()
  {
    return (EAttribute)avionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAeroport()
  {
    return aeroportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAeroport_Nom()
  {
    return (EAttribute)aeroportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAeroport_Name()
  {
    return (EReference)aeroportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAeroport_Pays()
  {
    return (EAttribute)aeroportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAeroport_Pistes()
  {
    return (EAttribute)aeroportEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLigne()
  {
    return ligneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLigne_Name()
  {
    return (EAttribute)ligneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLigne_Avion()
  {
    return (EReference)ligneEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLigne_Compagnie()
  {
    return (EAttribute)ligneEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLigne_Depart()
  {
    return (EReference)ligneEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLigne_Arrivee()
  {
    return (EReference)ligneEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLigne_Duree()
  {
    return (EAttribute)ligneEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLigne_Regular()
  {
    return (EAttribute)ligneEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCodeOACI()
  {
    return codeOACIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCodeOACI_Name()
  {
    return (EAttribute)codeOACIEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getMoteurs()
  {
    return moteursEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AirPortFactory getAirPortFactory()
  {
    return (AirPortFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__AVIONS);
    createEReference(modelEClass, MODEL__AEROPORTS);
    createEReference(modelEClass, MODEL__LIGNES);

    avionEClass = createEClass(AVION);
    createEAttribute(avionEClass, AVION__NAME);
    createEAttribute(avionEClass, AVION__PASSAGERS);
    createEAttribute(avionEClass, AVION__MOTORISATION);

    aeroportEClass = createEClass(AEROPORT);
    createEAttribute(aeroportEClass, AEROPORT__NOM);
    createEReference(aeroportEClass, AEROPORT__NAME);
    createEAttribute(aeroportEClass, AEROPORT__PAYS);
    createEAttribute(aeroportEClass, AEROPORT__PISTES);

    ligneEClass = createEClass(LIGNE);
    createEAttribute(ligneEClass, LIGNE__NAME);
    createEReference(ligneEClass, LIGNE__AVION);
    createEAttribute(ligneEClass, LIGNE__COMPAGNIE);
    createEReference(ligneEClass, LIGNE__DEPART);
    createEReference(ligneEClass, LIGNE__ARRIVEE);
    createEAttribute(ligneEClass, LIGNE__DUREE);
    createEAttribute(ligneEClass, LIGNE__REGULAR);

    codeOACIEClass = createEClass(CODE_OACI);
    createEAttribute(codeOACIEClass, CODE_OACI__NAME);

    // Create enums
    moteursEEnum = createEEnum(MOTEURS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Avions(), this.getAvion(), null, "avions", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Aeroports(), this.getAeroport(), null, "aeroports", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Lignes(), this.getLigne(), null, "lignes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(avionEClass, Avion.class, "Avion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAvion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Avion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAvion_Passagers(), ecorePackage.getEInt(), "passagers", null, 0, 1, Avion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAvion_Motorisation(), this.getMoteurs(), "motorisation", null, 0, 1, Avion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aeroportEClass, Aeroport.class, "Aeroport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAeroport_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Aeroport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAeroport_Name(), this.getCodeOACI(), null, "name", null, 0, 1, Aeroport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAeroport_Pays(), ecorePackage.getEString(), "pays", null, 0, 1, Aeroport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAeroport_Pistes(), ecorePackage.getEInt(), "pistes", null, 0, 1, Aeroport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ligneEClass, Ligne.class, "Ligne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLigne_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ligne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLigne_Avion(), this.getAvion(), null, "avion", null, 0, 1, Ligne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLigne_Compagnie(), ecorePackage.getEString(), "compagnie", null, 0, 1, Ligne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLigne_Depart(), this.getCodeOACI(), null, "depart", null, 0, 1, Ligne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLigne_Arrivee(), this.getCodeOACI(), null, "arrivee", null, 0, 1, Ligne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLigne_Duree(), ecorePackage.getEString(), "duree", null, 0, 1, Ligne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLigne_Regular(), ecorePackage.getEBoolean(), "regular", null, 0, 1, Ligne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeOACIEClass, CodeOACI.class, "CodeOACI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeOACI_Name(), ecorePackage.getEString(), "name", null, 0, 1, CodeOACI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(moteursEEnum, Moteurs.class, "Moteurs");
    addEEnumLiteral(moteursEEnum, Moteurs.P1);
    addEEnumLiteral(moteursEEnum, Moteurs.P2);

    // Create resource
    createResource(eNS_URI);
  }

} //AirPortPackageImpl
