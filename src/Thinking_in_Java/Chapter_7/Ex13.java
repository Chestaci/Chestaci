package Thinking_in_Java.Chapter_7;

public class Ex13 extends MrWhite {
    void tea (int i, String s) {
        System.out.println("Mr. White взял: " + i + " пакетиков чая " + "'" + s + "'");
    }

    public static void main(String[] args) {
        Ex13 x = new Ex13();
        x.tea("Гринфилд");
        x.tea(3);
        x.tea(true);
        x.tea(3, "Гринфилд");
    }
}

class MrWhite {
    void tea (String s) {
        System.out.println("Mr. White выбрал чай: " + s);
    }
    void tea (int i) {
        System.out.println("Mr. White взял: " + i + " пакетиков чая");
    }
    void tea (boolean b) {
        System.out.println("Гостям понравится чай? " + b);
    }
}
