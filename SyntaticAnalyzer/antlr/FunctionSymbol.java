public class FunctionSymbol extends Symbol {
	public int parameters;
	public int returnLength;

	public FunctionSymbol(int parameters, int returnLength) {
		super(Symbol.SymbolType.FUNCTION);
		this.parameters = parameters;
		this.returnLength = returnLength;
	}

}