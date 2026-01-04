package main.symbol_table;

public class Symbol {
    private String name;
    private String type;
    private String kind;
    private String scope;
    private int line;

    public Symbol(String name, String type, String kind, String scope, int line) {
        this.name = name;
        this.type = type;
        this.kind = kind;
        this.scope = scope;
        this.line = line;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLine() {
        return line;
    }

    public void printSymbol() {
        System.out.printf("%-20s %-15s %-10s %-10s %-5d\n", name, kind, type, scope, line);
    }
}
