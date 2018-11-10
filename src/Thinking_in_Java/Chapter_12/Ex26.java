package Thinking_in_Java.Chapter_12;

import java.io.FileInputStream;

public class Ex26 {

    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("null.java");
        file.close();
    }
}
