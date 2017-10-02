package com.twu.biblioteca;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaAppTest {


    private BibliotecaApp bibliotecaApp;

    @Before
    public void beforeTest() {
        List<Book> books = Arrays.asList(new Book("Re Work","Mony",2010),new Book("Head First Java","Kenji",2012), new Book("Extreme Programming", "Gergo", 2017));
        List<Book> list = new ArrayList<>(books);
        List<MenuItem> menu = Arrays.asList(new MenuItem(1,"List Of Books", null), new MenuItem(2,"Exit",null));
        List<MenuItem> menuList = new ArrayList<>(menu);
        bibliotecaApp = new BibliotecaApp(list, menuList);

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
        Assert.assertEquals("List of books doesn't match.", "Re Work by Mony (2010), Head First Java by Kenji (2012), Extreme Programming by Gergo (2017)", listOfBooks);
    }

    //    Main Menu  - As a customer, instead of automatically seeing the book list,
    // I would like to see a list of options and be able to choose one. For now,
    // the only option should be 'List Books'. All future options should be added to this menu also.
    @Test
    public void testShowMainMenu(){
        String listOfMenu = bibliotecaApp.showMenu();
        Assert.assertEquals("1- List Of Books\n2- Exit\n", listOfMenu);
    }

}
