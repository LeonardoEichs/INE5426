package symbol;

import java.util.ArrayList;

public class FunctionSymbol extends Symbol {

 	public ArrayList<String> paramType = new ArrayList<>(); // Parameters types
 	public ArrayList<Integer> paramSize = new ArrayList<>(); // Parameters sizes
	// Lista com tipos dos parametros e tamanho de cada parametro
	// Precisa do tipo e tamanho do retorno
	public String functionType;
	public Integer returnLength;

	public FunctionSymbol(String functionType, ArrayList<String> paramType, ArrayList<Integer> paramSize, Integer returnLength) {
		super(Symbol.SymbolType.FUNCTION);
		this.functionType = functionType;
		this.paramType = paramType;
		this.paramSize = paramSize;
		this.returnLength = returnLength;
		setFunctionType();
	}

	private void setFunctionType() {
		switch(functionType) {
			case "void":
				super.valueType = Symbol.SymbolValueType.VOID;
				break;
			case "int":
				super.valueType = Symbol.SymbolValueType.INT;
				break;
			case "double":
				super.valueType = Symbol.SymbolValueType.DOUBLE;
				break;
			case "string":
				super.valueType = Symbol.SymbolValueType.STRING;
				break;
			case "object":
				super.valueType = Symbol.SymbolValueType.OBJECT;
				break;
			case "boolean":
				super.valueType = Symbol.SymbolValueType.BOOLEAN;
				break;
		}
	}

}
