package main.pythoncompiler.ast;

public class ForNode extends ASTNode {
    public String iteratorName;

    public ForNode() {
        super("ForLoop");
    }

    @Override
    protected String getDetails() {
        return " (iterator: " + iteratorName + ")";
    }
}
