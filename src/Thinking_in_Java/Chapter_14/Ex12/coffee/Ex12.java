package Thinking_in_Java.Chapter_14.Ex12.coffee;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.TypeCounter;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class Ex12 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        for(Coffee coffee : new CoffeeGenerator(20)){
            printnb(coffee.getClass().getSimpleName() + " ");
            counter.count(coffee);
        }
        print();
        print(counter);
    }
}
