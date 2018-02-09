package Thinking_in_Java.Chapter_3;

public class Ex12 {
    public static void main(String[] args) {
        int i = 0b1111111;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        i <<= 2;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        for (int t = 0; t < 9; t++) {
            i >>>= 1;
            System.out.println(i);
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
