package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run(System.in,System.out);
    }

    public void run(InputStream in, PrintStream out) {
        out.println("Welcome");
    }
}
