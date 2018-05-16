package symbol;

public class Symbol {

	public enum SymbolType {
		VARIABLE,
		FUNCTION,
		OBJECT
	}

    public SymbolType type; // Variable, function, object

    public Symbol(SymbolType type) {
        this.type = type;
    }

}
