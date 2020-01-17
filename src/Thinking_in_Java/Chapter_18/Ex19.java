package Thinking_in_Java.Chapter_18;

import net.mindview.util.BinaryFile;
import net.mindview.util.TextFile;

import java.io.IOException;
import java.util.HashMap;

import static net.mindview.util.BinaryFile.read;

public class Ex19 {
    public static void main(String[] args) throws IOException {
        HashMap<Byte, Integer> map = new HashMap<>();
       byte [] bytes = read("src/Thinking_in_Java/Chapter_18/Ex17.java");
        for (Byte b : bytes) {

                Integer freq = map.get(b);
                map.put(b,freq == null ? 1 : freq + 1);

        }
        System.out.println(map);
    }
}
