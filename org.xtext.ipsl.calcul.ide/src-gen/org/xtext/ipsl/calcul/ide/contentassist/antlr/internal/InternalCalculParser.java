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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalculParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REEL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin'", "'end'", "'moyenne'", "'mode'", "'variance'", "'ecart-type'", "'program'", "'mod:'", "'eff:'", "'return'", "';'", "','"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_REEL=5;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCalculParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCalculParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCalculParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCalcul.g"; }


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



    // $ANTLR start "entryRuleCALCUL"
    // InternalCalcul.g:53:1: entryRuleCALCUL : ruleCALCUL EOF ;
    public final void entryRuleCALCUL() throws RecognitionException {
        try {
            // InternalCalcul.g:54:1: ( ruleCALCUL EOF )
            // InternalCalcul.g:55:1: ruleCALCUL EOF
            {
             before(grammarAccess.getCALCULRule()); 
            pushFollow(FOLLOW_1);
            ruleCALCUL();

            state._fsp--;

             after(grammarAccess.getCALCULRule()); 
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
    // $ANTLR end "entryRuleCALCUL"


    // $ANTLR start "ruleCALCUL"
    // InternalCalcul.g:62:1: ruleCALCUL : ( ( rule__CALCUL__OperationAssignment )? ) ;
    public final void ruleCALCUL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:66:2: ( ( ( rule__CALCUL__OperationAssignment )? ) )
            // InternalCalcul.g:67:2: ( ( rule__CALCUL__OperationAssignment )? )
            {
            // InternalCalcul.g:67:2: ( ( rule__CALCUL__OperationAssignment )? )
            // InternalCalcul.g:68:3: ( rule__CALCUL__OperationAssignment )?
            {
             before(grammarAccess.getCALCULAccess().getOperationAssignment()); 
            // InternalCalcul.g:69:3: ( rule__CALCUL__OperationAssignment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCalcul.g:69:4: rule__CALCUL__OperationAssignment
                    {
                    pushFollow(FOLLOW_2);
                    rule__CALCUL__OperationAssignment();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCALCULAccess().getOperationAssignment()); 

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
    // $ANTLR end "ruleCALCUL"


    // $ANTLR start "entryRuleSTATISTIQUE"
    // InternalCalcul.g:78:1: entryRuleSTATISTIQUE : ruleSTATISTIQUE EOF ;
    public final void entryRuleSTATISTIQUE() throws RecognitionException {
        try {
            // InternalCalcul.g:79:1: ( ruleSTATISTIQUE EOF )
            // InternalCalcul.g:80:1: ruleSTATISTIQUE EOF
            {
             before(grammarAccess.getSTATISTIQUERule()); 
            pushFollow(FOLLOW_1);
            ruleSTATISTIQUE();

            state._fsp--;

             after(grammarAccess.getSTATISTIQUERule()); 
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
    // $ANTLR end "entryRuleSTATISTIQUE"


    // $ANTLR start "ruleSTATISTIQUE"
    // InternalCalcul.g:87:1: ruleSTATISTIQUE : ( ( rule__STATISTIQUE__Group__0 ) ) ;
    public final void ruleSTATISTIQUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:91:2: ( ( ( rule__STATISTIQUE__Group__0 ) ) )
            // InternalCalcul.g:92:2: ( ( rule__STATISTIQUE__Group__0 ) )
            {
            // InternalCalcul.g:92:2: ( ( rule__STATISTIQUE__Group__0 ) )
            // InternalCalcul.g:93:3: ( rule__STATISTIQUE__Group__0 )
            {
             before(grammarAccess.getSTATISTIQUEAccess().getGroup()); 
            // InternalCalcul.g:94:3: ( rule__STATISTIQUE__Group__0 )
            // InternalCalcul.g:94:4: rule__STATISTIQUE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSTATISTIQUEAccess().getGroup()); 

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
    // $ANTLR end "ruleSTATISTIQUE"


    // $ANTLR start "entryRuleDEBUT"
    // InternalCalcul.g:103:1: entryRuleDEBUT : ruleDEBUT EOF ;
    public final void entryRuleDEBUT() throws RecognitionException {
        try {
            // InternalCalcul.g:104:1: ( ruleDEBUT EOF )
            // InternalCalcul.g:105:1: ruleDEBUT EOF
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
    // InternalCalcul.g:112:1: ruleDEBUT : ( 'begin' ) ;
    public final void ruleDEBUT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:116:2: ( ( 'begin' ) )
            // InternalCalcul.g:117:2: ( 'begin' )
            {
            // InternalCalcul.g:117:2: ( 'begin' )
            // InternalCalcul.g:118:3: 'begin'
            {
             before(grammarAccess.getDEBUTAccess().getBeginKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDEBUTAccess().getBeginKeyword()); 

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


    // $ANTLR start "entryRuleMODALITE"
    // InternalCalcul.g:128:1: entryRuleMODALITE : ruleMODALITE EOF ;
    public final void entryRuleMODALITE() throws RecognitionException {
        try {
            // InternalCalcul.g:129:1: ( ruleMODALITE EOF )
            // InternalCalcul.g:130:1: ruleMODALITE EOF
            {
             before(grammarAccess.getMODALITERule()); 
            pushFollow(FOLLOW_1);
            ruleMODALITE();

            state._fsp--;

             after(grammarAccess.getMODALITERule()); 
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
    // $ANTLR end "entryRuleMODALITE"


    // $ANTLR start "ruleMODALITE"
    // InternalCalcul.g:137:1: ruleMODALITE : ( ( rule__MODALITE__Group__0 ) ) ;
    public final void ruleMODALITE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:141:2: ( ( ( rule__MODALITE__Group__0 ) ) )
            // InternalCalcul.g:142:2: ( ( rule__MODALITE__Group__0 ) )
            {
            // InternalCalcul.g:142:2: ( ( rule__MODALITE__Group__0 ) )
            // InternalCalcul.g:143:3: ( rule__MODALITE__Group__0 )
            {
             before(grammarAccess.getMODALITEAccess().getGroup()); 
            // InternalCalcul.g:144:3: ( rule__MODALITE__Group__0 )
            // InternalCalcul.g:144:4: rule__MODALITE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MODALITE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMODALITEAccess().getGroup()); 

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
    // $ANTLR end "ruleMODALITE"


    // $ANTLR start "entryRuleEFFECTIF"
    // InternalCalcul.g:153:1: entryRuleEFFECTIF : ruleEFFECTIF EOF ;
    public final void entryRuleEFFECTIF() throws RecognitionException {
        try {
            // InternalCalcul.g:154:1: ( ruleEFFECTIF EOF )
            // InternalCalcul.g:155:1: ruleEFFECTIF EOF
            {
             before(grammarAccess.getEFFECTIFRule()); 
            pushFollow(FOLLOW_1);
            ruleEFFECTIF();

            state._fsp--;

             after(grammarAccess.getEFFECTIFRule()); 
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
    // $ANTLR end "entryRuleEFFECTIF"


    // $ANTLR start "ruleEFFECTIF"
    // InternalCalcul.g:162:1: ruleEFFECTIF : ( ( rule__EFFECTIF__Group__0 ) ) ;
    public final void ruleEFFECTIF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:166:2: ( ( ( rule__EFFECTIF__Group__0 ) ) )
            // InternalCalcul.g:167:2: ( ( rule__EFFECTIF__Group__0 ) )
            {
            // InternalCalcul.g:167:2: ( ( rule__EFFECTIF__Group__0 ) )
            // InternalCalcul.g:168:3: ( rule__EFFECTIF__Group__0 )
            {
             before(grammarAccess.getEFFECTIFAccess().getGroup()); 
            // InternalCalcul.g:169:3: ( rule__EFFECTIF__Group__0 )
            // InternalCalcul.g:169:4: rule__EFFECTIF__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFFECTIF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFFECTIFAccess().getGroup()); 

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
    // $ANTLR end "ruleEFFECTIF"


    // $ANTLR start "entryRuleRETOUR"
    // InternalCalcul.g:178:1: entryRuleRETOUR : ruleRETOUR EOF ;
    public final void entryRuleRETOUR() throws RecognitionException {
        try {
            // InternalCalcul.g:179:1: ( ruleRETOUR EOF )
            // InternalCalcul.g:180:1: ruleRETOUR EOF
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
    // InternalCalcul.g:187:1: ruleRETOUR : ( ( rule__RETOUR__Alternatives ) ) ;
    public final void ruleRETOUR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:191:2: ( ( ( rule__RETOUR__Alternatives ) ) )
            // InternalCalcul.g:192:2: ( ( rule__RETOUR__Alternatives ) )
            {
            // InternalCalcul.g:192:2: ( ( rule__RETOUR__Alternatives ) )
            // InternalCalcul.g:193:3: ( rule__RETOUR__Alternatives )
            {
             before(grammarAccess.getRETOURAccess().getAlternatives()); 
            // InternalCalcul.g:194:3: ( rule__RETOUR__Alternatives )
            // InternalCalcul.g:194:4: rule__RETOUR__Alternatives
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
    // InternalCalcul.g:203:1: entryRuleEND : ruleEND EOF ;
    public final void entryRuleEND() throws RecognitionException {
        try {
            // InternalCalcul.g:204:1: ( ruleEND EOF )
            // InternalCalcul.g:205:1: ruleEND EOF
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
    // InternalCalcul.g:212:1: ruleEND : ( 'end' ) ;
    public final void ruleEND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:216:2: ( ( 'end' ) )
            // InternalCalcul.g:217:2: ( 'end' )
            {
            // InternalCalcul.g:217:2: ( 'end' )
            // InternalCalcul.g:218:3: 'end'
            {
             before(grammarAccess.getENDAccess().getEndKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getENDAccess().getEndKeyword()); 

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


    // $ANTLR start "rule__RETOUR__Alternatives"
    // InternalCalcul.g:227:1: rule__RETOUR__Alternatives : ( ( 'moyenne' ) | ( 'mode' ) | ( 'variance' ) | ( 'ecart-type' ) );
    public final void rule__RETOUR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:231:1: ( ( 'moyenne' ) | ( 'mode' ) | ( 'variance' ) | ( 'ecart-type' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCalcul.g:232:2: ( 'moyenne' )
                    {
                    // InternalCalcul.g:232:2: ( 'moyenne' )
                    // InternalCalcul.g:233:3: 'moyenne'
                    {
                     before(grammarAccess.getRETOURAccess().getMoyenneKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRETOURAccess().getMoyenneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalcul.g:238:2: ( 'mode' )
                    {
                    // InternalCalcul.g:238:2: ( 'mode' )
                    // InternalCalcul.g:239:3: 'mode'
                    {
                     before(grammarAccess.getRETOURAccess().getModeKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRETOURAccess().getModeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCalcul.g:244:2: ( 'variance' )
                    {
                    // InternalCalcul.g:244:2: ( 'variance' )
                    // InternalCalcul.g:245:3: 'variance'
                    {
                     before(grammarAccess.getRETOURAccess().getVarianceKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRETOURAccess().getVarianceKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCalcul.g:250:2: ( 'ecart-type' )
                    {
                    // InternalCalcul.g:250:2: ( 'ecart-type' )
                    // InternalCalcul.g:251:3: 'ecart-type'
                    {
                     before(grammarAccess.getRETOURAccess().getEcartTypeKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getRETOURAccess().getEcartTypeKeyword_3()); 

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


    // $ANTLR start "rule__STATISTIQUE__Group__0"
    // InternalCalcul.g:260:1: rule__STATISTIQUE__Group__0 : rule__STATISTIQUE__Group__0__Impl rule__STATISTIQUE__Group__1 ;
    public final void rule__STATISTIQUE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:264:1: ( rule__STATISTIQUE__Group__0__Impl rule__STATISTIQUE__Group__1 )
            // InternalCalcul.g:265:2: rule__STATISTIQUE__Group__0__Impl rule__STATISTIQUE__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__STATISTIQUE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__1();

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
    // $ANTLR end "rule__STATISTIQUE__Group__0"


    // $ANTLR start "rule__STATISTIQUE__Group__0__Impl"
    // InternalCalcul.g:272:1: rule__STATISTIQUE__Group__0__Impl : ( 'program' ) ;
    public final void rule__STATISTIQUE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:276:1: ( ( 'program' ) )
            // InternalCalcul.g:277:1: ( 'program' )
            {
            // InternalCalcul.g:277:1: ( 'program' )
            // InternalCalcul.g:278:2: 'program'
            {
             before(grammarAccess.getSTATISTIQUEAccess().getProgramKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSTATISTIQUEAccess().getProgramKeyword_0()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__0__Impl"


    // $ANTLR start "rule__STATISTIQUE__Group__1"
    // InternalCalcul.g:287:1: rule__STATISTIQUE__Group__1 : rule__STATISTIQUE__Group__1__Impl rule__STATISTIQUE__Group__2 ;
    public final void rule__STATISTIQUE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:291:1: ( rule__STATISTIQUE__Group__1__Impl rule__STATISTIQUE__Group__2 )
            // InternalCalcul.g:292:2: rule__STATISTIQUE__Group__1__Impl rule__STATISTIQUE__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__STATISTIQUE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__2();

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
    // $ANTLR end "rule__STATISTIQUE__Group__1"


    // $ANTLR start "rule__STATISTIQUE__Group__1__Impl"
    // InternalCalcul.g:299:1: rule__STATISTIQUE__Group__1__Impl : ( ( rule__STATISTIQUE__NomAssignment_1 ) ) ;
    public final void rule__STATISTIQUE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:303:1: ( ( ( rule__STATISTIQUE__NomAssignment_1 ) ) )
            // InternalCalcul.g:304:1: ( ( rule__STATISTIQUE__NomAssignment_1 ) )
            {
            // InternalCalcul.g:304:1: ( ( rule__STATISTIQUE__NomAssignment_1 ) )
            // InternalCalcul.g:305:2: ( rule__STATISTIQUE__NomAssignment_1 )
            {
             before(grammarAccess.getSTATISTIQUEAccess().getNomAssignment_1()); 
            // InternalCalcul.g:306:2: ( rule__STATISTIQUE__NomAssignment_1 )
            // InternalCalcul.g:306:3: rule__STATISTIQUE__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSTATISTIQUEAccess().getNomAssignment_1()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__1__Impl"


    // $ANTLR start "rule__STATISTIQUE__Group__2"
    // InternalCalcul.g:314:1: rule__STATISTIQUE__Group__2 : rule__STATISTIQUE__Group__2__Impl rule__STATISTIQUE__Group__3 ;
    public final void rule__STATISTIQUE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:318:1: ( rule__STATISTIQUE__Group__2__Impl rule__STATISTIQUE__Group__3 )
            // InternalCalcul.g:319:2: rule__STATISTIQUE__Group__2__Impl rule__STATISTIQUE__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__STATISTIQUE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__3();

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
    // $ANTLR end "rule__STATISTIQUE__Group__2"


    // $ANTLR start "rule__STATISTIQUE__Group__2__Impl"
    // InternalCalcul.g:326:1: rule__STATISTIQUE__Group__2__Impl : ( ( rule__STATISTIQUE__DebutAssignment_2 ) ) ;
    public final void rule__STATISTIQUE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:330:1: ( ( ( rule__STATISTIQUE__DebutAssignment_2 ) ) )
            // InternalCalcul.g:331:1: ( ( rule__STATISTIQUE__DebutAssignment_2 ) )
            {
            // InternalCalcul.g:331:1: ( ( rule__STATISTIQUE__DebutAssignment_2 ) )
            // InternalCalcul.g:332:2: ( rule__STATISTIQUE__DebutAssignment_2 )
            {
             before(grammarAccess.getSTATISTIQUEAccess().getDebutAssignment_2()); 
            // InternalCalcul.g:333:2: ( rule__STATISTIQUE__DebutAssignment_2 )
            // InternalCalcul.g:333:3: rule__STATISTIQUE__DebutAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__DebutAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSTATISTIQUEAccess().getDebutAssignment_2()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__2__Impl"


    // $ANTLR start "rule__STATISTIQUE__Group__3"
    // InternalCalcul.g:341:1: rule__STATISTIQUE__Group__3 : rule__STATISTIQUE__Group__3__Impl rule__STATISTIQUE__Group__4 ;
    public final void rule__STATISTIQUE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:345:1: ( rule__STATISTIQUE__Group__3__Impl rule__STATISTIQUE__Group__4 )
            // InternalCalcul.g:346:2: rule__STATISTIQUE__Group__3__Impl rule__STATISTIQUE__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__STATISTIQUE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__4();

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
    // $ANTLR end "rule__STATISTIQUE__Group__3"


    // $ANTLR start "rule__STATISTIQUE__Group__3__Impl"
    // InternalCalcul.g:353:1: rule__STATISTIQUE__Group__3__Impl : ( 'mod:' ) ;
    public final void rule__STATISTIQUE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:357:1: ( ( 'mod:' ) )
            // InternalCalcul.g:358:1: ( 'mod:' )
            {
            // InternalCalcul.g:358:1: ( 'mod:' )
            // InternalCalcul.g:359:2: 'mod:'
            {
             before(grammarAccess.getSTATISTIQUEAccess().getModKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSTATISTIQUEAccess().getModKeyword_3()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__3__Impl"


    // $ANTLR start "rule__STATISTIQUE__Group__4"
    // InternalCalcul.g:368:1: rule__STATISTIQUE__Group__4 : rule__STATISTIQUE__Group__4__Impl rule__STATISTIQUE__Group__5 ;
    public final void rule__STATISTIQUE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:372:1: ( rule__STATISTIQUE__Group__4__Impl rule__STATISTIQUE__Group__5 )
            // InternalCalcul.g:373:2: rule__STATISTIQUE__Group__4__Impl rule__STATISTIQUE__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__STATISTIQUE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__5();

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
    // $ANTLR end "rule__STATISTIQUE__Group__4"


    // $ANTLR start "rule__STATISTIQUE__Group__4__Impl"
    // InternalCalcul.g:380:1: rule__STATISTIQUE__Group__4__Impl : ( ( rule__STATISTIQUE__ModaliteAssignment_4 ) ) ;
    public final void rule__STATISTIQUE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:384:1: ( ( ( rule__STATISTIQUE__ModaliteAssignment_4 ) ) )
            // InternalCalcul.g:385:1: ( ( rule__STATISTIQUE__ModaliteAssignment_4 ) )
            {
            // InternalCalcul.g:385:1: ( ( rule__STATISTIQUE__ModaliteAssignment_4 ) )
            // InternalCalcul.g:386:2: ( rule__STATISTIQUE__ModaliteAssignment_4 )
            {
             before(grammarAccess.getSTATISTIQUEAccess().getModaliteAssignment_4()); 
            // InternalCalcul.g:387:2: ( rule__STATISTIQUE__ModaliteAssignment_4 )
            // InternalCalcul.g:387:3: rule__STATISTIQUE__ModaliteAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__ModaliteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSTATISTIQUEAccess().getModaliteAssignment_4()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__4__Impl"


    // $ANTLR start "rule__STATISTIQUE__Group__5"
    // InternalCalcul.g:395:1: rule__STATISTIQUE__Group__5 : rule__STATISTIQUE__Group__5__Impl rule__STATISTIQUE__Group__6 ;
    public final void rule__STATISTIQUE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:399:1: ( rule__STATISTIQUE__Group__5__Impl rule__STATISTIQUE__Group__6 )
            // InternalCalcul.g:400:2: rule__STATISTIQUE__Group__5__Impl rule__STATISTIQUE__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__STATISTIQUE__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__6();

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
    // $ANTLR end "rule__STATISTIQUE__Group__5"


    // $ANTLR start "rule__STATISTIQUE__Group__5__Impl"
    // InternalCalcul.g:407:1: rule__STATISTIQUE__Group__5__Impl : ( 'eff:' ) ;
    public final void rule__STATISTIQUE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:411:1: ( ( 'eff:' ) )
            // InternalCalcul.g:412:1: ( 'eff:' )
            {
            // InternalCalcul.g:412:1: ( 'eff:' )
            // InternalCalcul.g:413:2: 'eff:'
            {
             before(grammarAccess.getSTATISTIQUEAccess().getEffKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSTATISTIQUEAccess().getEffKeyword_5()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__5__Impl"


    // $ANTLR start "rule__STATISTIQUE__Group__6"
    // InternalCalcul.g:422:1: rule__STATISTIQUE__Group__6 : rule__STATISTIQUE__Group__6__Impl rule__STATISTIQUE__Group__7 ;
    public final void rule__STATISTIQUE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:426:1: ( rule__STATISTIQUE__Group__6__Impl rule__STATISTIQUE__Group__7 )
            // InternalCalcul.g:427:2: rule__STATISTIQUE__Group__6__Impl rule__STATISTIQUE__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__STATISTIQUE__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__7();

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
    // $ANTLR end "rule__STATISTIQUE__Group__6"


    // $ANTLR start "rule__STATISTIQUE__Group__6__Impl"
    // InternalCalcul.g:434:1: rule__STATISTIQUE__Group__6__Impl : ( ( rule__STATISTIQUE__EffectifAssignment_6 ) ) ;
    public final void rule__STATISTIQUE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:438:1: ( ( ( rule__STATISTIQUE__EffectifAssignment_6 ) ) )
            // InternalCalcul.g:439:1: ( ( rule__STATISTIQUE__EffectifAssignment_6 ) )
            {
            // InternalCalcul.g:439:1: ( ( rule__STATISTIQUE__EffectifAssignment_6 ) )
            // InternalCalcul.g:440:2: ( rule__STATISTIQUE__EffectifAssignment_6 )
            {
             before(grammarAccess.getSTATISTIQUEAccess().getEffectifAssignment_6()); 
            // InternalCalcul.g:441:2: ( rule__STATISTIQUE__EffectifAssignment_6 )
            // InternalCalcul.g:441:3: rule__STATISTIQUE__EffectifAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__EffectifAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSTATISTIQUEAccess().getEffectifAssignment_6()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__6__Impl"


    // $ANTLR start "rule__STATISTIQUE__Group__7"
    // InternalCalcul.g:449:1: rule__STATISTIQUE__Group__7 : rule__STATISTIQUE__Group__7__Impl rule__STATISTIQUE__Group__8 ;
    public final void rule__STATISTIQUE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:453:1: ( rule__STATISTIQUE__Group__7__Impl rule__STATISTIQUE__Group__8 )
            // InternalCalcul.g:454:2: rule__STATISTIQUE__Group__7__Impl rule__STATISTIQUE__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__STATISTIQUE__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__8();

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
    // $ANTLR end "rule__STATISTIQUE__Group__7"


    // $ANTLR start "rule__STATISTIQUE__Group__7__Impl"
    // InternalCalcul.g:461:1: rule__STATISTIQUE__Group__7__Impl : ( 'return' ) ;
    public final void rule__STATISTIQUE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:465:1: ( ( 'return' ) )
            // InternalCalcul.g:466:1: ( 'return' )
            {
            // InternalCalcul.g:466:1: ( 'return' )
            // InternalCalcul.g:467:2: 'return'
            {
             before(grammarAccess.getSTATISTIQUEAccess().getReturnKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSTATISTIQUEAccess().getReturnKeyword_7()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__7__Impl"


    // $ANTLR start "rule__STATISTIQUE__Group__8"
    // InternalCalcul.g:476:1: rule__STATISTIQUE__Group__8 : rule__STATISTIQUE__Group__8__Impl rule__STATISTIQUE__Group__9 ;
    public final void rule__STATISTIQUE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:480:1: ( rule__STATISTIQUE__Group__8__Impl rule__STATISTIQUE__Group__9 )
            // InternalCalcul.g:481:2: rule__STATISTIQUE__Group__8__Impl rule__STATISTIQUE__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__STATISTIQUE__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__9();

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
    // $ANTLR end "rule__STATISTIQUE__Group__8"


    // $ANTLR start "rule__STATISTIQUE__Group__8__Impl"
    // InternalCalcul.g:488:1: rule__STATISTIQUE__Group__8__Impl : ( ( rule__STATISTIQUE__ResultatAssignment_8 ) ) ;
    public final void rule__STATISTIQUE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:492:1: ( ( ( rule__STATISTIQUE__ResultatAssignment_8 ) ) )
            // InternalCalcul.g:493:1: ( ( rule__STATISTIQUE__ResultatAssignment_8 ) )
            {
            // InternalCalcul.g:493:1: ( ( rule__STATISTIQUE__ResultatAssignment_8 ) )
            // InternalCalcul.g:494:2: ( rule__STATISTIQUE__ResultatAssignment_8 )
            {
             before(grammarAccess.getSTATISTIQUEAccess().getResultatAssignment_8()); 
            // InternalCalcul.g:495:2: ( rule__STATISTIQUE__ResultatAssignment_8 )
            // InternalCalcul.g:495:3: rule__STATISTIQUE__ResultatAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__ResultatAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSTATISTIQUEAccess().getResultatAssignment_8()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__8__Impl"


    // $ANTLR start "rule__STATISTIQUE__Group__9"
    // InternalCalcul.g:503:1: rule__STATISTIQUE__Group__9 : rule__STATISTIQUE__Group__9__Impl rule__STATISTIQUE__Group__10 ;
    public final void rule__STATISTIQUE__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:507:1: ( rule__STATISTIQUE__Group__9__Impl rule__STATISTIQUE__Group__10 )
            // InternalCalcul.g:508:2: rule__STATISTIQUE__Group__9__Impl rule__STATISTIQUE__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__STATISTIQUE__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__10();

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
    // $ANTLR end "rule__STATISTIQUE__Group__9"


    // $ANTLR start "rule__STATISTIQUE__Group__9__Impl"
    // InternalCalcul.g:515:1: rule__STATISTIQUE__Group__9__Impl : ( ';' ) ;
    public final void rule__STATISTIQUE__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:519:1: ( ( ';' ) )
            // InternalCalcul.g:520:1: ( ';' )
            {
            // InternalCalcul.g:520:1: ( ';' )
            // InternalCalcul.g:521:2: ';'
            {
             before(grammarAccess.getSTATISTIQUEAccess().getSemicolonKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSTATISTIQUEAccess().getSemicolonKeyword_9()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__9__Impl"


    // $ANTLR start "rule__STATISTIQUE__Group__10"
    // InternalCalcul.g:530:1: rule__STATISTIQUE__Group__10 : rule__STATISTIQUE__Group__10__Impl ;
    public final void rule__STATISTIQUE__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:534:1: ( rule__STATISTIQUE__Group__10__Impl )
            // InternalCalcul.g:535:2: rule__STATISTIQUE__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__Group__10__Impl();

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
    // $ANTLR end "rule__STATISTIQUE__Group__10"


    // $ANTLR start "rule__STATISTIQUE__Group__10__Impl"
    // InternalCalcul.g:541:1: rule__STATISTIQUE__Group__10__Impl : ( ( rule__STATISTIQUE__EndAssignment_10 ) ) ;
    public final void rule__STATISTIQUE__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:545:1: ( ( ( rule__STATISTIQUE__EndAssignment_10 ) ) )
            // InternalCalcul.g:546:1: ( ( rule__STATISTIQUE__EndAssignment_10 ) )
            {
            // InternalCalcul.g:546:1: ( ( rule__STATISTIQUE__EndAssignment_10 ) )
            // InternalCalcul.g:547:2: ( rule__STATISTIQUE__EndAssignment_10 )
            {
             before(grammarAccess.getSTATISTIQUEAccess().getEndAssignment_10()); 
            // InternalCalcul.g:548:2: ( rule__STATISTIQUE__EndAssignment_10 )
            // InternalCalcul.g:548:3: rule__STATISTIQUE__EndAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__STATISTIQUE__EndAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSTATISTIQUEAccess().getEndAssignment_10()); 

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
    // $ANTLR end "rule__STATISTIQUE__Group__10__Impl"


    // $ANTLR start "rule__MODALITE__Group__0"
    // InternalCalcul.g:557:1: rule__MODALITE__Group__0 : rule__MODALITE__Group__0__Impl rule__MODALITE__Group__1 ;
    public final void rule__MODALITE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:561:1: ( rule__MODALITE__Group__0__Impl rule__MODALITE__Group__1 )
            // InternalCalcul.g:562:2: rule__MODALITE__Group__0__Impl rule__MODALITE__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MODALITE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODALITE__Group__1();

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
    // $ANTLR end "rule__MODALITE__Group__0"


    // $ANTLR start "rule__MODALITE__Group__0__Impl"
    // InternalCalcul.g:569:1: rule__MODALITE__Group__0__Impl : ( 'mod:' ) ;
    public final void rule__MODALITE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:573:1: ( ( 'mod:' ) )
            // InternalCalcul.g:574:1: ( 'mod:' )
            {
            // InternalCalcul.g:574:1: ( 'mod:' )
            // InternalCalcul.g:575:2: 'mod:'
            {
             before(grammarAccess.getMODALITEAccess().getModKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMODALITEAccess().getModKeyword_0()); 

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
    // $ANTLR end "rule__MODALITE__Group__0__Impl"


    // $ANTLR start "rule__MODALITE__Group__1"
    // InternalCalcul.g:584:1: rule__MODALITE__Group__1 : rule__MODALITE__Group__1__Impl rule__MODALITE__Group__2 ;
    public final void rule__MODALITE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:588:1: ( rule__MODALITE__Group__1__Impl rule__MODALITE__Group__2 )
            // InternalCalcul.g:589:2: rule__MODALITE__Group__1__Impl rule__MODALITE__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MODALITE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODALITE__Group__2();

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
    // $ANTLR end "rule__MODALITE__Group__1"


    // $ANTLR start "rule__MODALITE__Group__1__Impl"
    // InternalCalcul.g:596:1: rule__MODALITE__Group__1__Impl : ( ( rule__MODALITE__ValuesAssignment_1 ) ) ;
    public final void rule__MODALITE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:600:1: ( ( ( rule__MODALITE__ValuesAssignment_1 ) ) )
            // InternalCalcul.g:601:1: ( ( rule__MODALITE__ValuesAssignment_1 ) )
            {
            // InternalCalcul.g:601:1: ( ( rule__MODALITE__ValuesAssignment_1 ) )
            // InternalCalcul.g:602:2: ( rule__MODALITE__ValuesAssignment_1 )
            {
             before(grammarAccess.getMODALITEAccess().getValuesAssignment_1()); 
            // InternalCalcul.g:603:2: ( rule__MODALITE__ValuesAssignment_1 )
            // InternalCalcul.g:603:3: rule__MODALITE__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MODALITE__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMODALITEAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__MODALITE__Group__1__Impl"


    // $ANTLR start "rule__MODALITE__Group__2"
    // InternalCalcul.g:611:1: rule__MODALITE__Group__2 : rule__MODALITE__Group__2__Impl rule__MODALITE__Group__3 ;
    public final void rule__MODALITE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:615:1: ( rule__MODALITE__Group__2__Impl rule__MODALITE__Group__3 )
            // InternalCalcul.g:616:2: rule__MODALITE__Group__2__Impl rule__MODALITE__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__MODALITE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODALITE__Group__3();

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
    // $ANTLR end "rule__MODALITE__Group__2"


    // $ANTLR start "rule__MODALITE__Group__2__Impl"
    // InternalCalcul.g:623:1: rule__MODALITE__Group__2__Impl : ( ( rule__MODALITE__Group_2__0 )* ) ;
    public final void rule__MODALITE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:627:1: ( ( ( rule__MODALITE__Group_2__0 )* ) )
            // InternalCalcul.g:628:1: ( ( rule__MODALITE__Group_2__0 )* )
            {
            // InternalCalcul.g:628:1: ( ( rule__MODALITE__Group_2__0 )* )
            // InternalCalcul.g:629:2: ( rule__MODALITE__Group_2__0 )*
            {
             before(grammarAccess.getMODALITEAccess().getGroup_2()); 
            // InternalCalcul.g:630:2: ( rule__MODALITE__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCalcul.g:630:3: rule__MODALITE__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MODALITE__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMODALITEAccess().getGroup_2()); 

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
    // $ANTLR end "rule__MODALITE__Group__2__Impl"


    // $ANTLR start "rule__MODALITE__Group__3"
    // InternalCalcul.g:638:1: rule__MODALITE__Group__3 : rule__MODALITE__Group__3__Impl ;
    public final void rule__MODALITE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:642:1: ( rule__MODALITE__Group__3__Impl )
            // InternalCalcul.g:643:2: rule__MODALITE__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODALITE__Group__3__Impl();

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
    // $ANTLR end "rule__MODALITE__Group__3"


    // $ANTLR start "rule__MODALITE__Group__3__Impl"
    // InternalCalcul.g:649:1: rule__MODALITE__Group__3__Impl : ( ';' ) ;
    public final void rule__MODALITE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:653:1: ( ( ';' ) )
            // InternalCalcul.g:654:1: ( ';' )
            {
            // InternalCalcul.g:654:1: ( ';' )
            // InternalCalcul.g:655:2: ';'
            {
             before(grammarAccess.getMODALITEAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMODALITEAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__MODALITE__Group__3__Impl"


    // $ANTLR start "rule__MODALITE__Group_2__0"
    // InternalCalcul.g:665:1: rule__MODALITE__Group_2__0 : rule__MODALITE__Group_2__0__Impl rule__MODALITE__Group_2__1 ;
    public final void rule__MODALITE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:669:1: ( rule__MODALITE__Group_2__0__Impl rule__MODALITE__Group_2__1 )
            // InternalCalcul.g:670:2: rule__MODALITE__Group_2__0__Impl rule__MODALITE__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__MODALITE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODALITE__Group_2__1();

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
    // $ANTLR end "rule__MODALITE__Group_2__0"


    // $ANTLR start "rule__MODALITE__Group_2__0__Impl"
    // InternalCalcul.g:677:1: rule__MODALITE__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MODALITE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:681:1: ( ( ',' ) )
            // InternalCalcul.g:682:1: ( ',' )
            {
            // InternalCalcul.g:682:1: ( ',' )
            // InternalCalcul.g:683:2: ','
            {
             before(grammarAccess.getMODALITEAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMODALITEAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__MODALITE__Group_2__0__Impl"


    // $ANTLR start "rule__MODALITE__Group_2__1"
    // InternalCalcul.g:692:1: rule__MODALITE__Group_2__1 : rule__MODALITE__Group_2__1__Impl ;
    public final void rule__MODALITE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:696:1: ( rule__MODALITE__Group_2__1__Impl )
            // InternalCalcul.g:697:2: rule__MODALITE__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODALITE__Group_2__1__Impl();

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
    // $ANTLR end "rule__MODALITE__Group_2__1"


    // $ANTLR start "rule__MODALITE__Group_2__1__Impl"
    // InternalCalcul.g:703:1: rule__MODALITE__Group_2__1__Impl : ( ( rule__MODALITE__ValuesAssignment_2_1 ) ) ;
    public final void rule__MODALITE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:707:1: ( ( ( rule__MODALITE__ValuesAssignment_2_1 ) ) )
            // InternalCalcul.g:708:1: ( ( rule__MODALITE__ValuesAssignment_2_1 ) )
            {
            // InternalCalcul.g:708:1: ( ( rule__MODALITE__ValuesAssignment_2_1 ) )
            // InternalCalcul.g:709:2: ( rule__MODALITE__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getMODALITEAccess().getValuesAssignment_2_1()); 
            // InternalCalcul.g:710:2: ( rule__MODALITE__ValuesAssignment_2_1 )
            // InternalCalcul.g:710:3: rule__MODALITE__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MODALITE__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMODALITEAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__MODALITE__Group_2__1__Impl"


    // $ANTLR start "rule__EFFECTIF__Group__0"
    // InternalCalcul.g:719:1: rule__EFFECTIF__Group__0 : rule__EFFECTIF__Group__0__Impl rule__EFFECTIF__Group__1 ;
    public final void rule__EFFECTIF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:723:1: ( rule__EFFECTIF__Group__0__Impl rule__EFFECTIF__Group__1 )
            // InternalCalcul.g:724:2: rule__EFFECTIF__Group__0__Impl rule__EFFECTIF__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EFFECTIF__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFFECTIF__Group__1();

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
    // $ANTLR end "rule__EFFECTIF__Group__0"


    // $ANTLR start "rule__EFFECTIF__Group__0__Impl"
    // InternalCalcul.g:731:1: rule__EFFECTIF__Group__0__Impl : ( 'eff:' ) ;
    public final void rule__EFFECTIF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:735:1: ( ( 'eff:' ) )
            // InternalCalcul.g:736:1: ( 'eff:' )
            {
            // InternalCalcul.g:736:1: ( 'eff:' )
            // InternalCalcul.g:737:2: 'eff:'
            {
             before(grammarAccess.getEFFECTIFAccess().getEffKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEFFECTIFAccess().getEffKeyword_0()); 

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
    // $ANTLR end "rule__EFFECTIF__Group__0__Impl"


    // $ANTLR start "rule__EFFECTIF__Group__1"
    // InternalCalcul.g:746:1: rule__EFFECTIF__Group__1 : rule__EFFECTIF__Group__1__Impl rule__EFFECTIF__Group__2 ;
    public final void rule__EFFECTIF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:750:1: ( rule__EFFECTIF__Group__1__Impl rule__EFFECTIF__Group__2 )
            // InternalCalcul.g:751:2: rule__EFFECTIF__Group__1__Impl rule__EFFECTIF__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EFFECTIF__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFFECTIF__Group__2();

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
    // $ANTLR end "rule__EFFECTIF__Group__1"


    // $ANTLR start "rule__EFFECTIF__Group__1__Impl"
    // InternalCalcul.g:758:1: rule__EFFECTIF__Group__1__Impl : ( ( rule__EFFECTIF__ValuesAssignment_1 ) ) ;
    public final void rule__EFFECTIF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:762:1: ( ( ( rule__EFFECTIF__ValuesAssignment_1 ) ) )
            // InternalCalcul.g:763:1: ( ( rule__EFFECTIF__ValuesAssignment_1 ) )
            {
            // InternalCalcul.g:763:1: ( ( rule__EFFECTIF__ValuesAssignment_1 ) )
            // InternalCalcul.g:764:2: ( rule__EFFECTIF__ValuesAssignment_1 )
            {
             before(grammarAccess.getEFFECTIFAccess().getValuesAssignment_1()); 
            // InternalCalcul.g:765:2: ( rule__EFFECTIF__ValuesAssignment_1 )
            // InternalCalcul.g:765:3: rule__EFFECTIF__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EFFECTIF__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEFFECTIFAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__EFFECTIF__Group__1__Impl"


    // $ANTLR start "rule__EFFECTIF__Group__2"
    // InternalCalcul.g:773:1: rule__EFFECTIF__Group__2 : rule__EFFECTIF__Group__2__Impl rule__EFFECTIF__Group__3 ;
    public final void rule__EFFECTIF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:777:1: ( rule__EFFECTIF__Group__2__Impl rule__EFFECTIF__Group__3 )
            // InternalCalcul.g:778:2: rule__EFFECTIF__Group__2__Impl rule__EFFECTIF__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EFFECTIF__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFFECTIF__Group__3();

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
    // $ANTLR end "rule__EFFECTIF__Group__2"


    // $ANTLR start "rule__EFFECTIF__Group__2__Impl"
    // InternalCalcul.g:785:1: rule__EFFECTIF__Group__2__Impl : ( ( rule__EFFECTIF__Group_2__0 )* ) ;
    public final void rule__EFFECTIF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:789:1: ( ( ( rule__EFFECTIF__Group_2__0 )* ) )
            // InternalCalcul.g:790:1: ( ( rule__EFFECTIF__Group_2__0 )* )
            {
            // InternalCalcul.g:790:1: ( ( rule__EFFECTIF__Group_2__0 )* )
            // InternalCalcul.g:791:2: ( rule__EFFECTIF__Group_2__0 )*
            {
             before(grammarAccess.getEFFECTIFAccess().getGroup_2()); 
            // InternalCalcul.g:792:2: ( rule__EFFECTIF__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCalcul.g:792:3: rule__EFFECTIF__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EFFECTIF__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEFFECTIFAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EFFECTIF__Group__2__Impl"


    // $ANTLR start "rule__EFFECTIF__Group__3"
    // InternalCalcul.g:800:1: rule__EFFECTIF__Group__3 : rule__EFFECTIF__Group__3__Impl ;
    public final void rule__EFFECTIF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:804:1: ( rule__EFFECTIF__Group__3__Impl )
            // InternalCalcul.g:805:2: rule__EFFECTIF__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFFECTIF__Group__3__Impl();

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
    // $ANTLR end "rule__EFFECTIF__Group__3"


    // $ANTLR start "rule__EFFECTIF__Group__3__Impl"
    // InternalCalcul.g:811:1: rule__EFFECTIF__Group__3__Impl : ( ';' ) ;
    public final void rule__EFFECTIF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:815:1: ( ( ';' ) )
            // InternalCalcul.g:816:1: ( ';' )
            {
            // InternalCalcul.g:816:1: ( ';' )
            // InternalCalcul.g:817:2: ';'
            {
             before(grammarAccess.getEFFECTIFAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEFFECTIFAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__EFFECTIF__Group__3__Impl"


    // $ANTLR start "rule__EFFECTIF__Group_2__0"
    // InternalCalcul.g:827:1: rule__EFFECTIF__Group_2__0 : rule__EFFECTIF__Group_2__0__Impl rule__EFFECTIF__Group_2__1 ;
    public final void rule__EFFECTIF__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:831:1: ( rule__EFFECTIF__Group_2__0__Impl rule__EFFECTIF__Group_2__1 )
            // InternalCalcul.g:832:2: rule__EFFECTIF__Group_2__0__Impl rule__EFFECTIF__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__EFFECTIF__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFFECTIF__Group_2__1();

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
    // $ANTLR end "rule__EFFECTIF__Group_2__0"


    // $ANTLR start "rule__EFFECTIF__Group_2__0__Impl"
    // InternalCalcul.g:839:1: rule__EFFECTIF__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EFFECTIF__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:843:1: ( ( ',' ) )
            // InternalCalcul.g:844:1: ( ',' )
            {
            // InternalCalcul.g:844:1: ( ',' )
            // InternalCalcul.g:845:2: ','
            {
             before(grammarAccess.getEFFECTIFAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEFFECTIFAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__EFFECTIF__Group_2__0__Impl"


    // $ANTLR start "rule__EFFECTIF__Group_2__1"
    // InternalCalcul.g:854:1: rule__EFFECTIF__Group_2__1 : rule__EFFECTIF__Group_2__1__Impl ;
    public final void rule__EFFECTIF__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:858:1: ( rule__EFFECTIF__Group_2__1__Impl )
            // InternalCalcul.g:859:2: rule__EFFECTIF__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFFECTIF__Group_2__1__Impl();

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
    // $ANTLR end "rule__EFFECTIF__Group_2__1"


    // $ANTLR start "rule__EFFECTIF__Group_2__1__Impl"
    // InternalCalcul.g:865:1: rule__EFFECTIF__Group_2__1__Impl : ( ( rule__EFFECTIF__ValuesAssignment_2_1 ) ) ;
    public final void rule__EFFECTIF__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:869:1: ( ( ( rule__EFFECTIF__ValuesAssignment_2_1 ) ) )
            // InternalCalcul.g:870:1: ( ( rule__EFFECTIF__ValuesAssignment_2_1 ) )
            {
            // InternalCalcul.g:870:1: ( ( rule__EFFECTIF__ValuesAssignment_2_1 ) )
            // InternalCalcul.g:871:2: ( rule__EFFECTIF__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getEFFECTIFAccess().getValuesAssignment_2_1()); 
            // InternalCalcul.g:872:2: ( rule__EFFECTIF__ValuesAssignment_2_1 )
            // InternalCalcul.g:872:3: rule__EFFECTIF__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EFFECTIF__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEFFECTIFAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__EFFECTIF__Group_2__1__Impl"


    // $ANTLR start "rule__CALCUL__OperationAssignment"
    // InternalCalcul.g:881:1: rule__CALCUL__OperationAssignment : ( ruleSTATISTIQUE ) ;
    public final void rule__CALCUL__OperationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:885:1: ( ( ruleSTATISTIQUE ) )
            // InternalCalcul.g:886:2: ( ruleSTATISTIQUE )
            {
            // InternalCalcul.g:886:2: ( ruleSTATISTIQUE )
            // InternalCalcul.g:887:3: ruleSTATISTIQUE
            {
             before(grammarAccess.getCALCULAccess().getOperationSTATISTIQUEParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSTATISTIQUE();

            state._fsp--;

             after(grammarAccess.getCALCULAccess().getOperationSTATISTIQUEParserRuleCall_0()); 

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
    // $ANTLR end "rule__CALCUL__OperationAssignment"


    // $ANTLR start "rule__STATISTIQUE__NomAssignment_1"
    // InternalCalcul.g:896:1: rule__STATISTIQUE__NomAssignment_1 : ( RULE_ID ) ;
    public final void rule__STATISTIQUE__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:900:1: ( ( RULE_ID ) )
            // InternalCalcul.g:901:2: ( RULE_ID )
            {
            // InternalCalcul.g:901:2: ( RULE_ID )
            // InternalCalcul.g:902:3: RULE_ID
            {
             before(grammarAccess.getSTATISTIQUEAccess().getNomIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSTATISTIQUEAccess().getNomIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__STATISTIQUE__NomAssignment_1"


    // $ANTLR start "rule__STATISTIQUE__DebutAssignment_2"
    // InternalCalcul.g:911:1: rule__STATISTIQUE__DebutAssignment_2 : ( ruleDEBUT ) ;
    public final void rule__STATISTIQUE__DebutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:915:1: ( ( ruleDEBUT ) )
            // InternalCalcul.g:916:2: ( ruleDEBUT )
            {
            // InternalCalcul.g:916:2: ( ruleDEBUT )
            // InternalCalcul.g:917:3: ruleDEBUT
            {
             before(grammarAccess.getSTATISTIQUEAccess().getDebutDEBUTParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDEBUT();

            state._fsp--;

             after(grammarAccess.getSTATISTIQUEAccess().getDebutDEBUTParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__STATISTIQUE__DebutAssignment_2"


    // $ANTLR start "rule__STATISTIQUE__ModaliteAssignment_4"
    // InternalCalcul.g:926:1: rule__STATISTIQUE__ModaliteAssignment_4 : ( ruleMODALITE ) ;
    public final void rule__STATISTIQUE__ModaliteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:930:1: ( ( ruleMODALITE ) )
            // InternalCalcul.g:931:2: ( ruleMODALITE )
            {
            // InternalCalcul.g:931:2: ( ruleMODALITE )
            // InternalCalcul.g:932:3: ruleMODALITE
            {
             before(grammarAccess.getSTATISTIQUEAccess().getModaliteMODALITEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMODALITE();

            state._fsp--;

             after(grammarAccess.getSTATISTIQUEAccess().getModaliteMODALITEParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__STATISTIQUE__ModaliteAssignment_4"


    // $ANTLR start "rule__STATISTIQUE__EffectifAssignment_6"
    // InternalCalcul.g:941:1: rule__STATISTIQUE__EffectifAssignment_6 : ( ruleEFFECTIF ) ;
    public final void rule__STATISTIQUE__EffectifAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:945:1: ( ( ruleEFFECTIF ) )
            // InternalCalcul.g:946:2: ( ruleEFFECTIF )
            {
            // InternalCalcul.g:946:2: ( ruleEFFECTIF )
            // InternalCalcul.g:947:3: ruleEFFECTIF
            {
             before(grammarAccess.getSTATISTIQUEAccess().getEffectifEFFECTIFParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEFFECTIF();

            state._fsp--;

             after(grammarAccess.getSTATISTIQUEAccess().getEffectifEFFECTIFParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__STATISTIQUE__EffectifAssignment_6"


    // $ANTLR start "rule__STATISTIQUE__ResultatAssignment_8"
    // InternalCalcul.g:956:1: rule__STATISTIQUE__ResultatAssignment_8 : ( ruleRETOUR ) ;
    public final void rule__STATISTIQUE__ResultatAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:960:1: ( ( ruleRETOUR ) )
            // InternalCalcul.g:961:2: ( ruleRETOUR )
            {
            // InternalCalcul.g:961:2: ( ruleRETOUR )
            // InternalCalcul.g:962:3: ruleRETOUR
            {
             before(grammarAccess.getSTATISTIQUEAccess().getResultatRETOURParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleRETOUR();

            state._fsp--;

             after(grammarAccess.getSTATISTIQUEAccess().getResultatRETOURParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__STATISTIQUE__ResultatAssignment_8"


    // $ANTLR start "rule__STATISTIQUE__EndAssignment_10"
    // InternalCalcul.g:971:1: rule__STATISTIQUE__EndAssignment_10 : ( ruleEND ) ;
    public final void rule__STATISTIQUE__EndAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:975:1: ( ( ruleEND ) )
            // InternalCalcul.g:976:2: ( ruleEND )
            {
            // InternalCalcul.g:976:2: ( ruleEND )
            // InternalCalcul.g:977:3: ruleEND
            {
             before(grammarAccess.getSTATISTIQUEAccess().getEndENDParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEND();

            state._fsp--;

             after(grammarAccess.getSTATISTIQUEAccess().getEndENDParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__STATISTIQUE__EndAssignment_10"


    // $ANTLR start "rule__MODALITE__ValuesAssignment_1"
    // InternalCalcul.g:986:1: rule__MODALITE__ValuesAssignment_1 : ( RULE_REEL ) ;
    public final void rule__MODALITE__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:990:1: ( ( RULE_REEL ) )
            // InternalCalcul.g:991:2: ( RULE_REEL )
            {
            // InternalCalcul.g:991:2: ( RULE_REEL )
            // InternalCalcul.g:992:3: RULE_REEL
            {
             before(grammarAccess.getMODALITEAccess().getValuesREELTerminalRuleCall_1_0()); 
            match(input,RULE_REEL,FOLLOW_2); 
             after(grammarAccess.getMODALITEAccess().getValuesREELTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MODALITE__ValuesAssignment_1"


    // $ANTLR start "rule__MODALITE__ValuesAssignment_2_1"
    // InternalCalcul.g:1001:1: rule__MODALITE__ValuesAssignment_2_1 : ( RULE_REEL ) ;
    public final void rule__MODALITE__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:1005:1: ( ( RULE_REEL ) )
            // InternalCalcul.g:1006:2: ( RULE_REEL )
            {
            // InternalCalcul.g:1006:2: ( RULE_REEL )
            // InternalCalcul.g:1007:3: RULE_REEL
            {
             before(grammarAccess.getMODALITEAccess().getValuesREELTerminalRuleCall_2_1_0()); 
            match(input,RULE_REEL,FOLLOW_2); 
             after(grammarAccess.getMODALITEAccess().getValuesREELTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__MODALITE__ValuesAssignment_2_1"


    // $ANTLR start "rule__EFFECTIF__ValuesAssignment_1"
    // InternalCalcul.g:1016:1: rule__EFFECTIF__ValuesAssignment_1 : ( RULE_REEL ) ;
    public final void rule__EFFECTIF__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:1020:1: ( ( RULE_REEL ) )
            // InternalCalcul.g:1021:2: ( RULE_REEL )
            {
            // InternalCalcul.g:1021:2: ( RULE_REEL )
            // InternalCalcul.g:1022:3: RULE_REEL
            {
             before(grammarAccess.getEFFECTIFAccess().getValuesREELTerminalRuleCall_1_0()); 
            match(input,RULE_REEL,FOLLOW_2); 
             after(grammarAccess.getEFFECTIFAccess().getValuesREELTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EFFECTIF__ValuesAssignment_1"


    // $ANTLR start "rule__EFFECTIF__ValuesAssignment_2_1"
    // InternalCalcul.g:1031:1: rule__EFFECTIF__ValuesAssignment_2_1 : ( RULE_REEL ) ;
    public final void rule__EFFECTIF__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalcul.g:1035:1: ( ( RULE_REEL ) )
            // InternalCalcul.g:1036:2: ( RULE_REEL )
            {
            // InternalCalcul.g:1036:2: ( RULE_REEL )
            // InternalCalcul.g:1037:3: RULE_REEL
            {
             before(grammarAccess.getEFFECTIFAccess().getValuesREELTerminalRuleCall_2_1_0()); 
            match(input,RULE_REEL,FOLLOW_2); 
             after(grammarAccess.getEFFECTIFAccess().getValuesREELTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__EFFECTIF__ValuesAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});

}