package Domz5;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        String login;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин: ");
        login = in.nextLine();


        String password;
        Scanner inn = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        password = inn.nextLine();

        User user = new User(login, password);
        UserStorage2 el = new UserStorage2();

        if (el.authenticate(user)) {
            System.out.println("vse norm");
        }else {
            System.out.println("nichego ne ponimayu");
        }
        System.out.println("Finish");
        }

    }
