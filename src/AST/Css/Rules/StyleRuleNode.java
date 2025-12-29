package AST.Css.Rules;
import AST.Core.ASTNode;

public class StyleRuleNode extends ASTNode {

    public StyleRuleNode(String selector, int line) {
        super("StyleRule " + selector, line);
    }
}

