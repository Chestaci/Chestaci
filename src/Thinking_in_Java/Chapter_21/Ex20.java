package Thinking_in_Java.Chapter_21;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex20 {
}

class CachedThreadPool2 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++)
            exec.execute(new LiftOff2());
//        exec.shutdown();
        Thread.yield();
        exec.shutdownNow();
    }
}

class LiftOff2 implements Runnable {
    protected int countDown = 5000; // Default
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff2() {}
    public LiftOff2(int countDown) {
        this.countDown = countDown;
    }
    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff2!") + "), ";
    }
    public void run() {
//        try {
//            while (countDown-- > 0) {
//                System.out.print(status());
//                Thread.yield();
//            }
//        }finally {
//            System.out.println("Ya vipolnilas!");
//        }
        while (countDown-- > 0) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted: #" + id);
                return;
            }
            System.out.print(status());
            Thread.yield();
        }
    }
}
