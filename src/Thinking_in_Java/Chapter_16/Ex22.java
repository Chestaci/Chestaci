package Thinking_in_Java.Chapter_16;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;

public class Ex22 {
    public static void main(String[] args) {
        Integer[] integers = Generated.array(new Integer[10], new RandomGenerator.Integer());
        System.out.println(Arrays.toString(integers));
        Integer i1 = integers[5];
        Integer i2 = integers[1];
        int index1 = Arrays.binarySearch(integers, i1);
        int index2 = Arrays.binarySearch(integers, i2);
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));
        int index3 = Arrays.binarySearch(integers, i1);
        int index4 = Arrays.binarySearch(integers, i2);
        System.out.println("index1" + " " + "= " + index1 + " " + i1);
        System.out.println("index2" + " " + "= " + index2 + " " + i2);
        System.out.println("index3" + " " + "= " + index3 + " " + i1);
        System.out.println("index4" + " " + "= " + index4 + " " + i2);
    }
}
