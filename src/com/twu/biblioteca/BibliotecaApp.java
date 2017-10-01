package com.twu.biblioteca;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.afterLoginSuccessfully("Mony");
    }
    public String showWelcomeUserWithMsg(String userName){
        String welcomeMsg = "Hello "+userName+". Welcome to Thoughtworks Biblioteca!";
        return welcomeMsg;
    }
    public String showListOfBooks(){
        List<String> listOfBooks = Arrays.asList("Re Work", "Head First Java", "Extreme Programming");
        Stream<String> streamBooks = listOfBooks.stream();
        return streamBooks.collect(joining(", "));
    }

    public void afterLoginSuccessfully(String userName){
        System.out.println(showWelcomeUserWithMsg(userName));
        System.out.println(showListOfBooks());
    }
}

