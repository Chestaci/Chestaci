package Users;

public class List {

    private static User[] users = {new User("login1", "password1"), new User("login2", "password2"), new User("login3", "password3")};

    public static User[] getUsers() {
        return users;
    }

    public void print(User[] users) {

        users = getUsers();
        for (User p : users) {
            System.out.println(p.getLogin() + " " + p.getPassword());
        }
    }






}