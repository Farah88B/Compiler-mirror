package AST.Css.Selectors;

public class PseudoClassNode extends SelectorNode {
    public PseudoClassNode(String name, int line) {
        super("PseudoClass :" + name, line);
    }
}
