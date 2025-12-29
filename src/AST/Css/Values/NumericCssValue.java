package AST.Css.Values;

public class NumericCssValue extends CssValueNode {
    public NumericCssValue(String value, String unit, int line) {
        super("Numeric: " + value + (unit != null ? unit : ""), line);
    }
}

