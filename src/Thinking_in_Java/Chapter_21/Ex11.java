package Thinking_in_Java.Chapter_21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex11 {
    private int i1 = 1000;
    private int i2 = 0;
    Random rand = new Random();

    boolean valid = true;

    synchronized void validation(){
        if(valid != true){
            System.out.println("Внимание! Ваши деньги пытаются украсть! Немедленно позвоните в банк!");
        }
    }

    synchronized void transfer1() {
        valid = false;
        Thread.yield();
        int i3 = rand.nextInt(1000);
        System.out.println("start " + "i1 " + i1 + " i2 " + i2 + " transfer " + i3);
        Thread.yield();
        if (i3 > i1|| i1 < 0) {
            System.out.println("Недостаточно средств");
        } else {
            i1 = i1 - i3;
            Thread.yield();
            i2 = i2 + i3;
            Thread.yield();
            System.out.println("finish " + "i1 " + i1 + " i2 " + i2 + " transfer " + i3);
        }
        valid = true;
    }
}


class BankEx11SD implements Runnable {
    private static int taskCount = 0;
    private final int id = taskCount++;
    Ex11 ex11;

    public BankEx11SD(Ex11 ex11) {
        this.ex11 = ex11;
    }

    @Override
    public void run() {
        ex11.validation();
        Thread.yield();
        ex11.transfer1();
        Thread.yield();
    }

    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int j = 0; j < 5; j++) {
            exec.execute(new BankEx11SD(ex11));
            Thread.yield();
        }
        exec.shutdown();
    }
}