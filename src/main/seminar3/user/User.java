package seminar3.user;

public class User {

    String name;
    private String password;
    boolean isAdmin;

    private boolean isAuthenticate = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    private String getPassword() {
        return password;
    }

    public boolean isAmin() {
        return isAdmin;
    }

    public boolean userIsAuthenticate() {
        return isAuthenticate;
    }

    //3.6.
    public void authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password))
            isAuthenticate = true;
        else
            isAuthenticate = false;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", isadmin=" + isAdmin +
                ", isAuthenticate=" + isAuthenticate +
                '}' + '\n';
    }
}