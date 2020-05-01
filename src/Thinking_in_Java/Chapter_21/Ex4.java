package Thinking_in_Java.Chapter_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex4 {
    public static void main(String[] args) {
//        ExecutorService exec = Executors.newCachedThreadPool();
//        for (int i = 0; i < 5; i++) {
//            exec.execute(new Fibonacci(5));
//
//        }
//        exec.shutdown();
//        System.out.println();

//       ExecutorService exec1 = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 5; i++) {
//            exec1.execute(new Fibonacci(5));
//
//        }
//        exec1.shutdown();

//        System.out.println();
//
//        ExecutorService exec2 = Executors.newSingleThreadExecutor();
//        for (int i = 0; i < 5; i++) {
//            exec2.execute(new Fibonacci(5));
//
//        }
//        exec2.shutdown();


        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Fibonacci(5));
        }
        Thread.yield();
        exec.shutdown();
        System.out.println("////////////////");

       exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exec.execute(new Fibonacci(5));
        }
        Thread.yield();
        exec.shutdown();

        System.out.println("////////////////");

        exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Fibonacci(5));
        }
        Thread.yield();
        exec.shutdown();



    }
}
