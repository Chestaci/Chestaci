package Thinking_in_Java.Chapter_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

public class Ex19 {
}

class Count2 {
    private int count = 0;
    private Random rand = new Random(47);
    // Remove the synchronized keyword to see counting fail:
    public synchronized int increment() {
        int temp = count;
        if(rand.nextBoolean()) // Yield half the time
            Thread.yield();
        return (count = ++temp);
    }
    public synchronized int value() { return count; }
}
class Entrance2 implements Runnable {
    private static Count2 count = new Count2();
    private static List<Entrance2> entrances =
            new ArrayList<Entrance2>();
    private int number = 0;
    // Doesn’t need synchronization to read:
    private final int id;
    private static volatile boolean canceled = false;
    // Atomic operation on a volatile field:
    public static void cancel() { canceled = true; }
    public Entrance2(int id) {
        this.id = id;
// Keep this task in a list. Also prevents
// garbage collection of dead tasks:
        entrances.add(this);
    }
    public void run() {
        while(!canceled) {
            synchronized(this) {
                ++number;
            }
            print(this + " Total: " + count.increment());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch(InterruptedException e) {
                print("sleep interrupted");
                //////////////////////////////////
                print("Stopping " + this);
                return;
                //////////////////////////////////
            }
        }
        print("Stopping " + this);
    }
    public synchronized int getValue() { return number; }
    public String toString() {
        return "Entrance2 " + id + ": " + getValue();
    }
    public static int getTotalCount() {
        return count.value();
    }
    public static int sumEntrances() {
        int sum = 0;
        for(Entrance2 entrance : entrances)
            sum += entrance.getValue();
        return sum;
    }
}

class OrnamentalGarden2 {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++)
            exec.execute(new Entrance2(i));
// Run for a while, then stop and collect the data:
        TimeUnit.SECONDS.sleep(3);
        //////////////////////////////
//        for(int i = 0; i < 5; i++)
//        Thread t = new Thread(new Entrance2(i));
//        t.start();
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            System.out.println("Sleep interrupted in main()" + "№1");
//        }
//        t.interrupt();
//
        /////////////////////////////
//        Entrance2.cancel();
//        exec.shutdown();
        exec.shutdownNow();
        if(!exec.awaitTermination(250, TimeUnit.MILLISECONDS))
            print("Some tasks were not terminated!");
        print("Total: " + Entrance2.getTotalCount());
        print("Sum of Entrances: " + Entrance2.sumEntrances());
    }
}


