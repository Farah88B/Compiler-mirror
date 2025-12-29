package AST.Css.Values;

public class NumericCssValue extends CssValueNode {
    public NumericCssValue(String value, String unit, int line) {
        super("NumericCssValue: " + value + (unit != null ? unit : ""), line);
    }
}

