package symbol_table;

import java.util.HashMap;

public class Scope {
    HashMap<String, Symbol> symbols = new HashMap<>();
    private Scope parent;
    private String scopeType;
    private int level;

    public Scope(Scope parent, String scopeType, int level) {
        this.parent = parent;
        this.scopeType = scopeType;
        this.level = level;
    }
    public void insert(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol lookup(String name) {
        Scope currentScope = this;
        while (currentScope != null) {
            Symbol symbol = currentScope.symbols.get(name);
            if (symbol != null) {
                return symbol;
            }
            currentScope = currentScope.parent;
        }
        return null;
    }

    public Scope getParent() {
        return parent;
    }

    public String getScopeType() {
        return scopeType;
    }

    public int getLevel() {
        return level;
    }
}
