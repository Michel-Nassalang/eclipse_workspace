/*
 * generated by Xtext 2.30.0
 */
grammar InternalFigure;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.ipsl.figure.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.ipsl.figure.ide.contentassist.antlr.internal;

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
import org.xtext.ipsl.figure.services.FigureGrammarAccess;

}
@parser::members {
	private FigureGrammarAccess grammarAccess;

	public void setGrammarAccess(FigureGrammarAccess grammarAccess) {
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

// Entry rule entryRulePROGRAMME
entryRulePROGRAMME
:
{ before(grammarAccess.getPROGRAMMERule()); }
	 rulePROGRAMME
{ after(grammarAccess.getPROGRAMMERule()); } 
	 EOF 
;

// Rule PROGRAMME
rulePROGRAMME 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPROGRAMMEAccess().getFigAssignment()); }
		(rule__PROGRAMME__FigAssignment)?
		{ after(grammarAccess.getPROGRAMMEAccess().getFigAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFIGURE
entryRuleFIGURE
:
{ before(grammarAccess.getFIGURERule()); }
	 ruleFIGURE
{ after(grammarAccess.getFIGURERule()); } 
	 EOF 
;

// Rule FIGURE
ruleFIGURE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFIGUREAccess().getGroup()); }
		(rule__FIGURE__Group__0)
		{ after(grammarAccess.getFIGUREAccess().getGroup()); }
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
		{ before(grammarAccess.getDEBUTAccess().getBEGINKeyword()); }
		'BEGIN'
		{ after(grammarAccess.getDEBUTAccess().getBEGINKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCARRE
entryRuleCARRE
:
{ before(grammarAccess.getCARRERule()); }
	 ruleCARRE
{ after(grammarAccess.getCARRERule()); } 
	 EOF 
;

// Rule CARRE
ruleCARRE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCARREAccess().getGroup()); }
		(rule__CARRE__Group__0)
		{ after(grammarAccess.getCARREAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRECTANGLE
entryRuleRECTANGLE
:
{ before(grammarAccess.getRECTANGLERule()); }
	 ruleRECTANGLE
{ after(grammarAccess.getRECTANGLERule()); } 
	 EOF 
;

// Rule RECTANGLE
ruleRECTANGLE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRECTANGLEAccess().getGroup()); }
		(rule__RECTANGLE__Group__0)
		{ after(grammarAccess.getRECTANGLEAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCERCLE
entryRuleCERCLE
:
{ before(grammarAccess.getCERCLERule()); }
	 ruleCERCLE
{ after(grammarAccess.getCERCLERule()); } 
	 EOF 
;

// Rule CERCLE
ruleCERCLE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCERCLEAccess().getGroup()); }
		(rule__CERCLE__Group__0)
		{ after(grammarAccess.getCERCLEAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRETURN
entryRuleRETURN
:
{ before(grammarAccess.getRETURNRule()); }
	 ruleRETURN
{ after(grammarAccess.getRETURNRule()); } 
	 EOF 
;

// Rule RETURN
ruleRETURN 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRETURNAccess().getGroup()); }
		(rule__RETURN__Group__0)
		{ after(grammarAccess.getRETURNAccess().getGroup()); }
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
		{ before(grammarAccess.getENDAccess().getENDKeyword()); }
		'END'
		{ after(grammarAccess.getENDAccess().getENDKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleREEL
entryRuleREEL
:
{ before(grammarAccess.getREELRule()); }
	 ruleREEL
{ after(grammarAccess.getREELRule()); } 
	 EOF 
;

// Rule REEL
ruleREEL 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getREELAccess().getReelAssignment()); }
		(rule__REEL__ReelAssignment)
		{ after(grammarAccess.getREELAccess().getReelAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FIGURE__NomAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFIGUREAccess().getNomCERCLEParserRuleCall_1_0_0()); }
		ruleCERCLE
		{ after(grammarAccess.getFIGUREAccess().getNomCERCLEParserRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getFIGUREAccess().getNomRECTANGLEParserRuleCall_1_0_1()); }
		ruleRECTANGLE
		{ after(grammarAccess.getFIGUREAccess().getNomRECTANGLEParserRuleCall_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getFIGUREAccess().getNomCARREParserRuleCall_1_0_2()); }
		ruleCARRE
		{ after(grammarAccess.getFIGUREAccess().getNomCARREParserRuleCall_1_0_2()); }
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
		{ before(grammarAccess.getRETOURAccess().getSurfaceKeyword_0()); }
		'surface'
		{ after(grammarAccess.getRETOURAccess().getSurfaceKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getRETOURAccess().getPerimetreKeyword_1()); }
		'perimetre'
		{ after(grammarAccess.getRETOURAccess().getPerimetreKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FIGURE__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FIGURE__Group__0__Impl
	rule__FIGURE__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FIGURE__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFIGUREAccess().getFigureKeyword_0()); }
	'Figure'
	{ after(grammarAccess.getFIGUREAccess().getFigureKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FIGURE__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FIGURE__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FIGURE__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFIGUREAccess().getNomAssignment_1()); }
	(rule__FIGURE__NomAssignment_1)
	{ after(grammarAccess.getFIGUREAccess().getNomAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CARRE__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CARRE__Group__0__Impl
	rule__CARRE__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCARREAccess().getNomAssignment_0()); }
	(rule__CARRE__NomAssignment_0)
	{ after(grammarAccess.getCARREAccess().getNomAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CARRE__Group__1__Impl
	rule__CARRE__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCARREAccess().getDebutAssignment_1()); }
	(rule__CARRE__DebutAssignment_1)
	{ after(grammarAccess.getCARREAccess().getDebutAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CARRE__Group__2__Impl
	rule__CARRE__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCARREAccess().getGroup_2()); }
	(rule__CARRE__Group_2__0)
	{ after(grammarAccess.getCARREAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CARRE__Group__3__Impl
	rule__CARRE__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCARREAccess().getRetourAssignment_3()); }
	(rule__CARRE__RetourAssignment_3)
	{ after(grammarAccess.getCARREAccess().getRetourAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CARRE__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCARREAccess().getEndAssignment_4()); }
	(rule__CARRE__EndAssignment_4)
	{ after(grammarAccess.getCARREAccess().getEndAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CARRE__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CARRE__Group_2__0__Impl
	rule__CARRE__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCARREAccess().getCoteKeyword_2_0()); }
	'cote'
	{ after(grammarAccess.getCARREAccess().getCoteKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CARRE__Group_2__1__Impl
	rule__CARRE__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCARREAccess().getColonKeyword_2_1()); }
	':'
	{ after(grammarAccess.getCARREAccess().getColonKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CARRE__Group_2__2__Impl
	rule__CARRE__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCARREAccess().getCoteAssignment_2_2()); }
	(rule__CARRE__CoteAssignment_2_2)
	{ after(grammarAccess.getCARREAccess().getCoteAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CARRE__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCARREAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getCARREAccess().getSemicolonKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RECTANGLE__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group__0__Impl
	rule__RECTANGLE__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getNomAssignment_0()); }
	(rule__RECTANGLE__NomAssignment_0)
	{ after(grammarAccess.getRECTANGLEAccess().getNomAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group__1__Impl
	rule__RECTANGLE__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getDebutAssignment_1()); }
	(rule__RECTANGLE__DebutAssignment_1)
	{ after(grammarAccess.getRECTANGLEAccess().getDebutAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group__2__Impl
	rule__RECTANGLE__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2()); }
	(rule__RECTANGLE__UnorderedGroup_2)
	{ after(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group__3__Impl
	rule__RECTANGLE__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getRetourAssignment_3()); }
	(rule__RECTANGLE__RetourAssignment_3)
	{ after(grammarAccess.getRECTANGLEAccess().getRetourAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getEndAssignment_4()); }
	(rule__RECTANGLE__EndAssignment_4)
	{ after(grammarAccess.getRECTANGLEAccess().getEndAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RECTANGLE__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group_2_0__0__Impl
	rule__RECTANGLE__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getLongueurKeyword_2_0_0()); }
	'longueur'
	{ after(grammarAccess.getRECTANGLEAccess().getLongueurKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group_2_0__1__Impl
	rule__RECTANGLE__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getColonKeyword_2_0_1()); }
	':'
	{ after(grammarAccess.getRECTANGLEAccess().getColonKeyword_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group_2_0__2__Impl
	rule__RECTANGLE__Group_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getLongueurAssignment_2_0_2()); }
	(rule__RECTANGLE__LongueurAssignment_2_0_2)
	{ after(grammarAccess.getRECTANGLEAccess().getLongueurAssignment_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getSemicolonKeyword_2_0_3()); }
	';'
	{ after(grammarAccess.getRECTANGLEAccess().getSemicolonKeyword_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RECTANGLE__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group_2_1__0__Impl
	rule__RECTANGLE__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getLargeurKeyword_2_1_0()); }
	'largeur'
	{ after(grammarAccess.getRECTANGLEAccess().getLargeurKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group_2_1__1__Impl
	rule__RECTANGLE__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getColonKeyword_2_1_1()); }
	':'
	{ after(grammarAccess.getRECTANGLEAccess().getColonKeyword_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group_2_1__2__Impl
	rule__RECTANGLE__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getLargeurAssignment_2_1_2()); }
	(rule__RECTANGLE__LargeurAssignment_2_1_2)
	{ after(grammarAccess.getRECTANGLEAccess().getLargeurAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRECTANGLEAccess().getSemicolonKeyword_2_1_3()); }
	';'
	{ after(grammarAccess.getRECTANGLEAccess().getSemicolonKeyword_2_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CERCLE__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CERCLE__Group__0__Impl
	rule__CERCLE__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCERCLEAccess().getNomAssignment_0()); }
	(rule__CERCLE__NomAssignment_0)
	{ after(grammarAccess.getCERCLEAccess().getNomAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CERCLE__Group__1__Impl
	rule__CERCLE__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCERCLEAccess().getDebutAssignment_1()); }
	(rule__CERCLE__DebutAssignment_1)
	{ after(grammarAccess.getCERCLEAccess().getDebutAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CERCLE__Group__2__Impl
	rule__CERCLE__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCERCLEAccess().getGroup_2()); }
	(rule__CERCLE__Group_2__0)
	{ after(grammarAccess.getCERCLEAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CERCLE__Group__3__Impl
	rule__CERCLE__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCERCLEAccess().getRetourAssignment_3()); }
	(rule__CERCLE__RetourAssignment_3)
	{ after(grammarAccess.getCERCLEAccess().getRetourAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CERCLE__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCERCLEAccess().getEndAssignment_4()); }
	(rule__CERCLE__EndAssignment_4)
	{ after(grammarAccess.getCERCLEAccess().getEndAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CERCLE__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CERCLE__Group_2__0__Impl
	rule__CERCLE__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCERCLEAccess().getRayonKeyword_2_0()); }
	'rayon'
	{ after(grammarAccess.getCERCLEAccess().getRayonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CERCLE__Group_2__1__Impl
	rule__CERCLE__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCERCLEAccess().getColonKeyword_2_1()); }
	':'
	{ after(grammarAccess.getCERCLEAccess().getColonKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CERCLE__Group_2__2__Impl
	rule__CERCLE__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCERCLEAccess().getRayonAssignment_2_2()); }
	(rule__CERCLE__RayonAssignment_2_2)
	{ after(grammarAccess.getCERCLEAccess().getRayonAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CERCLE__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCERCLEAccess().getSemicolonKeyword_2_3()); }
	';'
	{ after(grammarAccess.getCERCLEAccess().getSemicolonKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RETURN__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RETURN__Group__0__Impl
	rule__RETURN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RETURN__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRETURNAccess().getReturnKeyword_0()); }
	'return'
	{ after(grammarAccess.getRETURNAccess().getReturnKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RETURN__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RETURN__Group__1__Impl
	rule__RETURN__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RETURN__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRETURNAccess().getResultatAssignment_1()); }
	(rule__RETURN__ResultatAssignment_1)
	{ after(grammarAccess.getRETURNAccess().getResultatAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RETURN__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RETURN__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RETURN__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRETURNAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getRETURNAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RECTANGLE__UnorderedGroup_2
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2());
	}
:
	rule__RECTANGLE__UnorderedGroup_2__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__RECTANGLE__UnorderedGroup_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getRECTANGLEAccess().getGroup_2_0()); }
					(rule__RECTANGLE__Group_2_0__0)
					{ after(grammarAccess.getRECTANGLEAccess().getGroup_2_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getRECTANGLEAccess().getGroup_2_1()); }
					(rule__RECTANGLE__Group_2_1__0)
					{ after(grammarAccess.getRECTANGLEAccess().getGroup_2_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2());
	restoreStackSize(stackSize);
}

rule__RECTANGLE__UnorderedGroup_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__UnorderedGroup_2__Impl
	rule__RECTANGLE__UnorderedGroup_2__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__UnorderedGroup_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RECTANGLE__UnorderedGroup_2__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__PROGRAMME__FigAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPROGRAMMEAccess().getFigFIGUREParserRuleCall_0()); }
		ruleFIGURE
		{ after(grammarAccess.getPROGRAMMEAccess().getFigFIGUREParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FIGURE__NomAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFIGUREAccess().getNomAlternatives_1_0()); }
		(rule__FIGURE__NomAlternatives_1_0)
		{ after(grammarAccess.getFIGUREAccess().getNomAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__NomAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCARREAccess().getNomCarreKeyword_0_0()); }
		(
			{ before(grammarAccess.getCARREAccess().getNomCarreKeyword_0_0()); }
			'Carre'
			{ after(grammarAccess.getCARREAccess().getNomCarreKeyword_0_0()); }
		)
		{ after(grammarAccess.getCARREAccess().getNomCarreKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__DebutAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCARREAccess().getDebutDEBUTParserRuleCall_1_0()); }
		ruleDEBUT
		{ after(grammarAccess.getCARREAccess().getDebutDEBUTParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__CoteAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCARREAccess().getCoteREELParserRuleCall_2_2_0()); }
		ruleREEL
		{ after(grammarAccess.getCARREAccess().getCoteREELParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__RetourAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCARREAccess().getRetourRETURNParserRuleCall_3_0()); }
		ruleRETURN
		{ after(grammarAccess.getCARREAccess().getRetourRETURNParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CARRE__EndAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCARREAccess().getEndENDParserRuleCall_4_0()); }
		ruleEND
		{ after(grammarAccess.getCARREAccess().getEndENDParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__NomAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRECTANGLEAccess().getNomRectangleKeyword_0_0()); }
		(
			{ before(grammarAccess.getRECTANGLEAccess().getNomRectangleKeyword_0_0()); }
			'Rectangle'
			{ after(grammarAccess.getRECTANGLEAccess().getNomRectangleKeyword_0_0()); }
		)
		{ after(grammarAccess.getRECTANGLEAccess().getNomRectangleKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__DebutAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRECTANGLEAccess().getDebutDEBUTParserRuleCall_1_0()); }
		ruleDEBUT
		{ after(grammarAccess.getRECTANGLEAccess().getDebutDEBUTParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__LongueurAssignment_2_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRECTANGLEAccess().getLongueurREELParserRuleCall_2_0_2_0()); }
		ruleREEL
		{ after(grammarAccess.getRECTANGLEAccess().getLongueurREELParserRuleCall_2_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__LargeurAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRECTANGLEAccess().getLargeurREELParserRuleCall_2_1_2_0()); }
		ruleREEL
		{ after(grammarAccess.getRECTANGLEAccess().getLargeurREELParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__RetourAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRECTANGLEAccess().getRetourRETURNParserRuleCall_3_0()); }
		ruleRETURN
		{ after(grammarAccess.getRECTANGLEAccess().getRetourRETURNParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RECTANGLE__EndAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRECTANGLEAccess().getEndENDParserRuleCall_4_0()); }
		ruleEND
		{ after(grammarAccess.getRECTANGLEAccess().getEndENDParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__NomAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCERCLEAccess().getNomCercleKeyword_0_0()); }
		(
			{ before(grammarAccess.getCERCLEAccess().getNomCercleKeyword_0_0()); }
			'Cercle'
			{ after(grammarAccess.getCERCLEAccess().getNomCercleKeyword_0_0()); }
		)
		{ after(grammarAccess.getCERCLEAccess().getNomCercleKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__DebutAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCERCLEAccess().getDebutDEBUTParserRuleCall_1_0()); }
		ruleDEBUT
		{ after(grammarAccess.getCERCLEAccess().getDebutDEBUTParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__RayonAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCERCLEAccess().getRayonREELParserRuleCall_2_2_0()); }
		ruleREEL
		{ after(grammarAccess.getCERCLEAccess().getRayonREELParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__RetourAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCERCLEAccess().getRetourRETURNParserRuleCall_3_0()); }
		ruleRETURN
		{ after(grammarAccess.getCERCLEAccess().getRetourRETURNParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CERCLE__EndAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCERCLEAccess().getEndENDParserRuleCall_4_0()); }
		ruleEND
		{ after(grammarAccess.getCERCLEAccess().getEndENDParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RETURN__ResultatAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRETURNAccess().getResultatRETOURParserRuleCall_1_0()); }
		ruleRETOUR
		{ after(grammarAccess.getRETURNAccess().getResultatRETOURParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__REEL__ReelAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getREELAccess().getReelDOUBLETerminalRuleCall_0()); }
		RULE_DOUBLE
		{ after(grammarAccess.getREELAccess().getReelDOUBLETerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_DOUBLE : '-'? RULE_INT ('.' RULE_INT)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
