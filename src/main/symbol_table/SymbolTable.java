package main.symbol_table;

import main.symbol_table.Symbol;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    private Scope currentScope;
    private Scope globalScope;
    private List<Symbol> symbols;

    public SymbolTable() {
        globalScope = new Scope(null, "GLOBAL", 0);
        currentScope = globalScope;
        symbols = new ArrayList<>();
    }
    public void insert(String name, String type, String kind, String scope, int line) {
        if (currentScope.symbols.containsKey(name)) {
            System.err.println("ERROR at line " + line + ": Variable '" + name + "' is already declared in scope " + currentScope.getScopeType());
            return;
        }

        Symbol symbol = new Symbol(name, type, kind, scope, line);
        currentScope.insert(symbol);
        symbols.add(symbol);
        System.out.println("Inserted symbol: " + symbol.getName() + " of type " + symbol.getType());
    }

    public Symbol lookup(String name) {
        return currentScope.lookup(name);
    }

    public void enterScope(String scopeType) {
        Scope newScope = new Scope(currentScope, scopeType, currentScope.getLevel() + 1);
        currentScope = newScope;
    }

    public void exitScope() {
        currentScope = currentScope.getParent();
    }

    public void printSymbolTable() {
        if (symbols.isEmpty()) {
            System.out.println("No symbols in the table.");
            return;
        }

        System.out.printf("%-20s %-15s %-10s %-10s %-5s\n", "Name", "Kind", "Type", "Scope", "Line");
        System.out.println("-----------------------------------------------------------");

        for (Symbol symbol : symbols) {
            symbol.printSymbol();
        }
    }

    public Scope getCurrentScope() {
        return currentScope;
    }
}
