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

    private void runBibliotecaAppinTest(String inputString) {
        ByteArrayInputStream in = new ByteArrayInputStream(inputString.getBytes());
        bibliotecaApp.run(in, ps);
    }

    @Test
    public void testWelcomeMessage() {

        runBibliotecaAppinTest("1");
        assertThat(baos.toString(), containsString("Welcome"));
    }

    @Test
    public void testPrintListOfBooks() {

        runBibliotecaAppinTest("1");
        assertThat(baos.toString(), containsString("Re Work"));
        assertThat(baos.toString(), containsString("Extreme Programming"));
    }

    @Test
    public void testPrintBooksDetail() {

        runBibliotecaAppinTest("1");
        assertThat(baos.toString(), containsString("Re Work - DHH - 2006"));
        assertThat(baos.toString(), containsString("Extreme Programming - Kent Beck - 2008"));
    }

    @Test
    public void testPrintMenu() {

        runBibliotecaAppinTest("1");
        assertThat(baos.toString(), containsString("Main Menu"));
        assertThat(baos.toString(), containsString("1- List Of Books"));
        assertThat(baos.toString(), containsString("2- Quit"));

    }

    @Test
    public void testSeeBooksListAfterSelectingTheMenuOption() {

        runBibliotecaAppinTest("1");
        assertThat(baos.toString(), containsString("Re Work - DHH - 2006"));
        assertThat(baos.toString(), containsString("Extreme Programming - Kent Beck - 2008"));

    }

    @Test
    public void testInvalidMenuOptionThenRe_enter() {

        runBibliotecaAppinTest("3\n1");
        assertThat(baos.toString(), containsString("Invalid option"));
        assertThat(baos.toString(), containsString("Select a valid option"));
        assertThat(baos.toString(), containsString("Re Work - DHH - 2006"));

    }

    @Test
    public void testStopTheAppWhenQuitChosen() {

        runBibliotecaAppinTest("2");
        assertThat(baos.toString(), containsString("Exiting..."));

    }

}
