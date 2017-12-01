package Domz5;

import java.util.Scanner;

public class Main {

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
        UserStorage el = new UserStorage();

        if (!el.authenticate(user)) {
            System.out.println("Заново запустите программу");
            return;
        } else System.out.println("Добро пожаловать");
        System.out.println("1. Показать все мои посты\n" + "2. Написать сообщение пользователю\n" + "3. Оставить комментарий к посту\n" + "4. Выход\n");
        int m;
        Scanner tr = new Scanner(System.in);

        while (!tr.hasNextInt()) {
            System.out.println("Error");
            tr.next();
        }
            m = tr.nextInt();
            if (m == 1){
                System.out.println("Раздел 1 в разработке");

            }
            if (m == 2){
                System.out.println("Раздел 2 в разработке");

            }
            if (m == 3){
                System.out.println("Раздел 3 в разработке");

            }
            if(m == 4){
                System.out.println("Завершение работы программы");

            }else
            System.out.println("Error Введите число от 1 до 4");
            tr.next();

        }

    }
