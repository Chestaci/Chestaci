package Domz5.UsersExample;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        User u1 = new User("login1", "password1");
        User u2 = new User("login2", "password2");
        User u3 = new User("login3", "password3");

        ArrayList <User> users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        users.add(u3);

         Iterator itr = users.iterator();

        while (itr.hasNext()) {
            User us = (User) itr.next();

            System.out.println(us.getLogin() + " " + us.getPassword());

        }

    }
}
