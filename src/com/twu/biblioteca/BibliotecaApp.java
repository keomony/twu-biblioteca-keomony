package com.twu.biblioteca;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class BibliotecaApp {

    private List<Book> listOfBooks;
    private List<MenuItem> listOfMenu;

    public BibliotecaApp(List<Book> books, List<MenuItem> menuItems) {
        listOfBooks = books;
        listOfMenu = menuItems;
    }

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(Arrays.asList(new Book("Re Work", "Kenji", 2012)),
                Arrays.asList(new MenuItem(1,"List Of Books", null), new MenuItem(2,"Exit",null)));
        bibliotecaApp.afterLoginSuccessfully("Mony");
    }

    public String showWelcomeUserWithMsg(String userName) {
        String welcomeMsg = "Hello " + userName + ". Welcome to Thoughtworks Biblioteca!";
        return welcomeMsg;
    }

    public String showListOfBooks() {
        Stream<Book> streamBooks = listOfBooks.stream();
        return streamBooks
                .map(book -> MessageFormat.format("{0} by {1} ({2})", book.getTitle(), book.getAuthor(), ""+book.getYearPublished()))
                .collect(joining(", "));
    }

    public void afterLoginSuccessfully(String userName) {
        System.out.println(showWelcomeUserWithMsg(userName));
        System.out.println(showListOfBooks());
        System.out.println(showMenu());
    }

    public String showMenu(){
        Stream<MenuItem> streamMenu = listOfMenu.stream();
        return streamMenu
                .map(menu -> MessageFormat.format("{0}- {1}\n", ""+menu.getMenuId(), menu.getMenuItem()))
                .collect(joining(""));
    }

}

