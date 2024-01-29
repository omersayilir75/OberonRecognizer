// Generated from C:/Users/omer_/IdeaProjects/OberonRecognizer/src/no_whitespace/OberonGrammar.g4 by ANTLR 4.13.1
package gen.no_whitespace;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OberonGrammarParser}.
 */
public interface OberonGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModuleDefinition(OberonGrammarParser.ModuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModuleDefinition(OberonGrammarParser.ModuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(OberonGrammarParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(OberonGrammarParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(OberonGrammarParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(OberonGrammarParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#procedureParameters}.
	 * @param ctx the parse tree
	 */
	void enterProcedureParameters(OberonGrammarParser.ProcedureParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#procedureParameters}.
	 * @param ctx the parse tree
	 */
	void exitProcedureParameters(OberonGrammarParser.ProcedureParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void enterProcedureParameter(OberonGrammarParser.ProcedureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void exitProcedureParameter(OberonGrammarParser.ProcedureParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTypeName}
	 * labeled alternative in {@link OberonGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(OberonGrammarParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTypeName}
	 * labeled alternative in {@link OberonGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(OberonGrammarParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link OberonGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(OberonGrammarParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link OberonGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(OberonGrammarParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordTypeName}
	 * labeled alternative in {@link OberonGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterRecordTypeName(OberonGrammarParser.RecordTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordTypeName}
	 * labeled alternative in {@link OberonGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitRecordTypeName(OberonGrammarParser.RecordTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#recordTypeNameElements}.
	 * @param ctx the parse tree
	 */
	void enterRecordTypeNameElements(OberonGrammarParser.RecordTypeNameElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#recordTypeNameElements}.
	 * @param ctx the parse tree
	 */
	void exitRecordTypeNameElements(OberonGrammarParser.RecordTypeNameElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#recordElement}.
	 * @param ctx the parse tree
	 */
	void enterRecordElement(OberonGrammarParser.RecordElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#recordElement}.
	 * @param ctx the parse tree
	 */
	void exitRecordElement(OberonGrammarParser.RecordElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclaration(OberonGrammarParser.LocalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclaration(OberonGrammarParser.LocalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(OberonGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(OberonGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#singleTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeDeclaration(OberonGrammarParser.SingleTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#singleTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeDeclaration(OberonGrammarParser.SingleTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(OberonGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(OberonGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#singleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleVariableDeclaration(OberonGrammarParser.SingleVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#singleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleVariableDeclaration(OberonGrammarParser.SingleVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#exportableID}.
	 * @param ctx the parse tree
	 */
	void enterExportableID(OberonGrammarParser.ExportableIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#exportableID}.
	 * @param ctx the parse tree
	 */
	void exitExportableID(OberonGrammarParser.ExportableIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(OberonGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(OberonGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#constDeclarationElement}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclarationElement(OberonGrammarParser.ConstDeclarationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#constDeclarationElement}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclarationElement(OberonGrammarParser.ConstDeclarationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(OberonGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(OberonGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(OberonGrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(OberonGrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OberonGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OberonGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#procCall_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcCall_statement(OberonGrammarParser.ProcCall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#procCall_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcCall_statement(OberonGrammarParser.ProcCall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(OberonGrammarParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(OberonGrammarParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(OberonGrammarParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(OberonGrammarParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_statement(OberonGrammarParser.Repeat_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_statement(OberonGrammarParser.Repeat_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(OberonGrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(OberonGrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNotExpression}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNotExpression(OberonGrammarParser.ExprNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNotExpression}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNotExpression(OberonGrammarParser.ExprNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFactPrecedence}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFactPrecedence(OberonGrammarParser.ExprFactPrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFactPrecedence}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFactPrecedence(OberonGrammarParser.ExprFactPrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStringLiteral}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprStringLiteral(OberonGrammarParser.ExprStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStringLiteral}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprStringLiteral(OberonGrammarParser.ExprStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRelPrecedence}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprRelPrecedence(OberonGrammarParser.ExprRelPrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRelPrecedence}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprRelPrecedence(OberonGrammarParser.ExprRelPrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultPrecedence}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMultPrecedence(OberonGrammarParser.ExprMultPrecedenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultPrecedence}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMultPrecedence(OberonGrammarParser.ExprMultPrecedenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprEmbeddedExpression}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprEmbeddedExpression(OberonGrammarParser.ExprEmbeddedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprEmbeddedExpression}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprEmbeddedExpression(OberonGrammarParser.ExprEmbeddedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprConstant}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprConstant(OberonGrammarParser.ExprConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprConstant}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprConstant(OberonGrammarParser.ExprConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSingleId}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprSingleId(OberonGrammarParser.ExprSingleIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSingleId}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprSingleId(OberonGrammarParser.ExprSingleIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFuncCall}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFuncCall(OberonGrammarParser.ExprFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFuncCall}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFuncCall(OberonGrammarParser.ExprFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#callParameters}.
	 * @param ctx the parse tree
	 */
	void enterCallParameters(OberonGrammarParser.CallParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#callParameters}.
	 * @param ctx the parse tree
	 */
	void exitCallParameters(OberonGrammarParser.CallParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OberonGrammarParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(OberonGrammarParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OberonGrammarParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(OberonGrammarParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraySelector}
	 * labeled alternative in {@link OberonGrammarParser#arrayOrRecordSelector}.
	 * @param ctx the parse tree
	 */
	void enterArraySelector(OberonGrammarParser.ArraySelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraySelector}
	 * labeled alternative in {@link OberonGrammarParser#arrayOrRecordSelector}.
	 * @param ctx the parse tree
	 */
	void exitArraySelector(OberonGrammarParser.ArraySelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordSelector}
	 * labeled alternative in {@link OberonGrammarParser#arrayOrRecordSelector}.
	 * @param ctx the parse tree
	 */
	void enterRecordSelector(OberonGrammarParser.RecordSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordSelector}
	 * labeled alternative in {@link OberonGrammarParser#arrayOrRecordSelector}.
	 * @param ctx the parse tree
	 */
	void exitRecordSelector(OberonGrammarParser.RecordSelectorContext ctx);
}