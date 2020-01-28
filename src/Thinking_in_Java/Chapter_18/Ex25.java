package Thinking_in_Java.Chapter_18;

import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

import static net.mindview.util.Print.print;

public class Ex25 {
}

//class UsingBuffers {
//    private static void symmetricScramble(CharBuffer buffer){
//        while(buffer.hasRemaining()) {
//            buffer.mark();
//            char c1 = buffer.get();
//            char c2 = buffer.get();
//            buffer.reset();
//            buffer.put(c2).put(c1);
//        }
//    }
//    public static void main(String[] args) {
//        char[] data = "UsingBuffers".toCharArray();
//      //  ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
//        ByteBuffer bb = ByteBuffer.allocateDirect(data.length * 2);
//        CharBuffer cb = bb.asCharBuffer();
//        cb.put(data);
//        print(cb.rewind());
//        symmetricScramble(cb);
//        print(cb.rewind());
//        symmetricScramble(cb);
//        print(cb.rewind());
//    }
//}

abstract class CompareAllocations {
    private String name;
    protected ByteBuffer buffer;
    private int size;
    public CompareAllocations(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public void runComparison() {
        System.out.println("Program Name: <" + name + ">");
        try {
            long startTime = System.nanoTime();
            directAllocate();
            long endTime = System.nanoTime();
            System.out.println(
                    "Direct Allocation Cost for buffer of size: <"
                            + size + "> is <" + (endTime - startTime) + ">");
            startTime = System.nanoTime();
            execute();
            endTime = System.nanoTime();
            System.out.println(
                    "Execution cost using direct buffer: <"
                            + (endTime - startTime) + ">");
            startTime = System.nanoTime();
            indirectAllocate();
            endTime = System.nanoTime();
            System.out.println(
                    "Indirect Allocation Cost for buffer of size: <"
                            + size + "> is <" + (endTime - startTime) + ">");
            startTime = System.nanoTime();
            execute();
            endTime = System.nanoTime();
            System.out.println(
                    "Execution cost using indirect buffer: <"
                            + (endTime - startTime) + ">");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void directAllocate() {
        buffer = ByteBuffer.allocateDirect(size);
    }
    public abstract void execute() throws IOException;
    public void indirectAllocate() {
        buffer = ByteBuffer.allocate(size);
    }
}
