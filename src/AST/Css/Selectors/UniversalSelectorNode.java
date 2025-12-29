package AST.Css.Selectors;

public class UniversalSelectorNode extends SelectorNode {
    public UniversalSelectorNode(int line) {
        super("UniversalSelector *", line);
    }
}
