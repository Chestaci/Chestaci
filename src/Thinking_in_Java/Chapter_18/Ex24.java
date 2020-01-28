package Thinking_in_Java.Chapter_18;

import java.nio.*;

public class Ex24 {
}

class IntBufferDemo {
    private static final int BSIZE = 1024;
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        IntBuffer ib = bb.asIntBuffer();
// Store an array of int:
        ib.put(new int[]{ 11, 42, 47, 99, 143, 811, 1016 });
// Absolute location read and write:
        System.out.println(ib.get(3));
        ib.put(3, 1811);
// Setting a new limit before rewinding the buffer.
        ib.flip();
        while(ib.hasRemaining()) {
            int i = ib.get();
            System.out.println(i);
        }
    }
}

class DoubleBufferDemo {
    private static final int BSIZE = 1024;
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        DoubleBuffer ib = bb.asDoubleBuffer();
// Store an array of int:
        ib.put(new double[]{ 11.0, 42.1, 47.3, 99.7, 143.9, 811.5, 1016.3 });
// Absolute location read and write:
        System.out.println(ib.get(3));
        ib.put(3, 1811);
// Setting a new limit before rewinding the buffer.
        ib.flip();
        while(ib.hasRemaining()) {
           double i = ib.get();
            System.out.println(i);
        }
    }
}