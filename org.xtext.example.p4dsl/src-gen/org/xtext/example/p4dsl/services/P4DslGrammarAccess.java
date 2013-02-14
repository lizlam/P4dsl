/*
* generated by Xtext
*/

package org.xtext.example.p4dsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class P4DslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cCommandAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCommandCommandParserRuleCall_0 = (RuleCall)cCommandAssignment.eContents().get(0);
		
		//Model:
		//	command+=Command*;
		public ParserRule getRule() { return rule; }

		//command+=Command*
		public Assignment getCommandAssignment() { return cCommandAssignment; }

		//Command
		public RuleCall getCommandCommandParserRuleCall_0() { return cCommandCommandParserRuleCall_0; }
	}

	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Command");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cP4Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cP4CommandParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Command:
		//	"p4" P4Command;
		public ParserRule getRule() { return rule; }

		//"p4" P4Command
		public Group getGroup() { return cGroup; }

		//"p4"
		public Keyword getP4Keyword_0() { return cP4Keyword_0; }

		//P4Command
		public RuleCall getP4CommandParserRuleCall_1() { return cP4CommandParserRuleCall_1; }
	}

	public class P4CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "P4Command");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPUCFlagParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFileBasedCommandParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//P4Command:
		//	PUCFlag | FileBasedCommand;
		public ParserRule getRule() { return rule; }

		//PUCFlag | FileBasedCommand
		public Alternatives getAlternatives() { return cAlternatives; }

		//PUCFlag
		public RuleCall getPUCFlagParserRuleCall_0() { return cPUCFlagParserRuleCall_0; }

		//FileBasedCommand
		public RuleCall getFileBasedCommandParserRuleCall_1() { return cFileBasedCommandParserRuleCall_1; }
	}

	public class PUCFlagElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PUCFlag");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPortParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cUserParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cClientParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//PUCFlag:
		//	Port | User | Client;
		public ParserRule getRule() { return rule; }

		//Port | User | Client
		public Alternatives getAlternatives() { return cAlternatives; }

		//Port
		public RuleCall getPortParserRuleCall_0() { return cPortParserRuleCall_0; }

		//User
		public RuleCall getUserParserRuleCall_1() { return cUserParserRuleCall_1; }

		//Client
		public RuleCall getClientParserRuleCall_2() { return cClientParserRuleCall_2; }
	}

	public class PortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Port");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameP4PORTParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cP4commandAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cP4commandP4CommandParserRuleCall_2_0 = (RuleCall)cP4commandAssignment_2.eContents().get(0);
		
		//Port:
		//	"-p" name=P4PORT p4command+=P4Command;
		public ParserRule getRule() { return rule; }

		//"-p" name=P4PORT p4command+=P4Command
		public Group getGroup() { return cGroup; }

		//"-p"
		public Keyword getPKeyword_0() { return cPKeyword_0; }

		//name=P4PORT
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//P4PORT
		public RuleCall getNameP4PORTParserRuleCall_1_0() { return cNameP4PORTParserRuleCall_1_0; }

		//p4command+=P4Command
		public Assignment getP4commandAssignment_2() { return cP4commandAssignment_2; }

		//P4Command
		public RuleCall getP4commandP4CommandParserRuleCall_2_0() { return cP4commandP4CommandParserRuleCall_2_0; }
	}

	public class UserElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "User");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cP4commandAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cP4commandP4CommandParserRuleCall_2_0 = (RuleCall)cP4commandAssignment_2.eContents().get(0);
		
		//User:
		//	"-u" name=ID p4command+=P4Command;
		public ParserRule getRule() { return rule; }

		//"-u" name=ID p4command+=P4Command
		public Group getGroup() { return cGroup; }

		//"-u"
		public Keyword getUKeyword_0() { return cUKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//p4command+=P4Command
		public Assignment getP4commandAssignment_2() { return cP4commandAssignment_2; }

		//P4Command
		public RuleCall getP4commandP4CommandParserRuleCall_2_0() { return cP4commandP4CommandParserRuleCall_2_0; }
	}

	public class ClientElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Client");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cP4commandAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cP4commandP4CommandParserRuleCall_2_0 = (RuleCall)cP4commandAssignment_2.eContents().get(0);
		
		//Client:
		//	"-c" name=ID p4command+=P4Command;
		public ParserRule getRule() { return rule; }

		//"-c" name=ID p4command+=P4Command
		public Group getGroup() { return cGroup; }

		//"-c"
		public Keyword getCKeyword_0() { return cCKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//p4command+=P4Command
		public Assignment getP4commandAssignment_2() { return cP4commandAssignment_2; }

		//P4Command
		public RuleCall getP4commandP4CommandParserRuleCall_2_0() { return cP4commandP4CommandParserRuleCall_2_0; }
	}

	public class FileBasedCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FileBasedCommand");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAddParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEditParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDeleteParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//FileBasedCommand:
		//	Add | Edit | Delete;
		public ParserRule getRule() { return rule; }

		//Add | Edit | Delete
		public Alternatives getAlternatives() { return cAlternatives; }

		//Add
		public RuleCall getAddParserRuleCall_0() { return cAddParserRuleCall_0; }

		//Edit
		public RuleCall getEditParserRuleCall_1() { return cEditParserRuleCall_1; }

		//Delete
		public RuleCall getDeleteParserRuleCall_2() { return cDeleteParserRuleCall_2; }
	}

	public class AddElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Add");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFILEParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Add:
		//	"add" name=FILE;
		public ParserRule getRule() { return rule; }

		//"add" name=FILE
		public Group getGroup() { return cGroup; }

		//"add"
		public Keyword getAddKeyword_0() { return cAddKeyword_0; }

		//name=FILE
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//FILE
		public RuleCall getNameFILEParserRuleCall_1_0() { return cNameFILEParserRuleCall_1_0; }
	}

	public class EditElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Edit");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEditKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFILEParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Edit:
		//	"edit" name=FILE;
		public ParserRule getRule() { return rule; }

		//"edit" name=FILE
		public Group getGroup() { return cGroup; }

		//"edit"
		public Keyword getEditKeyword_0() { return cEditKeyword_0; }

		//name=FILE
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//FILE
		public RuleCall getNameFILEParserRuleCall_1_0() { return cNameFILEParserRuleCall_1_0; }
	}

	public class DeleteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Delete");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeleteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFILEParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Delete:
		//	"delete" name=FILE;
		public ParserRule getRule() { return rule; }

		//"delete" name=FILE
		public Group getGroup() { return cGroup; }

		//"delete"
		public Keyword getDeleteKeyword_0() { return cDeleteKeyword_0; }

		//name=FILE
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//FILE
		public RuleCall getNameFILEParserRuleCall_1_0() { return cNameFILEParserRuleCall_1_0; }
	}

	public class P4PORTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "P4PORT");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//P4PORT:
		//	ID ":" INT;
		public ParserRule getRule() { return rule; }

		//ID ":" INT
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}

	public class FILEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FILE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		
		//FILE:
		//	ID | ID "." ID;
		public ParserRule getRule() { return rule; }

		//ID | ID "." ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//ID "." ID
		public Group getGroup_1() { return cGroup_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_0() { return cIDTerminalRuleCall_1_0; }

		//"."
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_2() { return cIDTerminalRuleCall_1_2; }
	}
	
	
	private ModelElements pModel;
	private CommandElements pCommand;
	private P4CommandElements pP4Command;
	private PUCFlagElements pPUCFlag;
	private PortElements pPort;
	private UserElements pUser;
	private ClientElements pClient;
	private FileBasedCommandElements pFileBasedCommand;
	private AddElements pAdd;
	private EditElements pEdit;
	private DeleteElements pDelete;
	private P4PORTElements pP4PORT;
	private FILEElements pFILE;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public P4DslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.p4dsl.P4Dsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	command+=Command*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Command:
	//	"p4" P4Command;
	public CommandElements getCommandAccess() {
		return (pCommand != null) ? pCommand : (pCommand = new CommandElements());
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}

	//P4Command:
	//	PUCFlag | FileBasedCommand;
	public P4CommandElements getP4CommandAccess() {
		return (pP4Command != null) ? pP4Command : (pP4Command = new P4CommandElements());
	}
	
	public ParserRule getP4CommandRule() {
		return getP4CommandAccess().getRule();
	}

	//PUCFlag:
	//	Port | User | Client;
	public PUCFlagElements getPUCFlagAccess() {
		return (pPUCFlag != null) ? pPUCFlag : (pPUCFlag = new PUCFlagElements());
	}
	
	public ParserRule getPUCFlagRule() {
		return getPUCFlagAccess().getRule();
	}

	//Port:
	//	"-p" name=P4PORT p4command+=P4Command;
	public PortElements getPortAccess() {
		return (pPort != null) ? pPort : (pPort = new PortElements());
	}
	
	public ParserRule getPortRule() {
		return getPortAccess().getRule();
	}

	//User:
	//	"-u" name=ID p4command+=P4Command;
	public UserElements getUserAccess() {
		return (pUser != null) ? pUser : (pUser = new UserElements());
	}
	
	public ParserRule getUserRule() {
		return getUserAccess().getRule();
	}

	//Client:
	//	"-c" name=ID p4command+=P4Command;
	public ClientElements getClientAccess() {
		return (pClient != null) ? pClient : (pClient = new ClientElements());
	}
	
	public ParserRule getClientRule() {
		return getClientAccess().getRule();
	}

	//FileBasedCommand:
	//	Add | Edit | Delete;
	public FileBasedCommandElements getFileBasedCommandAccess() {
		return (pFileBasedCommand != null) ? pFileBasedCommand : (pFileBasedCommand = new FileBasedCommandElements());
	}
	
	public ParserRule getFileBasedCommandRule() {
		return getFileBasedCommandAccess().getRule();
	}

	//Add:
	//	"add" name=FILE;
	public AddElements getAddAccess() {
		return (pAdd != null) ? pAdd : (pAdd = new AddElements());
	}
	
	public ParserRule getAddRule() {
		return getAddAccess().getRule();
	}

	//Edit:
	//	"edit" name=FILE;
	public EditElements getEditAccess() {
		return (pEdit != null) ? pEdit : (pEdit = new EditElements());
	}
	
	public ParserRule getEditRule() {
		return getEditAccess().getRule();
	}

	//Delete:
	//	"delete" name=FILE;
	public DeleteElements getDeleteAccess() {
		return (pDelete != null) ? pDelete : (pDelete = new DeleteElements());
	}
	
	public ParserRule getDeleteRule() {
		return getDeleteAccess().getRule();
	}

	//P4PORT:
	//	ID ":" INT;
	public P4PORTElements getP4PORTAccess() {
		return (pP4PORT != null) ? pP4PORT : (pP4PORT = new P4PORTElements());
	}
	
	public ParserRule getP4PORTRule() {
		return getP4PORTAccess().getRule();
	}

	//FILE:
	//	ID | ID "." ID;
	public FILEElements getFILEAccess() {
		return (pFILE != null) ? pFILE : (pFILE = new FILEElements());
	}
	
	public ParserRule getFILERule() {
		return getFILEAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
