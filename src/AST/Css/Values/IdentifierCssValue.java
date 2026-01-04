package AST.Css.Values;

public class IdentifierCssValue extends CssValueNode {
    public IdentifierCssValue(String ident, int line) {
        super("IdentifierCssValue: " + ident, line);
    }
}
