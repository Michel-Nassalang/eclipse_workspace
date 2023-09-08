package org.xtext.ipsl.figure.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ipsl.figure.services.FigureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFigureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Figure'", "'BEGIN'", "'Carre'", "'cote'", "':'", "';'", "'Rectangle'", "'longueur'", "'largeur'", "'Cercle'", "'rayon'", "'return'", "'surface'", "'perimetre'", "'END'"
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

        public InternalFigureParser(TokenStream input, FigureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PROGRAMME";
       	}

       	@Override
       	protected FigureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePROGRAMME"
    // InternalFigure.g:64:1: entryRulePROGRAMME returns [EObject current=null] : iv_rulePROGRAMME= rulePROGRAMME EOF ;
    public final EObject entryRulePROGRAMME() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePROGRAMME = null;


        try {
            // InternalFigure.g:64:50: (iv_rulePROGRAMME= rulePROGRAMME EOF )
            // InternalFigure.g:65:2: iv_rulePROGRAMME= rulePROGRAMME EOF
            {
             newCompositeNode(grammarAccess.getPROGRAMMERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePROGRAMME=rulePROGRAMME();

            state._fsp--;

             current =iv_rulePROGRAMME; 
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
    // $ANTLR end "entryRulePROGRAMME"


    // $ANTLR start "rulePROGRAMME"
    // InternalFigure.g:71:1: rulePROGRAMME returns [EObject current=null] : ( (lv_fig_0_0= ruleFIGURE ) )? ;
    public final EObject rulePROGRAMME() throws RecognitionException {
        EObject current = null;

        EObject lv_fig_0_0 = null;



        	enterRule();

        try {
            // InternalFigure.g:77:2: ( ( (lv_fig_0_0= ruleFIGURE ) )? )
            // InternalFigure.g:78:2: ( (lv_fig_0_0= ruleFIGURE ) )?
            {
            // InternalFigure.g:78:2: ( (lv_fig_0_0= ruleFIGURE ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalFigure.g:79:3: (lv_fig_0_0= ruleFIGURE )
                    {
                    // InternalFigure.g:79:3: (lv_fig_0_0= ruleFIGURE )
                    // InternalFigure.g:80:4: lv_fig_0_0= ruleFIGURE
                    {

                    				newCompositeNode(grammarAccess.getPROGRAMMEAccess().getFigFIGUREParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_2);
                    lv_fig_0_0=ruleFIGURE();

                    state._fsp--;


                    				if (current==null) {
                    					current = createModelElementForParent(grammarAccess.getPROGRAMMERule());
                    				}
                    				set(
                    					current,
                    					"fig",
                    					lv_fig_0_0,
                    					"org.xtext.ipsl.figure.Figure.FIGURE");
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
    // $ANTLR end "rulePROGRAMME"


    // $ANTLR start "entryRuleFIGURE"
    // InternalFigure.g:100:1: entryRuleFIGURE returns [EObject current=null] : iv_ruleFIGURE= ruleFIGURE EOF ;
    public final EObject entryRuleFIGURE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFIGURE = null;


        try {
            // InternalFigure.g:100:47: (iv_ruleFIGURE= ruleFIGURE EOF )
            // InternalFigure.g:101:2: iv_ruleFIGURE= ruleFIGURE EOF
            {
             newCompositeNode(grammarAccess.getFIGURERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFIGURE=ruleFIGURE();

            state._fsp--;

             current =iv_ruleFIGURE; 
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
    // $ANTLR end "entryRuleFIGURE"


    // $ANTLR start "ruleFIGURE"
    // InternalFigure.g:107:1: ruleFIGURE returns [EObject current=null] : (otherlv_0= 'Figure' ( ( (lv_nom_1_1= ruleCERCLE | lv_nom_1_2= ruleRECTANGLE | lv_nom_1_3= ruleCARRE ) ) ) ) ;
    public final EObject ruleFIGURE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_nom_1_1 = null;

        EObject lv_nom_1_2 = null;

        EObject lv_nom_1_3 = null;



        	enterRule();

        try {
            // InternalFigure.g:113:2: ( (otherlv_0= 'Figure' ( ( (lv_nom_1_1= ruleCERCLE | lv_nom_1_2= ruleRECTANGLE | lv_nom_1_3= ruleCARRE ) ) ) ) )
            // InternalFigure.g:114:2: (otherlv_0= 'Figure' ( ( (lv_nom_1_1= ruleCERCLE | lv_nom_1_2= ruleRECTANGLE | lv_nom_1_3= ruleCARRE ) ) ) )
            {
            // InternalFigure.g:114:2: (otherlv_0= 'Figure' ( ( (lv_nom_1_1= ruleCERCLE | lv_nom_1_2= ruleRECTANGLE | lv_nom_1_3= ruleCARRE ) ) ) )
            // InternalFigure.g:115:3: otherlv_0= 'Figure' ( ( (lv_nom_1_1= ruleCERCLE | lv_nom_1_2= ruleRECTANGLE | lv_nom_1_3= ruleCARRE ) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFIGUREAccess().getFigureKeyword_0());
            		
            // InternalFigure.g:119:3: ( ( (lv_nom_1_1= ruleCERCLE | lv_nom_1_2= ruleRECTANGLE | lv_nom_1_3= ruleCARRE ) ) )
            // InternalFigure.g:120:4: ( (lv_nom_1_1= ruleCERCLE | lv_nom_1_2= ruleRECTANGLE | lv_nom_1_3= ruleCARRE ) )
            {
            // InternalFigure.g:120:4: ( (lv_nom_1_1= ruleCERCLE | lv_nom_1_2= ruleRECTANGLE | lv_nom_1_3= ruleCARRE ) )
            // InternalFigure.g:121:5: (lv_nom_1_1= ruleCERCLE | lv_nom_1_2= ruleRECTANGLE | lv_nom_1_3= ruleCARRE )
            {
            // InternalFigure.g:121:5: (lv_nom_1_1= ruleCERCLE | lv_nom_1_2= ruleRECTANGLE | lv_nom_1_3= ruleCARRE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 14:
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
                    // InternalFigure.g:122:6: lv_nom_1_1= ruleCERCLE
                    {

                    						newCompositeNode(grammarAccess.getFIGUREAccess().getNomCERCLEParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_nom_1_1=ruleCERCLE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFIGURERule());
                    						}
                    						set(
                    							current,
                    							"nom",
                    							lv_nom_1_1,
                    							"org.xtext.ipsl.figure.Figure.CERCLE");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalFigure.g:138:6: lv_nom_1_2= ruleRECTANGLE
                    {

                    						newCompositeNode(grammarAccess.getFIGUREAccess().getNomRECTANGLEParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_nom_1_2=ruleRECTANGLE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFIGURERule());
                    						}
                    						set(
                    							current,
                    							"nom",
                    							lv_nom_1_2,
                    							"org.xtext.ipsl.figure.Figure.RECTANGLE");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalFigure.g:154:6: lv_nom_1_3= ruleCARRE
                    {

                    						newCompositeNode(grammarAccess.getFIGUREAccess().getNomCARREParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_nom_1_3=ruleCARRE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFIGURERule());
                    						}
                    						set(
                    							current,
                    							"nom",
                    							lv_nom_1_3,
                    							"org.xtext.ipsl.figure.Figure.CARRE");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleFIGURE"


    // $ANTLR start "entryRuleDEBUT"
    // InternalFigure.g:176:1: entryRuleDEBUT returns [String current=null] : iv_ruleDEBUT= ruleDEBUT EOF ;
    public final String entryRuleDEBUT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEBUT = null;


        try {
            // InternalFigure.g:176:45: (iv_ruleDEBUT= ruleDEBUT EOF )
            // InternalFigure.g:177:2: iv_ruleDEBUT= ruleDEBUT EOF
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
    // InternalFigure.g:183:1: ruleDEBUT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'BEGIN' ;
    public final AntlrDatatypeRuleToken ruleDEBUT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFigure.g:189:2: (kw= 'BEGIN' )
            // InternalFigure.g:190:2: kw= 'BEGIN'
            {
            kw=(Token)match(input,13,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDEBUTAccess().getBEGINKeyword());
            	

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


    // $ANTLR start "entryRuleCARRE"
    // InternalFigure.g:198:1: entryRuleCARRE returns [EObject current=null] : iv_ruleCARRE= ruleCARRE EOF ;
    public final EObject entryRuleCARRE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCARRE = null;


        try {
            // InternalFigure.g:198:46: (iv_ruleCARRE= ruleCARRE EOF )
            // InternalFigure.g:199:2: iv_ruleCARRE= ruleCARRE EOF
            {
             newCompositeNode(grammarAccess.getCARRERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCARRE=ruleCARRE();

            state._fsp--;

             current =iv_ruleCARRE; 
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
    // $ANTLR end "entryRuleCARRE"


    // $ANTLR start "ruleCARRE"
    // InternalFigure.g:205:1: ruleCARRE returns [EObject current=null] : ( ( (lv_nom_0_0= 'Carre' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) (otherlv_2= 'cote' otherlv_3= ':' ( (lv_cote_4_0= ruleREEL ) ) otherlv_5= ';' ) ( (lv_retour_6_0= ruleRETURN ) ) ( (lv_end_7_0= ruleEND ) ) ) ;
    public final EObject ruleCARRE() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_debut_1_0 = null;

        EObject lv_cote_4_0 = null;

        EObject lv_retour_6_0 = null;

        AntlrDatatypeRuleToken lv_end_7_0 = null;



        	enterRule();

        try {
            // InternalFigure.g:211:2: ( ( ( (lv_nom_0_0= 'Carre' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) (otherlv_2= 'cote' otherlv_3= ':' ( (lv_cote_4_0= ruleREEL ) ) otherlv_5= ';' ) ( (lv_retour_6_0= ruleRETURN ) ) ( (lv_end_7_0= ruleEND ) ) ) )
            // InternalFigure.g:212:2: ( ( (lv_nom_0_0= 'Carre' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) (otherlv_2= 'cote' otherlv_3= ':' ( (lv_cote_4_0= ruleREEL ) ) otherlv_5= ';' ) ( (lv_retour_6_0= ruleRETURN ) ) ( (lv_end_7_0= ruleEND ) ) )
            {
            // InternalFigure.g:212:2: ( ( (lv_nom_0_0= 'Carre' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) (otherlv_2= 'cote' otherlv_3= ':' ( (lv_cote_4_0= ruleREEL ) ) otherlv_5= ';' ) ( (lv_retour_6_0= ruleRETURN ) ) ( (lv_end_7_0= ruleEND ) ) )
            // InternalFigure.g:213:3: ( (lv_nom_0_0= 'Carre' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) (otherlv_2= 'cote' otherlv_3= ':' ( (lv_cote_4_0= ruleREEL ) ) otherlv_5= ';' ) ( (lv_retour_6_0= ruleRETURN ) ) ( (lv_end_7_0= ruleEND ) )
            {
            // InternalFigure.g:213:3: ( (lv_nom_0_0= 'Carre' ) )
            // InternalFigure.g:214:4: (lv_nom_0_0= 'Carre' )
            {
            // InternalFigure.g:214:4: (lv_nom_0_0= 'Carre' )
            // InternalFigure.g:215:5: lv_nom_0_0= 'Carre'
            {
            lv_nom_0_0=(Token)match(input,14,FOLLOW_4); 

            					newLeafNode(lv_nom_0_0, grammarAccess.getCARREAccess().getNomCarreKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARRERule());
            					}
            					setWithLastConsumed(current, "nom", lv_nom_0_0, "Carre");
            				

            }


            }

            // InternalFigure.g:227:3: ( (lv_debut_1_0= ruleDEBUT ) )
            // InternalFigure.g:228:4: (lv_debut_1_0= ruleDEBUT )
            {
            // InternalFigure.g:228:4: (lv_debut_1_0= ruleDEBUT )
            // InternalFigure.g:229:5: lv_debut_1_0= ruleDEBUT
            {

            					newCompositeNode(grammarAccess.getCARREAccess().getDebutDEBUTParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_debut_1_0=ruleDEBUT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCARRERule());
            					}
            					set(
            						current,
            						"debut",
            						lv_debut_1_0,
            						"org.xtext.ipsl.figure.Figure.DEBUT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFigure.g:246:3: (otherlv_2= 'cote' otherlv_3= ':' ( (lv_cote_4_0= ruleREEL ) ) otherlv_5= ';' )
            // InternalFigure.g:247:4: otherlv_2= 'cote' otherlv_3= ':' ( (lv_cote_4_0= ruleREEL ) ) otherlv_5= ';'
            {
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getCARREAccess().getCoteKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            				newLeafNode(otherlv_3, grammarAccess.getCARREAccess().getColonKeyword_2_1());
            			
            // InternalFigure.g:255:4: ( (lv_cote_4_0= ruleREEL ) )
            // InternalFigure.g:256:5: (lv_cote_4_0= ruleREEL )
            {
            // InternalFigure.g:256:5: (lv_cote_4_0= ruleREEL )
            // InternalFigure.g:257:6: lv_cote_4_0= ruleREEL
            {

            						newCompositeNode(grammarAccess.getCARREAccess().getCoteREELParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_cote_4_0=ruleREEL();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCARRERule());
            						}
            						set(
            							current,
            							"cote",
            							lv_cote_4_0,
            							"org.xtext.ipsl.figure.Figure.REEL");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_9); 

            				newLeafNode(otherlv_5, grammarAccess.getCARREAccess().getSemicolonKeyword_2_3());
            			

            }

            // InternalFigure.g:279:3: ( (lv_retour_6_0= ruleRETURN ) )
            // InternalFigure.g:280:4: (lv_retour_6_0= ruleRETURN )
            {
            // InternalFigure.g:280:4: (lv_retour_6_0= ruleRETURN )
            // InternalFigure.g:281:5: lv_retour_6_0= ruleRETURN
            {

            					newCompositeNode(grammarAccess.getCARREAccess().getRetourRETURNParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_retour_6_0=ruleRETURN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCARRERule());
            					}
            					set(
            						current,
            						"retour",
            						lv_retour_6_0,
            						"org.xtext.ipsl.figure.Figure.RETURN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFigure.g:298:3: ( (lv_end_7_0= ruleEND ) )
            // InternalFigure.g:299:4: (lv_end_7_0= ruleEND )
            {
            // InternalFigure.g:299:4: (lv_end_7_0= ruleEND )
            // InternalFigure.g:300:5: lv_end_7_0= ruleEND
            {

            					newCompositeNode(grammarAccess.getCARREAccess().getEndENDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_7_0=ruleEND();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCARRERule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_7_0,
            						"org.xtext.ipsl.figure.Figure.END");
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
    // $ANTLR end "ruleCARRE"


    // $ANTLR start "entryRuleRECTANGLE"
    // InternalFigure.g:321:1: entryRuleRECTANGLE returns [EObject current=null] : iv_ruleRECTANGLE= ruleRECTANGLE EOF ;
    public final EObject entryRuleRECTANGLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRECTANGLE = null;


        try {
            // InternalFigure.g:321:50: (iv_ruleRECTANGLE= ruleRECTANGLE EOF )
            // InternalFigure.g:322:2: iv_ruleRECTANGLE= ruleRECTANGLE EOF
            {
             newCompositeNode(grammarAccess.getRECTANGLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRECTANGLE=ruleRECTANGLE();

            state._fsp--;

             current =iv_ruleRECTANGLE; 
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
    // $ANTLR end "entryRuleRECTANGLE"


    // $ANTLR start "ruleRECTANGLE"
    // InternalFigure.g:328:1: ruleRECTANGLE returns [EObject current=null] : ( ( (lv_nom_0_0= 'Rectangle' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_retour_11_0= ruleRETURN ) ) ( (lv_end_12_0= ruleEND ) ) ) ;
    public final EObject ruleRECTANGLE() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_debut_1_0 = null;

        EObject lv_longueur_5_0 = null;

        EObject lv_largeur_9_0 = null;

        EObject lv_retour_11_0 = null;

        AntlrDatatypeRuleToken lv_end_12_0 = null;



        	enterRule();

        try {
            // InternalFigure.g:334:2: ( ( ( (lv_nom_0_0= 'Rectangle' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_retour_11_0= ruleRETURN ) ) ( (lv_end_12_0= ruleEND ) ) ) )
            // InternalFigure.g:335:2: ( ( (lv_nom_0_0= 'Rectangle' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_retour_11_0= ruleRETURN ) ) ( (lv_end_12_0= ruleEND ) ) )
            {
            // InternalFigure.g:335:2: ( ( (lv_nom_0_0= 'Rectangle' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_retour_11_0= ruleRETURN ) ) ( (lv_end_12_0= ruleEND ) ) )
            // InternalFigure.g:336:3: ( (lv_nom_0_0= 'Rectangle' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_retour_11_0= ruleRETURN ) ) ( (lv_end_12_0= ruleEND ) )
            {
            // InternalFigure.g:336:3: ( (lv_nom_0_0= 'Rectangle' ) )
            // InternalFigure.g:337:4: (lv_nom_0_0= 'Rectangle' )
            {
            // InternalFigure.g:337:4: (lv_nom_0_0= 'Rectangle' )
            // InternalFigure.g:338:5: lv_nom_0_0= 'Rectangle'
            {
            lv_nom_0_0=(Token)match(input,18,FOLLOW_4); 

            					newLeafNode(lv_nom_0_0, grammarAccess.getRECTANGLEAccess().getNomRectangleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRECTANGLERule());
            					}
            					setWithLastConsumed(current, "nom", lv_nom_0_0, "Rectangle");
            				

            }


            }

            // InternalFigure.g:350:3: ( (lv_debut_1_0= ruleDEBUT ) )
            // InternalFigure.g:351:4: (lv_debut_1_0= ruleDEBUT )
            {
            // InternalFigure.g:351:4: (lv_debut_1_0= ruleDEBUT )
            // InternalFigure.g:352:5: lv_debut_1_0= ruleDEBUT
            {

            					newCompositeNode(grammarAccess.getRECTANGLEAccess().getDebutDEBUTParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_debut_1_0=ruleDEBUT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRECTANGLERule());
            					}
            					set(
            						current,
            						"debut",
            						lv_debut_1_0,
            						"org.xtext.ipsl.figure.Figure.DEBUT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFigure.g:369:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) )
            // InternalFigure.g:370:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalFigure.g:370:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) )
            // InternalFigure.g:371:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2());
            				
            // InternalFigure.g:374:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?)
            // InternalFigure.g:375:6: ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+ {...}?
            {
            // InternalFigure.g:375:6: ( ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFigure.g:376:4: ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalFigure.g:376:4: ({...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) ) )
            	    // InternalFigure.g:377:5: {...}? => ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRECTANGLE", "getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalFigure.g:377:106: ( ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) ) )
            	    // InternalFigure.g:378:6: ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalFigure.g:381:9: ({...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' ) )
            	    // InternalFigure.g:381:10: {...}? => (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRECTANGLE", "true");
            	    }
            	    // InternalFigure.g:381:19: (otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';' )
            	    // InternalFigure.g:381:20: otherlv_3= 'longueur' otherlv_4= ':' ( (lv_longueur_5_0= ruleREEL ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_6); 

            	    									newLeafNode(otherlv_3, grammarAccess.getRECTANGLEAccess().getLongueurKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_7); 

            	    									newLeafNode(otherlv_4, grammarAccess.getRECTANGLEAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalFigure.g:389:9: ( (lv_longueur_5_0= ruleREEL ) )
            	    // InternalFigure.g:390:10: (lv_longueur_5_0= ruleREEL )
            	    {
            	    // InternalFigure.g:390:10: (lv_longueur_5_0= ruleREEL )
            	    // InternalFigure.g:391:11: lv_longueur_5_0= ruleREEL
            	    {

            	    											newCompositeNode(grammarAccess.getRECTANGLEAccess().getLongueurREELParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_8);
            	    lv_longueur_5_0=ruleREEL();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRECTANGLERule());
            	    											}
            	    											set(
            	    												current,
            	    												"longueur",
            	    												lv_longueur_5_0,
            	    												"org.xtext.ipsl.figure.Figure.REEL");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_6=(Token)match(input,17,FOLLOW_12); 

            	    									newLeafNode(otherlv_6, grammarAccess.getRECTANGLEAccess().getSemicolonKeyword_2_0_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFigure.g:418:4: ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalFigure.g:418:4: ({...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) ) )
            	    // InternalFigure.g:419:5: {...}? => ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRECTANGLE", "getUnorderedGroupHelper().canSelect(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalFigure.g:419:106: ( ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) ) )
            	    // InternalFigure.g:420:6: ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalFigure.g:423:9: ({...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' ) )
            	    // InternalFigure.g:423:10: {...}? => (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRECTANGLE", "true");
            	    }
            	    // InternalFigure.g:423:19: (otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';' )
            	    // InternalFigure.g:423:20: otherlv_7= 'largeur' otherlv_8= ':' ( (lv_largeur_9_0= ruleREEL ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_6); 

            	    									newLeafNode(otherlv_7, grammarAccess.getRECTANGLEAccess().getLargeurKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getRECTANGLEAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalFigure.g:431:9: ( (lv_largeur_9_0= ruleREEL ) )
            	    // InternalFigure.g:432:10: (lv_largeur_9_0= ruleREEL )
            	    {
            	    // InternalFigure.g:432:10: (lv_largeur_9_0= ruleREEL )
            	    // InternalFigure.g:433:11: lv_largeur_9_0= ruleREEL
            	    {

            	    											newCompositeNode(grammarAccess.getRECTANGLEAccess().getLargeurREELParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_8);
            	    lv_largeur_9_0=ruleREEL();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRECTANGLERule());
            	    											}
            	    											set(
            	    												current,
            	    												"largeur",
            	    												lv_largeur_9_0,
            	    												"org.xtext.ipsl.figure.Figure.REEL");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_10=(Token)match(input,17,FOLLOW_12); 

            	    									newLeafNode(otherlv_10, grammarAccess.getRECTANGLEAccess().getSemicolonKeyword_2_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleRECTANGLE", "getUnorderedGroupHelper().canLeave(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRECTANGLEAccess().getUnorderedGroup_2());
            				

            }

            // InternalFigure.g:468:3: ( (lv_retour_11_0= ruleRETURN ) )
            // InternalFigure.g:469:4: (lv_retour_11_0= ruleRETURN )
            {
            // InternalFigure.g:469:4: (lv_retour_11_0= ruleRETURN )
            // InternalFigure.g:470:5: lv_retour_11_0= ruleRETURN
            {

            					newCompositeNode(grammarAccess.getRECTANGLEAccess().getRetourRETURNParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_retour_11_0=ruleRETURN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRECTANGLERule());
            					}
            					set(
            						current,
            						"retour",
            						lv_retour_11_0,
            						"org.xtext.ipsl.figure.Figure.RETURN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFigure.g:487:3: ( (lv_end_12_0= ruleEND ) )
            // InternalFigure.g:488:4: (lv_end_12_0= ruleEND )
            {
            // InternalFigure.g:488:4: (lv_end_12_0= ruleEND )
            // InternalFigure.g:489:5: lv_end_12_0= ruleEND
            {

            					newCompositeNode(grammarAccess.getRECTANGLEAccess().getEndENDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_12_0=ruleEND();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRECTANGLERule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_12_0,
            						"org.xtext.ipsl.figure.Figure.END");
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
    // $ANTLR end "ruleRECTANGLE"


    // $ANTLR start "entryRuleCERCLE"
    // InternalFigure.g:510:1: entryRuleCERCLE returns [EObject current=null] : iv_ruleCERCLE= ruleCERCLE EOF ;
    public final EObject entryRuleCERCLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCERCLE = null;


        try {
            // InternalFigure.g:510:47: (iv_ruleCERCLE= ruleCERCLE EOF )
            // InternalFigure.g:511:2: iv_ruleCERCLE= ruleCERCLE EOF
            {
             newCompositeNode(grammarAccess.getCERCLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCERCLE=ruleCERCLE();

            state._fsp--;

             current =iv_ruleCERCLE; 
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
    // $ANTLR end "entryRuleCERCLE"


    // $ANTLR start "ruleCERCLE"
    // InternalFigure.g:517:1: ruleCERCLE returns [EObject current=null] : ( ( (lv_nom_0_0= 'Cercle' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) (otherlv_2= 'rayon' otherlv_3= ':' ( (lv_rayon_4_0= ruleREEL ) ) otherlv_5= ';' ) ( (lv_retour_6_0= ruleRETURN ) ) ( (lv_end_7_0= ruleEND ) ) ) ;
    public final EObject ruleCERCLE() throws RecognitionException {
        EObject current = null;

        Token lv_nom_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_debut_1_0 = null;

        EObject lv_rayon_4_0 = null;

        EObject lv_retour_6_0 = null;

        AntlrDatatypeRuleToken lv_end_7_0 = null;



        	enterRule();

        try {
            // InternalFigure.g:523:2: ( ( ( (lv_nom_0_0= 'Cercle' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) (otherlv_2= 'rayon' otherlv_3= ':' ( (lv_rayon_4_0= ruleREEL ) ) otherlv_5= ';' ) ( (lv_retour_6_0= ruleRETURN ) ) ( (lv_end_7_0= ruleEND ) ) ) )
            // InternalFigure.g:524:2: ( ( (lv_nom_0_0= 'Cercle' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) (otherlv_2= 'rayon' otherlv_3= ':' ( (lv_rayon_4_0= ruleREEL ) ) otherlv_5= ';' ) ( (lv_retour_6_0= ruleRETURN ) ) ( (lv_end_7_0= ruleEND ) ) )
            {
            // InternalFigure.g:524:2: ( ( (lv_nom_0_0= 'Cercle' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) (otherlv_2= 'rayon' otherlv_3= ':' ( (lv_rayon_4_0= ruleREEL ) ) otherlv_5= ';' ) ( (lv_retour_6_0= ruleRETURN ) ) ( (lv_end_7_0= ruleEND ) ) )
            // InternalFigure.g:525:3: ( (lv_nom_0_0= 'Cercle' ) ) ( (lv_debut_1_0= ruleDEBUT ) ) (otherlv_2= 'rayon' otherlv_3= ':' ( (lv_rayon_4_0= ruleREEL ) ) otherlv_5= ';' ) ( (lv_retour_6_0= ruleRETURN ) ) ( (lv_end_7_0= ruleEND ) )
            {
            // InternalFigure.g:525:3: ( (lv_nom_0_0= 'Cercle' ) )
            // InternalFigure.g:526:4: (lv_nom_0_0= 'Cercle' )
            {
            // InternalFigure.g:526:4: (lv_nom_0_0= 'Cercle' )
            // InternalFigure.g:527:5: lv_nom_0_0= 'Cercle'
            {
            lv_nom_0_0=(Token)match(input,21,FOLLOW_4); 

            					newLeafNode(lv_nom_0_0, grammarAccess.getCERCLEAccess().getNomCercleKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLERule());
            					}
            					setWithLastConsumed(current, "nom", lv_nom_0_0, "Cercle");
            				

            }


            }

            // InternalFigure.g:539:3: ( (lv_debut_1_0= ruleDEBUT ) )
            // InternalFigure.g:540:4: (lv_debut_1_0= ruleDEBUT )
            {
            // InternalFigure.g:540:4: (lv_debut_1_0= ruleDEBUT )
            // InternalFigure.g:541:5: lv_debut_1_0= ruleDEBUT
            {

            					newCompositeNode(grammarAccess.getCERCLEAccess().getDebutDEBUTParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_debut_1_0=ruleDEBUT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCERCLERule());
            					}
            					set(
            						current,
            						"debut",
            						lv_debut_1_0,
            						"org.xtext.ipsl.figure.Figure.DEBUT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFigure.g:558:3: (otherlv_2= 'rayon' otherlv_3= ':' ( (lv_rayon_4_0= ruleREEL ) ) otherlv_5= ';' )
            // InternalFigure.g:559:4: otherlv_2= 'rayon' otherlv_3= ':' ( (lv_rayon_4_0= ruleREEL ) ) otherlv_5= ';'
            {
            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getCERCLEAccess().getRayonKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            				newLeafNode(otherlv_3, grammarAccess.getCERCLEAccess().getColonKeyword_2_1());
            			
            // InternalFigure.g:567:4: ( (lv_rayon_4_0= ruleREEL ) )
            // InternalFigure.g:568:5: (lv_rayon_4_0= ruleREEL )
            {
            // InternalFigure.g:568:5: (lv_rayon_4_0= ruleREEL )
            // InternalFigure.g:569:6: lv_rayon_4_0= ruleREEL
            {

            						newCompositeNode(grammarAccess.getCERCLEAccess().getRayonREELParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_rayon_4_0=ruleREEL();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCERCLERule());
            						}
            						set(
            							current,
            							"rayon",
            							lv_rayon_4_0,
            							"org.xtext.ipsl.figure.Figure.REEL");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_9); 

            				newLeafNode(otherlv_5, grammarAccess.getCERCLEAccess().getSemicolonKeyword_2_3());
            			

            }

            // InternalFigure.g:591:3: ( (lv_retour_6_0= ruleRETURN ) )
            // InternalFigure.g:592:4: (lv_retour_6_0= ruleRETURN )
            {
            // InternalFigure.g:592:4: (lv_retour_6_0= ruleRETURN )
            // InternalFigure.g:593:5: lv_retour_6_0= ruleRETURN
            {

            					newCompositeNode(grammarAccess.getCERCLEAccess().getRetourRETURNParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_retour_6_0=ruleRETURN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCERCLERule());
            					}
            					set(
            						current,
            						"retour",
            						lv_retour_6_0,
            						"org.xtext.ipsl.figure.Figure.RETURN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFigure.g:610:3: ( (lv_end_7_0= ruleEND ) )
            // InternalFigure.g:611:4: (lv_end_7_0= ruleEND )
            {
            // InternalFigure.g:611:4: (lv_end_7_0= ruleEND )
            // InternalFigure.g:612:5: lv_end_7_0= ruleEND
            {

            					newCompositeNode(grammarAccess.getCERCLEAccess().getEndENDParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_7_0=ruleEND();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCERCLERule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_7_0,
            						"org.xtext.ipsl.figure.Figure.END");
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
    // $ANTLR end "ruleCERCLE"


    // $ANTLR start "entryRuleRETURN"
    // InternalFigure.g:633:1: entryRuleRETURN returns [EObject current=null] : iv_ruleRETURN= ruleRETURN EOF ;
    public final EObject entryRuleRETURN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRETURN = null;


        try {
            // InternalFigure.g:633:47: (iv_ruleRETURN= ruleRETURN EOF )
            // InternalFigure.g:634:2: iv_ruleRETURN= ruleRETURN EOF
            {
             newCompositeNode(grammarAccess.getRETURNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRETURN=ruleRETURN();

            state._fsp--;

             current =iv_ruleRETURN; 
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
    // $ANTLR end "entryRuleRETURN"


    // $ANTLR start "ruleRETURN"
    // InternalFigure.g:640:1: ruleRETURN returns [EObject current=null] : (otherlv_0= 'return' ( (lv_resultat_1_0= ruleRETOUR ) ) otherlv_2= ';' ) ;
    public final EObject ruleRETURN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_resultat_1_0 = null;



        	enterRule();

        try {
            // InternalFigure.g:646:2: ( (otherlv_0= 'return' ( (lv_resultat_1_0= ruleRETOUR ) ) otherlv_2= ';' ) )
            // InternalFigure.g:647:2: (otherlv_0= 'return' ( (lv_resultat_1_0= ruleRETOUR ) ) otherlv_2= ';' )
            {
            // InternalFigure.g:647:2: (otherlv_0= 'return' ( (lv_resultat_1_0= ruleRETOUR ) ) otherlv_2= ';' )
            // InternalFigure.g:648:3: otherlv_0= 'return' ( (lv_resultat_1_0= ruleRETOUR ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRETURNAccess().getReturnKeyword_0());
            		
            // InternalFigure.g:652:3: ( (lv_resultat_1_0= ruleRETOUR ) )
            // InternalFigure.g:653:4: (lv_resultat_1_0= ruleRETOUR )
            {
            // InternalFigure.g:653:4: (lv_resultat_1_0= ruleRETOUR )
            // InternalFigure.g:654:5: lv_resultat_1_0= ruleRETOUR
            {

            					newCompositeNode(grammarAccess.getRETURNAccess().getResultatRETOURParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_resultat_1_0=ruleRETOUR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRETURNRule());
            					}
            					set(
            						current,
            						"resultat",
            						lv_resultat_1_0,
            						"org.xtext.ipsl.figure.Figure.RETOUR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRETURNAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleRETURN"


    // $ANTLR start "entryRuleRETOUR"
    // InternalFigure.g:679:1: entryRuleRETOUR returns [String current=null] : iv_ruleRETOUR= ruleRETOUR EOF ;
    public final String entryRuleRETOUR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETOUR = null;


        try {
            // InternalFigure.g:679:46: (iv_ruleRETOUR= ruleRETOUR EOF )
            // InternalFigure.g:680:2: iv_ruleRETOUR= ruleRETOUR EOF
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
    // InternalFigure.g:686:1: ruleRETOUR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'surface' | kw= 'perimetre' ) ;
    public final AntlrDatatypeRuleToken ruleRETOUR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFigure.g:692:2: ( (kw= 'surface' | kw= 'perimetre' ) )
            // InternalFigure.g:693:2: (kw= 'surface' | kw= 'perimetre' )
            {
            // InternalFigure.g:693:2: (kw= 'surface' | kw= 'perimetre' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFigure.g:694:3: kw= 'surface'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRETOURAccess().getSurfaceKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFigure.g:700:3: kw= 'perimetre'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRETOURAccess().getPerimetreKeyword_1());
                    		

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
    // InternalFigure.g:709:1: entryRuleEND returns [String current=null] : iv_ruleEND= ruleEND EOF ;
    public final String entryRuleEND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEND = null;


        try {
            // InternalFigure.g:709:43: (iv_ruleEND= ruleEND EOF )
            // InternalFigure.g:710:2: iv_ruleEND= ruleEND EOF
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
    // InternalFigure.g:716:1: ruleEND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'END' ;
    public final AntlrDatatypeRuleToken ruleEND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFigure.g:722:2: (kw= 'END' )
            // InternalFigure.g:723:2: kw= 'END'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getENDAccess().getENDKeyword());
            	

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


    // $ANTLR start "entryRuleREEL"
    // InternalFigure.g:731:1: entryRuleREEL returns [EObject current=null] : iv_ruleREEL= ruleREEL EOF ;
    public final EObject entryRuleREEL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREEL = null;


        try {
            // InternalFigure.g:731:45: (iv_ruleREEL= ruleREEL EOF )
            // InternalFigure.g:732:2: iv_ruleREEL= ruleREEL EOF
            {
             newCompositeNode(grammarAccess.getREELRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREEL=ruleREEL();

            state._fsp--;

             current =iv_ruleREEL; 
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
    // $ANTLR end "entryRuleREEL"


    // $ANTLR start "ruleREEL"
    // InternalFigure.g:738:1: ruleREEL returns [EObject current=null] : ( (lv_reel_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleREEL() throws RecognitionException {
        EObject current = null;

        Token lv_reel_0_0=null;


        	enterRule();

        try {
            // InternalFigure.g:744:2: ( ( (lv_reel_0_0= RULE_DOUBLE ) ) )
            // InternalFigure.g:745:2: ( (lv_reel_0_0= RULE_DOUBLE ) )
            {
            // InternalFigure.g:745:2: ( (lv_reel_0_0= RULE_DOUBLE ) )
            // InternalFigure.g:746:3: (lv_reel_0_0= RULE_DOUBLE )
            {
            // InternalFigure.g:746:3: (lv_reel_0_0= RULE_DOUBLE )
            // InternalFigure.g:747:4: lv_reel_0_0= RULE_DOUBLE
            {
            lv_reel_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_reel_0_0, grammarAccess.getREELAccess().getReelDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getREELRule());
            				}
            				setWithLastConsumed(
            					current,
            					"reel",
            					lv_reel_0_0,
            					"org.xtext.ipsl.figure.Figure.DOUBLE");
            			

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
    // $ANTLR end "ruleREEL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000244000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000980000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});

}
