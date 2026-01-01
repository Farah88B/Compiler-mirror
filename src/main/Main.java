package main;

import main.pythoncompiler.*;

public class Main {

    public static void main(String[] args) throws Exception {

        PythonCompiler compiler = new PythonCompiler();
        compiler.compile("src/tests/app1.py");
    }
}
