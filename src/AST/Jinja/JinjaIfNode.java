package AST.Jinja;
public class JinjaIfNode extends JinjaNode {

    public JinjaIfNode(String condition, int line) {
        super("JinjaIf (" + condition + ")", line);
    }
}
