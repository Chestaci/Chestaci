package Thinking_in_Java.Chapter_21;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex6 implements Runnable {

    Random rand = new Random();
    final int time = rand.nextInt(10) + 1;


    @Override
    public void run() {
        try {

            TimeUnit.SECONDS.sleep(time);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(time);
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Ex6());

        }
        Thread.yield();
        exec.shutdown();
    }
}
