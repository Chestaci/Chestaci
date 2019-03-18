package Thinking_in_Java.Chapter_15;


import java.util.ArrayList;
import java.util.EmptyStackException;

public class Ex33 {
}

class FullStackException extends RuntimeException{}

class FixedSizeStack2<T> {
    private int index = 0;
    private final int size;
    private ArrayList<T> storage;
    public FixedSizeStack2(int size) {
        storage = new ArrayList<T>(size);
        this.size = size;
    }
    public void push(T item) {
        if(index < size){
            storage.add(item);
            index++;
        }else {
         throw new FullStackException();
        }
    }
    @SuppressWarnings("unchecked")
    public T pop() {
        if (index > 0) {
            return (T) storage.remove(--index);
        }else {
            throw new EmptyStackException();
        }
    }
}
class GenericCast2 {
    public static final int SIZE = 10;
    public static void main(String[] args) {
        FixedSizeStack2<String> strings =
                new FixedSizeStack2<String>(SIZE);
        for(String s : "A B C D E F G H I J".split(" "))
            strings.push(s);
        for(int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }

        System.out.println();
        try {
            strings.pop();
        } catch(EmptyStackException e) {
            System.out.println("Stack is empty");
        }
        strings = new FixedSizeStack2<String>(1);
        strings.push("A");
        try {
            strings.push("B");
        } catch(FullStackException e) {
            System.out.println("Stack is full");
        }
//        FixedSizeStack2<String> strings2 =
//                new FixedSizeStack2<String>(1);
//        strings2.push("A");
//        strings2.pop();
//        strings.pop();
    }
}
