package Thinking_in_Java.Chapter_4;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Random rand2 = new Random();
        while(true) {
            int r1 = rand.nextInt(10);
            int r2 = rand2.nextInt(10);
            System.out.println("r1 = " + r1 + " " + "r2 = " + r2);
            test(r1, r2);
        }
    }

    static void test(int z, int x) {
        if (z > x) {
            System.out.println(z + " > " + x);
        } else if (z < x) {
            System.out.println(z + " < " + x);
        } else {
            System.out.println(z + " = " + x);
        }
    }
}
