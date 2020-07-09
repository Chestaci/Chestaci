package Thinking_in_Java.Chapter_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

public class Ex17 {
}

//class Accessor implements Runnable {
//    private final int id;
//    public Accessor(int idn) { id = idn; }
//    public void run() {
//        while(!Thread.currentThread().isInterrupted()) {
//            ThreadLocalVariableHolder.increment();
//            System.out.println(this);
//            Thread.yield();
//        }
//    }
//    public String toString() {
//        return "#" + id + ": " +
//                ThreadLocalVariableHolder.get();
//    }
//}
//
//class ThreadLocalVariableHolder {
//    private static ThreadLocal<Integer> value =
//            new ThreadLocal<Integer>() {
//                private Random rand = new Random(47);
//                protected synchronized Integer initialValue() {
//                    return rand.nextInt(10000);
//                }
//            };
//    public static void increment() {
//        value.set(value.get() + 1);
//    }
//    public static int get() { return value.get(); }
//    public static void main(String[] args) throws Exception {
//        ExecutorService exec = Executors.newCachedThreadPool();
//        for(int i = 0; i < 5; i++)
//            exec.execute(new Accessor(i));
//        TimeUnit.SECONDS.sleep(3); // Run for a while
//        exec.shutdownNow(); // All Accessors will quit
//    }
//}

class Count {
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

class Sensor implements Runnable {
    private static Count count = new Count();
    private static List<Sensor> sensors =
            new ArrayList<Sensor>();
    private int number = 0;
    // Doesn’t need synchronization to read:
    private final int id;
    private static volatile boolean canceled = false;
    // Atomic operation on a volatile field:
    public static void cancel() { canceled = true; }
    public Sensor(int id) {
        this.id = id;
// Keep this task in a list. Also prevents
// garbage collection of dead tasks:
        sensors.add(this);
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
            }
        }
        print("Stopping " + this);
    }
    public synchronized int getValue() { return number; }
    public String toString() {
        return "Entrance " + id + ": " + getValue();
    }
    public static int getTotalCount() {
        return count.value();
    }
    public static int sumEntrances() {
        int sum = 0;
        for(Sensor sensor : sensors)
            sum += sensor.getValue();
        return sum;
    }
}

class OrnamentalGarden {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++)
            exec.execute(new Sensor(i));
// Run for a while, then stop and collect the data:
        TimeUnit.SECONDS.sleep(3);
        Sensor.cancel();
        exec.shutdown();
        if(!exec.awaitTermination(250, TimeUnit.MILLISECONDS))
            print("Some tasks were not terminated!");
        print("Total: " + Sensor.getTotalCount());
        print("Sum of Entrances: " + Sensor.sumEntrances());
    }
}
