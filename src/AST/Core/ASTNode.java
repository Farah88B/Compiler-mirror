package AST.Core;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public abstract class ASTNode {

    protected String nodeName;
    protected int line;
    protected List<ASTNode> children;
=======
public class ASTNode {

    public String nodeName;
    protected int line;
    public List<ASTNode> children;
>>>>>>> oldrepo/finalJinja

    public ASTNode(String nodeName, int line) {
        this.nodeName = nodeName;
        this.line = line;
        this.children = new ArrayList<>();
    }
<<<<<<< HEAD
=======
    public int getLine() {
        return this.line;
    }
>>>>>>> oldrepo/finalJinja

    public void addChild(ASTNode child) {
        if (child != null)
            children.add(child);
    }

    public void print(String indent) {
        System.out.println(indent+"└── "+nodeName + " (line number " + line + ")");
        for (ASTNode child : children) {
            child.print(indent + "    ");
        }
    }
}

