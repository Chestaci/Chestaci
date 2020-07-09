package Thinking_in_Java.Chapter_21;

import java.util.concurrent.*;

public class Ex18 {
    public static void main(String[] args) {

//        ExecutorService exec = Executors.newSingleThreadExecutor();
//        Future<?> future = exec.submit(new Cl2());
//        try {
//            TimeUnit.MILLISECONDS.sleep(100); // start task
//        } catch(InterruptedException e) {
//            System.out.println("Sleep interrupted in main()");
//        }
//        future.cancel(true);
//        exec.shutdown();
//        System.out.println("Fin");

        Thread t = new Thread(new Cl2());
        t.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted in main()" + "№1");
        }
        t.interrupt();
        // use Executor execute:
        ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.execute(new Cl2());
        exec.shutdownNow();
        // use Executor submit:
        ExecutorService exec2 = Executors.newSingleThreadExecutor();
        Future<?> f = exec2.submit(new Cl2());
        try {
            TimeUnit.MILLISECONDS.sleep(100); // start task
        } catch(InterruptedException e) {
            System.out.println("Sleep interrupted in main()"+ "№2");
        }
        f.cancel(true);
        exec2.shutdown();


    }
}

class Cl1{
    static void m() {
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
            System.out.println(e.toString());
        }finally {
            System.out.println("Fin Cl1");
        }
    }
}

class Cl2 implements Runnable{
    @Override
    public void run() {
            Cl1.m();
    }
}