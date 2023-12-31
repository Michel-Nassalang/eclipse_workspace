/*
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.airport.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AirPortGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.airport.AirPort.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cAvionsAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final RuleCall cAvionsAvionParserRuleCall_0_0_0 = (RuleCall)cAvionsAssignment_0_0.eContents().get(0);
		private final Assignment cAeroportsAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final RuleCall cAeroportsAeroportParserRuleCall_0_1_0 = (RuleCall)cAeroportsAssignment_0_1.eContents().get(0);
		private final Assignment cLignesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLignesLigneParserRuleCall_1_0 = (RuleCall)cLignesAssignment_1.eContents().get(0);
		
		//Model:
		//    (avions+=Avion | aeroports+=Aeroport)*(lignes+=Ligne)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(avions+=Avion | aeroports+=Aeroport)*(lignes+=Ligne)*
		public Group getGroup() { return cGroup; }
		
		//(avions+=Avion | aeroports+=Aeroport)*
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//avions+=Avion
		public Assignment getAvionsAssignment_0_0() { return cAvionsAssignment_0_0; }
		
		//Avion
		public RuleCall getAvionsAvionParserRuleCall_0_0_0() { return cAvionsAvionParserRuleCall_0_0_0; }
		
		//aeroports+=Aeroport
		public Assignment getAeroportsAssignment_0_1() { return cAeroportsAssignment_0_1; }
		
		//Aeroport
		public RuleCall getAeroportsAeroportParserRuleCall_0_1_0() { return cAeroportsAeroportParserRuleCall_0_1_0; }
		
		//(lignes+=Ligne)*
		public Assignment getLignesAssignment_1() { return cLignesAssignment_1; }
		
		//Ligne
		public RuleCall getLignesLigneParserRuleCall_1_0() { return cLignesLigneParserRuleCall_1_0; }
	}
	public class AvionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.airport.AirPort.Avion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAvionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cPassagersKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cPassagersAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cPassagersINTTerminalRuleCall_3_0_2_0 = (RuleCall)cPassagersAssignment_3_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cMotorisationKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cMotorisationAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cMotorisationMoteursEnumRuleCall_3_1_2_0 = (RuleCall)cMotorisationAssignment_3_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Avion:
		//    'Avion' name=ID ':'
		//    ('Passagers'':'passagers=INT ';'
		//&    'Motorisation'':'motorisation=Moteurs';')
		//    'End.';
		@Override public ParserRule getRule() { return rule; }
		
		//    'Avion' name=ID ':'
		//    ('Passagers'':'passagers=INT ';'
		//&    'Motorisation'':'motorisation=Moteurs';')
		//    'End.'
		public Group getGroup() { return cGroup; }
		
		//'Avion'
		public Keyword getAvionKeyword_0() { return cAvionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//    ('Passagers'':'passagers=INT ';'
		//&    'Motorisation'':'motorisation=Moteurs';')
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'Passagers'':'passagers=INT ';'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'Passagers'
		public Keyword getPassagersKeyword_3_0_0() { return cPassagersKeyword_3_0_0; }
		
		//':'
		public Keyword getColonKeyword_3_0_1() { return cColonKeyword_3_0_1; }
		
		//passagers=INT
		public Assignment getPassagersAssignment_3_0_2() { return cPassagersAssignment_3_0_2; }
		
		//INT
		public RuleCall getPassagersINTTerminalRuleCall_3_0_2_0() { return cPassagersINTTerminalRuleCall_3_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }
		
		//'Motorisation'':'motorisation=Moteurs';'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'Motorisation'
		public Keyword getMotorisationKeyword_3_1_0() { return cMotorisationKeyword_3_1_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_1() { return cColonKeyword_3_1_1; }
		
		//motorisation=Moteurs
		public Assignment getMotorisationAssignment_3_1_2() { return cMotorisationAssignment_3_1_2; }
		
		//Moteurs
		public RuleCall getMotorisationMoteursEnumRuleCall_3_1_2_0() { return cMotorisationMoteursEnumRuleCall_3_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }
		
		//'End.'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}
	public class AeroportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.airport.AirPort.Aeroport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAeroportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNomAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNomSTRINGTerminalRuleCall_1_0 = (RuleCall)cNomAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cOACIKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cNameAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cNameCodeOACIParserRuleCall_3_0_2_0 = (RuleCall)cNameAssignment_3_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cPaysKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cPaysAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cPaysSTRINGTerminalRuleCall_3_1_2_0 = (RuleCall)cPaysAssignment_3_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cPistesKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cPistesAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final RuleCall cPistesINTTerminalRuleCall_3_2_2_0 = (RuleCall)cPistesAssignment_3_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_2_3 = (Keyword)cGroup_3_2.eContents().get(3);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Aeroport:
		//    'Aeroport' nom=STRING ':'
		//    ('OACI' ':' name=CodeOACI';'
		//&    'Pays' ':'pays=STRING';'
		//&    'Pistes' ':'pistes=INT';')
		//    'End.';
		@Override public ParserRule getRule() { return rule; }
		
		//    'Aeroport' nom=STRING ':'
		//    ('OACI' ':' name=CodeOACI';'
		//&    'Pays' ':'pays=STRING';'
		//&    'Pistes' ':'pistes=INT';')
		//    'End.'
		public Group getGroup() { return cGroup; }
		
		//'Aeroport'
		public Keyword getAeroportKeyword_0() { return cAeroportKeyword_0; }
		
		//nom=STRING
		public Assignment getNomAssignment_1() { return cNomAssignment_1; }
		
		//STRING
		public RuleCall getNomSTRINGTerminalRuleCall_1_0() { return cNomSTRINGTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//    ('OACI' ':' name=CodeOACI';'
		//&    'Pays' ':'pays=STRING';'
		//&    'Pistes' ':'pistes=INT';')
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'OACI' ':' name=CodeOACI';'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'OACI'
		public Keyword getOACIKeyword_3_0_0() { return cOACIKeyword_3_0_0; }
		
		//':'
		public Keyword getColonKeyword_3_0_1() { return cColonKeyword_3_0_1; }
		
		//name=CodeOACI
		public Assignment getNameAssignment_3_0_2() { return cNameAssignment_3_0_2; }
		
		//CodeOACI
		public RuleCall getNameCodeOACIParserRuleCall_3_0_2_0() { return cNameCodeOACIParserRuleCall_3_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }
		
		//'Pays' ':'pays=STRING';'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'Pays'
		public Keyword getPaysKeyword_3_1_0() { return cPaysKeyword_3_1_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_1() { return cColonKeyword_3_1_1; }
		
		//pays=STRING
		public Assignment getPaysAssignment_3_1_2() { return cPaysAssignment_3_1_2; }
		
		//STRING
		public RuleCall getPaysSTRINGTerminalRuleCall_3_1_2_0() { return cPaysSTRINGTerminalRuleCall_3_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }
		
		//'Pistes' ':'pistes=INT';'
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'Pistes'
		public Keyword getPistesKeyword_3_2_0() { return cPistesKeyword_3_2_0; }
		
		//':'
		public Keyword getColonKeyword_3_2_1() { return cColonKeyword_3_2_1; }
		
		//pistes=INT
		public Assignment getPistesAssignment_3_2_2() { return cPistesAssignment_3_2_2; }
		
		//INT
		public RuleCall getPistesINTTerminalRuleCall_3_2_2_0() { return cPistesINTTerminalRuleCall_3_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_2_3() { return cSemicolonKeyword_3_2_3; }
		
		//'End.'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}
	public class LigneElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.airport.AirPort.Ligne");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLigneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cAvionKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cAvionAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final CrossReference cAvionAvionCrossReference_3_0_2_0 = (CrossReference)cAvionAssignment_3_0_2.eContents().get(0);
		private final RuleCall cAvionAvionIDTerminalRuleCall_3_0_2_0_1 = (RuleCall)cAvionAvionCrossReference_3_0_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cCompagnieKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cCompagnieAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cCompagnieSTRINGTerminalRuleCall_3_1_2_0 = (RuleCall)cCompagnieAssignment_3_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cDepartKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cDepartAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final CrossReference cDepartCodeOACICrossReference_3_2_2_0 = (CrossReference)cDepartAssignment_3_2_2.eContents().get(0);
		private final RuleCall cDepartCodeOACIOACITerminalRuleCall_3_2_2_0_1 = (RuleCall)cDepartCodeOACICrossReference_3_2_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2_3 = (Keyword)cGroup_3_2.eContents().get(3);
		private final Group cGroup_3_3 = (Group)cUnorderedGroup_3.eContents().get(3);
		private final Keyword cArriveeKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Keyword cColonKeyword_3_3_1 = (Keyword)cGroup_3_3.eContents().get(1);
		private final Assignment cArriveeAssignment_3_3_2 = (Assignment)cGroup_3_3.eContents().get(2);
		private final CrossReference cArriveeCodeOACICrossReference_3_3_2_0 = (CrossReference)cArriveeAssignment_3_3_2.eContents().get(0);
		private final RuleCall cArriveeCodeOACIOACITerminalRuleCall_3_3_2_0_1 = (RuleCall)cArriveeCodeOACICrossReference_3_3_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_3_3 = (Keyword)cGroup_3_3.eContents().get(3);
		private final Group cGroup_3_4 = (Group)cUnorderedGroup_3.eContents().get(4);
		private final Keyword cDureeKeyword_3_4_0 = (Keyword)cGroup_3_4.eContents().get(0);
		private final Keyword cColonKeyword_3_4_1 = (Keyword)cGroup_3_4.eContents().get(1);
		private final Assignment cDureeAssignment_3_4_2 = (Assignment)cGroup_3_4.eContents().get(2);
		private final RuleCall cDureeDURATIONTerminalRuleCall_3_4_2_0 = (RuleCall)cDureeAssignment_3_4_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_4_3 = (Keyword)cGroup_3_4.eContents().get(3);
		private final Assignment cRegularAssignment_3_5 = (Assignment)cUnorderedGroup_3.eContents().get(5);
		private final Keyword cRegularREGULIEREKeyword_3_5_0 = (Keyword)cRegularAssignment_3_5.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Ligne:
		//    'Ligne' name=STRING ':'
		//    ('Avion' ':'avion=[Avion]';'
		//&    'Compagnie' ':'compagnie=STRING';'
		//&    'Depart' ':' depart=[CodeOACI|OACI]';'
		//&    'Arrivee' ':'arrivee=[CodeOACI|OACI]';'
		//&    'Duree' ':' duree=DURATION';'
		//&    regular?='REGULIERE;'?)
		//    'End.';
		@Override public ParserRule getRule() { return rule; }
		
		//    'Ligne' name=STRING ':'
		//    ('Avion' ':'avion=[Avion]';'
		//&    'Compagnie' ':'compagnie=STRING';'
		//&    'Depart' ':' depart=[CodeOACI|OACI]';'
		//&    'Arrivee' ':'arrivee=[CodeOACI|OACI]';'
		//&    'Duree' ':' duree=DURATION';'
		//&    regular?='REGULIERE;'?)
		//    'End.'
		public Group getGroup() { return cGroup; }
		
		//'Ligne'
		public Keyword getLigneKeyword_0() { return cLigneKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//    ('Avion' ':'avion=[Avion]';'
		//&    'Compagnie' ':'compagnie=STRING';'
		//&    'Depart' ':' depart=[CodeOACI|OACI]';'
		//&    'Arrivee' ':'arrivee=[CodeOACI|OACI]';'
		//&    'Duree' ':' duree=DURATION';'
		//&    regular?='REGULIERE;'?)
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'Avion' ':'avion=[Avion]';'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'Avion'
		public Keyword getAvionKeyword_3_0_0() { return cAvionKeyword_3_0_0; }
		
		//':'
		public Keyword getColonKeyword_3_0_1() { return cColonKeyword_3_0_1; }
		
		//avion=[Avion]
		public Assignment getAvionAssignment_3_0_2() { return cAvionAssignment_3_0_2; }
		
		//[Avion]
		public CrossReference getAvionAvionCrossReference_3_0_2_0() { return cAvionAvionCrossReference_3_0_2_0; }
		
		//ID
		public RuleCall getAvionAvionIDTerminalRuleCall_3_0_2_0_1() { return cAvionAvionIDTerminalRuleCall_3_0_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }
		
		//'Compagnie' ':'compagnie=STRING';'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'Compagnie'
		public Keyword getCompagnieKeyword_3_1_0() { return cCompagnieKeyword_3_1_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_1() { return cColonKeyword_3_1_1; }
		
		//compagnie=STRING
		public Assignment getCompagnieAssignment_3_1_2() { return cCompagnieAssignment_3_1_2; }
		
		//STRING
		public RuleCall getCompagnieSTRINGTerminalRuleCall_3_1_2_0() { return cCompagnieSTRINGTerminalRuleCall_3_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }
		
		//'Depart' ':' depart=[CodeOACI|OACI]';'
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'Depart'
		public Keyword getDepartKeyword_3_2_0() { return cDepartKeyword_3_2_0; }
		
		//':'
		public Keyword getColonKeyword_3_2_1() { return cColonKeyword_3_2_1; }
		
		//depart=[CodeOACI|OACI]
		public Assignment getDepartAssignment_3_2_2() { return cDepartAssignment_3_2_2; }
		
		//[CodeOACI|OACI]
		public CrossReference getDepartCodeOACICrossReference_3_2_2_0() { return cDepartCodeOACICrossReference_3_2_2_0; }
		
		//OACI
		public RuleCall getDepartCodeOACIOACITerminalRuleCall_3_2_2_0_1() { return cDepartCodeOACIOACITerminalRuleCall_3_2_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3_2_3() { return cSemicolonKeyword_3_2_3; }
		
		//'Arrivee' ':'arrivee=[CodeOACI|OACI]';'
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//'Arrivee'
		public Keyword getArriveeKeyword_3_3_0() { return cArriveeKeyword_3_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_3_1() { return cColonKeyword_3_3_1; }
		
		//arrivee=[CodeOACI|OACI]
		public Assignment getArriveeAssignment_3_3_2() { return cArriveeAssignment_3_3_2; }
		
		//[CodeOACI|OACI]
		public CrossReference getArriveeCodeOACICrossReference_3_3_2_0() { return cArriveeCodeOACICrossReference_3_3_2_0; }
		
		//OACI
		public RuleCall getArriveeCodeOACIOACITerminalRuleCall_3_3_2_0_1() { return cArriveeCodeOACIOACITerminalRuleCall_3_3_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3_3_3() { return cSemicolonKeyword_3_3_3; }
		
		//'Duree' ':' duree=DURATION';'
		public Group getGroup_3_4() { return cGroup_3_4; }
		
		//'Duree'
		public Keyword getDureeKeyword_3_4_0() { return cDureeKeyword_3_4_0; }
		
		//':'
		public Keyword getColonKeyword_3_4_1() { return cColonKeyword_3_4_1; }
		
		//duree=DURATION
		public Assignment getDureeAssignment_3_4_2() { return cDureeAssignment_3_4_2; }
		
		//DURATION
		public RuleCall getDureeDURATIONTerminalRuleCall_3_4_2_0() { return cDureeDURATIONTerminalRuleCall_3_4_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_4_3() { return cSemicolonKeyword_3_4_3; }
		
		//regular?='REGULIERE;'?
		public Assignment getRegularAssignment_3_5() { return cRegularAssignment_3_5; }
		
		//'REGULIERE;'
		public Keyword getRegularREGULIEREKeyword_3_5_0() { return cRegularREGULIEREKeyword_3_5_0; }
		
		//'End.'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}
	public class CodeOACIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.airport.AirPort.CodeOACI");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameOACITerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//CodeOACI : name=OACI;
		@Override public ParserRule getRule() { return rule; }
		
		//name=OACI
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//OACI
		public RuleCall getNameOACITerminalRuleCall_0() { return cNameOACITerminalRuleCall_0; }
	}
	
	public class MoteursElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.airport.AirPort.Moteurs");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cP1EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cP1HELICESKeyword_0_0 = (Keyword)cP1EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cP2EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cP2PROPULSEURSKeyword_1_0 = (Keyword)cP2EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Moteurs:
		//  p1 ='HELICES' | p2 = 'PROPULSEURS'    ;
		public EnumRule getRule() { return rule; }
		
		//p1 ='HELICES' | p2 = 'PROPULSEURS'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//p1 ='HELICES'
		public EnumLiteralDeclaration getP1EnumLiteralDeclaration_0() { return cP1EnumLiteralDeclaration_0; }
		
		//'HELICES'
		public Keyword getP1HELICESKeyword_0_0() { return cP1HELICESKeyword_0_0; }
		
		//p2 = 'PROPULSEURS'
		public EnumLiteralDeclaration getP2EnumLiteralDeclaration_1() { return cP2EnumLiteralDeclaration_1; }
		
		//'PROPULSEURS'
		public Keyword getP2PROPULSEURSKeyword_1_0() { return cP2PROPULSEURSKeyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final AvionElements pAvion;
	private final AeroportElements pAeroport;
	private final LigneElements pLigne;
	private final MoteursElements eMoteurs;
	private final TerminalRule tDURATION;
	private final CodeOACIElements pCodeOACI;
	private final TerminalRule tOACI;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AirPortGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAvion = new AvionElements();
		this.pAeroport = new AeroportElements();
		this.pLigne = new LigneElements();
		this.eMoteurs = new MoteursElements();
		this.tDURATION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.airport.AirPort.DURATION");
		this.pCodeOACI = new CodeOACIElements();
		this.tOACI = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.airport.AirPort.OACI");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.ipsl.airport.AirPort".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    (avions+=Avion | aeroports+=Aeroport)*(lignes+=Ligne)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Avion:
	//    'Avion' name=ID ':'
	//    ('Passagers'':'passagers=INT ';'
	//&    'Motorisation'':'motorisation=Moteurs';')
	//    'End.';
	public AvionElements getAvionAccess() {
		return pAvion;
	}
	
	public ParserRule getAvionRule() {
		return getAvionAccess().getRule();
	}
	
	//Aeroport:
	//    'Aeroport' nom=STRING ':'
	//    ('OACI' ':' name=CodeOACI';'
	//&    'Pays' ':'pays=STRING';'
	//&    'Pistes' ':'pistes=INT';')
	//    'End.';
	public AeroportElements getAeroportAccess() {
		return pAeroport;
	}
	
	public ParserRule getAeroportRule() {
		return getAeroportAccess().getRule();
	}
	
	//Ligne:
	//    'Ligne' name=STRING ':'
	//    ('Avion' ':'avion=[Avion]';'
	//&    'Compagnie' ':'compagnie=STRING';'
	//&    'Depart' ':' depart=[CodeOACI|OACI]';'
	//&    'Arrivee' ':'arrivee=[CodeOACI|OACI]';'
	//&    'Duree' ':' duree=DURATION';'
	//&    regular?='REGULIERE;'?)
	//    'End.';
	public LigneElements getLigneAccess() {
		return pLigne;
	}
	
	public ParserRule getLigneRule() {
		return getLigneAccess().getRule();
	}
	
	//enum Moteurs:
	//  p1 ='HELICES' | p2 = 'PROPULSEURS'    ;
	public MoteursElements getMoteursAccess() {
		return eMoteurs;
	}
	
	public EnumRule getMoteursRule() {
		return getMoteursAccess().getRule();
	}
	
	//terminal DURATION : (('0'..'2''0'..'9')'h')?('0'..'5''0'..'9')'m';
	public TerminalRule getDURATIONRule() {
		return tDURATION;
	}
	
	//CodeOACI : name=OACI;
	public CodeOACIElements getCodeOACIAccess() {
		return pCodeOACI;
	}
	
	public ParserRule getCodeOACIRule() {
		return getCodeOACIAccess().getRule();
	}
	
	//terminal OACI : ('A'..'Z')('A'..'Z')('A'..'Z')('A'..'Z');
	public TerminalRule getOACIRule() {
		return tOACI;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
