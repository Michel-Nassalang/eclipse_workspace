/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /sn.domaine.enseignement/model/enseignement.ecore
 * using:
 *   /sn.domaine.enseignement/model/enseignement.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package Enseignement;

// import Enseignement.EnseignementPackage;
// import Enseignement.EnseignementTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * EnseignementTables provides the dispatch tables for the Enseignement for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class EnseignementTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(EnseignementPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_enseignement_sn = IdManager.getNsURIPackageId("https://enseignement.sn", null, EnseignementPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Departement = EnseignementTables.PACKid_https_c_s_s_enseignement_sn.getClassId("Departement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Domaine = EnseignementTables.PACKid_https_c_s_s_enseignement_sn.getClassId("Domaine", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Enseignant = EnseignementTables.PACKid_https_c_s_s_enseignement_sn.getClassId("Enseignant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Etudiant = EnseignementTables.PACKid_https_c_s_s_enseignement_sn.getClassId("Etudiant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Matiere = EnseignementTables.PACKid_https_c_s_s_enseignement_sn.getClassId("Matiere", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Note = EnseignementTables.PACKid_https_c_s_s_enseignement_sn.getClassId("Note", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Universite = EnseignementTables.PACKid_https_c_s_s_enseignement_sn.getClassId("Universite", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = EnseignementTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = EnseignementTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = EnseignementTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = EnseignementTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Titre = EnseignementTables.PACKid_https_c_s_s_enseignement_sn.getEnumerationId("Titre");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_40 = ValueUtil.integerValueOf("40");
	public static final /*@NonInvalid*/ RealValue REA_10_0 = ValueUtil.realValueOf("10.0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Departement = TypeId.BAG.getSpecializedId(EnseignementTables.CLSSid_Departement, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Universite = TypeId.BAG.getSpecializedId(EnseignementTables.CLSSid_Universite, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PR = EnseignementTables.ENUMid_Titre.getEnumerationLiteralId("PR");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Departement = TypeId.ORDERED_SET.getSpecializedId(EnseignementTables.CLSSid_Departement, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Departement_0 = TypeId.ORDERED_SET.getSpecializedId(EnseignementTables.CLSSid_Departement, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Enseignant = TypeId.ORDERED_SET.getSpecializedId(EnseignementTables.CLSSid_Enseignant, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Etudiant = TypeId.ORDERED_SET.getSpecializedId(EnseignementTables.CLSSid_Etudiant, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Matiere = TypeId.ORDERED_SET.getSpecializedId(EnseignementTables.CLSSid_Matiere, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Matiere_0 = TypeId.ORDERED_SET.getSpecializedId(EnseignementTables.CLSSid_Matiere, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Note = TypeId.ORDERED_SET.getSpecializedId(EnseignementTables.CLSSid_Note, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Note_0 = TypeId.ORDERED_SET.getSpecializedId(EnseignementTables.CLSSid_Note, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Universite = TypeId.ORDERED_SET.getSpecializedId(EnseignementTables.CLSSid_Universite, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EInt = TypeId.SEQUENCE.getSpecializedId(EnseignementTables.DATAid_EInt, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Enseignant = TypeId.SET.getSpecializedId(EnseignementTables.CLSSid_Enseignant, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			EnseignementTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnseignementTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Departement = new EcoreExecutorType(EnseignementPackage.Literals.DEPARTEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Domaine = new EcoreExecutorType(EnseignementPackage.Literals.DOMAINE, PACKAGE, 0);
		public static final EcoreExecutorType _Enseignant = new EcoreExecutorType(EnseignementPackage.Literals.ENSEIGNANT, PACKAGE, 0);
		public static final EcoreExecutorType _Etudiant = new EcoreExecutorType(EnseignementPackage.Literals.ETUDIANT, PACKAGE, 0);
		public static final EcoreExecutorType _Matiere = new EcoreExecutorType(EnseignementPackage.Literals.MATIERE, PACKAGE, 0);
		public static final EcoreExecutorType _Note = new EcoreExecutorType(EnseignementPackage.Literals.NOTE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Titre = new EcoreExecutorEnumeration(EnseignementPackage.Literals.TITRE, PACKAGE, 0);
		public static final EcoreExecutorType _Universite = new EcoreExecutorType(EnseignementPackage.Literals.UNIVERSITE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Departement,
			_Domaine,
			_Enseignant,
			_Etudiant,
			_Matiere,
			_Note,
			_Titre,
			_Universite
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnseignementTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Departement__Departement = new ExecutorFragment(Types._Departement, EnseignementTables.Types._Departement);
		private static final ExecutorFragment _Departement__OclAny = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Departement__OclElement = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Domaine__Domaine = new ExecutorFragment(Types._Domaine, EnseignementTables.Types._Domaine);
		private static final ExecutorFragment _Domaine__OclAny = new ExecutorFragment(Types._Domaine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Domaine__OclElement = new ExecutorFragment(Types._Domaine, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Enseignant__Enseignant = new ExecutorFragment(Types._Enseignant, EnseignementTables.Types._Enseignant);
		private static final ExecutorFragment _Enseignant__OclAny = new ExecutorFragment(Types._Enseignant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Enseignant__OclElement = new ExecutorFragment(Types._Enseignant, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Etudiant__Etudiant = new ExecutorFragment(Types._Etudiant, EnseignementTables.Types._Etudiant);
		private static final ExecutorFragment _Etudiant__OclAny = new ExecutorFragment(Types._Etudiant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Etudiant__OclElement = new ExecutorFragment(Types._Etudiant, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Matiere__Matiere = new ExecutorFragment(Types._Matiere, EnseignementTables.Types._Matiere);
		private static final ExecutorFragment _Matiere__OclAny = new ExecutorFragment(Types._Matiere, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Matiere__OclElement = new ExecutorFragment(Types._Matiere, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Note__Note = new ExecutorFragment(Types._Note, EnseignementTables.Types._Note);
		private static final ExecutorFragment _Note__OclAny = new ExecutorFragment(Types._Note, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Note__OclElement = new ExecutorFragment(Types._Note, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Titre__OclAny = new ExecutorFragment(Types._Titre, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Titre__OclElement = new ExecutorFragment(Types._Titre, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Titre__OclEnumeration = new ExecutorFragment(Types._Titre, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Titre__OclType = new ExecutorFragment(Types._Titre, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Titre__Titre = new ExecutorFragment(Types._Titre, EnseignementTables.Types._Titre);

		private static final ExecutorFragment _Universite__OclAny = new ExecutorFragment(Types._Universite, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Universite__OclElement = new ExecutorFragment(Types._Universite, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Universite__Universite = new ExecutorFragment(Types._Universite, EnseignementTables.Types._Universite);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnseignementTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _EInt = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Integer);
		public static final ParameterTypes _Enseignant = TypeUtil.createParameterTypes(EnseignementTables.Types._Enseignant);
		public static final ParameterTypes _Matiere = TypeUtil.createParameterTypes(EnseignementTables.Types._Matiere);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnseignementTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Departement__ajouter = new ExecutorOperation("ajouter", Parameters._Enseignant, Types._Departement,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Enseignant__augmenterSal = new ExecutorOperation("augmenterSal", Parameters._EInt, Types._Enseignant,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Enseignant__operation = new ExecutorOperation("operation", Parameters._Matiere, Types._Enseignant,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Etudiant__age = new ExecutorOperation("age", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Etudiant,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Etudiant__estAdmis = new ExecutorOperation("estAdmis", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Etudiant,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnseignementTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Departement__employes = new EcoreExecutorProperty(EnseignementPackage.Literals.DEPARTEMENT__EMPLOYES, Types._Departement, 0);
		public static final ExecutorProperty _Departement__nom = new EcoreExecutorProperty(EnseignementPackage.Literals.DEPARTEMENT__NOM, Types._Departement, 1);
		public static final ExecutorProperty _Departement__responsable = new EcoreExecutorProperty(EnseignementPackage.Literals.DEPARTEMENT__RESPONSABLE, Types._Departement, 2);
		public static final ExecutorProperty _Departement__Domaine__departements = new ExecutorPropertyWithImplementation("Domaine", Types._Departement, 3, new EcoreLibraryOppositeProperty(EnseignementPackage.Literals.DOMAINE__DEPARTEMENTS));
		public static final ExecutorProperty _Departement__Universite__facultes = new ExecutorPropertyWithImplementation("Universite", Types._Departement, 4, new EcoreLibraryOppositeProperty(EnseignementPackage.Literals.UNIVERSITE__FACULTES));

		public static final ExecutorProperty _Domaine__departements = new EcoreExecutorProperty(EnseignementPackage.Literals.DOMAINE__DEPARTEMENTS, Types._Domaine, 0);
		public static final ExecutorProperty _Domaine__enseignants = new EcoreExecutorProperty(EnseignementPackage.Literals.DOMAINE__ENSEIGNANTS, Types._Domaine, 1);
		public static final ExecutorProperty _Domaine__etudiants = new EcoreExecutorProperty(EnseignementPackage.Literals.DOMAINE__ETUDIANTS, Types._Domaine, 2);
		public static final ExecutorProperty _Domaine__matieres = new EcoreExecutorProperty(EnseignementPackage.Literals.DOMAINE__MATIERES, Types._Domaine, 3);
		public static final ExecutorProperty _Domaine__notes = new EcoreExecutorProperty(EnseignementPackage.Literals.DOMAINE__NOTES, Types._Domaine, 4);
		public static final ExecutorProperty _Domaine__universites = new EcoreExecutorProperty(EnseignementPackage.Literals.DOMAINE__UNIVERSITES, Types._Domaine, 5);

		public static final ExecutorProperty _Enseignant__age = new EcoreExecutorProperty(EnseignementPackage.Literals.ENSEIGNANT__AGE, Types._Enseignant, 0);
		public static final ExecutorProperty _Enseignant__debut = new EcoreExecutorProperty(EnseignementPackage.Literals.ENSEIGNANT__DEBUT, Types._Enseignant, 1);
		public static final ExecutorProperty _Enseignant__enseignements = new EcoreExecutorProperty(EnseignementPackage.Literals.ENSEIGNANT__ENSEIGNEMENTS, Types._Enseignant, 2);
		public static final ExecutorProperty _Enseignant__nom = new EcoreExecutorProperty(EnseignementPackage.Literals.ENSEIGNANT__NOM, Types._Enseignant, 3);
		public static final ExecutorProperty _Enseignant__salaire = new EcoreExecutorProperty(EnseignementPackage.Literals.ENSEIGNANT__SALAIRE, Types._Enseignant, 4);
		public static final ExecutorProperty _Enseignant__service = new EcoreExecutorProperty(EnseignementPackage.Literals.ENSEIGNANT__SERVICE, Types._Enseignant, 5);
		public static final ExecutorProperty _Enseignant__specialisations = new EcoreExecutorProperty(EnseignementPackage.Literals.ENSEIGNANT__SPECIALISATIONS, Types._Enseignant, 6);
		public static final ExecutorProperty _Enseignant__titre = new EcoreExecutorProperty(EnseignementPackage.Literals.ENSEIGNANT__TITRE, Types._Enseignant, 7);
		public static final ExecutorProperty _Enseignant__Departement__employes = new ExecutorPropertyWithImplementation("Departement", Types._Enseignant, 8, new EcoreLibraryOppositeProperty(EnseignementPackage.Literals.DEPARTEMENT__EMPLOYES));
		public static final ExecutorProperty _Enseignant__Departement__responsable = new ExecutorPropertyWithImplementation("Departement", Types._Enseignant, 9, new EcoreLibraryOppositeProperty(EnseignementPackage.Literals.DEPARTEMENT__RESPONSABLE));
		public static final ExecutorProperty _Enseignant__Domaine__enseignants = new ExecutorPropertyWithImplementation("Domaine", Types._Enseignant, 10, new EcoreLibraryOppositeProperty(EnseignementPackage.Literals.DOMAINE__ENSEIGNANTS));

		public static final ExecutorProperty _Etudiant__ddn = new EcoreExecutorProperty(EnseignementPackage.Literals.ETUDIANT__DDN, Types._Etudiant, 0);
		public static final ExecutorProperty _Etudiant__nom = new EcoreExecutorProperty(EnseignementPackage.Literals.ETUDIANT__NOM, Types._Etudiant, 1);
		public static final ExecutorProperty _Etudiant__resultats = new EcoreExecutorProperty(EnseignementPackage.Literals.ETUDIANT__RESULTATS, Types._Etudiant, 2);
		public static final ExecutorProperty _Etudiant__Domaine__etudiants = new ExecutorPropertyWithImplementation("Domaine", Types._Etudiant, 3, new EcoreLibraryOppositeProperty(EnseignementPackage.Literals.DOMAINE__ETUDIANTS));
		public static final ExecutorProperty _Etudiant__Universite__inscrits = new ExecutorPropertyWithImplementation("Universite", Types._Etudiant, 4, new EcoreLibraryOppositeProperty(EnseignementPackage.Literals.UNIVERSITE__INSCRITS));

		public static final ExecutorProperty _Matiere__heure = new EcoreExecutorProperty(EnseignementPackage.Literals.MATIERE__HEURE, Types._Matiere, 0);
		public static final ExecutorProperty _Matiere__nom = new EcoreExecutorProperty(EnseignementPackage.Literals.MATIERE__NOM, Types._Matiere, 1);
		public static final ExecutorProperty _Matiere__prof = new EcoreExecutorProperty(EnseignementPackage.Literals.MATIERE__PROF, Types._Matiere, 2);
		public static final ExecutorProperty _Matiere__resultats = new EcoreExecutorProperty(EnseignementPackage.Literals.MATIERE__RESULTATS, Types._Matiere, 3);
		public static final ExecutorProperty _Matiere__specialistes = new EcoreExecutorProperty(EnseignementPackage.Literals.MATIERE__SPECIALISTES, Types._Matiere, 4);
		public static final ExecutorProperty _Matiere__Domaine__matieres = new ExecutorPropertyWithImplementation("Domaine", Types._Matiere, 5, new EcoreLibraryOppositeProperty(EnseignementPackage.Literals.DOMAINE__MATIERES));

		public static final ExecutorProperty _Note__date = new EcoreExecutorProperty(EnseignementPackage.Literals.NOTE__DATE, Types._Note, 0);
		public static final ExecutorProperty _Note__etudiant = new EcoreExecutorProperty(EnseignementPackage.Literals.NOTE__ETUDIANT, Types._Note, 1);
		public static final ExecutorProperty _Note__idNote = new EcoreExecutorProperty(EnseignementPackage.Literals.NOTE__ID_NOTE, Types._Note, 2);
		public static final ExecutorProperty _Note__matiere = new EcoreExecutorProperty(EnseignementPackage.Literals.NOTE__MATIERE, Types._Note, 3);
		public static final ExecutorProperty _Note__val = new EcoreExecutorProperty(EnseignementPackage.Literals.NOTE__VAL, Types._Note, 4);
		public static final ExecutorProperty _Note__Domaine__notes = new ExecutorPropertyWithImplementation("Domaine", Types._Note, 5, new EcoreLibraryOppositeProperty(EnseignementPackage.Literals.DOMAINE__NOTES));

		public static final ExecutorProperty _Universite__facultes = new EcoreExecutorProperty(EnseignementPackage.Literals.UNIVERSITE__FACULTES, Types._Universite, 0);
		public static final ExecutorProperty _Universite__inscrits = new EcoreExecutorProperty(EnseignementPackage.Literals.UNIVERSITE__INSCRITS, Types._Universite, 1);
		public static final ExecutorProperty _Universite__nom = new EcoreExecutorProperty(EnseignementPackage.Literals.UNIVERSITE__NOM, Types._Universite, 2);
		public static final ExecutorProperty _Universite__sigle = new EcoreExecutorProperty(EnseignementPackage.Literals.UNIVERSITE__SIGLE, Types._Universite, 3);
		public static final ExecutorProperty _Universite__Domaine__universites = new ExecutorPropertyWithImplementation("Domaine", Types._Universite, 4, new EcoreLibraryOppositeProperty(EnseignementPackage.Literals.DOMAINE__UNIVERSITES));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnseignementTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Departement =
			{
				Fragments._Departement__OclAny /* 0 */,
				Fragments._Departement__OclElement /* 1 */,
				Fragments._Departement__Departement /* 2 */
			};
		private static final int /*@NonNull*/ [] __Departement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Domaine =
			{
				Fragments._Domaine__OclAny /* 0 */,
				Fragments._Domaine__OclElement /* 1 */,
				Fragments._Domaine__Domaine /* 2 */
			};
		private static final int /*@NonNull*/ [] __Domaine = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Enseignant =
			{
				Fragments._Enseignant__OclAny /* 0 */,
				Fragments._Enseignant__OclElement /* 1 */,
				Fragments._Enseignant__Enseignant /* 2 */
			};
		private static final int /*@NonNull*/ [] __Enseignant = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Etudiant =
			{
				Fragments._Etudiant__OclAny /* 0 */,
				Fragments._Etudiant__OclElement /* 1 */,
				Fragments._Etudiant__Etudiant /* 2 */
			};
		private static final int /*@NonNull*/ [] __Etudiant = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Matiere =
			{
				Fragments._Matiere__OclAny /* 0 */,
				Fragments._Matiere__OclElement /* 1 */,
				Fragments._Matiere__Matiere /* 2 */
			};
		private static final int /*@NonNull*/ [] __Matiere = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Note =
			{
				Fragments._Note__OclAny /* 0 */,
				Fragments._Note__OclElement /* 1 */,
				Fragments._Note__Note /* 2 */
			};
		private static final int /*@NonNull*/ [] __Note = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Titre =
			{
				Fragments._Titre__OclAny /* 0 */,
				Fragments._Titre__OclElement /* 1 */,
				Fragments._Titre__OclType /* 2 */,
				Fragments._Titre__OclEnumeration /* 3 */,
				Fragments._Titre__Titre /* 4 */
			};
		private static final int /*@NonNull*/ [] __Titre = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Universite =
			{
				Fragments._Universite__OclAny /* 0 */,
				Fragments._Universite__OclElement /* 1 */,
				Fragments._Universite__Universite /* 2 */
			};
		private static final int /*@NonNull*/ [] __Universite = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Departement.initFragments(_Departement, __Departement);
			Types._Domaine.initFragments(_Domaine, __Domaine);
			Types._Enseignant.initFragments(_Enseignant, __Enseignant);
			Types._Etudiant.initFragments(_Etudiant, __Etudiant);
			Types._Matiere.initFragments(_Matiere, __Matiere);
			Types._Note.initFragments(_Note, __Note);
			Types._Titre.initFragments(_Titre, __Titre);
			Types._Universite.initFragments(_Universite, __Universite);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnseignementTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Departement__Departement = {
			EnseignementTables.Operations._Departement__ajouter /* ajouter(Enseignant[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Domaine__Domaine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Domaine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Domaine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__Enseignant = {
			EnseignementTables.Operations._Enseignant__augmenterSal /* augmenterSal(EInt[1]) */,
			EnseignementTables.Operations._Enseignant__operation /* operation(Matiere[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enseignant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Etudiant__Etudiant = {
			EnseignementTables.Operations._Etudiant__age /* age() */,
			EnseignementTables.Operations._Etudiant__estAdmis /* estAdmis() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Etudiant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Etudiant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Matiere__Matiere = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Matiere__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Matiere__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Note__Note = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Note__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Note__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Titre__Titre = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Titre__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Titre__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Titre__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Titre__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Universite__Universite = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Universite__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Universite__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Departement__Departement.initOperations(_Departement__Departement);
			Fragments._Departement__OclAny.initOperations(_Departement__OclAny);
			Fragments._Departement__OclElement.initOperations(_Departement__OclElement);

			Fragments._Domaine__Domaine.initOperations(_Domaine__Domaine);
			Fragments._Domaine__OclAny.initOperations(_Domaine__OclAny);
			Fragments._Domaine__OclElement.initOperations(_Domaine__OclElement);

			Fragments._Enseignant__Enseignant.initOperations(_Enseignant__Enseignant);
			Fragments._Enseignant__OclAny.initOperations(_Enseignant__OclAny);
			Fragments._Enseignant__OclElement.initOperations(_Enseignant__OclElement);

			Fragments._Etudiant__Etudiant.initOperations(_Etudiant__Etudiant);
			Fragments._Etudiant__OclAny.initOperations(_Etudiant__OclAny);
			Fragments._Etudiant__OclElement.initOperations(_Etudiant__OclElement);

			Fragments._Matiere__Matiere.initOperations(_Matiere__Matiere);
			Fragments._Matiere__OclAny.initOperations(_Matiere__OclAny);
			Fragments._Matiere__OclElement.initOperations(_Matiere__OclElement);

			Fragments._Note__Note.initOperations(_Note__Note);
			Fragments._Note__OclAny.initOperations(_Note__OclAny);
			Fragments._Note__OclElement.initOperations(_Note__OclElement);

			Fragments._Titre__OclAny.initOperations(_Titre__OclAny);
			Fragments._Titre__OclElement.initOperations(_Titre__OclElement);
			Fragments._Titre__OclEnumeration.initOperations(_Titre__OclEnumeration);
			Fragments._Titre__OclType.initOperations(_Titre__OclType);
			Fragments._Titre__Titre.initOperations(_Titre__Titre);

			Fragments._Universite__OclAny.initOperations(_Universite__OclAny);
			Fragments._Universite__OclElement.initOperations(_Universite__OclElement);
			Fragments._Universite__Universite.initOperations(_Universite__Universite);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnseignementTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Departement = {
			EnseignementTables.Properties._Departement__employes,
			EnseignementTables.Properties._Departement__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EnseignementTables.Properties._Departement__responsable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Domaine = {
			EnseignementTables.Properties._Domaine__departements,
			EnseignementTables.Properties._Domaine__enseignants,
			EnseignementTables.Properties._Domaine__etudiants,
			EnseignementTables.Properties._Domaine__matieres,
			EnseignementTables.Properties._Domaine__notes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EnseignementTables.Properties._Domaine__universites
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Enseignant = {
			EnseignementTables.Properties._Enseignant__age,
			EnseignementTables.Properties._Enseignant__debut,
			EnseignementTables.Properties._Enseignant__enseignements,
			EnseignementTables.Properties._Enseignant__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EnseignementTables.Properties._Enseignant__salaire,
			EnseignementTables.Properties._Enseignant__service,
			EnseignementTables.Properties._Enseignant__specialisations,
			EnseignementTables.Properties._Enseignant__titre
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Etudiant = {
			EnseignementTables.Properties._Etudiant__ddn,
			EnseignementTables.Properties._Etudiant__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EnseignementTables.Properties._Etudiant__resultats
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Matiere = {
			EnseignementTables.Properties._Matiere__heure,
			EnseignementTables.Properties._Matiere__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EnseignementTables.Properties._Matiere__prof,
			EnseignementTables.Properties._Matiere__resultats,
			EnseignementTables.Properties._Matiere__specialistes
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Note = {
			EnseignementTables.Properties._Note__date,
			EnseignementTables.Properties._Note__etudiant,
			EnseignementTables.Properties._Note__idNote,
			EnseignementTables.Properties._Note__matiere,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EnseignementTables.Properties._Note__val
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Titre = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Universite = {
			EnseignementTables.Properties._Universite__facultes,
			EnseignementTables.Properties._Universite__inscrits,
			EnseignementTables.Properties._Universite__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EnseignementTables.Properties._Universite__sigle
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Departement__Departement.initProperties(_Departement);
			Fragments._Domaine__Domaine.initProperties(_Domaine);
			Fragments._Enseignant__Enseignant.initProperties(_Enseignant);
			Fragments._Etudiant__Etudiant.initProperties(_Etudiant);
			Fragments._Matiere__Matiere.initProperties(_Matiere);
			Fragments._Note__Note.initProperties(_Note);
			Fragments._Titre__Titre.initProperties(_Titre);
			Fragments._Universite__Universite.initProperties(_Universite);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnseignementTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Titre__MA = new EcoreExecutorEnumerationLiteral(EnseignementPackage.Literals.TITRE.getEEnumLiteral("MA"), Types._Titre, 0);
		public static final EcoreExecutorEnumerationLiteral _Titre__MC = new EcoreExecutorEnumerationLiteral(EnseignementPackage.Literals.TITRE.getEEnumLiteral("MC"), Types._Titre, 1);
		public static final EcoreExecutorEnumerationLiteral _Titre__PR = new EcoreExecutorEnumerationLiteral(EnseignementPackage.Literals.TITRE.getEEnumLiteral("PR"), Types._Titre, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Titre = {
			_Titre__MA,
			_Titre__MC,
			_Titre__PR
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Titre.initLiterals(_Titre);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EnseignementTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new EnseignementTables();
	}

	private EnseignementTables() {
		super(EnseignementPackage.eNS_URI);
	}
}
