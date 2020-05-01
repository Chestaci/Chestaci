package Thinking_in_Java.Chapter_21;

public class Ex1 implements Runnable {
    private static int taskCount = 0;
    private final int id = taskCount++;

    public Ex1() {
        System.out.println("Starting..." + id);
    }

    @Override
    public void run() {
        System.out.println("Hi1"+ id);
        Thread.yield();
        System.out.println("Hi2"+ id);
        Thread.yield();
        System.out.println("Hi3"+ id);
        Thread.yield();
        System.out.println("End"+ id);
       }

    public static void main(String[] args) {
       for (int i = 0; i < 5; i++) {
           Thread t = new Thread(new Ex1());
           t.start();
       }
    }
}
