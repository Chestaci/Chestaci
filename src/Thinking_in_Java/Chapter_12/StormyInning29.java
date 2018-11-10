package Thinking_in_Java.Chapter_12;

class BaseballException1 extends RuntimeException {}
//class Foul1 extends RuntimeException {}
//class Strike1 extends RuntimeException {}
class Foul1 extends BaseballException1 {}
class Strike1 extends BaseballException1 {}

abstract class Inning1 {
    public Inning1() {}
    public void event() {}
    public abstract void atBat();
    public void walk() {}
}

class StormException1 extends RuntimeException {}
//class RainedOut1 extends RuntimeException {}
//class PopFoul1 extends RuntimeException {}
class RainedOut1 extends StormException1 {}
class PopFoul1 extends Foul1 {}

interface Storm1 {
    public void event();
    public void rainHard();
}

public class StormyInning29 extends Inning1 implements Storm1 {
    public StormyInning29() {}
    public StormyInning29(String s) {}
    public void walk() {}
    public void event() {}
    public void rainHard() {}
    public void atBat() {}
    public static void main(String[] args) {
        StormyInning29 si = new StormyInning29();
        si.atBat();

        Inning1 i = new StormyInning29();
        i.atBat();
    }
}