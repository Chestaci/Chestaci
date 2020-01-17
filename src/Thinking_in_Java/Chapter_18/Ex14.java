package Thinking_in_Java.Chapter_18;

import java.io.*;
import java.util.List;

public class Ex14 {
    static String file = "src/Thinking_in_Java/Chapter_18/Ex14.out";
    public static void main(String[] args)
            throws IOException {
        List<String> list = Ex7.fileToLL(
                "src/Thinking_in_Java/Chapter_18/Ex14.java");
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        long t1 = System.currentTimeMillis();
        for(String s : list) {
            for(int i = 0; i < 100000; i++)
                out.println(lineCount + ": " + s);
            lineCount++;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("buffered: " + (t2 - t1));
        out.close();
        out = new PrintWriter(new FileWriter(file));
        lineCount = 1;
        t1 = System.currentTimeMillis();
        for(String s : list) {
            for(int i = 0; i < 100000; i++)
                out.println(lineCount + ": " + s);
            lineCount++;
        }
        t2 = System.currentTimeMillis();
        System.out.println("unbuffered: " + (t2 - t1));
        out.close();
    }
}