package Thinking_in_Java.Chapter_17;

import net.mindview.util.TextFile;

import java.util.Collection;
import java.util.TreeSet;

import static net.mindview.util.TextFile.*;

public class Ex4 {
    TreeSet<String> collection;

    {
        collection = new TreeSet<String>(
                new TextFile("src/Thinking_in_Java/Chapter_17/Ex1.java", "\\W+"));
    }
    public static void main(String[] args) {
//        String file = read("Thinking_in_Java.Chapter_17.Ex1.java");
//        write("test.txt", file);
//        TextFile text = new TextFile("test.txt");
//        text.write("test2.txt");
//        // Break into unique sorted list of words:
//        TreeSet<String> words = new TreeSet<String>(
//                new TextFile("TextFile.java", "\\W+"));
//        // Display the capitalized words:
//        System.out.println(words);



//        TreeSet<String> words = new TreeSet<String>(
//                new TextFile("src/Thinking_in_Java/Chapter_17/Ex1.java", "\\W+"));
//        System.out.println(words);
        Ex4 ex4 = new Ex4();
        System.out.println(ex4.collection);

    }
}
