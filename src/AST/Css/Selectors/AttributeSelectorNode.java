package AST.Css.Selectors;

public class AttributeSelectorNode extends SelectorNode {

    public AttributeSelectorNode(String selectorText, int line) {
        super("AttributeSelector " + selectorText, line);
    }
}
