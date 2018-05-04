public class VariableSymbol extends Symbol {

	public int length; // for arrays
	public boolean initialized; // check variable initialization

	public VariableSymbol(int length, boolean initialized) {
		super(Symbol.SymbolType.VARIABLE);
		this.length = length;
		this.initialized = initialized;
	}


}