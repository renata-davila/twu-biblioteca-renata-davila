package com.twu.biblioteca;

public class BibliotecaApp {

    private static String welcomeMsg = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    private static String listOfBooks = "Harry Potter\nLord of the Rings\nThe Fall of Gondolin";

    public static void main(String[] args) {
        System.out.println(getWelcomeMsg());
        System.out.println(listOfBooks);
    }

    /**
     * @return the Welcome Message
     * */
    public static String getWelcomeMsg() {
        return welcomeMsg;
    }
}
