package Thinking_in_Java.Chapter_9.GregGordon;

import java.nio.*;
import java.util.*;

public class AdaptedRandomChars16
        extends RandomChars
        implements Readable {
    private int count;
    public AdaptedRandomChars16(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if(count-- == 0) return -1;
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars16(10));
        while(s.hasNext())
            System.out.print(s.next() + " ");
    }
}

/*папка GregGordon*/