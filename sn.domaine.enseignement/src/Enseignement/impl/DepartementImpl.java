/**
 */
package Enseignement.impl;

import Enseignement.Departement;
import Enseignement.Enseignant;
import Enseignement.EnseignementPackage;
import Enseignement.EnseignementTables;
import Enseignement.Titre;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.impl.DepartementImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link Enseignement.impl.DepartementImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link Enseignement.impl.DepartementImpl#getEmployes <em>Employes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartementImpl extends MinimalEObjectImpl.Container implements Departement {
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
	 * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected Enseignant responsable;

	/**
	 * The cached value of the '{@link #getEmployes() <em>Employes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployes()
	 * @generated
	 * @ordered
	 */
	protected EList<Enseignant> employes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnseignementPackage.Literals.DEPARTEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.DEPARTEMENT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant getResponsable() {
		if (responsable != null && responsable.eIsProxy()) {
			InternalEObject oldResponsable = (InternalEObject)responsable;
			responsable = (Enseignant)eResolveProxy(oldResponsable);
			if (responsable != oldResponsable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnseignementPackage.DEPARTEMENT__RESPONSABLE, oldResponsable, responsable));
			}
		}
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant basicGetResponsable() {
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(Enseignant newResponsable) {
		Enseignant oldResponsable = responsable;
		responsable = newResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.DEPARTEMENT__RESPONSABLE, oldResponsable, responsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enseignant> getEmployes() {
		if (employes == null) {
			employes = new EObjectContainmentEList<Enseignant>(Enseignant.class, this, EnseignementPackage.DEPARTEMENT__EMPLOYES);
		}
		return employes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ajouter(final Enseignant e) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented https://enseignement.sn!Departement!ajouter(https://enseignement.sn!Enseignant)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean au_moins_un_professeur(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Departement::au_moins_un_professeur";
		try {
			/**
			 *
			 * inv au_moins_un_professeur:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = employes->exists(e | e.titre = Titre::PR)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EnseignementPackage.Literals.DEPARTEMENT___AU_MOINS_UN_PROFESSEUR__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EnseignementTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<Enseignant> employes = this.getEmployes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_employes = idResolver.createOrderedSetOfAll(EnseignementTables.ORD_CLSSid_Enseignant, employes);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_e_0 = BOXED_employes.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Enseignant e_0 = (Enseignant)ITERATOR_e_0.next();
					/**
					 * e.titre = Titre::PR
					 */
					final /*@NonInvalid*/ Titre titre = e_0.getTitre();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_titre = titre == null ? null : EnseignementTables.ENUMid_Titre.getEnumerationLiteralId(ClassUtil.nonNullState(titre.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_titre == EnseignementTables.ELITid_PR;
					//
					if (eq) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (!eq) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
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
	public boolean nom_unique_enseignant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Departement::nom_unique_enseignant";
		try {
			/**
			 *
			 * inv nom_unique_enseignant:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = employes->forAll(e1, e2 | e1 <> e2 implies e1.nom <> e2.nom)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EnseignementPackage.Literals.DEPARTEMENT___NOM_UNIQUE_ENSEIGNANT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EnseignementTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Enseignant> employes = this.getEmployes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_employes = idResolver.createOrderedSetOfAll(EnseignementTables.ORD_CLSSid_Enseignant, employes);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, BOXED_employes);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * e1 <> e2 implies e1.nom <> e2.nom
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_employes = (OrderedSetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object e1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object e2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Enseignant CAST_null = (Enseignant)e1;
								final /*@NonInvalid*/ Enseignant CAST_null_0 = (Enseignant)e2;
								final /*@NonInvalid*/ boolean ne = (CAST_null != null) ? !CAST_null.equals(CAST_null_0) : (CAST_null_0 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (CAST_null == null) {
											throw new InvalidValueException("Null source for \'\'https://enseignement.sn\'::Enseignant::nom\'");
										}
										final /*@Thrown*/ String nom = CAST_null.getNom();
										if (CAST_null_0 == null) {
											throw new InvalidValueException("Null source for \'\'https://enseignement.sn\'::Enseignant::nom\'");
										}
										final /*@Thrown*/ String nom_0 = CAST_null_0.getNom();
										final /*@Thrown*/ boolean ne_0 = (nom != null) ? !nom.equals(nom_0) : (nom_0 != null);
										CAUGHT_ne_0 = ne_0;
									}
									catch (Exception e) {
										CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_ne_0 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_ne_0;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							}
							catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, false, TypeId.BOOLEAN, BODY_result_0, BOXED_employes, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, EnseignementTables.INT_0).booleanValue();
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
	public boolean chef_unique_et_age_depasse_40(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Departement::chef_unique_et_age_depasse_40";
		try {
			/**
			 *
			 * inv chef_unique_et_age_depasse_40:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = responsable->size() = 1 and responsable.age > 40
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EnseignementPackage.Literals.DEPARTEMENT___CHEF_UNIQUE_ET_AGE_DEPASSE_40__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EnseignementTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_eq;
					try {
						final /*@NonInvalid*/ Enseignant responsable = this.getResponsable();
						final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, EnseignementTables.SET_CLSSid_Enseignant, responsable);
						final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet);
						final /*@Thrown*/ boolean eq = size.equals(EnseignementTables.INT_1);
						CAUGHT_eq = eq;
					}
					catch (Exception e) {
						CAUGHT_eq = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_gt;
						try {
							final /*@NonInvalid*/ Enseignant responsable_0 = this.getResponsable();
							if (responsable_0 == null) {
								throw new InvalidValueException("Null source for \'\'https://enseignement.sn\'::Enseignant::age\'");
							}
							final /*@Thrown*/ int age = responsable_0.getAge();
							final /*@Thrown*/ IntegerValue BOXED_age = ValueUtil.integerValueOf(age);
							final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_age, EnseignementTables.INT_40).booleanValue();
							CAUGHT_gt = gt;
						}
						catch (Exception e) {
							CAUGHT_gt = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_eq instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_eq;
							}
							if (CAUGHT_gt instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_gt;
							}
							result = ValueUtil.TRUE_VALUE;
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, EnseignementTables.INT_0).booleanValue();
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnseignementPackage.DEPARTEMENT__EMPLOYES:
				return ((InternalEList<?>)getEmployes()).basicRemove(otherEnd, msgs);
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
			case EnseignementPackage.DEPARTEMENT__NOM:
				return getNom();
			case EnseignementPackage.DEPARTEMENT__RESPONSABLE:
				if (resolve) return getResponsable();
				return basicGetResponsable();
			case EnseignementPackage.DEPARTEMENT__EMPLOYES:
				return getEmployes();
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
			case EnseignementPackage.DEPARTEMENT__NOM:
				setNom((String)newValue);
				return;
			case EnseignementPackage.DEPARTEMENT__RESPONSABLE:
				setResponsable((Enseignant)newValue);
				return;
			case EnseignementPackage.DEPARTEMENT__EMPLOYES:
				getEmployes().clear();
				getEmployes().addAll((Collection<? extends Enseignant>)newValue);
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
			case EnseignementPackage.DEPARTEMENT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case EnseignementPackage.DEPARTEMENT__RESPONSABLE:
				setResponsable((Enseignant)null);
				return;
			case EnseignementPackage.DEPARTEMENT__EMPLOYES:
				getEmployes().clear();
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
			case EnseignementPackage.DEPARTEMENT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case EnseignementPackage.DEPARTEMENT__RESPONSABLE:
				return responsable != null;
			case EnseignementPackage.DEPARTEMENT__EMPLOYES:
				return employes != null && !employes.isEmpty();
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
			case EnseignementPackage.DEPARTEMENT___AJOUTER__ENSEIGNANT:
				ajouter((Enseignant)arguments.get(0));
				return null;
			case EnseignementPackage.DEPARTEMENT___AU_MOINS_UN_PROFESSEUR__DIAGNOSTICCHAIN_MAP:
				return au_moins_un_professeur((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EnseignementPackage.DEPARTEMENT___NOM_UNIQUE_ENSEIGNANT__DIAGNOSTICCHAIN_MAP:
				return nom_unique_enseignant((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EnseignementPackage.DEPARTEMENT___CHEF_UNIQUE_ET_AGE_DEPASSE_40__DIAGNOSTICCHAIN_MAP:
				return chef_unique_et_age_depasse_40((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(')');
		return result.toString();
	}

} //DepartementImpl
