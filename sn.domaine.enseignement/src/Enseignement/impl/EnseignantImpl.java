/**
 */
package Enseignement.impl;

import Enseignement.Enseignant;
import Enseignement.EnseignementPackage;
import Enseignement.EnseignementTables;
import Enseignement.Matiere;
import Enseignement.Titre;

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

import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enseignant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Enseignement.impl.EnseignantImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link Enseignement.impl.EnseignantImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link Enseignement.impl.EnseignantImpl#getSalaire <em>Salaire</em>}</li>
 *   <li>{@link Enseignement.impl.EnseignantImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link Enseignement.impl.EnseignantImpl#getService <em>Service</em>}</li>
 *   <li>{@link Enseignement.impl.EnseignantImpl#getAge <em>Age</em>}</li>
 *   <li>{@link Enseignement.impl.EnseignantImpl#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link Enseignement.impl.EnseignantImpl#getEnseignements <em>Enseignements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnseignantImpl extends MinimalEObjectImpl.Container implements Enseignant {
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
	 * The default value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected Date debut = DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalaire() <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaire()
	 * @generated
	 * @ordered
	 */
	protected static final float SALAIRE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSalaire() <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaire()
	 * @generated
	 * @ordered
	 */
	protected float salaire = SALAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final Titre TITRE_EDEFAULT = Titre.MA;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected Titre titre = TITRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected int service = SERVICE_EDEFAULT;

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
	 * The cached value of the '{@link #getSpecialisations() <em>Specialisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Matiere> specialisations;

	/**
	 * The cached value of the '{@link #getEnseignements() <em>Enseignements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseignements()
	 * @generated
	 * @ordered
	 */
	protected EList<Matiere> enseignements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnseignantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnseignementPackage.Literals.ENSEIGNANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.ENSEIGNANT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDebut() {
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebut(Date newDebut) {
		Date oldDebut = debut;
		debut = newDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.ENSEIGNANT__DEBUT, oldDebut, debut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSalaire() {
		return salaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalaire(float newSalaire) {
		float oldSalaire = salaire;
		salaire = newSalaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.ENSEIGNANT__SALAIRE, oldSalaire, salaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Titre getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitre(Titre newTitre) {
		Titre oldTitre = titre;
		titre = newTitre == null ? TITRE_EDEFAULT : newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.ENSEIGNANT__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(int newService) {
		int oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.ENSEIGNANT__SERVICE, oldService, service));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnseignementPackage.ENSEIGNANT__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matiere> getSpecialisations() {
		if (specialisations == null) {
			specialisations = new EObjectWithInverseResolvingEList.ManyInverse<Matiere>(Matiere.class, this, EnseignementPackage.ENSEIGNANT__SPECIALISATIONS, EnseignementPackage.MATIERE__SPECIALISTES);
		}
		return specialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matiere> getEnseignements() {
		if (enseignements == null) {
			enseignements = new EObjectWithInverseResolvingEList<Matiere>(Matiere.class, this, EnseignementPackage.ENSEIGNANT__ENSEIGNEMENTS, EnseignementPackage.MATIERE__PROF);
		}
		return enseignements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void operation(final Matiere m) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented https://enseignement.sn!Enseignant!operation(https://enseignement.sn!Matiere)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void augmenterSal(final int v) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented https://enseignement.sn!Enseignant!augmenterSal(http://www.eclipse.org/emf/2002/Ecore!EInt)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SommeHeuresEffectuees(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Enseignant::SommeHeuresEffectuees";
		try {
			/**
			 *
			 * inv SommeHeuresEffectuees:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = service = enseignements.heure->sum()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EnseignementPackage.Literals.ENSEIGNANT___SOMME_HEURES_EFFECTUEES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EnseignementTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int service = this.getService();
				final /*@NonInvalid*/ IntegerValue BOXED_service = ValueUtil.integerValueOf(service);
				final /*@NonInvalid*/ List<Matiere> enseignements = this.getEnseignements();
				final /*@NonInvalid*/ OrderedSetValue BOXED_enseignements = idResolver.createOrderedSetOfAll(EnseignementTables.ORD_CLSSid_Matiere_0, enseignements);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(EnseignementTables.SEQ_DATAid_EInt);
				Iterator<Object> ITERATOR__1 = BOXED_enseignements.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Matiere _1 = (Matiere)ITERATOR__1.next();
					/**
					 * heure
					 */
					final /*@NonInvalid*/ int heure = _1.getHeure();
					final /*@NonInvalid*/ IntegerValue BOXED_heure = ValueUtil.integerValueOf(heure);
					//
					accumulator.add(BOXED_heure);
				}
				final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)CollectionSumOperation.INSTANCE.evaluate(executor, EnseignementTables.DATAid_EInt, collect);
				final /*@NonInvalid*/ boolean result = BOXED_service.equals(sum);
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
			case EnseignementPackage.ENSEIGNANT__SPECIALISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecialisations()).basicAdd(otherEnd, msgs);
			case EnseignementPackage.ENSEIGNANT__ENSEIGNEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnseignements()).basicAdd(otherEnd, msgs);
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
			case EnseignementPackage.ENSEIGNANT__SPECIALISATIONS:
				return ((InternalEList<?>)getSpecialisations()).basicRemove(otherEnd, msgs);
			case EnseignementPackage.ENSEIGNANT__ENSEIGNEMENTS:
				return ((InternalEList<?>)getEnseignements()).basicRemove(otherEnd, msgs);
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
			case EnseignementPackage.ENSEIGNANT__NOM:
				return getNom();
			case EnseignementPackage.ENSEIGNANT__DEBUT:
				return getDebut();
			case EnseignementPackage.ENSEIGNANT__SALAIRE:
				return getSalaire();
			case EnseignementPackage.ENSEIGNANT__TITRE:
				return getTitre();
			case EnseignementPackage.ENSEIGNANT__SERVICE:
				return getService();
			case EnseignementPackage.ENSEIGNANT__AGE:
				return getAge();
			case EnseignementPackage.ENSEIGNANT__SPECIALISATIONS:
				return getSpecialisations();
			case EnseignementPackage.ENSEIGNANT__ENSEIGNEMENTS:
				return getEnseignements();
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
			case EnseignementPackage.ENSEIGNANT__NOM:
				setNom((String)newValue);
				return;
			case EnseignementPackage.ENSEIGNANT__DEBUT:
				setDebut((Date)newValue);
				return;
			case EnseignementPackage.ENSEIGNANT__SALAIRE:
				setSalaire((Float)newValue);
				return;
			case EnseignementPackage.ENSEIGNANT__TITRE:
				setTitre((Titre)newValue);
				return;
			case EnseignementPackage.ENSEIGNANT__SERVICE:
				setService((Integer)newValue);
				return;
			case EnseignementPackage.ENSEIGNANT__AGE:
				setAge((Integer)newValue);
				return;
			case EnseignementPackage.ENSEIGNANT__SPECIALISATIONS:
				getSpecialisations().clear();
				getSpecialisations().addAll((Collection<? extends Matiere>)newValue);
				return;
			case EnseignementPackage.ENSEIGNANT__ENSEIGNEMENTS:
				getEnseignements().clear();
				getEnseignements().addAll((Collection<? extends Matiere>)newValue);
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
			case EnseignementPackage.ENSEIGNANT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case EnseignementPackage.ENSEIGNANT__DEBUT:
				setDebut(DEBUT_EDEFAULT);
				return;
			case EnseignementPackage.ENSEIGNANT__SALAIRE:
				setSalaire(SALAIRE_EDEFAULT);
				return;
			case EnseignementPackage.ENSEIGNANT__TITRE:
				setTitre(TITRE_EDEFAULT);
				return;
			case EnseignementPackage.ENSEIGNANT__SERVICE:
				setService(SERVICE_EDEFAULT);
				return;
			case EnseignementPackage.ENSEIGNANT__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case EnseignementPackage.ENSEIGNANT__SPECIALISATIONS:
				getSpecialisations().clear();
				return;
			case EnseignementPackage.ENSEIGNANT__ENSEIGNEMENTS:
				getEnseignements().clear();
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
			case EnseignementPackage.ENSEIGNANT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case EnseignementPackage.ENSEIGNANT__DEBUT:
				return DEBUT_EDEFAULT == null ? debut != null : !DEBUT_EDEFAULT.equals(debut);
			case EnseignementPackage.ENSEIGNANT__SALAIRE:
				return salaire != SALAIRE_EDEFAULT;
			case EnseignementPackage.ENSEIGNANT__TITRE:
				return titre != TITRE_EDEFAULT;
			case EnseignementPackage.ENSEIGNANT__SERVICE:
				return service != SERVICE_EDEFAULT;
			case EnseignementPackage.ENSEIGNANT__AGE:
				return age != AGE_EDEFAULT;
			case EnseignementPackage.ENSEIGNANT__SPECIALISATIONS:
				return specialisations != null && !specialisations.isEmpty();
			case EnseignementPackage.ENSEIGNANT__ENSEIGNEMENTS:
				return enseignements != null && !enseignements.isEmpty();
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
			case EnseignementPackage.ENSEIGNANT___OPERATION__MATIERE:
				operation((Matiere)arguments.get(0));
				return null;
			case EnseignementPackage.ENSEIGNANT___AUGMENTER_SAL__INT:
				augmenterSal((Integer)arguments.get(0));
				return null;
			case EnseignementPackage.ENSEIGNANT___SOMME_HEURES_EFFECTUEES__DIAGNOSTICCHAIN_MAP:
				return SommeHeuresEffectuees((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", debut: ");
		result.append(debut);
		result.append(", salaire: ");
		result.append(salaire);
		result.append(", titre: ");
		result.append(titre);
		result.append(", service: ");
		result.append(service);
		result.append(", age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} //EnseignantImpl
