package Thinking_in_Java.Chapter_16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ex24 {
    static Comparator<Ex19> comparator = new Comparator<Ex19>() {
        @Override
        public int compare(Ex19 ex19, Ex19 t1) {
            return Integer.compare(ex19.i, t1.i);
        }
    };
    public static void main(String[] args) {
        Ex19[] ex19s = new Ex19[10];
        Random random = new Random(47);
        for (int i = 0; i < ex19s.length; i++){
            ex19s[i] = new Ex19(random.nextInt(100));
        }
        System.out.println(Arrays.toString(ex19s));
        Arrays.sort(ex19s, comparator);
        System.out.println(Arrays.toString(ex19s));
        int index = Arrays.binarySearch(ex19s, ex19s[5], comparator);
        System.out.println(index + " " + ex19s[index]);
    }
}
