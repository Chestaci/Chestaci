package Thinking_in_Java.Chapter_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex21 {
    public static void main(String[] args) throws Exception{
        A a = new A();
        B b = new B(a);
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(a);
        exec.execute(b);
        Thread.yield();
       exec.shutdownNow();
    }
}

class A implements Runnable{
    public A() {
        System.out.println("Constr A");
    }

    @Override
    public void run() {
        System.out.println("Готовимся к ожиданию...");
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Выход из A");
            }
            System.out.println("A after try");
        }
    }
}

class B implements Runnable{

    A a;

    public B(A a) {
        this.a = a;
        System.out.println("Constr B");
    }

    @Override
    public void run() {
        System.out.println("Готовимся к паузе...");
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
                    } catch (InterruptedException e) {
            System.out.println("Выход из B");
        }
        System.out.println("B after try");
        synchronized (a) {
            a.notifyAll();
        }
    }
}