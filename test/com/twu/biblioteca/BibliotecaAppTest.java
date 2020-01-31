package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.Assert.*;


/**
 * Test biblioteca app.
 * */
public class BibliotecaAppTest {

    // Welcome message that should be displayed
    private final String welcomeMsg = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    // Sample list of library books
    private final String listOfBooks = "Harry Potter\nLord of the Rings\nThe Fall of Gondolin";

    /**
     * Capture the system output to be tested
     * */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    /**
     * Should be possible to see the welcome message after starting the app.
     * */
    @Test
    public void testUserGetsAWelcomeMessage() {
        // GIVEN
        // A Customer
        // WHEN
        // They start the application
        BibliotecaApp.main(new String[] {""});

        // THEN
        // They see a welcome message
        assertTrue(outContent.toString().contains(welcomeMsg + System.getProperty("line.separator")));
    }

    /**
     * Should be possible to see a list of all books after the welcome message.
     * */
    @Test
    public void testUserGetsAListOfBooks() {
        // GIVEN
        // A Customer
        // WHEN
        // After the welcome message appears
        BibliotecaApp.main(new String[] {""});

        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997);

        // THEN
        // They see a list of all library books
        List<String> outputLines = Arrays.asList(outContent.toString().split("\n"));
        List<String> sampleList = Arrays.asList(listOfBooks.split("\n"));

        ListIterator<String> iter = sampleList.listIterator();

        while(iter.hasNext()) {
            String item = iter.next();
            assertTrue(outputLines.contains(item));
        }
    }
}

