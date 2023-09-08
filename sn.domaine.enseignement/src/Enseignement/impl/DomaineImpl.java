/**
 */
package Enseignement.impl;

import Enseignement.Departement;
import Enseignement.Domaine;
import Enseignement.Enseignant;
import Enseignement.EnseignementPackage;
import Enseignement.Etudiant;
import Enseignement.Matiere;
import Enseignement.Note;
import Enseignement.Universite;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domaine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.impl.DomaineImpl#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link Enseignement.impl.DomaineImpl#getDepartements <em>Departements</em>}</li>
 *   <li>{@link Enseignement.impl.DomaineImpl#getUniversites <em>Universites</em>}</li>
 *   <li>{@link Enseignement.impl.DomaineImpl#getEtudiants <em>Etudiants</em>}</li>
 *   <li>{@link Enseignement.impl.DomaineImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link Enseignement.impl.DomaineImpl#getMatieres <em>Matieres</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomaineImpl extends MinimalEObjectImpl.Container implements Domaine {
	/**
	 * The cached value of the '{@link #getEnseignants() <em>Enseignants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseignants()
	 * @generated
	 * @ordered
	 */
	protected EList<Enseignant> enseignants;

	/**
	 * The cached value of the '{@link #getDepartements() <em>Departements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartements()
	 * @generated
	 * @ordered
	 */
	protected EList<Departement> departements;

	/**
	 * The cached value of the '{@link #getUniversites() <em>Universites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversites()
	 * @generated
	 * @ordered
	 */
	protected EList<Universite> universites;

	/**
	 * The cached value of the '{@link #getEtudiants() <em>Etudiants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtudiants()
	 * @generated
	 * @ordered
	 */
	protected EList<Etudiant> etudiants;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> notes;

	/**
	 * The cached value of the '{@link #getMatieres() <em>Matieres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatieres()
	 * @generated
	 * @ordered
	 */
	protected EList<Matiere> matieres;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomaineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnseignementPackage.Literals.DOMAINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enseignant> getEnseignants() {
		if (enseignants == null) {
			enseignants = new EObjectContainmentEList<Enseignant>(Enseignant.class, this, EnseignementPackage.DOMAINE__ENSEIGNANTS);
		}
		return enseignants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Departement> getDepartements() {
		if (departements == null) {
			departements = new EObjectContainmentEList<Departement>(Departement.class, this, EnseignementPackage.DOMAINE__DEPARTEMENTS);
		}
		return departements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Universite> getUniversites() {
		if (universites == null) {
			universites = new EObjectContainmentEList<Universite>(Universite.class, this, EnseignementPackage.DOMAINE__UNIVERSITES);
		}
		return universites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Etudiant> getEtudiants() {
		if (etudiants == null) {
			etudiants = new EObjectContainmentEList<Etudiant>(Etudiant.class, this, EnseignementPackage.DOMAINE__ETUDIANTS);
		}
		return etudiants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Note>(Note.class, this, EnseignementPackage.DOMAINE__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matiere> getMatieres() {
		if (matieres == null) {
			matieres = new EObjectContainmentEList<Matiere>(Matiere.class, this, EnseignementPackage.DOMAINE__MATIERES);
		}
		return matieres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnseignementPackage.DOMAINE__ENSEIGNANTS:
				return ((InternalEList<?>)getEnseignants()).basicRemove(otherEnd, msgs);
			case EnseignementPackage.DOMAINE__DEPARTEMENTS:
				return ((InternalEList<?>)getDepartements()).basicRemove(otherEnd, msgs);
			case EnseignementPackage.DOMAINE__UNIVERSITES:
				return ((InternalEList<?>)getUniversites()).basicRemove(otherEnd, msgs);
			case EnseignementPackage.DOMAINE__ETUDIANTS:
				return ((InternalEList<?>)getEtudiants()).basicRemove(otherEnd, msgs);
			case EnseignementPackage.DOMAINE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case EnseignementPackage.DOMAINE__MATIERES:
				return ((InternalEList<?>)getMatieres()).basicRemove(otherEnd, msgs);
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
			case EnseignementPackage.DOMAINE__ENSEIGNANTS:
				return getEnseignants();
			case EnseignementPackage.DOMAINE__DEPARTEMENTS:
				return getDepartements();
			case EnseignementPackage.DOMAINE__UNIVERSITES:
				return getUniversites();
			case EnseignementPackage.DOMAINE__ETUDIANTS:
				return getEtudiants();
			case EnseignementPackage.DOMAINE__NOTES:
				return getNotes();
			case EnseignementPackage.DOMAINE__MATIERES:
				return getMatieres();
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
			case EnseignementPackage.DOMAINE__ENSEIGNANTS:
				getEnseignants().clear();
				getEnseignants().addAll((Collection<? extends Enseignant>)newValue);
				return;
			case EnseignementPackage.DOMAINE__DEPARTEMENTS:
				getDepartements().clear();
				getDepartements().addAll((Collection<? extends Departement>)newValue);
				return;
			case EnseignementPackage.DOMAINE__UNIVERSITES:
				getUniversites().clear();
				getUniversites().addAll((Collection<? extends Universite>)newValue);
				return;
			case EnseignementPackage.DOMAINE__ETUDIANTS:
				getEtudiants().clear();
				getEtudiants().addAll((Collection<? extends Etudiant>)newValue);
				return;
			case EnseignementPackage.DOMAINE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Note>)newValue);
				return;
			case EnseignementPackage.DOMAINE__MATIERES:
				getMatieres().clear();
				getMatieres().addAll((Collection<? extends Matiere>)newValue);
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
			case EnseignementPackage.DOMAINE__ENSEIGNANTS:
				getEnseignants().clear();
				return;
			case EnseignementPackage.DOMAINE__DEPARTEMENTS:
				getDepartements().clear();
				return;
			case EnseignementPackage.DOMAINE__UNIVERSITES:
				getUniversites().clear();
				return;
			case EnseignementPackage.DOMAINE__ETUDIANTS:
				getEtudiants().clear();
				return;
			case EnseignementPackage.DOMAINE__NOTES:
				getNotes().clear();
				return;
			case EnseignementPackage.DOMAINE__MATIERES:
				getMatieres().clear();
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
			case EnseignementPackage.DOMAINE__ENSEIGNANTS:
				return enseignants != null && !enseignants.isEmpty();
			case EnseignementPackage.DOMAINE__DEPARTEMENTS:
				return departements != null && !departements.isEmpty();
			case EnseignementPackage.DOMAINE__UNIVERSITES:
				return universites != null && !universites.isEmpty();
			case EnseignementPackage.DOMAINE__ETUDIANTS:
				return etudiants != null && !etudiants.isEmpty();
			case EnseignementPackage.DOMAINE__NOTES:
				return notes != null && !notes.isEmpty();
			case EnseignementPackage.DOMAINE__MATIERES:
				return matieres != null && !matieres.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomaineImpl
