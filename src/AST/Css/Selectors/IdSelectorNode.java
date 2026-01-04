package AST.Css.Selectors;

public class IdSelectorNode extends SelectorNode {
    public IdSelectorNode(String id, int line) {
        super("IDSelector: #" + id, line);
    }
}

