package main.pythoncompiler.ast;

public class LiteralNode extends ASTNode {
    public String value;
    public String type; // INT, STRING, BOOL

    public LiteralNode(String value, String type) {
        super("Literal");
        this.value = value;
        this.type = type;
    }

    @Override
    protected String getDetails() {
        return " (" + type + ": " + value + ")";
    }
}
