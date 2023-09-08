/*
 * generated by Xtext 2.29.0
 */
grammar InternalCalcul;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.ipsl.calcul.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.ipsl.calcul.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.ipsl.calcul.services.CalculGrammarAccess;

}
@parser::members {
	private CalculGrammarAccess grammarAccess;

	public void setGrammarAccess(CalculGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleCALCUL
entryRuleCALCUL
:
{ before(grammarAccess.getCALCULRule()); }
	 ruleCALCUL
{ after(grammarAccess.getCALCULRule()); } 
	 EOF 
;

// Rule CALCUL
ruleCALCUL 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCALCULAccess().getOperationAssignment()); }
		(rule__CALCUL__OperationAssignment)?
		{ after(grammarAccess.getCALCULAccess().getOperationAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSTATISTIQUE
entryRuleSTATISTIQUE
:
{ before(grammarAccess.getSTATISTIQUERule()); }
	 ruleSTATISTIQUE
{ after(grammarAccess.getSTATISTIQUERule()); } 
	 EOF 
;

// Rule STATISTIQUE
ruleSTATISTIQUE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSTATISTIQUEAccess().getGroup()); }
		(rule__STATISTIQUE__Group__0)
		{ after(grammarAccess.getSTATISTIQUEAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDEBUT
entryRuleDEBUT
:
{ before(grammarAccess.getDEBUTRule()); }
	 ruleDEBUT
{ after(grammarAccess.getDEBUTRule()); } 
	 EOF 
;

// Rule DEBUT
ruleDEBUT 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDEBUTAccess().getBeginKeyword()); }
		'begin'
		{ after(grammarAccess.getDEBUTAccess().getBeginKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMODALITE
entryRuleMODALITE
:
{ before(grammarAccess.getMODALITERule()); }
	 ruleMODALITE
{ after(grammarAccess.getMODALITERule()); } 
	 EOF 
;

// Rule MODALITE
ruleMODALITE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMODALITEAccess().getGroup()); }
		(rule__MODALITE__Group__0)
		{ after(grammarAccess.getMODALITEAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEFFECTIF
entryRuleEFFECTIF
:
{ before(grammarAccess.getEFFECTIFRule()); }
	 ruleEFFECTIF
{ after(grammarAccess.getEFFECTIFRule()); } 
	 EOF 
;

// Rule EFFECTIF
ruleEFFECTIF 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEFFECTIFAccess().getGroup()); }
		(rule__EFFECTIF__Group__0)
		{ after(grammarAccess.getEFFECTIFAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRETOUR
entryRuleRETOUR
:
{ before(grammarAccess.getRETOURRule()); }
	 ruleRETOUR
{ after(grammarAccess.getRETOURRule()); } 
	 EOF 
;

// Rule RETOUR
ruleRETOUR 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRETOURAccess().getAlternatives()); }
		(rule__RETOUR__Alternatives)
		{ after(grammarAccess.getRETOURAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEND
entryRuleEND
:
{ before(grammarAccess.getENDRule()); }
	 ruleEND
{ after(grammarAccess.getENDRule()); } 
	 EOF 
;

// Rule END
ruleEND 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getENDAccess().getEndKeyword()); }
		'end'
		{ after(grammarAccess.getENDAccess().getEndKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RETOUR__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRETOURAccess().getMoyenneKeyword_0()); }
		'moyenne'
		{ after(grammarAccess.getRETOURAccess().getMoyenneKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getRETOURAccess().getModeKeyword_1()); }
		'mode'
		{ after(grammarAccess.getRETOURAccess().getModeKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getRETOURAccess().getVarianceKeyword_2()); }
		'variance'
		{ after(grammarAccess.getRETOURAccess().getVarianceKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getRETOURAccess().getEcartTypeKeyword_3()); }
		'ecart-type'
		{ after(grammarAccess.getRETOURAccess().getEcartTypeKeyword_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__0__Impl
	rule__STATISTIQUE__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getProgramKeyword_0()); }
	'program'
	{ after(grammarAccess.getSTATISTIQUEAccess().getProgramKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__1__Impl
	rule__STATISTIQUE__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getNomAssignment_1()); }
	(rule__STATISTIQUE__NomAssignment_1)
	{ after(grammarAccess.getSTATISTIQUEAccess().getNomAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__2__Impl
	rule__STATISTIQUE__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getDebutAssignment_2()); }
	(rule__STATISTIQUE__DebutAssignment_2)
	{ after(grammarAccess.getSTATISTIQUEAccess().getDebutAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__3__Impl
	rule__STATISTIQUE__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getModKeyword_3()); }
	'mod:'
	{ after(grammarAccess.getSTATISTIQUEAccess().getModKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__4__Impl
	rule__STATISTIQUE__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getModaliteAssignment_4()); }
	(rule__STATISTIQUE__ModaliteAssignment_4)
	{ after(grammarAccess.getSTATISTIQUEAccess().getModaliteAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__5__Impl
	rule__STATISTIQUE__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getEffKeyword_5()); }
	'eff:'
	{ after(grammarAccess.getSTATISTIQUEAccess().getEffKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__6__Impl
	rule__STATISTIQUE__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getEffectifAssignment_6()); }
	(rule__STATISTIQUE__EffectifAssignment_6)
	{ after(grammarAccess.getSTATISTIQUEAccess().getEffectifAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__7__Impl
	rule__STATISTIQUE__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getReturnKeyword_7()); }
	'return'
	{ after(grammarAccess.getSTATISTIQUEAccess().getReturnKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__8__Impl
	rule__STATISTIQUE__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getResultatAssignment_8()); }
	(rule__STATISTIQUE__ResultatAssignment_8)
	{ after(grammarAccess.getSTATISTIQUEAccess().getResultatAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__9__Impl
	rule__STATISTIQUE__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getSTATISTIQUEAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__STATISTIQUE__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSTATISTIQUEAccess().getEndAssignment_10()); }
	(rule__STATISTIQUE__EndAssignment_10)
	{ after(grammarAccess.getSTATISTIQUEAccess().getEndAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MODALITE__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODALITE__Group__0__Impl
	rule__MODALITE__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODALITEAccess().getModKeyword_0()); }
	'mod:'
	{ after(grammarAccess.getMODALITEAccess().getModKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODALITE__Group__1__Impl
	rule__MODALITE__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODALITEAccess().getValuesAssignment_1()); }
	(rule__MODALITE__ValuesAssignment_1)
	{ after(grammarAccess.getMODALITEAccess().getValuesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODALITE__Group__2__Impl
	rule__MODALITE__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODALITEAccess().getGroup_2()); }
	(rule__MODALITE__Group_2__0)*
	{ after(grammarAccess.getMODALITEAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODALITE__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODALITEAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getMODALITEAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MODALITE__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODALITE__Group_2__0__Impl
	rule__MODALITE__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODALITEAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getMODALITEAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MODALITE__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMODALITEAccess().getValuesAssignment_2_1()); }
	(rule__MODALITE__ValuesAssignment_2_1)
	{ after(grammarAccess.getMODALITEAccess().getValuesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EFFECTIF__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EFFECTIF__Group__0__Impl
	rule__EFFECTIF__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEFFECTIFAccess().getEffKeyword_0()); }
	'eff:'
	{ after(grammarAccess.getEFFECTIFAccess().getEffKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EFFECTIF__Group__1__Impl
	rule__EFFECTIF__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEFFECTIFAccess().getValuesAssignment_1()); }
	(rule__EFFECTIF__ValuesAssignment_1)
	{ after(grammarAccess.getEFFECTIFAccess().getValuesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EFFECTIF__Group__2__Impl
	rule__EFFECTIF__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEFFECTIFAccess().getGroup_2()); }
	(rule__EFFECTIF__Group_2__0)*
	{ after(grammarAccess.getEFFECTIFAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EFFECTIF__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEFFECTIFAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getEFFECTIFAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EFFECTIF__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EFFECTIF__Group_2__0__Impl
	rule__EFFECTIF__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEFFECTIFAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getEFFECTIFAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EFFECTIF__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEFFECTIFAccess().getValuesAssignment_2_1()); }
	(rule__EFFECTIF__ValuesAssignment_2_1)
	{ after(grammarAccess.getEFFECTIFAccess().getValuesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CALCUL__OperationAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCALCULAccess().getOperationSTATISTIQUEParserRuleCall_0()); }
		ruleSTATISTIQUE
		{ after(grammarAccess.getCALCULAccess().getOperationSTATISTIQUEParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__NomAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSTATISTIQUEAccess().getNomIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSTATISTIQUEAccess().getNomIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__DebutAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSTATISTIQUEAccess().getDebutDEBUTParserRuleCall_2_0()); }
		ruleDEBUT
		{ after(grammarAccess.getSTATISTIQUEAccess().getDebutDEBUTParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__ModaliteAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSTATISTIQUEAccess().getModaliteMODALITEParserRuleCall_4_0()); }
		ruleMODALITE
		{ after(grammarAccess.getSTATISTIQUEAccess().getModaliteMODALITEParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__EffectifAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSTATISTIQUEAccess().getEffectifEFFECTIFParserRuleCall_6_0()); }
		ruleEFFECTIF
		{ after(grammarAccess.getSTATISTIQUEAccess().getEffectifEFFECTIFParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__ResultatAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSTATISTIQUEAccess().getResultatRETOURParserRuleCall_8_0()); }
		ruleRETOUR
		{ after(grammarAccess.getSTATISTIQUEAccess().getResultatRETOURParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__STATISTIQUE__EndAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSTATISTIQUEAccess().getEndENDParserRuleCall_10_0()); }
		ruleEND
		{ after(grammarAccess.getSTATISTIQUEAccess().getEndENDParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__ValuesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODALITEAccess().getValuesREELTerminalRuleCall_1_0()); }
		RULE_REEL
		{ after(grammarAccess.getMODALITEAccess().getValuesREELTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MODALITE__ValuesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMODALITEAccess().getValuesREELTerminalRuleCall_2_1_0()); }
		RULE_REEL
		{ after(grammarAccess.getMODALITEAccess().getValuesREELTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__ValuesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEFFECTIFAccess().getValuesREELTerminalRuleCall_1_0()); }
		RULE_REEL
		{ after(grammarAccess.getEFFECTIFAccess().getValuesREELTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EFFECTIF__ValuesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEFFECTIFAccess().getValuesREELTerminalRuleCall_2_1_0()); }
		RULE_REEL
		{ after(grammarAccess.getEFFECTIFAccess().getValuesREELTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_REEL : '-'? RULE_INT? ('.' RULE_INT)?;

fragment RULE_INT : ('0'..'9')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
