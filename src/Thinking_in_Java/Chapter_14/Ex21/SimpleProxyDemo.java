package Thinking_in_Java.Chapter_14.Ex21;

import java.util.Date;

import static net.mindview.util.Print.print;

interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() {
        print("doSomething");
    }
    public void somethingElse(String arg) {
        print("somethingElse " + arg);   }
}

class SimpleProxy implements Interface {
    private Interface proxied;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    public void doSomething() {
        print("SimpleProxy doSomething");
        proxied.doSomething();
    }
    public void somethingElse(String arg) {
        print("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        long time1 = new Date().getTime();
//        long start1 = System.nanoTime(); //System.currentTimeMillis();
//
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        consumer(new RealObject());
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        long stop1 = System.nanoTime();
//        long time2 = new Date().getTime();
//        long result1 = stop1 - start1;
//        long timeResult1 = time2 - time1;
//        System.out.println(timeResult1);
//        System.out.println(String.format("%,12d",result1) + " ns" + " время выполнения первого метода");
//
//        long start2 = System.nanoTime();
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        consumer(new SimpleProxy(new RealObject()));
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        long stop2 = System.nanoTime();
//        long result2 = stop2 - start2;
//        System.out.println(String.format("%,12d",result2) + " ns" + " время выполнения второго метода");
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
