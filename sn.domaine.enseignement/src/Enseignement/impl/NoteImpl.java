/**
 */
package Enseignement.impl;

import Enseignement.EnseignementPackage;
import Enseignement.Etudiant;
import Enseignement.Matiere;
import Enseignement.Note;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.impl.NoteImpl#getDate <em>Date</em>}</li>
 *   <li>{@link Enseignement.impl.NoteImpl#getIdNote <em>Id Note</em>}</li>
 *   <li>{@link Enseignement.impl.NoteImpl#getVal <em>Val</em>}</li>
 *   <li>{@link Enseignement.impl.NoteImpl#getMatiere <em>Matiere</em>}</li>
 *   <li>{@link Enseignement.impl.NoteImpl#getEtudiant <em>Etudiant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends MinimalEObjectImpl.Container implements Note {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdNote() <em>Id Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNote()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_NOTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdNote() <em>Id Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNote()
	 * @generated
	 * @ordered
	 */
	protected int idNote = ID_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected static final double VAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVal()
	 * @generated
	 * @ordered
	 */
	protected double val = VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatiere() <em>Matiere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatiere()
	 * @generated
	 * @ordered
	 */
	protected Matiere matiere;

	/**
	 * The cached value of the '{@link #getEtudiant() <em>Etudiant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtudiant()
	 * @generated
	 * @ordered
	 */
	protected Etudiant etudiant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnseignementPackage.Literals.NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.NOTE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdNote() {
		return idNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdNote(int newIdNote) {
		int oldIdNote = idNote;
		idNote = newIdNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.NOTE__ID_NOTE, oldIdNote, idNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVal() {
		return val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal(double newVal) {
		double oldVal = val;
		val = newVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.NOTE__VAL, oldVal, val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matiere getMatiere() {
		if (matiere != null && matiere.eIsProxy()) {
			InternalEObject oldMatiere = (InternalEObject)matiere;
			matiere = (Matiere)eResolveProxy(oldMatiere);
			if (matiere != oldMatiere) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnseignementPackage.NOTE__MATIERE, oldMatiere, matiere));
			}
		}
		return matiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matiere basicGetMatiere() {
		return matiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatiere(Matiere newMatiere, NotificationChain msgs) {
		Matiere oldMatiere = matiere;
		matiere = newMatiere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnseignementPackage.NOTE__MATIERE, oldMatiere, newMatiere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatiere(Matiere newMatiere) {
		if (newMatiere != matiere) {
			NotificationChain msgs = null;
			if (matiere != null)
				msgs = ((InternalEObject)matiere).eInverseRemove(this, EnseignementPackage.MATIERE__RESULTATS, Matiere.class, msgs);
			if (newMatiere != null)
				msgs = ((InternalEObject)newMatiere).eInverseAdd(this, EnseignementPackage.MATIERE__RESULTATS, Matiere.class, msgs);
			msgs = basicSetMatiere(newMatiere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.NOTE__MATIERE, newMatiere, newMatiere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etudiant getEtudiant() {
		if (etudiant != null && etudiant.eIsProxy()) {
			InternalEObject oldEtudiant = (InternalEObject)etudiant;
			etudiant = (Etudiant)eResolveProxy(oldEtudiant);
			if (etudiant != oldEtudiant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnseignementPackage.NOTE__ETUDIANT, oldEtudiant, etudiant));
			}
		}
		return etudiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etudiant basicGetEtudiant() {
		return etudiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtudiant(Etudiant newEtudiant, NotificationChain msgs) {
		Etudiant oldEtudiant = etudiant;
		etudiant = newEtudiant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnseignementPackage.NOTE__ETUDIANT, oldEtudiant, newEtudiant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtudiant(Etudiant newEtudiant) {
		if (newEtudiant != etudiant) {
			NotificationChain msgs = null;
			if (etudiant != null)
				msgs = ((InternalEObject)etudiant).eInverseRemove(this, EnseignementPackage.ETUDIANT__RESULTATS, Etudiant.class, msgs);
			if (newEtudiant != null)
				msgs = ((InternalEObject)newEtudiant).eInverseAdd(this, EnseignementPackage.ETUDIANT__RESULTATS, Etudiant.class, msgs);
			msgs = basicSetEtudiant(newEtudiant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.NOTE__ETUDIANT, newEtudiant, newEtudiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnseignementPackage.NOTE__MATIERE:
				if (matiere != null)
					msgs = ((InternalEObject)matiere).eInverseRemove(this, EnseignementPackage.MATIERE__RESULTATS, Matiere.class, msgs);
				return basicSetMatiere((Matiere)otherEnd, msgs);
			case EnseignementPackage.NOTE__ETUDIANT:
				if (etudiant != null)
					msgs = ((InternalEObject)etudiant).eInverseRemove(this, EnseignementPackage.ETUDIANT__RESULTATS, Etudiant.class, msgs);
				return basicSetEtudiant((Etudiant)otherEnd, msgs);
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
			case EnseignementPackage.NOTE__MATIERE:
				return basicSetMatiere(null, msgs);
			case EnseignementPackage.NOTE__ETUDIANT:
				return basicSetEtudiant(null, msgs);
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
			case EnseignementPackage.NOTE__DATE:
				return getDate();
			case EnseignementPackage.NOTE__ID_NOTE:
				return getIdNote();
			case EnseignementPackage.NOTE__VAL:
				return getVal();
			case EnseignementPackage.NOTE__MATIERE:
				if (resolve) return getMatiere();
				return basicGetMatiere();
			case EnseignementPackage.NOTE__ETUDIANT:
				if (resolve) return getEtudiant();
				return basicGetEtudiant();
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
			case EnseignementPackage.NOTE__DATE:
				setDate((Date)newValue);
				return;
			case EnseignementPackage.NOTE__ID_NOTE:
				setIdNote((Integer)newValue);
				return;
			case EnseignementPackage.NOTE__VAL:
				setVal((Double)newValue);
				return;
			case EnseignementPackage.NOTE__MATIERE:
				setMatiere((Matiere)newValue);
				return;
			case EnseignementPackage.NOTE__ETUDIANT:
				setEtudiant((Etudiant)newValue);
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
			case EnseignementPackage.NOTE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case EnseignementPackage.NOTE__ID_NOTE:
				setIdNote(ID_NOTE_EDEFAULT);
				return;
			case EnseignementPackage.NOTE__VAL:
				setVal(VAL_EDEFAULT);
				return;
			case EnseignementPackage.NOTE__MATIERE:
				setMatiere((Matiere)null);
				return;
			case EnseignementPackage.NOTE__ETUDIANT:
				setEtudiant((Etudiant)null);
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
			case EnseignementPackage.NOTE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case EnseignementPackage.NOTE__ID_NOTE:
				return idNote != ID_NOTE_EDEFAULT;
			case EnseignementPackage.NOTE__VAL:
				return val != VAL_EDEFAULT;
			case EnseignementPackage.NOTE__MATIERE:
				return matiere != null;
			case EnseignementPackage.NOTE__ETUDIANT:
				return etudiant != null;
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
		result.append(" (date: ");
		result.append(date);
		result.append(", idNote: ");
		result.append(idNote);
		result.append(", val: ");
		result.append(val);
		result.append(')');
		return result.toString();
	}

} //NoteImpl
