package org.xtext.example.p4dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.p4dsl.services.P4DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalP4DslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'p4'", "'-p'", "'-u'", "'-c'", "'add'", "'edit'", "'delete'", "':'", "'.'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalP4DslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalP4DslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalP4DslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g"; }



     	private P4DslGrammarAccess grammarAccess;
     	
        public InternalP4DslParser(TokenStream input, P4DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected P4DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_command_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_command_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:79:28: ( ( (lv_command_0_0= ruleCommand ) )* )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:80:1: ( (lv_command_0_0= ruleCommand ) )*
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:80:1: ( (lv_command_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:81:1: (lv_command_0_0= ruleCommand )
            	    {
            	    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:81:1: (lv_command_0_0= ruleCommand )
            	    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:82:3: lv_command_0_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleModel130);
            	    lv_command_0_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"command",
            	            		lv_command_0_0, 
            	            		"Command");
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


    // $ANTLR start "entryRuleCommand"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:106:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:107:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:108:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand166);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand176); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:115:1: ruleCommand returns [EObject current=null] : (otherlv_0= 'p4' this_P4Command_1= ruleP4Command ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_P4Command_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:118:28: ( (otherlv_0= 'p4' this_P4Command_1= ruleP4Command ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:119:1: (otherlv_0= 'p4' this_P4Command_1= ruleP4Command )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:119:1: (otherlv_0= 'p4' this_P4Command_1= ruleP4Command )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:119:3: otherlv_0= 'p4' this_P4Command_1= ruleP4Command
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCommand213); 

                	newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getP4Keyword_0());
                
             
                    newCompositeNode(grammarAccess.getCommandAccess().getP4CommandParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleP4Command_in_ruleCommand235);
            this_P4Command_1=ruleP4Command();

            state._fsp--;

             
                    current = this_P4Command_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleP4Command"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:140:1: entryRuleP4Command returns [EObject current=null] : iv_ruleP4Command= ruleP4Command EOF ;
    public final EObject entryRuleP4Command() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleP4Command = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:141:2: (iv_ruleP4Command= ruleP4Command EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:142:2: iv_ruleP4Command= ruleP4Command EOF
            {
             newCompositeNode(grammarAccess.getP4CommandRule()); 
            pushFollow(FOLLOW_ruleP4Command_in_entryRuleP4Command270);
            iv_ruleP4Command=ruleP4Command();

            state._fsp--;

             current =iv_ruleP4Command; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleP4Command280); 

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
    // $ANTLR end "entryRuleP4Command"


    // $ANTLR start "ruleP4Command"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:149:1: ruleP4Command returns [EObject current=null] : (this_PUCFlag_0= rulePUCFlag | this_FileBasedCommand_1= ruleFileBasedCommand ) ;
    public final EObject ruleP4Command() throws RecognitionException {
        EObject current = null;

        EObject this_PUCFlag_0 = null;

        EObject this_FileBasedCommand_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:152:28: ( (this_PUCFlag_0= rulePUCFlag | this_FileBasedCommand_1= ruleFileBasedCommand ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:153:1: (this_PUCFlag_0= rulePUCFlag | this_FileBasedCommand_1= ruleFileBasedCommand )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:153:1: (this_PUCFlag_0= rulePUCFlag | this_FileBasedCommand_1= ruleFileBasedCommand )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=17)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:154:5: this_PUCFlag_0= rulePUCFlag
                    {
                     
                            newCompositeNode(grammarAccess.getP4CommandAccess().getPUCFlagParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePUCFlag_in_ruleP4Command327);
                    this_PUCFlag_0=rulePUCFlag();

                    state._fsp--;

                     
                            current = this_PUCFlag_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:164:5: this_FileBasedCommand_1= ruleFileBasedCommand
                    {
                     
                            newCompositeNode(grammarAccess.getP4CommandAccess().getFileBasedCommandParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFileBasedCommand_in_ruleP4Command354);
                    this_FileBasedCommand_1=ruleFileBasedCommand();

                    state._fsp--;

                     
                            current = this_FileBasedCommand_1; 
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
    // $ANTLR end "ruleP4Command"


    // $ANTLR start "entryRulePUCFlag"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:180:1: entryRulePUCFlag returns [EObject current=null] : iv_rulePUCFlag= rulePUCFlag EOF ;
    public final EObject entryRulePUCFlag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePUCFlag = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:181:2: (iv_rulePUCFlag= rulePUCFlag EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:182:2: iv_rulePUCFlag= rulePUCFlag EOF
            {
             newCompositeNode(grammarAccess.getPUCFlagRule()); 
            pushFollow(FOLLOW_rulePUCFlag_in_entryRulePUCFlag389);
            iv_rulePUCFlag=rulePUCFlag();

            state._fsp--;

             current =iv_rulePUCFlag; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePUCFlag399); 

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
    // $ANTLR end "entryRulePUCFlag"


    // $ANTLR start "rulePUCFlag"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:189:1: rulePUCFlag returns [EObject current=null] : (this_Port_0= rulePort | this_User_1= ruleUser | this_Client_2= ruleClient ) ;
    public final EObject rulePUCFlag() throws RecognitionException {
        EObject current = null;

        EObject this_Port_0 = null;

        EObject this_User_1 = null;

        EObject this_Client_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:192:28: ( (this_Port_0= rulePort | this_User_1= ruleUser | this_Client_2= ruleClient ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:193:1: (this_Port_0= rulePort | this_User_1= ruleUser | this_Client_2= ruleClient )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:193:1: (this_Port_0= rulePort | this_User_1= ruleUser | this_Client_2= ruleClient )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
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
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:194:5: this_Port_0= rulePort
                    {
                     
                            newCompositeNode(grammarAccess.getPUCFlagAccess().getPortParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePort_in_rulePUCFlag446);
                    this_Port_0=rulePort();

                    state._fsp--;

                     
                            current = this_Port_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:204:5: this_User_1= ruleUser
                    {
                     
                            newCompositeNode(grammarAccess.getPUCFlagAccess().getUserParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUser_in_rulePUCFlag473);
                    this_User_1=ruleUser();

                    state._fsp--;

                     
                            current = this_User_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:214:5: this_Client_2= ruleClient
                    {
                     
                            newCompositeNode(grammarAccess.getPUCFlagAccess().getClientParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleClient_in_rulePUCFlag500);
                    this_Client_2=ruleClient();

                    state._fsp--;

                     
                            current = this_Client_2; 
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
    // $ANTLR end "rulePUCFlag"


    // $ANTLR start "entryRulePort"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:230:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:231:2: (iv_rulePort= rulePort EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:232:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort535);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort545); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:239:1: rulePort returns [EObject current=null] : (otherlv_0= '-p' ( (lv_name_1_0= ruleP4PORT ) ) ( (lv_p4command_2_0= ruleP4Command ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_p4command_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:242:28: ( (otherlv_0= '-p' ( (lv_name_1_0= ruleP4PORT ) ) ( (lv_p4command_2_0= ruleP4Command ) ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:243:1: (otherlv_0= '-p' ( (lv_name_1_0= ruleP4PORT ) ) ( (lv_p4command_2_0= ruleP4Command ) ) )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:243:1: (otherlv_0= '-p' ( (lv_name_1_0= ruleP4PORT ) ) ( (lv_p4command_2_0= ruleP4Command ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:243:3: otherlv_0= '-p' ( (lv_name_1_0= ruleP4PORT ) ) ( (lv_p4command_2_0= ruleP4Command ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePort582); 

                	newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPKeyword_0());
                
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:247:1: ( (lv_name_1_0= ruleP4PORT ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:248:1: (lv_name_1_0= ruleP4PORT )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:248:1: (lv_name_1_0= ruleP4PORT )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:249:3: lv_name_1_0= ruleP4PORT
            {
             
            	        newCompositeNode(grammarAccess.getPortAccess().getNameP4PORTParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleP4PORT_in_rulePort603);
            lv_name_1_0=ruleP4PORT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPortRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"P4PORT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:265:2: ( (lv_p4command_2_0= ruleP4Command ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:266:1: (lv_p4command_2_0= ruleP4Command )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:266:1: (lv_p4command_2_0= ruleP4Command )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:267:3: lv_p4command_2_0= ruleP4Command
            {
             
            	        newCompositeNode(grammarAccess.getPortAccess().getP4commandP4CommandParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleP4Command_in_rulePort624);
            lv_p4command_2_0=ruleP4Command();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPortRule());
            	        }
                   		add(
                   			current, 
                   			"p4command",
                    		lv_p4command_2_0, 
                    		"P4Command");
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleUser"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:291:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:292:2: (iv_ruleUser= ruleUser EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:293:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser660);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser670); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:300:1: ruleUser returns [EObject current=null] : (otherlv_0= '-u' ( (lv_name_1_0= RULE_ID ) ) ( (lv_p4command_2_0= ruleP4Command ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_p4command_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:303:28: ( (otherlv_0= '-u' ( (lv_name_1_0= RULE_ID ) ) ( (lv_p4command_2_0= ruleP4Command ) ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:304:1: (otherlv_0= '-u' ( (lv_name_1_0= RULE_ID ) ) ( (lv_p4command_2_0= ruleP4Command ) ) )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:304:1: (otherlv_0= '-u' ( (lv_name_1_0= RULE_ID ) ) ( (lv_p4command_2_0= ruleP4Command ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:304:3: otherlv_0= '-u' ( (lv_name_1_0= RULE_ID ) ) ( (lv_p4command_2_0= ruleP4Command ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleUser707); 

                	newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUKeyword_0());
                
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:308:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:309:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:309:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:310:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser724); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUserRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:326:2: ( (lv_p4command_2_0= ruleP4Command ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:327:1: (lv_p4command_2_0= ruleP4Command )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:327:1: (lv_p4command_2_0= ruleP4Command )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:328:3: lv_p4command_2_0= ruleP4Command
            {
             
            	        newCompositeNode(grammarAccess.getUserAccess().getP4commandP4CommandParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleP4Command_in_ruleUser750);
            lv_p4command_2_0=ruleP4Command();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUserRule());
            	        }
                   		add(
                   			current, 
                   			"p4command",
                    		lv_p4command_2_0, 
                    		"P4Command");
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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleClient"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:352:1: entryRuleClient returns [EObject current=null] : iv_ruleClient= ruleClient EOF ;
    public final EObject entryRuleClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClient = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:353:2: (iv_ruleClient= ruleClient EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:354:2: iv_ruleClient= ruleClient EOF
            {
             newCompositeNode(grammarAccess.getClientRule()); 
            pushFollow(FOLLOW_ruleClient_in_entryRuleClient786);
            iv_ruleClient=ruleClient();

            state._fsp--;

             current =iv_ruleClient; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClient796); 

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
    // $ANTLR end "entryRuleClient"


    // $ANTLR start "ruleClient"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:361:1: ruleClient returns [EObject current=null] : (otherlv_0= '-c' ( (lv_name_1_0= RULE_ID ) ) ( (lv_p4command_2_0= ruleP4Command ) ) ) ;
    public final EObject ruleClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_p4command_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:364:28: ( (otherlv_0= '-c' ( (lv_name_1_0= RULE_ID ) ) ( (lv_p4command_2_0= ruleP4Command ) ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:365:1: (otherlv_0= '-c' ( (lv_name_1_0= RULE_ID ) ) ( (lv_p4command_2_0= ruleP4Command ) ) )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:365:1: (otherlv_0= '-c' ( (lv_name_1_0= RULE_ID ) ) ( (lv_p4command_2_0= ruleP4Command ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:365:3: otherlv_0= '-c' ( (lv_name_1_0= RULE_ID ) ) ( (lv_p4command_2_0= ruleP4Command ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleClient833); 

                	newLeafNode(otherlv_0, grammarAccess.getClientAccess().getCKeyword_0());
                
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:369:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:370:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:370:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:371:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClient850); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:387:2: ( (lv_p4command_2_0= ruleP4Command ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:388:1: (lv_p4command_2_0= ruleP4Command )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:388:1: (lv_p4command_2_0= ruleP4Command )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:389:3: lv_p4command_2_0= ruleP4Command
            {
             
            	        newCompositeNode(grammarAccess.getClientAccess().getP4commandP4CommandParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleP4Command_in_ruleClient876);
            lv_p4command_2_0=ruleP4Command();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClientRule());
            	        }
                   		add(
                   			current, 
                   			"p4command",
                    		lv_p4command_2_0, 
                    		"P4Command");
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
    // $ANTLR end "ruleClient"


    // $ANTLR start "entryRuleFileBasedCommand"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:413:1: entryRuleFileBasedCommand returns [EObject current=null] : iv_ruleFileBasedCommand= ruleFileBasedCommand EOF ;
    public final EObject entryRuleFileBasedCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileBasedCommand = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:414:2: (iv_ruleFileBasedCommand= ruleFileBasedCommand EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:415:2: iv_ruleFileBasedCommand= ruleFileBasedCommand EOF
            {
             newCompositeNode(grammarAccess.getFileBasedCommandRule()); 
            pushFollow(FOLLOW_ruleFileBasedCommand_in_entryRuleFileBasedCommand912);
            iv_ruleFileBasedCommand=ruleFileBasedCommand();

            state._fsp--;

             current =iv_ruleFileBasedCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileBasedCommand922); 

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
    // $ANTLR end "entryRuleFileBasedCommand"


    // $ANTLR start "ruleFileBasedCommand"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:422:1: ruleFileBasedCommand returns [EObject current=null] : (this_Add_0= ruleAdd | this_Edit_1= ruleEdit | this_Delete_2= ruleDelete ) ;
    public final EObject ruleFileBasedCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Edit_1 = null;

        EObject this_Delete_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:425:28: ( (this_Add_0= ruleAdd | this_Edit_1= ruleEdit | this_Delete_2= ruleDelete ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:426:1: (this_Add_0= ruleAdd | this_Edit_1= ruleEdit | this_Delete_2= ruleDelete )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:426:1: (this_Add_0= ruleAdd | this_Edit_1= ruleEdit | this_Delete_2= ruleDelete )
            int alt4=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:427:5: this_Add_0= ruleAdd
                    {
                     
                            newCompositeNode(grammarAccess.getFileBasedCommandAccess().getAddParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAdd_in_ruleFileBasedCommand969);
                    this_Add_0=ruleAdd();

                    state._fsp--;

                     
                            current = this_Add_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:437:5: this_Edit_1= ruleEdit
                    {
                     
                            newCompositeNode(grammarAccess.getFileBasedCommandAccess().getEditParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEdit_in_ruleFileBasedCommand996);
                    this_Edit_1=ruleEdit();

                    state._fsp--;

                     
                            current = this_Edit_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:447:5: this_Delete_2= ruleDelete
                    {
                     
                            newCompositeNode(grammarAccess.getFileBasedCommandAccess().getDeleteParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDelete_in_ruleFileBasedCommand1023);
                    this_Delete_2=ruleDelete();

                    state._fsp--;

                     
                            current = this_Delete_2; 
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
    // $ANTLR end "ruleFileBasedCommand"


    // $ANTLR start "entryRuleAdd"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:463:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:464:2: (iv_ruleAdd= ruleAdd EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:465:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_ruleAdd_in_entryRuleAdd1058);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdd1068); 

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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:472:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'add' ( (lv_name_1_0= ruleFILE ) ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:475:28: ( (otherlv_0= 'add' ( (lv_name_1_0= ruleFILE ) ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:476:1: (otherlv_0= 'add' ( (lv_name_1_0= ruleFILE ) ) )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:476:1: (otherlv_0= 'add' ( (lv_name_1_0= ruleFILE ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:476:3: otherlv_0= 'add' ( (lv_name_1_0= ruleFILE ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleAdd1105); 

                	newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
                
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:480:1: ( (lv_name_1_0= ruleFILE ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:481:1: (lv_name_1_0= ruleFILE )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:481:1: (lv_name_1_0= ruleFILE )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:482:3: lv_name_1_0= ruleFILE
            {
             
            	        newCompositeNode(grammarAccess.getAddAccess().getNameFILEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFILE_in_ruleAdd1126);
            lv_name_1_0=ruleFILE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAddRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FILE");
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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleEdit"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:506:1: entryRuleEdit returns [EObject current=null] : iv_ruleEdit= ruleEdit EOF ;
    public final EObject entryRuleEdit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdit = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:507:2: (iv_ruleEdit= ruleEdit EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:508:2: iv_ruleEdit= ruleEdit EOF
            {
             newCompositeNode(grammarAccess.getEditRule()); 
            pushFollow(FOLLOW_ruleEdit_in_entryRuleEdit1162);
            iv_ruleEdit=ruleEdit();

            state._fsp--;

             current =iv_ruleEdit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdit1172); 

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
    // $ANTLR end "entryRuleEdit"


    // $ANTLR start "ruleEdit"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:515:1: ruleEdit returns [EObject current=null] : (otherlv_0= 'edit' ( (lv_name_1_0= ruleFILE ) ) ) ;
    public final EObject ruleEdit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:518:28: ( (otherlv_0= 'edit' ( (lv_name_1_0= ruleFILE ) ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:519:1: (otherlv_0= 'edit' ( (lv_name_1_0= ruleFILE ) ) )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:519:1: (otherlv_0= 'edit' ( (lv_name_1_0= ruleFILE ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:519:3: otherlv_0= 'edit' ( (lv_name_1_0= ruleFILE ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleEdit1209); 

                	newLeafNode(otherlv_0, grammarAccess.getEditAccess().getEditKeyword_0());
                
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:523:1: ( (lv_name_1_0= ruleFILE ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:524:1: (lv_name_1_0= ruleFILE )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:524:1: (lv_name_1_0= ruleFILE )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:525:3: lv_name_1_0= ruleFILE
            {
             
            	        newCompositeNode(grammarAccess.getEditAccess().getNameFILEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFILE_in_ruleEdit1230);
            lv_name_1_0=ruleFILE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEditRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FILE");
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
    // $ANTLR end "ruleEdit"


    // $ANTLR start "entryRuleDelete"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:549:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:550:2: (iv_ruleDelete= ruleDelete EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:551:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_ruleDelete_in_entryRuleDelete1266);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelete1276); 

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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:558:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'delete' ( (lv_name_1_0= ruleFILE ) ) ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:561:28: ( (otherlv_0= 'delete' ( (lv_name_1_0= ruleFILE ) ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:562:1: (otherlv_0= 'delete' ( (lv_name_1_0= ruleFILE ) ) )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:562:1: (otherlv_0= 'delete' ( (lv_name_1_0= ruleFILE ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:562:3: otherlv_0= 'delete' ( (lv_name_1_0= ruleFILE ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDelete1313); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
                
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:566:1: ( (lv_name_1_0= ruleFILE ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:567:1: (lv_name_1_0= ruleFILE )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:567:1: (lv_name_1_0= ruleFILE )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:568:3: lv_name_1_0= ruleFILE
            {
             
            	        newCompositeNode(grammarAccess.getDeleteAccess().getNameFILEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFILE_in_ruleDelete1334);
            lv_name_1_0=ruleFILE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeleteRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FILE");
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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleP4PORT"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:592:1: entryRuleP4PORT returns [String current=null] : iv_ruleP4PORT= ruleP4PORT EOF ;
    public final String entryRuleP4PORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleP4PORT = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:593:2: (iv_ruleP4PORT= ruleP4PORT EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:594:2: iv_ruleP4PORT= ruleP4PORT EOF
            {
             newCompositeNode(grammarAccess.getP4PORTRule()); 
            pushFollow(FOLLOW_ruleP4PORT_in_entryRuleP4PORT1371);
            iv_ruleP4PORT=ruleP4PORT();

            state._fsp--;

             current =iv_ruleP4PORT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleP4PORT1382); 

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
    // $ANTLR end "entryRuleP4PORT"


    // $ANTLR start "ruleP4PORT"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:601:1: ruleP4PORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= ':' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleP4PORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:604:28: ( (this_ID_0= RULE_ID kw= ':' this_INT_2= RULE_INT ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:605:1: (this_ID_0= RULE_ID kw= ':' this_INT_2= RULE_INT )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:605:1: (this_ID_0= RULE_ID kw= ':' this_INT_2= RULE_INT )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:605:6: this_ID_0= RULE_ID kw= ':' this_INT_2= RULE_INT
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleP4PORT1422); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getP4PORTAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,18,FOLLOW_18_in_ruleP4PORT1440); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getP4PORTAccess().getColonKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleP4PORT1455); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getP4PORTAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleP4PORT"


    // $ANTLR start "entryRuleFILE"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:633:1: entryRuleFILE returns [String current=null] : iv_ruleFILE= ruleFILE EOF ;
    public final String entryRuleFILE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFILE = null;


        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:634:2: (iv_ruleFILE= ruleFILE EOF )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:635:2: iv_ruleFILE= ruleFILE EOF
            {
             newCompositeNode(grammarAccess.getFILERule()); 
            pushFollow(FOLLOW_ruleFILE_in_entryRuleFILE1501);
            iv_ruleFILE=ruleFILE();

            state._fsp--;

             current =iv_ruleFILE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFILE1512); 

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
    // $ANTLR end "entryRuleFILE"


    // $ANTLR start "ruleFILE"
    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:642:1: ruleFILE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleFILE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:645:28: ( (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) ) )
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:646:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) )
            {
            // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:646:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==11) ) {
                    alt5=1;
                }
                else if ( (LA5_1==19) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:646:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFILE1552); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getFILEAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:654:6: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    {
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:654:6: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    // ../org.xtext.example.p4dsl/src-gen/org/xtext/example/p4dsl/parser/antlr/internal/InternalP4Dsl.g:654:11: this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFILE1579); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getFILEAccess().getIDTerminalRuleCall_1_0()); 
                        
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleFILE1597); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFILEAccess().getFullStopKeyword_1_1()); 
                        
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFILE1612); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getFILEAccess().getIDTerminalRuleCall_1_2()); 
                        

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
    // $ANTLR end "ruleFILE"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCommand213 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_ruleP4Command_in_ruleCommand235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP4Command_in_entryRuleP4Command270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleP4Command280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePUCFlag_in_ruleP4Command327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileBasedCommand_in_ruleP4Command354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePUCFlag_in_entryRulePUCFlag389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePUCFlag399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rulePUCFlag446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rulePUCFlag473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_rulePUCFlag500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePort582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleP4PORT_in_rulePort603 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_ruleP4Command_in_rulePort624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleUser707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser724 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_ruleP4Command_in_ruleUser750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_entryRuleClient786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClient796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleClient833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClient850 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_ruleP4Command_in_ruleClient876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileBasedCommand_in_entryRuleFileBasedCommand912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileBasedCommand922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_ruleFileBasedCommand969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdit_in_ruleFileBasedCommand996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelete_in_ruleFileBasedCommand1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_entryRuleAdd1058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdd1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAdd1105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFILE_in_ruleAdd1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdit_in_entryRuleEdit1162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdit1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEdit1209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFILE_in_ruleEdit1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelete1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDelete1313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFILE_in_ruleDelete1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP4PORT_in_entryRuleP4PORT1371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleP4PORT1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleP4PORT1422 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleP4PORT1440 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleP4PORT1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFILE_in_entryRuleFILE1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFILE1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFILE1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFILE1579 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFILE1597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFILE1612 = new BitSet(new long[]{0x0000000000000002L});

}