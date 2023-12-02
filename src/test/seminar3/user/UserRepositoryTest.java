package seminar3.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    User user;
    UserRepository userrepository;
    List<User> data;

    @BeforeEach
    void beforeEach() {
        userrepository = new UserRepository();
        user = new User("Andrew", "123");
        data = new ArrayList<>();

    }

    @Test
    void addUserTest() {
        user.authenticate("Andrew", "123");
        userrepository.addUser(user);
        assertThat(userrepository.data).isNotEmpty();
    }

    @Test
    void findByName() {
        user.authenticate("Andrew", "123");
        userrepository.addUser(user);
        boolean result = userrepository.findByName("Andrew");
        assertEquals(userrepository.data.get(0).name.equals("Andrew"), result);
    }

    @Test
    void findByNameFalse() {
        userrepository.addUser(user);
        boolean result = userrepository.findByName("Andrew");
        assertFalse(result);
    }

    @Test
    void testToString() {
        user.authenticate("Andrew", "123");
        userrepository.addUser(user);
        assertThat(userrepository.toString()).isEqualTo("UserRepository\n" +
                userrepository.getUser());

    }

    @Test
    void testToStringFalse() {
        userrepository.addUser(user);
        assertThat(userrepository.toString()).isEqualTo("Нет актуальных сеансов в системе!");

    }

    @Test
    void logoutIfNoAdmin() {
        User user2 = new User("Petr", "12345");
        user.authenticate("Andrew", "123");
        user2.authenticate("Petr", "12345");
        userrepository.addUser(user);
        userrepository.addUser(user2);
        user2.setAdmin(true);
        List<User> testuser = new ArrayList<>();
        testuser.add(user2);
        userrepository.logoutIfNoAdmin();
        assertEquals(testuser, userrepository.getUser());

    }
}