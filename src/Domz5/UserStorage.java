package Domz5;

public class UserStorage {
    private static User[] users;
    static {
        users = new User[]{
                new User("login1", "password1"),
                new User("login2", "password2"),
                new User("login3", "password3"),
                new User("login4", "password4"),
                new User("login5", "password5"),
                new User("login6", "password6"),
                new User("login7", "password7"),
                new User("login8", "password8"),
                new User("login9", "password9"),
                new User("login10", "password10")
        };

    }


    public boolean authenticate(User user) {
        for (User el : users){
            if (el.equals(user)){
                return true;
            }
        }

        return false;
    }

}