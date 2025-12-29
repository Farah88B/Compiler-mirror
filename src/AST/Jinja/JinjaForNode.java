package AST.Jinja;

public class JinjaForNode extends JinjaNode {

    public JinjaForNode(String expr, int line) {
        super("JinjaFor (" + expr + ")", line);
    }
}
