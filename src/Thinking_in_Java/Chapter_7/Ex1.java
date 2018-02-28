package Thinking_in_Java.Chapter_7;

public class Ex1 {

    public Ex1(String s) {
        System.out.println(s);
    }
}
class Ex1_1 {
    Ex1 x;
    void p() {
       x = new Ex1("Miss me?!");
    }

    public static void main(String[] args) {
        Ex1_1 y = new Ex1_1();
        y.p();
    }
}