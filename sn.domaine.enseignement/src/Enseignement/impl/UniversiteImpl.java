/**
 */
package Enseignement.impl;

import Enseignement.Departement;
import Enseignement.EnseignementPackage;
import Enseignement.Etudiant;
import Enseignement.Universite;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.impl.UniversiteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link Enseignement.impl.UniversiteImpl#getSigle <em>Sigle</em>}</li>
 *   <li>{@link Enseignement.impl.UniversiteImpl#getInscrits <em>Inscrits</em>}</li>
 *   <li>{@link Enseignement.impl.UniversiteImpl#getFacultes <em>Facultes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversiteImpl extends MinimalEObjectImpl.Container implements Universite {
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
	 * The default value of the '{@link #getSigle() <em>Sigle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigle()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSigle() <em>Sigle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigle()
	 * @generated
	 * @ordered
	 */
	protected String sigle = SIGLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInscrits() <em>Inscrits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInscrits()
	 * @generated
	 * @ordered
	 */
	protected EList<Etudiant> inscrits;

	/**
	 * The cached value of the '{@link #getFacultes() <em>Facultes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacultes()
	 * @generated
	 * @ordered
	 */
	protected EList<Departement> facultes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnseignementPackage.Literals.UNIVERSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.UNIVERSITE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSigle() {
		return sigle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigle(String newSigle) {
		String oldSigle = sigle;
		sigle = newSigle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.UNIVERSITE__SIGLE, oldSigle, sigle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Etudiant> getInscrits() {
		if (inscrits == null) {
			inscrits = new EObjectResolvingEList<Etudiant>(Etudiant.class, this, EnseignementPackage.UNIVERSITE__INSCRITS);
		}
		return inscrits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Departement> getFacultes() {
		if (facultes == null) {
			facultes = new EObjectResolvingEList<Departement>(Departement.class, this, EnseignementPackage.UNIVERSITE__FACULTES);
		}
		return facultes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnseignementPackage.UNIVERSITE__NOM:
				return getNom();
			case EnseignementPackage.UNIVERSITE__SIGLE:
				return getSigle();
			case EnseignementPackage.UNIVERSITE__INSCRITS:
				return getInscrits();
			case EnseignementPackage.UNIVERSITE__FACULTES:
				return getFacultes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EnseignementPackage.UNIVERSITE__NOM:
				setNom((String)newValue);
				return;
			case EnseignementPackage.UNIVERSITE__SIGLE:
				setSigle((String)newValue);
				return;
			case EnseignementPackage.UNIVERSITE__INSCRITS:
				getInscrits().clear();
				getInscrits().addAll((Collection<? extends Etudiant>)newValue);
				return;
			case EnseignementPackage.UNIVERSITE__FACULTES:
				getFacultes().clear();
				getFacultes().addAll((Collection<? extends Departement>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EnseignementPackage.UNIVERSITE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case EnseignementPackage.UNIVERSITE__SIGLE:
				setSigle(SIGLE_EDEFAULT);
				return;
			case EnseignementPackage.UNIVERSITE__INSCRITS:
				getInscrits().clear();
				return;
			case EnseignementPackage.UNIVERSITE__FACULTES:
				getFacultes().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EnseignementPackage.UNIVERSITE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case EnseignementPackage.UNIVERSITE__SIGLE:
				return SIGLE_EDEFAULT == null ? sigle != null : !SIGLE_EDEFAULT.equals(sigle);
			case EnseignementPackage.UNIVERSITE__INSCRITS:
				return inscrits != null && !inscrits.isEmpty();
			case EnseignementPackage.UNIVERSITE__FACULTES:
				return facultes != null && !facultes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", sigle: ");
		result.append(sigle);
		result.append(')');
		return result.toString();
	}

} //UniversiteImpl
