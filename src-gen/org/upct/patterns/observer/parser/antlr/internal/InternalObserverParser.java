package org.upct.patterns.observer.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.upct.patterns.observer.services.ObserverGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalObserverParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'subjects:'", "';'", "'observers:'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalObserverParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalObserverParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalObserverParser.tokenNames; }
    public String getGrammarFileName() { return "InternalObserver.g"; }



     	private ObserverGrammarAccess grammarAccess;

        public InternalObserverParser(TokenStream input, ObserverGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ObserverGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalObserver.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalObserver.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalObserver.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalObserver.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalObserver.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalObserver.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalObserver.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalObserver.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalObserver.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalObserver.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.upct.patterns.observer.Observer.Type");
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


    // $ANTLR start "entryRuleType"
    // InternalObserver.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalObserver.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalObserver.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalObserver.g:107:1: ruleType returns [EObject current=null] : (this_Subjects_0= ruleSubjects | this_Observers_1= ruleObservers ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Subjects_0 = null;

        EObject this_Observers_1 = null;



        	enterRule();

        try {
            // InternalObserver.g:113:2: ( (this_Subjects_0= ruleSubjects | this_Observers_1= ruleObservers ) )
            // InternalObserver.g:114:2: (this_Subjects_0= ruleSubjects | this_Observers_1= ruleObservers )
            {
            // InternalObserver.g:114:2: (this_Subjects_0= ruleSubjects | this_Observers_1= ruleObservers )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalObserver.g:115:3: this_Subjects_0= ruleSubjects
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSubjectsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subjects_0=ruleSubjects();

                    state._fsp--;


                    			current = this_Subjects_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalObserver.g:124:3: this_Observers_1= ruleObservers
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getObserversParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Observers_1=ruleObservers();

                    state._fsp--;


                    			current = this_Observers_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSubjects"
    // InternalObserver.g:136:1: entryRuleSubjects returns [EObject current=null] : iv_ruleSubjects= ruleSubjects EOF ;
    public final EObject entryRuleSubjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubjects = null;


        try {
            // InternalObserver.g:136:49: (iv_ruleSubjects= ruleSubjects EOF )
            // InternalObserver.g:137:2: iv_ruleSubjects= ruleSubjects EOF
            {
             newCompositeNode(grammarAccess.getSubjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubjects=ruleSubjects();

            state._fsp--;

             current =iv_ruleSubjects; 
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
    // $ANTLR end "entryRuleSubjects"


    // $ANTLR start "ruleSubjects"
    // InternalObserver.g:143:1: ruleSubjects returns [EObject current=null] : (otherlv_0= 'subjects:' ( (lv_subjects_1_0= ruleSubject ) )+ otherlv_2= ';' ) ;
    public final EObject ruleSubjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_subjects_1_0 = null;



        	enterRule();

        try {
            // InternalObserver.g:149:2: ( (otherlv_0= 'subjects:' ( (lv_subjects_1_0= ruleSubject ) )+ otherlv_2= ';' ) )
            // InternalObserver.g:150:2: (otherlv_0= 'subjects:' ( (lv_subjects_1_0= ruleSubject ) )+ otherlv_2= ';' )
            {
            // InternalObserver.g:150:2: (otherlv_0= 'subjects:' ( (lv_subjects_1_0= ruleSubject ) )+ otherlv_2= ';' )
            // InternalObserver.g:151:3: otherlv_0= 'subjects:' ( (lv_subjects_1_0= ruleSubject ) )+ otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubjectsAccess().getSubjectsKeyword_0());
            		
            // InternalObserver.g:155:3: ( (lv_subjects_1_0= ruleSubject ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalObserver.g:156:4: (lv_subjects_1_0= ruleSubject )
            	    {
            	    // InternalObserver.g:156:4: (lv_subjects_1_0= ruleSubject )
            	    // InternalObserver.g:157:5: lv_subjects_1_0= ruleSubject
            	    {

            	    					newCompositeNode(grammarAccess.getSubjectsAccess().getSubjectsSubjectParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_subjects_1_0=ruleSubject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subjects",
            	    						lv_subjects_1_0,
            	    						"org.upct.patterns.observer.Observer.Subject");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSubjectsAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleSubjects"


    // $ANTLR start "entryRuleObservers"
    // InternalObserver.g:182:1: entryRuleObservers returns [EObject current=null] : iv_ruleObservers= ruleObservers EOF ;
    public final EObject entryRuleObservers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObservers = null;


        try {
            // InternalObserver.g:182:50: (iv_ruleObservers= ruleObservers EOF )
            // InternalObserver.g:183:2: iv_ruleObservers= ruleObservers EOF
            {
             newCompositeNode(grammarAccess.getObserversRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObservers=ruleObservers();

            state._fsp--;

             current =iv_ruleObservers; 
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
    // $ANTLR end "entryRuleObservers"


    // $ANTLR start "ruleObservers"
    // InternalObserver.g:189:1: ruleObservers returns [EObject current=null] : (otherlv_0= 'observers:' ( (lv_observers_1_0= ruleObserver ) )+ otherlv_2= ';' ) ;
    public final EObject ruleObservers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_observers_1_0 = null;



        	enterRule();

        try {
            // InternalObserver.g:195:2: ( (otherlv_0= 'observers:' ( (lv_observers_1_0= ruleObserver ) )+ otherlv_2= ';' ) )
            // InternalObserver.g:196:2: (otherlv_0= 'observers:' ( (lv_observers_1_0= ruleObserver ) )+ otherlv_2= ';' )
            {
            // InternalObserver.g:196:2: (otherlv_0= 'observers:' ( (lv_observers_1_0= ruleObserver ) )+ otherlv_2= ';' )
            // InternalObserver.g:197:3: otherlv_0= 'observers:' ( (lv_observers_1_0= ruleObserver ) )+ otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObserversAccess().getObserversKeyword_0());
            		
            // InternalObserver.g:201:3: ( (lv_observers_1_0= ruleObserver ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalObserver.g:202:4: (lv_observers_1_0= ruleObserver )
            	    {
            	    // InternalObserver.g:202:4: (lv_observers_1_0= ruleObserver )
            	    // InternalObserver.g:203:5: lv_observers_1_0= ruleObserver
            	    {

            	    					newCompositeNode(grammarAccess.getObserversAccess().getObserversObserverParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_observers_1_0=ruleObserver();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObserversRule());
            	    					}
            	    					add(
            	    						current,
            	    						"observers",
            	    						lv_observers_1_0,
            	    						"org.upct.patterns.observer.Observer.Observer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getObserversAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleObservers"


    // $ANTLR start "entryRuleSubject"
    // InternalObserver.g:228:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalObserver.g:228:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalObserver.g:229:2: iv_ruleSubject= ruleSubject EOF
            {
             newCompositeNode(grammarAccess.getSubjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubject=ruleSubject();

            state._fsp--;

             current =iv_ruleSubject; 
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
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalObserver.g:235:1: ruleSubject returns [EObject current=null] : ( (lv_subject_0_0= ruleElementType ) ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        EObject lv_subject_0_0 = null;



        	enterRule();

        try {
            // InternalObserver.g:241:2: ( ( (lv_subject_0_0= ruleElementType ) ) )
            // InternalObserver.g:242:2: ( (lv_subject_0_0= ruleElementType ) )
            {
            // InternalObserver.g:242:2: ( (lv_subject_0_0= ruleElementType ) )
            // InternalObserver.g:243:3: (lv_subject_0_0= ruleElementType )
            {
            // InternalObserver.g:243:3: (lv_subject_0_0= ruleElementType )
            // InternalObserver.g:244:4: lv_subject_0_0= ruleElementType
            {

            				newCompositeNode(grammarAccess.getSubjectAccess().getSubjectElementTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_subject_0_0=ruleElementType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSubjectRule());
            				}
            				set(
            					current,
            					"subject",
            					lv_subject_0_0,
            					"org.upct.patterns.observer.Observer.ElementType");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRuleObserver"
    // InternalObserver.g:264:1: entryRuleObserver returns [EObject current=null] : iv_ruleObserver= ruleObserver EOF ;
    public final EObject entryRuleObserver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserver = null;


        try {
            // InternalObserver.g:264:49: (iv_ruleObserver= ruleObserver EOF )
            // InternalObserver.g:265:2: iv_ruleObserver= ruleObserver EOF
            {
             newCompositeNode(grammarAccess.getObserverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObserver=ruleObserver();

            state._fsp--;

             current =iv_ruleObserver; 
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
    // $ANTLR end "entryRuleObserver"


    // $ANTLR start "ruleObserver"
    // InternalObserver.g:271:1: ruleObserver returns [EObject current=null] : ( (lv_observer_0_0= ruleElementType ) ) ;
    public final EObject ruleObserver() throws RecognitionException {
        EObject current = null;

        EObject lv_observer_0_0 = null;



        	enterRule();

        try {
            // InternalObserver.g:277:2: ( ( (lv_observer_0_0= ruleElementType ) ) )
            // InternalObserver.g:278:2: ( (lv_observer_0_0= ruleElementType ) )
            {
            // InternalObserver.g:278:2: ( (lv_observer_0_0= ruleElementType ) )
            // InternalObserver.g:279:3: (lv_observer_0_0= ruleElementType )
            {
            // InternalObserver.g:279:3: (lv_observer_0_0= ruleElementType )
            // InternalObserver.g:280:4: lv_observer_0_0= ruleElementType
            {

            				newCompositeNode(grammarAccess.getObserverAccess().getObserverElementTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_observer_0_0=ruleElementType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getObserverRule());
            				}
            				set(
            					current,
            					"observer",
            					lv_observer_0_0,
            					"org.upct.patterns.observer.Observer.ElementType");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleObserver"


    // $ANTLR start "entryRuleElementType"
    // InternalObserver.g:300:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalObserver.g:300:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalObserver.g:301:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalObserver.g:307:1: ruleElementType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalObserver.g:313:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalObserver.g:314:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalObserver.g:314:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalObserver.g:315:3: (lv_name_0_0= RULE_ID )
            {
            // InternalObserver.g:315:3: (lv_name_0_0= RULE_ID )
            // InternalObserver.g:316:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getElementTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getElementTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleElementType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});

}