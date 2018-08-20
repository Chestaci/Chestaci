package Thinking_in_Java.Chapter_9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

public class Ex16 implements Readable{
    private static Random random = new Random();
    private static final char[] charpool = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public int read(CharBuffer charBuffer) throws IOException {
        return 0;
    }
}
