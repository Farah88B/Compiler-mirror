package AST.Css.Values;

public class FunctionCallCssValue extends CssValueNode {
    public FunctionCallCssValue(String name, int line) {
        super("Function: " + name + "()", line);
    }
}
