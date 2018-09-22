package Thinking_in_Java.Chapter_11;

import java.util.PriorityQueue;

public class Ex29{
    public static void main(String[] args) {
        PriorityQueue<PrimitiveClass> priorityQueue = new PriorityQueue<>();
        for (int i= 0; i < 10; i++){
        priorityQueue.offer(new PrimitiveClass());
        }
        for (int i= 0; i < 10; i++){
            System.out.println(priorityQueue.poll());
        }


    }
}

class PrimitiveClass extends Object/* implements Comparable*/{

//    @Override
//    public int compareTo(Object o) {
//        return 1;
//    }
}