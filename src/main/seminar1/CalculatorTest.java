package seminar1;

import seminar1.model.Calculator;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

        // Случаи с неправильными аргументами
        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
        try {
            Calculator.calculation(8, 4, '_');
        } catch (IllegalStateException e) {
            if (!e.getMessage().equals("Unexpected value operator: _")) {
                throw new AssertionError("Ошибка в методе");
            }
        }

        // Проверка базового функционала с целыми числами, с использованием утверждений:
        assert 8 == Calculator.calculation(2, 6, '+');
        assert 0 == Calculator.calculation(2, 2, '-');
        assert 14 == Calculator.calculation(2, 7, '*');
        assert 2 == Calculator.calculation(100, 50, '/');

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        Assertions.assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        Assertions.assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        Assertions.assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        Assertions.assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        Assertions.assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);

        //System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
        //System.out.println(Calculator.squareRootExtraction(169));
        System.out.printf("Цена со скидкой = %.2f\n", Calculator.calculatingDiscount(123123, 78));
        // Проверка метода calculatingDiscount, с использованием утверждений AssertJ:
        Assertions.assertThat(Calculator.calculatingDiscount(123123, 24)).isGreaterThanOrEqualTo(0);
        Assertions.assertThat(Calculator.calculatingDiscount(123123, 24)).isNotNull();
    }
}