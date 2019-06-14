package Thinking_in_Java.Chapter_17;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Random;

public class Ex11 implements Comparable<Ex11> {
    Integer a;

    public Ex11() {
        Random r = new Random();
        a = r.nextInt(100);
    }

    @Override
    public String toString() {
        return "Ex11{" + "a=" + a + '}';
    }


    @Override
    public int compareTo(Ex11 o) {
        return a < o.a ? -1 : (Objects.equals(a, o.a) ? 0 : 1);
    }
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();

        for (int i = 0 ; i < 10; i++) {
            p.add(new Ex11());
            System.out.println(p);
        }

        System.out.println();

        for (int i = 0 ; i < 10; i++) {

            System.out.println(p.poll());
        }

    }
}
