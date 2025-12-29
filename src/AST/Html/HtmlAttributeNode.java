package AST.Html;

import AST.Core.ASTNode;

public class HtmlAttributeNode extends ASTNode {

    public HtmlAttributeNode(String name, String value, int line) {
        super("Attribute " + name + "=" + value, line);
    }
}
