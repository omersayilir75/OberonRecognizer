// Generated from C:/Users/omer_/IdeaProjects/OberonRecognizer/src/desk/grammar/deskTerminalOnly.g4 by ANTLR 4.13.1
package desk.desk.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link deskTerminalOnlyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface deskTerminalOnlyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link deskTerminalOnlyParser#desk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesk(deskTerminalOnlyParser.DeskContext ctx);
	/**
	 * Visit a parse tree produced by {@link deskTerminalOnlyParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(deskTerminalOnlyParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link deskTerminalOnlyParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(deskTerminalOnlyParser.CContext ctx);
	/**
	 * Visit a parse tree produced by {@link deskTerminalOnlyParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(deskTerminalOnlyParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link deskTerminalOnlyParser#ds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDs(deskTerminalOnlyParser.DsContext ctx);
	/**
	 * Visit a parse tree produced by {@link deskTerminalOnlyParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD(deskTerminalOnlyParser.DContext ctx);
}