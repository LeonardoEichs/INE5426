import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class AMZSemanticListener extends AMZ_syntBaseListener {

	public SymbolTable symbolTable;

	public void enterEval(AMZ_syntParser.EvalContext ctx) {
		symbolTable = new SymbolTable(null); // Initialize symbol table
		System.out.println("Symbol table created");
	}

	public void exitValue(AMZ_syntParser.ValueContext ctx) {
		if (ctx.DOUBLE_LITERAL() != null) {
			double val = Double.parseDouble(ctx.DOUBLE_LITERAL().getText());
			System.out.println(val);
		} else if (ctx.INTEGER() != null) {
			int val = Integer.parseInt(ctx.INTEGER().getText());
			System.out.println(val);
		} else if (ctx.STRING_LITERAL() != null) {
			String val = ctx.STRING_LITERAL().getText();
			val = val.substring(1, val.length()-1)
				.replace("\\\"", "\"")
				.replace("\\\\", "\\")
				.replace("\\r", "\r")
				.replace("\\n", "\n")
				.replace("\\t", "\t");
			System.out.println(val);
		} else {

		}
	}





}
