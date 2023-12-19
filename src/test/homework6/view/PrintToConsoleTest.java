package homework6.view;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintToConsoleTest {
    int num;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @ParameterizedTest
    @CsvSource({"1,Первый список имеет большее среднее значение!", "0,Средние значения списков равны!", "-1,Второй список имеет большее среднее значение!", "35,Ошибка вывода!"})
    void printTest(int num, String result) {
        System.setOut(new PrintStream(output));
        PrintToConsole printToConsole = new PrintToConsole();
        printToConsole.print(num);
        assertEquals(result, output.toString().trim());
    }
}