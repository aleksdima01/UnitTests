package homework6;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    void mainTest() {
        System.setOut(new PrintStream(output));
        String[] array = {""};
        Main.main(array);
        assertThat(output.toString().trim()).isNotNull().isNotInstanceOf(Exception.class);
    }
}