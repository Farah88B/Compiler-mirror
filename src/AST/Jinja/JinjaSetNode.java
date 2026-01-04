package AST.Jinja;
public class JinjaSetNode extends JinjaNode {

    public JinjaSetNode(String expr, int line) {
        super("JinjaSet " + expr, line);
    }
}
