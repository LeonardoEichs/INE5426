package symbol;

public class VariableSymbol extends Symbol {

	public String variableType;
	public int length; // for arrays
	public boolean initialized; // check variable initialization

	public VariableSymbol(String variableType, int length, boolean initialized) {
		super(Symbol.SymbolType.VARIABLE);
		if (variableType.equals("void")) {
			System.out.println("Void não pode ser tipo de variável");
			return;
		}
		this.variableType = variableType;
		this.length = length;
		this.initialized = initialized;
		setVariableType();
	}

	private void setVariableType() {
		switch(variableType) {
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
