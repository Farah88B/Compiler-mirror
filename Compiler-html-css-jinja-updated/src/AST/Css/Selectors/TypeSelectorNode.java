package AST.Css.Selectors;

public class TypeSelectorNode extends SelectorNode {
    public TypeSelectorNode(String tag, int line) {
        super("Type: " + tag, line);
    }
}
