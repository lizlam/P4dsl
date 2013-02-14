package org.xtext.example.p4dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.p4dsl.services.P4DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalP4DslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g"; }


     
     	private P4DslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(P4DslGrammarAccess grammarAccess) {
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
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:69:1: ruleModel : ( ( rule__Model__CommandAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:73:2: ( ( ( rule__Model__CommandAssignment )* ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:74:1: ( ( rule__Model__CommandAssignment )* )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:74:1: ( ( rule__Model__CommandAssignment )* )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:75:1: ( rule__Model__CommandAssignment )*
            {
             before(grammarAccess.getModelAccess().getCommandAssignment()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:76:1: ( rule__Model__CommandAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:76:2: rule__Model__CommandAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__CommandAssignment_in_ruleModel94);
            	    rule__Model__CommandAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCommandAssignment()); 

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


    // $ANTLR start "entryRuleCommand"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:88:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:89:1: ( ruleCommand EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:90:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand122);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand129); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:97:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:101:2: ( ( ( rule__Command__Group__0 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:102:1: ( ( rule__Command__Group__0 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:102:1: ( ( rule__Command__Group__0 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:103:1: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:104:1: ( rule__Command__Group__0 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:104:2: rule__Command__Group__0
            {
            pushFollow(FOLLOW_rule__Command__Group__0_in_ruleCommand155);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleP4Command"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:116:1: entryRuleP4Command : ruleP4Command EOF ;
    public final void entryRuleP4Command() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:117:1: ( ruleP4Command EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:118:1: ruleP4Command EOF
            {
             before(grammarAccess.getP4CommandRule()); 
            pushFollow(FOLLOW_ruleP4Command_in_entryRuleP4Command182);
            ruleP4Command();

            state._fsp--;

             after(grammarAccess.getP4CommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleP4Command189); 

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
    // $ANTLR end "entryRuleP4Command"


    // $ANTLR start "ruleP4Command"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:125:1: ruleP4Command : ( ( rule__P4Command__Alternatives ) ) ;
    public final void ruleP4Command() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:129:2: ( ( ( rule__P4Command__Alternatives ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:130:1: ( ( rule__P4Command__Alternatives ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:130:1: ( ( rule__P4Command__Alternatives ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:131:1: ( rule__P4Command__Alternatives )
            {
             before(grammarAccess.getP4CommandAccess().getAlternatives()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:132:1: ( rule__P4Command__Alternatives )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:132:2: rule__P4Command__Alternatives
            {
            pushFollow(FOLLOW_rule__P4Command__Alternatives_in_ruleP4Command215);
            rule__P4Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getP4CommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleP4Command"


    // $ANTLR start "entryRulePUCFlag"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:144:1: entryRulePUCFlag : rulePUCFlag EOF ;
    public final void entryRulePUCFlag() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:145:1: ( rulePUCFlag EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:146:1: rulePUCFlag EOF
            {
             before(grammarAccess.getPUCFlagRule()); 
            pushFollow(FOLLOW_rulePUCFlag_in_entryRulePUCFlag242);
            rulePUCFlag();

            state._fsp--;

             after(grammarAccess.getPUCFlagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePUCFlag249); 

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
    // $ANTLR end "entryRulePUCFlag"


    // $ANTLR start "rulePUCFlag"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:153:1: rulePUCFlag : ( ( rule__PUCFlag__Alternatives ) ) ;
    public final void rulePUCFlag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:157:2: ( ( ( rule__PUCFlag__Alternatives ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:158:1: ( ( rule__PUCFlag__Alternatives ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:158:1: ( ( rule__PUCFlag__Alternatives ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:159:1: ( rule__PUCFlag__Alternatives )
            {
             before(grammarAccess.getPUCFlagAccess().getAlternatives()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:160:1: ( rule__PUCFlag__Alternatives )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:160:2: rule__PUCFlag__Alternatives
            {
            pushFollow(FOLLOW_rule__PUCFlag__Alternatives_in_rulePUCFlag275);
            rule__PUCFlag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPUCFlagAccess().getAlternatives()); 

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
    // $ANTLR end "rulePUCFlag"


    // $ANTLR start "entryRulePort"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:172:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:173:1: ( rulePort EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:174:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort302);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort309); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:181:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:185:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:186:1: ( ( rule__Port__Group__0 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:186:1: ( ( rule__Port__Group__0 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:187:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:188:1: ( rule__Port__Group__0 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:188:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort335);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleUser"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:200:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:201:1: ( ruleUser EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:202:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser362);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser369); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:209:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:213:2: ( ( ( rule__User__Group__0 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:214:1: ( ( rule__User__Group__0 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:214:1: ( ( rule__User__Group__0 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:215:1: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:216:1: ( rule__User__Group__0 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:216:2: rule__User__Group__0
            {
            pushFollow(FOLLOW_rule__User__Group__0_in_ruleUser395);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleClient"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:228:1: entryRuleClient : ruleClient EOF ;
    public final void entryRuleClient() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:229:1: ( ruleClient EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:230:1: ruleClient EOF
            {
             before(grammarAccess.getClientRule()); 
            pushFollow(FOLLOW_ruleClient_in_entryRuleClient422);
            ruleClient();

            state._fsp--;

             after(grammarAccess.getClientRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClient429); 

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
    // $ANTLR end "entryRuleClient"


    // $ANTLR start "ruleClient"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:237:1: ruleClient : ( ( rule__Client__Group__0 ) ) ;
    public final void ruleClient() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:241:2: ( ( ( rule__Client__Group__0 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:242:1: ( ( rule__Client__Group__0 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:242:1: ( ( rule__Client__Group__0 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:243:1: ( rule__Client__Group__0 )
            {
             before(grammarAccess.getClientAccess().getGroup()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:244:1: ( rule__Client__Group__0 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:244:2: rule__Client__Group__0
            {
            pushFollow(FOLLOW_rule__Client__Group__0_in_ruleClient455);
            rule__Client__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClientAccess().getGroup()); 

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
    // $ANTLR end "ruleClient"


    // $ANTLR start "entryRuleFileBasedCommand"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:256:1: entryRuleFileBasedCommand : ruleFileBasedCommand EOF ;
    public final void entryRuleFileBasedCommand() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:257:1: ( ruleFileBasedCommand EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:258:1: ruleFileBasedCommand EOF
            {
             before(grammarAccess.getFileBasedCommandRule()); 
            pushFollow(FOLLOW_ruleFileBasedCommand_in_entryRuleFileBasedCommand482);
            ruleFileBasedCommand();

            state._fsp--;

             after(grammarAccess.getFileBasedCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileBasedCommand489); 

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
    // $ANTLR end "entryRuleFileBasedCommand"


    // $ANTLR start "ruleFileBasedCommand"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:265:1: ruleFileBasedCommand : ( ( rule__FileBasedCommand__Alternatives ) ) ;
    public final void ruleFileBasedCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:269:2: ( ( ( rule__FileBasedCommand__Alternatives ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:270:1: ( ( rule__FileBasedCommand__Alternatives ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:270:1: ( ( rule__FileBasedCommand__Alternatives ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:271:1: ( rule__FileBasedCommand__Alternatives )
            {
             before(grammarAccess.getFileBasedCommandAccess().getAlternatives()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:272:1: ( rule__FileBasedCommand__Alternatives )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:272:2: rule__FileBasedCommand__Alternatives
            {
            pushFollow(FOLLOW_rule__FileBasedCommand__Alternatives_in_ruleFileBasedCommand515);
            rule__FileBasedCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFileBasedCommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFileBasedCommand"


    // $ANTLR start "entryRuleAdd"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:284:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:285:1: ( ruleAdd EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:286:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_ruleAdd_in_entryRuleAdd542);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdd549); 

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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:293:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:297:2: ( ( ( rule__Add__Group__0 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:298:1: ( ( rule__Add__Group__0 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:298:1: ( ( rule__Add__Group__0 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:299:1: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:300:1: ( rule__Add__Group__0 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:300:2: rule__Add__Group__0
            {
            pushFollow(FOLLOW_rule__Add__Group__0_in_ruleAdd575);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleEdit"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:312:1: entryRuleEdit : ruleEdit EOF ;
    public final void entryRuleEdit() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:313:1: ( ruleEdit EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:314:1: ruleEdit EOF
            {
             before(grammarAccess.getEditRule()); 
            pushFollow(FOLLOW_ruleEdit_in_entryRuleEdit602);
            ruleEdit();

            state._fsp--;

             after(grammarAccess.getEditRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdit609); 

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
    // $ANTLR end "entryRuleEdit"


    // $ANTLR start "ruleEdit"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:321:1: ruleEdit : ( ( rule__Edit__Group__0 ) ) ;
    public final void ruleEdit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:325:2: ( ( ( rule__Edit__Group__0 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:326:1: ( ( rule__Edit__Group__0 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:326:1: ( ( rule__Edit__Group__0 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:327:1: ( rule__Edit__Group__0 )
            {
             before(grammarAccess.getEditAccess().getGroup()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:328:1: ( rule__Edit__Group__0 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:328:2: rule__Edit__Group__0
            {
            pushFollow(FOLLOW_rule__Edit__Group__0_in_ruleEdit635);
            rule__Edit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEditAccess().getGroup()); 

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
    // $ANTLR end "ruleEdit"


    // $ANTLR start "entryRuleDelete"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:340:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:341:1: ( ruleDelete EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:342:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_ruleDelete_in_entryRuleDelete662);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelete669); 

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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:349:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:353:2: ( ( ( rule__Delete__Group__0 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:354:1: ( ( rule__Delete__Group__0 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:354:1: ( ( rule__Delete__Group__0 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:355:1: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:356:1: ( rule__Delete__Group__0 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:356:2: rule__Delete__Group__0
            {
            pushFollow(FOLLOW_rule__Delete__Group__0_in_ruleDelete695);
            rule__Delete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getGroup()); 

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleP4PORT"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:368:1: entryRuleP4PORT : ruleP4PORT EOF ;
    public final void entryRuleP4PORT() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:369:1: ( ruleP4PORT EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:370:1: ruleP4PORT EOF
            {
             before(grammarAccess.getP4PORTRule()); 
            pushFollow(FOLLOW_ruleP4PORT_in_entryRuleP4PORT722);
            ruleP4PORT();

            state._fsp--;

             after(grammarAccess.getP4PORTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleP4PORT729); 

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
    // $ANTLR end "entryRuleP4PORT"


    // $ANTLR start "ruleP4PORT"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:377:1: ruleP4PORT : ( ( rule__P4PORT__Group__0 ) ) ;
    public final void ruleP4PORT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:381:2: ( ( ( rule__P4PORT__Group__0 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:382:1: ( ( rule__P4PORT__Group__0 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:382:1: ( ( rule__P4PORT__Group__0 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:383:1: ( rule__P4PORT__Group__0 )
            {
             before(grammarAccess.getP4PORTAccess().getGroup()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:384:1: ( rule__P4PORT__Group__0 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:384:2: rule__P4PORT__Group__0
            {
            pushFollow(FOLLOW_rule__P4PORT__Group__0_in_ruleP4PORT755);
            rule__P4PORT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getP4PORTAccess().getGroup()); 

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
    // $ANTLR end "ruleP4PORT"


    // $ANTLR start "entryRuleFILE"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:396:1: entryRuleFILE : ruleFILE EOF ;
    public final void entryRuleFILE() throws RecognitionException {
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:397:1: ( ruleFILE EOF )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:398:1: ruleFILE EOF
            {
             before(grammarAccess.getFILERule()); 
            pushFollow(FOLLOW_ruleFILE_in_entryRuleFILE782);
            ruleFILE();

            state._fsp--;

             after(grammarAccess.getFILERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFILE789); 

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
    // $ANTLR end "entryRuleFILE"


    // $ANTLR start "ruleFILE"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:405:1: ruleFILE : ( ( rule__FILE__Alternatives ) ) ;
    public final void ruleFILE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:409:2: ( ( ( rule__FILE__Alternatives ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:410:1: ( ( rule__FILE__Alternatives ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:410:1: ( ( rule__FILE__Alternatives ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:411:1: ( rule__FILE__Alternatives )
            {
             before(grammarAccess.getFILEAccess().getAlternatives()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:412:1: ( rule__FILE__Alternatives )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:412:2: rule__FILE__Alternatives
            {
            pushFollow(FOLLOW_rule__FILE__Alternatives_in_ruleFILE815);
            rule__FILE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFILEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFILE"


    // $ANTLR start "rule__P4Command__Alternatives"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:424:1: rule__P4Command__Alternatives : ( ( rulePUCFlag ) | ( ruleFileBasedCommand ) );
    public final void rule__P4Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:428:1: ( ( rulePUCFlag ) | ( ruleFileBasedCommand ) )
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
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:429:1: ( rulePUCFlag )
                    {
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:429:1: ( rulePUCFlag )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:430:1: rulePUCFlag
                    {
                     before(grammarAccess.getP4CommandAccess().getPUCFlagParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePUCFlag_in_rule__P4Command__Alternatives851);
                    rulePUCFlag();

                    state._fsp--;

                     after(grammarAccess.getP4CommandAccess().getPUCFlagParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:435:6: ( ruleFileBasedCommand )
                    {
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:435:6: ( ruleFileBasedCommand )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:436:1: ruleFileBasedCommand
                    {
                     before(grammarAccess.getP4CommandAccess().getFileBasedCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFileBasedCommand_in_rule__P4Command__Alternatives868);
                    ruleFileBasedCommand();

                    state._fsp--;

                     after(grammarAccess.getP4CommandAccess().getFileBasedCommandParserRuleCall_1()); 

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
    // $ANTLR end "rule__P4Command__Alternatives"


    // $ANTLR start "rule__PUCFlag__Alternatives"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:446:1: rule__PUCFlag__Alternatives : ( ( rulePort ) | ( ruleUser ) | ( ruleClient ) );
    public final void rule__PUCFlag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:450:1: ( ( rulePort ) | ( ruleUser ) | ( ruleClient ) )
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
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:451:1: ( rulePort )
                    {
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:451:1: ( rulePort )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:452:1: rulePort
                    {
                     before(grammarAccess.getPUCFlagAccess().getPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePort_in_rule__PUCFlag__Alternatives900);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getPUCFlagAccess().getPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:457:6: ( ruleUser )
                    {
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:457:6: ( ruleUser )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:458:1: ruleUser
                    {
                     before(grammarAccess.getPUCFlagAccess().getUserParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUser_in_rule__PUCFlag__Alternatives917);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getPUCFlagAccess().getUserParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:463:6: ( ruleClient )
                    {
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:463:6: ( ruleClient )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:464:1: ruleClient
                    {
                     before(grammarAccess.getPUCFlagAccess().getClientParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleClient_in_rule__PUCFlag__Alternatives934);
                    ruleClient();

                    state._fsp--;

                     after(grammarAccess.getPUCFlagAccess().getClientParserRuleCall_2()); 

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
    // $ANTLR end "rule__PUCFlag__Alternatives"


    // $ANTLR start "rule__FileBasedCommand__Alternatives"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:474:1: rule__FileBasedCommand__Alternatives : ( ( ruleAdd ) | ( ruleEdit ) | ( ruleDelete ) );
    public final void rule__FileBasedCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:478:1: ( ( ruleAdd ) | ( ruleEdit ) | ( ruleDelete ) )
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
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:479:1: ( ruleAdd )
                    {
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:479:1: ( ruleAdd )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:480:1: ruleAdd
                    {
                     before(grammarAccess.getFileBasedCommandAccess().getAddParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAdd_in_rule__FileBasedCommand__Alternatives966);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getFileBasedCommandAccess().getAddParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:485:6: ( ruleEdit )
                    {
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:485:6: ( ruleEdit )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:486:1: ruleEdit
                    {
                     before(grammarAccess.getFileBasedCommandAccess().getEditParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEdit_in_rule__FileBasedCommand__Alternatives983);
                    ruleEdit();

                    state._fsp--;

                     after(grammarAccess.getFileBasedCommandAccess().getEditParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:491:6: ( ruleDelete )
                    {
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:491:6: ( ruleDelete )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:492:1: ruleDelete
                    {
                     before(grammarAccess.getFileBasedCommandAccess().getDeleteParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDelete_in_rule__FileBasedCommand__Alternatives1000);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getFileBasedCommandAccess().getDeleteParserRuleCall_2()); 

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
    // $ANTLR end "rule__FileBasedCommand__Alternatives"


    // $ANTLR start "rule__FILE__Alternatives"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:502:1: rule__FILE__Alternatives : ( ( RULE_ID ) | ( ( rule__FILE__Group_1__0 ) ) );
    public final void rule__FILE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:506:1: ( ( RULE_ID ) | ( ( rule__FILE__Group_1__0 ) ) )
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
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:507:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:507:1: ( RULE_ID )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:508:1: RULE_ID
                    {
                     before(grammarAccess.getFILEAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FILE__Alternatives1032); 
                     after(grammarAccess.getFILEAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:513:6: ( ( rule__FILE__Group_1__0 ) )
                    {
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:513:6: ( ( rule__FILE__Group_1__0 ) )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:514:1: ( rule__FILE__Group_1__0 )
                    {
                     before(grammarAccess.getFILEAccess().getGroup_1()); 
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:515:1: ( rule__FILE__Group_1__0 )
                    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:515:2: rule__FILE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FILE__Group_1__0_in_rule__FILE__Alternatives1049);
                    rule__FILE__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFILEAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FILE__Alternatives"


    // $ANTLR start "rule__Command__Group__0"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:526:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:530:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:531:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__01080);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__01083);
            rule__Command__Group__1();

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
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:538:1: rule__Command__Group__0__Impl : ( 'p4' ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:542:1: ( ( 'p4' ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:543:1: ( 'p4' )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:543:1: ( 'p4' )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:544:1: 'p4'
            {
             before(grammarAccess.getCommandAccess().getP4Keyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Command__Group__0__Impl1111); 
             after(grammarAccess.getCommandAccess().getP4Keyword_0()); 

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
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:557:1: rule__Command__Group__1 : rule__Command__Group__1__Impl ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:561:1: ( rule__Command__Group__1__Impl )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:562:2: rule__Command__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__11142);
            rule__Command__Group__1__Impl();

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
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:568:1: rule__Command__Group__1__Impl : ( ruleP4Command ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:572:1: ( ( ruleP4Command ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:573:1: ( ruleP4Command )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:573:1: ( ruleP4Command )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:574:1: ruleP4Command
            {
             before(grammarAccess.getCommandAccess().getP4CommandParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleP4Command_in_rule__Command__Group__1__Impl1169);
            ruleP4Command();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getP4CommandParserRuleCall_1()); 

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
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:589:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:593:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:594:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__01202);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__01205);
            rule__Port__Group__1();

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
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:601:1: rule__Port__Group__0__Impl : ( '-p' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:605:1: ( ( '-p' ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:606:1: ( '-p' )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:606:1: ( '-p' )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:607:1: '-p'
            {
             before(grammarAccess.getPortAccess().getPKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Port__Group__0__Impl1233); 
             after(grammarAccess.getPortAccess().getPKeyword_0()); 

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
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:620:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:624:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:625:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__11264);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__2_in_rule__Port__Group__11267);
            rule__Port__Group__2();

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
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:632:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:636:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:637:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:637:1: ( ( rule__Port__NameAssignment_1 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:638:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:639:1: ( rule__Port__NameAssignment_1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:639:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl1294);
            rule__Port__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:649:1: rule__Port__Group__2 : rule__Port__Group__2__Impl ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:653:1: ( rule__Port__Group__2__Impl )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:654:2: rule__Port__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__21324);
            rule__Port__Group__2__Impl();

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
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:660:1: rule__Port__Group__2__Impl : ( ( rule__Port__P4commandAssignment_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:664:1: ( ( ( rule__Port__P4commandAssignment_2 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:665:1: ( ( rule__Port__P4commandAssignment_2 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:665:1: ( ( rule__Port__P4commandAssignment_2 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:666:1: ( rule__Port__P4commandAssignment_2 )
            {
             before(grammarAccess.getPortAccess().getP4commandAssignment_2()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:667:1: ( rule__Port__P4commandAssignment_2 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:667:2: rule__Port__P4commandAssignment_2
            {
            pushFollow(FOLLOW_rule__Port__P4commandAssignment_2_in_rule__Port__Group__2__Impl1351);
            rule__Port__P4commandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getP4commandAssignment_2()); 

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
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__User__Group__0"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:683:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:687:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:688:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01387);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__1_in_rule__User__Group__01390);
            rule__User__Group__1();

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
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:695:1: rule__User__Group__0__Impl : ( '-u' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:699:1: ( ( '-u' ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:700:1: ( '-u' )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:700:1: ( '-u' )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:701:1: '-u'
            {
             before(grammarAccess.getUserAccess().getUKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__User__Group__0__Impl1418); 
             after(grammarAccess.getUserAccess().getUKeyword_0()); 

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
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:714:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:718:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:719:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11449);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__2_in_rule__User__Group__11452);
            rule__User__Group__2();

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
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:726:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:730:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:731:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:731:1: ( ( rule__User__NameAssignment_1 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:732:1: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:733:1: ( rule__User__NameAssignment_1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:733:2: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1479);
            rule__User__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__User__Group__2"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:743:1: rule__User__Group__2 : rule__User__Group__2__Impl ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:747:1: ( rule__User__Group__2__Impl )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:748:2: rule__User__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__21509);
            rule__User__Group__2__Impl();

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
    // $ANTLR end "rule__User__Group__2"


    // $ANTLR start "rule__User__Group__2__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:754:1: rule__User__Group__2__Impl : ( ( rule__User__P4commandAssignment_2 ) ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:758:1: ( ( ( rule__User__P4commandAssignment_2 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:759:1: ( ( rule__User__P4commandAssignment_2 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:759:1: ( ( rule__User__P4commandAssignment_2 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:760:1: ( rule__User__P4commandAssignment_2 )
            {
             before(grammarAccess.getUserAccess().getP4commandAssignment_2()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:761:1: ( rule__User__P4commandAssignment_2 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:761:2: rule__User__P4commandAssignment_2
            {
            pushFollow(FOLLOW_rule__User__P4commandAssignment_2_in_rule__User__Group__2__Impl1536);
            rule__User__P4commandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getP4commandAssignment_2()); 

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
    // $ANTLR end "rule__User__Group__2__Impl"


    // $ANTLR start "rule__Client__Group__0"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:777:1: rule__Client__Group__0 : rule__Client__Group__0__Impl rule__Client__Group__1 ;
    public final void rule__Client__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:781:1: ( rule__Client__Group__0__Impl rule__Client__Group__1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:782:2: rule__Client__Group__0__Impl rule__Client__Group__1
            {
            pushFollow(FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__01572);
            rule__Client__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__1_in_rule__Client__Group__01575);
            rule__Client__Group__1();

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
    // $ANTLR end "rule__Client__Group__0"


    // $ANTLR start "rule__Client__Group__0__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:789:1: rule__Client__Group__0__Impl : ( '-c' ) ;
    public final void rule__Client__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:793:1: ( ( '-c' ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:794:1: ( '-c' )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:794:1: ( '-c' )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:795:1: '-c'
            {
             before(grammarAccess.getClientAccess().getCKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Client__Group__0__Impl1603); 
             after(grammarAccess.getClientAccess().getCKeyword_0()); 

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
    // $ANTLR end "rule__Client__Group__0__Impl"


    // $ANTLR start "rule__Client__Group__1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:808:1: rule__Client__Group__1 : rule__Client__Group__1__Impl rule__Client__Group__2 ;
    public final void rule__Client__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:812:1: ( rule__Client__Group__1__Impl rule__Client__Group__2 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:813:2: rule__Client__Group__1__Impl rule__Client__Group__2
            {
            pushFollow(FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__11634);
            rule__Client__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__2_in_rule__Client__Group__11637);
            rule__Client__Group__2();

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
    // $ANTLR end "rule__Client__Group__1"


    // $ANTLR start "rule__Client__Group__1__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:820:1: rule__Client__Group__1__Impl : ( ( rule__Client__NameAssignment_1 ) ) ;
    public final void rule__Client__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:824:1: ( ( ( rule__Client__NameAssignment_1 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:825:1: ( ( rule__Client__NameAssignment_1 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:825:1: ( ( rule__Client__NameAssignment_1 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:826:1: ( rule__Client__NameAssignment_1 )
            {
             before(grammarAccess.getClientAccess().getNameAssignment_1()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:827:1: ( rule__Client__NameAssignment_1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:827:2: rule__Client__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl1664);
            rule__Client__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClientAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Client__Group__1__Impl"


    // $ANTLR start "rule__Client__Group__2"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:837:1: rule__Client__Group__2 : rule__Client__Group__2__Impl ;
    public final void rule__Client__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:841:1: ( rule__Client__Group__2__Impl )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:842:2: rule__Client__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__21694);
            rule__Client__Group__2__Impl();

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
    // $ANTLR end "rule__Client__Group__2"


    // $ANTLR start "rule__Client__Group__2__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:848:1: rule__Client__Group__2__Impl : ( ( rule__Client__P4commandAssignment_2 ) ) ;
    public final void rule__Client__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:852:1: ( ( ( rule__Client__P4commandAssignment_2 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:853:1: ( ( rule__Client__P4commandAssignment_2 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:853:1: ( ( rule__Client__P4commandAssignment_2 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:854:1: ( rule__Client__P4commandAssignment_2 )
            {
             before(grammarAccess.getClientAccess().getP4commandAssignment_2()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:855:1: ( rule__Client__P4commandAssignment_2 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:855:2: rule__Client__P4commandAssignment_2
            {
            pushFollow(FOLLOW_rule__Client__P4commandAssignment_2_in_rule__Client__Group__2__Impl1721);
            rule__Client__P4commandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClientAccess().getP4commandAssignment_2()); 

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
    // $ANTLR end "rule__Client__Group__2__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:871:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:875:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:876:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_rule__Add__Group__0__Impl_in_rule__Add__Group__01757);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Add__Group__1_in_rule__Add__Group__01760);
            rule__Add__Group__1();

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
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:883:1: rule__Add__Group__0__Impl : ( 'add' ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:887:1: ( ( 'add' ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:888:1: ( 'add' )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:888:1: ( 'add' )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:889:1: 'add'
            {
             before(grammarAccess.getAddAccess().getAddKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Add__Group__0__Impl1788); 
             after(grammarAccess.getAddAccess().getAddKeyword_0()); 

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
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:902:1: rule__Add__Group__1 : rule__Add__Group__1__Impl ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:906:1: ( rule__Add__Group__1__Impl )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:907:2: rule__Add__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Add__Group__1__Impl_in_rule__Add__Group__11819);
            rule__Add__Group__1__Impl();

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
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:913:1: rule__Add__Group__1__Impl : ( ( rule__Add__NameAssignment_1 ) ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:917:1: ( ( ( rule__Add__NameAssignment_1 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:918:1: ( ( rule__Add__NameAssignment_1 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:918:1: ( ( rule__Add__NameAssignment_1 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:919:1: ( rule__Add__NameAssignment_1 )
            {
             before(grammarAccess.getAddAccess().getNameAssignment_1()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:920:1: ( rule__Add__NameAssignment_1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:920:2: rule__Add__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Add__NameAssignment_1_in_rule__Add__Group__1__Impl1846);
            rule__Add__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Edit__Group__0"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:934:1: rule__Edit__Group__0 : rule__Edit__Group__0__Impl rule__Edit__Group__1 ;
    public final void rule__Edit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:938:1: ( rule__Edit__Group__0__Impl rule__Edit__Group__1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:939:2: rule__Edit__Group__0__Impl rule__Edit__Group__1
            {
            pushFollow(FOLLOW_rule__Edit__Group__0__Impl_in_rule__Edit__Group__01880);
            rule__Edit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Edit__Group__1_in_rule__Edit__Group__01883);
            rule__Edit__Group__1();

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
    // $ANTLR end "rule__Edit__Group__0"


    // $ANTLR start "rule__Edit__Group__0__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:946:1: rule__Edit__Group__0__Impl : ( 'edit' ) ;
    public final void rule__Edit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:950:1: ( ( 'edit' ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:951:1: ( 'edit' )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:951:1: ( 'edit' )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:952:1: 'edit'
            {
             before(grammarAccess.getEditAccess().getEditKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Edit__Group__0__Impl1911); 
             after(grammarAccess.getEditAccess().getEditKeyword_0()); 

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
    // $ANTLR end "rule__Edit__Group__0__Impl"


    // $ANTLR start "rule__Edit__Group__1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:965:1: rule__Edit__Group__1 : rule__Edit__Group__1__Impl ;
    public final void rule__Edit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:969:1: ( rule__Edit__Group__1__Impl )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:970:2: rule__Edit__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Edit__Group__1__Impl_in_rule__Edit__Group__11942);
            rule__Edit__Group__1__Impl();

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
    // $ANTLR end "rule__Edit__Group__1"


    // $ANTLR start "rule__Edit__Group__1__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:976:1: rule__Edit__Group__1__Impl : ( ( rule__Edit__NameAssignment_1 ) ) ;
    public final void rule__Edit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:980:1: ( ( ( rule__Edit__NameAssignment_1 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:981:1: ( ( rule__Edit__NameAssignment_1 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:981:1: ( ( rule__Edit__NameAssignment_1 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:982:1: ( rule__Edit__NameAssignment_1 )
            {
             before(grammarAccess.getEditAccess().getNameAssignment_1()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:983:1: ( rule__Edit__NameAssignment_1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:983:2: rule__Edit__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Edit__NameAssignment_1_in_rule__Edit__Group__1__Impl1969);
            rule__Edit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEditAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Edit__Group__1__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:997:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1001:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1002:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_rule__Delete__Group__0__Impl_in_rule__Delete__Group__02003);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delete__Group__1_in_rule__Delete__Group__02006);
            rule__Delete__Group__1();

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
    // $ANTLR end "rule__Delete__Group__0"


    // $ANTLR start "rule__Delete__Group__0__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1009:1: rule__Delete__Group__0__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1013:1: ( ( 'delete' ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1014:1: ( 'delete' )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1014:1: ( 'delete' )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1015:1: 'delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Delete__Group__0__Impl2034); 
             after(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 

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
    // $ANTLR end "rule__Delete__Group__0__Impl"


    // $ANTLR start "rule__Delete__Group__1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1028:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1032:1: ( rule__Delete__Group__1__Impl )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1033:2: rule__Delete__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Delete__Group__1__Impl_in_rule__Delete__Group__12065);
            rule__Delete__Group__1__Impl();

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
    // $ANTLR end "rule__Delete__Group__1"


    // $ANTLR start "rule__Delete__Group__1__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1039:1: rule__Delete__Group__1__Impl : ( ( rule__Delete__NameAssignment_1 ) ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1043:1: ( ( ( rule__Delete__NameAssignment_1 ) ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1044:1: ( ( rule__Delete__NameAssignment_1 ) )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1044:1: ( ( rule__Delete__NameAssignment_1 ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1045:1: ( rule__Delete__NameAssignment_1 )
            {
             before(grammarAccess.getDeleteAccess().getNameAssignment_1()); 
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1046:1: ( rule__Delete__NameAssignment_1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1046:2: rule__Delete__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Delete__NameAssignment_1_in_rule__Delete__Group__1__Impl2092);
            rule__Delete__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Delete__Group__1__Impl"


    // $ANTLR start "rule__P4PORT__Group__0"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1060:1: rule__P4PORT__Group__0 : rule__P4PORT__Group__0__Impl rule__P4PORT__Group__1 ;
    public final void rule__P4PORT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1064:1: ( rule__P4PORT__Group__0__Impl rule__P4PORT__Group__1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1065:2: rule__P4PORT__Group__0__Impl rule__P4PORT__Group__1
            {
            pushFollow(FOLLOW_rule__P4PORT__Group__0__Impl_in_rule__P4PORT__Group__02126);
            rule__P4PORT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P4PORT__Group__1_in_rule__P4PORT__Group__02129);
            rule__P4PORT__Group__1();

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
    // $ANTLR end "rule__P4PORT__Group__0"


    // $ANTLR start "rule__P4PORT__Group__0__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1072:1: rule__P4PORT__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__P4PORT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1076:1: ( ( RULE_ID ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1077:1: ( RULE_ID )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1077:1: ( RULE_ID )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1078:1: RULE_ID
            {
             before(grammarAccess.getP4PORTAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__P4PORT__Group__0__Impl2156); 
             after(grammarAccess.getP4PORTAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__P4PORT__Group__0__Impl"


    // $ANTLR start "rule__P4PORT__Group__1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1089:1: rule__P4PORT__Group__1 : rule__P4PORT__Group__1__Impl rule__P4PORT__Group__2 ;
    public final void rule__P4PORT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1093:1: ( rule__P4PORT__Group__1__Impl rule__P4PORT__Group__2 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1094:2: rule__P4PORT__Group__1__Impl rule__P4PORT__Group__2
            {
            pushFollow(FOLLOW_rule__P4PORT__Group__1__Impl_in_rule__P4PORT__Group__12185);
            rule__P4PORT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P4PORT__Group__2_in_rule__P4PORT__Group__12188);
            rule__P4PORT__Group__2();

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
    // $ANTLR end "rule__P4PORT__Group__1"


    // $ANTLR start "rule__P4PORT__Group__1__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1101:1: rule__P4PORT__Group__1__Impl : ( ':' ) ;
    public final void rule__P4PORT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1105:1: ( ( ':' ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1106:1: ( ':' )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1106:1: ( ':' )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1107:1: ':'
            {
             before(grammarAccess.getP4PORTAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__P4PORT__Group__1__Impl2216); 
             after(grammarAccess.getP4PORTAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__P4PORT__Group__1__Impl"


    // $ANTLR start "rule__P4PORT__Group__2"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1120:1: rule__P4PORT__Group__2 : rule__P4PORT__Group__2__Impl ;
    public final void rule__P4PORT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1124:1: ( rule__P4PORT__Group__2__Impl )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1125:2: rule__P4PORT__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__P4PORT__Group__2__Impl_in_rule__P4PORT__Group__22247);
            rule__P4PORT__Group__2__Impl();

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
    // $ANTLR end "rule__P4PORT__Group__2"


    // $ANTLR start "rule__P4PORT__Group__2__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1131:1: rule__P4PORT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__P4PORT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1135:1: ( ( RULE_INT ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1136:1: ( RULE_INT )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1136:1: ( RULE_INT )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1137:1: RULE_INT
            {
             before(grammarAccess.getP4PORTAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__P4PORT__Group__2__Impl2274); 
             after(grammarAccess.getP4PORTAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__P4PORT__Group__2__Impl"


    // $ANTLR start "rule__FILE__Group_1__0"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1154:1: rule__FILE__Group_1__0 : rule__FILE__Group_1__0__Impl rule__FILE__Group_1__1 ;
    public final void rule__FILE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1158:1: ( rule__FILE__Group_1__0__Impl rule__FILE__Group_1__1 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1159:2: rule__FILE__Group_1__0__Impl rule__FILE__Group_1__1
            {
            pushFollow(FOLLOW_rule__FILE__Group_1__0__Impl_in_rule__FILE__Group_1__02309);
            rule__FILE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FILE__Group_1__1_in_rule__FILE__Group_1__02312);
            rule__FILE__Group_1__1();

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
    // $ANTLR end "rule__FILE__Group_1__0"


    // $ANTLR start "rule__FILE__Group_1__0__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1166:1: rule__FILE__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__FILE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1170:1: ( ( RULE_ID ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1171:1: ( RULE_ID )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1171:1: ( RULE_ID )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1172:1: RULE_ID
            {
             before(grammarAccess.getFILEAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FILE__Group_1__0__Impl2339); 
             after(grammarAccess.getFILEAccess().getIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FILE__Group_1__0__Impl"


    // $ANTLR start "rule__FILE__Group_1__1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1183:1: rule__FILE__Group_1__1 : rule__FILE__Group_1__1__Impl rule__FILE__Group_1__2 ;
    public final void rule__FILE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1187:1: ( rule__FILE__Group_1__1__Impl rule__FILE__Group_1__2 )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1188:2: rule__FILE__Group_1__1__Impl rule__FILE__Group_1__2
            {
            pushFollow(FOLLOW_rule__FILE__Group_1__1__Impl_in_rule__FILE__Group_1__12368);
            rule__FILE__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FILE__Group_1__2_in_rule__FILE__Group_1__12371);
            rule__FILE__Group_1__2();

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
    // $ANTLR end "rule__FILE__Group_1__1"


    // $ANTLR start "rule__FILE__Group_1__1__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1195:1: rule__FILE__Group_1__1__Impl : ( '.' ) ;
    public final void rule__FILE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1199:1: ( ( '.' ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1200:1: ( '.' )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1200:1: ( '.' )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1201:1: '.'
            {
             before(grammarAccess.getFILEAccess().getFullStopKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__FILE__Group_1__1__Impl2399); 
             after(grammarAccess.getFILEAccess().getFullStopKeyword_1_1()); 

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
    // $ANTLR end "rule__FILE__Group_1__1__Impl"


    // $ANTLR start "rule__FILE__Group_1__2"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1214:1: rule__FILE__Group_1__2 : rule__FILE__Group_1__2__Impl ;
    public final void rule__FILE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1218:1: ( rule__FILE__Group_1__2__Impl )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1219:2: rule__FILE__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FILE__Group_1__2__Impl_in_rule__FILE__Group_1__22430);
            rule__FILE__Group_1__2__Impl();

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
    // $ANTLR end "rule__FILE__Group_1__2"


    // $ANTLR start "rule__FILE__Group_1__2__Impl"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1225:1: rule__FILE__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__FILE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1229:1: ( ( RULE_ID ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1230:1: ( RULE_ID )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1230:1: ( RULE_ID )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1231:1: RULE_ID
            {
             before(grammarAccess.getFILEAccess().getIDTerminalRuleCall_1_2()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FILE__Group_1__2__Impl2457); 
             after(grammarAccess.getFILEAccess().getIDTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__FILE__Group_1__2__Impl"


    // $ANTLR start "rule__Model__CommandAssignment"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1249:1: rule__Model__CommandAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1253:1: ( ( ruleCommand ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1254:1: ( ruleCommand )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1254:1: ( ruleCommand )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1255:1: ruleCommand
            {
             before(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__Model__CommandAssignment2497);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__CommandAssignment"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1264:1: rule__Port__NameAssignment_1 : ( ruleP4PORT ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1268:1: ( ( ruleP4PORT ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1269:1: ( ruleP4PORT )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1269:1: ( ruleP4PORT )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1270:1: ruleP4PORT
            {
             before(grammarAccess.getPortAccess().getNameP4PORTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleP4PORT_in_rule__Port__NameAssignment_12528);
            ruleP4PORT();

            state._fsp--;

             after(grammarAccess.getPortAccess().getNameP4PORTParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Port__NameAssignment_1"


    // $ANTLR start "rule__Port__P4commandAssignment_2"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1279:1: rule__Port__P4commandAssignment_2 : ( ruleP4Command ) ;
    public final void rule__Port__P4commandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1283:1: ( ( ruleP4Command ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1284:1: ( ruleP4Command )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1284:1: ( ruleP4Command )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1285:1: ruleP4Command
            {
             before(grammarAccess.getPortAccess().getP4commandP4CommandParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleP4Command_in_rule__Port__P4commandAssignment_22559);
            ruleP4Command();

            state._fsp--;

             after(grammarAccess.getPortAccess().getP4commandP4CommandParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Port__P4commandAssignment_2"


    // $ANTLR start "rule__User__NameAssignment_1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1294:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1298:1: ( ( RULE_ID ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1299:1: ( RULE_ID )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1299:1: ( RULE_ID )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1300:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__NameAssignment_12590); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__User__NameAssignment_1"


    // $ANTLR start "rule__User__P4commandAssignment_2"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1309:1: rule__User__P4commandAssignment_2 : ( ruleP4Command ) ;
    public final void rule__User__P4commandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1313:1: ( ( ruleP4Command ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1314:1: ( ruleP4Command )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1314:1: ( ruleP4Command )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1315:1: ruleP4Command
            {
             before(grammarAccess.getUserAccess().getP4commandP4CommandParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleP4Command_in_rule__User__P4commandAssignment_22621);
            ruleP4Command();

            state._fsp--;

             after(grammarAccess.getUserAccess().getP4commandP4CommandParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__User__P4commandAssignment_2"


    // $ANTLR start "rule__Client__NameAssignment_1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1324:1: rule__Client__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Client__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1328:1: ( ( RULE_ID ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1329:1: ( RULE_ID )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1329:1: ( RULE_ID )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1330:1: RULE_ID
            {
             before(grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Client__NameAssignment_12652); 
             after(grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Client__NameAssignment_1"


    // $ANTLR start "rule__Client__P4commandAssignment_2"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1339:1: rule__Client__P4commandAssignment_2 : ( ruleP4Command ) ;
    public final void rule__Client__P4commandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1343:1: ( ( ruleP4Command ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1344:1: ( ruleP4Command )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1344:1: ( ruleP4Command )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1345:1: ruleP4Command
            {
             before(grammarAccess.getClientAccess().getP4commandP4CommandParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleP4Command_in_rule__Client__P4commandAssignment_22683);
            ruleP4Command();

            state._fsp--;

             after(grammarAccess.getClientAccess().getP4commandP4CommandParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Client__P4commandAssignment_2"


    // $ANTLR start "rule__Add__NameAssignment_1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1354:1: rule__Add__NameAssignment_1 : ( ruleFILE ) ;
    public final void rule__Add__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1358:1: ( ( ruleFILE ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1359:1: ( ruleFILE )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1359:1: ( ruleFILE )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1360:1: ruleFILE
            {
             before(grammarAccess.getAddAccess().getNameFILEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFILE_in_rule__Add__NameAssignment_12714);
            ruleFILE();

            state._fsp--;

             after(grammarAccess.getAddAccess().getNameFILEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Add__NameAssignment_1"


    // $ANTLR start "rule__Edit__NameAssignment_1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1369:1: rule__Edit__NameAssignment_1 : ( ruleFILE ) ;
    public final void rule__Edit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1373:1: ( ( ruleFILE ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1374:1: ( ruleFILE )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1374:1: ( ruleFILE )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1375:1: ruleFILE
            {
             before(grammarAccess.getEditAccess().getNameFILEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFILE_in_rule__Edit__NameAssignment_12745);
            ruleFILE();

            state._fsp--;

             after(grammarAccess.getEditAccess().getNameFILEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Edit__NameAssignment_1"


    // $ANTLR start "rule__Delete__NameAssignment_1"
    // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1384:1: rule__Delete__NameAssignment_1 : ( ruleFILE ) ;
    public final void rule__Delete__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1388:1: ( ( ruleFILE ) )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1389:1: ( ruleFILE )
            {
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1389:1: ( ruleFILE )
            // ../org.xtext.example.p4dsl.ui/src-gen/org/xtext/example/p4dsl/ui/contentassist/antlr/internal/InternalP4Dsl.g:1390:1: ruleFILE
            {
             before(grammarAccess.getDeleteAccess().getNameFILEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFILE_in_rule__Delete__NameAssignment_12776);
            ruleFILE();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getNameFILEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Delete__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CommandAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0_in_ruleCommand155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP4Command_in_entryRuleP4Command182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleP4Command189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P4Command__Alternatives_in_ruleP4Command215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePUCFlag_in_entryRulePUCFlag242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePUCFlag249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PUCFlag__Alternatives_in_rulePUCFlag275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_entryRuleClient422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClient429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__0_in_ruleClient455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileBasedCommand_in_entryRuleFileBasedCommand482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileBasedCommand489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileBasedCommand__Alternatives_in_ruleFileBasedCommand515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_entryRuleAdd542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdd549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group__0_in_ruleAdd575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdit_in_entryRuleEdit602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdit609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edit__Group__0_in_ruleEdit635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelete669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delete__Group__0_in_ruleDelete695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP4PORT_in_entryRuleP4PORT722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleP4PORT729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P4PORT__Group__0_in_ruleP4PORT755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFILE_in_entryRuleFILE782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFILE789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FILE__Alternatives_in_ruleFILE815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePUCFlag_in_rule__P4Command__Alternatives851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileBasedCommand_in_rule__P4Command__Alternatives868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__PUCFlag__Alternatives900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rule__PUCFlag__Alternatives917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_rule__PUCFlag__Alternatives934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_rule__FileBasedCommand__Alternatives966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdit_in_rule__FileBasedCommand__Alternatives983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelete_in_rule__FileBasedCommand__Alternatives1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FILE__Alternatives1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FILE__Group_1__0_in_rule__FILE__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__01080 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__01083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Command__Group__0__Impl1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP4Command_in_rule__Command__Group__1__Impl1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__01202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__01205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Port__Group__0__Impl1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__11264 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__Port__Group__2_in_rule__Port__Group__11267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__21324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__P4commandAssignment_2_in_rule__Port__Group__2__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__01390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__User__Group__0__Impl1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11449 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__User__Group__2_in_rule__User__Group__11452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__21509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__P4commandAssignment_2_in_rule__User__Group__2__Impl1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__01572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Client__Group__1_in_rule__Client__Group__01575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Client__Group__0__Impl1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__11634 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__Client__Group__2_in_rule__Client__Group__11637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__21694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__P4commandAssignment_2_in_rule__Client__Group__2__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group__0__Impl_in_rule__Add__Group__01757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Add__Group__1_in_rule__Add__Group__01760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Add__Group__0__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group__1__Impl_in_rule__Add__Group__11819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__NameAssignment_1_in_rule__Add__Group__1__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edit__Group__0__Impl_in_rule__Edit__Group__01880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Edit__Group__1_in_rule__Edit__Group__01883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Edit__Group__0__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edit__Group__1__Impl_in_rule__Edit__Group__11942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Edit__NameAssignment_1_in_rule__Edit__Group__1__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delete__Group__0__Impl_in_rule__Delete__Group__02003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Delete__Group__1_in_rule__Delete__Group__02006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Delete__Group__0__Impl2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delete__Group__1__Impl_in_rule__Delete__Group__12065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delete__NameAssignment_1_in_rule__Delete__Group__1__Impl2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P4PORT__Group__0__Impl_in_rule__P4PORT__Group__02126 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__P4PORT__Group__1_in_rule__P4PORT__Group__02129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__P4PORT__Group__0__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P4PORT__Group__1__Impl_in_rule__P4PORT__Group__12185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__P4PORT__Group__2_in_rule__P4PORT__Group__12188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__P4PORT__Group__1__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P4PORT__Group__2__Impl_in_rule__P4PORT__Group__22247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__P4PORT__Group__2__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FILE__Group_1__0__Impl_in_rule__FILE__Group_1__02309 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FILE__Group_1__1_in_rule__FILE__Group_1__02312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FILE__Group_1__0__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FILE__Group_1__1__Impl_in_rule__FILE__Group_1__12368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FILE__Group_1__2_in_rule__FILE__Group_1__12371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FILE__Group_1__1__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FILE__Group_1__2__Impl_in_rule__FILE__Group_1__22430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FILE__Group_1__2__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Model__CommandAssignment2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP4PORT_in_rule__Port__NameAssignment_12528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP4Command_in_rule__Port__P4commandAssignment_22559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__NameAssignment_12590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP4Command_in_rule__User__P4commandAssignment_22621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Client__NameAssignment_12652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP4Command_in_rule__Client__P4commandAssignment_22683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFILE_in_rule__Add__NameAssignment_12714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFILE_in_rule__Edit__NameAssignment_12745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFILE_in_rule__Delete__NameAssignment_12776 = new BitSet(new long[]{0x0000000000000002L});

}