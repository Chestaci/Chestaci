package Thinking_in_Java.Chapter_4;

public class test {
    public static void main(String[] args) {
        int i = 2187;
        int a = i / 1000;
        int b = (i % 1000) / 100;
        int c = ((i % 1000) % 100) / 10;
        int d = ((i % 1000) % 100) % 10;
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
