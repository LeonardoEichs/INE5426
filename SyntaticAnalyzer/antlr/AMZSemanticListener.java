import org.antlr.v4.runtime.tree.ParseTreeProperty;

import symbol.*;

public class AMZSemanticListener extends AMZ_syntBaseListener {

	private enum Type {
		INT ("int"),
		DOUBLE ("double"),
		BOOLEAN ("boolean"),
		STRING ("string"),
		OBJECT ("object"),
		VOID ("void");

		private final String name;

    private Type(String s) {
        name = s;
    }

		public String toString() {
			return this.name;
	 }
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
		} else {
			// String type = ctx.type().getText();
			symbol = new Symbol(Symbol.SymbolType.VARIABLE);
			symbolTable.put(id, symbol);
		}

		types.put(ctx, types.get(ctx.type()));
		Integer size = -1;
		if (ctx.array_position() != null) {
			size = sizes.get(ctx.array_position());
		}
		sizes.put(ctx, size);
		symbolTable.printTable();
	}

	public void exitArray_position(AMZ_syntParser.Array_positionContext ctx) {
		Integer size = Integer.parseInt(ctx.INTEGER().getText());
		sizes.put(ctx, size);
	}

	public void exitArray_literal(AMZ_syntParser.Array_literalContext ctx) {
		int size = ctx.expression().size();
		if (size > 0) {
			Type type = types.get(ctx.expression(0));
			sizes.put(ctx, size);
			types.put(ctx, type);
			for (int i = 1; i < size; i++) {
				if (types.get(ctx.expression(i)) != type) {
					System.out.println("Erro na linha " + ctx.getStart().getLine() + ":");
					System.out.println("Array com valores de diferentes tipos");
				}
			}

		}

	}

	public void exitCmdDeclAttrib(AMZ_syntParser.CmdDeclAttribContext ctx) {
		Type type0 = types.get(ctx.declaration());
		Type type1 = types.get(ctx.expression());
		Integer size0 = sizes.get(ctx.declaration());
		Integer size1 = sizes.get(ctx.expression());
		if (size0 != null && size1 != null && !size0.equals(size1)) {
			System.out.println("Erro na linha " + ctx.getStart().getLine() + ":");
			String strSize0 = size0 == -1 ? "Não array" : "Array de tamanho " + size0;
			String strSize1 = size1 == -1 ? "Não array" : "Array de tamanho " + size1;
			System.out.println("Atribuição com tamanho incompatível. Recebido: "
				+ strSize1 + ". Esperava-se: " + strSize0 + '.');
		}
		if (type0 != type1) {
			System.out.println("Erro na linha " + ctx.getStart().getLine() + ":");
			System.out.println("Atribuição com tipo incompatível. Recebido: "
				+ type1 + ". Esperava-se: " + type0 + '.');
		}
	}

	public void enterBlock_command(AMZ_syntParser.Block_commandContext ctx) {
		symbolTable = new SymbolTable(symbolTable);
	}

	public void exitBlock_command(AMZ_syntParser.Block_commandContext ctx) {
		symbolTable = symbolTable.parent;
	}

	public void exitCommand_block(AMZ_syntParser.Command_blockContext ctx) {
		// symbolTable = symbolTable.parent;
	}

	public void exitWhile_block(AMZ_syntParser.While_blockContext ctx) {
		symbolTable = symbolTable.parent;
	}

	private boolean requireNotArray(Integer size, Integer line) {
		if (size == null || size.intValue() != -1) {
			System.out.println("Erro na linha " + line + ":");
			System.out.println("Array recebido. Não se esperava um array.");
			return false;
		}
		return true;
	}

	private boolean requireNumber(Type t, int line) {
		if (t != Type.DOUBLE && t != Type.INT) {
			System.out.println("Erro na linha " + line + ":");
			System.out.println("Tipo inválido. Esperava-se double ou int. Recebido: " + t + ".");
			return false;
		}
		return true;
	}

	private Type checkNumberBinType(Type type0, Type type1, int line) {

		if (!requireNumber(type0, line) || !requireNumber(type1, line)) {
			return null;
		}

		if (type0 == Type.DOUBLE || type1 == Type.DOUBLE) {
			return Type.DOUBLE;
		} else {
			return Type.INT;
		}

	}

	public void exitFor_block(AMZ_syntParser.For_blockContext ctx) {
		symbolTable = symbolTable.parent;
	}

	public void exitType(AMZ_syntParser.TypeContext ctx) {
		if (ctx.DOUBLE() != null) {
			types.put(ctx, Type.DOUBLE);
			sizes.put(ctx, -1);
		} else if (ctx.INT() != null) {
			types.put(ctx, Type.INT);
			sizes.put(ctx, -1);
		} else if (ctx.STRING() != null) {
			types.put(ctx, Type.STRING);
			sizes.put(ctx, -1);
		} else if (ctx.OBJECT() != null) {
			types.put(ctx, Type.OBJECT);
			sizes.put(ctx, -1);
		} else if (ctx.BOOLEAN() != null) {
			types.put(ctx, Type.BOOLEAN);
			sizes.put(ctx, -1);
		} else {
			types.put(ctx, Type.VOID);
			sizes.put(ctx, -1);
		}

		// System.out.println(ctx.getText() + " " + types.get(ctx));
	}

	// expression  arithmetic_binary_op_lower_prec    expression
	public void exitExpBinArithmL(AMZ_syntParser.ExpBinArithmLContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();

		types.put(ctx, checkNumberBinType(type0, type1, line));


		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (!requireNotArray(size0, line) && !requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
	}

	// expression  arithmetic_binary_op_higher_prec    expression
	public void exitExpBinArithmH(AMZ_syntParser.ExpBinArithmHContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();
		types.put(ctx, checkNumberBinType(type0, type1, line));

		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (!requireNotArray(size0, line) && !requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
	}

	// expression  comparison_op_higher_prec          expression
	public void exitExpBinCompH(AMZ_syntParser.ExpBinCompHContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();
		if (checkNumberBinType(type0, type1, line) != null) {
			types.put(ctx, Type.BOOLEAN);
		}
		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (!requireNotArray(size0, line) && !requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
	}

	// expression  comparison_op_lower_prec          expression
	public void exitExpBinCompL(AMZ_syntParser.ExpBinCompLContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();
		if (type0 == Type.BOOLEAN) {
			if (type1 != Type.BOOLEAN) {
				System.out.println("Erro na linha " + line + ":");
				System.out.println("Tipos incompatíveis");
				return;
			}
		} else if (type0 == Type.INT) {
			if (type1 != Type.INT) {
				System.out.println("Erro na linha " + line + ":");
				System.out.println("Tipos incompatíveis");
				return;
			}
		} else if (type0 == Type.DOUBLE) {
			if (type1 != Type.DOUBLE) {
				System.out.println("Erro na linha " + line + ":");
				System.out.println("Tipos incompatíveis");
				return;
			}
		} else if (type0 == Type.STRING) {
			if (type1 != Type.STRING) {
				System.out.println("Erro na linha " + line + ":");
				System.out.println("Tipos incompatíveis");
				return;
			}
		} else {
			System.out.println("Erro na linha " + line + ":");
			System.out.println("Tipo não permitido");
			return;
		}
		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (!requireNotArray(size0, line) && !requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
		types.put(ctx, Type.BOOLEAN);
	}

	public void exitExpBinLogicH(AMZ_syntParser.ExpBinLogicHContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();

		if (type0 != Type.BOOLEAN) {
			System.out.println("Erro na linha " + line + ":");
			System.out.println("Tipo inválido. Esperava-se boolean. Recebido: " + type0 + ".");
			return;
		}
		if (type1 != Type.BOOLEAN) {
			System.out.println("Erro na linha " + line + ":");
			System.out.println("Tipo inválido. Esperava-se boolean. Recebido: " + type1 + ".");
			return;
		}
		types.put(ctx, Type.BOOLEAN);

		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (!requireNotArray(size0, line) && !requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
	}

	public void exitExpBinLogicL(AMZ_syntParser.ExpBinLogicLContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();

		if (type0 != Type.BOOLEAN) {
			System.out.println("Erro na linha " + line + ":");
			System.out.println("Tipo inválido. Esperava-se boolean. Recebido: " + type0 + ".");
			return;
		}
		if (type1 != Type.BOOLEAN) {
			System.out.println("Erro na linha " + line + ":");
			System.out.println("Tipo inválido. Esperava-se boolean. Recebido: " + type1 + ".");
			return;
		}
		types.put(ctx, Type.BOOLEAN);

		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (!requireNotArray(size0, line) && !requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
	}

	// unary_arithm_operator expression
	public void exitExpUnaryArithm(AMZ_syntParser.ExpUnaryArithmContext ctx) {
		Type type = types.get(ctx.expression());
		if (type != Type.DOUBLE && type != Type.INT) {
			System.out.println("Tipo esperado: double ou int.");
			return;
		}
		else if (type == Type.DOUBLE) {
			types.put(ctx, Type.DOUBLE);
		} else {
			types.put(ctx, Type.INT);
		}

		sizes.put(ctx, -1);
	}

	// unary_bool_operator expression
	public void exitExpUnaryBool(AMZ_syntParser.ExpUnaryBoolContext ctx) {
		Type type = types.get(ctx.expression());
		if (type != Type.BOOLEAN) {
			System.out.println("Tipo esperado: boolean.");
			return;
		} else {
			types.put(ctx, Type.BOOLEAN);
		}
		sizes.put(ctx, -1);

	}

	public void exitExpParen(AMZ_syntParser.ExpParenContext ctx) {
		types.put(ctx, types.get(ctx.expression()));
		sizes.put(ctx, sizes.get(ctx.expression()));
	}

	// expression : (value | ID | function_call) array_position? object_id? #ExpExit
	public void exitExpExit(AMZ_syntParser.ExpExitContext ctx) {
		//TODO object_id
		if (ctx.value() != null) {
			types.put(ctx, types.get(ctx.value()));
			sizes.put(ctx, sizes.get(ctx.value()));
		} else if (ctx.ID() != null) {

		}
	}


}
