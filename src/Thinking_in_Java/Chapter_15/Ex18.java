package Thinking_in_Java.Chapter_15;

import net.mindview.util.*;

import java.util.*;

public class Ex18 {
}

class LittleFish {
    private static long counter = 1;
    private final long id = counter++;
    private LittleFish() {}
    public String toString() { return "LittleFish " + id; }
    // A method to produce Generator objects:
    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            public LittleFish next() { return new LittleFish(); }
        };
    }
}
class BigFish {
    private static long counter = 1;
    private final long id = counter++;
    private BigFish() {}
    public String toString() { return "BigFish " + id; }
    // A single Generator object:
    public static Generator<BigFish> generator =
            new Generator<BigFish>() {
                public BigFish next() { return new BigFish(); }
            };
}
class Ocean {
    public static void eat(BigFish t, LittleFish c) {
        System.out.println(t + " eat " + c);
    }
    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<LittleFish> line = new LinkedList<LittleFish>();
        Generators.fill(line, LittleFish.generator(), 15);
        List<BigFish> tellers = new ArrayList<BigFish>();
        Generators.fill(tellers, BigFish.generator, 4);
        for(LittleFish c : line)
            eat(tellers.get(rand.nextInt(tellers.size())), c);
    }
}
