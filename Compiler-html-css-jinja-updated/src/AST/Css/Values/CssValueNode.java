package AST.Css.Values;
import AST.Core.ASTNode;

public abstract class CssValueNode extends ASTNode {
    public CssValueNode(String nodeName, int line) {
        super(nodeName, line);
    }
}

