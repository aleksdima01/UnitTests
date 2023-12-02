package seminar3.user;

public class User {

    String name;
    private final String password;
    boolean isAdmin = false;

    private boolean isAuthenticate = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setAdmin(boolean state) {
        isAdmin = state;
    }

    public String getName() {
        return name;
    }

    public boolean isAdmin() {
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