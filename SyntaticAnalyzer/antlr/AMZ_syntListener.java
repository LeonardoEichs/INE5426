// Generated from AMZ_synt.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AMZ_syntParser}.
 */
public interface AMZ_syntListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AMZ_syntParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AMZ_syntParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AMZ_syntParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AMZ_syntParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AMZ_syntParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AMZ_syntParser.DeclarationContext ctx);
}