package AST.Html;

import AST.Core.ASTNode;

public class TextNode extends ASTNode {

    public TextNode(String text, int line) {
        super("Text \"" + text.trim() + "\"", line);
    }
}
