package Thinking_in_Java.Chapter_18;

import net.mindview.util.TextFile;
import java.util.*;

public class Ex17 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        TextFile textFile = new TextFile("src/Thinking_in_Java/Chapter_18/Ex17.java","\\W+");
        for (String word: textFile) {
            for (Character ch: word.toCharArray()) {
                Integer freq = map.get(ch);
                map.put(ch,freq == null ? 1 : freq + 1);
            }
        }
        System.out.println(map);
    }
}
