package Thinking_in_Java.Chapter_21.Ex_10;

import Thinking_in_Java.Chapter_21.Ex5;
import Thinking_in_Java.Chapter_21.Fibanach;

import java.util.ArrayList;
import java.util.concurrent.*;

import static net.mindview.util.Print.print;

public class Ex10{
    public static void main(String[] args) {
        try {
            System.out.println(new ThreadMethod("ThreadMethod").runTask(5).get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class ThreadMethod implements Callable {
    private String name;
    Fibanach f = new Fibanach();
    private static int taskCount = 0;
    private final int id = taskCount++;
    private int count = 0;

    public ThreadMethod(String name) {
        this.name = name;
        System.out.println("Starting...Fibonacci#" + id);
    }

    public Future<Integer> runTask(int count) {
        ExecutorService exec = Executors.newCachedThreadPool();
        this.count = count;
        Future<Integer> resultsFuture = exec.submit(this);
        exec.shutdown();
        return resultsFuture;
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

}
