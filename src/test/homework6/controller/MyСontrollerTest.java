package homework6.controller;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.*;

class MyСontrollerTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    void controllerTest() {
        System.setOut(new PrintStream(output));
        MyСontroller myСontroller = new MyСontroller();
        myСontroller.run();
        assertFalse(output.toString().trim().isEmpty());
    }
}