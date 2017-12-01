package Domz5;

import java.util.Objects;

public class User {

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !getClass().equals(obj.getClass())) return false;
        User user = (User) obj;

        return Objects.equals(login,user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result=31* result+ login.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

}