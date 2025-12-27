package AST.Jinja;
public class JinjaElifNode extends JinjaNode {

    public JinjaElifNode(String condition, int line) {
        super("JinjaElif (" + condition + ")", line);
    }
}
