package Thinking_in_Java.Chapter_15;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

public class Ex8 {
}

class StoryCharacters {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class GoodGuys extends StoryCharacters {}
class BadGuys extends StoryCharacters {}

class NekoSensey extends GoodGuys{}
class Flash extends GoodGuys{}
class SpiderMan extends GoodGuys{}

class DeadPool extends BadGuys{}
class HarleyQueen extends BadGuys{}
class Joker extends BadGuys{}

class StoryCharactersGenerator
        implements Generator<StoryCharacters>, Iterable<StoryCharacters> {
    private Class[] types = { NekoSensey.class, Flash.class,
            SpiderMan.class, DeadPool.class, HarleyQueen.class, Joker.class };
    private static Random rand = new Random(47);
    public StoryCharactersGenerator() {}
    // For iteration:
    private int size = 0;
    public StoryCharactersGenerator(int sz) { size = sz; }
    public StoryCharacters next() {
        try {
            return (StoryCharacters)
                    types[rand.nextInt(types.length)].newInstance();
// Report programmer errors at run time:
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    class StoryCharactersIterator implements Iterator<StoryCharacters> {
        int count = size;
        public boolean hasNext() { return count > 0; }
        public StoryCharacters next() {
            count--;
            return StoryCharactersGenerator.this.next();
        }
        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    };
    public Iterator<StoryCharacters> iterator() {
        return new StoryCharactersIterator();
    }
    public static void main(String[] args) {
        StoryCharactersGenerator gen = new StoryCharactersGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for(StoryCharacters c : new StoryCharactersGenerator(5))
            System.out.println(c);
    }
}