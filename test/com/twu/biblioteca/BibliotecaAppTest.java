package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class BibliotecaAppTest {

    private BibliotecaApp bibliotecaApp;
    private ByteArrayOutputStream baos;
    private PrintStream ps;
    @Before
    public void beforeTest(){
        bibliotecaApp = new BibliotecaApp();
        baos = new ByteArrayOutputStream();
        ps = new PrintStream(baos);
    }


    @Test
    public void testWelcomeMessage() {

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        bibliotecaApp.run(in, ps);
        assertThat(baos.toString(), containsString("Welcome"));
    }

    @Test
    public void testPrintListOfBooks() {

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        bibliotecaApp.run(in, ps);
        assertThat(baos.toString(), containsString("Re Work"));
        assertThat(baos.toString(), containsString("Extreme Programming"));
    }

    @Test
    public void testPrintBooksDetail() {

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        bibliotecaApp.run(in, ps);
        assertThat(baos.toString(), containsString("Re Work - DHH - 2006"));
        assertThat(baos.toString(), containsString("Extreme Programming - Kent Beck - 2008"));
    }

    @Test
    public void testPrintMenu() {

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        bibliotecaApp.run(in, ps);
        assertThat(baos.toString(), containsString("Main Menu"));
        assertThat(baos.toString(), containsString("1- List Of Books"));
        assertThat(baos.toString(), containsString("2- Quit"));

    }

    @Test
    public void testSeeBooksListAfterSelectingTheMenuOption() {

        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        bibliotecaApp.run(in, ps);
        assertThat(baos.toString(), containsString("Re Work - DHH - 2006"));
        assertThat(baos.toString(), containsString("Extreme Programming - Kent Beck - 2008"));

    }

    @Test
    public void testInvalidMenuOptionThenRe_enter() {

        ByteArrayInputStream inputInvalidOption = new ByteArrayInputStream("3\n1".getBytes());
        bibliotecaApp.run(inputInvalidOption, ps);
        assertThat(baos.toString(), containsString("Invalid option"));
        assertThat(baos.toString(), containsString("Select a valid option"));
        assertThat(baos.toString(), containsString("Re Work - DHH - 2006"));

    }

    @Test
    public void testStopTheAppWhenQuitChosen() {

        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        bibliotecaApp.run(in, ps);
        assertThat(baos.toString(), containsString("Exiting..."));

    }

}
