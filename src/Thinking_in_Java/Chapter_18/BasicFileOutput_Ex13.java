package Thinking_in_Java.Chapter_18;

import net.mindview.util.BufferedInputFile;

import java.io.*;

public class BasicFileOutput_Ex13 {
    static String file = "src/Thinking_in_Java/Chapter_18/BasicFileOutput_Ex13.out";
    public static void main(String[] args)
            throws IOException {

        LineNumberReader in =
                new LineNumberReader(
                        new FileReader("src/Thinking_in_Java/Chapter_18/BasicFileOutput_Ex13.java"));
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file)));
        String s;
        while((s = in.readLine()) != null )
            out.println(in.getLineNumber() + ": " + s);
        out.close();

        System.out.println(BufferedInputFile.read(file));
    }
}