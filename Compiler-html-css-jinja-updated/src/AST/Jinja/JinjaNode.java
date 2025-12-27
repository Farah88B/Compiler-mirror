package AST.Jinja;
import AST.Core.ASTNode;

public abstract class JinjaNode extends ASTNode {

    public JinjaNode(String name, int line) {
        super(name, line);
    }
}
