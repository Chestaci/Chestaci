package Thinking_in_Java.Chapter_18;

import net.mindview.util.TextFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String text = TextFile.read("src/Thinking_in_Java/Chapter_18/Ex21.java");
        String s;
        while ((s = bufferedReader.readLine()) != null && s.length() != 0){
            System.out.println(s.toUpperCase());

        }
    }
}
