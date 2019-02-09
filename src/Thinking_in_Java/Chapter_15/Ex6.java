package Thinking_in_Java.Chapter_15;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Cat;

import java.util.*;

public class Ex6 {
}

class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item) { storage.add(item); }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }
    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for(String s: ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);
        for(int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();
        RandomList<Integer> rs2 = new RandomList<>();
        for(int i = 0; i < 11; i++){
            rs2.add(i);
        }
        for(int i = 0; i < 11; i++)
            System.out.print(rs2.select() + " ");

        System.out.println();

        RandomList<Cat> rs3 = new RandomList<>();
        for(String s: ("Барсик Мурзик Патиссон Васька " +
                "Виноград Котлета Буся").split(" "))
            rs3.add(new Cat(s));
        for(int i = 0; i < 11; i++)
            System.out.print(rs3.select() + " ");

    }
}
