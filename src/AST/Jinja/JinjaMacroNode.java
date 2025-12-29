package AST.Jinja;
public class JinjaMacroNode extends JinjaNode {

    public JinjaMacroNode(String name, int line) {
        super("JinjaMacro " + name, line);
    }
}
