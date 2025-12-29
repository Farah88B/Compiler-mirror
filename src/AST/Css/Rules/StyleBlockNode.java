package AST.Css.Rules;
import AST.Core.ASTNode;

public class StyleBlockNode extends ASTNode {

    public StyleBlockNode(int line) {
        super("StyleBlock", line);
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "└── StyleBlock - open <style>");


        for (ASTNode child : children) {
            child.print(indent + "  ");
        }


        System.out.println(indent + "└── StyleBlock - close </style>");
    }
}

