/*
* generated by Xtext
*/
grammar InternalP4Dsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.p4dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getCommandAssignment()); }
(rule__Model__CommandAssignment)*
{ after(grammarAccess.getModelAccess().getCommandAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCommand
entryRuleCommand 
:
{ before(grammarAccess.getCommandRule()); }
	 ruleCommand
{ after(grammarAccess.getCommandRule()); } 
	 EOF 
;

// Rule Command
ruleCommand
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCommandAccess().getGroup()); }
(rule__Command__Group__0)
{ after(grammarAccess.getCommandAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleP4Command
entryRuleP4Command 
:
{ before(grammarAccess.getP4CommandRule()); }
	 ruleP4Command
{ after(grammarAccess.getP4CommandRule()); } 
	 EOF 
;

// Rule P4Command
ruleP4Command
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getP4CommandAccess().getAlternatives()); }
(rule__P4Command__Alternatives)
{ after(grammarAccess.getP4CommandAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePUCFlag
entryRulePUCFlag 
:
{ before(grammarAccess.getPUCFlagRule()); }
	 rulePUCFlag
{ after(grammarAccess.getPUCFlagRule()); } 
	 EOF 
;

// Rule PUCFlag
rulePUCFlag
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPUCFlagAccess().getAlternatives()); }
(rule__PUCFlag__Alternatives)
{ after(grammarAccess.getPUCFlagAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePort
entryRulePort 
:
{ before(grammarAccess.getPortRule()); }
	 rulePort
{ after(grammarAccess.getPortRule()); } 
	 EOF 
;

// Rule Port
rulePort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPortAccess().getGroup()); }
(rule__Port__Group__0)
{ after(grammarAccess.getPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUser
entryRuleUser 
:
{ before(grammarAccess.getUserRule()); }
	 ruleUser
{ after(grammarAccess.getUserRule()); } 
	 EOF 
;

// Rule User
ruleUser
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUserAccess().getGroup()); }
(rule__User__Group__0)
{ after(grammarAccess.getUserAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleClient
entryRuleClient 
:
{ before(grammarAccess.getClientRule()); }
	 ruleClient
{ after(grammarAccess.getClientRule()); } 
	 EOF 
;

// Rule Client
ruleClient
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getClientAccess().getGroup()); }
(rule__Client__Group__0)
{ after(grammarAccess.getClientAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFileBasedCommand
entryRuleFileBasedCommand 
:
{ before(grammarAccess.getFileBasedCommandRule()); }
	 ruleFileBasedCommand
{ after(grammarAccess.getFileBasedCommandRule()); } 
	 EOF 
;

// Rule FileBasedCommand
ruleFileBasedCommand
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFileBasedCommandAccess().getAlternatives()); }
(rule__FileBasedCommand__Alternatives)
{ after(grammarAccess.getFileBasedCommandAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAdd
entryRuleAdd 
:
{ before(grammarAccess.getAddRule()); }
	 ruleAdd
{ after(grammarAccess.getAddRule()); } 
	 EOF 
;

// Rule Add
ruleAdd
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAddAccess().getGroup()); }
(rule__Add__Group__0)
{ after(grammarAccess.getAddAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEdit
entryRuleEdit 
:
{ before(grammarAccess.getEditRule()); }
	 ruleEdit
{ after(grammarAccess.getEditRule()); } 
	 EOF 
;

// Rule Edit
ruleEdit
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEditAccess().getGroup()); }
(rule__Edit__Group__0)
{ after(grammarAccess.getEditAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDelete
entryRuleDelete 
:
{ before(grammarAccess.getDeleteRule()); }
	 ruleDelete
{ after(grammarAccess.getDeleteRule()); } 
	 EOF 
;

// Rule Delete
ruleDelete
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDeleteAccess().getGroup()); }
(rule__Delete__Group__0)
{ after(grammarAccess.getDeleteAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleP4PORT
entryRuleP4PORT 
:
{ before(grammarAccess.getP4PORTRule()); }
	 ruleP4PORT
{ after(grammarAccess.getP4PORTRule()); } 
	 EOF 
;

// Rule P4PORT
ruleP4PORT
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getP4PORTAccess().getGroup()); }
(rule__P4PORT__Group__0)
{ after(grammarAccess.getP4PORTAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFILE
entryRuleFILE 
:
{ before(grammarAccess.getFILERule()); }
	 ruleFILE
{ after(grammarAccess.getFILERule()); } 
	 EOF 
;

// Rule FILE
ruleFILE
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFILEAccess().getAlternatives()); }
(rule__FILE__Alternatives)
{ after(grammarAccess.getFILEAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__P4Command__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getP4CommandAccess().getPUCFlagParserRuleCall_0()); }
	rulePUCFlag
{ after(grammarAccess.getP4CommandAccess().getPUCFlagParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getP4CommandAccess().getFileBasedCommandParserRuleCall_1()); }
	ruleFileBasedCommand
{ after(grammarAccess.getP4CommandAccess().getFileBasedCommandParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PUCFlag__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPUCFlagAccess().getPortParserRuleCall_0()); }
	rulePort
{ after(grammarAccess.getPUCFlagAccess().getPortParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getPUCFlagAccess().getUserParserRuleCall_1()); }
	ruleUser
{ after(grammarAccess.getPUCFlagAccess().getUserParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getPUCFlagAccess().getClientParserRuleCall_2()); }
	ruleClient
{ after(grammarAccess.getPUCFlagAccess().getClientParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FileBasedCommand__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFileBasedCommandAccess().getAddParserRuleCall_0()); }
	ruleAdd
{ after(grammarAccess.getFileBasedCommandAccess().getAddParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getFileBasedCommandAccess().getEditParserRuleCall_1()); }
	ruleEdit
{ after(grammarAccess.getFileBasedCommandAccess().getEditParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getFileBasedCommandAccess().getDeleteParserRuleCall_2()); }
	ruleDelete
{ after(grammarAccess.getFileBasedCommandAccess().getDeleteParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FILE__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFILEAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getFILEAccess().getIDTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getFILEAccess().getGroup_1()); }
(rule__FILE__Group_1__0)
{ after(grammarAccess.getFILEAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Command__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group__0__Impl
	rule__Command__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getP4Keyword_0()); }

	'p4' 

{ after(grammarAccess.getCommandAccess().getP4Keyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Command__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Command__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCommandAccess().getP4CommandParserRuleCall_1()); }
	ruleP4Command
{ after(grammarAccess.getCommandAccess().getP4CommandParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Port__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__0__Impl
	rule__Port__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getPKeyword_0()); }

	'-p' 

{ after(grammarAccess.getPortAccess().getPKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__1__Impl
	rule__Port__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getNameAssignment_1()); }
(rule__Port__NameAssignment_1)
{ after(grammarAccess.getPortAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getP4commandAssignment_2()); }
(rule__Port__P4commandAssignment_2)
{ after(grammarAccess.getPortAccess().getP4commandAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__User__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__User__Group__0__Impl
	rule__User__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__User__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getUKeyword_0()); }

	'-u' 

{ after(grammarAccess.getUserAccess().getUKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__User__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__User__Group__1__Impl
	rule__User__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__User__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getNameAssignment_1()); }
(rule__User__NameAssignment_1)
{ after(grammarAccess.getUserAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__User__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__User__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__User__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getP4commandAssignment_2()); }
(rule__User__P4commandAssignment_2)
{ after(grammarAccess.getUserAccess().getP4commandAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Client__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Client__Group__0__Impl
	rule__Client__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Client__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClientAccess().getCKeyword_0()); }

	'-c' 

{ after(grammarAccess.getClientAccess().getCKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Client__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Client__Group__1__Impl
	rule__Client__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Client__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClientAccess().getNameAssignment_1()); }
(rule__Client__NameAssignment_1)
{ after(grammarAccess.getClientAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Client__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Client__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Client__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClientAccess().getP4commandAssignment_2()); }
(rule__Client__P4commandAssignment_2)
{ after(grammarAccess.getClientAccess().getP4commandAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Add__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Add__Group__0__Impl
	rule__Add__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAddAccess().getAddKeyword_0()); }

	'add' 

{ after(grammarAccess.getAddAccess().getAddKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Add__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Add__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAddAccess().getNameAssignment_1()); }
(rule__Add__NameAssignment_1)
{ after(grammarAccess.getAddAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Edit__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edit__Group__0__Impl
	rule__Edit__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Edit__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEditAccess().getEditKeyword_0()); }

	'edit' 

{ after(grammarAccess.getEditAccess().getEditKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Edit__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Edit__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Edit__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEditAccess().getNameAssignment_1()); }
(rule__Edit__NameAssignment_1)
{ after(grammarAccess.getEditAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Delete__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group__0__Impl
	rule__Delete__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); }

	'delete' 

{ after(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Delete__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Delete__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getNameAssignment_1()); }
(rule__Delete__NameAssignment_1)
{ after(grammarAccess.getDeleteAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__P4PORT__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__P4PORT__Group__0__Impl
	rule__P4PORT__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__P4PORT__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getP4PORTAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getP4PORTAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__P4PORT__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__P4PORT__Group__1__Impl
	rule__P4PORT__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__P4PORT__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getP4PORTAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getP4PORTAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__P4PORT__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__P4PORT__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__P4PORT__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getP4PORTAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
{ after(grammarAccess.getP4PORTAccess().getINTTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__FILE__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FILE__Group_1__0__Impl
	rule__FILE__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FILE__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFILEAccess().getIDTerminalRuleCall_1_0()); }
	RULE_ID
{ after(grammarAccess.getFILEAccess().getIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FILE__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FILE__Group_1__1__Impl
	rule__FILE__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FILE__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFILEAccess().getFullStopKeyword_1_1()); }

	'.' 

{ after(grammarAccess.getFILEAccess().getFullStopKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FILE__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FILE__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FILE__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFILEAccess().getIDTerminalRuleCall_1_2()); }
	RULE_ID
{ after(grammarAccess.getFILEAccess().getIDTerminalRuleCall_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Model__CommandAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0()); }
	ruleCommand{ after(grammarAccess.getModelAccess().getCommandCommandParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getNameP4PORTParserRuleCall_1_0()); }
	ruleP4PORT{ after(grammarAccess.getPortAccess().getNameP4PORTParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__P4commandAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getP4commandP4CommandParserRuleCall_2_0()); }
	ruleP4Command{ after(grammarAccess.getPortAccess().getP4commandP4CommandParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__User__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__User__P4commandAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUserAccess().getP4commandP4CommandParserRuleCall_2_0()); }
	ruleP4Command{ after(grammarAccess.getUserAccess().getP4commandP4CommandParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Client__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Client__P4commandAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClientAccess().getP4commandP4CommandParserRuleCall_2_0()); }
	ruleP4Command{ after(grammarAccess.getClientAccess().getP4commandP4CommandParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Add__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAddAccess().getNameFILEParserRuleCall_1_0()); }
	ruleFILE{ after(grammarAccess.getAddAccess().getNameFILEParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Edit__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEditAccess().getNameFILEParserRuleCall_1_0()); }
	ruleFILE{ after(grammarAccess.getEditAccess().getNameFILEParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Delete__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeleteAccess().getNameFILEParserRuleCall_1_0()); }
	ruleFILE{ after(grammarAccess.getDeleteAccess().getNameFILEParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


