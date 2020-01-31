package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private static String welcomeMsg = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
//    private static String listOfBooks = "Harry Potter\nLord of the Rings\nThe Fall of Gondolin";
    private static List<Book> listOfBooks = new ArrayList<Book>();

    public static void main(String[] args) {
        System.out.println(getWelcomeMsg());
        System.out.println(getListOfBooks());
    }

    /**
     * @return the list of books for the library
     * */
    public static List getListOfBooks() {
        return listOfBooks;
    }

    /**
     * @param bookItem the book to add to the list
     * */
    public static void setListOfBooks(Book bookItem) {
        listOfBooks.add(bookItem);
    }

    /**
     * @return the Welcome Message
     * */
    public static String getWelcomeMsg() {
        return welcomeMsg;
    }
}
