package AST.Css.Selectors;

public class ClassSelectorNode extends SelectorNode {
    public ClassSelectorNode(String className, int line) {
        super("Class: ." + className, line);
    }
}

