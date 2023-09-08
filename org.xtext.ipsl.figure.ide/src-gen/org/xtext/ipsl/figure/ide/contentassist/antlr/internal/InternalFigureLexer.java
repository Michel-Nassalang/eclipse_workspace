package org.xtext.ipsl.figure.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFigureLexer extends Lexer {
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

    public InternalFigureLexer() {;} 
    public InternalFigureLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFigureLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFigure.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFigure.g:11:7: ( 'BEGIN' )
            // InternalFigure.g:11:9: 'BEGIN'
            {
            match("BEGIN"); 


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
            // InternalFigure.g:12:7: ( 'END' )
            // InternalFigure.g:12:9: 'END'
            {
            match("END"); 


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
            // InternalFigure.g:13:7: ( 'surface' )
            // InternalFigure.g:13:9: 'surface'
            {
            match("surface"); 


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
            // InternalFigure.g:14:7: ( 'perimetre' )
            // InternalFigure.g:14:9: 'perimetre'
            {
            match("perimetre"); 


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
            // InternalFigure.g:15:7: ( 'Figure' )
            // InternalFigure.g:15:9: 'Figure'
            {
            match("Figure"); 


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
            // InternalFigure.g:16:7: ( 'cote' )
            // InternalFigure.g:16:9: 'cote'
            {
            match("cote"); 


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
            // InternalFigure.g:17:7: ( ':' )
            // InternalFigure.g:17:9: ':'
            {
            match(':'); 

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
            // InternalFigure.g:18:7: ( ';' )
            // InternalFigure.g:18:9: ';'
            {
            match(';'); 

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
            // InternalFigure.g:19:7: ( 'longueur' )
            // InternalFigure.g:19:9: 'longueur'
            {
            match("longueur"); 


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
            // InternalFigure.g:20:7: ( 'largeur' )
            // InternalFigure.g:20:9: 'largeur'
            {
            match("largeur"); 


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
            // InternalFigure.g:21:7: ( 'rayon' )
            // InternalFigure.g:21:9: 'rayon'
            {
            match("rayon"); 


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
            // InternalFigure.g:22:7: ( 'return' )
            // InternalFigure.g:22:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFigure.g:23:7: ( 'Carre' )
            // InternalFigure.g:23:9: 'Carre'
            {
            match("Carre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFigure.g:24:7: ( 'Rectangle' )
            // InternalFigure.g:24:9: 'Rectangle'
            {
            match("Rectangle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFigure.g:25:7: ( 'Cercle' )
            // InternalFigure.g:25:9: 'Cercle'
            {
            match("Cercle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFigure.g:1717:13: ( ( '-' )? RULE_INT ( '.' RULE_INT )? )
            // InternalFigure.g:1717:15: ( '-' )? RULE_INT ( '.' RULE_INT )?
            {
            // InternalFigure.g:1717:15: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalFigure.g:1717:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            // InternalFigure.g:1717:29: ( '.' RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFigure.g:1717:30: '.' RULE_INT
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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFigure.g:1719:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFigure.g:1719:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFigure.g:1719:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFigure.g:1719:11: '^'
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

            // InternalFigure.g:1719:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFigure.g:
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
            	    break loop4;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalFigure.g:1721:19: ( ( '0' .. '9' )+ )
            // InternalFigure.g:1721:21: ( '0' .. '9' )+
            {
            // InternalFigure.g:1721:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFigure.g:1721:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFigure.g:1723:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFigure.g:1723:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFigure.g:1723:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFigure.g:1723:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFigure.g:1723:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalFigure.g:1723:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFigure.g:1723:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalFigure.g:1723:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFigure.g:1723:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFigure.g:1723:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFigure.g:1723:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalFigure.g:1725:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFigure.g:1725:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFigure.g:1725:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFigure.g:1725:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalFigure.g:1727:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFigure.g:1727:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFigure.g:1727:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFigure.g:1727:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalFigure.g:1727:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFigure.g:1727:41: ( '\\r' )? '\\n'
                    {
                    // InternalFigure.g:1727:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalFigure.g:1727:41: '\\r'
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
            // InternalFigure.g:1729:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFigure.g:1729:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFigure.g:1729:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFigure.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalFigure.g:1731:16: ( . )
            // InternalFigure.g:1731:18: .
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
        // InternalFigure.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_DOUBLE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=22;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalFigure.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalFigure.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalFigure.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalFigure.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalFigure.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalFigure.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalFigure.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalFigure.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalFigure.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalFigure.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalFigure.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalFigure.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalFigure.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalFigure.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalFigure.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalFigure.g:1:100: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 17 :
                // InternalFigure.g:1:112: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // InternalFigure.g:1:120: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // InternalFigure.g:1:132: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // InternalFigure.g:1:148: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalFigure.g:1:164: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // InternalFigure.g:1:172: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\6\27\2\uffff\4\27\1\25\1\uffff\1\25\1\uffff\3\25\2\uffff\1\27\1\uffff\5\27\2\uffff\7\27\5\uffff\1\27\1\71\14\27\1\uffff\3\27\1\111\7\27\1\121\3\27\1\uffff\2\27\1\127\1\27\1\131\2\27\1\uffff\2\27\1\136\2\27\1\uffff\1\141\1\uffff\1\142\1\27\1\144\1\27\1\uffff\1\27\1\147\2\uffff\1\27\1\uffff\1\27\1\152\1\uffff\1\27\1\154\1\uffff\1\155\2\uffff";
    static final String DFA14_eofS =
        "\156\uffff";
    static final String DFA14_minS =
        "\1\0\1\105\1\116\1\165\1\145\1\151\1\157\2\uffff\3\141\1\145\1\60\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\107\1\uffff\1\104\2\162\1\147\1\164\2\uffff\1\156\1\162\1\171\1\164\2\162\1\143\5\uffff\1\111\1\60\1\146\1\151\1\165\1\145\2\147\1\157\1\165\1\162\1\143\1\164\1\116\1\uffff\1\141\1\155\1\162\1\60\1\165\1\145\1\156\1\162\1\145\1\154\1\141\1\60\1\143\2\145\1\uffff\1\145\1\165\1\60\1\156\1\60\1\145\1\156\1\uffff\1\145\1\164\1\60\1\165\1\162\1\uffff\1\60\1\uffff\1\60\1\147\1\60\1\162\1\uffff\1\162\1\60\2\uffff\1\154\1\uffff\1\145\1\60\1\uffff\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\105\1\116\1\165\1\145\1\151\1\157\2\uffff\1\157\3\145\1\71\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\107\1\uffff\1\104\2\162\1\147\1\164\2\uffff\1\156\1\162\1\171\1\164\2\162\1\143\5\uffff\1\111\1\172\1\146\1\151\1\165\1\145\2\147\1\157\1\165\1\162\1\143\1\164\1\116\1\uffff\1\141\1\155\1\162\1\172\1\165\1\145\1\156\1\162\1\145\1\154\1\141\1\172\1\143\2\145\1\uffff\1\145\1\165\1\172\1\156\1\172\1\145\1\156\1\uffff\1\145\1\164\1\172\1\165\1\162\1\uffff\1\172\1\uffff\1\172\1\147\1\172\1\162\1\uffff\1\162\1\172\2\uffff\1\154\1\uffff\1\145\1\172\1\uffff\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\7\uffff\1\7\1\10\5\uffff\1\20\1\uffff\1\21\3\uffff\1\25\1\26\1\uffff\1\21\5\uffff\1\7\1\10\7\uffff\1\20\1\22\1\23\1\24\1\25\16\uffff\1\2\17\uffff\1\6\7\uffff\1\1\5\uffff\1\13\1\uffff\1\15\4\uffff\1\5\2\uffff\1\14\1\17\1\uffff\1\3\2\uffff\1\12\2\uffff\1\11\1\uffff\1\4\1\16";
    static final String DFA14_specialS =
        "\1\2\20\uffff\1\1\1\0\133\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\5\25\1\15\1\25\1\23\12\16\1\7\1\10\5\25\1\20\1\1\1\13\1\20\1\2\1\5\13\20\1\14\10\20\3\25\1\17\1\20\1\25\2\20\1\6\10\20\1\11\3\20\1\4\1\20\1\12\1\3\7\20\uff85\25",
            "\1\26",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "\1\40\15\uffff\1\37",
            "\1\41\3\uffff\1\42",
            "\1\43\3\uffff\1\44",
            "\1\45",
            "\12\46",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\47",
            "\0\47",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "\1\70",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\130",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\137",
            "\1\140",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\143",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\145",
            "",
            "\1\146",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\150",
            "",
            "\1\151",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\153",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_DOUBLE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_18 = input.LA(1);

                        s = -1;
                        if ( ((LA14_18>='\u0000' && LA14_18<='\uFFFF')) ) {s = 39;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_17 = input.LA(1);

                        s = -1;
                        if ( ((LA14_17>='\u0000' && LA14_17<='\uFFFF')) ) {s = 39;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='B') ) {s = 1;}

                        else if ( (LA14_0=='E') ) {s = 2;}

                        else if ( (LA14_0=='s') ) {s = 3;}

                        else if ( (LA14_0=='p') ) {s = 4;}

                        else if ( (LA14_0=='F') ) {s = 5;}

                        else if ( (LA14_0=='c') ) {s = 6;}

                        else if ( (LA14_0==':') ) {s = 7;}

                        else if ( (LA14_0==';') ) {s = 8;}

                        else if ( (LA14_0=='l') ) {s = 9;}

                        else if ( (LA14_0=='r') ) {s = 10;}

                        else if ( (LA14_0=='C') ) {s = 11;}

                        else if ( (LA14_0=='R') ) {s = 12;}

                        else if ( (LA14_0=='-') ) {s = 13;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 14;}

                        else if ( (LA14_0=='^') ) {s = 15;}

                        else if ( (LA14_0=='A'||LA14_0=='D'||(LA14_0>='G' && LA14_0<='Q')||(LA14_0>='S' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||(LA14_0>='d' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='o')||LA14_0=='q'||(LA14_0>='t' && LA14_0<='z')) ) {s = 16;}

                        else if ( (LA14_0=='\"') ) {s = 17;}

                        else if ( (LA14_0=='\'') ) {s = 18;}

                        else if ( (LA14_0=='/') ) {s = 19;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 20;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<=',')||LA14_0=='.'||(LA14_0>='<' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}