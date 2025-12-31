//package AST.Html;
//import AST.Core.ASTNode;
//public class HtmlElementNode extends ASTNode {
//    private final String tagName;
//
//    public HtmlElementNode(String tagName, int line) {
//        super("HtmlElement <" + tagName + ">", line);
//        this.tagName = tagName;
//    }
//    public String getTagName() {
//        return tagName;
//    }
//    @Override
//    public void print(String indent) {
//        // التحقق مما إذا كان العنصر ذاتي الإغلاق (Self-Closing)
//        if (isVoidTag(tagName)) {
//            // طباعة الوسم الذاتي مع رقم السطر
//            System.out.println(indent + "HtmlElement - Self-Closing <" + tagName + "/> (line number " + line + ")");
//
//            // طباعة السمات (Attributes) الموجودة داخله كأبناء
//            for (ASTNode child : children) {
//                child.print(indent + "  ");
//            }
//        } else {
//            // العناصر العادية (Paired Elements)
//
//            System.out.println(indent + "└── HtmlElement - Opening <" + tagName + "> (line number " + line + ")");
//
//            // طباعة الأبناء (Attributes + Text + Child Elements)
//            for (ASTNode child : children) {
//                child.print(indent + "  ");
//            }
//
//            // طباعة وسم الإغلاق
//            System.out.println(indent + "└── HtmlElement - Closing </" + tagName + "> (line number " + line + ")");
//        }
//    }
//    // دالة مساعدة لتحديد الوسوم الفارغة
//    private boolean isVoidTag(String tag) {
//        return tag.equals("br") || tag.equals("hr") || tag.equals("img") ||
//                tag.equals("input") || tag.equals("meta") || tag.equals("link");
//    }
//}


package AST.Html;
import AST.Core.ASTNode;

public class HtmlElementNode extends ASTNode {

    private String tagName;
    private int closingLine;

    public HtmlElementNode(String tagName, int openingLine) {
        super("HtmlElement", openingLine);
        this.tagName = tagName;
        this.closingLine = openingLine; // افتراضياً نفس السطر
    }

    public void setClosingLine(int closingLine) {
        this.closingLine = closingLine;
    }

    @Override
    public void print(String indent) {

        if (isVoidTag(tagName)) {
            System.out.println(
                    indent + "└──HtmlElement - Self-Closing <" + tagName + "/> (line number " + line + ")"
            );
      for (ASTNode child : children) {
                child.print(indent + "  ");
            }
            return;
        }

        System.out.println(
                indent + "└──HtmlElement - Opening <" + tagName + "> (line number " + line + ")"
        );

        for (ASTNode child : children) {
            child.print(indent + "  ");
        }

        System.out.println(
                indent + "└──HtmlElement - Closing </" + tagName + "> (line number " + closingLine + ")"
        );
    }

    private boolean isVoidTag(String tag) {
        return tag.equals("area") || tag.equals("base") || tag.equals("br")
                || tag.equals("col") || tag.equals("embed") || tag.equals("hr")
                || tag.equals("img") || tag.equals("input") || tag.equals("link")
                || tag.equals("meta") || tag.equals("param") || tag.equals("source")
                || tag.equals("track") || tag.equals("wbr");
    }
}
