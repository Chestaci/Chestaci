package Thinking_in_Java.Chapter_14.Ex12.coffee;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return getClass().getSimpleName() + " " + id;
    }


    static List<Factory<? extends Coffee>> coffeeFactories = new ArrayList<>();
    static {
        coffeeFactories.add(new Americano.Factory());
        coffeeFactories.add(new Breve.Factory());
        coffeeFactories.add(new Cappuccino.Factory());
        coffeeFactories.add(new Latte.Factory());
        coffeeFactories.add(new Mocha.Factory());
    }
    private static Random rand = new Random(47);
    public static Coffee createRandom() {
        int n = rand.nextInt(coffeeFactories.size());
        return coffeeFactories.get(n).create();
    }
}
