import antlr.TemplateLexer;
import antlr.TemplateParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Define the folder where your test files are located
        String testFolderPath = "tests";
        File folder = new File(testFolderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("Folder 'test_cases' not found! Please create it and put your files inside.");
            return;
        }

        // 2. Get all files in the folder
        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in the folder.");
            return;
        }

        // 3. Loop through each file and parse it
        for (File file : files) {
            if (file.isFile() && (file.getName().endsWith(".html") || file.getName().endsWith(".jinja"))) {
                System.out.println("\n========================================");
                System.out.println("Processing file: " + file.getName());
                System.out.println("========================================");

                try {
                    parseFile(file);
                } catch (Exception e) {
                    System.err.println("Error parsing " + file.getName() + ": " + e.getMessage());
                }
            }
        }
    }

    // A separate method to handle the parsing logic for a single file
    private static void parseFile(File file) throws IOException {
        // A. Create CharStream from the FILE path
        CharStream chars = CharStreams.fromFileName(file.getAbsolutePath());

        // B. Create Lexer and Parser (Same as before)
        TemplateLexer lexer = new TemplateLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TemplateParser parser = new TemplateParser(tokens);

        // C. Add a simple Error Listener to see errors in console without crashing immediately
        parser.removeErrorListeners(); // Remove default console listener
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.println("Syntax Error at line " + line + ":" + charPositionInLine + " " + msg);
            }
        });

        // D. Parse
        ParseTree tree = parser.page();

        // E. Print the Tree (Console)
        System.out.println(tree.toStringTree(parser));

        // F. (Optional) Show the Tree GUI
        // NOTE: Opening 4 GUI windows might be messy.
        // You can comment this out if you only want console output.
        showTreeInGUI(tree, parser, file.getName());
    }

    private static void showTreeInGUI(ParseTree tree, Parser parser, String fileName) {
        JFrame frame = new JFrame("AST Viewer: " + fileName);
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(0.8); // Scale down slightly
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window, not the app
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}