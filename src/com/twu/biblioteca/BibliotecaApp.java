package com.twu.biblioteca;

public class BibliotecaApp {

    private static String welcomeMsg = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    public static void main(String[] args) {
        System.out.println(getWelcomeMsg());
    }

    /**
     * @return the Welcome Message
     * */
    public static String getWelcomeMsg() {
        return welcomeMsg;
    }
}
