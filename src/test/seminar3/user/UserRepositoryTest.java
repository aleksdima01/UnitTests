package seminar3.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
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
        assertTrue(result);
    }
    
}