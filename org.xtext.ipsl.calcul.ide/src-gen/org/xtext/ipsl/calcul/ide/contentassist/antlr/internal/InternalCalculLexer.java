package org.xtext.ipsl.calcul.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalculLexer extends Lexer {
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

    public InternalCalculLexer() {;} 
    public InternalCalculLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCalculLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCalcul.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:11:7: ( 'begin' )
            // InternalCalcul.g:11:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:12:7: ( 'end' )
            // InternalCalcul.g:12:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:13:7: ( 'moyenne' )
            // InternalCalcul.g:13:9: 'moyenne'
            {
            match("moyenne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:14:7: ( 'mode' )
            // InternalCalcul.g:14:9: 'mode'
            {
            match("mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:15:7: ( 'variance' )
            // InternalCalcul.g:15:9: 'variance'
            {
            match("variance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:16:7: ( 'ecart-type' )
            // InternalCalcul.g:16:9: 'ecart-type'
            {
            match("ecart-type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:17:7: ( 'program' )
            // InternalCalcul.g:17:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:18:7: ( 'mod:' )
            // InternalCalcul.g:18:9: 'mod:'
            {
            match("mod:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:19:7: ( 'eff:' )
            // InternalCalcul.g:19:9: 'eff:'
            {
            match("eff:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:20:7: ( 'return' )
            // InternalCalcul.g:20:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:21:7: ( ';' )
            // InternalCalcul.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:22:7: ( ',' )
            // InternalCalcul.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_REEL"
    public final void mRULE_REEL() throws RecognitionException {
        try {
            int _type = RULE_REEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:1046:11: ( ( '-' )? ( RULE_INT )? ( '.' RULE_INT )? )
            // InternalCalcul.g:1046:13: ( '-' )? ( RULE_INT )? ( '.' RULE_INT )?
            {
            // InternalCalcul.g:1046:13: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCalcul.g:1046:13: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalCalcul.g:1046:18: ( RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCalcul.g:1046:18: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalCalcul.g:1046:28: ( '.' RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCalcul.g:1046:29: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REEL"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalCalcul.g:1048:19: ( ( '0' .. '9' )+ )
            // InternalCalcul.g:1048:21: ( '0' .. '9' )+
            {
            // InternalCalcul.g:1048:21: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCalcul.g:1048:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:1050:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCalcul.g:1050:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCalcul.g:1050:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCalcul.g:1050:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCalcul.g:1050:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCalcul.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:1052:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCalcul.g:1052:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCalcul.g:1052:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCalcul.g:1052:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCalcul.g:1052:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCalcul.g:1052:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCalcul.g:1052:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCalcul.g:1052:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCalcul.g:1052:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCalcul.g:1052:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCalcul.g:1052:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:1054:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCalcul.g:1054:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCalcul.g:1054:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCalcul.g:1054:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:1056:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCalcul.g:1056:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCalcul.g:1056:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCalcul.g:1056:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalCalcul.g:1056:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCalcul.g:1056:41: ( '\\r' )? '\\n'
                    {
                    // InternalCalcul.g:1056:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalCalcul.g:1056:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:1058:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCalcul.g:1058:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCalcul.g:1058:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCalcul.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalcul.g:1060:16: ( . )
            // InternalCalcul.g:1060:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCalcul.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_REEL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=19;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalCalcul.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalCalcul.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalCalcul.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalCalcul.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalCalcul.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalCalcul.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalCalcul.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalCalcul.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalCalcul.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalCalcul.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalCalcul.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalCalcul.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalCalcul.g:1:82: RULE_REEL
                {
                mRULE_REEL(); 

                }
                break;
            case 14 :
                // InternalCalcul.g:1:92: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalCalcul.g:1:100: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // InternalCalcul.g:1:112: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // InternalCalcul.g:1:128: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // InternalCalcul.g:1:144: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // InternalCalcul.g:1:152: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\14\6\25\4\uffff\1\23\1\uffff\1\23\1\uffff\3\23\2\uffff\1\25\1\uffff\7\25\6\uffff\1\25\1\55\10\25\1\uffff\1\25\1\uffff\1\25\1\71\1\uffff\3\25\1\75\2\25\1\uffff\3\25\2\uffff\3\25\1\106\1\107\1\25\1\111\2\uffff\1\112\2\uffff";
    static final String DFA15_eofS =
        "\113\uffff";
    static final String DFA15_minS =
        "\1\0\1\145\1\143\1\157\1\141\1\162\1\145\4\uffff\1\60\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\147\1\uffff\1\144\1\141\1\146\1\144\1\162\1\157\1\164\6\uffff\1\151\1\60\1\162\1\72\1\145\1\72\1\151\1\147\1\165\1\156\1\uffff\1\164\1\uffff\1\156\1\60\1\uffff\1\141\2\162\1\60\1\55\1\156\1\uffff\1\156\1\141\1\156\2\uffff\1\145\1\143\1\155\2\60\1\145\1\60\2\uffff\1\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\145\1\156\1\157\1\141\1\162\1\145\4\uffff\1\71\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\147\1\uffff\1\144\1\141\1\146\1\171\1\162\1\157\1\164\6\uffff\1\151\1\172\1\162\1\72\2\145\1\151\1\147\1\165\1\156\1\uffff\1\164\1\uffff\1\156\1\172\1\uffff\1\141\2\162\1\172\1\55\1\156\1\uffff\1\156\1\141\1\156\2\uffff\1\145\1\143\1\155\2\172\1\145\1\172\2\uffff\1\172\2\uffff";
    static final String DFA15_acceptS =
        "\7\uffff\1\13\1\14\2\15\1\uffff\1\15\1\uffff\1\16\3\uffff\1\22\1\23\1\uffff\1\16\7\uffff\1\13\1\14\1\17\1\20\1\21\1\22\12\uffff\1\2\1\uffff\1\11\2\uffff\1\10\6\uffff\1\4\3\uffff\1\1\1\6\7\uffff\1\12\1\3\1\uffff\1\7\1\5";
    static final String DFA15_specialS =
        "\1\1\16\uffff\1\2\1\0\72\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\4\23\1\10\1\11\1\13\1\21\12\12\1\23\1\7\5\23\32\16\3\23\1\15\1\16\1\23\1\16\1\1\2\16\1\2\7\16\1\3\2\16\1\5\1\16\1\6\3\16\1\4\4\16\uff85\23",
            "\1\24",
            "\1\27\2\uffff\1\30\7\uffff\1\26",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "",
            "",
            "\12\14",
            "",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\0\37",
            "\0\37",
            "\1\40\4\uffff\1\41",
            "",
            "",
            "\1\43",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\50\24\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\62\52\uffff\1\61",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "\1\67",
            "",
            "\1\70",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\110",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_REEL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_16 = input.LA(1);

                        s = -1;
                        if ( ((LA15_16>='\u0000' && LA15_16<='\uFFFF')) ) {s = 31;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='b') ) {s = 1;}

                        else if ( (LA15_0=='e') ) {s = 2;}

                        else if ( (LA15_0=='m') ) {s = 3;}

                        else if ( (LA15_0=='v') ) {s = 4;}

                        else if ( (LA15_0=='p') ) {s = 5;}

                        else if ( (LA15_0=='r') ) {s = 6;}

                        else if ( (LA15_0==';') ) {s = 7;}

                        else if ( (LA15_0==',') ) {s = 8;}

                        else if ( (LA15_0=='-') ) {s = 9;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 10;}

                        else if ( (LA15_0=='.') ) {s = 11;}

                        else if ( (LA15_0=='^') ) {s = 13;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='a'||(LA15_0>='c' && LA15_0<='d')||(LA15_0>='f' && LA15_0<='l')||(LA15_0>='n' && LA15_0<='o')||LA15_0=='q'||(LA15_0>='s' && LA15_0<='u')||(LA15_0>='w' && LA15_0<='z')) ) {s = 14;}

                        else if ( (LA15_0=='\"') ) {s = 15;}

                        else if ( (LA15_0=='\'') ) {s = 16;}

                        else if ( (LA15_0=='/') ) {s = 17;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 18;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||LA15_0==':'||(LA15_0>='<' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 19;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_15 = input.LA(1);

                        s = -1;
                        if ( ((LA15_15>='\u0000' && LA15_15<='\uFFFF')) ) {s = 31;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}