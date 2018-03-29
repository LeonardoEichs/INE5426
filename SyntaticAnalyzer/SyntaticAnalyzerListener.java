// Generated from SyntaticAnalyzer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntaticAnalyzerParser}.
 */
public interface SyntaticAnalyzerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntaticAnalyzerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SyntaticAnalyzerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaticAnalyzerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SyntaticAnalyzerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaticAnalyzerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SyntaticAnalyzerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaticAnalyzerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SyntaticAnalyzerParser.DeclarationContext ctx);
}