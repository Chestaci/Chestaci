package Thinking_in_Java.Chapter_19;

import net.mindview.util.Generator;

import java.util.Random;

//public enum CartoonCharacter implements Generator<CartoonCharacter> {
//    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
//    private Random rand = new Random(47);
//    public CartoonCharacter next() {
//        return values()[rand.nextInt(values().length)];
//    }
//}

public enum CartoonCharacter {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private static Random rand = new Random(47);
    public static CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}
