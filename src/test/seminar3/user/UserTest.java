package seminar3.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    List<User> data;
    User user;
    UserRepository userrepository;

    @BeforeEach
    void beforeEach() {
        userrepository = new UserRepository();
        data = new ArrayList<>();
        user = new User("Andrew", "123");
    }

    @Test
    void testToString() {
        data.add(user);
        for (User item : data
        ) {
            assertThat("[" + item + "]").isEqualTo(data.toString());
        }
    }

    @Test
    void getNameTest() {
        assertEquals(user.name, user.getName());
    }

    @Test
    void isAdminTest() {
        assertEquals(user.isAdmin, user.isAdmin());
    }

    @Test
    void userIsAuthenticateTest() {
        assertEquals(false, user.userIsAuthenticate());
    }

    @Test
    void authenticateTest() {
        user.authenticate("Andrew", "123");
        assertTrue(user.userIsAuthenticate());
    }

    @Test
    void authenticateFalseTest() {
        user.authenticate("Andrew", "12345");
        assertFalse(user.userIsAuthenticate());
    }
}
