import org.antlr.v4.runtime.tree.ParseTreeProperty;

import symbol.*;

public class AMZSemanticListener extends AMZ_syntBaseListener {

	public SymbolTable symbolTable;

	//anotacoes
	private ParseTreeProperty<String> types = new ParseTreeProperty<>();
	private ParseTreeProperty<String> id = new ParseTreeProperty<>();
	private ParseTreeProperty<Integer> sizes = new ParseTreeProperty<>();

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

	//declaration : type ID array_position? ;
	//symbol.type VARIABLE, FUNCTION, OBJECT
	//simple_command :   declaration EQUALS expression | declaration;
	//function_block : declaration LPAREN parameters RPAREN command_block ;
	//parameters : (declaration (COMMA declaration)*)? ;
	// object_element : declaration COLON expression ;
	//verifica se ID ja foi declarado se não anota
	public void exitDeclaration(AMZ_syntParser.DeclarationContext ctx) {
		String id = ctx.ID().getText();

		Symbol symbol = symbolTable.lookup(id);
		//verifica se o simbolo(ID) ja ta na tabela de simbolos se tiver printa erro semantico e retorna
		if (symbol != null) {
			switch (symbol.type) {
				case VARIABLE:
					System.err.println("Variável já declarada");
					break;
				case FUNCTION:
					System.err.println("Função já declarada");
					break;
				case OBJECT:
					System.err.println("Objeto já declarada");
					break;
				}
				return;
		}





}
