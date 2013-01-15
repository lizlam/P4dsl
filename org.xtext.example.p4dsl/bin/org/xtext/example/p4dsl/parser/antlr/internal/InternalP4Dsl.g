/*
* generated by Xtext
*/
grammar InternalP4Dsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.p4dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0()); 
	    }
		lv_command_0_0=ruleCommand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"command",
        		lv_command_0_0, 
        		"Command");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	 iv_ruleCommand=ruleCommand 
	 { $current=$iv_ruleCommand.current; } 
	 EOF 
;

// Rule Command
ruleCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='p4' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getP4Keyword_0());
    }

    { 
        newCompositeNode(grammarAccess.getCommandAccess().getP4CommandParserRuleCall_1()); 
    }
    this_P4Command_1=ruleP4Command
    { 
        $current = $this_P4Command_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleP4Command
entryRuleP4Command returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getP4CommandRule()); }
	 iv_ruleP4Command=ruleP4Command 
	 { $current=$iv_ruleP4Command.current; } 
	 EOF 
;

// Rule P4Command
ruleP4Command returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getP4CommandAccess().getFileBasedCommandParserRuleCall()); 
    }
    this_FileBasedCommand_0=ruleFileBasedCommand
    { 
        $current = $this_FileBasedCommand_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleFileBasedCommand
entryRuleFileBasedCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFileBasedCommandRule()); }
	 iv_ruleFileBasedCommand=ruleFileBasedCommand 
	 { $current=$iv_ruleFileBasedCommand.current; } 
	 EOF 
;

// Rule FileBasedCommand
ruleFileBasedCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFileBasedCommandAccess().getAddParserRuleCall_0()); 
    }
    this_Add_0=ruleAdd
    { 
        $current = $this_Add_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFileBasedCommandAccess().getEditParserRuleCall_1()); 
    }
    this_Edit_1=ruleEdit
    { 
        $current = $this_Edit_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFileBasedCommandAccess().getDeleteParserRuleCall_2()); 
    }
    this_Delete_2=ruleDelete
    { 
        $current = $this_Delete_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAdd
entryRuleAdd returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAddRule()); }
	 iv_ruleAdd=ruleAdd 
	 { $current=$iv_ruleAdd.current; } 
	 EOF 
;

// Rule Add
ruleAdd returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='add' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAddAccess().getAddKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAddAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAddRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleEdit
entryRuleEdit returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEditRule()); }
	 iv_ruleEdit=ruleEdit 
	 { $current=$iv_ruleEdit.current; } 
	 EOF 
;

// Rule Edit
ruleEdit returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='edit' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEditAccess().getEditKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEditAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEditRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleDelete
entryRuleDelete returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeleteRule()); }
	 iv_ruleDelete=ruleDelete 
	 { $current=$iv_ruleDelete.current; } 
	 EOF 
;

// Rule Delete
ruleDelete returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='delete' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDeleteAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeleteRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


