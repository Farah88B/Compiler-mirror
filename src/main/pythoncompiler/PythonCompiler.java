
package main.pythoncompiler;


import main.pythoncompiler.visitor.SymbolTableVisitor;
import main.symbol_table.SymbolTable;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import main.pythoncompiler.ast.ASTNode;
import main.pythoncompiler.visitor.ASTBuilderVisitor;

import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;


public class PythonCompiler {

    public void compile(String filePath) throws Exception {

        String code = Files.readString(Path.of(filePath));
        CharStream input = CharStreams.fromString(code);


        PythonLexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);


        PythonParser parser = new PythonParser(tokens);


        ParseTree tree = parser.program();

        System.out.println(" Parsing successful");

        System.out.println(" Building AST...");
        ASTBuilderVisitor visitor = new ASTBuilderVisitor();
        ASTNode root = visitor.visit(tree);

        if (root != null) {
            System.out.println(" AST Structure ");
            System.out.println(root.toStringTree(""));
        } else {
            System.out.println(" AST Generation failed");
        }

        System.out.println(tree.toStringTree(parser));



    }
}

        if (root != null) {
            System.out.println("Building Symbol Table...");
            SymbolTable symbolTable = new SymbolTable();
            SymbolTableVisitor symTableVisitor = new SymbolTableVisitor(symbolTable);
            symTableVisitor.visit(root);
            System.out.println("\n=== Symbol Table ===");
            symbolTable.printSymbolTable();
            List<String> errors = symTableVisitor.getErrors();
            if (!errors.isEmpty()) {
                System.out.println("\n=== Semantic Analysis Report ===");
                for (String err : errors) {
                    System.out.println(err);
                }
            } else {
                System.out.println("\nNo Semantic Errors found.");
            }

        } else {
            System.out.println("AST Generation failed");
        }
    }

    }


