package Thinking_in_Java.Chapter_16;

import java.util.ArrayList;

public class Ex9 {
    public static void main(String[] args) {
        ArrayList<Peel<Banana>> peels = new ArrayList<Peel<Banana>>();
        for(int i = 0; i < 10; i++)
            peels.add(new Peel<Banana>(new Banana()));
        for(Peel<Banana> p : peels)
            System.out.println(p);

    }
}

class Peel<T>{
    T value;
    public Peel(T val) {
        value = val;
    }

    @Override
    public String toString() {
        return "Peel{" + "value=" + value + '}';
    }
}

class Banana {
    @Override
    public String toString() {
        return "Banana{}";
    }
}
