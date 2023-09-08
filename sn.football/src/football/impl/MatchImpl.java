/**
 */
package football.impl;

import football.Equipe;
import football.FootballPackage;
import football.Match;
import football.Tournoi;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football.impl.MatchImpl#isVictoire <em>Victoire</em>}</li>
 *   <li>{@link football.impl.MatchImpl#getAffronte <em>Affronte</em>}</li>
 *   <li>{@link football.impl.MatchImpl#getTournoi <em>Tournoi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #isVictoire() <em>Victoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVictoire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VICTOIRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVictoire() <em>Victoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVictoire()
	 * @generated
	 * @ordered
	 */
	protected boolean victoire = VICTOIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAffronte() <em>Affronte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffronte()
	 * @generated
	 * @ordered
	 */
	protected Equipe affronte;

	/**
	 * The cached value of the '{@link #getTournoi() <em>Tournoi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournoi()
	 * @generated
	 * @ordered
	 */
	protected Tournoi tournoi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FootballPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVictoire() {
		return victoire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictoire(boolean newVictoire) {
		boolean oldVictoire = victoire;
		victoire = newVictoire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FootballPackage.MATCH__VICTOIRE, oldVictoire, victoire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipe getAffronte() {
		if (affronte != null && affronte.eIsProxy()) {
			InternalEObject oldAffronte = (InternalEObject)affronte;
			affronte = (Equipe)eResolveProxy(oldAffronte);
			if (affronte != oldAffronte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FootballPackage.MATCH__AFFRONTE, oldAffronte, affronte));
			}
		}
		return affronte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipe basicGetAffronte() {
		return affronte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffronte(Equipe newAffronte, NotificationChain msgs) {
		Equipe oldAffronte = affronte;
		affronte = newAffronte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FootballPackage.MATCH__AFFRONTE, oldAffronte, newAffronte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffronte(Equipe newAffronte) {
		if (newAffronte != affronte) {
			NotificationChain msgs = null;
			if (affronte != null)
				msgs = ((InternalEObject)affronte).eInverseRemove(this, FootballPackage.EQUIPE__MATCH, Equipe.class, msgs);
			if (newAffronte != null)
				msgs = ((InternalEObject)newAffronte).eInverseAdd(this, FootballPackage.EQUIPE__MATCH, Equipe.class, msgs);
			msgs = basicSetAffronte(newAffronte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FootballPackage.MATCH__AFFRONTE, newAffronte, newAffronte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournoi getTournoi() {
		if (tournoi != null && tournoi.eIsProxy()) {
			InternalEObject oldTournoi = (InternalEObject)tournoi;
			tournoi = (Tournoi)eResolveProxy(oldTournoi);
			if (tournoi != oldTournoi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FootballPackage.MATCH__TOURNOI, oldTournoi, tournoi));
			}
		}
		return tournoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournoi basicGetTournoi() {
		return tournoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTournoi(Tournoi newTournoi, NotificationChain msgs) {
		Tournoi oldTournoi = tournoi;
		tournoi = newTournoi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FootballPackage.MATCH__TOURNOI, oldTournoi, newTournoi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTournoi(Tournoi newTournoi) {
		if (newTournoi != tournoi) {
			NotificationChain msgs = null;
			if (tournoi != null)
				msgs = ((InternalEObject)tournoi).eInverseRemove(this, FootballPackage.TOURNOI__MATCH, Tournoi.class, msgs);
			if (newTournoi != null)
				msgs = ((InternalEObject)newTournoi).eInverseAdd(this, FootballPackage.TOURNOI__MATCH, Tournoi.class, msgs);
			msgs = basicSetTournoi(newTournoi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FootballPackage.MATCH__TOURNOI, newTournoi, newTournoi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FootballPackage.MATCH__AFFRONTE:
				if (affronte != null)
					msgs = ((InternalEObject)affronte).eInverseRemove(this, FootballPackage.EQUIPE__MATCH, Equipe.class, msgs);
				return basicSetAffronte((Equipe)otherEnd, msgs);
			case FootballPackage.MATCH__TOURNOI:
				if (tournoi != null)
					msgs = ((InternalEObject)tournoi).eInverseRemove(this, FootballPackage.TOURNOI__MATCH, Tournoi.class, msgs);
				return basicSetTournoi((Tournoi)otherEnd, msgs);
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
			case FootballPackage.MATCH__AFFRONTE:
				return basicSetAffronte(null, msgs);
			case FootballPackage.MATCH__TOURNOI:
				return basicSetTournoi(null, msgs);
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
			case FootballPackage.MATCH__VICTOIRE:
				return isVictoire();
			case FootballPackage.MATCH__AFFRONTE:
				if (resolve) return getAffronte();
				return basicGetAffronte();
			case FootballPackage.MATCH__TOURNOI:
				if (resolve) return getTournoi();
				return basicGetTournoi();
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
			case FootballPackage.MATCH__VICTOIRE:
				setVictoire((Boolean)newValue);
				return;
			case FootballPackage.MATCH__AFFRONTE:
				setAffronte((Equipe)newValue);
				return;
			case FootballPackage.MATCH__TOURNOI:
				setTournoi((Tournoi)newValue);
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
			case FootballPackage.MATCH__VICTOIRE:
				setVictoire(VICTOIRE_EDEFAULT);
				return;
			case FootballPackage.MATCH__AFFRONTE:
				setAffronte((Equipe)null);
				return;
			case FootballPackage.MATCH__TOURNOI:
				setTournoi((Tournoi)null);
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
			case FootballPackage.MATCH__VICTOIRE:
				return victoire != VICTOIRE_EDEFAULT;
			case FootballPackage.MATCH__AFFRONTE:
				return affronte != null;
			case FootballPackage.MATCH__TOURNOI:
				return tournoi != null;
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
		result.append(" (victoire: ");
		result.append(victoire);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
