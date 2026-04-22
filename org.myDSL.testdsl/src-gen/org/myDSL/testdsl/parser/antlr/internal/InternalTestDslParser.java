package org.myDSL.testdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.myDSL.testdsl.services.TestDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TestSuite'", "'TestCase'", "':'", "'input'", "'='", "'expect'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTestDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTestDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTestDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTestDsl.g"; }



     	private TestDslGrammarAccess grammarAccess;

        public InternalTestDslParser(TokenStream input, TestDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TestDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTestDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTestDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTestDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalTestDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'TestSuite' ( (lv_name_1_0= RULE_ID ) ) ( (lv_testCases_2_0= ruleTestCase ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_testCases_2_0 = null;



        	enterRule();

        try {
            // InternalTestDsl.g:77:2: ( (otherlv_0= 'TestSuite' ( (lv_name_1_0= RULE_ID ) ) ( (lv_testCases_2_0= ruleTestCase ) )* ) )
            // InternalTestDsl.g:78:2: (otherlv_0= 'TestSuite' ( (lv_name_1_0= RULE_ID ) ) ( (lv_testCases_2_0= ruleTestCase ) )* )
            {
            // InternalTestDsl.g:78:2: (otherlv_0= 'TestSuite' ( (lv_name_1_0= RULE_ID ) ) ( (lv_testCases_2_0= ruleTestCase ) )* )
            // InternalTestDsl.g:79:3: otherlv_0= 'TestSuite' ( (lv_name_1_0= RULE_ID ) ) ( (lv_testCases_2_0= ruleTestCase ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getTestSuiteKeyword_0());
            		
            // InternalTestDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTestDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTestDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalTestDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTestDsl.g:101:3: ( (lv_testCases_2_0= ruleTestCase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTestDsl.g:102:4: (lv_testCases_2_0= ruleTestCase )
            	    {
            	    // InternalTestDsl.g:102:4: (lv_testCases_2_0= ruleTestCase )
            	    // InternalTestDsl.g:103:5: lv_testCases_2_0= ruleTestCase
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTestCasesTestCaseParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_testCases_2_0=ruleTestCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testCases",
            	    						lv_testCases_2_0,
            	    						"org.myDSL.testdsl.TestDsl.TestCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTestCase"
    // InternalTestDsl.g:124:1: entryRuleTestCase returns [EObject current=null] : iv_ruleTestCase= ruleTestCase EOF ;
    public final EObject entryRuleTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestCase = null;


        try {
            // InternalTestDsl.g:124:49: (iv_ruleTestCase= ruleTestCase EOF )
            // InternalTestDsl.g:125:2: iv_ruleTestCase= ruleTestCase EOF
            {
             newCompositeNode(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestCase=ruleTestCase();

            state._fsp--;

             current =iv_ruleTestCase; 
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
    // $ANTLR end "entryRuleTestCase"


    // $ANTLR start "ruleTestCase"
    // InternalTestDsl.g:131:1: ruleTestCase returns [EObject current=null] : (otherlv_0= 'TestCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_steps_3_0= ruleStep ) )* ) ;
    public final EObject ruleTestCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_steps_3_0 = null;



        	enterRule();

        try {
            // InternalTestDsl.g:137:2: ( (otherlv_0= 'TestCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_steps_3_0= ruleStep ) )* ) )
            // InternalTestDsl.g:138:2: (otherlv_0= 'TestCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_steps_3_0= ruleStep ) )* )
            {
            // InternalTestDsl.g:138:2: (otherlv_0= 'TestCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_steps_3_0= ruleStep ) )* )
            // InternalTestDsl.g:139:3: otherlv_0= 'TestCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_steps_3_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTestCaseAccess().getTestCaseKeyword_0());
            		
            // InternalTestDsl.g:143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTestDsl.g:144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTestDsl.g:144:4: (lv_name_1_0= RULE_ID )
            // InternalTestDsl.g:145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTestCaseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTestCaseAccess().getColonKeyword_2());
            		
            // InternalTestDsl.g:165:3: ( (lv_steps_3_0= ruleStep ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTestDsl.g:166:4: (lv_steps_3_0= ruleStep )
            	    {
            	    // InternalTestDsl.g:166:4: (lv_steps_3_0= ruleStep )
            	    // InternalTestDsl.g:167:5: lv_steps_3_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getTestCaseAccess().getStepsStepParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_steps_3_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_3_0,
            	    						"org.myDSL.testdsl.TestDsl.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleTestCase"


    // $ANTLR start "entryRuleStep"
    // InternalTestDsl.g:188:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalTestDsl.g:188:45: (iv_ruleStep= ruleStep EOF )
            // InternalTestDsl.g:189:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalTestDsl.g:195:1: ruleStep returns [EObject current=null] : (this_Input_0= ruleInput | this_Expect_1= ruleExpect ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Input_0 = null;

        EObject this_Expect_1 = null;



        	enterRule();

        try {
            // InternalTestDsl.g:201:2: ( (this_Input_0= ruleInput | this_Expect_1= ruleExpect ) )
            // InternalTestDsl.g:202:2: (this_Input_0= ruleInput | this_Expect_1= ruleExpect )
            {
            // InternalTestDsl.g:202:2: (this_Input_0= ruleInput | this_Expect_1= ruleExpect )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTestDsl.g:203:3: this_Input_0= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getInputParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_0=ruleInput();

                    state._fsp--;


                    			current = this_Input_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTestDsl.g:212:3: this_Expect_1= ruleExpect
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getExpectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expect_1=ruleExpect();

                    state._fsp--;


                    			current = this_Expect_1;
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleInput"
    // InternalTestDsl.g:224:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalTestDsl.g:224:46: (iv_ruleInput= ruleInput EOF )
            // InternalTestDsl.g:225:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalTestDsl.g:231:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTestDsl.g:237:2: ( (otherlv_0= 'input' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalTestDsl.g:238:2: (otherlv_0= 'input' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalTestDsl.g:238:2: (otherlv_0= 'input' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalTestDsl.g:239:3: otherlv_0= 'input' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalTestDsl.g:243:3: ( (lv_key_1_0= RULE_ID ) )
            // InternalTestDsl.g:244:4: (lv_key_1_0= RULE_ID )
            {
            // InternalTestDsl.g:244:4: (lv_key_1_0= RULE_ID )
            // InternalTestDsl.g:245:5: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_key_1_0, grammarAccess.getInputAccess().getKeyIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getEqualsSignKeyword_2());
            		
            // InternalTestDsl.g:265:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalTestDsl.g:266:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalTestDsl.g:266:4: (lv_value_3_0= RULE_STRING )
            // InternalTestDsl.g:267:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getInputAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleExpect"
    // InternalTestDsl.g:287:1: entryRuleExpect returns [EObject current=null] : iv_ruleExpect= ruleExpect EOF ;
    public final EObject entryRuleExpect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpect = null;


        try {
            // InternalTestDsl.g:287:47: (iv_ruleExpect= ruleExpect EOF )
            // InternalTestDsl.g:288:2: iv_ruleExpect= ruleExpect EOF
            {
             newCompositeNode(grammarAccess.getExpectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpect=ruleExpect();

            state._fsp--;

             current =iv_ruleExpect; 
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
    // $ANTLR end "entryRuleExpect"


    // $ANTLR start "ruleExpect"
    // InternalTestDsl.g:294:1: ruleExpect returns [EObject current=null] : (otherlv_0= 'expect' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final EObject ruleExpect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTestDsl.g:300:2: ( (otherlv_0= 'expect' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) ) )
            // InternalTestDsl.g:301:2: (otherlv_0= 'expect' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) )
            {
            // InternalTestDsl.g:301:2: (otherlv_0= 'expect' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) )
            // InternalTestDsl.g:302:3: otherlv_0= 'expect' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExpectAccess().getExpectKeyword_0());
            		
            // InternalTestDsl.g:306:3: ( (lv_key_1_0= RULE_ID ) )
            // InternalTestDsl.g:307:4: (lv_key_1_0= RULE_ID )
            {
            // InternalTestDsl.g:307:4: (lv_key_1_0= RULE_ID )
            // InternalTestDsl.g:308:5: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_key_1_0, grammarAccess.getExpectAccess().getKeyIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getExpectAccess().getEqualsSignKeyword_2());
            		
            // InternalTestDsl.g:328:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalTestDsl.g:329:4: (lv_value_3_0= RULE_ID )
            {
            // InternalTestDsl.g:329:4: (lv_value_3_0= RULE_ID )
            // InternalTestDsl.g:330:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getExpectAccess().getValueIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleExpect"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});

}