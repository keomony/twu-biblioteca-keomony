package com.twu.biblioteca;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BibliotecaAppTest {


    private BibliotecaApp bibliotecaApp;

    @Before
    public void beforeTest() {
        bibliotecaApp = new BibliotecaApp(Arrays.asList("Re Work", "Head First Java", "Extreme Programming"));
    }

    //    Welcome Message  - As a customer, I would like to see a welcome message when I start the application,
    // so that I feel welcome and know that Biblioteca is available.
    @Test
    public void testWelcomeUserWithMsg() {
        String userName = "Mony";
        String welcomeMsg = bibliotecaApp.showWelcomeUserWithMsg(userName);
        Assert.assertThat(welcomeMsg, CoreMatchers.is("Hello Mony. Welcome to Thoughtworks Biblioteca!"));
    }

    //    List Books - As a customer, after the welcome message appears I would like to see a list of all library books,
    // so that I can browse for books I might want to check-out. Assume that there is a pre-existing list of books.
    // You don't need to support adding or removing books from the library.

    //    Book Details - As a customer, I'd like the list of all books to include each books Author and Year Published,
    // so that I can be confident that I have found the book I am looking for.
    // The book listing should have columns for this information.
    @Test
    public void testListAllAvailableBooks() {
        String listOfBooks = bibliotecaApp.showListOfBooks();

        Assert.assertEquals("List of books doesn't match.", "Re Work, Head First Java, Extreme Programming", listOfBooks);
    }

}
