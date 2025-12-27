package AST.Css.Values;

public class IdentifierCssValue extends CssValueNode {
    public IdentifierCssValue(String ident, int line) {
        super("Identifier: " + ident, line);
    }
}
