package org.xtext.example.domainmodel.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelLexer extends Lexer {
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_DIGIT=5;
    public static final int RULE_REAL=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalDomainmodelLexer() {;} 
    public InternalDomainmodelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDomainmodelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:11:7: ( 'run' )
            // InternalDomainmodel.g:11:9: 'run'
            {
            match("run"); 


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
            // InternalDomainmodel.g:12:7: ( '||' )
            // InternalDomainmodel.g:12:9: '||'
            {
            match("||"); 


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
            // InternalDomainmodel.g:13:7: ( '&&' )
            // InternalDomainmodel.g:13:9: '&&'
            {
            match("&&"); 


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
            // InternalDomainmodel.g:14:7: ( '+' )
            // InternalDomainmodel.g:14:9: '+'
            {
            match('+'); 

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
            // InternalDomainmodel.g:15:7: ( '-' )
            // InternalDomainmodel.g:15:9: '-'
            {
            match('-'); 

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
            // InternalDomainmodel.g:16:7: ( '*' )
            // InternalDomainmodel.g:16:9: '*'
            {
            match('*'); 

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
            // InternalDomainmodel.g:17:7: ( '/' )
            // InternalDomainmodel.g:17:9: '/'
            {
            match('/'); 

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
            // InternalDomainmodel.g:18:7: ( '^' )
            // InternalDomainmodel.g:18:9: '^'
            {
            match('^'); 

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
            // InternalDomainmodel.g:19:7: ( '%' )
            // InternalDomainmodel.g:19:9: '%'
            {
            match('%'); 

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
            // InternalDomainmodel.g:20:7: ( '>' )
            // InternalDomainmodel.g:20:9: '>'
            {
            match('>'); 

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
            // InternalDomainmodel.g:21:7: ( '<' )
            // InternalDomainmodel.g:21:9: '<'
            {
            match('<'); 

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
            // InternalDomainmodel.g:22:7: ( '=' )
            // InternalDomainmodel.g:22:9: '='
            {
            match('='); 

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
            // InternalDomainmodel.g:23:7: ( '>=' )
            // InternalDomainmodel.g:23:9: '>='
            {
            match(">="); 


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
            // InternalDomainmodel.g:24:7: ( '<=' )
            // InternalDomainmodel.g:24:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:25:7: ( 'Int' )
            // InternalDomainmodel.g:25:9: 'Int'
            {
            match("Int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:26:7: ( 'Real' )
            // InternalDomainmodel.g:26:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:27:7: ( 'Bool' )
            // InternalDomainmodel.g:27:9: 'Bool'
            {
            match("Bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:28:7: ( 'String' )
            // InternalDomainmodel.g:28:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:29:7: ( '(' )
            // InternalDomainmodel.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:30:7: ( ')' )
            // InternalDomainmodel.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:31:7: ( '!' )
            // InternalDomainmodel.g:31:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:32:7: ( 'enum' )
            // InternalDomainmodel.g:32:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:33:7: ( '{' )
            // InternalDomainmodel.g:33:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:34:7: ( '}' )
            // InternalDomainmodel.g:34:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:35:7: ( 'define' )
            // InternalDomainmodel.g:35:9: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:36:7: ( 'precondition' )
            // InternalDomainmodel.g:36:9: 'precondition'
            {
            match("precondition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:37:7: ( 'testcase' )
            // InternalDomainmodel.g:37:9: 'testcase'
            {
            match("testcase"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:38:7: ( 'function' )
            // InternalDomainmodel.g:38:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:39:7: ( ',' )
            // InternalDomainmodel.g:39:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:2765:12: ( ( '-' )? ( '0' .. '9' )* )
            // InternalDomainmodel.g:2765:14: ( '-' )? ( '0' .. '9' )*
            {
            // InternalDomainmodel.g:2765:14: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDomainmodel.g:2765:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalDomainmodel.g:2765:19: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomainmodel.g:2765:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:2767:11: ( RULE_DIGIT '.' RULE_DIGIT )
            // InternalDomainmodel.g:2767:13: RULE_DIGIT '.' RULE_DIGIT
            {
            mRULE_DIGIT(); 
            match('.'); 
            mRULE_DIGIT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:2769:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalDomainmodel.g:2769:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalDomainmodel.g:2769:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomainmodel.g:2769:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalDomainmodel.g:2769:65: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:2771:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDomainmodel.g:2771:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDomainmodel.g:2771:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:2771:11: '^'
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

            // InternalDomainmodel.g:2771:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDomainmodel.g:
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
            	    break loop5;
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
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:2773:10: ( ( '0' .. '9' )+ )
            // InternalDomainmodel.g:2773:12: ( '0' .. '9' )+
            {
            // InternalDomainmodel.g:2773:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDomainmodel.g:2773:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainmodel.g:2775:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDomainmodel.g:2775:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDomainmodel.g:2775:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDomainmodel.g:2775:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalDomainmodel.g:2777:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDomainmodel.g:2777:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDomainmodel.g:2777:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainmodel.g:2777:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalDomainmodel.g:2777:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:2777:41: ( '\\r' )? '\\n'
                    {
                    // InternalDomainmodel.g:2777:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDomainmodel.g:2777:41: '\\r'
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
            // InternalDomainmodel.g:2779:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDomainmodel.g:2779:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDomainmodel.g:2779:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDomainmodel.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalDomainmodel.g:2781:16: ( . )
            // InternalDomainmodel.g:2781:18: .
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
        // InternalDomainmodel.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_DIGIT | RULE_REAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=38;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalDomainmodel.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalDomainmodel.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalDomainmodel.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalDomainmodel.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalDomainmodel.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalDomainmodel.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalDomainmodel.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalDomainmodel.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalDomainmodel.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalDomainmodel.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalDomainmodel.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalDomainmodel.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalDomainmodel.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalDomainmodel.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalDomainmodel.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalDomainmodel.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalDomainmodel.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalDomainmodel.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalDomainmodel.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalDomainmodel.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalDomainmodel.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalDomainmodel.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalDomainmodel.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalDomainmodel.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalDomainmodel.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalDomainmodel.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalDomainmodel.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalDomainmodel.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalDomainmodel.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalDomainmodel.g:1:184: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 31 :
                // InternalDomainmodel.g:1:195: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 32 :
                // InternalDomainmodel.g:1:205: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalDomainmodel.g:1:217: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalDomainmodel.g:1:225: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // InternalDomainmodel.g:1:234: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalDomainmodel.g:1:250: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalDomainmodel.g:1:266: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalDomainmodel.g:1:274: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\35\1\44\2\42\1\uffff\1\50\1\uffff\1\56\1\57\1\uffff\1\62\1\64\1\uffff\4\44\3\uffff\1\44\2\uffff\4\44\1\uffff\1\35\2\uffff\1\42\3\uffff\1\44\5\uffff\1\35\14\uffff\4\44\3\uffff\1\44\2\uffff\4\44\1\uffff\1\35\2\uffff\1\122\1\123\10\44\2\uffff\1\134\1\135\1\44\1\137\4\44\2\uffff\1\44\1\uffff\4\44\1\151\1\152\3\44\2\uffff\4\44\1\162\1\163\1\44\2\uffff\2\44\1\167\1\uffff";
    static final String DFA12_eofS =
        "\170\uffff";
    static final String DFA12_minS =
        "\1\0\1\165\1\174\1\46\1\uffff\1\56\1\uffff\1\52\1\101\1\uffff\2\75\1\uffff\1\156\1\145\1\157\1\164\3\uffff\1\156\2\uffff\1\145\1\162\1\145\1\165\1\uffff\1\56\2\uffff\1\0\3\uffff\1\156\5\uffff\1\56\14\uffff\1\164\1\141\1\157\1\162\3\uffff\1\165\2\uffff\1\146\1\145\1\163\1\156\1\uffff\1\56\2\uffff\2\60\2\154\1\151\1\155\1\151\1\143\1\164\1\143\2\uffff\2\60\1\156\1\60\1\156\1\157\1\143\1\164\2\uffff\1\147\1\uffff\1\145\1\156\1\141\1\151\2\60\1\144\1\163\1\157\2\uffff\1\151\1\145\1\156\1\164\2\60\1\151\2\uffff\1\157\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\165\1\174\1\46\1\uffff\1\71\1\uffff\1\57\1\172\1\uffff\2\75\1\uffff\1\156\1\145\1\157\1\164\3\uffff\1\156\2\uffff\1\145\1\162\1\145\1\165\1\uffff\1\71\2\uffff\1\uffff\3\uffff\1\156\5\uffff\1\71\14\uffff\1\164\1\141\1\157\1\162\3\uffff\1\165\2\uffff\1\146\1\145\1\163\1\156\1\uffff\1\71\2\uffff\2\172\2\154\1\151\1\155\1\151\1\143\1\164\1\143\2\uffff\2\172\1\156\1\172\1\156\1\157\1\143\1\164\2\uffff\1\147\1\uffff\1\145\1\156\1\141\1\151\2\172\1\144\1\163\1\157\2\uffff\1\151\1\145\1\156\1\164\2\172\1\151\2\uffff\1\157\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\2\uffff\1\11\2\uffff\1\14\4\uffff\1\23\1\24\1\25\1\uffff\1\27\1\30\4\uffff\1\35\1\uffff\1\36\1\37\1\uffff\1\41\1\45\1\46\1\uffff\1\41\1\2\1\3\1\4\1\5\1\uffff\1\37\1\6\1\43\1\44\1\7\1\10\1\11\1\15\1\12\1\16\1\13\1\14\4\uffff\1\23\1\24\1\25\1\uffff\1\27\1\30\4\uffff\1\35\1\uffff\1\40\1\45\12\uffff\1\1\1\17\10\uffff\1\20\1\21\1\uffff\1\26\11\uffff\1\22\1\31\7\uffff\1\33\1\34\3\uffff\1\32";
    static final String DFA12_specialS =
        "\1\1\36\uffff\1\0\130\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\23\1\37\2\42\1\11\1\3\1\42\1\21\1\22\1\6\1\4\1\33\1\5\1\36\1\7\12\34\2\42\1\13\1\14\1\12\2\42\1\40\1\17\6\40\1\15\10\40\1\16\1\20\7\40\3\42\1\10\1\40\1\42\3\40\1\27\1\24\1\32\11\40\1\30\1\40\1\1\1\40\1\31\6\40\1\25\1\2\1\26\uff82\42",
            "\1\43",
            "\1\45",
            "\1\46",
            "",
            "\1\52\1\uffff\12\51",
            "",
            "\1\54\4\uffff\1\55",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\61",
            "\1\63",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "",
            "\1\75",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\52\1\uffff\12\105",
            "",
            "",
            "\0\106",
            "",
            "",
            "",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "\1\52\1\uffff\12\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "\1\115",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\52\1\uffff\12\105",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\136",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\164",
            "",
            "",
            "\1\165",
            "\1\166",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_DIGIT | RULE_REAL | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 70;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='r') ) {s = 1;}

                        else if ( (LA12_0=='|') ) {s = 2;}

                        else if ( (LA12_0=='&') ) {s = 3;}

                        else if ( (LA12_0=='+') ) {s = 4;}

                        else if ( (LA12_0=='-') ) {s = 5;}

                        else if ( (LA12_0=='*') ) {s = 6;}

                        else if ( (LA12_0=='/') ) {s = 7;}

                        else if ( (LA12_0=='^') ) {s = 8;}

                        else if ( (LA12_0=='%') ) {s = 9;}

                        else if ( (LA12_0=='>') ) {s = 10;}

                        else if ( (LA12_0=='<') ) {s = 11;}

                        else if ( (LA12_0=='=') ) {s = 12;}

                        else if ( (LA12_0=='I') ) {s = 13;}

                        else if ( (LA12_0=='R') ) {s = 14;}

                        else if ( (LA12_0=='B') ) {s = 15;}

                        else if ( (LA12_0=='S') ) {s = 16;}

                        else if ( (LA12_0=='(') ) {s = 17;}

                        else if ( (LA12_0==')') ) {s = 18;}

                        else if ( (LA12_0=='!') ) {s = 19;}

                        else if ( (LA12_0=='e') ) {s = 20;}

                        else if ( (LA12_0=='{') ) {s = 21;}

                        else if ( (LA12_0=='}') ) {s = 22;}

                        else if ( (LA12_0=='d') ) {s = 23;}

                        else if ( (LA12_0=='p') ) {s = 24;}

                        else if ( (LA12_0=='t') ) {s = 25;}

                        else if ( (LA12_0=='f') ) {s = 26;}

                        else if ( (LA12_0==',') ) {s = 27;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 28;}

                        else if ( (LA12_0=='.') ) {s = 30;}

                        else if ( (LA12_0=='\"') ) {s = 31;}

                        else if ( (LA12_0=='A'||(LA12_0>='C' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='Q')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||(LA12_0>='g' && LA12_0<='o')||LA12_0=='q'||LA12_0=='s'||(LA12_0>='u' && LA12_0<='z')) ) {s = 32;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 33;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0=='\''||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 34;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}