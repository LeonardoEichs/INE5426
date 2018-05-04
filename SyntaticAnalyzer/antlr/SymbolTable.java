import java.util.HashMap;

public class SymbolTable {

    private HashMap<String, Symbol> symbols = new HashMap<>(); // Maps an id to a symbol type 
    public SymbolTable parent; // References parent table

    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
    }

    public void add(String id, Symbol symbol) {
        symbols.put(id, symbol);
    }

    public Symbol lookup(String id) {
        return symbols.get(id);
    }

}