package org.xtext.ipsl.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.ipsl.mydsl.services.MonDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMonDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'boolean'", "'entity'", "'{'", "'}'", "'extends'", "';'", "']'", "'['"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMonDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMonDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMonDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMonDsl.g"; }


    	private MonDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MonDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMonDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMonDsl.g:54:1: ( ruleModel EOF )
            // InternalMonDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMonDsl.g:62:1: ruleModel : ( ( rule__Model__EntitiesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:66:2: ( ( ( rule__Model__EntitiesAssignment )* ) )
            // InternalMonDsl.g:67:2: ( ( rule__Model__EntitiesAssignment )* )
            {
            // InternalMonDsl.g:67:2: ( ( rule__Model__EntitiesAssignment )* )
            // InternalMonDsl.g:68:3: ( rule__Model__EntitiesAssignment )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment()); 
            // InternalMonDsl.g:69:3: ( rule__Model__EntitiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMonDsl.g:69:4: rule__Model__EntitiesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__EntitiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalMonDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMonDsl.g:79:1: ( ruleEntity EOF )
            // InternalMonDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMonDsl.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMonDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMonDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalMonDsl.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMonDsl.g:94:3: ( rule__Entity__Group__0 )
            // InternalMonDsl.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMonDsl.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMonDsl.g:104:1: ( ruleAttribute EOF )
            // InternalMonDsl.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMonDsl.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMonDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMonDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMonDsl.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMonDsl.g:119:3: ( rule__Attribute__Group__0 )
            // InternalMonDsl.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalMonDsl.g:128:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalMonDsl.g:129:1: ( ruleAttributeType EOF )
            // InternalMonDsl.g:130:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalMonDsl.g:137:1: ruleAttributeType : ( ( rule__AttributeType__Group__0 ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:141:2: ( ( ( rule__AttributeType__Group__0 ) ) )
            // InternalMonDsl.g:142:2: ( ( rule__AttributeType__Group__0 ) )
            {
            // InternalMonDsl.g:142:2: ( ( rule__AttributeType__Group__0 ) )
            // InternalMonDsl.g:143:3: ( rule__AttributeType__Group__0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup()); 
            // InternalMonDsl.g:144:3: ( rule__AttributeType__Group__0 )
            // InternalMonDsl.g:144:4: rule__AttributeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleElementType"
    // InternalMonDsl.g:153:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // InternalMonDsl.g:154:1: ( ruleElementType EOF )
            // InternalMonDsl.g:155:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalMonDsl.g:162:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:166:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalMonDsl.g:167:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalMonDsl.g:167:2: ( ( rule__ElementType__Alternatives ) )
            // InternalMonDsl.g:168:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalMonDsl.g:169:3: ( rule__ElementType__Alternatives )
            // InternalMonDsl.g:169:4: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // InternalMonDsl.g:178:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalMonDsl.g:179:1: ( ruleBasicType EOF )
            // InternalMonDsl.g:180:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalMonDsl.g:187:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:191:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // InternalMonDsl.g:192:2: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // InternalMonDsl.g:192:2: ( ( rule__BasicType__TypeNameAssignment ) )
            // InternalMonDsl.g:193:3: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // InternalMonDsl.g:194:3: ( rule__BasicType__TypeNameAssignment )
            // InternalMonDsl.g:194:4: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // InternalMonDsl.g:203:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // InternalMonDsl.g:204:1: ( ruleEntityType EOF )
            // InternalMonDsl.g:205:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalMonDsl.g:212:1: ruleEntityType : ( ( rule__EntityType__EntityAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:216:2: ( ( ( rule__EntityType__EntityAssignment ) ) )
            // InternalMonDsl.g:217:2: ( ( rule__EntityType__EntityAssignment ) )
            {
            // InternalMonDsl.g:217:2: ( ( rule__EntityType__EntityAssignment ) )
            // InternalMonDsl.g:218:3: ( rule__EntityType__EntityAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 
            // InternalMonDsl.g:219:3: ( rule__EntityType__EntityAssignment )
            // InternalMonDsl.g:219:4: rule__EntityType__EntityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EntityType__EntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 

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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalMonDsl.g:227:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleEntityType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:231:1: ( ( ruleBasicType ) | ( ruleEntityType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMonDsl.g:232:2: ( ruleBasicType )
                    {
                    // InternalMonDsl.g:232:2: ( ruleBasicType )
                    // InternalMonDsl.g:233:3: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMonDsl.g:238:2: ( ruleEntityType )
                    {
                    // InternalMonDsl.g:238:2: ( ruleEntityType )
                    // InternalMonDsl.g:239:3: ruleEntityType
                    {
                     before(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__BasicType__TypeNameAlternatives_0"
    // InternalMonDsl.g:248:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:252:1: ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMonDsl.g:253:2: ( 'string' )
                    {
                    // InternalMonDsl.g:253:2: ( 'string' )
                    // InternalMonDsl.g:254:3: 'string'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMonDsl.g:259:2: ( 'int' )
                    {
                    // InternalMonDsl.g:259:2: ( 'int' )
                    // InternalMonDsl.g:260:3: 'int'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMonDsl.g:265:2: ( 'boolean' )
                    {
                    // InternalMonDsl.g:265:2: ( 'boolean' )
                    // InternalMonDsl.g:266:3: 'boolean'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2()); 

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
    // $ANTLR end "rule__BasicType__TypeNameAlternatives_0"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMonDsl.g:275:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:279:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMonDsl.g:280:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMonDsl.g:287:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:291:1: ( ( 'entity' ) )
            // InternalMonDsl.g:292:1: ( 'entity' )
            {
            // InternalMonDsl.g:292:1: ( 'entity' )
            // InternalMonDsl.g:293:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMonDsl.g:302:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:306:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMonDsl.g:307:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMonDsl.g:314:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:318:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMonDsl.g:319:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMonDsl.g:319:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMonDsl.g:320:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMonDsl.g:321:2: ( rule__Entity__NameAssignment_1 )
            // InternalMonDsl.g:321:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalMonDsl.g:329:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:333:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMonDsl.g:334:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalMonDsl.g:341:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:345:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalMonDsl.g:346:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalMonDsl.g:346:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalMonDsl.g:347:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalMonDsl.g:348:2: ( rule__Entity__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMonDsl.g:348:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalMonDsl.g:356:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:360:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalMonDsl.g:361:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalMonDsl.g:368:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:372:1: ( ( '{' ) )
            // InternalMonDsl.g:373:1: ( '{' )
            {
            // InternalMonDsl.g:373:1: ( '{' )
            // InternalMonDsl.g:374:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalMonDsl.g:383:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:387:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalMonDsl.g:388:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalMonDsl.g:395:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__AttributesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:399:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // InternalMonDsl.g:400:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // InternalMonDsl.g:400:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // InternalMonDsl.g:401:2: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // InternalMonDsl.g:402:2: ( rule__Entity__AttributesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=11 && LA5_0<=13)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMonDsl.g:402:3: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalMonDsl.g:410:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:414:1: ( rule__Entity__Group__5__Impl )
            // InternalMonDsl.g:415:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalMonDsl.g:421:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:425:1: ( ( '}' ) )
            // InternalMonDsl.g:426:1: ( '}' )
            {
            // InternalMonDsl.g:426:1: ( '}' )
            // InternalMonDsl.g:427:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalMonDsl.g:437:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:441:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalMonDsl.g:442:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalMonDsl.g:449:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:453:1: ( ( 'extends' ) )
            // InternalMonDsl.g:454:1: ( 'extends' )
            {
            // InternalMonDsl.g:454:1: ( 'extends' )
            // InternalMonDsl.g:455:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalMonDsl.g:464:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:468:1: ( rule__Entity__Group_2__1__Impl )
            // InternalMonDsl.g:469:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalMonDsl.g:475:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:479:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalMonDsl.g:480:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalMonDsl.g:480:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalMonDsl.g:481:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalMonDsl.g:482:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalMonDsl.g:482:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMonDsl.g:491:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:495:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMonDsl.g:496:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMonDsl.g:503:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:507:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalMonDsl.g:508:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalMonDsl.g:508:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalMonDsl.g:509:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalMonDsl.g:510:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalMonDsl.g:510:3: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMonDsl.g:518:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:522:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMonDsl.g:523:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMonDsl.g:530:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:534:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMonDsl.g:535:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMonDsl.g:535:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMonDsl.g:536:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMonDsl.g:537:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMonDsl.g:537:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMonDsl.g:545:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:549:1: ( rule__Attribute__Group__2__Impl )
            // InternalMonDsl.g:550:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMonDsl.g:556:1: rule__Attribute__Group__2__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:560:1: ( ( ';' ) )
            // InternalMonDsl.g:561:1: ( ';' )
            {
            // InternalMonDsl.g:561:1: ( ';' )
            // InternalMonDsl.g:562:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__AttributeType__Group__0"
    // InternalMonDsl.g:572:1: rule__AttributeType__Group__0 : rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 ;
    public final void rule__AttributeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:576:1: ( rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 )
            // InternalMonDsl.g:577:2: rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AttributeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__1();

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
    // $ANTLR end "rule__AttributeType__Group__0"


    // $ANTLR start "rule__AttributeType__Group__0__Impl"
    // InternalMonDsl.g:584:1: rule__AttributeType__Group__0__Impl : ( ( rule__AttributeType__ElementTypeAssignment_0 ) ) ;
    public final void rule__AttributeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:588:1: ( ( ( rule__AttributeType__ElementTypeAssignment_0 ) ) )
            // InternalMonDsl.g:589:1: ( ( rule__AttributeType__ElementTypeAssignment_0 ) )
            {
            // InternalMonDsl.g:589:1: ( ( rule__AttributeType__ElementTypeAssignment_0 ) )
            // InternalMonDsl.g:590:2: ( rule__AttributeType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getElementTypeAssignment_0()); 
            // InternalMonDsl.g:591:2: ( rule__AttributeType__ElementTypeAssignment_0 )
            // InternalMonDsl.g:591:3: rule__AttributeType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__ElementTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getElementTypeAssignment_0()); 

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
    // $ANTLR end "rule__AttributeType__Group__0__Impl"


    // $ANTLR start "rule__AttributeType__Group__1"
    // InternalMonDsl.g:599:1: rule__AttributeType__Group__1 : rule__AttributeType__Group__1__Impl ;
    public final void rule__AttributeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:603:1: ( rule__AttributeType__Group__1__Impl )
            // InternalMonDsl.g:604:2: rule__AttributeType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeType__Group__1"


    // $ANTLR start "rule__AttributeType__Group__1__Impl"
    // InternalMonDsl.g:610:1: rule__AttributeType__Group__1__Impl : ( ( rule__AttributeType__Group_1__0 )? ) ;
    public final void rule__AttributeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:614:1: ( ( ( rule__AttributeType__Group_1__0 )? ) )
            // InternalMonDsl.g:615:1: ( ( rule__AttributeType__Group_1__0 )? )
            {
            // InternalMonDsl.g:615:1: ( ( rule__AttributeType__Group_1__0 )? )
            // InternalMonDsl.g:616:2: ( rule__AttributeType__Group_1__0 )?
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup_1()); 
            // InternalMonDsl.g:617:2: ( rule__AttributeType__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMonDsl.g:617:3: rule__AttributeType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AttributeType__Group__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__0"
    // InternalMonDsl.g:626:1: rule__AttributeType__Group_1__0 : rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1 ;
    public final void rule__AttributeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:630:1: ( rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1 )
            // InternalMonDsl.g:631:2: rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__AttributeType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__1();

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
    // $ANTLR end "rule__AttributeType__Group_1__0"


    // $ANTLR start "rule__AttributeType__Group_1__0__Impl"
    // InternalMonDsl.g:638:1: rule__AttributeType__Group_1__0__Impl : ( ( rule__AttributeType__ArrayAssignment_1_0 ) ) ;
    public final void rule__AttributeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:642:1: ( ( ( rule__AttributeType__ArrayAssignment_1_0 ) ) )
            // InternalMonDsl.g:643:1: ( ( rule__AttributeType__ArrayAssignment_1_0 ) )
            {
            // InternalMonDsl.g:643:1: ( ( rule__AttributeType__ArrayAssignment_1_0 ) )
            // InternalMonDsl.g:644:2: ( rule__AttributeType__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0()); 
            // InternalMonDsl.g:645:2: ( rule__AttributeType__ArrayAssignment_1_0 )
            // InternalMonDsl.g:645:3: rule__AttributeType__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0()); 

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
    // $ANTLR end "rule__AttributeType__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__1"
    // InternalMonDsl.g:653:1: rule__AttributeType__Group_1__1 : rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2 ;
    public final void rule__AttributeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:657:1: ( rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2 )
            // InternalMonDsl.g:658:2: rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__AttributeType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__2();

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
    // $ANTLR end "rule__AttributeType__Group_1__1"


    // $ANTLR start "rule__AttributeType__Group_1__1__Impl"
    // InternalMonDsl.g:665:1: rule__AttributeType__Group_1__1__Impl : ( ( rule__AttributeType__LengthAssignment_1_1 )? ) ;
    public final void rule__AttributeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:669:1: ( ( ( rule__AttributeType__LengthAssignment_1_1 )? ) )
            // InternalMonDsl.g:670:1: ( ( rule__AttributeType__LengthAssignment_1_1 )? )
            {
            // InternalMonDsl.g:670:1: ( ( rule__AttributeType__LengthAssignment_1_1 )? )
            // InternalMonDsl.g:671:2: ( rule__AttributeType__LengthAssignment_1_1 )?
            {
             before(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1()); 
            // InternalMonDsl.g:672:2: ( rule__AttributeType__LengthAssignment_1_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMonDsl.g:672:3: rule__AttributeType__LengthAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__LengthAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1()); 

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
    // $ANTLR end "rule__AttributeType__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__2"
    // InternalMonDsl.g:680:1: rule__AttributeType__Group_1__2 : rule__AttributeType__Group_1__2__Impl ;
    public final void rule__AttributeType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:684:1: ( rule__AttributeType__Group_1__2__Impl )
            // InternalMonDsl.g:685:2: rule__AttributeType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__2__Impl();

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
    // $ANTLR end "rule__AttributeType__Group_1__2"


    // $ANTLR start "rule__AttributeType__Group_1__2__Impl"
    // InternalMonDsl.g:691:1: rule__AttributeType__Group_1__2__Impl : ( ']' ) ;
    public final void rule__AttributeType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:695:1: ( ( ']' ) )
            // InternalMonDsl.g:696:1: ( ']' )
            {
            // InternalMonDsl.g:696:1: ( ']' )
            // InternalMonDsl.g:697:2: ']'
            {
             before(grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__AttributeType__Group_1__2__Impl"


    // $ANTLR start "rule__Model__EntitiesAssignment"
    // InternalMonDsl.g:707:1: rule__Model__EntitiesAssignment : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:711:1: ( ( ruleEntity ) )
            // InternalMonDsl.g:712:2: ( ruleEntity )
            {
            // InternalMonDsl.g:712:2: ( ruleEntity )
            // InternalMonDsl.g:713:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__EntitiesAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMonDsl.g:722:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:726:1: ( ( RULE_ID ) )
            // InternalMonDsl.g:727:2: ( RULE_ID )
            {
            // InternalMonDsl.g:727:2: ( RULE_ID )
            // InternalMonDsl.g:728:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalMonDsl.g:737:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:741:1: ( ( ( RULE_ID ) ) )
            // InternalMonDsl.g:742:2: ( ( RULE_ID ) )
            {
            // InternalMonDsl.g:742:2: ( ( RULE_ID ) )
            // InternalMonDsl.g:743:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalMonDsl.g:744:3: ( RULE_ID )
            // InternalMonDsl.g:745:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_4"
    // InternalMonDsl.g:756:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:760:1: ( ( ruleAttribute ) )
            // InternalMonDsl.g:761:2: ( ruleAttribute )
            {
            // InternalMonDsl.g:761:2: ( ruleAttribute )
            // InternalMonDsl.g:762:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // InternalMonDsl.g:771:1: rule__Attribute__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:775:1: ( ( ruleAttributeType ) )
            // InternalMonDsl.g:776:2: ( ruleAttributeType )
            {
            // InternalMonDsl.g:776:2: ( ruleAttributeType )
            // InternalMonDsl.g:777:3: ruleAttributeType
            {
             before(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMonDsl.g:786:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:790:1: ( ( RULE_ID ) )
            // InternalMonDsl.g:791:2: ( RULE_ID )
            {
            // InternalMonDsl.g:791:2: ( RULE_ID )
            // InternalMonDsl.g:792:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__AttributeType__ElementTypeAssignment_0"
    // InternalMonDsl.g:801:1: rule__AttributeType__ElementTypeAssignment_0 : ( ruleElementType ) ;
    public final void rule__AttributeType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:805:1: ( ( ruleElementType ) )
            // InternalMonDsl.g:806:2: ( ruleElementType )
            {
            // InternalMonDsl.g:806:2: ( ruleElementType )
            // InternalMonDsl.g:807:3: ruleElementType
            {
             before(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AttributeType__ElementTypeAssignment_0"


    // $ANTLR start "rule__AttributeType__ArrayAssignment_1_0"
    // InternalMonDsl.g:816:1: rule__AttributeType__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__AttributeType__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:820:1: ( ( ( '[' ) ) )
            // InternalMonDsl.g:821:2: ( ( '[' ) )
            {
            // InternalMonDsl.g:821:2: ( ( '[' ) )
            // InternalMonDsl.g:822:3: ( '[' )
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalMonDsl.g:823:3: ( '[' )
            // InternalMonDsl.g:824:4: '['
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

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
    // $ANTLR end "rule__AttributeType__ArrayAssignment_1_0"


    // $ANTLR start "rule__AttributeType__LengthAssignment_1_1"
    // InternalMonDsl.g:835:1: rule__AttributeType__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__AttributeType__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:839:1: ( ( RULE_INT ) )
            // InternalMonDsl.g:840:2: ( RULE_INT )
            {
            // InternalMonDsl.g:840:2: ( RULE_INT )
            // InternalMonDsl.g:841:3: RULE_INT
            {
             before(grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AttributeType__LengthAssignment_1_1"


    // $ANTLR start "rule__BasicType__TypeNameAssignment"
    // InternalMonDsl.g:850:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:854:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // InternalMonDsl.g:855:2: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // InternalMonDsl.g:855:2: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // InternalMonDsl.g:856:3: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // InternalMonDsl.g:857:3: ( rule__BasicType__TypeNameAlternatives_0 )
            // InternalMonDsl.g:857:4: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 

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
    // $ANTLR end "rule__BasicType__TypeNameAssignment"


    // $ANTLR start "rule__EntityType__EntityAssignment"
    // InternalMonDsl.g:865:1: rule__EntityType__EntityAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EntityType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMonDsl.g:869:1: ( ( ( RULE_ID ) ) )
            // InternalMonDsl.g:870:2: ( ( RULE_ID ) )
            {
            // InternalMonDsl.g:870:2: ( ( RULE_ID ) )
            // InternalMonDsl.g:871:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0()); 
            // InternalMonDsl.g:872:3: ( RULE_ID )
            // InternalMonDsl.g:873:4: RULE_ID
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0()); 

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
    // $ANTLR end "rule__EntityType__EntityAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000013810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080020L});

}