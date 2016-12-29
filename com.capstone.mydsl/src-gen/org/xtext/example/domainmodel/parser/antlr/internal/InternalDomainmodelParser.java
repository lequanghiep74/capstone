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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DIGIT", "RULE_REAL", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'>'", "'<'", "'='", "'>='", "'<='", "'('", "')'", "'!'", "'enum'", "'Int'", "'Real'", "'Bool'", "'{'", "'}'", "'define'", "'precondition'", "'testcase'", "'function'", "','", "'run'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_DIGIT=4;
    public static final int RULE_REAL=5;
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
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==29||(LA1_0>=35 && LA1_0<=38)||LA1_0==40) ) {
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
    // InternalDomainmodel.g:107:1: rulemyDSL returns [EObject current=null] : ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun ) ;
    public final EObject rulemyDSL() throws RecognitionException {
        EObject current = null;

        EObject this_Define_1 = null;

        EObject this_Function_4 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:113:2: ( ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun ) )
            // InternalDomainmodel.g:114:2: ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun )
            {
            // InternalDomainmodel.g:114:2: ( ruleEnum | this_Define_1= ruleDefine | rulePrecondition | ruleTestcase | this_Function_4= ruleFunction | ruleRun )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 38:
                {
                alt2=5;
                }
                break;
            case 40:
                {
                alt2=6;
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
    // InternalDomainmodel.g:168:1: entryRuleConditionOperation returns [String current=null] : iv_ruleConditionOperation= ruleConditionOperation EOF ;
    public final String entryRuleConditionOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionOperation = null;


        try {
            // InternalDomainmodel.g:168:58: (iv_ruleConditionOperation= ruleConditionOperation EOF )
            // InternalDomainmodel.g:169:2: iv_ruleConditionOperation= ruleConditionOperation EOF
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
    // InternalDomainmodel.g:175:1: ruleConditionOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '||' | kw= '&&' ) ;
    public final AntlrDatatypeRuleToken ruleConditionOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:181:2: ( (kw= '||' | kw= '&&' ) )
            // InternalDomainmodel.g:182:2: (kw= '||' | kw= '&&' )
            {
            // InternalDomainmodel.g:182:2: (kw= '||' | kw= '&&' )
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
                    // InternalDomainmodel.g:183:3: kw= '||'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getConditionOperationAccess().getVerticalLineVerticalLineKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:189:3: kw= '&&'
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
    // InternalDomainmodel.g:198:1: entryRuleMathOperation returns [String current=null] : iv_ruleMathOperation= ruleMathOperation EOF ;
    public final String entryRuleMathOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMathOperation = null;


        try {
            // InternalDomainmodel.g:198:53: (iv_ruleMathOperation= ruleMathOperation EOF )
            // InternalDomainmodel.g:199:2: iv_ruleMathOperation= ruleMathOperation EOF
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
    // InternalDomainmodel.g:205:1: ruleMathOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleMathOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:211:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' ) )
            // InternalDomainmodel.g:212:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' )
            {
            // InternalDomainmodel.g:212:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' | kw= '%' )
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
                    // InternalDomainmodel.g:213:3: kw= '+'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:219:3: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:225:3: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:231:3: kw= '/'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:237:3: kw= '^'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathOperationAccess().getCircumflexAccentKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDomainmodel.g:243:3: kw= '%'
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
    // InternalDomainmodel.g:252:1: entryRuleCompareOperation returns [String current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final String entryRuleCompareOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOperation = null;


        try {
            // InternalDomainmodel.g:252:56: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalDomainmodel.g:253:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalDomainmodel.g:259:1: ruleCompareOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:265:2: ( (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' ) )
            // InternalDomainmodel.g:266:2: (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' )
            {
            // InternalDomainmodel.g:266:2: (kw= '>' | kw= '<' | kw= '=' | kw= '>=' | kw= '<=' )
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
                    // InternalDomainmodel.g:267:3: kw= '>'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOperationAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:273:3: kw= '<'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOperationAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:279:3: kw= '='
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOperationAccess().getEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:285:3: kw= '>='
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCompareOperationAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:291:3: kw= '<='
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
    // InternalDomainmodel.g:300:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // InternalDomainmodel.g:300:48: (iv_ruleVariable= ruleVariable EOF )
            // InternalDomainmodel.g:301:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalDomainmodel.g:307:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_1=null;
        Token this_REAL_2=null;
        AntlrDatatypeRuleToken this_MyID_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:313:2: ( (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL ) )
            // InternalDomainmodel.g:314:2: (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL )
            {
            // InternalDomainmodel.g:314:2: (this_MyID_0= ruleMyID | this_DIGIT_1= RULE_DIGIT | this_REAL_2= RULE_REAL )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 16:
            case 28:
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
                    // InternalDomainmodel.g:315:3: this_MyID_0= ruleMyID
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
                    // InternalDomainmodel.g:326:3: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_2); 

                    			current.merge(this_DIGIT_1);
                    		

                    			newLeafNode(this_DIGIT_1, grammarAccess.getVariableAccess().getDIGITTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:334:3: this_REAL_2= RULE_REAL
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
    // InternalDomainmodel.g:345:1: entryRuleMathFormula returns [String current=null] : iv_ruleMathFormula= ruleMathFormula EOF ;
    public final String entryRuleMathFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMathFormula = null;


        try {
            // InternalDomainmodel.g:345:51: (iv_ruleMathFormula= ruleMathFormula EOF )
            // InternalDomainmodel.g:346:2: iv_ruleMathFormula= ruleMathFormula EOF
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
    // InternalDomainmodel.g:352:1: ruleMathFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleMathFormula() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Variable_1 = null;

        AntlrDatatypeRuleToken this_MathOperation_2 = null;

        AntlrDatatypeRuleToken this_Variable_3 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:358:2: ( ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? ) )
            // InternalDomainmodel.g:359:2: ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? )
            {
            // InternalDomainmodel.g:359:2: ( (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )? )
            // InternalDomainmodel.g:360:3: (kw= '(' )? this_Variable_1= ruleVariable (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )* (kw= ')' )?
            {
            // InternalDomainmodel.g:360:3: (kw= '(' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:361:4: kw= '('
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
            		
            // InternalDomainmodel.g:377:3: (this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=15 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainmodel.g:378:4: this_MathOperation_2= ruleMathOperation this_Variable_3= ruleVariable
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

            // InternalDomainmodel.g:399:3: (kw= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomainmodel.g:400:4: kw= ')'
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
    // InternalDomainmodel.g:410:1: entryRuleCompareFormula returns [String current=null] : iv_ruleCompareFormula= ruleCompareFormula EOF ;
    public final String entryRuleCompareFormula() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareFormula = null;


        try {
            // InternalDomainmodel.g:410:54: (iv_ruleCompareFormula= ruleCompareFormula EOF )
            // InternalDomainmodel.g:411:2: iv_ruleCompareFormula= ruleCompareFormula EOF
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
    // InternalDomainmodel.g:417:1: ruleCompareFormula returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) ) ;
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
            // InternalDomainmodel.g:423:2: ( ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) ) )
            // InternalDomainmodel.g:424:2: ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) )
            {
            // InternalDomainmodel.g:424:2: ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:425:3: (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula )
                    {
                    // InternalDomainmodel.g:425:3: (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula )
                    // InternalDomainmodel.g:426:4: this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula
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
                    // InternalDomainmodel.g:458:3: (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING )
                    {
                    // InternalDomainmodel.g:458:3: (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING )
                    // InternalDomainmodel.g:459:4: this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING
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


    // $ANTLR start "entryRuleMyID"
    // InternalDomainmodel.g:491:1: entryRuleMyID returns [String current=null] : iv_ruleMyID= ruleMyID EOF ;
    public final String entryRuleMyID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMyID = null;


        try {
            // InternalDomainmodel.g:491:44: (iv_ruleMyID= ruleMyID EOF )
            // InternalDomainmodel.g:492:2: iv_ruleMyID= ruleMyID EOF
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
    // InternalDomainmodel.g:498:1: ruleMyID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) ) ) ;
    public final AntlrDatatypeRuleToken ruleMyID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:504:2: ( ( (kw= '-' )? (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) ) ) )
            // InternalDomainmodel.g:505:2: ( (kw= '-' )? (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) ) )
            {
            // InternalDomainmodel.g:505:2: ( (kw= '-' )? (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) ) )
            // InternalDomainmodel.g:506:3: (kw= '-' )? (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) )
            {
            // InternalDomainmodel.g:506:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomainmodel.g:507:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMyIDAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:513:3: (this_ID_1= RULE_ID | (kw= '!' this_ID_3= RULE_ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainmodel.g:514:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getMyIDAccess().getIDTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:522:4: (kw= '!' this_ID_3= RULE_ID )
                    {
                    // InternalDomainmodel.g:522:4: (kw= '!' this_ID_3= RULE_ID )
                    // InternalDomainmodel.g:523:5: kw= '!' this_ID_3= RULE_ID
                    {
                    kw=(Token)match(input,28,FOLLOW_10); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getMyIDAccess().getExclamationMarkKeyword_1_1_0());
                    				
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					current.merge(this_ID_3);
                    				

                    					newLeafNode(this_ID_3, grammarAccess.getMyIDAccess().getIDTerminalRuleCall_1_1_1());
                    				

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
    // $ANTLR end "ruleMyID"


    // $ANTLR start "entryRuleTestcaseElement"
    // InternalDomainmodel.g:541:1: entryRuleTestcaseElement returns [String current=null] : iv_ruleTestcaseElement= ruleTestcaseElement EOF ;
    public final String entryRuleTestcaseElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestcaseElement = null;


        try {
            // InternalDomainmodel.g:541:55: (iv_ruleTestcaseElement= ruleTestcaseElement EOF )
            // InternalDomainmodel.g:542:2: iv_ruleTestcaseElement= ruleTestcaseElement EOF
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
    // InternalDomainmodel.g:548:1: ruleTestcaseElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula ) ;
    public final AntlrDatatypeRuleToken ruleTestcaseElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CompareFormula_0 = null;

        AntlrDatatypeRuleToken this_MathFormula_1 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:554:2: ( (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula ) )
            // InternalDomainmodel.g:555:2: (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula )
            {
            // InternalDomainmodel.g:555:2: (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalDomainmodel.g:556:3: this_CompareFormula_0= ruleCompareFormula
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
                    // InternalDomainmodel.g:567:3: this_MathFormula_1= ruleMathFormula
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
    // InternalDomainmodel.g:581:1: entryRuleEnum returns [String current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final String entryRuleEnum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnum = null;


        try {
            // InternalDomainmodel.g:581:44: (iv_ruleEnum= ruleEnum EOF )
            // InternalDomainmodel.g:582:2: iv_ruleEnum= ruleEnum EOF
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
    // InternalDomainmodel.g:588:1: ruleEnum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' ) kw= '{' this_EnumOptions_6= ruleEnumOptions kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleEnum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_EnumOptions_6 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:594:2: ( (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' ) kw= '{' this_EnumOptions_6= ruleEnumOptions kw= '}' ) )
            // InternalDomainmodel.g:595:2: (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' ) kw= '{' this_EnumOptions_6= ruleEnumOptions kw= '}' )
            {
            // InternalDomainmodel.g:595:2: (kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' ) kw= '{' this_EnumOptions_6= ruleEnumOptions kw= '}' )
            // InternalDomainmodel.g:596:3: kw= 'enum' (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' ) kw= '{' this_EnumOptions_6= ruleEnumOptions kw= '}'
            {
            kw=(Token)match(input,29,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalDomainmodel.g:601:3: (this_ID_1= RULE_ID | kw= 'Int' | kw= 'Real' | kw= 'Bool' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDomainmodel.g:602:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getEnumAccess().getIDTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:610:4: kw= 'Int'
                    {
                    kw=(Token)match(input,30,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEnumAccess().getIntKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:616:4: kw= 'Real'
                    {
                    kw=(Token)match(input,31,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEnumAccess().getRealKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:622:4: kw= 'Bool'
                    {
                    kw=(Token)match(input,32,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEnumAccess().getBoolKeyword_1_3());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		

            			newCompositeNode(grammarAccess.getEnumAccess().getEnumOptionsParserRuleCall_3());
            		
            pushFollow(FOLLOW_14);
            this_EnumOptions_6=ruleEnumOptions();

            state._fsp--;


            			current.merge(this_EnumOptions_6);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalDomainmodel.g:652:1: entryRuleEnumOptions returns [String current=null] : iv_ruleEnumOptions= ruleEnumOptions EOF ;
    public final String entryRuleEnumOptions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumOptions = null;


        try {
            // InternalDomainmodel.g:652:51: (iv_ruleEnumOptions= ruleEnumOptions EOF )
            // InternalDomainmodel.g:653:2: iv_ruleEnumOptions= ruleEnumOptions EOF
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
    // InternalDomainmodel.g:659:1: ruleEnumOptions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleEnumOptions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:665:2: ( (this_ID_0= RULE_ID )* )
            // InternalDomainmodel.g:666:2: (this_ID_0= RULE_ID )*
            {
            // InternalDomainmodel.g:666:2: (this_ID_0= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDomainmodel.g:667:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getEnumOptionsAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDomainmodel.g:678:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalDomainmodel.g:678:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalDomainmodel.g:679:2: iv_ruleDefine= ruleDefine EOF
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
    // InternalDomainmodel.g:685:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' ) ;
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
            // InternalDomainmodel.g:691:2: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' ) )
            // InternalDomainmodel.g:692:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' )
            {
            // InternalDomainmodel.g:692:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}' )
            // InternalDomainmodel.g:693:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_6= ')' )? ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDefineKeyword_0());
            		
            // InternalDomainmodel.g:697:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:698:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:698:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:699:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDefineAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomainmodel.g:719:3: (otherlv_3= '(' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomainmodel.g:720:4: otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_3());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:725:3: ( ruleCompareFormula | ruleMyID )
            int alt17=2;
            switch ( input.LA(1) ) {
            case RULE_DIGIT:
            case RULE_REAL:
            case 26:
                {
                alt17=1;
                }
                break;
            case 16:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        {
                        alt17=1;
                        }
                        break;
                    case 27:
                        {
                        int LA17_5 = input.LA(4);

                        if ( ((LA17_5>=21 && LA17_5<=25)) ) {
                            alt17=1;
                        }
                        else if ( ((LA17_5>=13 && LA17_5<=14)||LA17_5==34) ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 13:
                    case 14:
                    case 34:
                        {
                        alt17=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA17_2==28) ) {
                    int LA17_4 = input.LA(3);

                    if ( (LA17_4==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            {
                            alt17=1;
                            }
                            break;
                        case 27:
                            {
                            int LA17_5 = input.LA(5);

                            if ( ((LA17_5>=21 && LA17_5<=25)) ) {
                                alt17=1;
                            }
                            else if ( ((LA17_5>=13 && LA17_5<=14)||LA17_5==34) ) {
                                alt17=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 5, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 13:
                        case 14:
                        case 34:
                            {
                            alt17=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 7, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    {
                    alt17=1;
                    }
                    break;
                case 27:
                    {
                    int LA17_5 = input.LA(3);

                    if ( ((LA17_5>=21 && LA17_5<=25)) ) {
                        alt17=1;
                    }
                    else if ( ((LA17_5>=13 && LA17_5<=14)||LA17_5==34) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                case 14:
                case 34:
                    {
                    alt17=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }

                }
                break;
            case 28:
                {
                int LA17_4 = input.LA(2);

                if ( (LA17_4==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        {
                        alt17=1;
                        }
                        break;
                    case 27:
                        {
                        int LA17_5 = input.LA(4);

                        if ( ((LA17_5>=21 && LA17_5<=25)) ) {
                            alt17=1;
                        }
                        else if ( ((LA17_5>=13 && LA17_5<=14)||LA17_5==34) ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 13:
                    case 14:
                    case 34:
                        {
                        alt17=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDomainmodel.g:726:4: ruleCompareFormula
                    {

                    				newCompositeNode(grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_4_0());
                    			
                    pushFollow(FOLLOW_16);
                    ruleCompareFormula();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:734:4: ruleMyID
                    {

                    				newCompositeNode(grammarAccess.getDefineAccess().getMyIDParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_16);
                    ruleMyID();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:742:3: (otherlv_6= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDomainmodel.g:743:4: otherlv_6= ')'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefineAccess().getRightParenthesisKeyword_5());
                    			

                    }
                    break;

            }

            // InternalDomainmodel.g:748:3: ( ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )? )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=13 && LA22_0<=14)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDomainmodel.g:749:4: ruleConditionOperation (otherlv_8= '(' )? ( ruleCompareFormula | ruleMyID ) (otherlv_11= ')' )?
            	    {

            	    				newCompositeNode(grammarAccess.getDefineAccess().getConditionOperationParserRuleCall_6_0());
            	    			
            	    pushFollow(FOLLOW_7);
            	    ruleConditionOperation();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalDomainmodel.g:756:4: (otherlv_8= '(' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==26) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalDomainmodel.g:757:5: otherlv_8= '('
            	            {
            	            otherlv_8=(Token)match(input,26,FOLLOW_7); 

            	            					newLeafNode(otherlv_8, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_6_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDomainmodel.g:762:4: ( ruleCompareFormula | ruleMyID )
            	    int alt20=2;
            	    switch ( input.LA(1) ) {
            	    case RULE_DIGIT:
            	    case RULE_REAL:
            	    case 26:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 16:
            	        {
            	        int LA20_2 = input.LA(2);

            	        if ( (LA20_2==RULE_ID) ) {
            	            switch ( input.LA(3) ) {
            	            case 15:
            	            case 16:
            	            case 17:
            	            case 18:
            	            case 19:
            	            case 20:
            	            case 21:
            	            case 22:
            	            case 23:
            	            case 24:
            	            case 25:
            	                {
            	                alt20=1;
            	                }
            	                break;
            	            case 27:
            	                {
            	                int LA20_5 = input.LA(4);

            	                if ( ((LA20_5>=13 && LA20_5<=14)||LA20_5==34) ) {
            	                    alt20=2;
            	                }
            	                else if ( ((LA20_5>=21 && LA20_5<=25)) ) {
            	                    alt20=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 20, 5, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 13:
            	            case 14:
            	            case 34:
            	                {
            	                alt20=2;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 20, 3, input);

            	                throw nvae;
            	            }

            	        }
            	        else if ( (LA20_2==28) ) {
            	            int LA20_4 = input.LA(3);

            	            if ( (LA20_4==RULE_ID) ) {
            	                switch ( input.LA(4) ) {
            	                case 15:
            	                case 16:
            	                case 17:
            	                case 18:
            	                case 19:
            	                case 20:
            	                case 21:
            	                case 22:
            	                case 23:
            	                case 24:
            	                case 25:
            	                    {
            	                    alt20=1;
            	                    }
            	                    break;
            	                case 27:
            	                    {
            	                    int LA20_5 = input.LA(5);

            	                    if ( ((LA20_5>=13 && LA20_5<=14)||LA20_5==34) ) {
            	                        alt20=2;
            	                    }
            	                    else if ( ((LA20_5>=21 && LA20_5<=25)) ) {
            	                        alt20=1;
            	                    }
            	                    else {
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("", 20, 5, input);

            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 13:
            	                case 14:
            	                case 34:
            	                    {
            	                    alt20=2;
            	                    }
            	                    break;
            	                default:
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 20, 7, input);

            	                    throw nvae;
            	                }

            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 20, 4, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 20, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 15:
            	        case 16:
            	        case 17:
            	        case 18:
            	        case 19:
            	        case 20:
            	        case 21:
            	        case 22:
            	        case 23:
            	        case 24:
            	        case 25:
            	            {
            	            alt20=1;
            	            }
            	            break;
            	        case 27:
            	            {
            	            int LA20_5 = input.LA(3);

            	            if ( ((LA20_5>=13 && LA20_5<=14)||LA20_5==34) ) {
            	                alt20=2;
            	            }
            	            else if ( ((LA20_5>=21 && LA20_5<=25)) ) {
            	                alt20=1;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 20, 5, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 13:
            	        case 14:
            	        case 34:
            	            {
            	            alt20=2;
            	            }
            	            break;
            	        default:
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 20, 3, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 28:
            	        {
            	        int LA20_4 = input.LA(2);

            	        if ( (LA20_4==RULE_ID) ) {
            	            switch ( input.LA(3) ) {
            	            case 15:
            	            case 16:
            	            case 17:
            	            case 18:
            	            case 19:
            	            case 20:
            	            case 21:
            	            case 22:
            	            case 23:
            	            case 24:
            	            case 25:
            	                {
            	                alt20=1;
            	                }
            	                break;
            	            case 27:
            	                {
            	                int LA20_5 = input.LA(4);

            	                if ( ((LA20_5>=13 && LA20_5<=14)||LA20_5==34) ) {
            	                    alt20=2;
            	                }
            	                else if ( ((LA20_5>=21 && LA20_5<=25)) ) {
            	                    alt20=1;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 20, 5, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 13:
            	            case 14:
            	            case 34:
            	                {
            	                alt20=2;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 20, 7, input);

            	                throw nvae;
            	            }

            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 20, 4, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // InternalDomainmodel.g:763:5: ruleCompareFormula
            	            {

            	            					newCompositeNode(grammarAccess.getDefineAccess().getCompareFormulaParserRuleCall_6_2_0());
            	            				
            	            pushFollow(FOLLOW_16);
            	            ruleCompareFormula();

            	            state._fsp--;


            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalDomainmodel.g:771:5: ruleMyID
            	            {

            	            					newCompositeNode(grammarAccess.getDefineAccess().getMyIDParserRuleCall_6_2_1());
            	            				
            	            pushFollow(FOLLOW_16);
            	            ruleMyID();

            	            state._fsp--;


            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }

            	    // InternalDomainmodel.g:779:4: (otherlv_11= ')' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==27) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalDomainmodel.g:780:5: otherlv_11= ')'
            	            {
            	            otherlv_11=(Token)match(input,27,FOLLOW_17); 

            	            					newLeafNode(otherlv_11, grammarAccess.getDefineAccess().getRightParenthesisKeyword_6_3());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_12=(Token)match(input,34,FOLLOW_2); 

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
    // InternalDomainmodel.g:794:1: entryRulePrecondition returns [String current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final String entryRulePrecondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrecondition = null;


        try {
            // InternalDomainmodel.g:794:52: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalDomainmodel.g:795:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalDomainmodel.g:801:1: rulePrecondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulePrecondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CompareFormula_2 = null;

        AntlrDatatypeRuleToken this_ConditionOperation_3 = null;

        AntlrDatatypeRuleToken this_CompareFormula_4 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:807:2: ( (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' ) )
            // InternalDomainmodel.g:808:2: (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' )
            {
            // InternalDomainmodel.g:808:2: (kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}' )
            // InternalDomainmodel.g:809:3: kw= 'precondition' kw= '{' this_CompareFormula_2= ruleCompareFormula (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )* kw= '}'
            {
            kw=(Token)match(input,36,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPreconditionAccess().getPreconditionKeyword_0());
            		
            kw=(Token)match(input,33,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPreconditionAccess().getLeftCurlyBracketKeyword_1());
            		

            			newCompositeNode(grammarAccess.getPreconditionAccess().getCompareFormulaParserRuleCall_2());
            		
            pushFollow(FOLLOW_17);
            this_CompareFormula_2=ruleCompareFormula();

            state._fsp--;


            			current.merge(this_CompareFormula_2);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDomainmodel.g:829:3: (this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=13 && LA23_0<=14)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDomainmodel.g:830:4: this_ConditionOperation_3= ruleConditionOperation this_CompareFormula_4= ruleCompareFormula
            	    {

            	    				newCompositeNode(grammarAccess.getPreconditionAccess().getConditionOperationParserRuleCall_3_0());
            	    			
            	    pushFollow(FOLLOW_7);
            	    this_ConditionOperation_3=ruleConditionOperation();

            	    state._fsp--;


            	    				current.merge(this_ConditionOperation_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getPreconditionAccess().getCompareFormulaParserRuleCall_3_1());
            	    			
            	    pushFollow(FOLLOW_17);
            	    this_CompareFormula_4=ruleCompareFormula();

            	    state._fsp--;


            	    				current.merge(this_CompareFormula_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            kw=(Token)match(input,34,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTestCondition"
    // InternalDomainmodel.g:860:1: entryRuleTestCondition returns [String current=null] : iv_ruleTestCondition= ruleTestCondition EOF ;
    public final String entryRuleTestCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestCondition = null;


        try {
            // InternalDomainmodel.g:860:53: (iv_ruleTestCondition= ruleTestCondition EOF )
            // InternalDomainmodel.g:861:2: iv_ruleTestCondition= ruleTestCondition EOF
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
    // InternalDomainmodel.g:867:1: ruleTestCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? ) ;
    public final AntlrDatatypeRuleToken ruleTestCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TestcaseElement_2 = null;

        AntlrDatatypeRuleToken this_ConditionOperation_5 = null;

        AntlrDatatypeRuleToken this_TestcaseElement_7 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:873:2: ( (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? ) )
            // InternalDomainmodel.g:874:2: (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? )
            {
            // InternalDomainmodel.g:874:2: (this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )? )
            // InternalDomainmodel.g:875:3: this_STRING_0= RULE_STRING ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )?
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getTestConditionAccess().getSTRINGTerminalRuleCall_0());
            		
            // InternalDomainmodel.g:882:3: ( (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_DIGIT && LA31_0<=RULE_REAL)||LA31_0==RULE_ID||LA31_0==16||LA31_0==26||LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDomainmodel.g:883:4: (kw= '(' )? this_TestcaseElement_2= ruleTestcaseElement (kw= ')' )? (kw= '(' )? (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )* (kw= ')' )?
                    {
                    // InternalDomainmodel.g:883:4: (kw= '(' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==26) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalDomainmodel.g:884:5: kw= '('
                            {
                            kw=(Token)match(input,26,FOLLOW_7); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_0());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getTestConditionAccess().getTestcaseElementParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_TestcaseElement_2=ruleTestcaseElement();

                    state._fsp--;


                    				current.merge(this_TestcaseElement_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalDomainmodel.g:900:4: (kw= ')' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==27) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalDomainmodel.g:901:5: kw= ')'
                            {
                            kw=(Token)match(input,27,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_2());
                            				

                            }
                            break;

                    }

                    // InternalDomainmodel.g:907:4: (kw= '(' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==26) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalDomainmodel.g:908:5: kw= '('
                            {
                            kw=(Token)match(input,26,FOLLOW_20); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_3());
                            				

                            }
                            break;

                    }

                    // InternalDomainmodel.g:914:4: (this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )? )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=13 && LA29_0<=14)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalDomainmodel.g:915:5: this_ConditionOperation_5= ruleConditionOperation (kw= '(' )? this_TestcaseElement_7= ruleTestcaseElement (kw= ')' )?
                    	    {

                    	    					newCompositeNode(grammarAccess.getTestConditionAccess().getConditionOperationParserRuleCall_1_4_0());
                    	    				
                    	    pushFollow(FOLLOW_7);
                    	    this_ConditionOperation_5=ruleConditionOperation();

                    	    state._fsp--;


                    	    					current.merge(this_ConditionOperation_5);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalDomainmodel.g:925:5: (kw= '(' )?
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==26) ) {
                    	        alt27=1;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalDomainmodel.g:926:6: kw= '('
                    	            {
                    	            kw=(Token)match(input,26,FOLLOW_7); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getTestConditionAccess().getLeftParenthesisKeyword_1_4_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    					newCompositeNode(grammarAccess.getTestConditionAccess().getTestcaseElementParserRuleCall_1_4_2());
                    	    				
                    	    pushFollow(FOLLOW_20);
                    	    this_TestcaseElement_7=ruleTestcaseElement();

                    	    state._fsp--;


                    	    					current.merge(this_TestcaseElement_7);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalDomainmodel.g:942:5: (kw= ')' )?
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==27) ) {
                    	        alt28=1;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // InternalDomainmodel.g:943:6: kw= ')'
                    	            {
                    	            kw=(Token)match(input,27,FOLLOW_20); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getTestConditionAccess().getRightParenthesisKeyword_1_4_3());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    // InternalDomainmodel.g:950:4: (kw= ')' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==27) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalDomainmodel.g:951:5: kw= ')'
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
    // InternalDomainmodel.g:962:1: entryRuleTestcase returns [String current=null] : iv_ruleTestcase= ruleTestcase EOF ;
    public final String entryRuleTestcase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestcase = null;


        try {
            // InternalDomainmodel.g:962:48: (iv_ruleTestcase= ruleTestcase EOF )
            // InternalDomainmodel.g:963:2: iv_ruleTestcase= ruleTestcase EOF
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
    // InternalDomainmodel.g:969:1: ruleTestcase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleTestcase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TestCondition_2 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:975:2: ( (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' ) )
            // InternalDomainmodel.g:976:2: (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' )
            {
            // InternalDomainmodel.g:976:2: (kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}' )
            // InternalDomainmodel.g:977:3: kw= 'testcase' kw= '{' (this_TestCondition_2= ruleTestCondition )* kw= '}'
            {
            kw=(Token)match(input,37,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTestcaseAccess().getTestcaseKeyword_0());
            		
            kw=(Token)match(input,33,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDomainmodel.g:987:3: (this_TestCondition_2= ruleTestCondition )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_STRING) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDomainmodel.g:988:4: this_TestCondition_2= ruleTestCondition
            	    {

            	    				newCompositeNode(grammarAccess.getTestcaseAccess().getTestConditionParserRuleCall_2());
            	    			
            	    pushFollow(FOLLOW_21);
            	    this_TestCondition_2=ruleTestCondition();

            	    state._fsp--;


            	    				current.merge(this_TestCondition_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalDomainmodel.g:1008:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // InternalDomainmodel.g:1008:48: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalDomainmodel.g:1009:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalDomainmodel.g:1015:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Int' | kw= 'Real' | kw= 'Bool' ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1021:2: ( (kw= 'Int' | kw= 'Real' | kw= 'Bool' ) )
            // InternalDomainmodel.g:1022:2: (kw= 'Int' | kw= 'Real' | kw= 'Bool' )
            {
            // InternalDomainmodel.g:1022:2: (kw= 'Int' | kw= 'Real' | kw= 'Bool' )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt33=1;
                }
                break;
            case 31:
                {
                alt33=2;
                }
                break;
            case 32:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalDomainmodel.g:1023:3: kw= 'Int'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:1029:3: kw= 'Real'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getRealKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:1035:3: kw= 'Bool'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getBoolKeyword_2());
                    		

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
    // InternalDomainmodel.g:1044:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalDomainmodel.g:1044:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalDomainmodel.g:1045:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalDomainmodel.g:1051:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' ) ;
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
            // InternalDomainmodel.g:1057:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' ) )
            // InternalDomainmodel.g:1058:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' )
            {
            // InternalDomainmodel.g:1058:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')' )
            // InternalDomainmodel.g:1059:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalDomainmodel.g:1063:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:1064:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:1064:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:1065:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDomainmodel.g:1085:3: ( ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )* )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=30 && LA35_0<=32)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDomainmodel.g:1086:4: ruleDatatype ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )*
            	    {

            	    				newCompositeNode(grammarAccess.getFunctionAccess().getDatatypeParserRuleCall_3_0());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleDatatype();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalDomainmodel.g:1093:4: ( (lv_name_4_0= RULE_ID ) )
            	    // InternalDomainmodel.g:1094:5: (lv_name_4_0= RULE_ID )
            	    {
            	    // InternalDomainmodel.g:1094:5: (lv_name_4_0= RULE_ID )
            	    // InternalDomainmodel.g:1095:6: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            	    // InternalDomainmodel.g:1111:4: (otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==39) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // InternalDomainmodel.g:1112:5: otherlv_5= ',' ruleDatatype ( (lv_name_7_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,39,FOLLOW_25); 

            	    	    					newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getCommaKeyword_3_2_0());
            	    	    				

            	    	    					newCompositeNode(grammarAccess.getFunctionAccess().getDatatypeParserRuleCall_3_2_1());
            	    	    				
            	    	    pushFollow(FOLLOW_10);
            	    	    ruleDatatype();

            	    	    state._fsp--;


            	    	    					afterParserOrEnumRuleCall();
            	    	    				
            	    	    // InternalDomainmodel.g:1123:5: ( (lv_name_7_0= RULE_ID ) )
            	    	    // InternalDomainmodel.g:1124:6: (lv_name_7_0= RULE_ID )
            	    	    {
            	    	    // InternalDomainmodel.g:1124:6: (lv_name_7_0= RULE_ID )
            	    	    // InternalDomainmodel.g:1125:7: lv_name_7_0= RULE_ID
            	    	    {
            	    	    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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
            	    	    break loop34;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalDomainmodel.g:1151:1: entryRuleRun returns [String current=null] : iv_ruleRun= ruleRun EOF ;
    public final String entryRuleRun() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRun = null;


        try {
            // InternalDomainmodel.g:1151:43: (iv_ruleRun= ruleRun EOF )
            // InternalDomainmodel.g:1152:2: iv_ruleRun= ruleRun EOF
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
    // InternalDomainmodel.g:1158:1: ruleRun returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'run' ;
    public final AntlrDatatypeRuleToken ruleRun() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:1164:2: (kw= 'run' )
            // InternalDomainmodel.g:1165:2: kw= 'run'
            {
            kw=(Token)match(input,40,FOLLOW_2); 

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
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\2\4\1\7\1\17\1\7\2\17\6\4\1\25\5\4\1\17\1\7\1\17\1\7\2\17\2\uffff\1\17";
    static final String dfa_3s = "\3\34\1\33\1\7\2\33\6\34\1\31\5\34\1\33\1\34\1\33\1\7\2\33\2\uffff\1\33";
    static final String dfa_4s = "\31\uffff\1\2\1\1\1\uffff";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\6\1\uffff\1\3\10\uffff\1\2\11\uffff\1\1\1\uffff\1\4",
            "\1\5\1\6\1\uffff\1\3\10\uffff\1\2\13\uffff\1\4",
            "\1\3\24\uffff\1\4",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "\1\23",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\27\1\30\1\uffff\1\25\10\uffff\1\24\13\uffff\1\26",
            "\1\16\1\17\1\20\1\21\1\22",
            "\2\32\1\31\1\32\10\uffff\1\32\11\uffff\1\32\1\uffff\1\32",
            "\2\32\1\31\1\32\10\uffff\1\32\11\uffff\1\32\1\uffff\1\32",
            "\2\32\1\31\1\32\10\uffff\1\32\11\uffff\1\32\1\uffff\1\32",
            "\2\32\1\31\1\32\10\uffff\1\32\11\uffff\1\32\1\uffff\1\32",
            "\2\32\1\31\1\32\10\uffff\1\32\11\uffff\1\32\1\uffff\1\32",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "\1\25\24\uffff\1\26",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "\1\33",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15",
            "",
            "",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1\21\1\22\1\uffff\1\15"
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
            return "424:2: ( (this_MathFormula_0= ruleMathFormula this_CompareOperation_1= ruleCompareOperation this_MathFormula_2= ruleMathFormula ) | (this_MathFormula_3= ruleMathFormula this_CompareOperation_4= ruleCompareOperation this_STRING_5= RULE_STRING ) )";
        }
    }
    static final String dfa_7s = "\27\uffff";
    static final String dfa_8s = "\3\uffff\1\17\1\uffff\2\17\6\uffff\1\17\2\uffff\1\17\1\uffff\1\17\1\uffff\3\17";
    static final String dfa_9s = "\2\4\1\7\1\6\1\7\2\6\6\4\1\6\2\uffff\1\6\1\7\1\6\1\7\3\6";
    static final String dfa_10s = "\3\34\1\42\1\7\2\42\6\34\1\42\2\uffff\1\42\1\34\1\42\1\7\3\42";
    static final String dfa_11s = "\16\uffff\1\1\1\2\7\uffff";
    static final String dfa_12s = "\27\uffff}>";
    static final String[] dfa_13s = {
            "\1\5\1\6\1\uffff\1\3\10\uffff\1\2\11\uffff\1\1\1\uffff\1\4",
            "\1\5\1\6\1\uffff\1\3\10\uffff\1\2\13\uffff\1\4",
            "\1\3\24\uffff\1\4",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17\1\15\6\uffff\1\17",
            "\1\20",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17\1\15\6\uffff\1\17",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17\1\15\6\uffff\1\17",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\24\1\25\1\uffff\1\22\10\uffff\1\21\13\uffff\1\23",
            "\1\17\6\uffff\2\17\6\uffff\5\16\2\17\6\uffff\1\17",
            "",
            "",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17\1\15\6\uffff\1\17",
            "\1\22\24\uffff\1\23",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17\1\15\6\uffff\1\17",
            "\1\26",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17\1\15\6\uffff\1\17",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17\1\15\6\uffff\1\17",
            "\1\17\6\uffff\2\17\1\7\1\10\1\11\1\12\1\13\1\14\5\16\1\17\1\15\6\uffff\1\17"
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
            return "555:2: (this_CompareFormula_0= ruleCompareFormula | this_MathFormula_1= ruleMathFormula )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000017820000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000100100B0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000081F8002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000140100B0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000001C0000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000408006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000140100B2L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C006002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008006002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001C8000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000081C8000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001C0000000L});

}