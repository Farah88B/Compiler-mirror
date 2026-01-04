package AST.Css.Values;

public class FunctionCallCssValue extends CssValueNode {
    public FunctionCallCssValue(String fullExpression, int line) {
        super("FunctionCallCssValue: " + fullExpression , line);
    }
}
