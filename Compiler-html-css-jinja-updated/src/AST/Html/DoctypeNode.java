package AST.Html;
import AST.Core.ASTNode;

public class DoctypeNode extends ASTNode {

    public DoctypeNode(String value, int line) {
        super("Doctype " + value, line);
    }
}