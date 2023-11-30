package seminar3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.isAuthenticate)
            data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        User user1 = new User("Pete", "12345");
        System.out.println(user1.authenticate("Pete", "12345"));
        UserRepository repo = new UserRepository();
        repo.addUser(user1);
        System.out.println(repo);
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "data=" + data +
                '}';
    }
}