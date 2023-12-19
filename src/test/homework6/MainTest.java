package homework6;

import homework6.controller.MyСontroller;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class MainTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    void mainTest() {
        System.setOut(new PrintStream(output));
        String[] array = {""};
        Main.main(array);
        assertThat(output.toString().trim()).isNotNull();
    }
}