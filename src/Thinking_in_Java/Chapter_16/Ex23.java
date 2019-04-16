package Thinking_in_Java.Chapter_16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ex23 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        Random random = new Random(47);
        for (int i = 0; i < integers.length; i++){
            integers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, Collections.reverseOrder());
        System.out.println(Arrays.toString(integers));
    }
}
