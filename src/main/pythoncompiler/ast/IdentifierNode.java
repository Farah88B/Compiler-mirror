package main.pythoncompiler.ast;


public class IdentifierNode extends ASTNode {
    public String name;

    public IdentifierNode(String name) {
        super("Identifier");
        this.name = name;
    }

    @Override
    protected String getDetails() {
        return " (" + name + ")";
    }
}
