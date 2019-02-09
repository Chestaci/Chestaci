package Thinking_in_Java.Chapter_15;

import net.mindview.util.Generator;

public class Ex14 {
}

class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type){ this.type = type; }
    public T next() {
        try {
// Assumes type is a public class:
            return type.newInstance();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    // Produce a Default generator given a type token:
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}

class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() { return id; }
    public String toString() { return "CountedObject " + id;}
}

class BasicGeneratorDemo {
    public static void main(String[] args) {
//        Generator<CountedObject> gen =
//                BasicGenerator.create(CountedObject.class);
//        for(int i = 0; i < 5; i++)
//            System.out.println(gen.next());
        Generator<CountedObject> gen =
                new BasicGenerator<>(CountedObject.class);
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());

    }
}
