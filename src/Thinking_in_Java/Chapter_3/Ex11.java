package Thinking_in_Java.Chapter_3;

public class Ex11 {
    public static void main(String[] args) {
        int i = 0xFFFFFFFB;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        for (int t = 0; t < 3; t++) {
            i >>= 1;
            System.out.println(i);
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
