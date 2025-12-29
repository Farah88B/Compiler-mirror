package AST.Jinja;

public class JinjaBlockNode extends JinjaNode {

    private String name;

    public JinjaBlockNode(String name, int line) {
        super("JinjaBlock " + name, line);
        this.name = name;
    }
}

