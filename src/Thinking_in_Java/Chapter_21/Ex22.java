package Thinking_in_Java.Chapter_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex22 {
//    public static void main(String[] args) throws Exception{
//        A1 a = new A1();
//        ExecutorService exec = Executors.newCachedThreadPool();
//        exec.execute(a);
//        Thread.yield();
//        exec.shutdownNow();
//    }
}
//
//class A1 implements Runnable{
//    public A1() {
//        System.out.println("Constr A");
//    }
//
//    private boolean aaa = false;
//
//    @Override
//    public void run() {
//        System.out.println("Готовимся к ожиданию...");
//        synchronized (this) {
//            try {
//                while ()
//            } catch (InterruptedException e) {
//                System.out.println("Выход из A");
//            }
//            System.out.println("A after try");
//        }
//    }
//}


class E22_BusyWait {
    private static volatile boolean flag;
    private static int spins;
    public static void main(String[] args) throws Exception {
        Runnable r1 = new Runnable() {
            public void run() {
                for(;;) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(10);
                    } catch (InterruptedException e) { return; }
                    flag = true;
                }
            }
        };
        Runnable r2 = new Runnable() {
            public void run() {
                for(;;) {
// The busy-wait loop
                    while(!flag &&
                            !Thread.currentThread().isInterrupted())
                        spins++;
                    System.out.println("Spun " + spins + " times");
                    spins = 0;
                    flag = false;
                    if(Thread.interrupted())
                        return;
                }
            }
        };
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(r1);
        exec.execute(r2);
        TimeUnit.SECONDS.sleep(1);
        exec.shutdownNow();
    }
}

class E22_WaitNotify {
    public static void main(String[] args) throws Exception {
        final Runnable r1 = new Runnable() {
            public void run() {
                for(;;) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                        synchronized(this) { notify(); }
                    } catch(InterruptedException e) { return; }
                }
            }
        };
        Runnable r2 = new Runnable() {
            public void run() {
                for(;;) {
                    try {
                        synchronized(r1) { r1.wait(); }
                    } catch(InterruptedException e) { return; }
                    System.out.print("Cycled ");
                }
            }
        };
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(r1);
        exec.execute(r2);
        TimeUnit.SECONDS.sleep(1);
        exec.shutdownNow();
    }
}