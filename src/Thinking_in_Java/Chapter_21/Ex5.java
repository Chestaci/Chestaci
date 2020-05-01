package Thinking_in_Java.Chapter_21;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Ex5 implements Callable {
    Fibanach f = new Fibanach();
    private static int taskCount = 0;
    private final int id = taskCount++;
    private int count = 0;

    public Ex5(int count) {
        this.count = count;
        System.out.println("Starting...Fibonacci#" + id);
    }

    @Override
    public Object call() throws Exception {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += f.next();
        }
       // System.out.println("Fibonacci#" + id);
        return result;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> results = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            results.add(exec.submit(new Ex5(i)));
        }
//        for (Future<Integer> fi : results) {
//            try {
//                System.out.println(fi.get());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            } finally {
//                exec.shutdown();
//            }
//        }


        Thread.yield();
        exec.shutdown();
        for (Future<Integer> fi : results) {
            try {
                System.out.println(fi.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}