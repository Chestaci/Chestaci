package Thinking_in_Java.Chapter_21.Ex_9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Ex9 implements ThreadFactory {
    private int priority;
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(priority);
        return t;
    }

    public Ex9(int priority) {
        this.priority = priority;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new Ex9(Thread.MAX_PRIORITY));
        for(int i = 0; i < 5; i++)
            exec.execute(
                    new SimplePriorities());
        Thread.yield();
        exec.shutdown();

        exec = Executors.newCachedThreadPool(new Ex9(Thread.MIN_PRIORITY));
        exec.execute(
                new SimplePriorities());
        Thread.yield();
        exec.shutdown();
    }
}
