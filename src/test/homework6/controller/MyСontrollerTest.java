package homework6.controller;

import homework6.model.ListComparator;
import homework6.model.MyList;
import homework6.view.PrintToConsole;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

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