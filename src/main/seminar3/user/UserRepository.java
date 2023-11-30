package seminar3.user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.userIsAuthenticate())
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
        User user2 = new User("Shon", "123456");
        user1.authenticate("Pete", "12345");
        user2.authenticate("Shon", "123456");


        UserRepository repo = new UserRepository();
        repo.addUser(user1);
        repo.addUser(user2);
        System.out.println(repo);
    }

    @Override
    public String toString() {
        if (!data.isEmpty()) {
            return "UserRepository\n" +
                    data;
        } else
            return "Нет актуальных сеансов в системе!";
    }
}