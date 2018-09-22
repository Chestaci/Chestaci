package Thinking_in_Java.Chapter_11;

import java.util.PriorityQueue;
import java.util.Random;

public class Ex28 {
    public static void main(String[] args) {

        PriorityQueue<Double> pq = new PriorityQueue<>();
        Random rand = new Random(47);
        for (double i = 0; i < 10; i++) {
            pq.offer(rand.nextDouble());
        }
        for (double i = 0; i < 10; i++) {
            System.out.println(pq.poll());
        }

    }

}
