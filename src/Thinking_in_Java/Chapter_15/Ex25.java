package Thinking_in_Java.Chapter_15;

public class Ex25 {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.a(new Pen2());
        pen.p(new Pen2());
    }
}

interface Pineapple{
}

interface Apple{
}

class Pen implements Pineapple, Apple{
    public <P extends Pineapple> void p(P pineapple){
        System.out.println("p");
    }

    public <A extends Apple> void a(A apple){
        System.out.println("a");
    }

}

class Pen2 implements Pineapple,Apple{

}