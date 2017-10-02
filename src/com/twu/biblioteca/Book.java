package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String argTitle, String argAuthor, int argYearPublished){
        title = argTitle;
        author = argAuthor;
        yearPublished = argYearPublished;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }
}
