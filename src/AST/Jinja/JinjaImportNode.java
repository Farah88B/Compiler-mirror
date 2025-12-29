package AST.Jinja;

public class JinjaImportNode extends JinjaNode {

    public JinjaImportNode(String expr, int line) {
        super("JinjaImport " + expr, line);
    }
}
