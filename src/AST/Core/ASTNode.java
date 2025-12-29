package AST.Core;


import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {

    protected String nodeName;
    protected int line;
    protected List<ASTNode> children;

    public ASTNode(String nodeName, int line) {
        this.nodeName = nodeName;
        this.line = line;
        this.children = new ArrayList<>();
    }

    public void addChild(ASTNode child) {
        if (child != null)
            children.add(child);
    }

    public void print(String indent) {
        System.out.println(indent+ nodeName + " (line number " + line + ")");
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}

