/**
 * generated by Xtext 2.29.0
 */
package org.xtext.ipsl.calcul.calcul.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ipsl.calcul.calcul.CalculPackage;
import org.xtext.ipsl.calcul.calcul.EFFECTIF;
import org.xtext.ipsl.calcul.calcul.MODALITE;
import org.xtext.ipsl.calcul.calcul.STATISTIQUE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STATISTIQUE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ipsl.calcul.calcul.impl.STATISTIQUEImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.ipsl.calcul.calcul.impl.STATISTIQUEImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link org.xtext.ipsl.calcul.calcul.impl.STATISTIQUEImpl#getModalite <em>Modalite</em>}</li>
 *   <li>{@link org.xtext.ipsl.calcul.calcul.impl.STATISTIQUEImpl#getEffectif <em>Effectif</em>}</li>
 *   <li>{@link org.xtext.ipsl.calcul.calcul.impl.STATISTIQUEImpl#getResultat <em>Resultat</em>}</li>
 *   <li>{@link org.xtext.ipsl.calcul.calcul.impl.STATISTIQUEImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STATISTIQUEImpl extends MinimalEObjectImpl.Container implements STATISTIQUE
{
  /**
   * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNom()
   * @generated
   * @ordered
   */
  protected static final String NOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNom()
   * @generated
   * @ordered
   */
  protected String nom = NOM_EDEFAULT;

  /**
   * The default value of the '{@link #getDebut() <em>Debut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebut()
   * @generated
   * @ordered
   */
  protected static final String DEBUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDebut() <em>Debut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebut()
   * @generated
   * @ordered
   */
  protected String debut = DEBUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getModalite() <em>Modalite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModalite()
   * @generated
   * @ordered
   */
  protected MODALITE modalite;

  /**
   * The cached value of the '{@link #getEffectif() <em>Effectif</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffectif()
   * @generated
   * @ordered
   */
  protected EFFECTIF effectif;

  /**
   * The default value of the '{@link #getResultat() <em>Resultat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultat()
   * @generated
   * @ordered
   */
  protected static final String RESULTAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResultat() <em>Resultat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultat()
   * @generated
   * @ordered
   */
  protected String resultat = RESULTAT_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected static final String END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected String end = END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected STATISTIQUEImpl()
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
    return CalculPackage.Literals.STATISTIQUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNom()
  {
    return nom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNom(String newNom)
  {
    String oldNom = nom;
    nom = newNom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.STATISTIQUE__NOM, oldNom, nom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDebut()
  {
    return debut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDebut(String newDebut)
  {
    String oldDebut = debut;
    debut = newDebut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.STATISTIQUE__DEBUT, oldDebut, debut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MODALITE getModalite()
  {
    return modalite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModalite(MODALITE newModalite, NotificationChain msgs)
  {
    MODALITE oldModalite = modalite;
    modalite = newModalite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.STATISTIQUE__MODALITE, oldModalite, newModalite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModalite(MODALITE newModalite)
  {
    if (newModalite != modalite)
    {
      NotificationChain msgs = null;
      if (modalite != null)
        msgs = ((InternalEObject)modalite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.STATISTIQUE__MODALITE, null, msgs);
      if (newModalite != null)
        msgs = ((InternalEObject)newModalite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.STATISTIQUE__MODALITE, null, msgs);
      msgs = basicSetModalite(newModalite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.STATISTIQUE__MODALITE, newModalite, newModalite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFFECTIF getEffectif()
  {
    return effectif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEffectif(EFFECTIF newEffectif, NotificationChain msgs)
  {
    EFFECTIF oldEffectif = effectif;
    effectif = newEffectif;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalculPackage.STATISTIQUE__EFFECTIF, oldEffectif, newEffectif);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEffectif(EFFECTIF newEffectif)
  {
    if (newEffectif != effectif)
    {
      NotificationChain msgs = null;
      if (effectif != null)
        msgs = ((InternalEObject)effectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalculPackage.STATISTIQUE__EFFECTIF, null, msgs);
      if (newEffectif != null)
        msgs = ((InternalEObject)newEffectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalculPackage.STATISTIQUE__EFFECTIF, null, msgs);
      msgs = basicSetEffectif(newEffectif, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.STATISTIQUE__EFFECTIF, newEffectif, newEffectif));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getResultat()
  {
    return resultat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setResultat(String newResultat)
  {
    String oldResultat = resultat;
    resultat = newResultat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.STATISTIQUE__RESULTAT, oldResultat, resultat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnd(String newEnd)
  {
    String oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculPackage.STATISTIQUE__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CalculPackage.STATISTIQUE__MODALITE:
        return basicSetModalite(null, msgs);
      case CalculPackage.STATISTIQUE__EFFECTIF:
        return basicSetEffectif(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CalculPackage.STATISTIQUE__NOM:
        return getNom();
      case CalculPackage.STATISTIQUE__DEBUT:
        return getDebut();
      case CalculPackage.STATISTIQUE__MODALITE:
        return getModalite();
      case CalculPackage.STATISTIQUE__EFFECTIF:
        return getEffectif();
      case CalculPackage.STATISTIQUE__RESULTAT:
        return getResultat();
      case CalculPackage.STATISTIQUE__END:
        return getEnd();
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
      case CalculPackage.STATISTIQUE__NOM:
        setNom((String)newValue);
        return;
      case CalculPackage.STATISTIQUE__DEBUT:
        setDebut((String)newValue);
        return;
      case CalculPackage.STATISTIQUE__MODALITE:
        setModalite((MODALITE)newValue);
        return;
      case CalculPackage.STATISTIQUE__EFFECTIF:
        setEffectif((EFFECTIF)newValue);
        return;
      case CalculPackage.STATISTIQUE__RESULTAT:
        setResultat((String)newValue);
        return;
      case CalculPackage.STATISTIQUE__END:
        setEnd((String)newValue);
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
      case CalculPackage.STATISTIQUE__NOM:
        setNom(NOM_EDEFAULT);
        return;
      case CalculPackage.STATISTIQUE__DEBUT:
        setDebut(DEBUT_EDEFAULT);
        return;
      case CalculPackage.STATISTIQUE__MODALITE:
        setModalite((MODALITE)null);
        return;
      case CalculPackage.STATISTIQUE__EFFECTIF:
        setEffectif((EFFECTIF)null);
        return;
      case CalculPackage.STATISTIQUE__RESULTAT:
        setResultat(RESULTAT_EDEFAULT);
        return;
      case CalculPackage.STATISTIQUE__END:
        setEnd(END_EDEFAULT);
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
      case CalculPackage.STATISTIQUE__NOM:
        return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
      case CalculPackage.STATISTIQUE__DEBUT:
        return DEBUT_EDEFAULT == null ? debut != null : !DEBUT_EDEFAULT.equals(debut);
      case CalculPackage.STATISTIQUE__MODALITE:
        return modalite != null;
      case CalculPackage.STATISTIQUE__EFFECTIF:
        return effectif != null;
      case CalculPackage.STATISTIQUE__RESULTAT:
        return RESULTAT_EDEFAULT == null ? resultat != null : !RESULTAT_EDEFAULT.equals(resultat);
      case CalculPackage.STATISTIQUE__END:
        return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
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
    result.append(" (nom: ");
    result.append(nom);
    result.append(", debut: ");
    result.append(debut);
    result.append(", resultat: ");
    result.append(resultat);
    result.append(", end: ");
    result.append(end);
    result.append(')');
    return result.toString();
  }

} //STATISTIQUEImpl