package Thinking_in_Java.Chapter_4;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random rand = new Random(11);
        int[] r = new int[25];
        for (int i = 0; i < 25; i++) {
            r[i] = rand.nextInt(10);
//            System.out.println(rand.nextInt());
            System.out.println(r[i]);
            if(i > 0) {
                test(r[i], r[i - 1]);
            }else{
                test(r[i], 0);
            }
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
