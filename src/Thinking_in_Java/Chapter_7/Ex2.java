package Thinking_in_Java.Chapter_7;

public class Ex2 extends Detergent {

    @Override
    public void scrub() {
        append(" Ex2.scrub");
        super.scrub();
    }
    public void sterilize(){
        append(" sterilize()");
    }

    void sterilize2() {
        System.out.println("!");
    }

    public static void main(String[] args) {
        Ex2 x = new Ex2();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        x.sterilize2();
        System.out.println(x);
        System.out.println("Проверяем базовый класс от Ex2");
        Detergent.main(args);
    }
}
