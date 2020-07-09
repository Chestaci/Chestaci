package Thinking_in_Java.Chapter_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static net.mindview.util.Print.print;

public class Ex15 implements Runnable{
    Abc abc = new Abc();
    public void a(){
        synchronized (this){
            abc.acl();
        }
        System.out.println(abc.toString());
    }
    public void b(){
        synchronized (this){
            abc.bcl();
        }
        System.out.println(abc.toString());
    }
    public void c(){
        synchronized (this){
            abc.ccl();
        }
        System.out.println(abc.toString());
    }

    public static void main(String[] args) {
        ExecutorService exex = Executors.newCachedThreadPool();
        for(int i = 0; i < 3; i++){
            exex.execute(new Ex15());
        }
    }

    @Override
    public void run() {
        a();
        Thread.yield();
        b();
        Thread.yield();
        c();
        Thread.yield();
    }
}

class Abc{
    int acl = 0;
    int bcl = 0;
    int ccl = 0;
    public void acl(){
        acl++;
        System.out.println("acl="+acl);
    }
    public  void bcl(){
        bcl++;
        System.out.println("bcl="+bcl);
    }
    public void ccl(){
        ccl++;
        System.out.println("ccl="+ccl);
    }

    @Override
    public String toString() {
        System.out.println("acl="+acl + " " + "bcl="+bcl + " " + "ccl="+ccl);
        return super.toString();
    }
}

class SingleSynch {
    public synchronized void f() {
        for(int i = 0; i < 5; i++) {
            print("f()");
            Thread.yield();
        }
    }
    public synchronized void g() {
        for(int i = 0; i < 5; i++) {
            print("g()");
            Thread.yield();
        }
    }
    public synchronized void h() {
        for(int i = 0; i < 5; i++) {
            print("h()");
            Thread.yield();
        }
    }
}
class TripleSynch {
    private Object syncObjectG = new Object();
    private Object syncObjectH = new Object();
    public synchronized void f() {
        for(int i = 0; i < 5; i++) {
            print("f()");
            Thread.yield();
        }
    }
    public void g() {
        synchronized(syncObjectG) {
            for(int i = 0; i < 5; i++) {
                print("g()");
                Thread.yield();
            }
        }
    }
    public void h() {
        synchronized(syncObjectH) {
            for(int i = 0; i < 5; i++) {
                print("h()");
                Thread.yield();
            }
        }
    }
}
class E15_SyncObject {
    public static void main(String[] args) throws Exception {
        final SingleSynch singleSync = new SingleSynch();
        final TripleSynch tripleSync = new TripleSynch();
        print("Test SingleSynch...");
        Thread t1 = new Thread() {
            public void run() {
                singleSync.f();
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                singleSync.g();
            }
        };
        t2.start();
        singleSync.h();
        t1.join(); // Wait for t1 to finish its work
        t2.join(); // Wait for t2 to finish its work
        print("Test TripleSynch...");
        new Thread() {
            public void run() {
                tripleSync.f();
            }
        }.start();
        new Thread() {
            public void run() {
                tripleSync.g();
            }
        }.start();
        tripleSync.h();
    }
}