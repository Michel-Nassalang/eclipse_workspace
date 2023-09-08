/*
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.figure.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class FigureGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class PROGRAMMEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.PROGRAMME");
		private final Assignment cFigAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFigFIGUREParserRuleCall_0 = (RuleCall)cFigAssignment.eContents().get(0);
		
		//PROGRAMME :
		//    (fig=FIGURE)? ;
		@Override public ParserRule getRule() { return rule; }
		
		//(fig=FIGURE)?
		public Assignment getFigAssignment() { return cFigAssignment; }
		
		//FIGURE
		public RuleCall getFigFIGUREParserRuleCall_0() { return cFigFIGUREParserRuleCall_0; }
	}
	public class FIGUREElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.FIGURE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFigureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNomAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNomAlternatives_1_0 = (Alternatives)cNomAssignment_1.eContents().get(0);
		private final RuleCall cNomCERCLEParserRuleCall_1_0_0 = (RuleCall)cNomAlternatives_1_0.eContents().get(0);
		private final RuleCall cNomRECTANGLEParserRuleCall_1_0_1 = (RuleCall)cNomAlternatives_1_0.eContents().get(1);
		private final RuleCall cNomCARREParserRuleCall_1_0_2 = (RuleCall)cNomAlternatives_1_0.eContents().get(2);
		
		//FIGURE :
		//    'Figure' nom=(CERCLE| RECTANGLE | CARRE);
		@Override public ParserRule getRule() { return rule; }
		
		//'Figure' nom=(CERCLE| RECTANGLE | CARRE)
		public Group getGroup() { return cGroup; }
		
		//'Figure'
		public Keyword getFigureKeyword_0() { return cFigureKeyword_0; }
		
		//nom=(CERCLE| RECTANGLE | CARRE)
		public Assignment getNomAssignment_1() { return cNomAssignment_1; }
		
		//(CERCLE| RECTANGLE | CARRE)
		public Alternatives getNomAlternatives_1_0() { return cNomAlternatives_1_0; }
		
		//CERCLE
		public RuleCall getNomCERCLEParserRuleCall_1_0_0() { return cNomCERCLEParserRuleCall_1_0_0; }
		
		//RECTANGLE
		public RuleCall getNomRECTANGLEParserRuleCall_1_0_1() { return cNomRECTANGLEParserRuleCall_1_0_1; }
		
		//CARRE
		public RuleCall getNomCARREParserRuleCall_1_0_2() { return cNomCARREParserRuleCall_1_0_2; }
	}
	public class DEBUTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.DEBUT");
		private final Keyword cBEGINKeyword = (Keyword)rule.eContents().get(1);
		
		//DEBUT :
		//    'BEGIN' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'BEGIN'
		public Keyword getBEGINKeyword() { return cBEGINKeyword; }
	}
	public class CARREElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.CARRE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNomAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNomCarreKeyword_0_0 = (Keyword)cNomAssignment_0.eContents().get(0);
		private final Assignment cDebutAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDebutDEBUTParserRuleCall_1_0 = (RuleCall)cDebutAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCoteKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cCoteAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cCoteREELParserRuleCall_2_2_0 = (RuleCall)cCoteAssignment_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Assignment cRetourAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRetourRETURNParserRuleCall_3_0 = (RuleCall)cRetourAssignment_3.eContents().get(0);
		private final Assignment cEndAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEndENDParserRuleCall_4_0 = (RuleCall)cEndAssignment_4.eContents().get(0);
		
		//CARRE:
		//    nom='Carre'
		//    debut=DEBUT
		//    ('cote' ':' cote=REEL ';')
		//    retour=RETURN
		//    end=END
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//nom='Carre'
		//debut=DEBUT
		//('cote' ':' cote=REEL ';')
		//retour=RETURN
		//end=END
		public Group getGroup() { return cGroup; }
		
		//nom='Carre'
		public Assignment getNomAssignment_0() { return cNomAssignment_0; }
		
		//'Carre'
		public Keyword getNomCarreKeyword_0_0() { return cNomCarreKeyword_0_0; }
		
		//debut=DEBUT
		public Assignment getDebutAssignment_1() { return cDebutAssignment_1; }
		
		//DEBUT
		public RuleCall getDebutDEBUTParserRuleCall_1_0() { return cDebutDEBUTParserRuleCall_1_0; }
		
		//('cote' ':' cote=REEL ';')
		public Group getGroup_2() { return cGroup_2; }
		
		//'cote'
		public Keyword getCoteKeyword_2_0() { return cCoteKeyword_2_0; }
		
		//':'
		public Keyword getColonKeyword_2_1() { return cColonKeyword_2_1; }
		
		//cote=REEL
		public Assignment getCoteAssignment_2_2() { return cCoteAssignment_2_2; }
		
		//REEL
		public RuleCall getCoteREELParserRuleCall_2_2_0() { return cCoteREELParserRuleCall_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_3() { return cSemicolonKeyword_2_3; }
		
		//retour=RETURN
		public Assignment getRetourAssignment_3() { return cRetourAssignment_3; }
		
		//RETURN
		public RuleCall getRetourRETURNParserRuleCall_3_0() { return cRetourRETURNParserRuleCall_3_0; }
		
		//end=END
		public Assignment getEndAssignment_4() { return cEndAssignment_4; }
		
		//END
		public RuleCall getEndENDParserRuleCall_4_0() { return cEndENDParserRuleCall_4_0; }
	}
	public class RECTANGLEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.RECTANGLE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNomAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNomRectangleKeyword_0_0 = (Keyword)cNomAssignment_0.eContents().get(0);
		private final Assignment cDebutAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDebutDEBUTParserRuleCall_1_0 = (RuleCall)cDebutAssignment_1.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cLongueurKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Keyword cColonKeyword_2_0_1 = (Keyword)cGroup_2_0.eContents().get(1);
		private final Assignment cLongueurAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cLongueurREELParserRuleCall_2_0_2_0 = (RuleCall)cLongueurAssignment_2_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_0_3 = (Keyword)cGroup_2_0.eContents().get(3);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cLargeurKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Keyword cColonKeyword_2_1_1 = (Keyword)cGroup_2_1.eContents().get(1);
		private final Assignment cLargeurAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cLargeurREELParserRuleCall_2_1_2_0 = (RuleCall)cLargeurAssignment_2_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_1_3 = (Keyword)cGroup_2_1.eContents().get(3);
		private final Assignment cRetourAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRetourRETURNParserRuleCall_3_0 = (RuleCall)cRetourAssignment_3.eContents().get(0);
		private final Assignment cEndAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEndENDParserRuleCall_4_0 = (RuleCall)cEndAssignment_4.eContents().get(0);
		
		//RECTANGLE:
		//    nom='Rectangle'
		//    debut=DEBUT
		//    ('longueur' ':' longueur=REEL ';' &
		//    'largeur' ':' largeur=REEL ';' )
		//    retour=RETURN
		//    end=END
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//nom='Rectangle'
		//debut=DEBUT
		//('longueur' ':' longueur=REEL ';' &
		//'largeur' ':' largeur=REEL ';' )
		//retour=RETURN
		//end=END
		public Group getGroup() { return cGroup; }
		
		//nom='Rectangle'
		public Assignment getNomAssignment_0() { return cNomAssignment_0; }
		
		//'Rectangle'
		public Keyword getNomRectangleKeyword_0_0() { return cNomRectangleKeyword_0_0; }
		
		//debut=DEBUT
		public Assignment getDebutAssignment_1() { return cDebutAssignment_1; }
		
		//DEBUT
		public RuleCall getDebutDEBUTParserRuleCall_1_0() { return cDebutDEBUTParserRuleCall_1_0; }
		
		//('longueur' ':' longueur=REEL ';' &
		//'largeur' ':' largeur=REEL ';' )
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//'longueur' ':' longueur=REEL ';'
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'longueur'
		public Keyword getLongueurKeyword_2_0_0() { return cLongueurKeyword_2_0_0; }
		
		//':'
		public Keyword getColonKeyword_2_0_1() { return cColonKeyword_2_0_1; }
		
		//longueur=REEL
		public Assignment getLongueurAssignment_2_0_2() { return cLongueurAssignment_2_0_2; }
		
		//REEL
		public RuleCall getLongueurREELParserRuleCall_2_0_2_0() { return cLongueurREELParserRuleCall_2_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_0_3() { return cSemicolonKeyword_2_0_3; }
		
		//'largeur' ':' largeur=REEL ';'
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'largeur'
		public Keyword getLargeurKeyword_2_1_0() { return cLargeurKeyword_2_1_0; }
		
		//':'
		public Keyword getColonKeyword_2_1_1() { return cColonKeyword_2_1_1; }
		
		//largeur=REEL
		public Assignment getLargeurAssignment_2_1_2() { return cLargeurAssignment_2_1_2; }
		
		//REEL
		public RuleCall getLargeurREELParserRuleCall_2_1_2_0() { return cLargeurREELParserRuleCall_2_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_1_3() { return cSemicolonKeyword_2_1_3; }
		
		//retour=RETURN
		public Assignment getRetourAssignment_3() { return cRetourAssignment_3; }
		
		//RETURN
		public RuleCall getRetourRETURNParserRuleCall_3_0() { return cRetourRETURNParserRuleCall_3_0; }
		
		//end=END
		public Assignment getEndAssignment_4() { return cEndAssignment_4; }
		
		//END
		public RuleCall getEndENDParserRuleCall_4_0() { return cEndENDParserRuleCall_4_0; }
	}
	public class CERCLEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.CERCLE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNomAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNomCercleKeyword_0_0 = (Keyword)cNomAssignment_0.eContents().get(0);
		private final Assignment cDebutAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDebutDEBUTParserRuleCall_1_0 = (RuleCall)cDebutAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cRayonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cRayonAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cRayonREELParserRuleCall_2_2_0 = (RuleCall)cRayonAssignment_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Assignment cRetourAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRetourRETURNParserRuleCall_3_0 = (RuleCall)cRetourAssignment_3.eContents().get(0);
		private final Assignment cEndAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEndENDParserRuleCall_4_0 = (RuleCall)cEndAssignment_4.eContents().get(0);
		
		//CERCLE:
		//    nom='Cercle'
		//    debut=DEBUT
		//    ('rayon' ':' rayon=REEL ';')
		//    retour=RETURN
		//    end=END
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//nom='Cercle'
		//debut=DEBUT
		//('rayon' ':' rayon=REEL ';')
		//retour=RETURN
		//end=END
		public Group getGroup() { return cGroup; }
		
		//nom='Cercle'
		public Assignment getNomAssignment_0() { return cNomAssignment_0; }
		
		//'Cercle'
		public Keyword getNomCercleKeyword_0_0() { return cNomCercleKeyword_0_0; }
		
		//debut=DEBUT
		public Assignment getDebutAssignment_1() { return cDebutAssignment_1; }
		
		//DEBUT
		public RuleCall getDebutDEBUTParserRuleCall_1_0() { return cDebutDEBUTParserRuleCall_1_0; }
		
		//('rayon' ':' rayon=REEL ';')
		public Group getGroup_2() { return cGroup_2; }
		
		//'rayon'
		public Keyword getRayonKeyword_2_0() { return cRayonKeyword_2_0; }
		
		//':'
		public Keyword getColonKeyword_2_1() { return cColonKeyword_2_1; }
		
		//rayon=REEL
		public Assignment getRayonAssignment_2_2() { return cRayonAssignment_2_2; }
		
		//REEL
		public RuleCall getRayonREELParserRuleCall_2_2_0() { return cRayonREELParserRuleCall_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2_3() { return cSemicolonKeyword_2_3; }
		
		//retour=RETURN
		public Assignment getRetourAssignment_3() { return cRetourAssignment_3; }
		
		//RETURN
		public RuleCall getRetourRETURNParserRuleCall_3_0() { return cRetourRETURNParserRuleCall_3_0; }
		
		//end=END
		public Assignment getEndAssignment_4() { return cEndAssignment_4; }
		
		//END
		public RuleCall getEndENDParserRuleCall_4_0() { return cEndENDParserRuleCall_4_0; }
	}
	public class RETURNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.RETURN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReturnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cResultatAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cResultatRETOURParserRuleCall_1_0 = (RuleCall)cResultatAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//RETURN :
		//    'return' resultat=RETOUR ';' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'return' resultat=RETOUR ';'
		public Group getGroup() { return cGroup; }
		
		//'return'
		public Keyword getReturnKeyword_0() { return cReturnKeyword_0; }
		
		//resultat=RETOUR
		public Assignment getResultatAssignment_1() { return cResultatAssignment_1; }
		
		//RETOUR
		public RuleCall getResultatRETOURParserRuleCall_1_0() { return cResultatRETOURParserRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class RETOURElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.RETOUR");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cSurfaceKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cPerimetreKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//RETOUR :
		//    'surface'|'perimetre';
		@Override public ParserRule getRule() { return rule; }
		
		//'surface'|'perimetre'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'surface'
		public Keyword getSurfaceKeyword_0() { return cSurfaceKeyword_0; }
		
		//'perimetre'
		public Keyword getPerimetreKeyword_1() { return cPerimetreKeyword_1; }
	}
	public class ENDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.END");
		private final Keyword cENDKeyword = (Keyword)rule.eContents().get(1);
		
		//END :
		//    'END' ;
		@Override public ParserRule getRule() { return rule; }
		
		//'END'
		public Keyword getENDKeyword() { return cENDKeyword; }
	}
	public class REELElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.REEL");
		private final Assignment cReelAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cReelDOUBLETerminalRuleCall_0 = (RuleCall)cReelAssignment.eContents().get(0);
		
		//REEL :
		//    reel=DOUBLE ;
		@Override public ParserRule getRule() { return rule; }
		
		//reel=DOUBLE
		public Assignment getReelAssignment() { return cReelAssignment; }
		
		//DOUBLE
		public RuleCall getReelDOUBLETerminalRuleCall_0() { return cReelDOUBLETerminalRuleCall_0; }
	}
	
	
	private final PROGRAMMEElements pPROGRAMME;
	private final FIGUREElements pFIGURE;
	private final DEBUTElements pDEBUT;
	private final CARREElements pCARRE;
	private final RECTANGLEElements pRECTANGLE;
	private final CERCLEElements pCERCLE;
	private final RETURNElements pRETURN;
	private final RETOURElements pRETOUR;
	private final ENDElements pEND;
	private final REELElements pREEL;
	private final TerminalRule tDOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FigureGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPROGRAMME = new PROGRAMMEElements();
		this.pFIGURE = new FIGUREElements();
		this.pDEBUT = new DEBUTElements();
		this.pCARRE = new CARREElements();
		this.pRECTANGLE = new RECTANGLEElements();
		this.pCERCLE = new CERCLEElements();
		this.pRETURN = new RETURNElements();
		this.pRETOUR = new RETOURElements();
		this.pEND = new ENDElements();
		this.pREEL = new REELElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ipsl.figure.Figure.DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.ipsl.figure.Figure".equals(grammar.getName())) {
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

	
	//PROGRAMME :
	//    (fig=FIGURE)? ;
	public PROGRAMMEElements getPROGRAMMEAccess() {
		return pPROGRAMME;
	}
	
	public ParserRule getPROGRAMMERule() {
		return getPROGRAMMEAccess().getRule();
	}
	
	//FIGURE :
	//    'Figure' nom=(CERCLE| RECTANGLE | CARRE);
	public FIGUREElements getFIGUREAccess() {
		return pFIGURE;
	}
	
	public ParserRule getFIGURERule() {
		return getFIGUREAccess().getRule();
	}
	
	//DEBUT :
	//    'BEGIN' ;
	public DEBUTElements getDEBUTAccess() {
		return pDEBUT;
	}
	
	public ParserRule getDEBUTRule() {
		return getDEBUTAccess().getRule();
	}
	
	//CARRE:
	//    nom='Carre'
	//    debut=DEBUT
	//    ('cote' ':' cote=REEL ';')
	//    retour=RETURN
	//    end=END
	//;
	public CARREElements getCARREAccess() {
		return pCARRE;
	}
	
	public ParserRule getCARRERule() {
		return getCARREAccess().getRule();
	}
	
	//RECTANGLE:
	//    nom='Rectangle'
	//    debut=DEBUT
	//    ('longueur' ':' longueur=REEL ';' &
	//    'largeur' ':' largeur=REEL ';' )
	//    retour=RETURN
	//    end=END
	//;
	public RECTANGLEElements getRECTANGLEAccess() {
		return pRECTANGLE;
	}
	
	public ParserRule getRECTANGLERule() {
		return getRECTANGLEAccess().getRule();
	}
	
	//CERCLE:
	//    nom='Cercle'
	//    debut=DEBUT
	//    ('rayon' ':' rayon=REEL ';')
	//    retour=RETURN
	//    end=END
	//;
	public CERCLEElements getCERCLEAccess() {
		return pCERCLE;
	}
	
	public ParserRule getCERCLERule() {
		return getCERCLEAccess().getRule();
	}
	
	//RETURN :
	//    'return' resultat=RETOUR ';' ;
	public RETURNElements getRETURNAccess() {
		return pRETURN;
	}
	
	public ParserRule getRETURNRule() {
		return getRETURNAccess().getRule();
	}
	
	//RETOUR :
	//    'surface'|'perimetre';
	public RETOURElements getRETOURAccess() {
		return pRETOUR;
	}
	
	public ParserRule getRETOURRule() {
		return getRETOURAccess().getRule();
	}
	
	//END :
	//    'END' ;
	public ENDElements getENDAccess() {
		return pEND;
	}
	
	public ParserRule getENDRule() {
		return getENDAccess().getRule();
	}
	
	//REEL :
	//    reel=DOUBLE ;
	public REELElements getREELAccess() {
		return pREEL;
	}
	
	public ParserRule getREELRule() {
		return getREELAccess().getRule();
	}
	
	//terminal DOUBLE returns ecore::EDouble: '-'?INT('.'INT)?;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
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
