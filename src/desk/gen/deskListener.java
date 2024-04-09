// Generated from C:/Users/omer_/IdeaProjects/OberonRecognizer/src/desk/grammar/desk.g4 by ANTLR 4.13.1
package desk.gen;
import desk.grammar.deskParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link deskParser}.
 */
public interface deskListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link deskParser#desk}.
	 * @param ctx the parse tree
	 */
	void enterDesk(deskParser.DeskContext ctx);
	/**
	 * Exit a parse tree produced by {@link deskParser#desk}.
	 * @param ctx the parse tree
	 */
	void exitDesk(deskParser.DeskContext ctx);
	/**
	 * Enter a parse tree produced by {@link deskParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(deskParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link deskParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(deskParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link deskParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(deskParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link deskParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(deskParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link deskParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(deskParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link deskParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(deskParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link deskParser#ds}.
	 * @param ctx the parse tree
	 */
	void enterDs(deskParser.DsContext ctx);
	/**
	 * Exit a parse tree produced by {@link deskParser#ds}.
	 * @param ctx the parse tree
	 */
	void exitDs(deskParser.DsContext ctx);
	/**
	 * Enter a parse tree produced by {@link deskParser#d}.
	 * @param ctx the parse tree
	 */
	void enterD(deskParser.DContext ctx);
	/**
	 * Exit a parse tree produced by {@link deskParser#d}.
	 * @param ctx the parse tree
	 */
	void exitD(deskParser.DContext ctx);
}