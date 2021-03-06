import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.ParserRuleContext;


import symbol.*;

import java.util.ArrayList;

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

	 	public static Type getEnumByString(String s){
     		for(Type e : Type.values()){
				if(s == e.name) return e;
		     }
      		return null;
  		}

	}

	private String filepath;

	public SymbolTable symbolTable;

	//anotacoes
	private ParseTreeProperty<Type> types = new ParseTreeProperty<>();
	private ParseTreeProperty<String> productionNames = new ParseTreeProperty<>();
	// private ParseTreeProperty<String> id = new ParseTreeProperty<>();
	private ParseTreeProperty<Integer> sizes = new ParseTreeProperty<>();

	public void enterFunction_block(AMZ_syntParser.Function_blockContext ctx) {
		symbolTable = new SymbolTable(symbolTable);
		productionNames.put(ctx, "function_block");
	}

	public AMZSemanticListener(String filepath) {
		this.filepath = filepath;
	}

	public SymbolTable getSymbolTable() {
		return symbolTable;
	}

	public void exitImport_file(AMZ_syntParser.Import_fileContext ctx) {
		String file = parseStringLiteral(ctx.STRING_LITERAL().getText());
		String[] args = {file};
		try {
			SymbolTable st = (new Main()).parse(args, this.filepath);
			symbolTable.importTable(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterEval(AMZ_syntParser.EvalContext ctx) {
		symbolTable = new SymbolTable(null); // Initialize symbol table
		// System.out.println("Symbol table created");
	}

	private String parseStringLiteral(String literalTxt) {
		return literalTxt.substring(1, literalTxt.length()-1)
			.replace("\\\"", "\"")
			.replace("\\\\", "\\")
			.replace("\\r", "\r")
			.replace("\\n", "\n")
			.replace("\\t", "\t");
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

			// String val = parseStringLiteral(ctx.STRING_LITERAL().getText());;

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
		int line = ctx.getStart().getLine();

		SymbolTable st = symbolTable;
		ParserRuleContext c = ctx;
		String rule = productionNames.get(c);
		Symbol symbol = st.lookup(id);
		if (symbol == null) { // ve se esta em loop ou if
			while (rule == "block_command" || rule == "CmdDeclAttrib" || rule == null) {
				c = c.getParent();
				rule = productionNames.get(c);
				if (st.parent != null) {
					st = st.parent;
				}
				if (st.lookup(ctx.ID().getText()) != null) {
					break;
				}
			}

		}
		symbol = st.lookup(id);

		types.put(ctx, types.get(ctx.type()));

		Integer size = -1;
		if (ctx.array_position() != null) {
			size = sizes.get(ctx.array_position());
		}
		sizes.put(ctx, size);

		//verifica se o simbolo(ID) ja ta na tabela de simbolos se tiver printa erro semantico e retorna

		if (symbol != null) {
			switch (symbol.type) {
				case VARIABLE:
					System.out.print("Erro na linha " + ctx.getStart().getLine() + ": ");
					System.err.println("Variável já declarada");
					break;
				case FUNCTION:
					System.out.print("Erro na linha " + ctx.getStart().getLine() + ": ");
					System.err.println("Função já declarada");
					break;
				case OBJECT:
					System.out.print("Erro na linha " + ctx.getStart().getLine() + ": ");
					System.err.println("Objeto já declarado");
					break;
				}
				return;
		} else {
			String type = ctx.type().getText();

			if (productionNames.get(ctx) != null) {
				 rule = productionNames.get(ctx);
				boolean initialized = true;

				if (rule.equals("CmdDecl")) {
					initialized = false;
				}
				if (!rule.equals("function_block")) {
					symbol = new VariableSymbol(type, initialized, size);
				}

				symbolTable.put(id, symbol);
			}
		}
	}

 	public void enterCmdDeclAttrib(AMZ_syntParser.CmdDeclAttribContext ctx) {
 		productionNames.put(ctx.declaration(), "CmdDeclAttrib");
 	}

 	public void enterCmdDecl(AMZ_syntParser.CmdDeclContext ctx) {
 		productionNames.put(ctx.declaration(), "CmdDecl");
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
					System.out.print("Erro na linha " + ctx.getStart().getLine() + ": ");
					System.out.println("Array com valores de diferentes tipos");
				}
			}

		}

	}

	// declaration ASSIGN expression #CmdDeclAttrib
	public void exitCmdDeclAttrib(AMZ_syntParser.CmdDeclAttribContext ctx) {
		Type type0 = types.get(ctx.declaration());
		Type type1 = types.get(ctx.expression());
		Integer size0 = sizes.get(ctx.declaration());
		Integer size1 = sizes.get(ctx.expression());


		if (size0 != null && size1 != null && !size0.equals(size1)) {
			System.out.print("Erro na linha " + ctx.getStart().getLine() + ": ");
			String strSize0 = size0 == -1 ? "Não array" : "Array de tamanho " + size0;
			String strSize1 = size1 == -1 ? "Não array" : "Array de tamanho " + size1;
			System.out.println("Atribuição com tamanho incompatível. Recebido: "
				+ strSize1 + ". Esperava-se: " + strSize0 + '.');
		}
		if (type0 != type1) {
			System.out.print("Erro na linha " + ctx.getStart().getLine() + ": ");
			System.out.println("Atribuição com tipo incompatível. Recebido: "
				+ type1 + ". Esperava-se: " + type0 + '.');
		}
	}

	// ID array_position? object_id? ASSIGN expression
	public void exitCmdAttrib(AMZ_syntParser.CmdAttribContext ctx) {
		String result = ctx.ID().getText();
		Symbol symbol = symbolTable.lookup(result);
		int line = ctx.getStart().getLine();

		// Checa se a variável foi declarada
		if (symbol == null) {

			if (symbolTable.parent != null) {
				SymbolTable st = symbolTable;
				ParserRuleContext c = ctx;
				String rule = productionNames.get(c);
				while(rule == "if_block" || rule == "block_command" || rule == "while_block" || rule == null) {
					c = c.getParent();
					rule = productionNames.get(c);
					if (st.parent != null) {
						st = st.parent;
					}

					if (st.lookup(ctx.ID().getText()) != null) {
						break;
					}
				}

				symbol = st.lookup(result);
				if (symbol == null) {
					System.out.print("Erro na linha " + line + ": ");
					System.out.println("Variável " + result + " não declarada.");
					return;
				}
			} else {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Variável " + result + " não declarada.");
				return;
			}
		}
		// Verifica tipos
		Type type0 = Type.getEnumByString(symbol.valueType.toString());
		Type type1 = types.get(ctx.expression());
		Integer size0 = symbol.size;
		Integer size1 = sizes.get(ctx.expression());

		if (ctx.array_position() == null) {
			if (size0 != null && size1 != null && !size0.equals(size1)) {
				System.out.print("Erro na linha " + ctx.getStart().getLine() + ": ");
				String strSize0 = size0 == -1 ? "Não array" : "Array de tamanho " + size0;
				String strSize1 = size1 == -1 ? "Não array" : "Array de tamanho " + size1;
				System.out.println("Atribuição com tamanho incompatível. Recebido: "
					+ strSize1 + ". Esperava-se: " + strSize0 + '.');
			}
		} else { // acesso a indice de array
			Integer index = Integer.parseInt(ctx.array_position().INTEGER().getText());
			if (index >= size0) {
				System.out.print("Erro na linha " + ctx.getStart().getLine() + ": ");
				System.out.println("Acesso a indice não permitido. Recebido: "
					+ index + ". Tamanho do array: " + size0);
			}
		}

		if (type0 != type1) {
			System.out.print("Erro na linha " + ctx.getStart().getLine() + ": ");
			System.out.println("Atribuição com tipo incompatível. Recebido: "
				+ type1 + ". Esperava-se: " + type0 + '.');
		}
		// Inicializa variável
		symbolTable.put(ctx.ID().getText(), new VariableSymbol(symbol.valueType.toString(), true, size0));

	}

	public void enterBlock_command(AMZ_syntParser.Block_commandContext ctx) {
		symbolTable = new SymbolTable(symbolTable);
		productionNames.put(ctx, "block_command");

	}

	public void exitBlock_command(AMZ_syntParser.Block_commandContext ctx) {
		symbolTable = symbolTable.parent;
	}


	private boolean requireNotArray(Integer size, Integer line) {
		if (size == null || size.intValue() != -1) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Array recebido. Não se esperava um array.");
			return false;
		}
		return true;
	}

	private boolean requireNumber(Type t, int line) {
		if (t != Type.DOUBLE && t != Type.INT) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Tipo inválido. Recebido: " + t + ". Esperava-se double ou int.");
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

	}

	// expression  arithmetic_binary_op_higher_prec    expression
	public void exitExpBinArithmH(AMZ_syntParser.ExpBinArithmHContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();
		types.put(ctx, checkNumberBinType(type0, type1, line));

		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (requireNotArray(size0, line) && requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
	}

	public void exitExpBinArithmL(AMZ_syntParser.ExpBinArithmLContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();
		types.put(ctx, checkNumberBinType(type0, type1, line));

		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (requireNotArray(size0, line) && requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
	}

	// expression  comparison_op_higher_prec          expression
	public void exitExpBinCompH(AMZ_syntParser.ExpBinCompHContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();
		// System.out.println(ctx.getText());
		if (checkNumberBinType(type0, type1, line) != null) {
			types.put(ctx, Type.BOOLEAN);
		}
		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (requireNotArray(size0, line) && requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
	}

	// expression  comparison_op_lower_prec          expression
	public void exitExpBinCompL(AMZ_syntParser.ExpBinCompLContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();
		//TODO: checar tamanho de array
		if (type0 == Type.BOOLEAN) {
			if (type1 != Type.BOOLEAN) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Tipos incompatíveis");
				return;
			}
		} else if (type0 == Type.INT) {
			if (type1 != Type.INT) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Tipos incompatíveis");
				return;
			}
		} else if (type0 == Type.DOUBLE) {
			if (type1 != Type.DOUBLE) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Tipos incompatíveis");
				return;
			}
		} else if (type0 == Type.STRING) {
			if (type1 != Type.STRING) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Tipos incompatíveis");
				return;
			}
		} else {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Tipo não permitido");
			return;
		}
		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		// TODO: precisa?
		if (requireNotArray(size0, line) && requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
		types.put(ctx, Type.BOOLEAN);
	}

	public void exitExpBinLogicH(AMZ_syntParser.ExpBinLogicHContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();

		if (type0 != Type.BOOLEAN) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Tipo inválido. Esperava-se boolean. Recebido: " + type0 + ".");
			return;
		}
		if (type1 != Type.BOOLEAN) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Tipo inválido. Esperava-se boolean. Recebido: " + type1 + ".");
			return;
		}
		types.put(ctx, Type.BOOLEAN);

		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (requireNotArray(size0, line) && requireNotArray(size1, line)) {
			sizes.put(ctx, -1);
		}
	}

	public void exitExpBinLogicL(AMZ_syntParser.ExpBinLogicLContext ctx) {
		Type type0 = types.get(ctx.expression(0));
		Type type1 = types.get(ctx.expression(1));
		int line = ctx.getStart().getLine();

		if (type0 != Type.BOOLEAN) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Tipo inválido. Esperava-se boolean. Recebido: " + type0 + ".");
			return;
		}
		if (type1 != Type.BOOLEAN) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Tipo inválido. Esperava-se boolean. Recebido: " + type1 + ".");
			return;
		}
		types.put(ctx, Type.BOOLEAN);

		Integer size0 = sizes.get(ctx.expression(0));
		Integer size1 = sizes.get(ctx.expression(1));
		if (requireNotArray(size0, line) && requireNotArray(size1, line)) {
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
		int line = ctx.getStart().getLine();
		if (type != Type.BOOLEAN) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Recebido: " + ctx.expression().getText() + ". Tipo esperado: boolean.");
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

	// function_call : ID (LPAREN arguments RPAREN) ;
	public void exitFunction_call(AMZ_syntParser.Function_callContext ctx) {
		String id = ctx.ID().getText();
		int line = ctx.getStart().getLine();

		SymbolTable st = symbolTable;
		ParserRuleContext c = ctx;
		String rule = productionNames.get(c);
		while(rule == "block_command" || rule == "CmdDeclAttrib" || rule == null) {
			c = c.getParent();
			rule = productionNames.get(c);
			if (st.parent != null) {
				st = st.parent;
			}
			if (st.lookup(ctx.ID().getText()) != null) {
				break;
			}
		}

		if (st.lookup(id) == null) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Função não definida.");
			return;
		}

		ArrayList<String> paramTypes = ((FunctionSymbol) st.lookup(id)).paramType;
		ArrayList<Integer> paramSizes = ((FunctionSymbol) st.lookup(id)).paramSize;
		int callArgSize = ctx.arguments().expression().size();
		// Checa numero de argumentos
		if (callArgSize != paramTypes.size()) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Número de argumentos incompatível");
			return;
		}
		boolean error = false;
		// Checa ordem dos tipos e tamanhos
		for (int i = 0; i < callArgSize; i++) {
			String callType = ctx.arguments().expression(i).getText();
			String funcType = paramTypes.get(i);

			if (isInteger(callType)) {
				if (!funcType.equals("int")) {
					error = true;
				}
			} else if (isDouble(callType)) {
				if (!funcType.equals("double")) {
					error = true;
				}
			} else if (callType.equals("true") || callType.equals("false")) {
				if (!funcType.equals("boolean")) {
					error = true;
				}
			} else if (callType.charAt(0) == '\"') {
				if (!funcType.equals("string")) {
					error = true;
				}
			} else { // id
				if(st.lookup(callType) != null ) {
					String symbType = st.lookup(callType).valueType.toString();
					if(!symbType.equals(funcType)) {
						System.out.print("Erro na linha " + line + ": ");
						System.out.println("Tipo de argumento incompatível. Esperava-se: " + funcType
							+ ". Recebido: " + symbType);
						return;
					}
				}
			}
			if (error) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Tipo de argumento incompatível. Esperava-se: " + funcType);
				return;
			}
		}
	}

	private static boolean isInteger(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}

	private static boolean isDouble(String str) {
	    try {
	        Double.parseDouble(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}



	// expression : (value | ID | function_call) array_position? object_id? #ExpExit
	public void exitExpExit(AMZ_syntParser.ExpExitContext ctx) {
		int line = ctx.getStart().getLine();
		int size = -1;
		//TODO object_id
		if (ctx.value() != null) {

			if (ctx.array_position() != null) {
				if (ctx.value().array_literal() == null) {
					System.out.print("Erro na linha " + line + ": ");
					System.out.println("Array não permitido.");
					return;
				}
			}
			types.put(ctx, types.get(ctx.value()));
			size = sizes.get(ctx.value());


		} else if (ctx.ID() != null) {

			Symbol symbol = symbolTable.lookup(ctx.ID().getText());
			if (symbol == null) {
				SymbolTable st = symbolTable;
				ParserRuleContext c = ctx;
				String rule = productionNames.get(c);
				while(rule == "if_block" || rule == "block_command"
					|| rule == "while_block"
					|| rule == null) {
					c = c.getParent();
					rule = productionNames.get(c);
					st = st.parent;
					if (st.lookup(ctx.ID().getText()) != null) {
						break;
					}
				}

				symbol = st.lookup(ctx.ID().getText());
				if (symbol == null) {
					System.out.print("Erro na linha " + line + ": ");
					System.out.println("Variável " + ctx.ID() + " não declarada.");
					return;
				}
			}

			Type type = Type.getEnumByString(symbol.valueType.toString());
			types.put(ctx, type);
			size = symbol.size;


			if (!((VariableSymbol)symbol).initialized) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Variável " + ctx.ID() + " não inicializada.");
				return;
			}
			// if (symbol.type != ctx)
			// System.out.println(ctx.ID());


		} else if (ctx.function_call() != null) {

			Symbol symbol = symbolTable.parent.lookup(ctx.function_call().ID().getText());
			if (symbol != null) {
				Type type = Type.getEnumByString(symbol.valueType.toString());
				types.put(ctx, type);
				size = symbol.size;
			}
		}

		if (ctx.array_position() != null) {
			if (size == -1) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Tentativa de acesso em posição de um não array.");
				return;
			}
			int position = sizes.get(ctx.array_position());
			if (position >= size) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Tentativa de acesso em posição fora do array.");
				return;
			}
			size = -1;
		}
		sizes.put(ctx, size);

	}

	public void exitObject_element(AMZ_syntParser.Object_elementContext ctx) {
		Type type0 = types.get(ctx.declaration());
		Type type1 = types.get(ctx.expression());
		int line = ctx.getStart().getLine();

		if (type0 != type1) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Tipo inválido. Esperava-se " + type0 + ". Recebido: " + type1 + ".");
		}

		Integer size0 = sizes.get(ctx.declaration());
		Integer size1 = sizes.get(ctx.expression());


		if (size0 != null && size1 != null && !size0.equals(size1)) {
			System.out.print("Erro na linha " + line + ": ");
			String strSize0 = size0 == -1 ? "Não array" : "Array de tamanho " + size0;
			String strSize1 = size1 == -1 ? "Não array" : "Array de tamanho " + size1;
			System.out.println("Atribuição com tamanho incompatível. Recebido: "
				+ strSize1 + ". Esperava-se: " + strSize0 + '.');
		}
	}

	public void enterObject_literal(AMZ_syntParser.Object_literalContext ctx) {
		symbolTable = new SymbolTable(symbolTable);
	}

	public void exitObject_literal(AMZ_syntParser.Object_literalContext ctx) {
		SymbolTable object = symbolTable;
		symbolTable = symbolTable.parent;


	}
        // int n_params = ctx.param().size();
        // int return_size = Integer.parseInt(ctx.size().NUMBER().getText());
        // FunSymbol fun_symbol = new FunSymbol(n_params, return_size);
        // table.add(id, fun_symbol);

	// function_block : declaration LPAREN parameters RPAREN command_block ;
    public void exitFunction_block(AMZ_syntParser.Function_blockContext ctx) {

    	symbolTable = symbolTable.parent;
    	String type = ctx.declaration().type().getText();
    	String id = ctx.declaration().ID().getText();
    	Integer size = sizes.get(ctx.declaration());
    	Integer nParam = ctx.parameters().declaration().size();
    	ArrayList<String> paramTypes = new ArrayList<>();
    	ArrayList<Integer> paramSizes = new ArrayList<>();


    	for (int i = 0; i < nParam; i++) {
    		String pType = (types.get(ctx.parameters().declaration(i).type())).toString();
    		Integer pSize = sizes.get(ctx.parameters().declaration(i));
       		paramTypes.add(pType);
       		paramSizes.add(pSize);
       	}

    	Symbol symbol = new FunctionSymbol(type, paramTypes, paramSizes, size);
    	symbolTable.put(id, symbol);


    }

    // parameters : (declaration (COMMA declaration)*)? ;

    public void enterParameters(AMZ_syntParser.ParametersContext ctx) {
		int size = ctx.declaration().size();
		for(int i = 0; i < size; i++) {
			productionNames.put(ctx.declaration(i), "parameters");
		}
	}

	public void exitParameters(AMZ_syntParser.ParametersContext ctx) {
		int size = ctx.declaration().size();
		for(int i = 0; i < size; i++) {
			types.put(ctx.declaration(i), types.get(ctx.declaration(i).type()));
			Integer aSize = -1;
			if (ctx.declaration(i).array_position() != null) {
				aSize = sizes.get(ctx.declaration(i).array_position());
			}
			sizes.put(ctx, aSize);
		}

    	// System.out.println(param.size());
	}


	public void exitWhile_block(AMZ_syntParser.While_blockContext ctx) {
		Type type = types.get(ctx.expression());
		int line = ctx.getStart().getLine();
		if (type != Type.BOOLEAN) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Tipo incompatível. Recebido: " + type + ". Esperava-se: boolean.");
		}
		Integer size = sizes.get(ctx.expression());
		requireNotArray(size, line);

	}

	public void exitFor_block(AMZ_syntParser.For_blockContext ctx) {
		if (ctx.expression() != null) {
			Type type = types.get(ctx.expression());
			int line = ctx.getStart().getLine();
			if (type != Type.BOOLEAN) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Tipo incompatível. Recebido: " + type + ". Esperava-se: boolean.");
			}
			Integer size = sizes.get(ctx.expression());
			requireNotArray(size, line);
		}
	}

	public void exitIf_block(AMZ_syntParser.If_blockContext ctx) {
		int length = ctx.expression().size();
		for (int i = 0; i < length; i++) {
			Type type = types.get(ctx.expression(i));
			int line = ctx.expression(i).getStart().getLine();
			if (type != Type.BOOLEAN) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Tipo incompatível. Recebido: " + type + ". Esperava-se: boolean.");
			}
			Integer size = sizes.get(ctx.expression(i));
			// TODO: precisa disso?
			requireNotArray(size, line);
		}

	}

	public void exitCase_block(AMZ_syntParser.Case_blockContext ctx) {
		int line = ctx.getStart().getLine();
		types.put(ctx, types.get(ctx.expression()));
		Integer size = sizes.get(ctx.expression());
		requireNotArray(size, line);
	}

	public void exitSwitch_block(AMZ_syntParser.Switch_blockContext ctx) {
		Type type = types.get(ctx.expression());
		int line = ctx.getStart().getLine();
		if ( type != Type.BOOLEAN
			&& type != Type.INT
			&& type != Type.DOUBLE
			&& type != Type.STRING) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Tipo " + type + " não permitido no switch.");
				return;
		}
		Integer size = sizes.get(ctx.expression());
		requireNotArray(size, line);

		int length = ctx.case_block().size();
		for (int i = 0; i < length; i++) {
			Type caseType = types.get(ctx.case_block(i));
			line = ctx.case_block(i).getStart().getLine();
			if (caseType != type) {
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Expressão com tipo incompatível. Recebido: "
					+ caseType + ". Esperava-se: " + type + '.');
			}
			size = sizes.get(ctx.expression());
			requireNotArray(size, line);
		}

	}


	public void exitCmdReturn(AMZ_syntParser.CmdReturnContext ctx) {
		ParserRuleContext c = ctx;
		int line = ctx.getStart().getLine();

		while(c != null && productionNames.get(c) != "function_block") {
			c = c.getParent();
		}
		if (c == null) {
			return;
		}
		Type returnType = Type.VOID;
		if (ctx.expression() != null) {
			returnType = types.get(ctx.expression());
			//getarray
		}
		AMZ_syntParser.Function_blockContext funcCtx = (AMZ_syntParser.Function_blockContext) c;

		Type functionType = types.get(funcCtx.declaration());

		if (returnType != functionType) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Tipo de retorno incompatível. Recebido: " + returnType
				+ ". Esperava-se: "  + functionType);
		}

	}

	public void exitFunc_command_block(AMZ_syntParser.Func_command_blockContext ctx) {
		int size = ctx.command().size() - 1;
		int line = ctx.getStart().getLine();

		AMZ_syntParser.Function_blockContext funcCtx = (AMZ_syntParser.Function_blockContext) ctx.getParent();
		Type function_type = types.get(funcCtx.declaration());

		if(function_type != Type.VOID) {
			ParserRuleContext ret = (ParserRuleContext)ctx.command(size).getChild(0); // return expression;
			if (!ret.getChild(0).getText().equals("return")) { // Verifica se tem retorno
				System.out.print("Erro na linha " + line + ": ");
				System.out.println("Erro: função deve terminar com comando de retorno. ");
				return;
			}
		}
	}

	public void enterWhile_block(AMZ_syntParser.While_blockContext ctx) {
		productionNames.put(ctx, "while_block");
	}

	public void enterFor_block(AMZ_syntParser.For_blockContext ctx) {
		productionNames.put(ctx, "for_block");
	}

	public void enterIf_block(AMZ_syntParser.If_blockContext ctx) {
		productionNames.put(ctx, "if_block");
	}

	public void enterSwitch_block(AMZ_syntParser.Switch_blockContext ctx) {
		productionNames.put(ctx, "switch_block");
	}

	public void exitCmdBreak(AMZ_syntParser.CmdBreakContext ctx) {
		ParserRuleContext c = ctx;
		AMZ_syntParser.Block_commandContext blockCtx;
		int line = ctx.getStart().getLine();

		while(c != null && (productionNames.get(c) != "block_command"
		 || productionNames.get(c) == "if_block"
		 || productionNames.get(c) == "switch_block")) {
			c = c.getParent();
			if (productionNames.get(c) == "block_command") {
				 blockCtx = (AMZ_syntParser.Block_commandContext) c;
				 if (blockCtx.if_block() != null || blockCtx.switch_block() != null) {
				 	c = c.getParent();
				 }
			}

		}

		if (c == null) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Break fora de while ou loop");
			return;
		}
		blockCtx = (AMZ_syntParser.Block_commandContext) c;

		if (blockCtx.for_block() == null && blockCtx.while_block() == null) {
			System.out.print("Erro na linha " + line + ": ");
			System.out.println("Break fora de while/for loop");
			return;
		}
	}

}
