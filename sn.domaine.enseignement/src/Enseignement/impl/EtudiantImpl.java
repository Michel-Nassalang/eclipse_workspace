/**
 */
package Enseignement.impl;

import Enseignement.EnseignementPackage;
import Enseignement.EnseignementTables;
import Enseignement.Etudiant;
import Enseignement.Note;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etudiant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.impl.EtudiantImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link Enseignement.impl.EtudiantImpl#getDdn <em>Ddn</em>}</li>
 *   <li>{@link Enseignement.impl.EtudiantImpl#getResultats <em>Resultats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtudiantImpl extends MinimalEObjectImpl.Container implements Etudiant {
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
	 * The default value of the '{@link #getDdn() <em>Ddn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdn()
	 * @generated
	 * @ordered
	 */
	protected static final Date DDN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDdn() <em>Ddn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdn()
	 * @generated
	 * @ordered
	 */
	protected Date ddn = DDN_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtudiantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnseignementPackage.Literals.ETUDIANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.ETUDIANT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDdn() {
		return ddn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdn(Date newDdn) {
		Date oldDdn = ddn;
		ddn = newDdn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.ETUDIANT__DDN, oldDdn, ddn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getResultats() {
		if (resultats == null) {
			resultats = new EObjectWithInverseResolvingEList<Note>(Note.class, this, EnseignementPackage.ETUDIANT__RESULTATS, EnseignementPackage.NOTE__ETUDIANT);
		}
		return resultats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean estAdmis() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented https://enseignement.sn!Etudiant!estAdmis()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int age() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented https://enseignement.sn!Etudiant!age()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean etudiant_admis_si_moyenne_superieure_ou_egale_a_10(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Etudiant::etudiant_admis_si_moyenne_superieure_ou_egale_a_10";
		try {
			/**
			 *
			 * inv etudiant_admis_si_moyenne_superieure_ou_egale_a_10:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = resultats->forAll(n | n.val >= 10.0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EnseignementPackage.Literals.ETUDIANT___ETUDIANT_ADMIS_SI_MOYENNE_SUPERIEURE_OU_EGALE_A10__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EnseignementTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Note> resultats = this.getResultats();
				final /*@NonInvalid*/ OrderedSetValue BOXED_resultats = idResolver.createOrderedSetOfAll(EnseignementTables.ORD_CLSSid_Note_0, resultats);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_n = BOXED_resultats.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_n.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Note n = (Note)ITERATOR_n.next();
					/**
					 * n.val >= 10.0
					 */
					final /*@NonInvalid*/ double val = n.getVal();
					final /*@NonInvalid*/ RealValue BOXED_val = ValueUtil.realValueOf(val);
					final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_val, EnseignementTables.REA_10_0).booleanValue();
					//
					if (!ge) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (ge) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, EnseignementTables.INT_0).booleanValue();
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
			case EnseignementPackage.ETUDIANT__RESULTATS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResultats()).basicAdd(otherEnd, msgs);
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
			case EnseignementPackage.ETUDIANT__RESULTATS:
				return ((InternalEList<?>)getResultats()).basicRemove(otherEnd, msgs);
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
			case EnseignementPackage.ETUDIANT__NOM:
				return getNom();
			case EnseignementPackage.ETUDIANT__DDN:
				return getDdn();
			case EnseignementPackage.ETUDIANT__RESULTATS:
				return getResultats();
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
			case EnseignementPackage.ETUDIANT__NOM:
				setNom((String)newValue);
				return;
			case EnseignementPackage.ETUDIANT__DDN:
				setDdn((Date)newValue);
				return;
			case EnseignementPackage.ETUDIANT__RESULTATS:
				getResultats().clear();
				getResultats().addAll((Collection<? extends Note>)newValue);
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
			case EnseignementPackage.ETUDIANT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case EnseignementPackage.ETUDIANT__DDN:
				setDdn(DDN_EDEFAULT);
				return;
			case EnseignementPackage.ETUDIANT__RESULTATS:
				getResultats().clear();
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
			case EnseignementPackage.ETUDIANT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case EnseignementPackage.ETUDIANT__DDN:
				return DDN_EDEFAULT == null ? ddn != null : !DDN_EDEFAULT.equals(ddn);
			case EnseignementPackage.ETUDIANT__RESULTATS:
				return resultats != null && !resultats.isEmpty();
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
			case EnseignementPackage.ETUDIANT___EST_ADMIS:
				return estAdmis();
			case EnseignementPackage.ETUDIANT___AGE:
				return age();
			case EnseignementPackage.ETUDIANT___ETUDIANT_ADMIS_SI_MOYENNE_SUPERIEURE_OU_EGALE_A10__DIAGNOSTICCHAIN_MAP:
				return etudiant_admis_si_moyenne_superieure_ou_egale_a_10((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", ddn: ");
		result.append(ddn);
		result.append(')');
		return result.toString();
	}

} //EtudiantImpl
