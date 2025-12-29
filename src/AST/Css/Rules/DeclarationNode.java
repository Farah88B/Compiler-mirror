package AST.Css.Rules;
import AST.Core.ASTNode;

public class DeclarationNode extends ASTNode {

    public DeclarationNode(String property, String value, int line) {
        super("Declaration " + property + ": " + value, line);
    }
}


