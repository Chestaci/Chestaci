package Thinking_in_Java.Chapter_15;

import Chestaci.Robot.Robot;
import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Cat;
import Thinking_in_Java.Chapter_14.Ex12.coffee.Latte;

public class Ex9 {
}

class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public <R, T, S> void rts(R r, T t, S s) {
        f(r);
        f(t);
        f(s);
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);

        System.out.println();

        gm.rts(new Cat("Помидорка"), new Robot("Robot_42"), new Latte());
    }
}
