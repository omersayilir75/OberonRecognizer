// Generated from C:/Users/omer_/IdeaProjects/OberonRecognizer/src/no_whitespace/OberonGrammar.g4 by ANTLR 4.13.1
package gen.no_whitespace;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class OberonGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, STRING_LITERAL=3, Constant=4, IntegerConstant=5, Whitespace=6, 
		Newline=7, BlockComment=8, SEMI=9, COLON=10, DOT=11, LPAREN=12, RPAREN=13, 
		COMMA=14, PLUS=15, AND=16, MINUS=17, NOTEQUAL=18, EQUAL=19, STAR=20, NOT=21, 
		LT=22, LE=23, GT=24, GE=25, Assign=26, MODULE=27, IMPORT=28, VAR=29, BEGIN=30, 
		CONST=31, END=32, PROCEDURE=33, TYPE=34, ARRAY=35, OF=36, OR=37, RECORD=38, 
		WHILE=39, DO=40, IF=41, THEN=42, ELSE=43, ELSIF=44, REPEAT=45, UNTIL=46, 
		DIV=47, MOD=48, ID=49, ErrorChar=50;
	public static final int
		RULE_moduleDefinition = 0, RULE_declarations = 1, RULE_procedureDeclaration = 2, 
		RULE_procedureParameters = 3, RULE_procedureParameter = 4, RULE_typeName = 5, 
		RULE_recordTypeNameElements = 6, RULE_recordElement = 7, RULE_localDeclaration = 8, 
		RULE_typeDeclaration = 9, RULE_singleTypeDeclaration = 10, RULE_variableDeclaration = 11, 
		RULE_singleVariableDeclaration = 12, RULE_exportableID = 13, RULE_constDeclaration = 14, 
		RULE_constDeclarationElement = 15, RULE_block = 16, RULE_statements = 17, 
		RULE_statement = 18, RULE_procCall_statement = 19, RULE_assign_statement = 20, 
		RULE_while_statement = 21, RULE_repeat_statement = 22, RULE_if_statement = 23, 
		RULE_expression = 24, RULE_callParameters = 25, RULE_selector = 26, RULE_arrayOrRecordSelector = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"moduleDefinition", "declarations", "procedureDeclaration", "procedureParameters", 
			"procedureParameter", "typeName", "recordTypeNameElements", "recordElement", 
			"localDeclaration", "typeDeclaration", "singleTypeDeclaration", "variableDeclaration", 
			"singleVariableDeclaration", "exportableID", "constDeclaration", "constDeclarationElement", 
			"block", "statements", "statement", "procCall_statement", "assign_statement", 
			"while_statement", "repeat_statement", "if_statement", "expression", 
			"callParameters", "selector", "arrayOrRecordSelector"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", null, null, null, null, null, null, "';'", "':'", 
			"'.'", "'('", "')'", "','", "'+'", "'&'", "'-'", "'#'", "'='", "'*'", 
			"'~'", "'<'", "'<='", "'>'", "'>='", "':='", "'MODULE'", "'IMPORT'", 
			"'VAR'", "'BEGIN'", "'CONST'", "'END'", "'PROCEDURE'", "'TYPE'", "'ARRAY'", 
			"'OF'", "'OR'", "'RECORD'", "'WHILE'", "'DO'", "'IF'", "'THEN'", "'ELSE'", 
			"'ELSIF'", "'REPEAT'", "'UNTIL'", "'DIV'", "'MOD'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "STRING_LITERAL", "Constant", "IntegerConstant", "Whitespace", 
			"Newline", "BlockComment", "SEMI", "COLON", "DOT", "LPAREN", "RPAREN", 
			"COMMA", "PLUS", "AND", "MINUS", "NOTEQUAL", "EQUAL", "STAR", "NOT", 
			"LT", "LE", "GT", "GE", "Assign", "MODULE", "IMPORT", "VAR", "BEGIN", 
			"CONST", "END", "PROCEDURE", "TYPE", "ARRAY", "OF", "OR", "RECORD", "WHILE", 
			"DO", "IF", "THEN", "ELSE", "ELSIF", "REPEAT", "UNTIL", "DIV", "MOD", 
			"ID", "ErrorChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "OberonGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OberonGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleDefinitionContext extends ParserRuleContext {
		public Token n;
		public TerminalNode MODULE() { return getToken(OberonGrammarParser.MODULE, 0); }
		public TerminalNode SEMI() { return getToken(OberonGrammarParser.SEMI, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(OberonGrammarParser.DOT, 0); }
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public ModuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterModuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitModuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitModuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDefinitionContext moduleDefinition() throws RecognitionException {
		ModuleDefinitionContext _localctx = new ModuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_moduleDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(MODULE);
			setState(57);
			((ModuleDefinitionContext)_localctx).n = match(ID);
			setState(58);
			match(SEMI);
			setState(59);
			declarations();
			setState(60);
			block();
			setState(61);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public List<ProcedureDeclarationContext> procedureDeclaration() {
			return getRuleContexts(ProcedureDeclarationContext.class);
		}
		public ProcedureDeclarationContext procedureDeclaration(int i) {
			return getRuleContext(ProcedureDeclarationContext.class,i);
		}
		public List<LocalDeclarationContext> localDeclaration() {
			return getRuleContexts(LocalDeclarationContext.class);
		}
		public LocalDeclarationContext localDeclaration(int i) {
			return getRuleContext(LocalDeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28454158336L) != 0)) {
				{
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROCEDURE:
					{
					setState(63);
					procedureDeclaration();
					}
					break;
				case VAR:
				case CONST:
				case TYPE:
					{
					setState(64);
					localDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public Token name;
		public ProcedureParametersContext pps;
		public Token export;
		public BlockContext endname;
		public TerminalNode PROCEDURE() { return getToken(OberonGrammarParser.PROCEDURE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(OberonGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(OberonGrammarParser.SEMI, i);
		}
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ProcedureDeclarationContext> procedureDeclaration() {
			return getRuleContexts(ProcedureDeclarationContext.class);
		}
		public ProcedureDeclarationContext procedureDeclaration(int i) {
			return getRuleContext(ProcedureDeclarationContext.class,i);
		}
		public List<LocalDeclarationContext> localDeclaration() {
			return getRuleContexts(LocalDeclarationContext.class);
		}
		public LocalDeclarationContext localDeclaration(int i) {
			return getRuleContext(LocalDeclarationContext.class,i);
		}
		public ProcedureParametersContext procedureParameters() {
			return getRuleContext(ProcedureParametersContext.class,0);
		}
		public TerminalNode STAR() { return getToken(OberonGrammarParser.STAR, 0); }
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(PROCEDURE);
			setState(71);
			((ProcedureDeclarationContext)_localctx).name = match(ID);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(72);
				((ProcedureDeclarationContext)_localctx).pps = procedureParameters();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(75);
				((ProcedureDeclarationContext)_localctx).export = match(STAR);
				}
			}

			setState(78);
			match(SEMI);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28454158336L) != 0)) {
				{
				setState(81);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROCEDURE:
					{
					setState(79);
					procedureDeclaration();
					}
					break;
				case VAR:
				case CONST:
				case TYPE:
					{
					setState(80);
					localDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			((ProcedureDeclarationContext)_localctx).endname = block();
			setState(87);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureParametersContext extends ParserRuleContext {
		public ProcedureParameterContext procedureParameter;
		public List<ProcedureParameterContext> p = new ArrayList<ProcedureParameterContext>();
		public TerminalNode LPAREN() { return getToken(OberonGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OberonGrammarParser.RPAREN, 0); }
		public List<ProcedureParameterContext> procedureParameter() {
			return getRuleContexts(ProcedureParameterContext.class);
		}
		public ProcedureParameterContext procedureParameter(int i) {
			return getRuleContext(ProcedureParameterContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(OberonGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(OberonGrammarParser.SEMI, i);
		}
		public ProcedureParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterProcedureParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitProcedureParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitProcedureParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureParametersContext procedureParameters() throws RecognitionException {
		ProcedureParametersContext _localctx = new ProcedureParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedureParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(LPAREN);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					((ProcedureParametersContext)_localctx).procedureParameter = procedureParameter();
					((ProcedureParametersContext)_localctx).p.add(((ProcedureParametersContext)_localctx).procedureParameter);
					setState(91);
					match(SEMI);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(98);
			((ProcedureParametersContext)_localctx).procedureParameter = procedureParameter();
			((ProcedureParametersContext)_localctx).p.add(((ProcedureParametersContext)_localctx).procedureParameter);
			setState(99);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureParameterContext extends ParserRuleContext {
		public Token ID;
		public List<Token> names = new ArrayList<Token>();
		public TypeNameContext t;
		public TerminalNode COLON() { return getToken(OberonGrammarParser.COLON, 0); }
		public List<TerminalNode> ID() { return getTokens(OberonGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OberonGrammarParser.ID, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode VAR() { return getToken(OberonGrammarParser.VAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OberonGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OberonGrammarParser.COMMA, i);
		}
		public ProcedureParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterProcedureParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitProcedureParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitProcedureParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureParameterContext procedureParameter() throws RecognitionException {
		ProcedureParameterContext _localctx = new ProcedureParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedureParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(101);
				match(VAR);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					((ProcedureParameterContext)_localctx).ID = match(ID);
					((ProcedureParameterContext)_localctx).names.add(((ProcedureParameterContext)_localctx).ID);
					setState(105);
					match(COMMA);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(111);
			((ProcedureParameterContext)_localctx).ID = match(ID);
			((ProcedureParameterContext)_localctx).names.add(((ProcedureParameterContext)_localctx).ID);
			setState(112);
			match(COLON);
			setState(113);
			((ProcedureParameterContext)_localctx).t = typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	 
		public TypeNameContext() { }
		public void copyFrom(TypeNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends TypeNameContext {
		public ExpressionContext e;
		public TypeNameContext t;
		public TerminalNode ARRAY() { return getToken(OberonGrammarParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(OberonGrammarParser.OF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ArrayTypeContext(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeNameContext extends TypeNameContext {
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public SimpleTypeNameContext(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecordTypeNameContext extends TypeNameContext {
		public RecordTypeNameElementsContext r;
		public TerminalNode RECORD() { return getToken(OberonGrammarParser.RECORD, 0); }
		public TerminalNode END() { return getToken(OberonGrammarParser.END, 0); }
		public RecordTypeNameElementsContext recordTypeNameElements() {
			return getRuleContext(RecordTypeNameElementsContext.class,0);
		}
		public RecordTypeNameContext(TypeNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterRecordTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitRecordTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitRecordTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeName);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new SimpleTypeNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(ID);
				}
				break;
			case ARRAY:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(ARRAY);
				setState(117);
				((ArrayTypeContext)_localctx).e = expression(0);
				setState(118);
				match(OF);
				setState(119);
				((ArrayTypeContext)_localctx).t = typeName();
				}
				break;
			case RECORD:
				_localctx = new RecordTypeNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(RECORD);
				setState(122);
				((RecordTypeNameContext)_localctx).r = recordTypeNameElements();
				setState(123);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordTypeNameElementsContext extends ParserRuleContext {
		public List<RecordElementContext> recordElement() {
			return getRuleContexts(RecordElementContext.class);
		}
		public RecordElementContext recordElement(int i) {
			return getRuleContext(RecordElementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(OberonGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(OberonGrammarParser.SEMI, i);
		}
		public RecordTypeNameElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordTypeNameElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterRecordTypeNameElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitRecordTypeNameElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitRecordTypeNameElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeNameElementsContext recordTypeNameElements() throws RecognitionException {
		RecordTypeNameElementsContext _localctx = new RecordTypeNameElementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_recordTypeNameElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			recordElement();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(128);
				match(SEMI);
				setState(129);
				recordElement();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordElementContext extends ParserRuleContext {
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public TypeNameContext t;
		public TerminalNode COLON() { return getToken(OberonGrammarParser.COLON, 0); }
		public List<TerminalNode> ID() { return getTokens(OberonGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OberonGrammarParser.ID, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OberonGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OberonGrammarParser.COMMA, i);
		}
		public RecordElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterRecordElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitRecordElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitRecordElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordElementContext recordElement() throws RecognitionException {
		RecordElementContext _localctx = new RecordElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_recordElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					((RecordElementContext)_localctx).ID = match(ID);
					((RecordElementContext)_localctx).ids.add(((RecordElementContext)_localctx).ID);
					setState(136);
					match(COMMA);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(142);
			((RecordElementContext)_localctx).ID = match(ID);
			((RecordElementContext)_localctx).ids.add(((RecordElementContext)_localctx).ID);
			setState(143);
			match(COLON);
			setState(144);
			((RecordElementContext)_localctx).t = typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterLocalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitLocalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localDeclaration);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				variableDeclaration();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				constDeclaration();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				typeDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(OberonGrammarParser.TYPE, 0); }
		public List<SingleTypeDeclarationContext> singleTypeDeclaration() {
			return getRuleContexts(SingleTypeDeclarationContext.class);
		}
		public SingleTypeDeclarationContext singleTypeDeclaration(int i) {
			return getRuleContext(SingleTypeDeclarationContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(TYPE);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				singleTypeDeclaration();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTypeDeclarationContext extends ParserRuleContext {
		public Token id;
		public Token export;
		public TypeNameContext t;
		public TerminalNode EQUAL() { return getToken(OberonGrammarParser.EQUAL, 0); }
		public TerminalNode SEMI() { return getToken(OberonGrammarParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(OberonGrammarParser.STAR, 0); }
		public SingleTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterSingleTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitSingleTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitSingleTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeDeclarationContext singleTypeDeclaration() throws RecognitionException {
		SingleTypeDeclarationContext _localctx = new SingleTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_singleTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((SingleTypeDeclarationContext)_localctx).id = match(ID);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(158);
				((SingleTypeDeclarationContext)_localctx).export = match(STAR);
				}
			}

			setState(161);
			match(EQUAL);
			setState(162);
			((SingleTypeDeclarationContext)_localctx).t = typeName();
			setState(163);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(OberonGrammarParser.VAR, 0); }
		public List<SingleVariableDeclarationContext> singleVariableDeclaration() {
			return getRuleContexts(SingleVariableDeclarationContext.class);
		}
		public SingleVariableDeclarationContext singleVariableDeclaration(int i) {
			return getRuleContext(SingleVariableDeclarationContext.class,i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(VAR);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				singleVariableDeclaration();
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleVariableDeclarationContext extends ParserRuleContext {
		public ExportableIDContext exportableID;
		public List<ExportableIDContext> v = new ArrayList<ExportableIDContext>();
		public TypeNameContext t;
		public TerminalNode COLON() { return getToken(OberonGrammarParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(OberonGrammarParser.SEMI, 0); }
		public List<ExportableIDContext> exportableID() {
			return getRuleContexts(ExportableIDContext.class);
		}
		public ExportableIDContext exportableID(int i) {
			return getRuleContext(ExportableIDContext.class,i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OberonGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OberonGrammarParser.COMMA, i);
		}
		public SingleVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterSingleVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitSingleVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitSingleVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVariableDeclarationContext singleVariableDeclaration() throws RecognitionException {
		SingleVariableDeclarationContext _localctx = new SingleVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_singleVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					((SingleVariableDeclarationContext)_localctx).exportableID = exportableID();
					((SingleVariableDeclarationContext)_localctx).v.add(((SingleVariableDeclarationContext)_localctx).exportableID);
					setState(172);
					match(COMMA);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(179);
			((SingleVariableDeclarationContext)_localctx).exportableID = exportableID();
			((SingleVariableDeclarationContext)_localctx).v.add(((SingleVariableDeclarationContext)_localctx).exportableID);
			setState(180);
			match(COLON);
			setState(181);
			((SingleVariableDeclarationContext)_localctx).t = typeName();
			setState(182);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportableIDContext extends ParserRuleContext {
		public Token export;
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public TerminalNode STAR() { return getToken(OberonGrammarParser.STAR, 0); }
		public ExportableIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportableID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterExportableID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitExportableID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitExportableID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportableIDContext exportableID() throws RecognitionException {
		ExportableIDContext _localctx = new ExportableIDContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exportableID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(185);
				((ExportableIDContext)_localctx).export = match(STAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(OberonGrammarParser.CONST, 0); }
		public List<ConstDeclarationElementContext> constDeclarationElement() {
			return getRuleContexts(ConstDeclarationElementContext.class);
		}
		public ConstDeclarationElementContext constDeclarationElement(int i) {
			return getRuleContext(ConstDeclarationElementContext.class,i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(CONST);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				constDeclarationElement();
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclarationElementContext extends ParserRuleContext {
		public Token c;
		public Token export;
		public ExpressionContext e;
		public TerminalNode EQUAL() { return getToken(OberonGrammarParser.EQUAL, 0); }
		public TerminalNode SEMI() { return getToken(OberonGrammarParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STAR() { return getToken(OberonGrammarParser.STAR, 0); }
		public ConstDeclarationElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclarationElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterConstDeclarationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitConstDeclarationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitConstDeclarationElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationElementContext constDeclarationElement() throws RecognitionException {
		ConstDeclarationElementContext _localctx = new ConstDeclarationElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constDeclarationElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((ConstDeclarationElementContext)_localctx).c = match(ID);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(195);
				((ConstDeclarationElementContext)_localctx).export = match(STAR);
				}
			}

			setState(198);
			match(EQUAL);
			setState(199);
			((ConstDeclarationElementContext)_localctx).e = expression(0);
			setState(200);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(OberonGrammarParser.END, 0); }
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public TerminalNode BEGIN() { return getToken(OberonGrammarParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(202);
				match(BEGIN);
				setState(203);
				statements();
				}
			}

			setState(206);
			match(END);
			setState(207);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(OberonGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(OberonGrammarParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			statement();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(210);
				match(SEMI);
				setState(211);
				statement();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public ProcCall_statementContext procCall_statement() {
			return getRuleContext(ProcCall_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Repeat_statementContext repeat_statement() {
			return getRuleContext(Repeat_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				assign_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				procCall_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				repeat_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcCall_statementContext extends ParserRuleContext {
		public Token id;
		public CallParametersContext cp;
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(OberonGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OberonGrammarParser.RPAREN, 0); }
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public ProcCall_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procCall_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterProcCall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitProcCall_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitProcCall_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcCall_statementContext procCall_statement() throws RecognitionException {
		ProcCall_statementContext _localctx = new ProcCall_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_procCall_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			((ProcCall_statementContext)_localctx).id = match(ID);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(226);
				match(LPAREN);
				setState(227);
				((ProcCall_statementContext)_localctx).cp = callParameters();
				setState(228);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_statementContext extends ParserRuleContext {
		public Token id;
		public SelectorContext s;
		public ExpressionContext r;
		public TerminalNode Assign() { return getToken(OberonGrammarParser.Assign, 0); }
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assign_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((Assign_statementContext)_localctx).id = match(ID);
			setState(233);
			((Assign_statementContext)_localctx).s = selector();
			setState(234);
			match(Assign);
			setState(235);
			((Assign_statementContext)_localctx).r = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext r;
		public TerminalNode WHILE() { return getToken(OberonGrammarParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(OberonGrammarParser.DO, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(OberonGrammarParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(WHILE);
			setState(238);
			((While_statementContext)_localctx).r = expression(0);
			setState(239);
			match(DO);
			setState(240);
			statements();
			setState(241);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_statementContext extends ParserRuleContext {
		public ExpressionContext r;
		public TerminalNode REPEAT() { return getToken(OberonGrammarParser.REPEAT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(OberonGrammarParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repeat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterRepeat_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitRepeat_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitRepeat_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_statementContext repeat_statement() throws RecognitionException {
		Repeat_statementContext _localctx = new Repeat_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_repeat_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(REPEAT);
			setState(244);
			statements();
			setState(245);
			match(UNTIL);
			setState(246);
			((Repeat_statementContext)_localctx).r = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> c = new ArrayList<ExpressionContext>();
		public TerminalNode IF() { return getToken(OberonGrammarParser.IF, 0); }
		public List<TerminalNode> THEN() { return getTokens(OberonGrammarParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(OberonGrammarParser.THEN, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(OberonGrammarParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ELSIF() { return getTokens(OberonGrammarParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(OberonGrammarParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(OberonGrammarParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(IF);
			setState(249);
			((If_statementContext)_localctx).expression = expression(0);
			((If_statementContext)_localctx).c.add(((If_statementContext)_localctx).expression);
			setState(250);
			match(THEN);
			setState(251);
			statements();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(252);
				match(ELSIF);
				setState(253);
				((If_statementContext)_localctx).expression = expression(0);
				((If_statementContext)_localctx).c.add(((If_statementContext)_localctx).expression);
				setState(254);
				match(THEN);
				setState(255);
				statements();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(262);
				match(ELSE);
				setState(263);
				statements();
				}
			}

			setState(266);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OberonGrammarParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(OberonGrammarParser.MINUS, 0); }
		public ExprNotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterExprNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitExprNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitExprNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFactPrecedenceContext extends ExpressionContext {
		public ExpressionContext l;
		public Token op;
		public ExpressionContext r;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(OberonGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(OberonGrammarParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(OberonGrammarParser.OR, 0); }
		public ExprFactPrecedenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterExprFactPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitExprFactPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitExprFactPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringLiteralContext extends ExpressionContext {
		public Token s;
		public TerminalNode STRING_LITERAL() { return getToken(OberonGrammarParser.STRING_LITERAL, 0); }
		public ExprStringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterExprStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitExprStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitExprStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelPrecedenceContext extends ExpressionContext {
		public ExpressionContext l;
		public Token op;
		public ExpressionContext r;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(OberonGrammarParser.LT, 0); }
		public TerminalNode LE() { return getToken(OberonGrammarParser.LE, 0); }
		public TerminalNode GT() { return getToken(OberonGrammarParser.GT, 0); }
		public TerminalNode GE() { return getToken(OberonGrammarParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(OberonGrammarParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(OberonGrammarParser.NOTEQUAL, 0); }
		public ExprRelPrecedenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterExprRelPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitExprRelPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitExprRelPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultPrecedenceContext extends ExpressionContext {
		public ExpressionContext l;
		public Token op;
		public ExpressionContext r;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(OberonGrammarParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(OberonGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(OberonGrammarParser.MOD, 0); }
		public TerminalNode AND() { return getToken(OberonGrammarParser.AND, 0); }
		public ExprMultPrecedenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterExprMultPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitExprMultPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitExprMultPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprEmbeddedExpressionContext extends ExpressionContext {
		public ExpressionContext e;
		public TerminalNode LPAREN() { return getToken(OberonGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OberonGrammarParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprEmbeddedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterExprEmbeddedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitExprEmbeddedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitExprEmbeddedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprConstantContext extends ExpressionContext {
		public Token c;
		public TerminalNode Constant() { return getToken(OberonGrammarParser.Constant, 0); }
		public ExprConstantContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterExprConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitExprConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitExprConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprSingleIdContext extends ExpressionContext {
		public Token id;
		public SelectorContext s;
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ExprSingleIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterExprSingleId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitExprSingleId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitExprSingleId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFuncCallContext extends ExpressionContext {
		public Token id;
		public CallParametersContext cp;
		public TerminalNode LPAREN() { return getToken(OberonGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(OberonGrammarParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public ExprFuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterExprFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitExprFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitExprFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ExprNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(269);
				((ExprNotExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
					((ExprNotExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				((ExprNotExpressionContext)_localctx).e = expression(9);
				}
				break;
			case 2:
				{
				_localctx = new ExprSingleIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				((ExprSingleIdContext)_localctx).id = match(ID);
				setState(272);
				((ExprSingleIdContext)_localctx).s = selector();
				}
				break;
			case 3:
				{
				_localctx = new ExprFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				((ExprFuncCallContext)_localctx).id = match(ID);
				setState(274);
				match(LPAREN);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949955653656L) != 0)) {
					{
					setState(275);
					((ExprFuncCallContext)_localctx).cp = callParameters();
					}
				}

				setState(278);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ExprEmbeddedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(LPAREN);
				setState(280);
				((ExprEmbeddedExpressionContext)_localctx).e = expression(0);
				setState(281);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ExprConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				((ExprConstantContext)_localctx).c = match(Constant);
				}
				break;
			case 6:
				{
				_localctx = new ExprStringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				((ExprStringLiteralContext)_localctx).s = match(STRING_LITERAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultPrecedenceContext(new ExpressionContext(_parentctx, _parentState));
						((ExprMultPrecedenceContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(288);
						((ExprMultPrecedenceContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 422212466180096L) != 0)) ) {
							((ExprMultPrecedenceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(289);
						((ExprMultPrecedenceContext)_localctx).r = expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprFactPrecedenceContext(new ExpressionContext(_parentctx, _parentState));
						((ExprFactPrecedenceContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(291);
						((ExprFactPrecedenceContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 137439117312L) != 0)) ) {
							((ExprFactPrecedenceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(292);
						((ExprFactPrecedenceContext)_localctx).r = expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelPrecedenceContext(new ExpressionContext(_parentctx, _parentState));
						((ExprRelPrecedenceContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(294);
						((ExprRelPrecedenceContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63700992L) != 0)) ) {
							((ExprRelPrecedenceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(295);
						((ExprRelPrecedenceContext)_localctx).r = expression(7);
						}
						break;
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallParametersContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> p = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OberonGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OberonGrammarParser.COMMA, i);
		}
		public CallParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterCallParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitCallParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitCallParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParametersContext callParameters() throws RecognitionException {
		CallParametersContext _localctx = new CallParametersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_callParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((CallParametersContext)_localctx).expression = expression(0);
			((CallParametersContext)_localctx).p.add(((CallParametersContext)_localctx).expression);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(302);
				match(COMMA);
				setState(303);
				((CallParametersContext)_localctx).expression = expression(0);
				((CallParametersContext)_localctx).p.add(((CallParametersContext)_localctx).expression);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public ArrayOrRecordSelectorContext arrayOrRecordSelector;
		public List<ArrayOrRecordSelectorContext> i = new ArrayList<ArrayOrRecordSelectorContext>();
		public List<ArrayOrRecordSelectorContext> arrayOrRecordSelector() {
			return getRuleContexts(ArrayOrRecordSelectorContext.class);
		}
		public ArrayOrRecordSelectorContext arrayOrRecordSelector(int i) {
			return getRuleContext(ArrayOrRecordSelectorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_selector);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					((SelectorContext)_localctx).arrayOrRecordSelector = arrayOrRecordSelector();
					((SelectorContext)_localctx).i.add(((SelectorContext)_localctx).arrayOrRecordSelector);
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayOrRecordSelectorContext extends ParserRuleContext {
		public ArrayOrRecordSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOrRecordSelector; }
	 
		public ArrayOrRecordSelectorContext() { }
		public void copyFrom(ArrayOrRecordSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecordSelectorContext extends ArrayOrRecordSelectorContext {
		public TerminalNode DOT() { return getToken(OberonGrammarParser.DOT, 0); }
		public TerminalNode ID() { return getToken(OberonGrammarParser.ID, 0); }
		public RecordSelectorContext(ArrayOrRecordSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterRecordSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitRecordSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitRecordSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraySelectorContext extends ArrayOrRecordSelectorContext {
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArraySelectorContext(ArrayOrRecordSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).enterArraySelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonGrammarListener ) ((OberonGrammarListener)listener).exitArraySelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OberonGrammarVisitor ) return ((OberonGrammarVisitor<? extends T>)visitor).visitArraySelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOrRecordSelectorContext arrayOrRecordSelector() throws RecognitionException {
		ArrayOrRecordSelectorContext _localctx = new ArrayOrRecordSelectorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayOrRecordSelector);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new ArraySelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(T__0);
				setState(316);
				((ArraySelectorContext)_localctx).e = expression(0);
				setState(317);
				match(T__1);
				}
				break;
			case DOT:
				_localctx = new RecordSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(DOT);
				setState(320);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u0144\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001B\b\u0001\n\u0001\f\u0001"+
		"E\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0001"+
		"\u0002\u0003\u0002M\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002R\b\u0002\n\u0002\f\u0002U\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003^\b"+
		"\u0003\n\u0003\f\u0003a\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0003\u0004g\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004k\b\u0004"+
		"\n\u0004\f\u0004n\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005~\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0083\b\u0006\n\u0006"+
		"\f\u0006\u0086\t\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u008a\b\u0007"+
		"\n\u0007\f\u0007\u008d\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0096\b\b\u0001\t\u0001\t\u0004"+
		"\t\u009a\b\t\u000b\t\f\t\u009b\u0001\n\u0001\n\u0003\n\u00a0\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0004\u000b\u00a8\b"+
		"\u000b\u000b\u000b\f\u000b\u00a9\u0001\f\u0001\f\u0001\f\u0005\f\u00af"+
		"\b\f\n\f\f\f\u00b2\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0003\r\u00bb\b\r\u0001\u000e\u0001\u000e\u0004\u000e\u00bf\b"+
		"\u000e\u000b\u000e\f\u000e\u00c0\u0001\u000f\u0001\u000f\u0003\u000f\u00c5"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00cd\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d5\b\u0011\n\u0011\f\u0011"+
		"\u00d8\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00e0\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00e7\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0102\b\u0017\n\u0017\f\u0017\u0105\t\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0109\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0115\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u011e\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0129\b\u0018\n\u0018\f\u0018\u012c\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0131\b\u0019\n\u0019"+
		"\f\u0019\u0134\t\u0019\u0001\u001a\u0005\u001a\u0137\b\u001a\n\u001a\f"+
		"\u001a\u013a\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0142\b\u001b\u0001\u001b\u0000\u00010"+
		"\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0246\u0000\u0004\u0002\u0000\u0011\u0011\u0015"+
		"\u0015\u0003\u0000\u0010\u0010\u0014\u0014/0\u0003\u0000\u000f\u000f\u0011"+
		"\u0011%%\u0002\u0000\u0012\u0013\u0016\u0019\u0153\u00008\u0001\u0000"+
		"\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004F\u0001\u0000\u0000\u0000"+
		"\u0006Y\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000\u0000\n}\u0001\u0000"+
		"\u0000\u0000\f\u007f\u0001\u0000\u0000\u0000\u000e\u008b\u0001\u0000\u0000"+
		"\u0000\u0010\u0095\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000"+
		"\u0000\u0014\u009d\u0001\u0000\u0000\u0000\u0016\u00a5\u0001\u0000\u0000"+
		"\u0000\u0018\u00b0\u0001\u0000\u0000\u0000\u001a\u00b8\u0001\u0000\u0000"+
		"\u0000\u001c\u00bc\u0001\u0000\u0000\u0000\u001e\u00c2\u0001\u0000\u0000"+
		"\u0000 \u00cc\u0001\u0000\u0000\u0000\"\u00d1\u0001\u0000\u0000\u0000"+
		"$\u00df\u0001\u0000\u0000\u0000&\u00e1\u0001\u0000\u0000\u0000(\u00e8"+
		"\u0001\u0000\u0000\u0000*\u00ed\u0001\u0000\u0000\u0000,\u00f3\u0001\u0000"+
		"\u0000\u0000.\u00f8\u0001\u0000\u0000\u00000\u011d\u0001\u0000\u0000\u0000"+
		"2\u012d\u0001\u0000\u0000\u00004\u0138\u0001\u0000\u0000\u00006\u0141"+
		"\u0001\u0000\u0000\u000089\u0005\u001b\u0000\u00009:\u00051\u0000\u0000"+
		":;\u0005\t\u0000\u0000;<\u0003\u0002\u0001\u0000<=\u0003 \u0010\u0000"+
		"=>\u0005\u000b\u0000\u0000>\u0001\u0001\u0000\u0000\u0000?B\u0003\u0004"+
		"\u0002\u0000@B\u0003\u0010\b\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000FG\u0005!\u0000\u0000GI\u00051\u0000\u0000HJ\u0003\u0006\u0003\u0000"+
		"IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000"+
		"\u0000KM\u0005\u0014\u0000\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NS\u0005\t\u0000\u0000OR\u0003\u0004"+
		"\u0002\u0000PR\u0003\u0010\b\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000"+
		"\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VW\u0003 \u0010\u0000WX\u0005\t\u0000\u0000X\u0005\u0001\u0000\u0000\u0000"+
		"Y_\u0005\f\u0000\u0000Z[\u0003\b\u0004\u0000[\\\u0005\t\u0000\u0000\\"+
		"^\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0003\b\u0004\u0000cd\u0005\r"+
		"\u0000\u0000d\u0007\u0001\u0000\u0000\u0000eg\u0005\u001d\u0000\u0000"+
		"fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gl\u0001\u0000\u0000"+
		"\u0000hi\u00051\u0000\u0000ik\u0005\u000e\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005"+
		"1\u0000\u0000pq\u0005\n\u0000\u0000qr\u0003\n\u0005\u0000r\t\u0001\u0000"+
		"\u0000\u0000s~\u00051\u0000\u0000tu\u0005#\u0000\u0000uv\u00030\u0018"+
		"\u0000vw\u0005$\u0000\u0000wx\u0003\n\u0005\u0000x~\u0001\u0000\u0000"+
		"\u0000yz\u0005&\u0000\u0000z{\u0003\f\u0006\u0000{|\u0005 \u0000\u0000"+
		"|~\u0001\u0000\u0000\u0000}s\u0001\u0000\u0000\u0000}t\u0001\u0000\u0000"+
		"\u0000}y\u0001\u0000\u0000\u0000~\u000b\u0001\u0000\u0000\u0000\u007f"+
		"\u0084\u0003\u000e\u0007\u0000\u0080\u0081\u0005\t\u0000\u0000\u0081\u0083"+
		"\u0003\u000e\u0007\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\r\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u00051\u0000\u0000\u0088\u008a\u0005\u000e"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u00051\u0000\u0000\u008f\u0090\u0005\n\u0000"+
		"\u0000\u0090\u0091\u0003\n\u0005\u0000\u0091\u000f\u0001\u0000\u0000\u0000"+
		"\u0092\u0096\u0003\u0016\u000b\u0000\u0093\u0096\u0003\u001c\u000e\u0000"+
		"\u0094\u0096\u0003\u0012\t\u0000\u0095\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0011\u0001\u0000\u0000\u0000\u0097\u0099\u0005\"\u0000\u0000\u0098\u009a"+
		"\u0003\u0014\n\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d\u009f\u0005"+
		"1\u0000\u0000\u009e\u00a0\u0005\u0014\u0000\u0000\u009f\u009e\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0013\u0000\u0000\u00a2\u00a3\u0003\n\u0005"+
		"\u0000\u00a3\u00a4\u0005\t\u0000\u0000\u00a4\u0015\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0005\u001d\u0000\u0000\u00a6\u00a8\u0003\u0018\f\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003\u001a\r\u0000\u00ac\u00ad"+
		"\u0005\u000e\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ab"+
		"\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0003\u001a\r\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5\u00b6\u0003"+
		"\n\u0005\u0000\u00b6\u00b7\u0005\t\u0000\u0000\u00b7\u0019\u0001\u0000"+
		"\u0000\u0000\u00b8\u00ba\u00051\u0000\u0000\u00b9\u00bb\u0005\u0014\u0000"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u001b\u0001\u0000\u0000\u0000\u00bc\u00be\u0005\u001f\u0000"+
		"\u0000\u00bd\u00bf\u0003\u001e\u000f\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u001d\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u00051\u0000\u0000\u00c3\u00c5\u0005\u0014\u0000\u0000"+
		"\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0013\u0000\u0000"+
		"\u00c7\u00c8\u00030\u0018\u0000\u00c8\u00c9\u0005\t\u0000\u0000\u00c9"+
		"\u001f\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u001e\u0000\u0000\u00cb"+
		"\u00cd\u0003\"\u0011\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005 \u0000\u0000\u00cf\u00d0\u00051\u0000\u0000\u00d0!\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d6\u0003$\u0012\u0000\u00d2\u00d3\u0005\t\u0000"+
		"\u0000\u00d3\u00d5\u0003$\u0012\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7#\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00e0\u0003(\u0014\u0000\u00da\u00e0"+
		"\u0003&\u0013\u0000\u00db\u00e0\u0003*\u0015\u0000\u00dc\u00e0\u0003,"+
		"\u0016\u0000\u00dd\u00e0\u0003.\u0017\u0000\u00de\u00e0\u0001\u0000\u0000"+
		"\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000"+
		"\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0%\u0001\u0000\u0000\u0000\u00e1\u00e6\u00051\u0000\u0000\u00e2"+
		"\u00e3\u0005\f\u0000\u0000\u00e3\u00e4\u00032\u0019\u0000\u00e4\u00e5"+
		"\u0005\r\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\'\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u00051\u0000\u0000\u00e9\u00ea\u00034\u001a\u0000"+
		"\u00ea\u00eb\u0005\u001a\u0000\u0000\u00eb\u00ec\u00030\u0018\u0000\u00ec"+
		")\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\'\u0000\u0000\u00ee\u00ef"+
		"\u00030\u0018\u0000\u00ef\u00f0\u0005(\u0000\u0000\u00f0\u00f1\u0003\""+
		"\u0011\u0000\u00f1\u00f2\u0005 \u0000\u0000\u00f2+\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005-\u0000\u0000\u00f4\u00f5\u0003\"\u0011\u0000\u00f5"+
		"\u00f6\u0005.\u0000\u0000\u00f6\u00f7\u00030\u0018\u0000\u00f7-\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0005)\u0000\u0000\u00f9\u00fa\u00030\u0018"+
		"\u0000\u00fa\u00fb\u0005*\u0000\u0000\u00fb\u0103\u0003\"\u0011\u0000"+
		"\u00fc\u00fd\u0005,\u0000\u0000\u00fd\u00fe\u00030\u0018\u0000\u00fe\u00ff"+
		"\u0005*\u0000\u0000\u00ff\u0100\u0003\"\u0011\u0000\u0100\u0102\u0001"+
		"\u0000\u0000\u0000\u0101\u00fc\u0001\u0000\u0000\u0000\u0102\u0105\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0108\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0005+\u0000\u0000\u0107\u0109\u0003\""+
		"\u0011\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0005 \u0000"+
		"\u0000\u010b/\u0001\u0000\u0000\u0000\u010c\u010d\u0006\u0018\uffff\uffff"+
		"\u0000\u010d\u010e\u0007\u0000\u0000\u0000\u010e\u011e\u00030\u0018\t"+
		"\u010f\u0110\u00051\u0000\u0000\u0110\u011e\u00034\u001a\u0000\u0111\u0112"+
		"\u00051\u0000\u0000\u0112\u0114\u0005\f\u0000\u0000\u0113\u0115\u0003"+
		"2\u0019\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u011e\u0005\r\u0000"+
		"\u0000\u0117\u0118\u0005\f\u0000\u0000\u0118\u0119\u00030\u0018\u0000"+
		"\u0119\u011a\u0005\r\u0000\u0000\u011a\u011e\u0001\u0000\u0000\u0000\u011b"+
		"\u011e\u0005\u0004\u0000\u0000\u011c\u011e\u0005\u0003\u0000\u0000\u011d"+
		"\u010c\u0001\u0000\u0000\u0000\u011d\u010f\u0001\u0000\u0000\u0000\u011d"+
		"\u0111\u0001\u0000\u0000\u0000\u011d\u0117\u0001\u0000\u0000\u0000\u011d"+
		"\u011b\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u012a\u0001\u0000\u0000\u0000\u011f\u0120\n\b\u0000\u0000\u0120\u0121"+
		"\u0007\u0001\u0000\u0000\u0121\u0129\u00030\u0018\t\u0122\u0123\n\u0007"+
		"\u0000\u0000\u0123\u0124\u0007\u0002\u0000\u0000\u0124\u0129\u00030\u0018"+
		"\b\u0125\u0126\n\u0006\u0000\u0000\u0126\u0127\u0007\u0003\u0000\u0000"+
		"\u0127\u0129\u00030\u0018\u0007\u0128\u011f\u0001\u0000\u0000\u0000\u0128"+
		"\u0122\u0001\u0000\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0129"+
		"\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0001\u0000\u0000\u0000\u012b1\u0001\u0000\u0000\u0000\u012c\u012a"+
		"\u0001\u0000\u0000\u0000\u012d\u0132\u00030\u0018\u0000\u012e\u012f\u0005"+
		"\u000e\u0000\u0000\u012f\u0131\u00030\u0018\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u01333\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0137\u00036\u001b\u0000"+
		"\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000"+
		"\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u01395\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005\u0001\u0000\u0000\u013c\u013d\u00030\u0018\u0000\u013d\u013e"+
		"\u0005\u0002\u0000\u0000\u013e\u0142\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005\u000b\u0000\u0000\u0140\u0142\u00051\u0000\u0000\u0141\u013b\u0001"+
		"\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u01427\u0001\u0000"+
		"\u0000\u0000!ACILQS_fl}\u0084\u008b\u0095\u009b\u009f\u00a9\u00b0\u00ba"+
		"\u00c0\u00c4\u00cc\u00d6\u00df\u00e6\u0103\u0108\u0114\u011d\u0128\u012a"+
		"\u0132\u0138\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}