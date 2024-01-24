package gen;// Generated from C:/Users/omer_/IdeaProjects/OberonRecognizer/src/OberonGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OberonGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OberonGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#moduleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDefinition(OberonGrammarParser.ModuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(OberonGrammarParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#importDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefinition(OberonGrammarParser.ImportDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(OberonGrammarParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#procedureParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureParameters(OberonGrammarParser.ProcedureParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#procedureParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureParameter(OberonGrammarParser.ProcedureParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleTypeName}
	 * labeled alternative in {@link OberonGrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(OberonGrammarParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link OberonGrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(OberonGrammarParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordTypeName}
	 * labeled alternative in {@link OberonGrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordTypeName(OberonGrammarParser.RecordTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#recordTypeNameElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordTypeNameElements(OberonGrammarParser.RecordTypeNameElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#recordElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordElement(OberonGrammarParser.RecordElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#localDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclaration(OberonGrammarParser.LocalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(OberonGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#singleTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeDeclaration(OberonGrammarParser.SingleTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(OberonGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#singleVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVariableDeclaration(OberonGrammarParser.SingleVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#exportableID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportableID(OberonGrammarParser.ExportableIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(OberonGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#constDeclarationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclarationElement(OberonGrammarParser.ConstDeclarationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(OberonGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(OberonGrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OberonGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#procCall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcCall_statement(OberonGrammarParser.ProcCall_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(OberonGrammarParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(OberonGrammarParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_statement(OberonGrammarParser.Repeat_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(OberonGrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNotExpression}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNotExpression(OberonGrammarParser.ExprNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFactPrecedence}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFactPrecedence(OberonGrammarParser.ExprFactPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStringLiteral}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStringLiteral(OberonGrammarParser.ExprStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRelPrecedence}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelPrecedence(OberonGrammarParser.ExprRelPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultPrecedence}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultPrecedence(OberonGrammarParser.ExprMultPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprEmbeddedExpression}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEmbeddedExpression(OberonGrammarParser.ExprEmbeddedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprConstant}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConstant(OberonGrammarParser.ExprConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSingleId}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSingleId(OberonGrammarParser.ExprSingleIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFuncCall}
	 * labeled alternative in {@link OberonGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFuncCall(OberonGrammarParser.ExprFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#callParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParameters(OberonGrammarParser.CallParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OberonGrammarParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(OberonGrammarParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraySelector}
	 * labeled alternative in {@link OberonGrammarParser#arrayOrRecordSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySelector(OberonGrammarParser.ArraySelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordSelector}
	 * labeled alternative in {@link OberonGrammarParser#arrayOrRecordSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordSelector(OberonGrammarParser.RecordSelectorContext ctx);
}