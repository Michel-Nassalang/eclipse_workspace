/**
 */
package football.impl;

import football.Equipe;
import football.FootballPackage;
import football.FootballTables;
import football.Joueur;
import football.Match;
import football.Tournoi;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football.impl.EquipeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link football.impl.EquipeImpl#isPro <em>Pro</em>}</li>
 *   <li>{@link football.impl.EquipeImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link football.impl.EquipeImpl#getJoueur <em>Joueur</em>}</li>
 *   <li>{@link football.impl.EquipeImpl#getTournoi <em>Tournoi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipeImpl extends MinimalEObjectImpl.Container implements Equipe {
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
	 * The default value of the '{@link #isPro() <em>Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPro()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPro() <em>Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPro()
	 * @generated
	 * @ordered
	 */
	protected boolean pro = PRO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> match;

	/**
	 * The cached value of the '{@link #getJoueur() <em>Joueur</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoueur()
	 * @generated
	 * @ordered
	 */
	protected EList<Joueur> joueur;

	/**
	 * The cached value of the '{@link #getTournoi() <em>Tournoi</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTournoi()
	 * @generated
	 * @ordered
	 */
	protected EList<Tournoi> tournoi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FootballPackage.Literals.EQUIPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FootballPackage.EQUIPE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPro() {
		return pro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPro(boolean newPro) {
		boolean oldPro = pro;
		pro = newPro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FootballPackage.EQUIPE__PRO, oldPro, pro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatch() {
		if (match == null) {
			match = new EObjectWithInverseResolvingEList<Match>(Match.class, this, FootballPackage.EQUIPE__MATCH, FootballPackage.MATCH__AFFRONTE);
		}
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Joueur> getJoueur() {
		if (joueur == null) {
			joueur = new EObjectWithInverseResolvingEList<Joueur>(Joueur.class, this, FootballPackage.EQUIPE__JOUEUR, FootballPackage.JOUEUR__EQUIPE);
		}
		return joueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tournoi> getTournoi() {
		if (tournoi == null) {
			tournoi = new EObjectResolvingEList<Tournoi>(Tournoi.class, this, FootballPackage.EQUIPE__TOURNOI);
		}
		return tournoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean q1(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Equipe::q1";
		try {
			/**
			 *
			 * inv q1:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = pro implies
			 *         joueur->collect(age)
			 *         ->select(age | age < 18)
			 *         ->isEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, FootballPackage.Literals.EQUIPE___Q1__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, FootballTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ boolean pro = this.isPro();
				final /*@NonInvalid*/ Boolean result;
				if (!pro) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ List<Joueur> joueur = this.getJoueur();
					final /*@NonInvalid*/ OrderedSetValue BOXED_joueur = idResolver.createOrderedSetOfAll(FootballTables.ORD_CLSSid_Joueur_0, joueur);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(FootballTables.SEQ_DATAid_EInt);
					Iterator<Object> ITERATOR__1 = BOXED_joueur.iterator();
					/*@NonInvalid*/ SequenceValue collect;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							collect = accumulator;
							break;
						}
						/*@NonInvalid*/ Joueur _1 = (Joueur)ITERATOR__1.next();
						/**
						 * age
						 */
						final /*@NonInvalid*/ int age = _1.getAge();
						final /*@NonInvalid*/ IntegerValue BOXED_age = ValueUtil.integerValueOf(age);
						//
						accumulator.add(BOXED_age);
					}
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(FootballTables.SEQ_DATAid_EInt);
					Iterator<Object> ITERATOR_age_0 = collect.iterator();
					/*@NonInvalid*/ SequenceValue select;
					while (true) {
						if (!ITERATOR_age_0.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ IntegerValue age_0 = (IntegerValue)ITERATOR_age_0.next();
						/**
						 * age < 18
						 */
						final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, age_0, FootballTables.INT_18).booleanValue();
						//
						if (lt) {
							accumulator_0.add(age_0);
						}
					}
					final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(select).booleanValue();
					if (isEmpty) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, FootballTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean q3(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Equipe::q3";
		try {
			/**
			 *
			 * inv q3:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = pro implies
			 *         match->forAll(affronte.pro)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, FootballPackage.Literals.EQUIPE___Q3__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, FootballTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ boolean pro = this.isPro();
					final /*@Thrown*/ Boolean result;
					if (!pro) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<Match> match = this.getMatch();
						final /*@NonInvalid*/ OrderedSetValue BOXED_match = idResolver.createOrderedSetOfAll(FootballTables.ORD_CLSSid_Match, match);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR__1 = BOXED_match.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR__1.hasNext()) {
								if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								}
								else {
									throw (InvalidValueException)accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Match _1 = (Match)ITERATOR__1.next();
							/**
							 * affronte.pro
							 */
							final /*@NonInvalid*/ Equipe affronte = _1.getAffronte();
							final /*@NonInvalid*/ boolean pro_0 = affronte.isPro();
							//
							if (!pro_0) {					// Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (pro_0) {				// Normal successful body evaluation result
								;															// Carry on
							}
							else {															// Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (forAll == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, FootballTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
			case FootballPackage.EQUIPE__MATCH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatch()).basicAdd(otherEnd, msgs);
			case FootballPackage.EQUIPE__JOUEUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJoueur()).basicAdd(otherEnd, msgs);
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
			case FootballPackage.EQUIPE__MATCH:
				return ((InternalEList<?>)getMatch()).basicRemove(otherEnd, msgs);
			case FootballPackage.EQUIPE__JOUEUR:
				return ((InternalEList<?>)getJoueur()).basicRemove(otherEnd, msgs);
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
			case FootballPackage.EQUIPE__NOM:
				return getNom();
			case FootballPackage.EQUIPE__PRO:
				return isPro();
			case FootballPackage.EQUIPE__MATCH:
				return getMatch();
			case FootballPackage.EQUIPE__JOUEUR:
				return getJoueur();
			case FootballPackage.EQUIPE__TOURNOI:
				return getTournoi();
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
			case FootballPackage.EQUIPE__NOM:
				setNom((String)newValue);
				return;
			case FootballPackage.EQUIPE__PRO:
				setPro((Boolean)newValue);
				return;
			case FootballPackage.EQUIPE__MATCH:
				getMatch().clear();
				getMatch().addAll((Collection<? extends Match>)newValue);
				return;
			case FootballPackage.EQUIPE__JOUEUR:
				getJoueur().clear();
				getJoueur().addAll((Collection<? extends Joueur>)newValue);
				return;
			case FootballPackage.EQUIPE__TOURNOI:
				getTournoi().clear();
				getTournoi().addAll((Collection<? extends Tournoi>)newValue);
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
			case FootballPackage.EQUIPE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case FootballPackage.EQUIPE__PRO:
				setPro(PRO_EDEFAULT);
				return;
			case FootballPackage.EQUIPE__MATCH:
				getMatch().clear();
				return;
			case FootballPackage.EQUIPE__JOUEUR:
				getJoueur().clear();
				return;
			case FootballPackage.EQUIPE__TOURNOI:
				getTournoi().clear();
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
			case FootballPackage.EQUIPE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case FootballPackage.EQUIPE__PRO:
				return pro != PRO_EDEFAULT;
			case FootballPackage.EQUIPE__MATCH:
				return match != null && !match.isEmpty();
			case FootballPackage.EQUIPE__JOUEUR:
				return joueur != null && !joueur.isEmpty();
			case FootballPackage.EQUIPE__TOURNOI:
				return tournoi != null && !tournoi.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FootballPackage.EQUIPE___Q1__DIAGNOSTICCHAIN_MAP:
				return q1((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FootballPackage.EQUIPE___Q3__DIAGNOSTICCHAIN_MAP:
				return q3((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", pro: ");
		result.append(pro);
		result.append(')');
		return result.toString();
	}

} //EquipeImpl
