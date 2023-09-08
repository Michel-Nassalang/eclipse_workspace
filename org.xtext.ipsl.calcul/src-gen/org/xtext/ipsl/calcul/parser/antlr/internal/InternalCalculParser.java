package org.xtext.ipsl.calcul.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ipsl.calcul.services.CalculGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalculParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REEL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'mod:'", "'eff:'", "'return'", "';'", "'begin'", "','", "'moyenne'", "'mode'", "'variance'", "'ecart-type'", "'end'"
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

        public InternalCalculParser(TokenStream input, CalculGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CALCUL";
       	}

       	@Override
       	protected CalculGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCALCUL"
    // InternalCalcul.g:64:1: entryRuleCALCUL returns [EObject current=null] : iv_ruleCALCUL= ruleCALCUL EOF ;
    public final EObject entryRuleCALCUL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCALCUL = null;


        try {
            // InternalCalcul.g:64:47: (iv_ruleCALCUL= ruleCALCUL EOF )
            // InternalCalcul.g:65:2: iv_ruleCALCUL= ruleCALCUL EOF
            {
             newCompositeNode(grammarAccess.getCALCULRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCALCUL=ruleCALCUL();

            state._fsp--;

             current =iv_ruleCALCUL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCALCUL"


    // $ANTLR start "ruleCALCUL"
    // InternalCalcul.g:71:1: ruleCALCUL returns [EObject current=null] : ( (lv_operation_0_0= ruleSTATISTIQUE ) )? ;
    public final EObject ruleCALCUL() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;



        	enterRule();

        try {
            // InternalCalcul.g:77:2: ( ( (lv_operation_0_0= ruleSTATISTIQUE ) )? )
            // InternalCalcul.g:78:2: ( (lv_operation_0_0= ruleSTATISTIQUE ) )?
            {
            // InternalCalcul.g:78:2: ( (lv_operation_0_0= ruleSTATISTIQUE ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCalcul.g:79:3: (lv_operation_0_0= ruleSTATISTIQUE )
                    {
                    // InternalCalcul.g:79:3: (lv_operation_0_0= ruleSTATISTIQUE )
                    // InternalCalcul.g:80:4: lv_operation_0_0= ruleSTATISTIQUE
                    {

                    				newCompositeNode(grammarAccess.getCALCULAccess().getOperationSTATISTIQUEParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_2);
                    lv_operation_0_0=ruleSTATISTIQUE();

                    state._fsp--;


                    				if (current==null) {
                    					current = createModelElementForParent(grammarAccess.getCALCULRule());
                    				}
                    				set(
                    					current,
                    					"operation",
                    					lv_operation_0_0,
                    					"org.xtext.ipsl.calcul.Calcul.STATISTIQUE");
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCALCUL"


    // $ANTLR start "entryRuleSTATISTIQUE"
    // InternalCalcul.g:100:1: entryRuleSTATISTIQUE returns [EObject current=null] : iv_ruleSTATISTIQUE= ruleSTATISTIQUE EOF ;
    public final EObject entryRuleSTATISTIQUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTATISTIQUE = null;


        try {
            // InternalCalcul.g:100:52: (iv_ruleSTATISTIQUE= ruleSTATISTIQUE EOF )
            // InternalCalcul.g:101:2: iv_ruleSTATISTIQUE= ruleSTATISTIQUE EOF
            {
             newCompositeNode(grammarAccess.getSTATISTIQUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTATISTIQUE=ruleSTATISTIQUE();

            state._fsp--;

             current =iv_ruleSTATISTIQUE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTATISTIQUE"


    // $ANTLR start "ruleSTATISTIQUE"
    // InternalCalcul.g:107:1: ruleSTATISTIQUE returns [EObject current=null] : (otherlv_0= 'program' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_debut_2_0= ruleDEBUT ) ) otherlv_3= 'mod:' ( (lv_modalite_4_0= ruleMODALITE ) ) otherlv_5= 'eff:' ( (lv_effectif_6_0= ruleEFFECTIF ) ) otherlv_7= 'return' ( (lv_resultat_8_0= ruleRETOUR ) ) otherlv_9= ';' ( (lv_end_10_0= ruleEND ) ) ) ;
    public final EObject ruleSTATISTIQUE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_debut_2_0 = null;

        EObject lv_modalite_4_0 = null;

        EObject lv_effectif_6_0 = null;

        AntlrDatatypeRuleToken lv_resultat_8_0 = null;

        AntlrDatatypeRuleToken lv_end_10_0 = null;



        	enterRule();

        try {
            // InternalCalcul.g:113:2: ( (otherlv_0= 'program' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_debut_2_0= ruleDEBUT ) ) otherlv_3= 'mod:' ( (lv_modalite_4_0= ruleMODALITE ) ) otherlv_5= 'eff:' ( (lv_effectif_6_0= ruleEFFECTIF ) ) otherlv_7= 'return' ( (lv_resultat_8_0= ruleRETOUR ) ) otherlv_9= ';' ( (lv_end_10_0= ruleEND ) ) ) )
            // InternalCalcul.g:114:2: (otherlv_0= 'program' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_debut_2_0= ruleDEBUT ) ) otherlv_3= 'mod:' ( (lv_modalite_4_0= ruleMODALITE ) ) otherlv_5= 'eff:' ( (lv_effectif_6_0= ruleEFFECTIF ) ) otherlv_7= 'return' ( (lv_resultat_8_0= ruleRETOUR ) ) otherlv_9= ';' ( (lv_end_10_0= ruleEND ) ) )
            {
            // InternalCalcul.g:114:2: (otherlv_0= 'program' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_debut_2_0= ruleDEBUT ) ) otherlv_3= 'mod:' ( (lv_modalite_4_0= ruleMODALITE ) ) otherlv_5= 'eff:' ( (lv_effectif_6_0= ruleEFFECTIF ) ) otherlv_7= 'return' ( (lv_resultat_8_0= ruleRETOUR ) ) otherlv_9= ';' ( (lv_end_10_0= ruleEND ) ) )
            // InternalCalcul.g:115:3: otherlv_0= 'program' ( (lv_nom_1_0= RULE_ID ) ) ( (lv_debut_2_0= ruleDEBUT ) ) otherlv_3= 'mod:' ( (lv_modalite_4_0= ruleMODALITE ) ) otherlv_5= 'eff:' ( (lv_effectif_6_0= ruleEFFECTIF ) ) otherlv_7= 'return' ( (lv_resultat_8_0= ruleRETOUR ) ) otherlv_9= ';' ( (lv_end_10_0= ruleEND ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSTATISTIQUEAccess().getProgramKeyword_0());
            		
            // InternalCalcul.g:119:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalCalcul.g:120:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalCalcul.g:120:4: (lv_nom_1_0= RULE_ID )
            // InternalCalcul.g:121:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getSTATISTIQUEAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSTATISTIQUERule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCalcul.g:137:3: ( (lv_debut_2_0= ruleDEBUT ) )
            // InternalCalcul.g:138:4: (lv_debut_2_0= ruleDEBUT )
            {
            // InternalCalcul.g:138:4: (lv_debut_2_0= ruleDEBUT )
            // InternalCalcul.g:139:5: lv_debut_2_0= ruleDEBUT
            {

            					newCompositeNode(grammarAccess.getSTATISTIQUEAccess().getDebutDEBUTParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_debut_2_0=ruleDEBUT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSTATISTIQUERule());
            					}
            					set(
            						current,
            						"debut",
            						lv_debut_2_0,
            						"org.xtext.ipsl.calcul.Calcul.DEBUT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSTATISTIQUEAccess().getModKeyword_3());
            		
            // InternalCalcul.g:160:3: ( (lv_modalite_4_0= ruleMODALITE ) )
            // InternalCalcul.g:161:4: (lv_modalite_4_0= ruleMODALITE )
            {
            // InternalCalcul.g:161:4: (lv_modalite_4_0= ruleMODALITE )
            // InternalCalcul.g:162:5: lv_modalite_4_0= ruleMODALITE
            {

            					newCompositeNode(grammarAccess.getSTATISTIQUEAccess().getModaliteMODALITEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_modalite_4_0=ruleMODALITE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSTATISTIQUERule());
            					}
            					set(
            						current,
            						"modalite",
            						lv_modalite_4_0,
            						"org.xtext.ipsl.calcul.Calcul.MODALITE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSTATISTIQUEAccess().getEffKeyword_5());
            		
            // InternalCalcul.g:183:3: ( (lv_effectif_6_0= ruleEFFECTIF ) )
            // InternalCalcul.g:184:4: (lv_effectif_6_0= ruleEFFECTIF )
            {
            // InternalCalcul.g:184:4: (lv_effectif_6_0= ruleEFFECTIF )
            // InternalCalcul.g:185:5: lv_effectif_6_0= ruleEFFECTIF
            {

            					newCompositeNode(grammarAccess.getSTATISTIQUEAccess().getEffectifEFFECTIFParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_effectif_6_0=ruleEFFECTIF();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSTATISTIQUERule());
            					}
            					set(
            						current,
            						"effectif",
            						lv_effectif_6_0,
            						"org.xtext.ipsl.calcul.Calcul.EFFECTIF");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getSTATISTIQUEAccess().getReturnKeyword_7());
            		
            // InternalCalcul.g:206:3: ( (lv_resultat_8_0= ruleRETOUR ) )
            // InternalCalcul.g:207:4: (lv_resultat_8_0= ruleRETOUR )
            {
            // InternalCalcul.g:207:4: (lv_resultat_8_0= ruleRETOUR )
            // InternalCalcul.g:208:5: lv_resultat_8_0= ruleRETOUR
            {

            					newCompositeNode(grammarAccess.getSTATISTIQUEAccess().getResultatRETOURParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_resultat_8_0=ruleRETOUR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSTATISTIQUERule());
            					}
            					set(
            						current,
            						"resultat",
            						lv_resultat_8_0,
            						"org.xtext.ipsl.calcul.Calcul.RETOUR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getSTATISTIQUEAccess().getSemicolonKeyword_9());
            		
            // InternalCalcul.g:229:3: ( (lv_end_10_0= ruleEND ) )
            // InternalCalcul.g:230:4: (lv_end_10_0= ruleEND )
            {
            // InternalCalcul.g:230:4: (lv_end_10_0= ruleEND )
            // InternalCalcul.g:231:5: lv_end_10_0= ruleEND
            {

            					newCompositeNode(grammarAccess.getSTATISTIQUEAccess().getEndENDParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_10_0=ruleEND();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSTATISTIQUERule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_10_0,
            						"org.xtext.ipsl.calcul.Calcul.END");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTATISTIQUE"


    // $ANTLR start "entryRuleDEBUT"
    // InternalCalcul.g:252:1: entryRuleDEBUT returns [String current=null] : iv_ruleDEBUT= ruleDEBUT EOF ;
    public final String entryRuleDEBUT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEBUT = null;


        try {
            // InternalCalcul.g:252:45: (iv_ruleDEBUT= ruleDEBUT EOF )
            // InternalCalcul.g:253:2: iv_ruleDEBUT= ruleDEBUT EOF
            {
             newCompositeNode(grammarAccess.getDEBUTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDEBUT=ruleDEBUT();

            state._fsp--;

             current =iv_ruleDEBUT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDEBUT"


    // $ANTLR start "ruleDEBUT"
    // InternalCalcul.g:259:1: ruleDEBUT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'begin' ;
    public final AntlrDatatypeRuleToken ruleDEBUT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCalcul.g:265:2: (kw= 'begin' )
            // InternalCalcul.g:266:2: kw= 'begin'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDEBUTAccess().getBeginKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDEBUT"


    // $ANTLR start "entryRuleMODALITE"
    // InternalCalcul.g:274:1: entryRuleMODALITE returns [EObject current=null] : iv_ruleMODALITE= ruleMODALITE EOF ;
    public final EObject entryRuleMODALITE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODALITE = null;


        try {
            // InternalCalcul.g:274:49: (iv_ruleMODALITE= ruleMODALITE EOF )
            // InternalCalcul.g:275:2: iv_ruleMODALITE= ruleMODALITE EOF
            {
             newCompositeNode(grammarAccess.getMODALITERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMODALITE=ruleMODALITE();

            state._fsp--;

             current =iv_ruleMODALITE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMODALITE"


    // $ANTLR start "ruleMODALITE"
    // InternalCalcul.g:281:1: ruleMODALITE returns [EObject current=null] : (otherlv_0= 'mod:' ( (lv_values_1_0= RULE_REEL ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleMODALITE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCalcul.g:287:2: ( (otherlv_0= 'mod:' ( (lv_values_1_0= RULE_REEL ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )* otherlv_4= ';' ) )
            // InternalCalcul.g:288:2: (otherlv_0= 'mod:' ( (lv_values_1_0= RULE_REEL ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )* otherlv_4= ';' )
            {
            // InternalCalcul.g:288:2: (otherlv_0= 'mod:' ( (lv_values_1_0= RULE_REEL ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )* otherlv_4= ';' )
            // InternalCalcul.g:289:3: otherlv_0= 'mod:' ( (lv_values_1_0= RULE_REEL ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMODALITEAccess().getModKeyword_0());
            		
            // InternalCalcul.g:293:3: ( (lv_values_1_0= RULE_REEL ) )
            // InternalCalcul.g:294:4: (lv_values_1_0= RULE_REEL )
            {
            // InternalCalcul.g:294:4: (lv_values_1_0= RULE_REEL )
            // InternalCalcul.g:295:5: lv_values_1_0= RULE_REEL
            {
            lv_values_1_0=(Token)match(input,RULE_REEL,FOLLOW_12); 

            					newLeafNode(lv_values_1_0, grammarAccess.getMODALITEAccess().getValuesREELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMODALITERule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.xtext.ipsl.calcul.Calcul.REEL");
            				

            }


            }

            // InternalCalcul.g:311:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCalcul.g:312:4: otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMODALITEAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalCalcul.g:316:4: ( (lv_values_3_0= RULE_REEL ) )
            	    // InternalCalcul.g:317:5: (lv_values_3_0= RULE_REEL )
            	    {
            	    // InternalCalcul.g:317:5: (lv_values_3_0= RULE_REEL )
            	    // InternalCalcul.g:318:6: lv_values_3_0= RULE_REEL
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_REEL,FOLLOW_12); 

            	    						newLeafNode(lv_values_3_0, grammarAccess.getMODALITEAccess().getValuesREELTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMODALITERule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.xtext.ipsl.calcul.Calcul.REEL");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMODALITEAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMODALITE"


    // $ANTLR start "entryRuleEFFECTIF"
    // InternalCalcul.g:343:1: entryRuleEFFECTIF returns [EObject current=null] : iv_ruleEFFECTIF= ruleEFFECTIF EOF ;
    public final EObject entryRuleEFFECTIF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFFECTIF = null;


        try {
            // InternalCalcul.g:343:49: (iv_ruleEFFECTIF= ruleEFFECTIF EOF )
            // InternalCalcul.g:344:2: iv_ruleEFFECTIF= ruleEFFECTIF EOF
            {
             newCompositeNode(grammarAccess.getEFFECTIFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFFECTIF=ruleEFFECTIF();

            state._fsp--;

             current =iv_ruleEFFECTIF; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFFECTIF"


    // $ANTLR start "ruleEFFECTIF"
    // InternalCalcul.g:350:1: ruleEFFECTIF returns [EObject current=null] : (otherlv_0= 'eff:' ( (lv_values_1_0= RULE_REEL ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleEFFECTIF() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCalcul.g:356:2: ( (otherlv_0= 'eff:' ( (lv_values_1_0= RULE_REEL ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )* otherlv_4= ';' ) )
            // InternalCalcul.g:357:2: (otherlv_0= 'eff:' ( (lv_values_1_0= RULE_REEL ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )* otherlv_4= ';' )
            {
            // InternalCalcul.g:357:2: (otherlv_0= 'eff:' ( (lv_values_1_0= RULE_REEL ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )* otherlv_4= ';' )
            // InternalCalcul.g:358:3: otherlv_0= 'eff:' ( (lv_values_1_0= RULE_REEL ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEFFECTIFAccess().getEffKeyword_0());
            		
            // InternalCalcul.g:362:3: ( (lv_values_1_0= RULE_REEL ) )
            // InternalCalcul.g:363:4: (lv_values_1_0= RULE_REEL )
            {
            // InternalCalcul.g:363:4: (lv_values_1_0= RULE_REEL )
            // InternalCalcul.g:364:5: lv_values_1_0= RULE_REEL
            {
            lv_values_1_0=(Token)match(input,RULE_REEL,FOLLOW_12); 

            					newLeafNode(lv_values_1_0, grammarAccess.getEFFECTIFAccess().getValuesREELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEFFECTIFRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.xtext.ipsl.calcul.Calcul.REEL");
            				

            }


            }

            // InternalCalcul.g:380:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCalcul.g:381:4: otherlv_2= ',' ( (lv_values_3_0= RULE_REEL ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEFFECTIFAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalCalcul.g:385:4: ( (lv_values_3_0= RULE_REEL ) )
            	    // InternalCalcul.g:386:5: (lv_values_3_0= RULE_REEL )
            	    {
            	    // InternalCalcul.g:386:5: (lv_values_3_0= RULE_REEL )
            	    // InternalCalcul.g:387:6: lv_values_3_0= RULE_REEL
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_REEL,FOLLOW_12); 

            	    						newLeafNode(lv_values_3_0, grammarAccess.getEFFECTIFAccess().getValuesREELTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEFFECTIFRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.xtext.ipsl.calcul.Calcul.REEL");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEFFECTIFAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFFECTIF"


    // $ANTLR start "entryRuleRETOUR"
    // InternalCalcul.g:412:1: entryRuleRETOUR returns [String current=null] : iv_ruleRETOUR= ruleRETOUR EOF ;
    public final String entryRuleRETOUR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETOUR = null;


        try {
            // InternalCalcul.g:412:46: (iv_ruleRETOUR= ruleRETOUR EOF )
            // InternalCalcul.g:413:2: iv_ruleRETOUR= ruleRETOUR EOF
            {
             newCompositeNode(grammarAccess.getRETOURRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRETOUR=ruleRETOUR();

            state._fsp--;

             current =iv_ruleRETOUR.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRETOUR"


    // $ANTLR start "ruleRETOUR"
    // InternalCalcul.g:419:1: ruleRETOUR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'moyenne' | kw= 'mode' | kw= 'variance' | kw= 'ecart-type' ) ;
    public final AntlrDatatypeRuleToken ruleRETOUR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCalcul.g:425:2: ( (kw= 'moyenne' | kw= 'mode' | kw= 'variance' | kw= 'ecart-type' ) )
            // InternalCalcul.g:426:2: (kw= 'moyenne' | kw= 'mode' | kw= 'variance' | kw= 'ecart-type' )
            {
            // InternalCalcul.g:426:2: (kw= 'moyenne' | kw= 'mode' | kw= 'variance' | kw= 'ecart-type' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCalcul.g:427:3: kw= 'moyenne'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRETOURAccess().getMoyenneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCalcul.g:433:3: kw= 'mode'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRETOURAccess().getModeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCalcul.g:439:3: kw= 'variance'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRETOURAccess().getVarianceKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCalcul.g:445:3: kw= 'ecart-type'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRETOURAccess().getEcartTypeKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRETOUR"


    // $ANTLR start "entryRuleEND"
    // InternalCalcul.g:454:1: entryRuleEND returns [String current=null] : iv_ruleEND= ruleEND EOF ;
    public final String entryRuleEND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEND = null;


        try {
            // InternalCalcul.g:454:43: (iv_ruleEND= ruleEND EOF )
            // InternalCalcul.g:455:2: iv_ruleEND= ruleEND EOF
            {
             newCompositeNode(grammarAccess.getENDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEND=ruleEND();

            state._fsp--;

             current =iv_ruleEND.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEND"


    // $ANTLR start "ruleEND"
    // InternalCalcul.g:461:1: ruleEND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'end' ;
    public final AntlrDatatypeRuleToken ruleEND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCalcul.g:467:2: (kw= 'end' )
            // InternalCalcul.g:468:2: kw= 'end'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getENDAccess().getEndKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEND"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000050000L});

}