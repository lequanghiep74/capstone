package org.xtext.example.domainmodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DIGIT", "RULE_REAL", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'>'", "'<'", "'='", "'>='", "'<='", "'('", "')'", "'.'", "'onlyDigit'", "'onlyLetter'", "'length'", "'contain'", "'!'", "'enum'", "'Int'", "'Real'", "'Bool'", "'String'", "'{'", "'}'", "'define'", "'precondition'", "'example'", "'limit'", "'testcase'", "'function'", "','", "'run'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int RULE_DIGIT=4;
    public static final int RULE_REAL=5;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }



     	private DomainmodelGrammarAccess grammarAccess;

        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDomainmodel.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDomainmodel.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDomainmodel.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDomainmodel.g:71:1: ruleModel returns [EObject current=null] : ( (lv_myDSL_0_0= rulemyDSL ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_myDSL_0_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:77:2: ( ( (lv_myDSL_0_0= rulemyDSL ) )* )
            // InternalDomainmodel.g:78:2: ( (lv_myDSL_0_0= rulemyDSL ) )*
            {
            // InternalDomainmodel.g:78:2: ( (lv_myDSL_0_0= rulemyDSL ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34||(LA1_0>=41 && LA1_0<=46)||LA1_0==48) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:79:3: (lv_myDSL_0_0= rulemyDSL )
            	    {
            	    // InternalDomainmodel.g:79:3: (lv_myDSL_0_0= rulemyDSL )
            	    // InternalDomainmodel.g:80:4: lv_myDSL_0_0= rulemyDSL
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getMyDSLMyDSLParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_myDSL_0_0=rulemyDSL();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"myDSL",
            	    					lv_myDSL_0_0,
            	    					"org.xtext.example.domainmodel.Domainmodel.myDSL");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulemyDSL"
    // InternalDomainmodel.g:100:1: entryRulemyDSL returns [EObject current=null] : iv_rulemyDSL= rulemyDSL EOF ;
    public final EObject entryRulemyDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemyDSL = null;


        try {
            // InternalDomainmodel.g:100:46: (iv_rulemyDSL= rulemyDSL EOF )
            // InternalDomainmodel.g:101:2: iv_rulemyDSL= rulemyDSL EOF
            {
             newCompositeNode(grammarAccess.getMyDSLRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemyDSL=rulemyDSL();

            state._fsp--;

             current =iv_rulemyDSL; 
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
    // $ANTLR end "entryRulemyDSL"


    // $ANTLR start "rulemyDSL"
    // InternalDomainmodel.g:107:1: rulemyDSL returns [EObject current=null] : ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun | ruleExample | ruleLimit ) ;
    public final EObject rulemyDSL() throws RecognitionException {
        EObject current = null;

        EObject this_Define_1 = null;

        EObject this_Function_4 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:113:2: ( ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun | ruleExample | ruleLimit ) )
            // InternalDomainmodel.g:114:2: ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun | ruleExample | ruleLimit )
            {
            // InternalDomainmodel.g:114:2: ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun | ruleExample | ruleLimit )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 42:
                {
                alt2=3;
                }
                break;
            case 45:
                {
                alt2=4;
                }
                break;
            case 46:
                {
                alt2=5;
                }
                break;
            case 48:
                {
                alt2=6;
                }
                break;
            case 43:
                {
                alt2=7;
                }
                break;
            case 44:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:115:3: ruleEnum
                    {

                    			newCompositeNode(grammarAccess.getMyDSLAccess().getEnumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    ruleEnum();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:123:3: this_Define_1= ruleDefine
                    {

                    			newCompositeNode(grammarAccess.getMyDSLAccess().getDefineParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Define_1=ruleDefine();

                    state._fsp--;


                    			current = this_Define_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:132:3: rulePrecondition
                    {

                    			newCompositeNode(grammarAccess.getMyDSLAccess().getPreconditionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    rulePrecondition();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:140:3: ruleTestcase
                    {

                    			newCompositeNode(grammarAccess.getMyDSLAccess().getTestcaseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    ruleTestcase();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:148:3: this_Function_4= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getMyDSLAccess().getFunctionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_4=ruleFunction();

                    state._fsp--;


                    			current = this_Function_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDomainmodel.g:157:3: ruleRun
                    {

                    			newCompositeNode(grammarAccess.getMyDSLAccess().getRunParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    ruleRun();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDomainmodel.g:165:3: ruleExample
                    {

                    			newCompositeNode(grammarAccess.getMyDSLAccess().getExampleParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    ruleExample();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDomainmodel.g:173:3: ruleLimit
                    {

                    			newCompositeNode(grammarAccess.getMyDSLAccess().getLimitParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    ruleLimit();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulemyDSL"


    // $ANTLR start "entryRuleConditionOperation"
    // InternalDomainmodel.g:184:1: entryRuleConditionOperation returns [String current=null] : iv_ruleConditionOperation= ruleConditionOperation EOF ;
    public final String entryRuleConditionOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionOperation = null;


        try {
            // InternalDomainmodel.g:184:58: (iv_ruleConditionOperation= ruleConditionOperation EOF )
            // InternalDomainmodel.g:185:2: iv_ruleConditionOperation= ruleConditionOperation EOF
            {
             newCompositeNode(grammarAccess.getConditionOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionOperation=ruleConditionOperation();

            state._fsp--;

             current =iv_ruleConditionOperation.getText(); 
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
    // $ANTLR end "entryRuleConditionOperation"


    // $ANTLR start "ruleConditionOperation"
    // InternalDomainmodel.g:191:1: ruleConditionOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '||' | kw= '&&' ) ;
    public final AntlrDatatypeRuleToken ruleConditionOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:197:2: ( (kw= '||' | kw= '&&' ) )
            // InternalDomainmodel.g:198:2: (kw= '||' | kw= '&&' )
            {
            // InternalDomainmodel.g:198:2: (kw= '||' | kw= '&&' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:199:3: kw= '||'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionOperationAccess().getVerticalLineVerticalLineKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:205:3: kw= '&&'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionOperationAccess().getAmpersandAmpersandKeyword_1());
                    		

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
    // $ANTLR end "ruleConditionOperation"


    // $ANTLR start "entryRuleMathOperation"
    // InternalDomainmodel.g:214:1: entryRuleMathOperation returns [String current=null] : iv_ruleMathOperation= ruleMathOperation EOF ;
    public final String entryRuleMathOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMathOperation = null;


        try {
            // InternalDomainmodel.g:214:53: (iv_ruleMathOperation= ruleMathOperation EOF )
            // InternalDomainmodel.g:215:2: iv_ruleMathOperation= ruleMathOperation EOF
            {
             newCompositeNode(grammarAccess.getMathOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathOperation=ruleMathOperation();

            state._fsp--;

             current =iv_ruleMathOperation.getText(); 
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
    // $ANTLR end "entryRuleMathOperation"


    // $ANTLR start "ruleMathOperation"
    // InternalDomainmodel.g:221:1: ruleMathOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMathOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:227:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' ) )
            // InternalDomainmodel.g:228:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' )
            {
            // InternalDomainmodel.g:228:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:229:3: kw= '+'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:235:3: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:241:3: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:247:3: kw= '/'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:253:3: kw= '^'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getCircumflexAccentKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDomainmodel.g:259:3: kw= '%'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getPercentSignKeyword_5());
                    		

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
    // $ANTLR end "ruleMathOperation"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalDomainmodel.g:268:1: entryRuleCompareOperation returns [String current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final String entryRuleCompareOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOperation = null;


        try {
            // InternalDomainmodel.g:268:56: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalDomainmodel.g:269:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
             newCompositeNode(grammarAccess.getCompareOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;

             current =iv_ruleCompareOperation.getText(); 
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
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalDomainmodel.g:275:1: ruleCompareOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:281:2: ( (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' ) )
            // InternalDomainmodel.g:282:2: (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' )
            {
            // InternalDomainmodel.g:282:2: (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 25:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:283:3: kw= '>'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:289:3: kw= '<'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:295:3: kw= '='
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOperationAccess().getEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:301:3: kw= '>='
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:307:3: kw= '<='
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOperationAccess().getLessThanSignEqualsSignKeyword_4());
                    		

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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleVariable"
    // InternalDomainmodel.g:316:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // InternalDomainmodel.g:316:48: (iv_ruleVariable= ruleVariable EOF )
            // InternalDomainmodel.g:317:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalDomainmodel.g:323:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_1=null;
        Token this_REAL_2=null;
        AntlrDatatypeRuleToken this_MyID_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:329:2: ( (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL ) )
            // InternalDomainmodel.g:330:2: (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL )
            {
            // InternalDomainmodel.g:330:2: (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 33:
                {
                alt6=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt6=2;
                }
                break;
            case RULE_REAL:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDomainmodel.g:331:3: this_MyID_0= ruleMyID
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getMyIDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyID_0=ruleMyID();

                    state._fsp--;


                    			current.merge(this_MyID_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:342:3: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_2); 

                    			current.merge(this_DIGIT_1);
                    		

                    			newLeafNode(this_DIGIT_1, grammarAccess.getVariableAccess().getDIGITTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:350:3: this_REAL_2= RULE_REAL
                    {
                    this_REAL_2=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    			current.merge(this_REAL_2);
                    		

                    			newLeafNode(this_REAL_2, grammarAccess.getVariableAccess().getREALTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleMathFormula"
    // InternalDomainmodel.g:361:1: entryRuleMathFormula returns [String current=null] : iv_ruleMathFormula= ruleMathFormula EOF ;
    public final String entryRuleMathFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMathFormula = null;


        try {
            // InternalDomainmodel.g:361:51: (iv_ruleMathFormula= ruleMathFormula EOF )
            // InternalDomainmodel.g:362:2: iv_ruleMathFormula= ruleMathFormula EOF
            {
             newCompositeNode(grammarAccess.getMathFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathFormula=ruleMathFormula();

            state._fsp--;

             current =iv_ruleMathFormula.getText(); 
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
    // $ANTLR end "entryRuleMathFormula"


    // $ANTLR start "ruleMathFormula"
    // InternalDomainmodel.g:368:1: ruleMathFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleMathFormula() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Variable_1 = null;

        AntlrDatatypeRuleToken this_MathOperation_2 = null;

        AntlrDatatypeRuleToken this_Variable_3 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:374:2: ( ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? ) )
            // InternalDomainmodel.g:375:2: ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? )
            {
            // InternalDomainmodel.g:375:2: ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? )
            // InternalDomainmodel.g:376:3: (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )?
            {
            // InternalDomainmodel.g:376:3: (kw= '(' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:377:4: kw= '('
                    {
                    kw=(Token)match(input,26,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMathFormulaAccess().getLeftParenthesisKeyword_0());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getMathFormulaAccess().getVariableParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            this_Variable_1=ruleVariable();

            state._fsp--;


            			current.merge(this_Variable_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDomainmodel.g:393:3: (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=15 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainmodel.g:394:4: this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable
            	    {

            	    				newCompositeNode(grammarAccess.getMathFormulaAccess().getMathOperationParserRuleCall_2_0());
            	    			
            	    pushFollow(FOLLOW_4);
            	    this_MathOperation_2=ruleMathOperation();

            	    state._fsp--;


            	    				current.merge(this_MathOperation_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getMathFormulaAccess().getVariableParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_5);
            	    this_Variable_3=ruleVariable();

            	    state._fsp--;


            	    				current.merge(this_Variable_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDomainmodel.g:415:3: (kw= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomainmodel.g:416:4: kw= ')'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMathFormulaAccess().getRightParenthesisKeyword_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleMathFormula"


    // $ANTLR start "entryRuleCompareFormula"
    // InternalDomainmodel.g:426:1: entryRuleCompareFormula returns [String current=null] : iv_ruleCompareFormula= ruleCompareFormula EOF ;
    public final String entryRuleCompareFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareFormula = null;


        try {
            // InternalDomainmodel.g:426:54: (iv_ruleCompareFormula= ruleCompareFormula EOF )
            // InternalDomainmodel.g:427:2: iv_ruleCompareFormula= ruleCompareFormula EOF
            {
             newCompositeNode(grammarAccess.getCompareFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareFormula=ruleCompareFormula();

            state._fsp--;

             current =iv_ruleCompareFormula.getText(); 
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
    // $ANTLR end "entryRuleCompareFormula"


    // $ANTLR start "ruleCompareFormula"
    // InternalDomainmodel.g:433:1: ruleCompareFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) ) ;
    public final AntlrDatatypeRuleToken ruleCompareFormula() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_5=null;
        AntlrDatatypeRuleToken this_MathFormula_0 = null;

        AntlrDatatypeRuleToken this_CompareOperation_1 = null;

        AntlrDatatypeRuleToken this_MathFormula_2 = null;

        AntlrDatatypeRuleToken this_MathFormula_3 = null;

        AntlrDatatypeRuleToken this_CompareOperation_4 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:439:2: ( ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) ) )
            // InternalDomainmodel.g:440:2: ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) )
            {
            // InternalDomainmodel.g:440:2: ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:441:3: (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula )
                    {
                    // InternalDomainmodel.g:441:3: (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula )
                    // InternalDomainmodel.g:442:4: this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula
                    {

                    				newCompositeNode(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_MathFormula_0=ruleMathFormula();

                    state._fsp--;


                    				current.merge(this_MathFormula_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getCompareFormulaAccess().getCompareOperationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_CompareOperation_1=ruleCompareOperation();

                    state._fsp--;


                    				current.merge(this_CompareOperation_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_MathFormula_2=ruleMathFormula();

                    state._fsp--;


                    				current.merge(this_MathFormula_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:474:3: (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING )
                    {
                    // InternalDomainmodel.g:474:3: (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING )
                    // InternalDomainmodel.g:475:4: this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING
                    {

                    				newCompositeNode(grammarAccess.getCompareFormulaAccess().getMathFormulaParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_MathFormula_3=ruleMathFormula();

                    state._fsp--;


                    				current.merge(this_MathFormula_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getCompareFormulaAccess().getCompareOperationParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_CompareOperation_4=ruleCompareOperation();

                    state._fsp--;


                    				current.merge(this_CompareOperation_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				current.merge(this_STRING_5);
                    			

                    				newLeafNode(this_STRING_5, grammarAccess.getCompareFormulaAccess().getSTRINGTerminalRuleCall_1_2());
                    			

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
    // $ANTLR end "ruleCompareFormula"


    // $ANTLR start "entryRuleMethod"
    // InternalDomainmodel.g:507:1: entryRuleMethod returns [String current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final String entryRuleMethod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethod = null;


        try {
            // InternalDomainmodel.g:507:46: (iv_ruleMethod= ruleMethod EOF )
            // InternalDomainmodel.g:508:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod.getText(); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalDomainmodel.g:514:1: ruleMethod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' (kw= 'onlyDigit' | kw= 'onlyLetter' | kw= 'length' | kw= 'contain' ) (kw= '(' (this_STRING_6= RULE_STRING )* kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleMethod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_6=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:520:2: ( (kw= '.' (kw= 'onlyDigit' | kw= 'onlyLetter' | kw= 'length' | kw= 'contain' ) (kw= '(' (this_STRING_6= RULE_STRING )* kw= ')' )? ) )
            // InternalDomainmodel.g:521:2: (kw= '.' (kw= 'onlyDigit' | kw= 'onlyLetter' | kw= 'length' | kw= 'contain' ) (kw= '(' (this_STRING_6= RULE_STRING )* kw= ')' )? )
            {
            // InternalDomainmodel.g:521:2: (kw= '.' (kw= 'onlyDigit' | kw= 'onlyLetter' | kw= 'length' | kw= 'contain' ) (kw= '(' (this_STRING_6= RULE_STRING )* kw= ')' )? )
            // InternalDomainmodel.g:522:3: kw= '.' (kw= 'onlyDigit' | kw= 'onlyLetter' | kw= 'length' | kw= 'contain' ) (kw= '(' (this_STRING_6= RULE_STRING )* kw= ')' )?
            {
            kw=(Token)match(input,28,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMethodAccess().getFullStopKeyword_0());
            		
            // InternalDomainmodel.g:527:3: (kw= 'onlyDigit' | kw= 'onlyLetter' | kw= 'length' | kw= 'contain' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDomainmodel.g:528:4: kw= 'onlyDigit'
                    {
                    kw=(Token)match(input,29,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMethodAccess().getOnlyDigitKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:534:4: kw= 'onlyLetter'
                    {
                    kw=(Token)match(input,30,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMethodAccess().getOnlyLetterKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:540:4: kw= 'length'
                    {
                    kw=(Token)match(input,31,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMethodAccess().getLengthKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:546:4: kw= 'contain'
                    {
                    kw=(Token)match(input,32,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMethodAccess().getContainKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:552:3: (kw= '(' (this_STRING_6= RULE_STRING )* kw= ')' )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalDomainmodel.g:553:4: kw= '(' (this_STRING_6= RULE_STRING )* kw= ')'
                    {
                    kw=(Token)match(input,26,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalDomainmodel.g:558:4: (this_STRING_6= RULE_STRING )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_STRING) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDomainmodel.g:559:5: this_STRING_6= RULE_STRING
                    	    {
                    	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    					current.merge(this_STRING_6);
                    	    				

                    	    					newLeafNode(this_STRING_6, grammarAccess.getMethodAccess().getSTRINGTerminalRuleCall_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    kw=(Token)match(input,27,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMethodAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMyID"
    // InternalDomainmodel.g:577:1: entryRuleMyID returns [String current=null] : iv_ruleMyID= ruleMyID EOF ;
    public final String entryRuleMyID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMyID = null;


        try {
            // InternalDomainmodel.g:577:44: (iv_ruleMyID= ruleMyID EOF )
            // InternalDomainmodel.g:578:2: iv_ruleMyID= ruleMyID EOF
            {
             newCompositeNode(grammarAccess.getMyIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyID=ruleMyID();

            state._fsp--;

             current =iv_ruleMyID.getText(); 
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
    // $ANTLR end "entryRuleMyID"


    // $ANTLR start "ruleMyID"
    // InternalDomainmodel.g:584:1: ruleMyID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | (kw= '!' this_ID_2= RULE_ID ) ) (this_Method_3= ruleMethod )* ) ;
    public final AntlrDatatypeRuleToken ruleMyID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Method_3 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:590:2: ( ( (this_ID_0= RULE_ID | (kw= '!' this_ID_2= RULE_ID ) ) (this_Method_3= ruleMethod )* ) )
            // InternalDomainmodel.g:591:2: ( (this_ID_0= RULE_ID | (kw= '!' this_ID_2= RULE_ID ) ) (this_Method_3= ruleMethod )* )
            {
            // InternalDomainmodel.g:591:2: ( (this_ID_0= RULE_ID | (kw= '!' this_ID_2= RULE_ID ) ) (this_Method_3= ruleMethod )* )
            // InternalDomainmodel.g:592:3: (this_ID_0= RULE_ID | (kw= '!' this_ID_2= RULE_ID ) ) (this_Method_3= ruleMethod )*
            {
            // InternalDomainmodel.g:592:3: (this_ID_0= RULE_ID | (kw= '!' this_ID_2= RULE_ID ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomainmodel.g:593:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getMyIDAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:601:4: (kw= '!' this_ID_2= RULE_ID )
                    {
                    // InternalDomainmodel.g:601:4: (kw= '!' this_ID_2= RULE_ID )
                    // InternalDomainmodel.g:602:5: kw= '!' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,33,FOLLOW_13); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getMyIDAccess().getExclamationMarkKeyword_0_1_0());
                    				
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_12); 

                    					current.merge(this_ID_2);
                    				

                    					newLeafNode(this_ID_2, grammarAccess.getMyIDAccess().getIDTerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalDomainmodel.g:616:3: (this_Method_3= ruleMethod )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDomainmodel.g:617:4: this_Method_3= ruleMethod
            	    {

            	    				newCompositeNode(grammarAccess.getMyIDAccess().getMethodParserRuleCall_1());
            	    			
            	    pushFollow(FOLLOW_12);
            	    this_Method_3=ruleMethod();

            	    state._fsp--;


            	    				current.merge(this_Method_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleMyID"


    // $ANTLR start "entryRuleTestcaseElement"
    // InternalDomainmodel.g:632:1: entryRuleTestcaseElement returns [String current=null] : iv_ruleTestcaseElement= ruleTestcaseElement EOF ;
    public final String entryRuleTestcaseElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestcaseElement = null;


        try {
            // InternalDomainmodel.g:632:55: (iv_ruleTestcaseElement= ruleTestcaseElement EOF )
            // InternalDomainmodel.g:633:2: iv_ruleTestcaseElement= ruleTestcaseElement EOF
            {
             newCompositeNode(grammarAccess.getTestcaseElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestcaseElement=ruleTestcaseElement();

            state._fsp--;

             current =iv_ruleTestcaseElement.getText(); 
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
    // $ANTLR end "entryRuleTestcaseElement"


    // $ANTLR start "ruleTestcaseElement"
    // InternalDomainmodel.g:639:1: ruleTestcaseElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula ) ;
    public final AntlrDatatypeRuleToken ruleTestcaseElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CompareFormula_0 = null;

        AntlrDatatypeRuleToken this_MathFormula_1 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:645:2: ( (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula ) )
            // InternalDomainmodel.g:646:2: (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula )
            {
            // InternalDomainmodel.g:646:2: (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalDomainmodel.g:647:3: this_CompareFormula_0= ruleCompareFormula
                    {

                    			newCompositeNode(grammarAccess.getTestcaseElementAccess().getCompareFormulaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompareFormula_0=ruleCompareFormula();

                    state._fsp--;


                    			current.merge(this_CompareFormula_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:658:3: this_MathFormula_1= ruleMathFormula
                    {

                    			newCompositeNode(grammarAccess.getTestcaseElementAccess().getMathFormulaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MathFormula_1=ruleMathFormula();

                    state._fsp--;


                    			current.merge(this_MathFormula_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleTestcaseElement"


    // $ANTLR start "entryRuleEnum"
    // InternalDomainmodel.g:672:1: entryRuleEnum returns [String current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final String entryRuleEnum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnum = null;


        try {
            // InternalDomainmodel.g:672:44: (iv_ruleEnum= ruleEnum EOF )
            // InternalDomainmodel.g:673:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum.getText(); 
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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalDomainmodel.g:679:1: ruleEnum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) kw= '{' this_EnumOptions_7= ruleEnumOptions kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleEnum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_EnumOptions_7 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:685:2: ( (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) kw= '{' this_EnumOptions_7= ruleEnumOptions kw= '}' ) )
            // InternalDomainmodel.g:686:2: (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) kw= '{' this_EnumOptions_7= ruleEnumOptions kw= '}' )
            {
            // InternalDomainmodel.g:686:2: (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) kw= '{' this_EnumOptions_7= ruleEnumOptions kw= '}' )
            // InternalDomainmodel.g:687:3: kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) kw= '{' this_EnumOptions_7= ruleEnumOptions kw= '}'
            {
            kw=(Token)match(input,34,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalDomainmodel.g:692:3: (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' )
            int alt17=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case 35:
                {
                alt17=2;
                }
                break;
            case 36:
                {
                alt17=3;
                }
                break;
            case 37:
                {
                alt17=4;
                }
                break;
            case 38:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDomainmodel.g:693:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_15); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getEnumAccess().getIDTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:701:4: kw= 'Int'
                    {
                    kw=(Token)match(input,35,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEnumAccess().getIntKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:707:4: kw= 'Real'
                    {
                    kw=(Token)match(input,36,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEnumAccess().getRealKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:713:4: kw= 'Bool'
                    {
                    kw=(Token)match(input,37,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEnumAccess().getBoolKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:719:4: kw= 'String'
                    {
                    kw=(Token)match(input,38,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEnumAccess().getStringKeyword_1_4());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,39,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		

            			newCompositeNode(grammarAccess.getEnumAccess().getEnumOptionsParserRuleCall_3());
            		
            pushFollow(FOLLOW_17);
            this_EnumOptions_7=ruleEnumOptions();

            state._fsp--;


            			current.merge(this_EnumOptions_7);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,40,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumOptions"
    // InternalDomainmodel.g:749:1: entryRuleEnumOptions returns [String current=null] : iv_ruleEnumOptions= ruleEnumOptions EOF ;
    public final String entryRuleEnumOptions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumOptions = null;


        try {
            // InternalDomainmodel.g:749:51: (iv_ruleEnumOptions= ruleEnumOptions EOF )
            // InternalDomainmodel.g:750:2: iv_ruleEnumOptions= ruleEnumOptions EOF
            {
             newCompositeNode(grammarAccess.getEnumOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumOptions=ruleEnumOptions();

            state._fsp--;

             current =iv_ruleEnumOptions.getText(); 
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
    // $ANTLR end "entryRuleEnumOptions"


    // $ANTLR start "ruleEnumOptions"
    // InternalDomainmodel.g:756:1: ruleEnumOptions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleEnumOptions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:762:2: ( (this_ID_0= RULE_ID )* )
            // InternalDomainmodel.g:763:2: (this_ID_0= RULE_ID )*
            {
            // InternalDomainmodel.g:763:2: (this_ID_0= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDomainmodel.g:764:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getEnumOptionsAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleEnumOptions"


    // $ANTLR start "entryRuleDefine"
    // InternalDomainmodel.g:775:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalDomainmodel.g:775:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalDomainmodel.g:776:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalDomainmodel.g:782:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:788:2: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' ) )
            // InternalDomainmodel.g:789:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' )
            {
            // InternalDomainmodel.g:789:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' )
            // InternalDomainmodel.g:790:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDefineKeyword_0());
            		
            // InternalDomainmodel.g:794:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:795:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:795:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:796:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDefineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomainmodel.g:816:3: (otherlv_3= '(' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDomainmodel.g:817:4: otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_3());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:822:3: ( ruleCompareFormula | ruleMyID )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalDomainmodel.g:823:4: ruleCompareFormula
                    {

                    				newCompositeNode(grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_4_0());
                    			
                    pushFollow(FOLLOW_19);
                    ruleCompareFormula();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:831:4: ruleMyID
                    {

                    				newCompositeNode(grammarAccess.getDefineAccess().getMyIDParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_19);
                    ruleMyID();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:839:3: (otherlv_6= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDomainmodel.g:840:4: otherlv_6= ')'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefineAccess().getRightParenthesisKeyword_5());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:845:3: ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=13 && LA25_0<=14)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDomainmodel.g:846:4: ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )?
            	    {

            	    				newCompositeNode(grammarAccess.getDefineAccess().getConditionOperationParserRuleCall_6_0());
            	    			
            	    pushFollow(FOLLOW_7);
            	    ruleConditionOperation();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalDomainmodel.g:853:4: (otherlv_8= '(' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==26) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalDomainmodel.g:854:5: otherlv_8= '('
            	            {
            	            otherlv_8=(Token)match(input,26,FOLLOW_7); 

            	            					newLeafNode(otherlv_8, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_6_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDomainmodel.g:859:4: ( ruleCompareFormula | ruleMyID )
            	    int alt23=2;
            	    alt23 = dfa23.predict(input);
            	    switch (alt23) {
            	        case 1 :
            	            // InternalDomainmodel.g:860:5: ruleCompareFormula
            	            {

            	            					newCompositeNode(grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_6_2_0());
            	            				
            	            pushFollow(FOLLOW_19);
            	            ruleCompareFormula();

            	            state._fsp--;


            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDomainmodel.g:868:5: ruleMyID
            	            {

            	            					newCompositeNode(grammarAccess.getDefineAccess().getMyIDParserRuleCall_6_2_1());
            	            				
            	            pushFollow(FOLLOW_19);
            	            ruleMyID();

            	            state._fsp--;


            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDomainmodel.g:876:4: (otherlv_11= ')' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==27) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalDomainmodel.g:877:5: otherlv_11= ')'
            	            {
            	            otherlv_11=(Token)match(input,27,FOLLOW_20); 

            	            					newLeafNode(otherlv_11, grammarAccess.getDefineAccess().getRightParenthesisKeyword_6_3());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_12=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDefineAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRulePrecondition"
    // InternalDomainmodel.g:891:1: entryRulePrecondition returns [String current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final String entryRulePrecondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrecondition = null;


        try {
            // InternalDomainmodel.g:891:52: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalDomainmodel.g:892:2: iv_rulePrecondition= rulePrecondition EOF
            {
             newCompositeNode(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;

             current =iv_rulePrecondition.getText(); 
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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalDomainmodel.g:898:1: rulePrecondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulePrecondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CompareFormula_2 = null;

        AntlrDatatypeRuleToken this_ConditionOperation_3 = null;

        AntlrDatatypeRuleToken this_CompareFormula_4 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:904:2: ( (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' ) )
            // InternalDomainmodel.g:905:2: (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' )
            {
            // InternalDomainmodel.g:905:2: (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' )
            // InternalDomainmodel.g:906:3: kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}'
            {
            kw=(Token)match(input,42,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPreconditionAccess().getPreconditionKeyword_0());
            		
            kw=(Token)match(input,39,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPreconditionAccess().getLeftCurlyBracketKeyword_1());
            		

            			newCompositeNode(grammarAccess.getPreconditionAccess().getCompareFormulaParserRuleCall_2());
            		
            pushFollow(FOLLOW_20);
            this_CompareFormula_2=ruleCompareFormula();

            state._fsp--;


            			current.merge(this_CompareFormula_2);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDomainmodel.g:926:3: (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=13 && LA26_0<=14)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDomainmodel.g:927:4: this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula
            	    {

            	    				newCompositeNode(grammarAccess.getPreconditionAccess().getConditionOperationParserRuleCall_3_0());
            	    			
            	    pushFollow(FOLLOW_7);
            	    this_ConditionOperation_3=ruleConditionOperation();

            	    state._fsp--;


            	    				current.merge(this_ConditionOperation_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getPreconditionAccess().getCompareFormulaParserRuleCall_3_1());
            	    			
            	    pushFollow(FOLLOW_20);
            	    this_CompareFormula_4=ruleCompareFormula();

            	    state._fsp--;


            	    				current.merge(this_CompareFormula_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            kw=(Token)match(input,40,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPreconditionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRuleExample"
    // InternalDomainmodel.g:957:1: entryRuleExample returns [String current=null] : iv_ruleExample= ruleExample EOF ;
    public final String entryRuleExample() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExample = null;


        try {
            // InternalDomainmodel.g:957:47: (iv_ruleExample= ruleExample EOF )
            // InternalDomainmodel.g:958:2: iv_ruleExample= ruleExample EOF
            {
             newCompositeNode(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExample=ruleExample();

            state._fsp--;

             current =iv_ruleExample.getText(); 
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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalDomainmodel.g:964:1: ruleExample returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'example' kw= '{' this_Variable_2= ruleVariable kw= '=' this_Variable_4= ruleVariable kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleExample() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Variable_2 = null;

        AntlrDatatypeRuleToken this_Variable_4 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:970:2: ( (kw= 'example' kw= '{' this_Variable_2= ruleVariable kw= '=' this_Variable_4= ruleVariable kw= '}' ) )
            // InternalDomainmodel.g:971:2: (kw= 'example' kw= '{' this_Variable_2= ruleVariable kw= '=' this_Variable_4= ruleVariable kw= '}' )
            {
            // InternalDomainmodel.g:971:2: (kw= 'example' kw= '{' this_Variable_2= ruleVariable kw= '=' this_Variable_4= ruleVariable kw= '}' )
            // InternalDomainmodel.g:972:3: kw= 'example' kw= '{' this_Variable_2= ruleVariable kw= '=' this_Variable_4= ruleVariable kw= '}'
            {
            kw=(Token)match(input,43,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExampleAccess().getExampleKeyword_0());
            		
            kw=(Token)match(input,39,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExampleAccess().getLeftCurlyBracketKeyword_1());
            		

            			newCompositeNode(grammarAccess.getExampleAccess().getVariableParserRuleCall_2());
            		
            pushFollow(FOLLOW_21);
            this_Variable_2=ruleVariable();

            state._fsp--;


            			current.merge(this_Variable_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,23,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExampleAccess().getEqualsSignKeyword_3());
            		

            			newCompositeNode(grammarAccess.getExampleAccess().getVariableParserRuleCall_4());
            		
            pushFollow(FOLLOW_17);
            this_Variable_4=ruleVariable();

            state._fsp--;


            			current.merge(this_Variable_4);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,40,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExampleAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleLimit"
    // InternalDomainmodel.g:1016:1: entryRuleLimit returns [String current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final String entryRuleLimit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLimit = null;


        try {
            // InternalDomainmodel.g:1016:45: (iv_ruleLimit= ruleLimit EOF )
            // InternalDomainmodel.g:1017:2: iv_ruleLimit= ruleLimit EOF
            {
             newCompositeNode(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;

             current =iv_ruleLimit.getText(); 
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
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalDomainmodel.g:1023:1: ruleLimit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'limit' this_DIGIT_1= RULE_DIGIT ) ;
    public final AntlrDatatypeRuleToken ruleLimit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DIGIT_1=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1029:2: ( (kw= 'limit' this_DIGIT_1= RULE_DIGIT ) )
            // InternalDomainmodel.g:1030:2: (kw= 'limit' this_DIGIT_1= RULE_DIGIT )
            {
            // InternalDomainmodel.g:1030:2: (kw= 'limit' this_DIGIT_1= RULE_DIGIT )
            // InternalDomainmodel.g:1031:3: kw= 'limit' this_DIGIT_1= RULE_DIGIT
            {
            kw=(Token)match(input,44,FOLLOW_22); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLimitAccess().getLimitKeyword_0());
            		
            this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_2); 

            			current.merge(this_DIGIT_1);
            		

            			newLeafNode(this_DIGIT_1, grammarAccess.getLimitAccess().getDIGITTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleTestCondition"
    // InternalDomainmodel.g:1047:1: entryRuleTestCondition returns [String current=null] : iv_ruleTestCondition= ruleTestCondition EOF ;
    public final String entryRuleTestCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestCondition = null;


        try {
            // InternalDomainmodel.g:1047:53: (iv_ruleTestCondition= ruleTestCondition EOF )
            // InternalDomainmodel.g:1048:2: iv_ruleTestCondition= ruleTestCondition EOF
            {
             newCompositeNode(grammarAccess.getTestConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestCondition=ruleTestCondition();

            state._fsp--;

             current =iv_ruleTestCondition.getText(); 
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
    // $ANTLR end "entryRuleTestCondition"


    // $ANTLR start "ruleTestCondition"
    // InternalDomainmodel.g:1054:1: ruleTestCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? ) ;
    public final AntlrDatatypeRuleToken ruleTestCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TestcaseElement_2 = null;

        AntlrDatatypeRuleToken this_ConditionOperation_5 = null;

        AntlrDatatypeRuleToken this_TestcaseElement_7 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:1060:2: ( (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? ) )
            // InternalDomainmodel.g:1061:2: (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? )
            {
            // InternalDomainmodel.g:1061:2: (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? )
            // InternalDomainmodel.g:1062:3: this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )?
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getTestConditionAccess().getSTRINGTerminalRuleCall_0());
            		
            // InternalDomainmodel.g:1069:3: ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_DIGIT && LA34_0<=RULE_REAL)||LA34_0==RULE_ID||LA34_0==26||LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDomainmodel.g:1070:4: (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )?
                    {
                    // InternalDomainmodel.g:1070:4: (kw= '(' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==26) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalDomainmodel.g:1071:5: kw= '('
                            {
                            kw=(Token)match(input,26,FOLLOW_7); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_0());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getTestConditionAccess().getTestcaseElementParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_24);
                    this_TestcaseElement_2=ruleTestcaseElement();

                    state._fsp--;


                    				current.merge(this_TestcaseElement_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDomainmodel.g:1087:4: (kw= ')' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==27) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalDomainmodel.g:1088:5: kw= ')'
                            {
                            kw=(Token)match(input,27,FOLLOW_24); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_2());
                            				

                            }
                            break;

                    }

                    // InternalDomainmodel.g:1094:4: (kw= '(' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==26) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalDomainmodel.g:1095:5: kw= '('
                            {
                            kw=(Token)match(input,26,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_3());
                            				

                            }
                            break;

                    }

                    // InternalDomainmodel.g:1101:4: (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=13 && LA32_0<=14)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalDomainmodel.g:1102:5: this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )?
                    	    {

                    	    					newCompositeNode(grammarAccess.getTestConditionAccess().getConditionOperationParserRuleCall_1_4_0());
                    	    				
                    	    pushFollow(FOLLOW_7);
                    	    this_ConditionOperation_5=ruleConditionOperation();

                    	    state._fsp--;


                    	    					current.merge(this_ConditionOperation_5);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalDomainmodel.g:1112:5: (kw= '(' )?
                    	    int alt30=2;
                    	    int LA30_0 = input.LA(1);

                    	    if ( (LA30_0==26) ) {
                    	        alt30=1;
                    	    }
                    	    switch (alt30) {
                    	        case 1 :
                    	            // InternalDomainmodel.g:1113:6: kw= '('
                    	            {
                    	            kw=(Token)match(input,26,FOLLOW_7); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_4_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    					newCompositeNode(grammarAccess.getTestConditionAccess().getTestcaseElementParserRuleCall_1_4_2());
                    	    				
                    	    pushFollow(FOLLOW_25);
                    	    this_TestcaseElement_7=ruleTestcaseElement();

                    	    state._fsp--;


                    	    					current.merge(this_TestcaseElement_7);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalDomainmodel.g:1129:5: (kw= ')' )?
                    	    int alt31=2;
                    	    int LA31_0 = input.LA(1);

                    	    if ( (LA31_0==27) ) {
                    	        alt31=1;
                    	    }
                    	    switch (alt31) {
                    	        case 1 :
                    	            // InternalDomainmodel.g:1130:6: kw= ')'
                    	            {
                    	            kw=(Token)match(input,27,FOLLOW_25); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_4_3());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // InternalDomainmodel.g:1137:4: (kw= ')' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==27) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalDomainmodel.g:1138:5: kw= ')'
                            {
                            kw=(Token)match(input,27,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_5());
                            				

                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTestCondition"


    // $ANTLR start "entryRuleTestcase"
    // InternalDomainmodel.g:1149:1: entryRuleTestcase returns [String current=null] : iv_ruleTestcase= ruleTestcase EOF ;
    public final String entryRuleTestcase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestcase = null;


        try {
            // InternalDomainmodel.g:1149:48: (iv_ruleTestcase= ruleTestcase EOF )
            // InternalDomainmodel.g:1150:2: iv_ruleTestcase= ruleTestcase EOF
            {
             newCompositeNode(grammarAccess.getTestcaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestcase=ruleTestcase();

            state._fsp--;

             current =iv_ruleTestcase.getText(); 
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
    // $ANTLR end "entryRuleTestcase"


    // $ANTLR start "ruleTestcase"
    // InternalDomainmodel.g:1156:1: ruleTestcase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleTestcase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TestCondition_2 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:1162:2: ( (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' ) )
            // InternalDomainmodel.g:1163:2: (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' )
            {
            // InternalDomainmodel.g:1163:2: (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' )
            // InternalDomainmodel.g:1164:3: kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}'
            {
            kw=(Token)match(input,45,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTestcaseAccess().getTestcaseKeyword_0());
            		
            kw=(Token)match(input,39,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDomainmodel.g:1174:3: (this_TestCondition_2= ruleTestCondition )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_STRING) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDomainmodel.g:1175:4: this_TestCondition_2= ruleTestCondition
            	    {

            	    				newCompositeNode(grammarAccess.getTestcaseAccess().getTestConditionParserRuleCall_2());
            	    			
            	    pushFollow(FOLLOW_26);
            	    this_TestCondition_2=ruleTestCondition();

            	    state._fsp--;


            	    				current.merge(this_TestCondition_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            kw=(Token)match(input,40,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTestcase"


    // $ANTLR start "entryRuleDatatype"
    // InternalDomainmodel.g:1195:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // InternalDomainmodel.g:1195:48: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalDomainmodel.g:1196:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype.getText(); 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalDomainmodel.g:1202:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1208:2: ( (kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' ) )
            // InternalDomainmodel.g:1209:2: (kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' )
            {
            // InternalDomainmodel.g:1209:2: (kw= 'Int' | kw= 'Real' | kw= 'Bool' | kw= 'String' )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt36=1;
                }
                break;
            case 36:
                {
                alt36=2;
                }
                break;
            case 37:
                {
                alt36=3;
                }
                break;
            case 38:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalDomainmodel.g:1210:3: kw= 'Int'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1216:3: kw= 'Real'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getRealKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:1222:3: kw= 'Bool'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getBoolKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:1228:3: kw= 'String'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getStringKeyword_3());
                    		

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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleFunction"
    // InternalDomainmodel.g:1237:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalDomainmodel.g:1237:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalDomainmodel.g:1238:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalDomainmodel.g:1244:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1250:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' ) )
            // InternalDomainmodel.g:1251:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' )
            {
            // InternalDomainmodel.g:1251:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' )
            // InternalDomainmodel.g:1252:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalDomainmodel.g:1256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:1257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:1257:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:1258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDomainmodel.g:1278:3: ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=35 && LA38_0<=38)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDomainmodel.g:1279:4: ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )*
            	    {

            	    				newCompositeNode(grammarAccess.getFunctionAccess().getDatatypeParserRuleCall_3_0());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleDatatype();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalDomainmodel.g:1286:4: ( (lv_name_4_0= RULE_ID ) )
            	    // InternalDomainmodel.g:1287:5: (lv_name_4_0= RULE_ID )
            	    {
            	    // InternalDomainmodel.g:1287:5: (lv_name_4_0= RULE_ID )
            	    // InternalDomainmodel.g:1288:6: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    						newLeafNode(lv_name_4_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    // InternalDomainmodel.g:1304:4: (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==47) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // InternalDomainmodel.g:1305:5: otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,47,FOLLOW_30); 

            	    	    					newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getCommaKeyword_3_2_0());
            	    	    				

            	    	    					newCompositeNode(grammarAccess.getFunctionAccess().getDatatypeParserRuleCall_3_2_1());
            	    	    				
            	    	    pushFollow(FOLLOW_13);
            	    	    ruleDatatype();

            	    	    state._fsp--;


            	    	    					afterParserOrEnumRuleCall();
            	    	    				
            	    	    // InternalDomainmodel.g:1316:5: ( (lv_name_7_0= RULE_ID ) )
            	    	    // InternalDomainmodel.g:1317:6: (lv_name_7_0= RULE_ID )
            	    	    {
            	    	    // InternalDomainmodel.g:1317:6: (lv_name_7_0= RULE_ID )
            	    	    // InternalDomainmodel.g:1318:7: lv_name_7_0= RULE_ID
            	    	    {
            	    	    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    	    							newLeafNode(lv_name_7_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_3_2_2_0());
            	    	    						

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getFunctionRule());
            	    	    							}
            	    	    							setWithLastConsumed(
            	    	    								current,
            	    	    								"name",
            	    	    								lv_name_7_0,
            	    	    								"org.eclipse.xtext.common.Terminals.ID");
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleRun"
    // InternalDomainmodel.g:1344:1: entryRuleRun returns [String current=null] : iv_ruleRun= ruleRun EOF ;
    public final String entryRuleRun() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRun = null;


        try {
            // InternalDomainmodel.g:1344:43: (iv_ruleRun= ruleRun EOF )
            // InternalDomainmodel.g:1345:2: iv_ruleRun= ruleRun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRun=ruleRun();

            state._fsp--;

             current =iv_ruleRun.getText(); 
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
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalDomainmodel.g:1351:1: ruleRun returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'run' ;
    public final AntlrDatatypeRuleToken ruleRun() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1357:2: (kw= 'run' )
            // InternalDomainmodel.g:1358:2: kw= 'run'
            {
            kw=(Token)match(input,48,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRunAccess().getRunKeyword());
            	

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
    // $ANTLR end "ruleRun"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\52\uffff";
    static final String dfa_2s = "\2\4\1\17\1\7\2\17\1\35\6\4\1\25\5\4\6\17\1\7\2\17\2\uffff\1\6\1\35\1\17\1\6\5\17\2\6\1\17";
    static final String dfa_3s = "\2\41\1\34\1\7\2\33\1\40\6\41\1\31\5\41\6\34\1\7\2\33\2\uffff\1\33\1\40\1\34\1\33\5\34\2\33\1\34";
    static final String dfa_4s = "\34\uffff\1\2\1\1\14\uffff";
    static final String dfa_5s = "\52\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\5\1\uffff\1\2\22\uffff\1\1\6\uffff\1\3",
            "\1\4\1\5\1\uffff\1\2\31\uffff\1\3",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15\1\6",
            "\1\23",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "\1\24\1\25\1\26\1\27",
            "\1\32\1\33\1\uffff\1\30\31\uffff\1\31",
            "\1\32\1\33\1\uffff\1\30\31\uffff\1\31",
            "\1\32\1\33\1\uffff\1\30\31\uffff\1\31",
            "\1\32\1\33\1\uffff\1\30\31\uffff\1\31",
            "\1\32\1\33\1\uffff\1\30\31\uffff\1\31",
            "\1\32\1\33\1\uffff\1\30\31\uffff\1\31",
            "\1\16\1\17\1\20\1\21\1\22",
            "\2\35\1\34\1\35\22\uffff\1\35\6\uffff\1\35",
            "\2\35\1\34\1\35\22\uffff\1\35\6\uffff\1\35",
            "\2\35\1\34\1\35\22\uffff\1\35\6\uffff\1\35",
            "\2\35\1\34\1\35\22\uffff\1\35\6\uffff\1\35",
            "\2\35\1\34\1\35\22\uffff\1\35\6\uffff\1\35",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15\1\6",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\36\1\15\1\6",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\36\1\15\1\6",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\36\1\15\1\6",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\36\1\15\1\6",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15\1\37",
            "\1\40",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "",
            "",
            "\1\41\24\uffff\1\42",
            "\1\43\1\44\1\45\1\46",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15\1\37",
            "\1\41\24\uffff\1\42",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15\1\6",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\47\1\15\1\37",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\47\1\15\1\37",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\47\1\15\1\37",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\47\1\15\1\37",
            "\1\50\24\uffff\1\51",
            "\1\50\24\uffff\1\51",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15\1\37"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "440:2: ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) )";
        }
    }
    static final String dfa_7s = "\5\uffff";
    static final String dfa_8s = "\2\2\3\uffff";
    static final String dfa_9s = "\2\6\1\uffff\1\4\1\uffff";
    static final String dfa_10s = "\2\50\1\uffff\1\50\1\uffff";
    static final String dfa_11s = "\2\uffff\1\2\1\uffff\1\1";
    static final String dfa_12s = "\5\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\6\uffff\15\2\1\1\2\2\13\uffff\1\2",
            "\1\3\6\uffff\2\2\14\uffff\1\4\14\uffff\1\2",
            "",
            "\2\2\1\3\1\2\22\uffff\1\2\1\4\5\uffff\1\2\6\uffff\1\2",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "552:3: (kw= '(' (this_STRING_6= RULE_STRING )* kw= ')' )?";
        }
    }
    static final String dfa_14s = "\47\uffff";
    static final String dfa_15s = "\2\uffff\1\16\1\uffff\2\16\7\uffff\1\16\2\uffff\6\16\1\uffff\3\16\1\uffff\2\16\1\uffff\6\16\1\uffff\2\16";
    static final String dfa_16s = "\2\4\1\6\1\7\2\6\1\35\6\4\1\6\2\uffff\6\6\1\7\3\6\1\35\2\6\1\4\6\6\1\4\2\6";
    static final String dfa_17s = "\2\41\1\50\1\7\2\50\1\40\6\41\1\50\2\uffff\6\50\1\7\3\50\1\40\14\50";
    static final String dfa_18s = "\16\uffff\1\2\1\1\27\uffff";
    static final String dfa_19s = "\47\uffff}>";
    static final String[] dfa_20s = {
            "\1\4\1\5\1\uffff\1\2\22\uffff\1\1\6\uffff\1\3",
            "\1\4\1\5\1\uffff\1\2\31\uffff\1\3",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\1\6\13\uffff\1\16",
            "\1\20",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\14\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\14\uffff\1\16",
            "\1\21\1\22\1\23\1\24",
            "\1\27\1\30\1\uffff\1\25\31\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\31\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\31\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\31\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\31\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\31\uffff\1\26",
            "\1\16\6\uffff\2\16\6\uffff\5\17\2\16\14\uffff\1\16",
            "",
            "",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\1\6\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\31\1\15\1\6\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\31\1\15\1\6\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\31\1\15\1\6\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\31\1\15\1\6\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\1\32\13\uffff\1\16",
            "\1\33",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\14\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\14\uffff\1\16",
            "\1\35\6\uffff\2\16\14\uffff\1\34\14\uffff\1\16",
            "\1\36\1\37\1\40\1\41",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\1\32\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\1\6\13\uffff\1\16",
            "\2\16\1\35\1\16\22\uffff\1\16\1\42\5\uffff\1\16\6\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\43\1\15\1\32\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\43\1\15\1\32\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\43\1\15\1\32\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\43\1\15\1\32\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\1\6\13\uffff\1\16",
            "\1\44\6\uffff\2\16\14\uffff\1\45\14\uffff\1\16",
            "\2\16\1\44\1\16\22\uffff\1\16\1\46\5\uffff\1\16\6\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\1\32\13\uffff\1\16",
            "\1\16\6\uffff\2\16\1\7\1\10\1\11\1\12\1\13\1\14\5\17\1\16\1\15\1\32\13\uffff\1\16"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "646:2: (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula )";
        }
    }
    static final String dfa_21s = "\17\uffff";
    static final String dfa_22s = "\1\4\1\uffff\1\15\1\7\1\35\1\15\1\uffff\5\15\2\6\1\15";
    static final String dfa_23s = "\1\41\1\uffff\1\50\1\7\1\40\1\50\1\uffff\5\50\2\33\1\50";
    static final String dfa_24s = "\1\uffff\1\1\4\uffff\1\2\10\uffff";
    static final String dfa_25s = "\17\uffff}>";
    static final String[] dfa_26s = {
            "\2\1\1\uffff\1\2\22\uffff\1\1\6\uffff\1\3",
            "",
            "\2\6\13\1\1\uffff\1\5\1\4\13\uffff\1\6",
            "\1\7",
            "\1\10\1\11\1\12\1\13",
            "\2\6\6\uffff\5\1\16\uffff\1\6",
            "",
            "\2\6\13\1\1\uffff\1\5\1\4\13\uffff\1\6",
            "\2\6\13\1\1\14\1\5\1\4\13\uffff\1\6",
            "\2\6\13\1\1\14\1\5\1\4\13\uffff\1\6",
            "\2\6\13\1\1\14\1\5\1\4\13\uffff\1\6",
            "\2\6\13\1\1\14\1\5\1\4\13\uffff\1\6",
            "\1\15\24\uffff\1\16",
            "\1\15\24\uffff\1\16",
            "\2\6\13\1\1\uffff\1\5\1\4\13\uffff\1\6"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "822:3: ( ruleCompareFormula | ruleMyID )";
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "859:4: ( ruleCompareFormula | ruleMyID )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00017E0400000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000002000000B0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000081F8002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000002040000B0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000007800000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010008006000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000006000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000002040000B2L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000C006002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008006002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000007808000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000807808000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007800000000L});

}