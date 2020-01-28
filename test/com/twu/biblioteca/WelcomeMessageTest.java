package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class WelcomeMessageTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private final String welcomeMsg = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testUserGetsAWelcomeMessage() {
        // GIVEN
        // A Customer

        // WHEN
        // They start the application
        BibliotecaApp.main(new String[] {""});

        // THEN
        // They see a welcome message
        assertEquals(welcomeMsg + System.getProperty("line.separator"), outContent.toString());
    }
}

