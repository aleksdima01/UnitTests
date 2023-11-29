package seminar3.coverage;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeServiceTest {
    // 3.1.
    SomeService someservice;

    @BeforeEach
    void setup() {
        someservice = new SomeService();
    }

    @Test
    void multipleThreeNotFiveReturnsFizz() {
        SomeService someservice = new SomeService();
        String check = someservice.fizzBuzz(3);
        assertThat(check).isEqualTo("fizz");
    }

    @Test
    void multipleThreeNotFiveReturnsBuzz() {
        SomeService someservice = new SomeService();
        String check = someservice.fizzBuzz(5);
        assertThat(check).isEqualTo("buzz");
    }

    @Test
    void multipleThreeNotFiveReturnsFizzBuzz() {
        SomeService someservice = new SomeService();
        String check = someservice.fizzBuzz(15);
        assertThat(check).isEqualTo("fizzbuzz");
    }

    @Test
    void multipleNotThreeNotFiveReturnsString() {
        SomeService someservice = new SomeService();
        String check = someservice.fizzBuzz(8);
        assertThat(check).isEqualTo("8");
    }

    @Test
    void ArrayStartsAndFinishOn() {
        boolean result = someservice.firstLast6(new int[]{1, 2, 3, 4, 5, 6});
        assertEquals(true, result);
    }

    @Test
    void ArrayStartsAndFinishOnFalse() {
        boolean result = someservice.firstLast6(new int[]{1, 2, 3, 4, 5, 8});
        assertEquals(false, result);
    }

    @ParameterizedTest
    @CsvSource({"2000,50,1000", "2000,100,0", "2000,0,2000"})
    void insufficientCoverageTest(double amount, int discount, double result) {

        assertThat(someservice.calculatingDiscount(amount, discount))
                .isEqualTo(result); // обычная скидка}
    }

    @Test
    void erw() {
        assertThatThrownBy(() ->
                someservice.calculatingDiscount(2000.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
    }

    @Test
    void lkads() {
        assertThatThrownBy(() ->
                someservice.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
    }
}