import AST.Core.PageNode;
import Visitor.HtmlCssJinjaVisitor;
import Visitor.SymbolTableVisitor;
import antlr.TemplateLexer;
import antlr.TemplateParser;
import main.pythoncompiler.PythonCompiler;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, Exception {

        //  Python Compiler
        PythonCompiler compiler = new PythonCompiler();
        compiler.compile("src/tests/app1.py");

        //  HTML/CSS/Jinja Parser
        //
        String source = "tests/index.html";

        CharStream charStream = CharStreams.fromFileName(source);

        // Lexer
        TemplateLexer lexer = new TemplateLexer(charStream);

        // Tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Parser
        TemplateParser parser = new TemplateParser(tokens);

        ParseTree tree = parser.page();

        // Parse Tree
        System.out.println("---------- PARSE TREE ---------- ");
        System.out.println(Trees.toStringTree(tree, parser));

        // AST
        HtmlCssJinjaVisitor visitor = new HtmlCssJinjaVisitor();
        PageNode ast = (PageNode) visitor.visit(tree);

        System.out.println("\n ----------- AST ----------");
        ast.print("");

        //  Semantic Analysis
        SymbolTableVisitor semanticAnalyzer = new SymbolTableVisitor();
        semanticAnalyzer.visit(tree);
        semanticAnalyzer.getSymbolTable().printSymbolTable();
    }
}
