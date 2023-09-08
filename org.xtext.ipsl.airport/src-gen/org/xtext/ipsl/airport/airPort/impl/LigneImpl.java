/**
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.airport.airPort.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ipsl.airport.airPort.AirPortPackage;
import org.xtext.ipsl.airport.airPort.Avion;
import org.xtext.ipsl.airport.airPort.CodeOACI;
import org.xtext.ipsl.airport.airPort.Ligne;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ligne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ipsl.airport.airPort.impl.LigneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.impl.LigneImpl#getAvion <em>Avion</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.impl.LigneImpl#getCompagnie <em>Compagnie</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.impl.LigneImpl#getDepart <em>Depart</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.impl.LigneImpl#getArrivee <em>Arrivee</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.impl.LigneImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link org.xtext.ipsl.airport.airPort.impl.LigneImpl#isRegular <em>Regular</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LigneImpl extends MinimalEObjectImpl.Container implements Ligne
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAvion() <em>Avion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvion()
   * @generated
   * @ordered
   */
  protected Avion avion;

  /**
   * The default value of the '{@link #getCompagnie() <em>Compagnie</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompagnie()
   * @generated
   * @ordered
   */
  protected static final String COMPAGNIE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCompagnie() <em>Compagnie</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompagnie()
   * @generated
   * @ordered
   */
  protected String compagnie = COMPAGNIE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDepart() <em>Depart</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepart()
   * @generated
   * @ordered
   */
  protected CodeOACI depart;

  /**
   * The cached value of the '{@link #getArrivee() <em>Arrivee</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrivee()
   * @generated
   * @ordered
   */
  protected CodeOACI arrivee;

  /**
   * The default value of the '{@link #getDuree() <em>Duree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuree()
   * @generated
   * @ordered
   */
  protected static final String DUREE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDuree() <em>Duree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuree()
   * @generated
   * @ordered
   */
  protected String duree = DUREE_EDEFAULT;

  /**
   * The default value of the '{@link #isRegular() <em>Regular</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRegular()
   * @generated
   * @ordered
   */
  protected static final boolean REGULAR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRegular() <em>Regular</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRegular()
   * @generated
   * @ordered
   */
  protected boolean regular = REGULAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LigneImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AirPortPackage.Literals.LIGNE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirPortPackage.LIGNE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Avion getAvion()
  {
    if (avion != null && avion.eIsProxy())
    {
      InternalEObject oldAvion = (InternalEObject)avion;
      avion = (Avion)eResolveProxy(oldAvion);
      if (avion != oldAvion)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AirPortPackage.LIGNE__AVION, oldAvion, avion));
      }
    }
    return avion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Avion basicGetAvion()
  {
    return avion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAvion(Avion newAvion)
  {
    Avion oldAvion = avion;
    avion = newAvion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirPortPackage.LIGNE__AVION, oldAvion, avion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCompagnie()
  {
    return compagnie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCompagnie(String newCompagnie)
  {
    String oldCompagnie = compagnie;
    compagnie = newCompagnie;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirPortPackage.LIGNE__COMPAGNIE, oldCompagnie, compagnie));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CodeOACI getDepart()
  {
    if (depart != null && depart.eIsProxy())
    {
      InternalEObject oldDepart = (InternalEObject)depart;
      depart = (CodeOACI)eResolveProxy(oldDepart);
      if (depart != oldDepart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AirPortPackage.LIGNE__DEPART, oldDepart, depart));
      }
    }
    return depart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeOACI basicGetDepart()
  {
    return depart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDepart(CodeOACI newDepart)
  {
    CodeOACI oldDepart = depart;
    depart = newDepart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirPortPackage.LIGNE__DEPART, oldDepart, depart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CodeOACI getArrivee()
  {
    if (arrivee != null && arrivee.eIsProxy())
    {
      InternalEObject oldArrivee = (InternalEObject)arrivee;
      arrivee = (CodeOACI)eResolveProxy(oldArrivee);
      if (arrivee != oldArrivee)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AirPortPackage.LIGNE__ARRIVEE, oldArrivee, arrivee));
      }
    }
    return arrivee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeOACI basicGetArrivee()
  {
    return arrivee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArrivee(CodeOACI newArrivee)
  {
    CodeOACI oldArrivee = arrivee;
    arrivee = newArrivee;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirPortPackage.LIGNE__ARRIVEE, oldArrivee, arrivee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDuree()
  {
    return duree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDuree(String newDuree)
  {
    String oldDuree = duree;
    duree = newDuree;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirPortPackage.LIGNE__DUREE, oldDuree, duree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isRegular()
  {
    return regular;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRegular(boolean newRegular)
  {
    boolean oldRegular = regular;
    regular = newRegular;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirPortPackage.LIGNE__REGULAR, oldRegular, regular));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AirPortPackage.LIGNE__NAME:
        return getName();
      case AirPortPackage.LIGNE__AVION:
        if (resolve) return getAvion();
        return basicGetAvion();
      case AirPortPackage.LIGNE__COMPAGNIE:
        return getCompagnie();
      case AirPortPackage.LIGNE__DEPART:
        if (resolve) return getDepart();
        return basicGetDepart();
      case AirPortPackage.LIGNE__ARRIVEE:
        if (resolve) return getArrivee();
        return basicGetArrivee();
      case AirPortPackage.LIGNE__DUREE:
        return getDuree();
      case AirPortPackage.LIGNE__REGULAR:
        return isRegular();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AirPortPackage.LIGNE__NAME:
        setName((String)newValue);
        return;
      case AirPortPackage.LIGNE__AVION:
        setAvion((Avion)newValue);
        return;
      case AirPortPackage.LIGNE__COMPAGNIE:
        setCompagnie((String)newValue);
        return;
      case AirPortPackage.LIGNE__DEPART:
        setDepart((CodeOACI)newValue);
        return;
      case AirPortPackage.LIGNE__ARRIVEE:
        setArrivee((CodeOACI)newValue);
        return;
      case AirPortPackage.LIGNE__DUREE:
        setDuree((String)newValue);
        return;
      case AirPortPackage.LIGNE__REGULAR:
        setRegular((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AirPortPackage.LIGNE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AirPortPackage.LIGNE__AVION:
        setAvion((Avion)null);
        return;
      case AirPortPackage.LIGNE__COMPAGNIE:
        setCompagnie(COMPAGNIE_EDEFAULT);
        return;
      case AirPortPackage.LIGNE__DEPART:
        setDepart((CodeOACI)null);
        return;
      case AirPortPackage.LIGNE__ARRIVEE:
        setArrivee((CodeOACI)null);
        return;
      case AirPortPackage.LIGNE__DUREE:
        setDuree(DUREE_EDEFAULT);
        return;
      case AirPortPackage.LIGNE__REGULAR:
        setRegular(REGULAR_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AirPortPackage.LIGNE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AirPortPackage.LIGNE__AVION:
        return avion != null;
      case AirPortPackage.LIGNE__COMPAGNIE:
        return COMPAGNIE_EDEFAULT == null ? compagnie != null : !COMPAGNIE_EDEFAULT.equals(compagnie);
      case AirPortPackage.LIGNE__DEPART:
        return depart != null;
      case AirPortPackage.LIGNE__ARRIVEE:
        return arrivee != null;
      case AirPortPackage.LIGNE__DUREE:
        return DUREE_EDEFAULT == null ? duree != null : !DUREE_EDEFAULT.equals(duree);
      case AirPortPackage.LIGNE__REGULAR:
        return regular != REGULAR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", compagnie: ");
    result.append(compagnie);
    result.append(", duree: ");
    result.append(duree);
    result.append(", regular: ");
    result.append(regular);
    result.append(')');
    return result.toString();
  }

} //LigneImpl