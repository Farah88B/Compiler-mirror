package AST.Css.Values;

public class FunctionCallCssValue extends CssValueNode {
    public FunctionCallCssValue(String name, int line) {
        super("FunctionCallCssValue: " + name + "()", line);
    }
}
