package AST.Jinja;

public class JinjaExpressionNode extends JinjaNode {

    public JinjaExpressionNode(String expr, int line) {
        super("JinjaExpression {{ " + expr + " }}", line);
    }
}

