package com.twu.biblioteca;

import java.io.InputStream;
import java.io.OptionalDataException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run(System.in,System.out);
    }

    public void run(InputStream in, PrintStream out) {
        out.println("Welcome");
        out.println("Here is the list of the books.");

        List<String> books = new ArrayList<String>(Arrays.asList("Re Work","Extreme Programming"));
        for (int i = 0; i < books.size() ; i++) {
            out.println(i+"- "+books.get(i));
        }
    }
}
