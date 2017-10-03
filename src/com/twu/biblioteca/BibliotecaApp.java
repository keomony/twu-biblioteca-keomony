package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run(System.in, System.out);
    }

    public void run(InputStream in, PrintStream out) {
        out.println("Welcome");
        out.println("Here is the list of the books.");
        List<Book> books = new ArrayList<>(Arrays.asList(new Book("Re Work", "DHH", 2006), new Book("Extreme Programming", "Kent Beck", 2008)));
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            out.println(MessageFormat.format("{0} - {1} - {2}", book.getTitle(), book.getAuthor(), "" + book.getYear()));
        }
        
    }
}
