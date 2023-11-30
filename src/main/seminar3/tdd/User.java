package seminar3.tdd;

public class User {

    String name;
    private String password;
    boolean isadmin;

    boolean isAuthenticate = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }


    public boolean isIsadmin() {
        return isadmin;
    }

    public boolean isAuthenticate() {
        return isAuthenticate;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            isAuthenticate = true;
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isadmin=" + isadmin +
                ", isAuthenticate=" + isAuthenticate +
                '}';
    }
}