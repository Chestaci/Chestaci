package Thinking_in_Java.Chapter_15;

import Chestaci.Robot.Robot;
import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Cat;

public class Ex10 {
}

class GenericMethods2 {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public <R,S> void rts(R r, Integer t, S s) {
        f(r);
        f(t);
        f(s);
    }

    public static void main(String[] args) {
        GenericMethods2 gm = new GenericMethods2();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);

        System.out.println();

        gm.rts(new Cat("Помидорка"), 1 , new Robot("Robot_42"));
    }
}