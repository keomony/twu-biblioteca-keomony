package com.twu.biblioteca;

import java.io.InputStream;
import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run(System.in, System.out);
    }

    public void run(InputStream in, PrintStream out) {
        out.println("Welcome");
        printMainMenuOption(out);
        chooseMenuOptionByUserInput(in, out);
    }

    private void printMainMenuOption(PrintStream out) {
        out.println("Main Menu");
        out.println("1- List Of Books");
        out.println("2- Quit");
        out.println("Please type in your option, 1 or 2.");
    }

    private void chooseMenuOptionByUserInput(InputStream in, PrintStream out) {
        Scanner reader = new Scanner(in);
        int input = reader.nextInt();
        loopOnMenuOptionByUserInput(out, reader, input);
        reader.close();
    }

    private void loopOnMenuOptionByUserInput(PrintStream out, Scanner reader, int input) {
        while (true) {
            if (input == 1) {
                out.println("Here is the list of the books.");
                List<Book> books = new ArrayList<>(Arrays.asList(new Book("Re Work", "DHH", 2006), new Book("Extreme Programming", "Kent Beck", 2008)));
                for (int i = 0; i < books.size(); i++) {
                    Book book = books.get(i);
                    out.println(MessageFormat.format("{0} - {1} - {2}", book.getTitle(), book.getAuthor(), "" + book.getYear()));
                }
                break;
            } else if (input == 2){
                out.println("Exiting...");
                break;
            } else {
                out.println("Invalid option");
                out.println("Select a valid option, 1 or 2.");
                input = reader.nextInt();
            }
        }
    }
}
