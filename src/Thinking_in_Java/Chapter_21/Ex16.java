package Thinking_in_Java.Chapter_21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static net.mindview.util.Print.print;

public class Ex16 {
}

class SingleSynch2 {
    private Lock lock = new ReentrantLock();

    public void f() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                print("f()");
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }
    }

    public void g() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                print("g()");
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }
    }

    public void h() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                print("h()");
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }
    }
}

class TripleSynch2 {
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    private Lock lock3 = new ReentrantLock();

    public synchronized void f() {
        lock1.lock();
        try {
            for (int i = 0; i < 5; i++) {
                print("f()");
                Thread.yield();
            }
        } finally {
            lock1.unlock();
        }
    }

    public void g() {
        lock2.lock();
        try {


            for (int i = 0; i < 5; i++) {
                print("g()");
                Thread.yield();
            }
        } finally {
            lock2.unlock();
        }
    }

    public void h() {
        lock3.lock();
        try {


            for (int i = 0; i < 5; i++) {
                print("h()");
                Thread.yield();
            }
        } finally {
            lock3.unlock();
        }
    }

}

class E15_SyncObject2 {
    public static void main(String[] args) throws Exception {
        final SingleSynch2 singleSync2 = new SingleSynch2();
        final TripleSynch2 tripleSync2 = new TripleSynch2();
        print("Test SingleSynch2...");
        Thread t1 = new Thread() {
            public void run() {
                singleSync2.f();
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                singleSync2.g();
            }
        };
        t2.start();
        singleSync2.h();
        t1.join(); // Wait for t1 to finish its work
        t2.join(); // Wait for t2 to finish its work
        print("Test TripleSynch2...");
        new Thread() {
            public void run() {
                tripleSync2.f();
            }
        }.start();
        new Thread() {
            public void run() {
                tripleSync2.g();
            }
        }.start();
        tripleSync2.h();
    }
}