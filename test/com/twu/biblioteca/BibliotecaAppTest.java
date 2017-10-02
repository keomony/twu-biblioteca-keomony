package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void testWelcomeMessage(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        bibliotecaApp.run(null, ps);

        assertThat(baos.toString(), containsString("Welcome"));
    }

    @Test
    public void testPrintListOfBooks(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        bibliotecaApp.run(null, ps);

        assertThat(baos.toString(), containsString("Re Work"));
        assertThat(baos.toString(), containsString("Extreme Programming"));
    }
}
