package com.twu.biblioteca;

import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class BibliotecaAppTest {

    @Test
    public void testWelcomeMessage(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());

        bibliotecaApp.run(in, ps);

        assertThat(baos.toString(), containsString("Welcome"));
    }

    @Test
    public void testPrintListOfBooks(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());

        bibliotecaApp.run(in, ps);

        assertThat(baos.toString(), containsString("Re Work"));
        assertThat(baos.toString(), containsString("Extreme Programming"));
    }

    @Test
    public void testPrintBooksDetail(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());

        bibliotecaApp.run(in, ps);

        assertThat(baos.toString(), containsString("Re Work - DHH - 2006"));
        assertThat(baos.toString(), containsString("Extreme Programming - Kent Beck - 2008" ));
    }

    @Test
    public void testPrintMenu(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());

        bibliotecaApp.run(in, ps);

        assertThat(baos.toString(), containsString("Main Menu"));
        assertThat(baos.toString(), containsString("1- List Of Books"));
        assertThat(baos.toString(), containsString("2- Exit"));

    }

    @Test
    public void testSeeBooksListAfterSelectingTheMenuOption(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        bibliotecaApp.run(in, ps);

        assertThat(baos.toString(), containsString("Re Work - DHH - 2006"));
        assertThat(baos.toString(), containsString("Extreme Programming - Kent Beck - 2008" ));

    }

    @Test
    public void testInvalidMenuOption(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        bibliotecaApp.run(in, ps);

        assertThat(baos.toString(), containsString("Invalid option"));
        assertThat(baos.toString(), containsString("Select a valid option"));

    }


}
