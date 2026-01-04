//package AST.Css.Rules;
//import AST.Core.ASTNode;
//
//public class StyleBlockNode extends ASTNode {
//
//    public StyleBlockNode(int line) {
//        super("StyleBlock", line);
//    }
//
//    @Override
//    public void print(String indent) {
//
//        System.out.println(indent + "└── StyleBlock - open <style>");
//
//
//        for (ASTNode child : children) {
//            child.print(indent + "  ");
//        }
//
//
//        System.out.println(indent + "└── StyleBlock - close </style>");
//    }
//}
//
package AST.Css.Rules;

import AST.Core.ASTNode;

public class StyleBlockNode extends ASTNode {

    private int closingLine;

    public StyleBlockNode(int openingLine) {
        super("StyleBlock", openingLine);
        this.closingLine = openingLine;
    }

    public void setClosingLine(int closingLine) {
        this.closingLine = closingLine;
    }

    @Override
    public void print(String indent) {

        System.out.println(
                indent + "└──StyleBlock - Opening <style> (line number " + line + ")"
        );

        for (ASTNode child : children) {
            child.print(indent + "  ");
        }

        System.out.println(
                indent + "└──StyleBlock - Closing </style> (line number " + closingLine + ")"
        );
    }
}