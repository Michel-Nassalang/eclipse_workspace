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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFigureParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BEGIN'", "'END'", "'surface'", "'perimetre'", "'Figure'", "'cote'", "':'", "';'", "'longueur'", "'largeur'", "'rayon'", "'return'", "'Carre'", "'Rectangle'", "'Cercle'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=4;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFigureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFigureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFigureParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFigure.g"; }


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



    // $ANTLR start "entryRulePROGRAMME"
    // InternalFigure.g:53:1: entryRulePROGRAMME : rulePROGRAMME EOF ;
    public final void entryRulePROGRAMME() throws RecognitionException {
        try {
            // InternalFigure.g:54:1: ( rulePROGRAMME EOF )
            // InternalFigure.g:55:1: rulePROGRAMME EOF
            {
             before(grammarAccess.getPROGRAMMERule()); 
            pushFollow(FOLLOW_1);
            rulePROGRAMME();

            state._fsp--;

             after(grammarAccess.getPROGRAMMERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePROGRAMME"


    // $ANTLR start "rulePROGRAMME"
    // InternalFigure.g:62:1: rulePROGRAMME : ( ( rule__PROGRAMME__FigAssignment )? ) ;
    public final void rulePROGRAMME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:66:2: ( ( ( rule__PROGRAMME__FigAssignment )? ) )
            // InternalFigure.g:67:2: ( ( rule__PROGRAMME__FigAssignment )? )
            {
            // InternalFigure.g:67:2: ( ( rule__PROGRAMME__FigAssignment )? )
            // InternalFigure.g:68:3: ( rule__PROGRAMME__FigAssignment )?
            {
             before(grammarAccess.getPROGRAMMEAccess().getFigAssignment()); 
            // InternalFigure.g:69:3: ( rule__PROGRAMME__FigAssignment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalFigure.g:69:4: rule__PROGRAMME__FigAssignment
                    {
                    pushFollow(FOLLOW_2);
                    rule__PROGRAMME__FigAssignment();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPROGRAMMEAccess().getFigAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePROGRAMME"


    // $ANTLR start "entryRuleFIGURE"
    // InternalFigure.g:78:1: entryRuleFIGURE : ruleFIGURE EOF ;
    public final void entryRuleFIGURE() throws RecognitionException {
        try {
            // InternalFigure.g:79:1: ( ruleFIGURE EOF )
            // InternalFigure.g:80:1: ruleFIGURE EOF
            {
             before(grammarAccess.getFIGURERule()); 
            pushFollow(FOLLOW_1);
            ruleFIGURE();

            state._fsp--;

             after(grammarAccess.getFIGURERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFIGURE"


    // $ANTLR start "ruleFIGURE"
    // InternalFigure.g:87:1: ruleFIGURE : ( ( rule__FIGURE__Group__0 ) ) ;
    public final void ruleFIGURE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:91:2: ( ( ( rule__FIGURE__Group__0 ) ) )
            // InternalFigure.g:92:2: ( ( rule__FIGURE__Group__0 ) )
            {
            // InternalFigure.g:92:2: ( ( rule__FIGURE__Group__0 ) )
            // InternalFigure.g:93:3: ( rule__FIGURE__Group__0 )
            {
             before(grammarAccess.getFIGUREAccess().getGroup()); 
            // InternalFigure.g:94:3: ( rule__FIGURE__Group__0 )
            // InternalFigure.g:94:4: rule__FIGURE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FIGURE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFIGUREAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFIGURE"


    // $ANTLR start "entryRuleDEBUT"
    // InternalFigure.g:103:1: entryRuleDEBUT : ruleDEBUT EOF ;
    public final void entryRuleDEBUT() throws RecognitionException {
        try {
            // InternalFigure.g:104:1: ( ruleDEBUT EOF )
            // InternalFigure.g:105:1: ruleDEBUT EOF
            {
             before(grammarAccess.getDEBUTRule()); 
            pushFollow(FOLLOW_1);
            ruleDEBUT();

            state._fsp--;

             after(grammarAccess.getDEBUTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDEBUT"


    // $ANTLR start "ruleDEBUT"
    // InternalFigure.g:112:1: ruleDEBUT : ( 'BEGIN' ) ;
    public final void ruleDEBUT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:116:2: ( ( 'BEGIN' ) )
            // InternalFigure.g:117:2: ( 'BEGIN' )
            {
            // InternalFigure.g:117:2: ( 'BEGIN' )
            // InternalFigure.g:118:3: 'BEGIN'
            {
             before(grammarAccess.getDEBUTAccess().getBEGINKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDEBUTAccess().getBEGINKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDEBUT"


    // $ANTLR start "entryRuleCARRE"
    // InternalFigure.g:128:1: entryRuleCARRE : ruleCARRE EOF ;
    public final void entryRuleCARRE() throws RecognitionException {
        try {
            // InternalFigure.g:129:1: ( ruleCARRE EOF )
            // InternalFigure.g:130:1: ruleCARRE EOF
            {
             before(grammarAccess.getCARRERule()); 
            pushFollow(FOLLOW_1);
            ruleCARRE();

            state._fsp--;

             after(grammarAccess.getCARRERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCARRE"


    // $ANTLR start "ruleCARRE"
    // InternalFigure.g:137:1: ruleCARRE : ( ( rule__CARRE__Group__0 ) ) ;
    public final void ruleCARRE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:141:2: ( ( ( rule__CARRE__Group__0 ) ) )
            // InternalFigure.g:142:2: ( ( rule__CARRE__Group__0 ) )
            {
            // InternalFigure.g:142:2: ( ( rule__CARRE__Group__0 ) )
            // InternalFigure.g:143:3: ( rule__CARRE__Group__0 )
            {
             before(grammarAccess.getCARREAccess().getGroup()); 
            // InternalFigure.g:144:3: ( rule__CARRE__Group__0 )
            // InternalFigure.g:144:4: rule__CARRE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CARRE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCARREAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCARRE"


    // $ANTLR start "entryRuleRECTANGLE"
    // InternalFigure.g:153:1: entryRuleRECTANGLE : ruleRECTANGLE EOF ;
    public final void entryRuleRECTANGLE() throws RecognitionException {
        try {
            // InternalFigure.g:154:1: ( ruleRECTANGLE EOF )
            // InternalFigure.g:155:1: ruleRECTANGLE EOF
            {
             before(grammarAccess.getRECTANGLERule()); 
            pushFollow(FOLLOW_1);
            ruleRECTANGLE();

            state._fsp--;

             after(grammarAccess.getRECTANGLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRECTANGLE"


    // $ANTLR start "ruleRECTANGLE"
    // InternalFigure.g:162:1: ruleRECTANGLE : ( ( rule__RECTANGLE__Group__0 ) ) ;
    public final void ruleRECTANGLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:166:2: ( ( ( rule__RECTANGLE__Group__0 ) ) )
            // InternalFigure.g:167:2: ( ( rule__RECTANGLE__Group__0 ) )
            {
            // InternalFigure.g:167:2: ( ( rule__RECTANGLE__Group__0 ) )
            // InternalFigure.g:168:3: ( rule__RECTANGLE__Group__0 )
            {
             before(grammarAccess.getRECTANGLEAccess().getGroup()); 
            // InternalFigure.g:169:3: ( rule__RECTANGLE__Group__0 )
            // InternalFigure.g:169:4: rule__RECTANGLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRECTANGLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRECTANGLE"


    // $ANTLR start "entryRuleCERCLE"
    // InternalFigure.g:178:1: entryRuleCERCLE : ruleCERCLE EOF ;
    public final void entryRuleCERCLE() throws RecognitionException {
        try {
            // InternalFigure.g:179:1: ( ruleCERCLE EOF )
            // InternalFigure.g:180:1: ruleCERCLE EOF
            {
             before(grammarAccess.getCERCLERule()); 
            pushFollow(FOLLOW_1);
            ruleCERCLE();

            state._fsp--;

             after(grammarAccess.getCERCLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCERCLE"


    // $ANTLR start "ruleCERCLE"
    // InternalFigure.g:187:1: ruleCERCLE : ( ( rule__CERCLE__Group__0 ) ) ;
    public final void ruleCERCLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:191:2: ( ( ( rule__CERCLE__Group__0 ) ) )
            // InternalFigure.g:192:2: ( ( rule__CERCLE__Group__0 ) )
            {
            // InternalFigure.g:192:2: ( ( rule__CERCLE__Group__0 ) )
            // InternalFigure.g:193:3: ( rule__CERCLE__Group__0 )
            {
             before(grammarAccess.getCERCLEAccess().getGroup()); 
            // InternalFigure.g:194:3: ( rule__CERCLE__Group__0 )
            // InternalFigure.g:194:4: rule__CERCLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CERCLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCERCLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCERCLE"


    // $ANTLR start "entryRuleRETURN"
    // InternalFigure.g:203:1: entryRuleRETURN : ruleRETURN EOF ;
    public final void entryRuleRETURN() throws RecognitionException {
        try {
            // InternalFigure.g:204:1: ( ruleRETURN EOF )
            // InternalFigure.g:205:1: ruleRETURN EOF
            {
             before(grammarAccess.getRETURNRule()); 
            pushFollow(FOLLOW_1);
            ruleRETURN();

            state._fsp--;

             after(grammarAccess.getRETURNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRETURN"


    // $ANTLR start "ruleRETURN"
    // InternalFigure.g:212:1: ruleRETURN : ( ( rule__RETURN__Group__0 ) ) ;
    public final void ruleRETURN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:216:2: ( ( ( rule__RETURN__Group__0 ) ) )
            // InternalFigure.g:217:2: ( ( rule__RETURN__Group__0 ) )
            {
            // InternalFigure.g:217:2: ( ( rule__RETURN__Group__0 ) )
            // InternalFigure.g:218:3: ( rule__RETURN__Group__0 )
            {
             before(grammarAccess.getRETURNAccess().getGroup()); 
            // InternalFigure.g:219:3: ( rule__RETURN__Group__0 )
            // InternalFigure.g:219:4: rule__RETURN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RETURN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRETURNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRETURN"


    // $ANTLR start "entryRuleRETOUR"
    // InternalFigure.g:228:1: entryRuleRETOUR : ruleRETOUR EOF ;
    public final void entryRuleRETOUR() throws RecognitionException {
        try {
            // InternalFigure.g:229:1: ( ruleRETOUR EOF )
            // InternalFigure.g:230:1: ruleRETOUR EOF
            {
             before(grammarAccess.getRETOURRule()); 
            pushFollow(FOLLOW_1);
            ruleRETOUR();

            state._fsp--;

             after(grammarAccess.getRETOURRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRETOUR"


    // $ANTLR start "ruleRETOUR"
    // InternalFigure.g:237:1: ruleRETOUR : ( ( rule__RETOUR__Alternatives ) ) ;
    public final void ruleRETOUR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:241:2: ( ( ( rule__RETOUR__Alternatives ) ) )
            // InternalFigure.g:242:2: ( ( rule__RETOUR__Alternatives ) )
            {
            // InternalFigure.g:242:2: ( ( rule__RETOUR__Alternatives ) )
            // InternalFigure.g:243:3: ( rule__RETOUR__Alternatives )
            {
             before(grammarAccess.getRETOURAccess().getAlternatives()); 
            // InternalFigure.g:244:3: ( rule__RETOUR__Alternatives )
            // InternalFigure.g:244:4: rule__RETOUR__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RETOUR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRETOURAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRETOUR"


    // $ANTLR start "entryRuleEND"
    // InternalFigure.g:253:1: entryRuleEND : ruleEND EOF ;
    public final void entryRuleEND() throws RecognitionException {
        try {
            // InternalFigure.g:254:1: ( ruleEND EOF )
            // InternalFigure.g:255:1: ruleEND EOF
            {
             before(grammarAccess.getENDRule()); 
            pushFollow(FOLLOW_1);
            ruleEND();

            state._fsp--;

             after(grammarAccess.getENDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEND"


    // $ANTLR start "ruleEND"
    // InternalFigure.g:262:1: ruleEND : ( 'END' ) ;
    public final void ruleEND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:266:2: ( ( 'END' ) )
            // InternalFigure.g:267:2: ( 'END' )
            {
            // InternalFigure.g:267:2: ( 'END' )
            // InternalFigure.g:268:3: 'END'
            {
             before(grammarAccess.getENDAccess().getENDKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getENDAccess().getENDKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEND"


    // $ANTLR start "entryRuleREEL"
    // InternalFigure.g:278:1: entryRuleREEL : ruleREEL EOF ;
    public final void entryRuleREEL() throws RecognitionException {
        try {
            // InternalFigure.g:279:1: ( ruleREEL EOF )
            // InternalFigure.g:280:1: ruleREEL EOF
            {
             before(grammarAccess.getREELRule()); 
            pushFollow(FOLLOW_1);
            ruleREEL();

            state._fsp--;

             after(grammarAccess.getREELRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleREEL"


    // $ANTLR start "ruleREEL"
    // InternalFigure.g:287:1: ruleREEL : ( ( rule__REEL__ReelAssignment ) ) ;
    public final void ruleREEL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:291:2: ( ( ( rule__REEL__ReelAssignment ) ) )
            // InternalFigure.g:292:2: ( ( rule__REEL__ReelAssignment ) )
            {
            // InternalFigure.g:292:2: ( ( rule__REEL__ReelAssignment ) )
            // InternalFigure.g:293:3: ( rule__REEL__ReelAssignment )
            {
             before(grammarAccess.getREELAccess().getReelAssignment()); 
            // InternalFigure.g:294:3: ( rule__REEL__ReelAssignment )
            // InternalFigure.g:294:4: rule__REEL__ReelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__REEL__ReelAssignment();

            state._fsp--;


            }

             after(grammarAccess.getREELAccess().getReelAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREEL"


    // $ANTLR start "rule__FIGURE__NomAlternatives_1_0"
    // InternalFigure.g:302:1: rule__FIGURE__NomAlternatives_1_0 : ( ( ruleCERCLE ) | ( ruleRECTANGLE ) | ( ruleCARRE ) );
    public final void rule__FIGURE__NomAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:306:1: ( ( ruleCERCLE ) | ( ruleRECTANGLE ) | ( ruleCARRE ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFigure.g:307:2: ( ruleCERCLE )
                    {
                    // InternalFigure.g:307:2: ( ruleCERCLE )
                    // InternalFigure.g:308:3: ruleCERCLE
                    {
                     before(grammarAccess.getFIGUREAccess().getNomCERCLEParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCERCLE();

                    state._fsp--;

                     after(grammarAccess.getFIGUREAccess().getNomCERCLEParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFigure.g:313:2: ( ruleRECTANGLE )
                    {
                    // InternalFigure.g:313:2: ( ruleRECTANGLE )
                    // InternalFigure.g:314:3: ruleRECTANGLE
                    {
                     before(grammarAccess.getFIGUREAccess().getNomRECTANGLEParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRECTANGLE();

                    state._fsp--;

                     after(grammarAccess.getFIGUREAccess().getNomRECTANGLEParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFigure.g:319:2: ( ruleCARRE )
                    {
                    // InternalFigure.g:319:2: ( ruleCARRE )
                    // InternalFigure.g:320:3: ruleCARRE
                    {
                     before(grammarAccess.getFIGUREAccess().getNomCARREParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCARRE();

                    state._fsp--;

                     after(grammarAccess.getFIGUREAccess().getNomCARREParserRuleCall_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIGURE__NomAlternatives_1_0"


    // $ANTLR start "rule__RETOUR__Alternatives"
    // InternalFigure.g:329:1: rule__RETOUR__Alternatives : ( ( 'surface' ) | ( 'perimetre' ) );
    public final void rule__RETOUR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:333:1: ( ( 'surface' ) | ( 'perimetre' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFigure.g:334:2: ( 'surface' )
                    {
                    // InternalFigure.g:334:2: ( 'surface' )
                    // InternalFigure.g:335:3: 'surface'
                    {
                     before(grammarAccess.getRETOURAccess().getSurfaceKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRETOURAccess().getSurfaceKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFigure.g:340:2: ( 'perimetre' )
                    {
                    // InternalFigure.g:340:2: ( 'perimetre' )
                    // InternalFigure.g:341:3: 'perimetre'
                    {
                     before(grammarAccess.getRETOURAccess().getPerimetreKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRETOURAccess().getPerimetreKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RETOUR__Alternatives"


    // $ANTLR start "rule__FIGURE__Group__0"
    // InternalFigure.g:350:1: rule__FIGURE__Group__0 : rule__FIGURE__Group__0__Impl rule__FIGURE__Group__1 ;
    public final void rule__FIGURE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:354:1: ( rule__FIGURE__Group__0__Impl rule__FIGURE__Group__1 )
            // InternalFigure.g:355:2: rule__FIGURE__Group__0__Impl rule__FIGURE__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FIGURE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FIGURE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIGURE__Group__0"


    // $ANTLR start "rule__FIGURE__Group__0__Impl"
    // InternalFigure.g:362:1: rule__FIGURE__Group__0__Impl : ( 'Figure' ) ;
    public final void rule__FIGURE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:366:1: ( ( 'Figure' ) )
            // InternalFigure.g:367:1: ( 'Figure' )
            {
            // InternalFigure.g:367:1: ( 'Figure' )
            // InternalFigure.g:368:2: 'Figure'
            {
             before(grammarAccess.getFIGUREAccess().getFigureKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFIGUREAccess().getFigureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIGURE__Group__0__Impl"


    // $ANTLR start "rule__FIGURE__Group__1"
    // InternalFigure.g:377:1: rule__FIGURE__Group__1 : rule__FIGURE__Group__1__Impl ;
    public final void rule__FIGURE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:381:1: ( rule__FIGURE__Group__1__Impl )
            // InternalFigure.g:382:2: rule__FIGURE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FIGURE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIGURE__Group__1"


    // $ANTLR start "rule__FIGURE__Group__1__Impl"
    // InternalFigure.g:388:1: rule__FIGURE__Group__1__Impl : ( ( rule__FIGURE__NomAssignment_1 ) ) ;
    public final void rule__FIGURE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:392:1: ( ( ( rule__FIGURE__NomAssignment_1 ) ) )
            // InternalFigure.g:393:1: ( ( rule__FIGURE__NomAssignment_1 ) )
            {
            // InternalFigure.g:393:1: ( ( rule__FIGURE__NomAssignment_1 ) )
            // InternalFigure.g:394:2: ( rule__FIGURE__NomAssignment_1 )
            {
             before(grammarAccess.getFIGUREAccess().getNomAssignment_1()); 
            // InternalFigure.g:395:2: ( rule__FIGURE__NomAssignment_1 )
            // InternalFigure.g:395:3: rule__FIGURE__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FIGURE__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFIGUREAccess().getNomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIGURE__Group__1__Impl"


    // $ANTLR start "rule__CARRE__Group__0"
    // InternalFigure.g:404:1: rule__CARRE__Group__0 : rule__CARRE__Group__0__Impl rule__CARRE__Group__1 ;
    public final void rule__CARRE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:408:1: ( rule__CARRE__Group__0__Impl rule__CARRE__Group__1 )
            // InternalFigure.g:409:2: rule__CARRE__Group__0__Impl rule__CARRE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CARRE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CARRE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group__0"


    // $ANTLR start "rule__CARRE__Group__0__Impl"
    // InternalFigure.g:416:1: rule__CARRE__Group__0__Impl : ( ( rule__CARRE__NomAssignment_0 ) ) ;
    public final void rule__CARRE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:420:1: ( ( ( rule__CARRE__NomAssignment_0 ) ) )
            // InternalFigure.g:421:1: ( ( rule__CARRE__NomAssignment_0 ) )
            {
            // InternalFigure.g:421:1: ( ( rule__CARRE__NomAssignment_0 ) )
            // InternalFigure.g:422:2: ( rule__CARRE__NomAssignment_0 )
            {
             before(grammarAccess.getCARREAccess().getNomAssignment_0()); 
            // InternalFigure.g:423:2: ( rule__CARRE__NomAssignment_0 )
            // InternalFigure.g:423:3: rule__CARRE__NomAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CARRE__NomAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCARREAccess().getNomAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group__0__Impl"


    // $ANTLR start "rule__CARRE__Group__1"
    // InternalFigure.g:431:1: rule__CARRE__Group__1 : rule__CARRE__Group__1__Impl rule__CARRE__Group__2 ;
    public final void rule__CARRE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:435:1: ( rule__CARRE__Group__1__Impl rule__CARRE__Group__2 )
            // InternalFigure.g:436:2: rule__CARRE__Group__1__Impl rule__CARRE__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CARRE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CARRE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group__1"


    // $ANTLR start "rule__CARRE__Group__1__Impl"
    // InternalFigure.g:443:1: rule__CARRE__Group__1__Impl : ( ( rule__CARRE__DebutAssignment_1 ) ) ;
    public final void rule__CARRE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:447:1: ( ( ( rule__CARRE__DebutAssignment_1 ) ) )
            // InternalFigure.g:448:1: ( ( rule__CARRE__DebutAssignment_1 ) )
            {
            // InternalFigure.g:448:1: ( ( rule__CARRE__DebutAssignment_1 ) )
            // InternalFigure.g:449:2: ( rule__CARRE__DebutAssignment_1 )
            {
             before(grammarAccess.getCARREAccess().getDebutAssignment_1()); 
            // InternalFigure.g:450:2: ( rule__CARRE__DebutAssignment_1 )
            // InternalFigure.g:450:3: rule__CARRE__DebutAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CARRE__DebutAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCARREAccess().getDebutAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group__1__Impl"


    // $ANTLR start "rule__CARRE__Group__2"
    // InternalFigure.g:458:1: rule__CARRE__Group__2 : rule__CARRE__Group__2__Impl rule__CARRE__Group__3 ;
    public final void rule__CARRE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:462:1: ( rule__CARRE__Group__2__Impl rule__CARRE__Group__3 )
            // InternalFigure.g:463:2: rule__CARRE__Group__2__Impl rule__CARRE__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CARRE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CARRE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group__2"


    // $ANTLR start "rule__CARRE__Group__2__Impl"
    // InternalFigure.g:470:1: rule__CARRE__Group__2__Impl : ( ( rule__CARRE__Group_2__0 ) ) ;
    public final void rule__CARRE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:474:1: ( ( ( rule__CARRE__Group_2__0 ) ) )
            // InternalFigure.g:475:1: ( ( rule__CARRE__Group_2__0 ) )
            {
            // InternalFigure.g:475:1: ( ( rule__CARRE__Group_2__0 ) )
            // InternalFigure.g:476:2: ( rule__CARRE__Group_2__0 )
            {
             before(grammarAccess.getCARREAccess().getGroup_2()); 
            // InternalFigure.g:477:2: ( rule__CARRE__Group_2__0 )
            // InternalFigure.g:477:3: rule__CARRE__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__CARRE__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getCARREAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group__2__Impl"


    // $ANTLR start "rule__CARRE__Group__3"
    // InternalFigure.g:485:1: rule__CARRE__Group__3 : rule__CARRE__Group__3__Impl rule__CARRE__Group__4 ;
    public final void rule__CARRE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:489:1: ( rule__CARRE__Group__3__Impl rule__CARRE__Group__4 )
            // InternalFigure.g:490:2: rule__CARRE__Group__3__Impl rule__CARRE__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__CARRE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CARRE__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group__3"


    // $ANTLR start "rule__CARRE__Group__3__Impl"
    // InternalFigure.g:497:1: rule__CARRE__Group__3__Impl : ( ( rule__CARRE__RetourAssignment_3 ) ) ;
    public final void rule__CARRE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:501:1: ( ( ( rule__CARRE__RetourAssignment_3 ) ) )
            // InternalFigure.g:502:1: ( ( rule__CARRE__RetourAssignment_3 ) )
            {
            // InternalFigure.g:502:1: ( ( rule__CARRE__RetourAssignment_3 ) )
            // InternalFigure.g:503:2: ( rule__CARRE__RetourAssignment_3 )
            {
             before(grammarAccess.getCARREAccess().getRetourAssignment_3()); 
            // InternalFigure.g:504:2: ( rule__CARRE__RetourAssignment_3 )
            // InternalFigure.g:504:3: rule__CARRE__RetourAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CARRE__RetourAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCARREAccess().getRetourAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group__3__Impl"


    // $ANTLR start "rule__CARRE__Group__4"
    // InternalFigure.g:512:1: rule__CARRE__Group__4 : rule__CARRE__Group__4__Impl ;
    public final void rule__CARRE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:516:1: ( rule__CARRE__Group__4__Impl )
            // InternalFigure.g:517:2: rule__CARRE__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CARRE__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group__4"


    // $ANTLR start "rule__CARRE__Group__4__Impl"
    // InternalFigure.g:523:1: rule__CARRE__Group__4__Impl : ( ( rule__CARRE__EndAssignment_4 ) ) ;
    public final void rule__CARRE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:527:1: ( ( ( rule__CARRE__EndAssignment_4 ) ) )
            // InternalFigure.g:528:1: ( ( rule__CARRE__EndAssignment_4 ) )
            {
            // InternalFigure.g:528:1: ( ( rule__CARRE__EndAssignment_4 ) )
            // InternalFigure.g:529:2: ( rule__CARRE__EndAssignment_4 )
            {
             before(grammarAccess.getCARREAccess().getEndAssignment_4()); 
            // InternalFigure.g:530:2: ( rule__CARRE__EndAssignment_4 )
            // InternalFigure.g:530:3: rule__CARRE__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CARRE__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCARREAccess().getEndAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group__4__Impl"


    // $ANTLR start "rule__CARRE__Group_2__0"
    // InternalFigure.g:539:1: rule__CARRE__Group_2__0 : rule__CARRE__Group_2__0__Impl rule__CARRE__Group_2__1 ;
    public final void rule__CARRE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:543:1: ( rule__CARRE__Group_2__0__Impl rule__CARRE__Group_2__1 )
            // InternalFigure.g:544:2: rule__CARRE__Group_2__0__Impl rule__CARRE__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__CARRE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CARRE__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group_2__0"


    // $ANTLR start "rule__CARRE__Group_2__0__Impl"
    // InternalFigure.g:551:1: rule__CARRE__Group_2__0__Impl : ( 'cote' ) ;
    public final void rule__CARRE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:555:1: ( ( 'cote' ) )
            // InternalFigure.g:556:1: ( 'cote' )
            {
            // InternalFigure.g:556:1: ( 'cote' )
            // InternalFigure.g:557:2: 'cote'
            {
             before(grammarAccess.getCARREAccess().getCoteKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCARREAccess().getCoteKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group_2__0__Impl"


    // $ANTLR start "rule__CARRE__Group_2__1"
    // InternalFigure.g:566:1: rule__CARRE__Group_2__1 : rule__CARRE__Group_2__1__Impl rule__CARRE__Group_2__2 ;
    public final void rule__CARRE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:570:1: ( rule__CARRE__Group_2__1__Impl rule__CARRE__Group_2__2 )
            // InternalFigure.g:571:2: rule__CARRE__Group_2__1__Impl rule__CARRE__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__CARRE__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CARRE__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group_2__1"


    // $ANTLR start "rule__CARRE__Group_2__1__Impl"
    // InternalFigure.g:578:1: rule__CARRE__Group_2__1__Impl : ( ':' ) ;
    public final void rule__CARRE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:582:1: ( ( ':' ) )
            // InternalFigure.g:583:1: ( ':' )
            {
            // InternalFigure.g:583:1: ( ':' )
            // InternalFigure.g:584:2: ':'
            {
             before(grammarAccess.getCARREAccess().getColonKeyword_2_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCARREAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group_2__1__Impl"


    // $ANTLR start "rule__CARRE__Group_2__2"
    // InternalFigure.g:593:1: rule__CARRE__Group_2__2 : rule__CARRE__Group_2__2__Impl rule__CARRE__Group_2__3 ;
    public final void rule__CARRE__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:597:1: ( rule__CARRE__Group_2__2__Impl rule__CARRE__Group_2__3 )
            // InternalFigure.g:598:2: rule__CARRE__Group_2__2__Impl rule__CARRE__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__CARRE__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CARRE__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group_2__2"


    // $ANTLR start "rule__CARRE__Group_2__2__Impl"
    // InternalFigure.g:605:1: rule__CARRE__Group_2__2__Impl : ( ( rule__CARRE__CoteAssignment_2_2 ) ) ;
    public final void rule__CARRE__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:609:1: ( ( ( rule__CARRE__CoteAssignment_2_2 ) ) )
            // InternalFigure.g:610:1: ( ( rule__CARRE__CoteAssignment_2_2 ) )
            {
            // InternalFigure.g:610:1: ( ( rule__CARRE__CoteAssignment_2_2 ) )
            // InternalFigure.g:611:2: ( rule__CARRE__CoteAssignment_2_2 )
            {
             before(grammarAccess.getCARREAccess().getCoteAssignment_2_2()); 
            // InternalFigure.g:612:2: ( rule__CARRE__CoteAssignment_2_2 )
            // InternalFigure.g:612:3: rule__CARRE__CoteAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__CARRE__CoteAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getCARREAccess().getCoteAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group_2__2__Impl"


    // $ANTLR start "rule__CARRE__Group_2__3"
    // InternalFigure.g:620:1: rule__CARRE__Group_2__3 : rule__CARRE__Group_2__3__Impl ;
    public final void rule__CARRE__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:624:1: ( rule__CARRE__Group_2__3__Impl )
            // InternalFigure.g:625:2: rule__CARRE__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CARRE__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group_2__3"


    // $ANTLR start "rule__CARRE__Group_2__3__Impl"
    // InternalFigure.g:631:1: rule__CARRE__Group_2__3__Impl : ( ';' ) ;
    public final void rule__CARRE__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:635:1: ( ( ';' ) )
            // InternalFigure.g:636:1: ( ';' )
            {
            // InternalFigure.g:636:1: ( ';' )
            // InternalFigure.g:637:2: ';'
            {
             before(grammarAccess.getCARREAccess().getSemicolonKeyword_2_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCARREAccess().getSemicolonKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__Group_2__3__Impl"


    // $ANTLR start "rule__RECTANGLE__Group__0"
    // InternalFigure.g:647:1: rule__RECTANGLE__Group__0 : rule__RECTANGLE__Group__0__Impl rule__RECTANGLE__Group__1 ;
    public final void rule__RECTANGLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:651:1: ( rule__RECTANGLE__Group__0__Impl rule__RECTANGLE__Group__1 )
            // InternalFigure.g:652:2: rule__RECTANGLE__Group__0__Impl rule__RECTANGLE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RECTANGLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group__0"


    // $ANTLR start "rule__RECTANGLE__Group__0__Impl"
    // InternalFigure.g:659:1: rule__RECTANGLE__Group__0__Impl : ( ( rule__RECTANGLE__NomAssignment_0 ) ) ;
    public final void rule__RECTANGLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:663:1: ( ( ( rule__RECTANGLE__NomAssignment_0 ) ) )
            // InternalFigure.g:664:1: ( ( rule__RECTANGLE__NomAssignment_0 ) )
            {
            // InternalFigure.g:664:1: ( ( rule__RECTANGLE__NomAssignment_0 ) )
            // InternalFigure.g:665:2: ( rule__RECTANGLE__NomAssignment_0 )
            {
             before(grammarAccess.getRECTANGLEAccess().getNomAssignment_0()); 
            // InternalFigure.g:666:2: ( rule__RECTANGLE__NomAssignment_0 )
            // InternalFigure.g:666:3: rule__RECTANGLE__NomAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__NomAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRECTANGLEAccess().getNomAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group__0__Impl"


    // $ANTLR start "rule__RECTANGLE__Group__1"
    // InternalFigure.g:674:1: rule__RECTANGLE__Group__1 : rule__RECTANGLE__Group__1__Impl rule__RECTANGLE__Group__2 ;
    public final void rule__RECTANGLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:678:1: ( rule__RECTANGLE__Group__1__Impl rule__RECTANGLE__Group__2 )
            // InternalFigure.g:679:2: rule__RECTANGLE__Group__1__Impl rule__RECTANGLE__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RECTANGLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group__1"


    // $ANTLR start "rule__RECTANGLE__Group__1__Impl"
    // InternalFigure.g:686:1: rule__RECTANGLE__Group__1__Impl : ( ( rule__RECTANGLE__DebutAssignment_1 ) ) ;
    public final void rule__RECTANGLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:690:1: ( ( ( rule__RECTANGLE__DebutAssignment_1 ) ) )
            // InternalFigure.g:691:1: ( ( rule__RECTANGLE__DebutAssignment_1 ) )
            {
            // InternalFigure.g:691:1: ( ( rule__RECTANGLE__DebutAssignment_1 ) )
            // InternalFigure.g:692:2: ( rule__RECTANGLE__DebutAssignment_1 )
            {
             before(grammarAccess.getRECTANGLEAccess().getDebutAssignment_1()); 
            // InternalFigure.g:693:2: ( rule__RECTANGLE__DebutAssignment_1 )
            // InternalFigure.g:693:3: rule__RECTANGLE__DebutAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__DebutAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRECTANGLEAccess().getDebutAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group__1__Impl"


    // $ANTLR start "rule__RECTANGLE__Group__2"
    // InternalFigure.g:701:1: rule__RECTANGLE__Group__2 : rule__RECTANGLE__Group__2__Impl rule__RECTANGLE__Group__3 ;
    public final void rule__RECTANGLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:705:1: ( rule__RECTANGLE__Group__2__Impl rule__RECTANGLE__Group__3 )
            // InternalFigure.g:706:2: rule__RECTANGLE__Group__2__Impl rule__RECTANGLE__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RECTANGLE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group__2"


    // $ANTLR start "rule__RECTANGLE__Group__2__Impl"
    // InternalFigure.g:713:1: rule__RECTANGLE__Group__2__Impl : ( ( rule__RECTANGLE__UnorderedGroup_2 ) ) ;
    public final void rule__RECTANGLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:717:1: ( ( ( rule__RECTANGLE__UnorderedGroup_2 ) ) )
            // InternalFigure.g:718:1: ( ( rule__RECTANGLE__UnorderedGroup_2 ) )
            {
            // InternalFigure.g:718:1: ( ( rule__RECTANGLE__UnorderedGroup_2 ) )
            // InternalFigure.g:719:2: ( rule__RECTANGLE__UnorderedGroup_2 )
            {
             before(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2()); 
            // InternalFigure.g:720:2: ( rule__RECTANGLE__UnorderedGroup_2 )
            // InternalFigure.g:720:3: rule__RECTANGLE__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group__2__Impl"


    // $ANTLR start "rule__RECTANGLE__Group__3"
    // InternalFigure.g:728:1: rule__RECTANGLE__Group__3 : rule__RECTANGLE__Group__3__Impl rule__RECTANGLE__Group__4 ;
    public final void rule__RECTANGLE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:732:1: ( rule__RECTANGLE__Group__3__Impl rule__RECTANGLE__Group__4 )
            // InternalFigure.g:733:2: rule__RECTANGLE__Group__3__Impl rule__RECTANGLE__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__RECTANGLE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group__3"


    // $ANTLR start "rule__RECTANGLE__Group__3__Impl"
    // InternalFigure.g:740:1: rule__RECTANGLE__Group__3__Impl : ( ( rule__RECTANGLE__RetourAssignment_3 ) ) ;
    public final void rule__RECTANGLE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:744:1: ( ( ( rule__RECTANGLE__RetourAssignment_3 ) ) )
            // InternalFigure.g:745:1: ( ( rule__RECTANGLE__RetourAssignment_3 ) )
            {
            // InternalFigure.g:745:1: ( ( rule__RECTANGLE__RetourAssignment_3 ) )
            // InternalFigure.g:746:2: ( rule__RECTANGLE__RetourAssignment_3 )
            {
             before(grammarAccess.getRECTANGLEAccess().getRetourAssignment_3()); 
            // InternalFigure.g:747:2: ( rule__RECTANGLE__RetourAssignment_3 )
            // InternalFigure.g:747:3: rule__RECTANGLE__RetourAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__RetourAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRECTANGLEAccess().getRetourAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group__3__Impl"


    // $ANTLR start "rule__RECTANGLE__Group__4"
    // InternalFigure.g:755:1: rule__RECTANGLE__Group__4 : rule__RECTANGLE__Group__4__Impl ;
    public final void rule__RECTANGLE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:759:1: ( rule__RECTANGLE__Group__4__Impl )
            // InternalFigure.g:760:2: rule__RECTANGLE__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group__4"


    // $ANTLR start "rule__RECTANGLE__Group__4__Impl"
    // InternalFigure.g:766:1: rule__RECTANGLE__Group__4__Impl : ( ( rule__RECTANGLE__EndAssignment_4 ) ) ;
    public final void rule__RECTANGLE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:770:1: ( ( ( rule__RECTANGLE__EndAssignment_4 ) ) )
            // InternalFigure.g:771:1: ( ( rule__RECTANGLE__EndAssignment_4 ) )
            {
            // InternalFigure.g:771:1: ( ( rule__RECTANGLE__EndAssignment_4 ) )
            // InternalFigure.g:772:2: ( rule__RECTANGLE__EndAssignment_4 )
            {
             before(grammarAccess.getRECTANGLEAccess().getEndAssignment_4()); 
            // InternalFigure.g:773:2: ( rule__RECTANGLE__EndAssignment_4 )
            // InternalFigure.g:773:3: rule__RECTANGLE__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRECTANGLEAccess().getEndAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group__4__Impl"


    // $ANTLR start "rule__RECTANGLE__Group_2_0__0"
    // InternalFigure.g:782:1: rule__RECTANGLE__Group_2_0__0 : rule__RECTANGLE__Group_2_0__0__Impl rule__RECTANGLE__Group_2_0__1 ;
    public final void rule__RECTANGLE__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:786:1: ( rule__RECTANGLE__Group_2_0__0__Impl rule__RECTANGLE__Group_2_0__1 )
            // InternalFigure.g:787:2: rule__RECTANGLE__Group_2_0__0__Impl rule__RECTANGLE__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
            rule__RECTANGLE__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_0__0"


    // $ANTLR start "rule__RECTANGLE__Group_2_0__0__Impl"
    // InternalFigure.g:794:1: rule__RECTANGLE__Group_2_0__0__Impl : ( 'longueur' ) ;
    public final void rule__RECTANGLE__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:798:1: ( ( 'longueur' ) )
            // InternalFigure.g:799:1: ( 'longueur' )
            {
            // InternalFigure.g:799:1: ( 'longueur' )
            // InternalFigure.g:800:2: 'longueur'
            {
             before(grammarAccess.getRECTANGLEAccess().getLongueurKeyword_2_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRECTANGLEAccess().getLongueurKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_0__0__Impl"


    // $ANTLR start "rule__RECTANGLE__Group_2_0__1"
    // InternalFigure.g:809:1: rule__RECTANGLE__Group_2_0__1 : rule__RECTANGLE__Group_2_0__1__Impl rule__RECTANGLE__Group_2_0__2 ;
    public final void rule__RECTANGLE__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:813:1: ( rule__RECTANGLE__Group_2_0__1__Impl rule__RECTANGLE__Group_2_0__2 )
            // InternalFigure.g:814:2: rule__RECTANGLE__Group_2_0__1__Impl rule__RECTANGLE__Group_2_0__2
            {
            pushFollow(FOLLOW_9);
            rule__RECTANGLE__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_0__1"


    // $ANTLR start "rule__RECTANGLE__Group_2_0__1__Impl"
    // InternalFigure.g:821:1: rule__RECTANGLE__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__RECTANGLE__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:825:1: ( ( ':' ) )
            // InternalFigure.g:826:1: ( ':' )
            {
            // InternalFigure.g:826:1: ( ':' )
            // InternalFigure.g:827:2: ':'
            {
             before(grammarAccess.getRECTANGLEAccess().getColonKeyword_2_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRECTANGLEAccess().getColonKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_0__1__Impl"


    // $ANTLR start "rule__RECTANGLE__Group_2_0__2"
    // InternalFigure.g:836:1: rule__RECTANGLE__Group_2_0__2 : rule__RECTANGLE__Group_2_0__2__Impl rule__RECTANGLE__Group_2_0__3 ;
    public final void rule__RECTANGLE__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:840:1: ( rule__RECTANGLE__Group_2_0__2__Impl rule__RECTANGLE__Group_2_0__3 )
            // InternalFigure.g:841:2: rule__RECTANGLE__Group_2_0__2__Impl rule__RECTANGLE__Group_2_0__3
            {
            pushFollow(FOLLOW_10);
            rule__RECTANGLE__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_0__2"


    // $ANTLR start "rule__RECTANGLE__Group_2_0__2__Impl"
    // InternalFigure.g:848:1: rule__RECTANGLE__Group_2_0__2__Impl : ( ( rule__RECTANGLE__LongueurAssignment_2_0_2 ) ) ;
    public final void rule__RECTANGLE__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:852:1: ( ( ( rule__RECTANGLE__LongueurAssignment_2_0_2 ) ) )
            // InternalFigure.g:853:1: ( ( rule__RECTANGLE__LongueurAssignment_2_0_2 ) )
            {
            // InternalFigure.g:853:1: ( ( rule__RECTANGLE__LongueurAssignment_2_0_2 ) )
            // InternalFigure.g:854:2: ( rule__RECTANGLE__LongueurAssignment_2_0_2 )
            {
             before(grammarAccess.getRECTANGLEAccess().getLongueurAssignment_2_0_2()); 
            // InternalFigure.g:855:2: ( rule__RECTANGLE__LongueurAssignment_2_0_2 )
            // InternalFigure.g:855:3: rule__RECTANGLE__LongueurAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__LongueurAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getRECTANGLEAccess().getLongueurAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_0__2__Impl"


    // $ANTLR start "rule__RECTANGLE__Group_2_0__3"
    // InternalFigure.g:863:1: rule__RECTANGLE__Group_2_0__3 : rule__RECTANGLE__Group_2_0__3__Impl ;
    public final void rule__RECTANGLE__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:867:1: ( rule__RECTANGLE__Group_2_0__3__Impl )
            // InternalFigure.g:868:2: rule__RECTANGLE__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group_2_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_0__3"


    // $ANTLR start "rule__RECTANGLE__Group_2_0__3__Impl"
    // InternalFigure.g:874:1: rule__RECTANGLE__Group_2_0__3__Impl : ( ';' ) ;
    public final void rule__RECTANGLE__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:878:1: ( ( ';' ) )
            // InternalFigure.g:879:1: ( ';' )
            {
            // InternalFigure.g:879:1: ( ';' )
            // InternalFigure.g:880:2: ';'
            {
             before(grammarAccess.getRECTANGLEAccess().getSemicolonKeyword_2_0_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRECTANGLEAccess().getSemicolonKeyword_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_0__3__Impl"


    // $ANTLR start "rule__RECTANGLE__Group_2_1__0"
    // InternalFigure.g:890:1: rule__RECTANGLE__Group_2_1__0 : rule__RECTANGLE__Group_2_1__0__Impl rule__RECTANGLE__Group_2_1__1 ;
    public final void rule__RECTANGLE__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:894:1: ( rule__RECTANGLE__Group_2_1__0__Impl rule__RECTANGLE__Group_2_1__1 )
            // InternalFigure.g:895:2: rule__RECTANGLE__Group_2_1__0__Impl rule__RECTANGLE__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__RECTANGLE__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_1__0"


    // $ANTLR start "rule__RECTANGLE__Group_2_1__0__Impl"
    // InternalFigure.g:902:1: rule__RECTANGLE__Group_2_1__0__Impl : ( 'largeur' ) ;
    public final void rule__RECTANGLE__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:906:1: ( ( 'largeur' ) )
            // InternalFigure.g:907:1: ( 'largeur' )
            {
            // InternalFigure.g:907:1: ( 'largeur' )
            // InternalFigure.g:908:2: 'largeur'
            {
             before(grammarAccess.getRECTANGLEAccess().getLargeurKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRECTANGLEAccess().getLargeurKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_1__0__Impl"


    // $ANTLR start "rule__RECTANGLE__Group_2_1__1"
    // InternalFigure.g:917:1: rule__RECTANGLE__Group_2_1__1 : rule__RECTANGLE__Group_2_1__1__Impl rule__RECTANGLE__Group_2_1__2 ;
    public final void rule__RECTANGLE__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:921:1: ( rule__RECTANGLE__Group_2_1__1__Impl rule__RECTANGLE__Group_2_1__2 )
            // InternalFigure.g:922:2: rule__RECTANGLE__Group_2_1__1__Impl rule__RECTANGLE__Group_2_1__2
            {
            pushFollow(FOLLOW_9);
            rule__RECTANGLE__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_1__1"


    // $ANTLR start "rule__RECTANGLE__Group_2_1__1__Impl"
    // InternalFigure.g:929:1: rule__RECTANGLE__Group_2_1__1__Impl : ( ':' ) ;
    public final void rule__RECTANGLE__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:933:1: ( ( ':' ) )
            // InternalFigure.g:934:1: ( ':' )
            {
            // InternalFigure.g:934:1: ( ':' )
            // InternalFigure.g:935:2: ':'
            {
             before(grammarAccess.getRECTANGLEAccess().getColonKeyword_2_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRECTANGLEAccess().getColonKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_1__1__Impl"


    // $ANTLR start "rule__RECTANGLE__Group_2_1__2"
    // InternalFigure.g:944:1: rule__RECTANGLE__Group_2_1__2 : rule__RECTANGLE__Group_2_1__2__Impl rule__RECTANGLE__Group_2_1__3 ;
    public final void rule__RECTANGLE__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:948:1: ( rule__RECTANGLE__Group_2_1__2__Impl rule__RECTANGLE__Group_2_1__3 )
            // InternalFigure.g:949:2: rule__RECTANGLE__Group_2_1__2__Impl rule__RECTANGLE__Group_2_1__3
            {
            pushFollow(FOLLOW_10);
            rule__RECTANGLE__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_1__2"


    // $ANTLR start "rule__RECTANGLE__Group_2_1__2__Impl"
    // InternalFigure.g:956:1: rule__RECTANGLE__Group_2_1__2__Impl : ( ( rule__RECTANGLE__LargeurAssignment_2_1_2 ) ) ;
    public final void rule__RECTANGLE__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:960:1: ( ( ( rule__RECTANGLE__LargeurAssignment_2_1_2 ) ) )
            // InternalFigure.g:961:1: ( ( rule__RECTANGLE__LargeurAssignment_2_1_2 ) )
            {
            // InternalFigure.g:961:1: ( ( rule__RECTANGLE__LargeurAssignment_2_1_2 ) )
            // InternalFigure.g:962:2: ( rule__RECTANGLE__LargeurAssignment_2_1_2 )
            {
             before(grammarAccess.getRECTANGLEAccess().getLargeurAssignment_2_1_2()); 
            // InternalFigure.g:963:2: ( rule__RECTANGLE__LargeurAssignment_2_1_2 )
            // InternalFigure.g:963:3: rule__RECTANGLE__LargeurAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__LargeurAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRECTANGLEAccess().getLargeurAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_1__2__Impl"


    // $ANTLR start "rule__RECTANGLE__Group_2_1__3"
    // InternalFigure.g:971:1: rule__RECTANGLE__Group_2_1__3 : rule__RECTANGLE__Group_2_1__3__Impl ;
    public final void rule__RECTANGLE__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:975:1: ( rule__RECTANGLE__Group_2_1__3__Impl )
            // InternalFigure.g:976:2: rule__RECTANGLE__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_1__3"


    // $ANTLR start "rule__RECTANGLE__Group_2_1__3__Impl"
    // InternalFigure.g:982:1: rule__RECTANGLE__Group_2_1__3__Impl : ( ';' ) ;
    public final void rule__RECTANGLE__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:986:1: ( ( ';' ) )
            // InternalFigure.g:987:1: ( ';' )
            {
            // InternalFigure.g:987:1: ( ';' )
            // InternalFigure.g:988:2: ';'
            {
             before(grammarAccess.getRECTANGLEAccess().getSemicolonKeyword_2_1_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRECTANGLEAccess().getSemicolonKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__Group_2_1__3__Impl"


    // $ANTLR start "rule__CERCLE__Group__0"
    // InternalFigure.g:998:1: rule__CERCLE__Group__0 : rule__CERCLE__Group__0__Impl rule__CERCLE__Group__1 ;
    public final void rule__CERCLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1002:1: ( rule__CERCLE__Group__0__Impl rule__CERCLE__Group__1 )
            // InternalFigure.g:1003:2: rule__CERCLE__Group__0__Impl rule__CERCLE__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CERCLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CERCLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group__0"


    // $ANTLR start "rule__CERCLE__Group__0__Impl"
    // InternalFigure.g:1010:1: rule__CERCLE__Group__0__Impl : ( ( rule__CERCLE__NomAssignment_0 ) ) ;
    public final void rule__CERCLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1014:1: ( ( ( rule__CERCLE__NomAssignment_0 ) ) )
            // InternalFigure.g:1015:1: ( ( rule__CERCLE__NomAssignment_0 ) )
            {
            // InternalFigure.g:1015:1: ( ( rule__CERCLE__NomAssignment_0 ) )
            // InternalFigure.g:1016:2: ( rule__CERCLE__NomAssignment_0 )
            {
             before(grammarAccess.getCERCLEAccess().getNomAssignment_0()); 
            // InternalFigure.g:1017:2: ( rule__CERCLE__NomAssignment_0 )
            // InternalFigure.g:1017:3: rule__CERCLE__NomAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CERCLE__NomAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCERCLEAccess().getNomAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group__0__Impl"


    // $ANTLR start "rule__CERCLE__Group__1"
    // InternalFigure.g:1025:1: rule__CERCLE__Group__1 : rule__CERCLE__Group__1__Impl rule__CERCLE__Group__2 ;
    public final void rule__CERCLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1029:1: ( rule__CERCLE__Group__1__Impl rule__CERCLE__Group__2 )
            // InternalFigure.g:1030:2: rule__CERCLE__Group__1__Impl rule__CERCLE__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__CERCLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CERCLE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group__1"


    // $ANTLR start "rule__CERCLE__Group__1__Impl"
    // InternalFigure.g:1037:1: rule__CERCLE__Group__1__Impl : ( ( rule__CERCLE__DebutAssignment_1 ) ) ;
    public final void rule__CERCLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1041:1: ( ( ( rule__CERCLE__DebutAssignment_1 ) ) )
            // InternalFigure.g:1042:1: ( ( rule__CERCLE__DebutAssignment_1 ) )
            {
            // InternalFigure.g:1042:1: ( ( rule__CERCLE__DebutAssignment_1 ) )
            // InternalFigure.g:1043:2: ( rule__CERCLE__DebutAssignment_1 )
            {
             before(grammarAccess.getCERCLEAccess().getDebutAssignment_1()); 
            // InternalFigure.g:1044:2: ( rule__CERCLE__DebutAssignment_1 )
            // InternalFigure.g:1044:3: rule__CERCLE__DebutAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CERCLE__DebutAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCERCLEAccess().getDebutAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group__1__Impl"


    // $ANTLR start "rule__CERCLE__Group__2"
    // InternalFigure.g:1052:1: rule__CERCLE__Group__2 : rule__CERCLE__Group__2__Impl rule__CERCLE__Group__3 ;
    public final void rule__CERCLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1056:1: ( rule__CERCLE__Group__2__Impl rule__CERCLE__Group__3 )
            // InternalFigure.g:1057:2: rule__CERCLE__Group__2__Impl rule__CERCLE__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CERCLE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CERCLE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group__2"


    // $ANTLR start "rule__CERCLE__Group__2__Impl"
    // InternalFigure.g:1064:1: rule__CERCLE__Group__2__Impl : ( ( rule__CERCLE__Group_2__0 ) ) ;
    public final void rule__CERCLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1068:1: ( ( ( rule__CERCLE__Group_2__0 ) ) )
            // InternalFigure.g:1069:1: ( ( rule__CERCLE__Group_2__0 ) )
            {
            // InternalFigure.g:1069:1: ( ( rule__CERCLE__Group_2__0 ) )
            // InternalFigure.g:1070:2: ( rule__CERCLE__Group_2__0 )
            {
             before(grammarAccess.getCERCLEAccess().getGroup_2()); 
            // InternalFigure.g:1071:2: ( rule__CERCLE__Group_2__0 )
            // InternalFigure.g:1071:3: rule__CERCLE__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__CERCLE__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getCERCLEAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group__2__Impl"


    // $ANTLR start "rule__CERCLE__Group__3"
    // InternalFigure.g:1079:1: rule__CERCLE__Group__3 : rule__CERCLE__Group__3__Impl rule__CERCLE__Group__4 ;
    public final void rule__CERCLE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1083:1: ( rule__CERCLE__Group__3__Impl rule__CERCLE__Group__4 )
            // InternalFigure.g:1084:2: rule__CERCLE__Group__3__Impl rule__CERCLE__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__CERCLE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CERCLE__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group__3"


    // $ANTLR start "rule__CERCLE__Group__3__Impl"
    // InternalFigure.g:1091:1: rule__CERCLE__Group__3__Impl : ( ( rule__CERCLE__RetourAssignment_3 ) ) ;
    public final void rule__CERCLE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1095:1: ( ( ( rule__CERCLE__RetourAssignment_3 ) ) )
            // InternalFigure.g:1096:1: ( ( rule__CERCLE__RetourAssignment_3 ) )
            {
            // InternalFigure.g:1096:1: ( ( rule__CERCLE__RetourAssignment_3 ) )
            // InternalFigure.g:1097:2: ( rule__CERCLE__RetourAssignment_3 )
            {
             before(grammarAccess.getCERCLEAccess().getRetourAssignment_3()); 
            // InternalFigure.g:1098:2: ( rule__CERCLE__RetourAssignment_3 )
            // InternalFigure.g:1098:3: rule__CERCLE__RetourAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CERCLE__RetourAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCERCLEAccess().getRetourAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group__3__Impl"


    // $ANTLR start "rule__CERCLE__Group__4"
    // InternalFigure.g:1106:1: rule__CERCLE__Group__4 : rule__CERCLE__Group__4__Impl ;
    public final void rule__CERCLE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1110:1: ( rule__CERCLE__Group__4__Impl )
            // InternalFigure.g:1111:2: rule__CERCLE__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CERCLE__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group__4"


    // $ANTLR start "rule__CERCLE__Group__4__Impl"
    // InternalFigure.g:1117:1: rule__CERCLE__Group__4__Impl : ( ( rule__CERCLE__EndAssignment_4 ) ) ;
    public final void rule__CERCLE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1121:1: ( ( ( rule__CERCLE__EndAssignment_4 ) ) )
            // InternalFigure.g:1122:1: ( ( rule__CERCLE__EndAssignment_4 ) )
            {
            // InternalFigure.g:1122:1: ( ( rule__CERCLE__EndAssignment_4 ) )
            // InternalFigure.g:1123:2: ( rule__CERCLE__EndAssignment_4 )
            {
             before(grammarAccess.getCERCLEAccess().getEndAssignment_4()); 
            // InternalFigure.g:1124:2: ( rule__CERCLE__EndAssignment_4 )
            // InternalFigure.g:1124:3: rule__CERCLE__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CERCLE__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCERCLEAccess().getEndAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group__4__Impl"


    // $ANTLR start "rule__CERCLE__Group_2__0"
    // InternalFigure.g:1133:1: rule__CERCLE__Group_2__0 : rule__CERCLE__Group_2__0__Impl rule__CERCLE__Group_2__1 ;
    public final void rule__CERCLE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1137:1: ( rule__CERCLE__Group_2__0__Impl rule__CERCLE__Group_2__1 )
            // InternalFigure.g:1138:2: rule__CERCLE__Group_2__0__Impl rule__CERCLE__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__CERCLE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CERCLE__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group_2__0"


    // $ANTLR start "rule__CERCLE__Group_2__0__Impl"
    // InternalFigure.g:1145:1: rule__CERCLE__Group_2__0__Impl : ( 'rayon' ) ;
    public final void rule__CERCLE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1149:1: ( ( 'rayon' ) )
            // InternalFigure.g:1150:1: ( 'rayon' )
            {
            // InternalFigure.g:1150:1: ( 'rayon' )
            // InternalFigure.g:1151:2: 'rayon'
            {
             before(grammarAccess.getCERCLEAccess().getRayonKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCERCLEAccess().getRayonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group_2__0__Impl"


    // $ANTLR start "rule__CERCLE__Group_2__1"
    // InternalFigure.g:1160:1: rule__CERCLE__Group_2__1 : rule__CERCLE__Group_2__1__Impl rule__CERCLE__Group_2__2 ;
    public final void rule__CERCLE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1164:1: ( rule__CERCLE__Group_2__1__Impl rule__CERCLE__Group_2__2 )
            // InternalFigure.g:1165:2: rule__CERCLE__Group_2__1__Impl rule__CERCLE__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__CERCLE__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CERCLE__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group_2__1"


    // $ANTLR start "rule__CERCLE__Group_2__1__Impl"
    // InternalFigure.g:1172:1: rule__CERCLE__Group_2__1__Impl : ( ':' ) ;
    public final void rule__CERCLE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1176:1: ( ( ':' ) )
            // InternalFigure.g:1177:1: ( ':' )
            {
            // InternalFigure.g:1177:1: ( ':' )
            // InternalFigure.g:1178:2: ':'
            {
             before(grammarAccess.getCERCLEAccess().getColonKeyword_2_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCERCLEAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group_2__1__Impl"


    // $ANTLR start "rule__CERCLE__Group_2__2"
    // InternalFigure.g:1187:1: rule__CERCLE__Group_2__2 : rule__CERCLE__Group_2__2__Impl rule__CERCLE__Group_2__3 ;
    public final void rule__CERCLE__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1191:1: ( rule__CERCLE__Group_2__2__Impl rule__CERCLE__Group_2__3 )
            // InternalFigure.g:1192:2: rule__CERCLE__Group_2__2__Impl rule__CERCLE__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__CERCLE__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CERCLE__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group_2__2"


    // $ANTLR start "rule__CERCLE__Group_2__2__Impl"
    // InternalFigure.g:1199:1: rule__CERCLE__Group_2__2__Impl : ( ( rule__CERCLE__RayonAssignment_2_2 ) ) ;
    public final void rule__CERCLE__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1203:1: ( ( ( rule__CERCLE__RayonAssignment_2_2 ) ) )
            // InternalFigure.g:1204:1: ( ( rule__CERCLE__RayonAssignment_2_2 ) )
            {
            // InternalFigure.g:1204:1: ( ( rule__CERCLE__RayonAssignment_2_2 ) )
            // InternalFigure.g:1205:2: ( rule__CERCLE__RayonAssignment_2_2 )
            {
             before(grammarAccess.getCERCLEAccess().getRayonAssignment_2_2()); 
            // InternalFigure.g:1206:2: ( rule__CERCLE__RayonAssignment_2_2 )
            // InternalFigure.g:1206:3: rule__CERCLE__RayonAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__CERCLE__RayonAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getCERCLEAccess().getRayonAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group_2__2__Impl"


    // $ANTLR start "rule__CERCLE__Group_2__3"
    // InternalFigure.g:1214:1: rule__CERCLE__Group_2__3 : rule__CERCLE__Group_2__3__Impl ;
    public final void rule__CERCLE__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1218:1: ( rule__CERCLE__Group_2__3__Impl )
            // InternalFigure.g:1219:2: rule__CERCLE__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CERCLE__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group_2__3"


    // $ANTLR start "rule__CERCLE__Group_2__3__Impl"
    // InternalFigure.g:1225:1: rule__CERCLE__Group_2__3__Impl : ( ';' ) ;
    public final void rule__CERCLE__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1229:1: ( ( ';' ) )
            // InternalFigure.g:1230:1: ( ';' )
            {
            // InternalFigure.g:1230:1: ( ';' )
            // InternalFigure.g:1231:2: ';'
            {
             before(grammarAccess.getCERCLEAccess().getSemicolonKeyword_2_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCERCLEAccess().getSemicolonKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__Group_2__3__Impl"


    // $ANTLR start "rule__RETURN__Group__0"
    // InternalFigure.g:1241:1: rule__RETURN__Group__0 : rule__RETURN__Group__0__Impl rule__RETURN__Group__1 ;
    public final void rule__RETURN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1245:1: ( rule__RETURN__Group__0__Impl rule__RETURN__Group__1 )
            // InternalFigure.g:1246:2: rule__RETURN__Group__0__Impl rule__RETURN__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RETURN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RETURN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RETURN__Group__0"


    // $ANTLR start "rule__RETURN__Group__0__Impl"
    // InternalFigure.g:1253:1: rule__RETURN__Group__0__Impl : ( 'return' ) ;
    public final void rule__RETURN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1257:1: ( ( 'return' ) )
            // InternalFigure.g:1258:1: ( 'return' )
            {
            // InternalFigure.g:1258:1: ( 'return' )
            // InternalFigure.g:1259:2: 'return'
            {
             before(grammarAccess.getRETURNAccess().getReturnKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRETURNAccess().getReturnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RETURN__Group__0__Impl"


    // $ANTLR start "rule__RETURN__Group__1"
    // InternalFigure.g:1268:1: rule__RETURN__Group__1 : rule__RETURN__Group__1__Impl rule__RETURN__Group__2 ;
    public final void rule__RETURN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1272:1: ( rule__RETURN__Group__1__Impl rule__RETURN__Group__2 )
            // InternalFigure.g:1273:2: rule__RETURN__Group__1__Impl rule__RETURN__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__RETURN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RETURN__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RETURN__Group__1"


    // $ANTLR start "rule__RETURN__Group__1__Impl"
    // InternalFigure.g:1280:1: rule__RETURN__Group__1__Impl : ( ( rule__RETURN__ResultatAssignment_1 ) ) ;
    public final void rule__RETURN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1284:1: ( ( ( rule__RETURN__ResultatAssignment_1 ) ) )
            // InternalFigure.g:1285:1: ( ( rule__RETURN__ResultatAssignment_1 ) )
            {
            // InternalFigure.g:1285:1: ( ( rule__RETURN__ResultatAssignment_1 ) )
            // InternalFigure.g:1286:2: ( rule__RETURN__ResultatAssignment_1 )
            {
             before(grammarAccess.getRETURNAccess().getResultatAssignment_1()); 
            // InternalFigure.g:1287:2: ( rule__RETURN__ResultatAssignment_1 )
            // InternalFigure.g:1287:3: rule__RETURN__ResultatAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RETURN__ResultatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRETURNAccess().getResultatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RETURN__Group__1__Impl"


    // $ANTLR start "rule__RETURN__Group__2"
    // InternalFigure.g:1295:1: rule__RETURN__Group__2 : rule__RETURN__Group__2__Impl ;
    public final void rule__RETURN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1299:1: ( rule__RETURN__Group__2__Impl )
            // InternalFigure.g:1300:2: rule__RETURN__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RETURN__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RETURN__Group__2"


    // $ANTLR start "rule__RETURN__Group__2__Impl"
    // InternalFigure.g:1306:1: rule__RETURN__Group__2__Impl : ( ';' ) ;
    public final void rule__RETURN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1310:1: ( ( ';' ) )
            // InternalFigure.g:1311:1: ( ';' )
            {
            // InternalFigure.g:1311:1: ( ';' )
            // InternalFigure.g:1312:2: ';'
            {
             before(grammarAccess.getRETURNAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRETURNAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RETURN__Group__2__Impl"


    // $ANTLR start "rule__RECTANGLE__UnorderedGroup_2"
    // InternalFigure.g:1322:1: rule__RECTANGLE__UnorderedGroup_2 : rule__RECTANGLE__UnorderedGroup_2__0 {...}?;
    public final void rule__RECTANGLE__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2());
        	
        try {
            // InternalFigure.g:1327:1: ( rule__RECTANGLE__UnorderedGroup_2__0 {...}?)
            // InternalFigure.g:1328:2: rule__RECTANGLE__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__UnorderedGroup_2__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rule__RECTANGLE__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__UnorderedGroup_2"


    // $ANTLR start "rule__RECTANGLE__UnorderedGroup_2__Impl"
    // InternalFigure.g:1336:1: rule__RECTANGLE__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__RECTANGLE__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RECTANGLE__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__RECTANGLE__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalFigure.g:1341:1: ( ( ({...}? => ( ( ( rule__RECTANGLE__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RECTANGLE__Group_2_1__0 ) ) ) ) ) )
            // InternalFigure.g:1342:3: ( ({...}? => ( ( ( rule__RECTANGLE__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RECTANGLE__Group_2_1__0 ) ) ) ) )
            {
            // InternalFigure.g:1342:3: ( ({...}? => ( ( ( rule__RECTANGLE__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__RECTANGLE__Group_2_1__0 ) ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( LA4_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFigure.g:1343:3: ({...}? => ( ( ( rule__RECTANGLE__Group_2_0__0 ) ) ) )
                    {
                    // InternalFigure.g:1343:3: ({...}? => ( ( ( rule__RECTANGLE__Group_2_0__0 ) ) ) )
                    // InternalFigure.g:1344:4: {...}? => ( ( ( rule__RECTANGLE__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__RECTANGLE__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalFigure.g:1344:105: ( ( ( rule__RECTANGLE__Group_2_0__0 ) ) )
                    // InternalFigure.g:1345:5: ( ( rule__RECTANGLE__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalFigure.g:1351:5: ( ( rule__RECTANGLE__Group_2_0__0 ) )
                    // InternalFigure.g:1352:6: ( rule__RECTANGLE__Group_2_0__0 )
                    {
                     before(grammarAccess.getRECTANGLEAccess().getGroup_2_0()); 
                    // InternalFigure.g:1353:6: ( rule__RECTANGLE__Group_2_0__0 )
                    // InternalFigure.g:1353:7: rule__RECTANGLE__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RECTANGLE__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRECTANGLEAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFigure.g:1358:3: ({...}? => ( ( ( rule__RECTANGLE__Group_2_1__0 ) ) ) )
                    {
                    // InternalFigure.g:1358:3: ({...}? => ( ( ( rule__RECTANGLE__Group_2_1__0 ) ) ) )
                    // InternalFigure.g:1359:4: {...}? => ( ( ( rule__RECTANGLE__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__RECTANGLE__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalFigure.g:1359:105: ( ( ( rule__RECTANGLE__Group_2_1__0 ) ) )
                    // InternalFigure.g:1360:5: ( ( rule__RECTANGLE__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalFigure.g:1366:5: ( ( rule__RECTANGLE__Group_2_1__0 ) )
                    // InternalFigure.g:1367:6: ( rule__RECTANGLE__Group_2_1__0 )
                    {
                     before(grammarAccess.getRECTANGLEAccess().getGroup_2_1()); 
                    // InternalFigure.g:1368:6: ( rule__RECTANGLE__Group_2_1__0 )
                    // InternalFigure.g:1368:7: rule__RECTANGLE__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RECTANGLE__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRECTANGLEAccess().getGroup_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__RECTANGLE__UnorderedGroup_2__0"
    // InternalFigure.g:1381:1: rule__RECTANGLE__UnorderedGroup_2__0 : rule__RECTANGLE__UnorderedGroup_2__Impl ( rule__RECTANGLE__UnorderedGroup_2__1 )? ;
    public final void rule__RECTANGLE__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1385:1: ( rule__RECTANGLE__UnorderedGroup_2__Impl ( rule__RECTANGLE__UnorderedGroup_2__1 )? )
            // InternalFigure.g:1386:2: rule__RECTANGLE__UnorderedGroup_2__Impl ( rule__RECTANGLE__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_14);
            rule__RECTANGLE__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalFigure.g:1387:2: ( rule__RECTANGLE__UnorderedGroup_2__1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( LA5_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFigure.g:1387:2: rule__RECTANGLE__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RECTANGLE__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__UnorderedGroup_2__0"


    // $ANTLR start "rule__RECTANGLE__UnorderedGroup_2__1"
    // InternalFigure.g:1393:1: rule__RECTANGLE__UnorderedGroup_2__1 : rule__RECTANGLE__UnorderedGroup_2__Impl ;
    public final void rule__RECTANGLE__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1397:1: ( rule__RECTANGLE__UnorderedGroup_2__Impl )
            // InternalFigure.g:1398:2: rule__RECTANGLE__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RECTANGLE__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__UnorderedGroup_2__1"


    // $ANTLR start "rule__PROGRAMME__FigAssignment"
    // InternalFigure.g:1405:1: rule__PROGRAMME__FigAssignment : ( ruleFIGURE ) ;
    public final void rule__PROGRAMME__FigAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1409:1: ( ( ruleFIGURE ) )
            // InternalFigure.g:1410:2: ( ruleFIGURE )
            {
            // InternalFigure.g:1410:2: ( ruleFIGURE )
            // InternalFigure.g:1411:3: ruleFIGURE
            {
             before(grammarAccess.getPROGRAMMEAccess().getFigFIGUREParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFIGURE();

            state._fsp--;

             after(grammarAccess.getPROGRAMMEAccess().getFigFIGUREParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROGRAMME__FigAssignment"


    // $ANTLR start "rule__FIGURE__NomAssignment_1"
    // InternalFigure.g:1420:1: rule__FIGURE__NomAssignment_1 : ( ( rule__FIGURE__NomAlternatives_1_0 ) ) ;
    public final void rule__FIGURE__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1424:1: ( ( ( rule__FIGURE__NomAlternatives_1_0 ) ) )
            // InternalFigure.g:1425:2: ( ( rule__FIGURE__NomAlternatives_1_0 ) )
            {
            // InternalFigure.g:1425:2: ( ( rule__FIGURE__NomAlternatives_1_0 ) )
            // InternalFigure.g:1426:3: ( rule__FIGURE__NomAlternatives_1_0 )
            {
             before(grammarAccess.getFIGUREAccess().getNomAlternatives_1_0()); 
            // InternalFigure.g:1427:3: ( rule__FIGURE__NomAlternatives_1_0 )
            // InternalFigure.g:1427:4: rule__FIGURE__NomAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FIGURE__NomAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFIGUREAccess().getNomAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FIGURE__NomAssignment_1"


    // $ANTLR start "rule__CARRE__NomAssignment_0"
    // InternalFigure.g:1435:1: rule__CARRE__NomAssignment_0 : ( ( 'Carre' ) ) ;
    public final void rule__CARRE__NomAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1439:1: ( ( ( 'Carre' ) ) )
            // InternalFigure.g:1440:2: ( ( 'Carre' ) )
            {
            // InternalFigure.g:1440:2: ( ( 'Carre' ) )
            // InternalFigure.g:1441:3: ( 'Carre' )
            {
             before(grammarAccess.getCARREAccess().getNomCarreKeyword_0_0()); 
            // InternalFigure.g:1442:3: ( 'Carre' )
            // InternalFigure.g:1443:4: 'Carre'
            {
             before(grammarAccess.getCARREAccess().getNomCarreKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCARREAccess().getNomCarreKeyword_0_0()); 

            }

             after(grammarAccess.getCARREAccess().getNomCarreKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__NomAssignment_0"


    // $ANTLR start "rule__CARRE__DebutAssignment_1"
    // InternalFigure.g:1454:1: rule__CARRE__DebutAssignment_1 : ( ruleDEBUT ) ;
    public final void rule__CARRE__DebutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1458:1: ( ( ruleDEBUT ) )
            // InternalFigure.g:1459:2: ( ruleDEBUT )
            {
            // InternalFigure.g:1459:2: ( ruleDEBUT )
            // InternalFigure.g:1460:3: ruleDEBUT
            {
             before(grammarAccess.getCARREAccess().getDebutDEBUTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDEBUT();

            state._fsp--;

             after(grammarAccess.getCARREAccess().getDebutDEBUTParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__DebutAssignment_1"


    // $ANTLR start "rule__CARRE__CoteAssignment_2_2"
    // InternalFigure.g:1469:1: rule__CARRE__CoteAssignment_2_2 : ( ruleREEL ) ;
    public final void rule__CARRE__CoteAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1473:1: ( ( ruleREEL ) )
            // InternalFigure.g:1474:2: ( ruleREEL )
            {
            // InternalFigure.g:1474:2: ( ruleREEL )
            // InternalFigure.g:1475:3: ruleREEL
            {
             before(grammarAccess.getCARREAccess().getCoteREELParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleREEL();

            state._fsp--;

             after(grammarAccess.getCARREAccess().getCoteREELParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__CoteAssignment_2_2"


    // $ANTLR start "rule__CARRE__RetourAssignment_3"
    // InternalFigure.g:1484:1: rule__CARRE__RetourAssignment_3 : ( ruleRETURN ) ;
    public final void rule__CARRE__RetourAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1488:1: ( ( ruleRETURN ) )
            // InternalFigure.g:1489:2: ( ruleRETURN )
            {
            // InternalFigure.g:1489:2: ( ruleRETURN )
            // InternalFigure.g:1490:3: ruleRETURN
            {
             before(grammarAccess.getCARREAccess().getRetourRETURNParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRETURN();

            state._fsp--;

             after(grammarAccess.getCARREAccess().getRetourRETURNParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__RetourAssignment_3"


    // $ANTLR start "rule__CARRE__EndAssignment_4"
    // InternalFigure.g:1499:1: rule__CARRE__EndAssignment_4 : ( ruleEND ) ;
    public final void rule__CARRE__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1503:1: ( ( ruleEND ) )
            // InternalFigure.g:1504:2: ( ruleEND )
            {
            // InternalFigure.g:1504:2: ( ruleEND )
            // InternalFigure.g:1505:3: ruleEND
            {
             before(grammarAccess.getCARREAccess().getEndENDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEND();

            state._fsp--;

             after(grammarAccess.getCARREAccess().getEndENDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARRE__EndAssignment_4"


    // $ANTLR start "rule__RECTANGLE__NomAssignment_0"
    // InternalFigure.g:1514:1: rule__RECTANGLE__NomAssignment_0 : ( ( 'Rectangle' ) ) ;
    public final void rule__RECTANGLE__NomAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1518:1: ( ( ( 'Rectangle' ) ) )
            // InternalFigure.g:1519:2: ( ( 'Rectangle' ) )
            {
            // InternalFigure.g:1519:2: ( ( 'Rectangle' ) )
            // InternalFigure.g:1520:3: ( 'Rectangle' )
            {
             before(grammarAccess.getRECTANGLEAccess().getNomRectangleKeyword_0_0()); 
            // InternalFigure.g:1521:3: ( 'Rectangle' )
            // InternalFigure.g:1522:4: 'Rectangle'
            {
             before(grammarAccess.getRECTANGLEAccess().getNomRectangleKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRECTANGLEAccess().getNomRectangleKeyword_0_0()); 

            }

             after(grammarAccess.getRECTANGLEAccess().getNomRectangleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__NomAssignment_0"


    // $ANTLR start "rule__RECTANGLE__DebutAssignment_1"
    // InternalFigure.g:1533:1: rule__RECTANGLE__DebutAssignment_1 : ( ruleDEBUT ) ;
    public final void rule__RECTANGLE__DebutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1537:1: ( ( ruleDEBUT ) )
            // InternalFigure.g:1538:2: ( ruleDEBUT )
            {
            // InternalFigure.g:1538:2: ( ruleDEBUT )
            // InternalFigure.g:1539:3: ruleDEBUT
            {
             before(grammarAccess.getRECTANGLEAccess().getDebutDEBUTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDEBUT();

            state._fsp--;

             after(grammarAccess.getRECTANGLEAccess().getDebutDEBUTParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__DebutAssignment_1"


    // $ANTLR start "rule__RECTANGLE__LongueurAssignment_2_0_2"
    // InternalFigure.g:1548:1: rule__RECTANGLE__LongueurAssignment_2_0_2 : ( ruleREEL ) ;
    public final void rule__RECTANGLE__LongueurAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1552:1: ( ( ruleREEL ) )
            // InternalFigure.g:1553:2: ( ruleREEL )
            {
            // InternalFigure.g:1553:2: ( ruleREEL )
            // InternalFigure.g:1554:3: ruleREEL
            {
             before(grammarAccess.getRECTANGLEAccess().getLongueurREELParserRuleCall_2_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleREEL();

            state._fsp--;

             after(grammarAccess.getRECTANGLEAccess().getLongueurREELParserRuleCall_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__LongueurAssignment_2_0_2"


    // $ANTLR start "rule__RECTANGLE__LargeurAssignment_2_1_2"
    // InternalFigure.g:1563:1: rule__RECTANGLE__LargeurAssignment_2_1_2 : ( ruleREEL ) ;
    public final void rule__RECTANGLE__LargeurAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1567:1: ( ( ruleREEL ) )
            // InternalFigure.g:1568:2: ( ruleREEL )
            {
            // InternalFigure.g:1568:2: ( ruleREEL )
            // InternalFigure.g:1569:3: ruleREEL
            {
             before(grammarAccess.getRECTANGLEAccess().getLargeurREELParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleREEL();

            state._fsp--;

             after(grammarAccess.getRECTANGLEAccess().getLargeurREELParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__LargeurAssignment_2_1_2"


    // $ANTLR start "rule__RECTANGLE__RetourAssignment_3"
    // InternalFigure.g:1578:1: rule__RECTANGLE__RetourAssignment_3 : ( ruleRETURN ) ;
    public final void rule__RECTANGLE__RetourAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1582:1: ( ( ruleRETURN ) )
            // InternalFigure.g:1583:2: ( ruleRETURN )
            {
            // InternalFigure.g:1583:2: ( ruleRETURN )
            // InternalFigure.g:1584:3: ruleRETURN
            {
             before(grammarAccess.getRECTANGLEAccess().getRetourRETURNParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRETURN();

            state._fsp--;

             after(grammarAccess.getRECTANGLEAccess().getRetourRETURNParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__RetourAssignment_3"


    // $ANTLR start "rule__RECTANGLE__EndAssignment_4"
    // InternalFigure.g:1593:1: rule__RECTANGLE__EndAssignment_4 : ( ruleEND ) ;
    public final void rule__RECTANGLE__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1597:1: ( ( ruleEND ) )
            // InternalFigure.g:1598:2: ( ruleEND )
            {
            // InternalFigure.g:1598:2: ( ruleEND )
            // InternalFigure.g:1599:3: ruleEND
            {
             before(grammarAccess.getRECTANGLEAccess().getEndENDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEND();

            state._fsp--;

             after(grammarAccess.getRECTANGLEAccess().getEndENDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RECTANGLE__EndAssignment_4"


    // $ANTLR start "rule__CERCLE__NomAssignment_0"
    // InternalFigure.g:1608:1: rule__CERCLE__NomAssignment_0 : ( ( 'Cercle' ) ) ;
    public final void rule__CERCLE__NomAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1612:1: ( ( ( 'Cercle' ) ) )
            // InternalFigure.g:1613:2: ( ( 'Cercle' ) )
            {
            // InternalFigure.g:1613:2: ( ( 'Cercle' ) )
            // InternalFigure.g:1614:3: ( 'Cercle' )
            {
             before(grammarAccess.getCERCLEAccess().getNomCercleKeyword_0_0()); 
            // InternalFigure.g:1615:3: ( 'Cercle' )
            // InternalFigure.g:1616:4: 'Cercle'
            {
             before(grammarAccess.getCERCLEAccess().getNomCercleKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCERCLEAccess().getNomCercleKeyword_0_0()); 

            }

             after(grammarAccess.getCERCLEAccess().getNomCercleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__NomAssignment_0"


    // $ANTLR start "rule__CERCLE__DebutAssignment_1"
    // InternalFigure.g:1627:1: rule__CERCLE__DebutAssignment_1 : ( ruleDEBUT ) ;
    public final void rule__CERCLE__DebutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1631:1: ( ( ruleDEBUT ) )
            // InternalFigure.g:1632:2: ( ruleDEBUT )
            {
            // InternalFigure.g:1632:2: ( ruleDEBUT )
            // InternalFigure.g:1633:3: ruleDEBUT
            {
             before(grammarAccess.getCERCLEAccess().getDebutDEBUTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDEBUT();

            state._fsp--;

             after(grammarAccess.getCERCLEAccess().getDebutDEBUTParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__DebutAssignment_1"


    // $ANTLR start "rule__CERCLE__RayonAssignment_2_2"
    // InternalFigure.g:1642:1: rule__CERCLE__RayonAssignment_2_2 : ( ruleREEL ) ;
    public final void rule__CERCLE__RayonAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1646:1: ( ( ruleREEL ) )
            // InternalFigure.g:1647:2: ( ruleREEL )
            {
            // InternalFigure.g:1647:2: ( ruleREEL )
            // InternalFigure.g:1648:3: ruleREEL
            {
             before(grammarAccess.getCERCLEAccess().getRayonREELParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleREEL();

            state._fsp--;

             after(grammarAccess.getCERCLEAccess().getRayonREELParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__RayonAssignment_2_2"


    // $ANTLR start "rule__CERCLE__RetourAssignment_3"
    // InternalFigure.g:1657:1: rule__CERCLE__RetourAssignment_3 : ( ruleRETURN ) ;
    public final void rule__CERCLE__RetourAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1661:1: ( ( ruleRETURN ) )
            // InternalFigure.g:1662:2: ( ruleRETURN )
            {
            // InternalFigure.g:1662:2: ( ruleRETURN )
            // InternalFigure.g:1663:3: ruleRETURN
            {
             before(grammarAccess.getCERCLEAccess().getRetourRETURNParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRETURN();

            state._fsp--;

             after(grammarAccess.getCERCLEAccess().getRetourRETURNParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__RetourAssignment_3"


    // $ANTLR start "rule__CERCLE__EndAssignment_4"
    // InternalFigure.g:1672:1: rule__CERCLE__EndAssignment_4 : ( ruleEND ) ;
    public final void rule__CERCLE__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1676:1: ( ( ruleEND ) )
            // InternalFigure.g:1677:2: ( ruleEND )
            {
            // InternalFigure.g:1677:2: ( ruleEND )
            // InternalFigure.g:1678:3: ruleEND
            {
             before(grammarAccess.getCERCLEAccess().getEndENDParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEND();

            state._fsp--;

             after(grammarAccess.getCERCLEAccess().getEndENDParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CERCLE__EndAssignment_4"


    // $ANTLR start "rule__RETURN__ResultatAssignment_1"
    // InternalFigure.g:1687:1: rule__RETURN__ResultatAssignment_1 : ( ruleRETOUR ) ;
    public final void rule__RETURN__ResultatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1691:1: ( ( ruleRETOUR ) )
            // InternalFigure.g:1692:2: ( ruleRETOUR )
            {
            // InternalFigure.g:1692:2: ( ruleRETOUR )
            // InternalFigure.g:1693:3: ruleRETOUR
            {
             before(grammarAccess.getRETURNAccess().getResultatRETOURParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRETOUR();

            state._fsp--;

             after(grammarAccess.getRETURNAccess().getResultatRETOURParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RETURN__ResultatAssignment_1"


    // $ANTLR start "rule__REEL__ReelAssignment"
    // InternalFigure.g:1702:1: rule__REEL__ReelAssignment : ( RULE_DOUBLE ) ;
    public final void rule__REEL__ReelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFigure.g:1706:1: ( ( RULE_DOUBLE ) )
            // InternalFigure.g:1707:2: ( RULE_DOUBLE )
            {
            // InternalFigure.g:1707:2: ( RULE_DOUBLE )
            // InternalFigure.g:1708:3: RULE_DOUBLE
            {
             before(grammarAccess.getREELAccess().getReelDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getREELAccess().getReelDOUBLETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REEL__ReelAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});

}
