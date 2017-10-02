package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void testGetTitle(){
        Book book = new Book("Re Work", "Kenji", 2012);
        String bookTitle = book.getTitle();
        Assert.assertEquals("Title not found", "Re Work", bookTitle);
    }

    @Test
    public void testGetAuthor(){
        Book book = new Book("Re Work", "Kenji", 2012);
        String bookAuthor = book.getAuthor();
        Assert.assertEquals("Author not found", "Kenji", bookAuthor);
    }

    @Test
    public void testGetYearPublished(){
        Book book = new Book("Re Work", "Kenji", 2012);
        int bookYearPublished = book.getYearPublished();
        Assert.assertEquals("Year of Publish not found",2012, bookYearPublished);
    }
}
