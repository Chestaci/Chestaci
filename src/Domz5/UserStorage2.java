package Domz5;

import java.util.ArrayList;

public class UserStorage2 {
    private static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User("l1", "p1"));
        users.add(new User("l2", "p2"));
        users.add(new User("l3", "p3"));
        users.add(new User("l4", "p4"));
        users.add(new User("l5", "p5"));
        users.add(new User("l6", "p6"));
        users.add(new User("l7", "p7"));
        users.add(new User("l8", "p8"));
        users.add(new User("l9", "p9"));
        users.add(new User("l10", "p10"));
    }


    public boolean authenticate(User user) {
        if (users.contains(new User(user.getLogin(), user.getPassword()))) {
            return true;
        }
        return false;
    }
}
