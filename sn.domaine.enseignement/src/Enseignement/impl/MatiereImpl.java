/**
 */
package Enseignement.impl;

import Enseignement.Enseignant;
import Enseignement.EnseignementPackage;
import Enseignement.Matiere;
import Enseignement.Note;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matiere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.impl.MatiereImpl#getHeure <em>Heure</em>}</li>
 *   <li>{@link Enseignement.impl.MatiereImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link Enseignement.impl.MatiereImpl#getResultats <em>Resultats</em>}</li>
 *   <li>{@link Enseignement.impl.MatiereImpl#getSpecialistes <em>Specialistes</em>}</li>
 *   <li>{@link Enseignement.impl.MatiereImpl#getProf <em>Prof</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatiereImpl extends MinimalEObjectImpl.Container implements Matiere {
	/**
	 * The default value of the '{@link #getHeure() <em>Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeure()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeure() <em>Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeure()
	 * @generated
	 * @ordered
	 */
	protected int heure = HEURE_EDEFAULT;

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
	 * The cached value of the '{@link #getResultats() <em>Resultats</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultats()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> resultats;

	/**
	 * The cached value of the '{@link #getSpecialistes() <em>Specialistes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialistes()
	 * @generated
	 * @ordered
	 */
	protected EList<Enseignant> specialistes;

	/**
	 * The cached value of the '{@link #getProf() <em>Prof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProf()
	 * @generated
	 * @ordered
	 */
	protected Enseignant prof;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatiereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnseignementPackage.Literals.MATIERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeure() {
		return heure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeure(int newHeure) {
		int oldHeure = heure;
		heure = newHeure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.MATIERE__HEURE, oldHeure, heure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.MATIERE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getResultats() {
		if (resultats == null) {
			resultats = new EObjectWithInverseResolvingEList<Note>(Note.class, this, EnseignementPackage.MATIERE__RESULTATS, EnseignementPackage.NOTE__MATIERE);
		}
		return resultats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enseignant> getSpecialistes() {
		if (specialistes == null) {
			specialistes = new EObjectWithInverseResolvingEList.ManyInverse<Enseignant>(Enseignant.class, this, EnseignementPackage.MATIERE__SPECIALISTES, EnseignementPackage.ENSEIGNANT__SPECIALISATIONS);
		}
		return specialistes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant getProf() {
		if (prof != null && prof.eIsProxy()) {
			InternalEObject oldProf = (InternalEObject)prof;
			prof = (Enseignant)eResolveProxy(oldProf);
			if (prof != oldProf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnseignementPackage.MATIERE__PROF, oldProf, prof));
			}
		}
		return prof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant basicGetProf() {
		return prof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProf(Enseignant newProf, NotificationChain msgs) {
		Enseignant oldProf = prof;
		prof = newProf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnseignementPackage.MATIERE__PROF, oldProf, newProf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProf(Enseignant newProf) {
		if (newProf != prof) {
			NotificationChain msgs = null;
			if (prof != null)
				msgs = ((InternalEObject)prof).eInverseRemove(this, EnseignementPackage.ENSEIGNANT__ENSEIGNEMENTS, Enseignant.class, msgs);
			if (newProf != null)
				msgs = ((InternalEObject)newProf).eInverseAdd(this, EnseignementPackage.ENSEIGNANT__ENSEIGNEMENTS, Enseignant.class, msgs);
			msgs = basicSetProf(newProf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.MATIERE__PROF, newProf, newProf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnseignementPackage.MATIERE__RESULTATS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResultats()).basicAdd(otherEnd, msgs);
			case EnseignementPackage.MATIERE__SPECIALISTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecialistes()).basicAdd(otherEnd, msgs);
			case EnseignementPackage.MATIERE__PROF:
				if (prof != null)
					msgs = ((InternalEObject)prof).eInverseRemove(this, EnseignementPackage.ENSEIGNANT__ENSEIGNEMENTS, Enseignant.class, msgs);
				return basicSetProf((Enseignant)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnseignementPackage.MATIERE__RESULTATS:
				return ((InternalEList<?>)getResultats()).basicRemove(otherEnd, msgs);
			case EnseignementPackage.MATIERE__SPECIALISTES:
				return ((InternalEList<?>)getSpecialistes()).basicRemove(otherEnd, msgs);
			case EnseignementPackage.MATIERE__PROF:
				return basicSetProf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnseignementPackage.MATIERE__HEURE:
				return getHeure();
			case EnseignementPackage.MATIERE__NOM:
				return getNom();
			case EnseignementPackage.MATIERE__RESULTATS:
				return getResultats();
			case EnseignementPackage.MATIERE__SPECIALISTES:
				return getSpecialistes();
			case EnseignementPackage.MATIERE__PROF:
				if (resolve) return getProf();
				return basicGetProf();
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
			case EnseignementPackage.MATIERE__HEURE:
				setHeure((Integer)newValue);
				return;
			case EnseignementPackage.MATIERE__NOM:
				setNom((String)newValue);
				return;
			case EnseignementPackage.MATIERE__RESULTATS:
				getResultats().clear();
				getResultats().addAll((Collection<? extends Note>)newValue);
				return;
			case EnseignementPackage.MATIERE__SPECIALISTES:
				getSpecialistes().clear();
				getSpecialistes().addAll((Collection<? extends Enseignant>)newValue);
				return;
			case EnseignementPackage.MATIERE__PROF:
				setProf((Enseignant)newValue);
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
			case EnseignementPackage.MATIERE__HEURE:
				setHeure(HEURE_EDEFAULT);
				return;
			case EnseignementPackage.MATIERE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case EnseignementPackage.MATIERE__RESULTATS:
				getResultats().clear();
				return;
			case EnseignementPackage.MATIERE__SPECIALISTES:
				getSpecialistes().clear();
				return;
			case EnseignementPackage.MATIERE__PROF:
				setProf((Enseignant)null);
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
			case EnseignementPackage.MATIERE__HEURE:
				return heure != HEURE_EDEFAULT;
			case EnseignementPackage.MATIERE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case EnseignementPackage.MATIERE__RESULTATS:
				return resultats != null && !resultats.isEmpty();
			case EnseignementPackage.MATIERE__SPECIALISTES:
				return specialistes != null && !specialistes.isEmpty();
			case EnseignementPackage.MATIERE__PROF:
				return prof != null;
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
		result.append(" (heure: ");
		result.append(heure);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //MatiereImpl
