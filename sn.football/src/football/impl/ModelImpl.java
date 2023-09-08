/**
 */
package football.impl;

import football.Equipe;
import football.FootballPackage;
import football.Joueur;
import football.Match;
import football.Model;
import football.Tournoi;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football.impl.ModelImpl#getTournois <em>Tournois</em>}</li>
 *   <li>{@link football.impl.ModelImpl#getJoueurs <em>Joueurs</em>}</li>
 *   <li>{@link football.impl.ModelImpl#getMatchs <em>Matchs</em>}</li>
 *   <li>{@link football.impl.ModelImpl#getEquipes <em>Equipes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getTournois() <em>Tournois</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournois()
	 * @generated
	 * @ordered
	 */
	protected EList<Tournoi> tournois;

	/**
	 * The cached value of the '{@link #getJoueurs() <em>Joueurs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoueurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Joueur> joueurs;

	/**
	 * The cached value of the '{@link #getMatchs() <em>Matchs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchs()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matchs;

	/**
	 * The cached value of the '{@link #getEquipes() <em>Equipes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipes()
	 * @generated
	 * @ordered
	 */
	protected EList<Equipe> equipes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FootballPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tournoi> getTournois() {
		if (tournois == null) {
			tournois = new EObjectContainmentEList<Tournoi>(Tournoi.class, this, FootballPackage.MODEL__TOURNOIS);
		}
		return tournois;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Joueur> getJoueurs() {
		if (joueurs == null) {
			joueurs = new EObjectContainmentEList<Joueur>(Joueur.class, this, FootballPackage.MODEL__JOUEURS);
		}
		return joueurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatchs() {
		if (matchs == null) {
			matchs = new EObjectResolvingEList<Match>(Match.class, this, FootballPackage.MODEL__MATCHS);
		}
		return matchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Equipe> getEquipes() {
		if (equipes == null) {
			equipes = new EObjectContainmentEList<Equipe>(Equipe.class, this, FootballPackage.MODEL__EQUIPES);
		}
		return equipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FootballPackage.MODEL__TOURNOIS:
				return ((InternalEList<?>)getTournois()).basicRemove(otherEnd, msgs);
			case FootballPackage.MODEL__JOUEURS:
				return ((InternalEList<?>)getJoueurs()).basicRemove(otherEnd, msgs);
			case FootballPackage.MODEL__EQUIPES:
				return ((InternalEList<?>)getEquipes()).basicRemove(otherEnd, msgs);
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
			case FootballPackage.MODEL__TOURNOIS:
				return getTournois();
			case FootballPackage.MODEL__JOUEURS:
				return getJoueurs();
			case FootballPackage.MODEL__MATCHS:
				return getMatchs();
			case FootballPackage.MODEL__EQUIPES:
				return getEquipes();
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
			case FootballPackage.MODEL__TOURNOIS:
				getTournois().clear();
				getTournois().addAll((Collection<? extends Tournoi>)newValue);
				return;
			case FootballPackage.MODEL__JOUEURS:
				getJoueurs().clear();
				getJoueurs().addAll((Collection<? extends Joueur>)newValue);
				return;
			case FootballPackage.MODEL__MATCHS:
				getMatchs().clear();
				getMatchs().addAll((Collection<? extends Match>)newValue);
				return;
			case FootballPackage.MODEL__EQUIPES:
				getEquipes().clear();
				getEquipes().addAll((Collection<? extends Equipe>)newValue);
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
			case FootballPackage.MODEL__TOURNOIS:
				getTournois().clear();
				return;
			case FootballPackage.MODEL__JOUEURS:
				getJoueurs().clear();
				return;
			case FootballPackage.MODEL__MATCHS:
				getMatchs().clear();
				return;
			case FootballPackage.MODEL__EQUIPES:
				getEquipes().clear();
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
			case FootballPackage.MODEL__TOURNOIS:
				return tournois != null && !tournois.isEmpty();
			case FootballPackage.MODEL__JOUEURS:
				return joueurs != null && !joueurs.isEmpty();
			case FootballPackage.MODEL__MATCHS:
				return matchs != null && !matchs.isEmpty();
			case FootballPackage.MODEL__EQUIPES:
				return equipes != null && !equipes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
