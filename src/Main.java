
import AST.Core.PageNode;
import Visitor.HtmlCssJinjaVisitor;
import Visitor.SymbolTableVisitor;
import antlr.TemplateLexer;
import antlr.TemplateParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        String source = "tests/product_details.html";


        CharStream charStream = CharStreams.fromFileName(source);


        TemplateLexer lexer = new TemplateLexer(charStream);


        CommonTokenStream tokens = new CommonTokenStream(lexer);


        TemplateParser parser = new TemplateParser(tokens);


        ParseTree tree = parser.page();


        System.out.println("---------- PARSE TREE ---------- ");
        System.out.println(Trees.toStringTree(tree, parser));


        HtmlCssJinjaVisitor visitor = new HtmlCssJinjaVisitor();
        PageNode ast = (PageNode) visitor.visit(tree); // المتغير اسمه ast


        System.out.println("\n ----------- AST ----------");
        ast.print("");

        SymbolTableVisitor semanticAnalyzer = new SymbolTableVisitor();
        semanticAnalyzer.visit(tree);
        semanticAnalyzer.getSymbolTable().printSymbolTable();
    }
}
