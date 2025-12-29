

import AST.Core.PageNode;
import Visitor.HtmlCssJinjaVisitor;

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

        // مسار ملف الاختبار
        String source = "tests/base.html";

        // قراءة الملف
        CharStream charStream = CharStreams.fromFileName(source);

        // Lexer
        TemplateLexer lexer = new TemplateLexer(charStream);

        // Tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Parser
        TemplateParser parser = new TemplateParser(tokens);

        // نقطة البداية في الـ grammar
        ParseTree tree = parser.page();

        // ================== طباعة Parse Tree ==================
        System.out.println("---------- PARSE TREE ---------- ");
        System.out.println(Trees.toStringTree(tree, parser));

        // ================== بناء AST ==================
        HtmlCssJinjaVisitor visitor = new HtmlCssJinjaVisitor();
        PageNode ast = (PageNode) visitor.visit(tree);

        // ================== طباعة AST ==================
        System.out.println("\n ----------- AST ----------");
        ast.print("");
    }
}
