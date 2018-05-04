import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class AMZSemanticListener extends AMZ_syntBaseListener {

	public SymbolTable symbolTable;

	public void enterEval(AMZ_syntParser.EvalContext ctx) {
		symbolTable = new SymbolTable(null); // Initialize symbol table
		System.out.println("Symbol table created");
	}






}