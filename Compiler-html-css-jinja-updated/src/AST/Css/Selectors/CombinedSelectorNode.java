package AST.Css.Selectors;

import AST.Core.ASTNode;

public class CombinedSelectorNode extends SelectorNode {

    public CombinedSelectorNode(int line) {
        super("CombinedSelector", line);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "CombinedSelector (");
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
        System.out.println(indent + ")");
    }
}
