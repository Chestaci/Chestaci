package Thinking_in_Java.Chapter_7.Ex11;

public class Detergent{
    Cleanser cleanser = new Cleanser();

    public void append(String a){
        cleanser.append(a);
    }

    public void dilute(){
        cleanser.dilute();
    }

    public void apply(){
        cleanser.apply();
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }

    public void scrub(){
        append(" Detergent.scrub()");
        cleanser.scrub();
    }

    public void foam(){
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Проверяем базовый класс");
        Cleanser.main(args);
    }
}

class Cleanser{
    private String s = "Cleanser";
    public void append(String a){
        s += a;
    }
    public void dilute(){
        append(" dilute()");
    }
    public void apply(){
        append(" apply()");
    }
    public void scrub(){
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
