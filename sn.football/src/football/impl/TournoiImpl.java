/**
 */
package football.impl;

import football.Equipe;
import football.FootballPackage;
import football.FootballTables;
import football.Match;
import football.Tournoi;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
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

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tournoi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football.impl.TournoiImpl#getDate <em>Date</em>}</li>
 *   <li>{@link football.impl.TournoiImpl#isTpro <em>Tpro</em>}</li>
 *   <li>{@link football.impl.TournoiImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link football.impl.TournoiImpl#getEquipe <em>Equipe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TournoiImpl extends MinimalEObjectImpl.Container implements Tournoi {
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
	 * The default value of the '{@link #isTpro() <em>Tpro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTpro()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TPRO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTpro() <em>Tpro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTpro()
	 * @generated
	 * @ordered
	 */
	protected boolean tpro = TPRO_EDEFAULT;

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
	 * The cached value of the '{@link #getEquipe() <em>Equipe</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipe()
	 * @generated
	 * @ordered
	 */
	protected EList<Equipe> equipe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TournoiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FootballPackage.Literals.TOURNOI;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FootballPackage.TOURNOI__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTpro() {
		return tpro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTpro(boolean newTpro) {
		boolean oldTpro = tpro;
		tpro = newTpro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FootballPackage.TOURNOI__TPRO, oldTpro, tpro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatch() {
		if (match == null) {
			match = new EObjectWithInverseResolvingEList<Match>(Match.class, this, FootballPackage.TOURNOI__MATCH, FootballPackage.MATCH__TOURNOI);
		}
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Equipe> getEquipe() {
		if (equipe == null) {
			equipe = new EObjectResolvingEList<Equipe>(Equipe.class, this, FootballPackage.TOURNOI__EQUIPE);
		}
		return equipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean q2(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Tournoi::q2";
		try {
			/**
			 *
			 * inv q2:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = tpro implies equipe->forAll(pro = true)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, FootballPackage.Literals.TOURNOI___Q2__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, FootballTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ boolean tpro = this.isTpro();
					final /*@Thrown*/ Boolean result;
					if (!tpro) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<Equipe> equipe = this.getEquipe();
						final /*@NonInvalid*/ OrderedSetValue BOXED_equipe = idResolver.createOrderedSetOfAll(FootballTables.ORD_CLSSid_Equipe_0, equipe);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR__1 = BOXED_equipe.iterator();
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
							/*@NonInvalid*/ Equipe _1 = (Equipe)ITERATOR__1.next();
							/**
							 * pro
							 */
							final /*@NonInvalid*/ boolean pro = _1.isPro();
							//
							if (!pro) {					// Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break;														// Stop immediately
							}
							else if (pro) {				// Normal successful body evaluation result
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
			case FootballPackage.TOURNOI__MATCH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatch()).basicAdd(otherEnd, msgs);
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
			case FootballPackage.TOURNOI__MATCH:
				return ((InternalEList<?>)getMatch()).basicRemove(otherEnd, msgs);
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
			case FootballPackage.TOURNOI__DATE:
				return getDate();
			case FootballPackage.TOURNOI__TPRO:
				return isTpro();
			case FootballPackage.TOURNOI__MATCH:
				return getMatch();
			case FootballPackage.TOURNOI__EQUIPE:
				return getEquipe();
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
			case FootballPackage.TOURNOI__DATE:
				setDate((Date)newValue);
				return;
			case FootballPackage.TOURNOI__TPRO:
				setTpro((Boolean)newValue);
				return;
			case FootballPackage.TOURNOI__MATCH:
				getMatch().clear();
				getMatch().addAll((Collection<? extends Match>)newValue);
				return;
			case FootballPackage.TOURNOI__EQUIPE:
				getEquipe().clear();
				getEquipe().addAll((Collection<? extends Equipe>)newValue);
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
			case FootballPackage.TOURNOI__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case FootballPackage.TOURNOI__TPRO:
				setTpro(TPRO_EDEFAULT);
				return;
			case FootballPackage.TOURNOI__MATCH:
				getMatch().clear();
				return;
			case FootballPackage.TOURNOI__EQUIPE:
				getEquipe().clear();
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
			case FootballPackage.TOURNOI__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case FootballPackage.TOURNOI__TPRO:
				return tpro != TPRO_EDEFAULT;
			case FootballPackage.TOURNOI__MATCH:
				return match != null && !match.isEmpty();
			case FootballPackage.TOURNOI__EQUIPE:
				return equipe != null && !equipe.isEmpty();
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
			case FootballPackage.TOURNOI___Q2__DIAGNOSTICCHAIN_MAP:
				return q2((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (date: ");
		result.append(date);
		result.append(", tpro: ");
		result.append(tpro);
		result.append(')');
		return result.toString();
	}

} //TournoiImpl
