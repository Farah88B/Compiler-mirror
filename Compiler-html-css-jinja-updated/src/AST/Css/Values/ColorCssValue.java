package AST.Css.Values;

public class ColorCssValue extends CssValueNode {
    public ColorCssValue(String hex, int line) {
        super("Color: " + hex, line);
    }
}
