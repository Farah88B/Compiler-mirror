package AST.Css.Selectors;

public class PseudoElementNode extends SelectorNode {
    public PseudoElementNode(String name, int line) {
        super("PseudoElementSelector ::" + name, line);
    }
}

