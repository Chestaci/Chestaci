package Thinking_in_Java.Chapter_17;

import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.TreeSet;

public class Ex13 {

      public static void main(String[] args) {

          TreeSet<String> words = new TreeSet<String>(new TextFile("src/Thinking_in_Java/Chapter_17/Ex12.java", "\\W+"));

          AssociativeArray<String, Integer> as = new AssociativeArray(words.size());

          for(String word : words) {
              Integer freq = as.get(word);
              as.put(word, freq == null ? 1 : freq + 1);
          }
          System.out.println(as);


    }
}
