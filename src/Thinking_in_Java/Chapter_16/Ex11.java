package Thinking_in_Java.Chapter_16;

import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        for (int i = 0; i < 5; i++){
            integers[i] = i;
        }
        System.out.println(Arrays.deepToString(integers));
        int[] ints = new int[5];
        //ints = integers;
        for (int i = 0; i < 5; i++){
            ints[i] = integers[i];
        }
        for (int i = 0; i < 5; i++){
            System.out.print(ints[i]);
        }
        //integers = ints;
        System.out.println();
        for (int i = 0; i < 5; i++){
            integers[i] = ints[i];
        }
        System.out.println(Arrays.deepToString(integers));


//        int[] pa = { 1, 2, 3, 4, 5 };
//        Integer[] wa = pa;
//        Integer[] wb = { 1, 2, 3, 4, 5 };
//        int[] pb = wb;
    }
}
