package main.pythoncompiler.visitor;

import main.pythoncompiler.ast.*;
import main.symbol_table.Symbol;
import main.symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableVisitor {

    private SymbolTable symbolTable;
    private List<String> errorMessages;

    public SymbolTableVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.errorMessages = new ArrayList<>();
    }

    private void logError(String message) {
        errorMessages.add(message);
    }

    public List<String> getErrors() {
        return errorMessages;
    }


    public void visit(ASTNode node) {
        if (node == null) return;

        if (node instanceof ProgramNode) visit((ProgramNode) node);
        else if (node instanceof FunctionDefNode) visitFunctionDef((FunctionDefNode) node);
        else if (node instanceof ClassDefNode) visitClassDef((ClassDefNode) node);
        else if (node instanceof BlockNode) visitBlock((BlockNode) node);
        else if (node instanceof AssignNode) visitAssign((AssignNode) node);
        else if (node instanceof IfNode) visitIf((IfNode) node);
        else if (node instanceof WhileNode) visitWhile((WhileNode) node);
        else if (node instanceof ForNode) visitFor((ForNode) node);
        else if (node instanceof ReturnNode) visitReturn((ReturnNode) node);
        else if (node instanceof IdentifierNode) checkIdentifierUsage((IdentifierNode) node);
        else if (node instanceof BinaryOpNode) visitBinaryOp((BinaryOpNode) node);
        else if (node instanceof UnaryOpNode) visitUnaryOp((UnaryOpNode) node);
        else if (node instanceof CallNode) visitCall((CallNode) node);
        else visitChildren(node);
    }

    private void visitChildren(ASTNode node) {
        for (ASTNode child : node.children) {
            visit(child);
        }
    }

    private void visit(ProgramNode node) { visitChildren(node); }

    private void visitFunctionDef(FunctionDefNode node) {
        String kind = node.nodeName.equals("RouteFunction") ? "RouteFunction" : "Function";
        symbolTable.insert(node.functionName, "Function", kind, symbolTable.getCurrentScope().getScopeType(), node.lineNumber);

        symbolTable.enterScope(node.functionName + "()");

        if (!node.children.isEmpty()) {
            ASTNode firstChild = node.children.get(0);
            if (firstChild != null && firstChild.nodeName.equals("Parameters")) {
                for (ASTNode param : firstChild.children) {
                    if (param instanceof IdentifierNode) {
                        symbolTable.insert(((IdentifierNode) param).name, "Any", "Parameter", "Local", param.lineNumber);
                    }
                }
            }
        }
        visitChildren(node);
        symbolTable.exitScope();
    }

    private void visitClassDef(ClassDefNode node) {
        symbolTable.insert(node.className, "Class", "Class", symbolTable.getCurrentScope().getScopeType(), node.lineNumber);
        symbolTable.enterScope(node.className);
        visitChildren(node);
        symbolTable.exitScope();
    }

    private void visitBlock(BlockNode node) { visitChildren(node); }
    private void visitIf(IfNode node) { visitChildren(node); }
    private void visitWhile(WhileNode node) { visitChildren(node); }

    private void visitFor(ForNode node) {
        symbolTable.insert(node.iteratorName, "Any", "Iterator", symbolTable.getCurrentScope().getScopeType(), node.lineNumber);
        visitChildren(node);
    }

    private void visitReturn(ReturnNode node) { visitChildren(node); }

    private void visitAssign(AssignNode node) {
        String varName = node.variableName;
        String type = "Any";
        if (!node.children.isEmpty()) {
            type = inferType(node.children.get(0));
        }

        Symbol existing = symbolTable.lookup(varName);
        if (existing == null) {
            symbolTable.insert(varName, type, "Variable", symbolTable.getCurrentScope().getScopeType(), node.lineNumber);
        }
        visitChildren(node);
    }

    private void visitCall(CallNode node) {

        boolean isMethodCall = (!node.children.isEmpty() && node.children.get(0) instanceof AttributeNode);

        if (!isMethodCall) {
            Symbol func = symbolTable.lookup(node.functionName);
            if (func == null) {
                logError("WARNING: Call to undefined function/method '" + node.functionName + "' at line " + node.lineNumber);
            }
        }
        visitChildren(node);
    }

    private void visitBinaryOp(BinaryOpNode node) { visitChildren(node); }
    private void visitUnaryOp(UnaryOpNode node) { visitChildren(node); }

    private void checkIdentifierUsage(IdentifierNode node) {
        Symbol sym = symbolTable.lookup(node.name);
        if (sym == null) {
            logError("ERROR: Undefined variable '" + node.name + "' used at line " + node.lineNumber);
        }
    }

    private String inferType(ASTNode node) {
        if (node instanceof LiteralNode) return ((LiteralNode) node).type;
        else if (node instanceof ListNode) return "List";
        else if (node instanceof DictNode) return "Dict";
        else if (node instanceof BinaryOpNode) return "Any";
        else if (node instanceof IdentifierNode) {
            Symbol sym = symbolTable.lookup(((IdentifierNode) node).name);
            return (sym != null) ? sym.getType() : "Unknown";
        }
        else if (node instanceof CallNode) return "Any";
        visitChildren(node);
        return "Any";
    }
}