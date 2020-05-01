package Thinking_in_Java.Chapter_21;

import net.mindview.util.Generator;

public class Ex2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new Fibonacci(18));
            t.start();
        }    }
}

class Fibonacci implements Generator<Integer>,Runnable {
    private int count = 0;
    public Integer next() { return fib(count++); }
    private int fib(int n) {
        if(n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }
    private int count2 = 0;
    public Fibonacci(int count) {
        this.count2 = count;
    }
    //    public static void main(String[] args) {
//        Fibonacci gen = new Fibonacci();
//        for(int i = 0; i < 18; i++)
//            System.out.print(gen.next() + " ");
//    }

    @Override
    public void run() {
        for(int i = 0; i < count2; i++) {
            System.out.print(next() + " ");
            Thread.yield();
        }
    }
}
//
//class IterableFibonacci implements Iterable<Integer> {
//
//    private Fibonacci fibonacci = new Fibonacci();
//
//    private int n;
//    public IterableFibonacci(int count) { n = count; }
//    public Iterator<Integer> iterator() {
//        return new Iterator<Integer>() {
//            public boolean hasNext() { return n > 0; }
//            public Integer next() {
//                n--;
//                return fibonacci.next();
//            }
//            public void remove() { // Not implemented
//                throw new UnsupportedOperationException();
//            }
//        };
//    }
//
//    public static void main(String[] args) {
//        for(int i : new IterableFibonacci(18))
//            System.out.print(i + " ");
//    }
//}