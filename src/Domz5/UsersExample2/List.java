package Domz5.UsersExample2;


import org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS;
import sun.rmi.runtime.Log;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class List {
    public static void main(String[] args) {

            User u1 = new User("login1", "password1");
            User u2 = new User("login2", "password2");
            User u3 = new User("login3", "password3");

            Stack<User> users = new Stack<>();
            users.push(u1);
            users.push(u2);
            users.push(u3);

       users.pop();
       users.pop();
       users.pop();

       try {
           users.peek().toString();
       }catch (EmptyStackException e)
       {
           System.out.println("Пустой стек.");
       }

        Iterator itr = users.iterator();
        while (itr.hasNext()) {
            User us = (User) itr.next();
            System.out.println(us.getLogin() + " " + us.getPassword());

        }


        }

    }




