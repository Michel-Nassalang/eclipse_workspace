/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /sn.football/model/football.ecore
 * using:
 *   /sn.football/model/football.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package football;

// import football.FootballPackage;
// import football.FootballTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
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
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * FootballTables provides the dispatch tables for the football for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class FootballTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(FootballPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_football_gouv_sn = IdManager.getNsURIPackageId("https://football.gouv.sn", null, FootballPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Equipe = FootballTables.PACKid_https_c_s_s_football_gouv_sn.getClassId("Equipe", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Joueur = FootballTables.PACKid_https_c_s_s_football_gouv_sn.getClassId("Joueur", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Match = FootballTables.PACKid_https_c_s_s_football_gouv_sn.getClassId("Match", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Model = FootballTables.PACKid_https_c_s_s_football_gouv_sn.getClassId("Model", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Tournoi = FootballTables.PACKid_https_c_s_s_football_gouv_sn.getClassId("Tournoi", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = FootballTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = FootballTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_18 = ValueUtil.integerValueOf("18");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Equipe = TypeId.BAG.getSpecializedId(FootballTables.CLSSid_Equipe, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Model = TypeId.BAG.getSpecializedId(FootballTables.CLSSid_Model, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Tournoi = TypeId.BAG.getSpecializedId(FootballTables.CLSSid_Tournoi, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Equipe = TypeId.ORDERED_SET.getSpecializedId(FootballTables.CLSSid_Equipe, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Equipe_0 = TypeId.ORDERED_SET.getSpecializedId(FootballTables.CLSSid_Equipe, true, ValueUtil.integerValueOf(2), ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Joueur = TypeId.ORDERED_SET.getSpecializedId(FootballTables.CLSSid_Joueur, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Joueur_0 = TypeId.ORDERED_SET.getSpecializedId(FootballTables.CLSSid_Joueur, true, ValueUtil.ONE_VALUE, ValueUtil.integerValueOf(5));
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Match = TypeId.ORDERED_SET.getSpecializedId(FootballTables.CLSSid_Match, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Match_0 = TypeId.ORDERED_SET.getSpecializedId(FootballTables.CLSSid_Match, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Tournoi = TypeId.ORDERED_SET.getSpecializedId(FootballTables.CLSSid_Tournoi, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EInt = TypeId.SEQUENCE.getSpecializedId(FootballTables.DATAid_EInt, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			FootballTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FootballTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Equipe = new EcoreExecutorType(FootballPackage.Literals.EQUIPE, PACKAGE, 0);
		public static final EcoreExecutorType _Joueur = new EcoreExecutorType(FootballPackage.Literals.JOUEUR, PACKAGE, 0);
		public static final EcoreExecutorType _Match = new EcoreExecutorType(FootballPackage.Literals.MATCH, PACKAGE, 0);
		public static final EcoreExecutorType _Model = new EcoreExecutorType(FootballPackage.Literals.MODEL, PACKAGE, 0);
		public static final EcoreExecutorType _Tournoi = new EcoreExecutorType(FootballPackage.Literals.TOURNOI, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Equipe,
			_Joueur,
			_Match,
			_Model,
			_Tournoi
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FootballTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Equipe__Equipe = new ExecutorFragment(Types._Equipe, FootballTables.Types._Equipe);
		private static final ExecutorFragment _Equipe__OclAny = new ExecutorFragment(Types._Equipe, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Equipe__OclElement = new ExecutorFragment(Types._Equipe, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Joueur__Joueur = new ExecutorFragment(Types._Joueur, FootballTables.Types._Joueur);
		private static final ExecutorFragment _Joueur__OclAny = new ExecutorFragment(Types._Joueur, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Joueur__OclElement = new ExecutorFragment(Types._Joueur, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Match__Match = new ExecutorFragment(Types._Match, FootballTables.Types._Match);
		private static final ExecutorFragment _Match__OclAny = new ExecutorFragment(Types._Match, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Match__OclElement = new ExecutorFragment(Types._Match, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Model__Model = new ExecutorFragment(Types._Model, FootballTables.Types._Model);
		private static final ExecutorFragment _Model__OclAny = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Model__OclElement = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Tournoi__OclAny = new ExecutorFragment(Types._Tournoi, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Tournoi__OclElement = new ExecutorFragment(Types._Tournoi, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Tournoi__Tournoi = new ExecutorFragment(Types._Tournoi, FootballTables.Types._Tournoi);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FootballTables::Fragments and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FootballTables::Parameters and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FootballTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Equipe__joueur = new EcoreExecutorProperty(FootballPackage.Literals.EQUIPE__JOUEUR, Types._Equipe, 0);
		public static final ExecutorProperty _Equipe__match = new EcoreExecutorProperty(FootballPackage.Literals.EQUIPE__MATCH, Types._Equipe, 1);
		public static final ExecutorProperty _Equipe__nom = new EcoreExecutorProperty(FootballPackage.Literals.EQUIPE__NOM, Types._Equipe, 2);
		public static final ExecutorProperty _Equipe__pro = new EcoreExecutorProperty(FootballPackage.Literals.EQUIPE__PRO, Types._Equipe, 3);
		public static final ExecutorProperty _Equipe__tournoi = new EcoreExecutorProperty(FootballPackage.Literals.EQUIPE__TOURNOI, Types._Equipe, 4);
		public static final ExecutorProperty _Equipe__Model__equipes = new ExecutorPropertyWithImplementation("Model", Types._Equipe, 5, new EcoreLibraryOppositeProperty(FootballPackage.Literals.MODEL__EQUIPES));
		public static final ExecutorProperty _Equipe__Tournoi__equipe = new ExecutorPropertyWithImplementation("Tournoi", Types._Equipe, 6, new EcoreLibraryOppositeProperty(FootballPackage.Literals.TOURNOI__EQUIPE));

		public static final ExecutorProperty _Joueur__age = new EcoreExecutorProperty(FootballPackage.Literals.JOUEUR__AGE, Types._Joueur, 0);
		public static final ExecutorProperty _Joueur__equipe = new EcoreExecutorProperty(FootballPackage.Literals.JOUEUR__EQUIPE, Types._Joueur, 1);
		public static final ExecutorProperty _Joueur__nom = new EcoreExecutorProperty(FootballPackage.Literals.JOUEUR__NOM, Types._Joueur, 2);
		public static final ExecutorProperty _Joueur__Model__joueurs = new ExecutorPropertyWithImplementation("Model", Types._Joueur, 3, new EcoreLibraryOppositeProperty(FootballPackage.Literals.MODEL__JOUEURS));

		public static final ExecutorProperty _Match__affronte = new EcoreExecutorProperty(FootballPackage.Literals.MATCH__AFFRONTE, Types._Match, 0);
		public static final ExecutorProperty _Match__tournoi = new EcoreExecutorProperty(FootballPackage.Literals.MATCH__TOURNOI, Types._Match, 1);
		public static final ExecutorProperty _Match__victoire = new EcoreExecutorProperty(FootballPackage.Literals.MATCH__VICTOIRE, Types._Match, 2);
		public static final ExecutorProperty _Match__Model__matchs = new ExecutorPropertyWithImplementation("Model", Types._Match, 3, new EcoreLibraryOppositeProperty(FootballPackage.Literals.MODEL__MATCHS));

		public static final ExecutorProperty _Model__equipes = new EcoreExecutorProperty(FootballPackage.Literals.MODEL__EQUIPES, Types._Model, 0);
		public static final ExecutorProperty _Model__joueurs = new EcoreExecutorProperty(FootballPackage.Literals.MODEL__JOUEURS, Types._Model, 1);
		public static final ExecutorProperty _Model__matchs = new EcoreExecutorProperty(FootballPackage.Literals.MODEL__MATCHS, Types._Model, 2);
		public static final ExecutorProperty _Model__tournois = new EcoreExecutorProperty(FootballPackage.Literals.MODEL__TOURNOIS, Types._Model, 3);

		public static final ExecutorProperty _Tournoi__date = new EcoreExecutorProperty(FootballPackage.Literals.TOURNOI__DATE, Types._Tournoi, 0);
		public static final ExecutorProperty _Tournoi__equipe = new EcoreExecutorProperty(FootballPackage.Literals.TOURNOI__EQUIPE, Types._Tournoi, 1);
		public static final ExecutorProperty _Tournoi__match = new EcoreExecutorProperty(FootballPackage.Literals.TOURNOI__MATCH, Types._Tournoi, 2);
		public static final ExecutorProperty _Tournoi__tpro = new EcoreExecutorProperty(FootballPackage.Literals.TOURNOI__TPRO, Types._Tournoi, 3);
		public static final ExecutorProperty _Tournoi__Equipe__tournoi = new ExecutorPropertyWithImplementation("Equipe", Types._Tournoi, 4, new EcoreLibraryOppositeProperty(FootballPackage.Literals.EQUIPE__TOURNOI));
		public static final ExecutorProperty _Tournoi__Model__tournois = new ExecutorPropertyWithImplementation("Model", Types._Tournoi, 5, new EcoreLibraryOppositeProperty(FootballPackage.Literals.MODEL__TOURNOIS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FootballTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Equipe =
			{
				Fragments._Equipe__OclAny /* 0 */,
				Fragments._Equipe__OclElement /* 1 */,
				Fragments._Equipe__Equipe /* 2 */
			};
		private static final int /*@NonNull*/ [] __Equipe = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Joueur =
			{
				Fragments._Joueur__OclAny /* 0 */,
				Fragments._Joueur__OclElement /* 1 */,
				Fragments._Joueur__Joueur /* 2 */
			};
		private static final int /*@NonNull*/ [] __Joueur = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Match =
			{
				Fragments._Match__OclAny /* 0 */,
				Fragments._Match__OclElement /* 1 */,
				Fragments._Match__Match /* 2 */
			};
		private static final int /*@NonNull*/ [] __Match = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Model =
			{
				Fragments._Model__OclAny /* 0 */,
				Fragments._Model__OclElement /* 1 */,
				Fragments._Model__Model /* 2 */
			};
		private static final int /*@NonNull*/ [] __Model = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Tournoi =
			{
				Fragments._Tournoi__OclAny /* 0 */,
				Fragments._Tournoi__OclElement /* 1 */,
				Fragments._Tournoi__Tournoi /* 2 */
			};
		private static final int /*@NonNull*/ [] __Tournoi = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Equipe.initFragments(_Equipe, __Equipe);
			Types._Joueur.initFragments(_Joueur, __Joueur);
			Types._Match.initFragments(_Match, __Match);
			Types._Model.initFragments(_Model, __Model);
			Types._Tournoi.initFragments(_Tournoi, __Tournoi);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FootballTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Equipe__Equipe = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Equipe__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Equipe__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Joueur__Joueur = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Joueur__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Joueur__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Match__Match = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Match__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Match__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Model__Model = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Model__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Model__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Tournoi__Tournoi = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Tournoi__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Tournoi__OclElement = {
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
			Fragments._Equipe__Equipe.initOperations(_Equipe__Equipe);
			Fragments._Equipe__OclAny.initOperations(_Equipe__OclAny);
			Fragments._Equipe__OclElement.initOperations(_Equipe__OclElement);

			Fragments._Joueur__Joueur.initOperations(_Joueur__Joueur);
			Fragments._Joueur__OclAny.initOperations(_Joueur__OclAny);
			Fragments._Joueur__OclElement.initOperations(_Joueur__OclElement);

			Fragments._Match__Match.initOperations(_Match__Match);
			Fragments._Match__OclAny.initOperations(_Match__OclAny);
			Fragments._Match__OclElement.initOperations(_Match__OclElement);

			Fragments._Model__Model.initOperations(_Model__Model);
			Fragments._Model__OclAny.initOperations(_Model__OclAny);
			Fragments._Model__OclElement.initOperations(_Model__OclElement);

			Fragments._Tournoi__OclAny.initOperations(_Tournoi__OclAny);
			Fragments._Tournoi__OclElement.initOperations(_Tournoi__OclElement);
			Fragments._Tournoi__Tournoi.initOperations(_Tournoi__Tournoi);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FootballTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Equipe = {
			FootballTables.Properties._Equipe__joueur,
			FootballTables.Properties._Equipe__match,
			FootballTables.Properties._Equipe__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			FootballTables.Properties._Equipe__pro,
			FootballTables.Properties._Equipe__tournoi
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Joueur = {
			FootballTables.Properties._Joueur__age,
			FootballTables.Properties._Joueur__equipe,
			FootballTables.Properties._Joueur__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Match = {
			FootballTables.Properties._Match__affronte,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			FootballTables.Properties._Match__tournoi,
			FootballTables.Properties._Match__victoire
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Model = {
			FootballTables.Properties._Model__equipes,
			FootballTables.Properties._Model__joueurs,
			FootballTables.Properties._Model__matchs,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			FootballTables.Properties._Model__tournois
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Tournoi = {
			FootballTables.Properties._Tournoi__date,
			FootballTables.Properties._Tournoi__equipe,
			FootballTables.Properties._Tournoi__match,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			FootballTables.Properties._Tournoi__tpro
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Equipe__Equipe.initProperties(_Equipe);
			Fragments._Joueur__Joueur.initProperties(_Joueur);
			Fragments._Match__Match.initProperties(_Match);
			Fragments._Model__Model.initProperties(_Model);
			Fragments._Tournoi__Tournoi.initProperties(_Tournoi);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FootballTables::FragmentProperties and all preceding sub-packages.
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

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of FootballTables::EnumerationLiterals and all preceding sub-packages.
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
		new FootballTables();
	}

	private FootballTables() {
		super(FootballPackage.eNS_URI);
	}
}
