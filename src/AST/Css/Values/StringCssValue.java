package AST.Css.Values;

public class StringCssValue extends CssValueNode {
    public StringCssValue(String value, int line) {
        super("StringCssValue: " + value, line);
    }
}
