package Thinking_in_Java.Chapter_14.Ex21;

import java.lang.reflect.*;
import java.util.Date;

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
   // System.out.println("proxy: " + proxy); // error
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);
        if(args != null)
            for(Object arg : args)
                System.out.println(" " + arg);
        return method.invoke(proxied, args);
    }
}
class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        long time1 = new Date().getTime();
//        long start1 = System.nanoTime(); //System.currentTimeMillis();
//
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        consumer(real);
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        long stop1 = System.nanoTime();
//        long time2 = new Date().getTime();
//        long result1 = stop1 - start1;
//        long timeResult1 = time2 - time1;
//        System.out.println(timeResult1);
//        System.out.println(String.format("%,12d",result1) + " ns" + " время выполнения первого метода");
//
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Insert a proxy and call again:
        Interface proxy = (Interface)Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class },
                new DynamicProxyHandler(real));
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        long start2 = System.nanoTime();
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        consumer(proxy);
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        long stop2 = System.nanoTime();
//        long result2 = stop2 - start2;
//        System.out.println(String.format("%,12d",result2) + " ns" + " время выполнения второго метода");
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
