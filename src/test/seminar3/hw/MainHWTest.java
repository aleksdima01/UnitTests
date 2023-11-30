package seminar3.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    MainHW mainHW;

    @BeforeEach
    void beforeEach() {
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, 0, 2, 26, 28})
    void evenOddNumberTestTrue(int num) {
        boolean result = mainHW.evenOddNumber(num);
        assertEquals(true, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 1, 25, 27})
    void evenOddNumberTestFalse(int num) {
        boolean result = mainHW.evenOddNumber(num);
        assertEquals(false, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 29, 88, 100})
    void numberInIntervalTestTrue(int num) {
        boolean result = mainHW.numberInInterval(num);
        assertEquals(true, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-28, 0, 18, 9, 101, 154})
    void numberInIntervalTestFalse(int num) {
        boolean result = mainHW.numberInInterval(num);
        assertEquals(false, result);
    }
}