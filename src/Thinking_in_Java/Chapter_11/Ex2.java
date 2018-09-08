package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex2 {
}
class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();

        for (int i = 0; i < 10; i++)
            c.add(i);
        for (Integer i : c)
            System.out.print(i + ", ");
    }

}