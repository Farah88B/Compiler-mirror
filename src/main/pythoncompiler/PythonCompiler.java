package main.pythoncompiler;

import main.pythoncompiler.grammer.PythonLexer;
import main.pythoncompiler.grammer.PythonParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Path;

public class PythonCompiler {

    public void compile(String filePath) throws Exception {
        String code = Files.readString(Path.of(filePath));

        CharStream input = CharStreams.fromString(code);
        PythonLexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);

        ParseTree tree = parser.program();

        System.out.println("✔ Parsing successful");
        System.out.println(tree.toStringTree(parser));
    }
}
