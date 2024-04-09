// Generated from C:/Users/omer_/IdeaProjects/OberonRecognizer/src/desk/grammar/desk.g4 by ANTLR 4.13.1
package desk.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link deskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface deskVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link deskParser#desk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesk(deskParser.DeskContext ctx);
	/**
	 * Visit a parse tree produced by {@link deskParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(deskParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link deskParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(deskParser.CContext ctx);
	/**
	 * Visit a parse tree produced by {@link deskParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(deskParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link deskParser#ds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDs(deskParser.DsContext ctx);
	/**
	 * Visit a parse tree produced by {@link deskParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD(deskParser.DContext ctx);
}