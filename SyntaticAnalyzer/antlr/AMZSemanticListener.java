import org.antlr.v4.runtime.tree.ParseTreeProperty;

import symbol.*;

public class AMZSemanticListener extends AMZ_syntBaseListener {

	private enum Type {
		INT,
		DOUBLE,
		BOOLEAN,
		STRING,
		OBJECT,
		VOID
	}

	public SymbolTable symbolTable;

	//anotacoes
	private ParseTreeProperty<Type> types = new ParseTreeProperty<>();
	// private ParseTreeProperty<String> id = new ParseTreeProperty<>();
	private ParseTreeProperty<Integer> sizes = new ParseTreeProperty<>();

	public void enterEval(AMZ_syntParser.EvalContext ctx) {
		symbolTable = new SymbolTable(null); // Initialize symbol table
		System.out.println("Symbol table created");
	}

	public void exitValue(AMZ_syntParser.ValueContext ctx) {
		if (ctx.DOUBLE_LITERAL() != null) {
			types.put(ctx, Type.DOUBLE);
			sizes.put(ctx, -1);

			// double val = Double.parseDouble(ctx.DOUBLE_LITERAL().getText());
		} else if (ctx.INTEGER() != null) {
			types.put(ctx, Type.INT);
			sizes.put(ctx, -1);

			// int val = Integer.parseInt(ctx.INTEGER().getText());
		} else if (ctx.STRING_LITERAL() != null) {
			types.put(ctx, Type.STRING);
			sizes.put(ctx, -1);

			// String val = ctx.STRING_LITERAL().getText();
			// val = val.substring(1, val.length()-1)
			// 	.replace("\\\"", "\"")
			// 	.replace("\\\\", "\\")
			// 	.replace("\\r", "\r")
			// 	.replace("\\n", "\n")
			// 	.replace("\\t", "\t");

		} else if (ctx.object_literal() != null) {
			types.put(ctx, Type.OBJECT);
			sizes.put(ctx, -1);
		} else if (ctx.array_literal() != null) {
			types.put(ctx, types.get(ctx.array_literal()));
			sizes.put(ctx, sizes.get(ctx.array_literal()));
		} else if (ctx.boolean_value() != null) {
			types.put(ctx, Type.BOOLEAN);
			sizes.put(ctx, -1);
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


	public void exitExpBinArithmL(AMZ_syntParser.ExpBinArithmLContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));

		// Predicado:
		if ( (type0 != Type.DOUBLE && type0 != Type.INT)
			|| (type1 != Type.DOUBLE && type1 != Type.INT)) {
			System.out.println("Tipo esperado: double ou int.");
			return;
		}

		if (type0 == Type.DOUBLE || type1 == Type.DOUBLE) {
			types.put(ctx, Type.DOUBLE);
		} else {
			types.put(ctx, Type.INT);
		}
	}

	public void exitExpParen(AMZ_syntParser.ExpParenContext ctx) {

	}

	public void exitExpExit(AMZ_syntParser.ExpExitContext ctx) {
		if (ctx.value() != null) {
			types.put(ctx, types.get(ctx.value()));
		} else if (ctx.ID() != null) {

		}
	}

}
