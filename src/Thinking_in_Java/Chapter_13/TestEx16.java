package Thinking_in_Java.Chapter_13;

import java.io.File;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEx16 {
    public static void dir(String d){
        Matcher m = Pattern.compile("\\w+\\.{1}\\w+").matcher("");
        File[] files = new File(d).listFiles();
        if(new File(d).listFiles() != null) {
            for (File f : files) {
                m.reset(f.getName());
                if (m.find()) {
                    System.out.println(f.getName());
                }else{
                    String q = d + "\\" + f.getName();
                    System.out.println(q);
//                    System.out.println(f.getName());
                    dir(q);
                                    }
            }
        }else{
            System.out.println("no such directory: " + d);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
//        TestEx16 testEx16 = new TestEx16();
//        testEx16.dir("src\\Thinking_in_Java");
        TestEx16.dir("src\\Thinking_in_Java");
    }
}
