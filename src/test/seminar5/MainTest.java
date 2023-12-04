package seminar5;

import org.junit.jupiter.api.Test;
import seminar5.number.MaxNumberModule;
import seminar5.number.RandomNumberModule;
import seminar5.order.OrderService;
import seminar5.order.PaymentService;
import seminar5.user.UserRepository;
import seminar5.user.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    //5.1.
    @Test
    void testRandomGen() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        ArrayList<Integer> array = randomNumberModule.generate(5);

        assertThat(array.size()).isEqualTo(5);
    }

    @Test
    void maxNumberTest() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assertThat(maxNumberModule.getMax(array)).isEqualTo(5);
    }

    @Test
    void testInteger() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        ArrayList<Integer> array = randomNumberModule.generate(5);
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        assertThat(maxNumberModule.getMax(array)).isEqualTo(Collections.max(array));
    }
    //5.2.

    @Test
    void integrationUserTest() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        String result = userService.getUserName(1);

        assertThat(result).isEqualTo("User " + 1);
    }

    //5.3.
    @Test
    void integrationOrderTest() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);
        boolean result = orderService.placeOrder("1", 100.5);

        assertTrue(result);
    }
}