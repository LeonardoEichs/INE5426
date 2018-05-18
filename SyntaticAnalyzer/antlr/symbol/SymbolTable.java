package symbol;

import java.util.HashMap;

public class SymbolTable extends Symbol {

    private HashMap<String, Symbol> symbols = new HashMap<>(); // Maps an id to a symbol type
    public SymbolTable parent; // References parent table

    public SymbolTable(SymbolTable parent) {
        super(Symbol.SymbolType.OBJECT);
        this.parent = parent;
    }

    public void put(String id, Symbol symbol) {
        symbols.put(id, symbol);
    }

    public Symbol lookup(String id) {
        return symbols.get(id);
    }

    public void printTable() {
        for(String id : symbols.keySet()) {
            System.out.println(id + " " +  symbols.get(id));
        }
    }

}
