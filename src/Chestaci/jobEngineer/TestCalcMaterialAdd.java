package Chestaci.jobEngineer;

import java.util.Scanner;

public class TestCalcMaterialAdd {

    public static void main(String[] args) {

        System.out.println("Dobro pojalovat' v programmu rascheta doshihtovki ferritovogo poroshka!");
        System.out.println("");

        System.out.println("Pojaluysta, vvedite ishodnie dannie!");
        System.out.println("");

        System.out.println("Seychas neobhodimo budet vvesti nazvanie ferrita, a potom ego nomer partii!");
        System.out.println("");

        System.out.println("Kakoy ferrit budem doshihtovivat'? Vvedite nazvanie marki nujnogo ferrita:");
        Scanner in1 = new Scanner(System.in);
        String name =  in1.nextLine();
        System.out.println("");

        System.out.println("Kakoy partii ferrit? Vvedite nomer partii:");
        Scanner in2 = new Scanner(System.in);
        String vol = in2.nextLine();
        System.out.println("");

        System.out.println("Seychas neobhodimo budet vvesti nazvaniya neobhodimuh materialov, a takje ih procenti po TU i procenti po RFA");
        System.out.println("");

        System.out.println("Vvedite nazvanie materiala № 1:");
        Scanner in3 = new Scanner(System.in);
        String material1 = in3.nextLine();
        System.out.println("");

        System.out.println("Vvedite procent po TU materiala № 1:");
        Scanner in4 = new Scanner(System.in);
        while (!in4.hasNextDouble()) {
            System.out.println("Error vvedite chislo");
            in4.next();
        }
        double tu1 = in4.nextDouble();
        System.out.println("");

        System.out.println("Vvedite procent po RFA materiala № 1:");
        Scanner in5 = new Scanner(System.in);
        while (!in5.hasNextDouble()) {
            System.out.println("Error vvedite chislo");
            in5.next();
        }
        double rfa1 = in5.nextDouble();

        System.out.println("Vvedite nazvanie materiala № 2:");
        Scanner in6 = new Scanner(System.in);
        String material2 = in6.nextLine();
        System.out.println("");

        System.out.println("Vvedite procent po TU materiala № 2:");
        Scanner in7 = new Scanner(System.in);
        while (!in7.hasNextDouble()) {
            System.out.println("Error vvedite chislo");
            in7.next();
        }
        double tu2 = in7.nextDouble();
        System.out.println("");

        System.out.println("Vvedite procent po RFA materiala № 2:");
        Scanner in8 = new Scanner(System.in);
        while (!in8.hasNextDouble()) {
            System.out.println("Error vvedite chislo");
            in8.next();
        }
        double rfa2 = in8.nextDouble();

        System.out.println("Vvedite nazvanie materiala № 3:");
        Scanner in9 = new Scanner(System.in);
        String material3 = in9.nextLine();
        System.out.println("");

        System.out.println("Vvedite procent po TU materiala № 3:");
        Scanner in10 = new Scanner(System.in);
        while (!in10.hasNextDouble()) {
            System.out.println("Error vvedite chislo");
            in10.next();
        }
        double tu3 = in10.nextDouble();
        System.out.println("");

        System.out.println("Vvedite procent po RFA materiala № 3:");
        Scanner in11 = new Scanner(System.in);
        while (!in11.hasNextDouble()) {
            System.out.println("Error vvedite chislo");
            in11.next();
        }
        double rfa3 = in11.nextDouble();
        System.out.println("");

        System.out.println("Vvedite ves naveski v grammah:");
        Scanner in12 = new Scanner(System.in);
        while (!in12.hasNextDouble()) {
            System.out.println("Error vvedite chislo");
            in12.next();
        }
        double batchWeight = in12.nextDouble();
        System.out.println("");
        System.out.println("###########################################################################################");
        System.out.println("");

        CalcMaterialAdd d1 = new CalcMaterialAdd(
                name,
                vol,
                new RawMaterial(material1, tu1, rfa1),
                new RawMaterial(material2, tu2, rfa2),
                new RawMaterial(material3, tu3, rfa3),
                batchWeight);
        d1.weightOfAdd();

        System.out.println("");
        System.out.println("###########################################################################################");

        System.out.println("");
        System.out.println("");
        System.out.println("Spasibo za ispolzovanie etoy programmi");
    }
}
