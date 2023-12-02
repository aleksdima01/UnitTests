package seminar3.user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public List<User> getUser() {
        return data;
    }

    public void addUser(User user) {
        if (user.userIsAuthenticate())
            data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username))
                return true;
        }
        return false;
    }

    public void logoutIfNoAdmin() {
        for (User user : data) {
            if (!user.isAdmin) {
                data.remove(user);
            }
        }
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
