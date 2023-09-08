/**
 */
package football.impl;

import football.Equipe;
import football.FootballPackage;
import football.Joueur;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joueur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football.impl.JoueurImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link football.impl.JoueurImpl#getAge <em>Age</em>}</li>
 *   <li>{@link football.impl.JoueurImpl#getEquipe <em>Equipe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoueurImpl extends MinimalEObjectImpl.Container implements Joueur {
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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquipe() <em>Equipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipe()
	 * @generated
	 * @ordered
	 */
	protected Equipe equipe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoueurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FootballPackage.Literals.JOUEUR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FootballPackage.JOUEUR__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FootballPackage.JOUEUR__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipe getEquipe() {
		if (equipe != null && equipe.eIsProxy()) {
			InternalEObject oldEquipe = (InternalEObject)equipe;
			equipe = (Equipe)eResolveProxy(oldEquipe);
			if (equipe != oldEquipe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FootballPackage.JOUEUR__EQUIPE, oldEquipe, equipe));
			}
		}
		return equipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipe basicGetEquipe() {
		return equipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquipe(Equipe newEquipe, NotificationChain msgs) {
		Equipe oldEquipe = equipe;
		equipe = newEquipe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FootballPackage.JOUEUR__EQUIPE, oldEquipe, newEquipe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipe(Equipe newEquipe) {
		if (newEquipe != equipe) {
			NotificationChain msgs = null;
			if (equipe != null)
				msgs = ((InternalEObject)equipe).eInverseRemove(this, FootballPackage.EQUIPE__JOUEUR, Equipe.class, msgs);
			if (newEquipe != null)
				msgs = ((InternalEObject)newEquipe).eInverseAdd(this, FootballPackage.EQUIPE__JOUEUR, Equipe.class, msgs);
			msgs = basicSetEquipe(newEquipe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FootballPackage.JOUEUR__EQUIPE, newEquipe, newEquipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FootballPackage.JOUEUR__EQUIPE:
				if (equipe != null)
					msgs = ((InternalEObject)equipe).eInverseRemove(this, FootballPackage.EQUIPE__JOUEUR, Equipe.class, msgs);
				return basicSetEquipe((Equipe)otherEnd, msgs);
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
			case FootballPackage.JOUEUR__EQUIPE:
				return basicSetEquipe(null, msgs);
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
			case FootballPackage.JOUEUR__NOM:
				return getNom();
			case FootballPackage.JOUEUR__AGE:
				return getAge();
			case FootballPackage.JOUEUR__EQUIPE:
				if (resolve) return getEquipe();
				return basicGetEquipe();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FootballPackage.JOUEUR__NOM:
				setNom((String)newValue);
				return;
			case FootballPackage.JOUEUR__AGE:
				setAge((Integer)newValue);
				return;
			case FootballPackage.JOUEUR__EQUIPE:
				setEquipe((Equipe)newValue);
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
			case FootballPackage.JOUEUR__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case FootballPackage.JOUEUR__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case FootballPackage.JOUEUR__EQUIPE:
				setEquipe((Equipe)null);
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
			case FootballPackage.JOUEUR__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case FootballPackage.JOUEUR__AGE:
				return age != AGE_EDEFAULT;
			case FootballPackage.JOUEUR__EQUIPE:
				return equipe != null;
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
		result.append(", age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} //JoueurImpl
