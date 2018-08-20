package Thinking_in_Java.Chapter_10;

public class Ex13 {
    public Ex13(int i, String s) {
        System.out.println(i + " " + s);
    }
}
class Ex13_1 {
    public Ex13 ex13(int i, String s) {
        return new Ex13(i, s) {
        };
    }

    public static void main(String[] args) {
        Ex13_1 a = new Ex13_1();
        Ex13 b = a.ex13(11, "Hi!");
    }
}