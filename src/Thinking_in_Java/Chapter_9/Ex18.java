package Thinking_in_Java.Chapter_9;

public class Ex18 {
    public static void cycleConsumer(CycleFactory factory){
        Cycle cycle = factory.getCycle();
        cycle.m1();
        cycle.m2();
    }

    public static void main(String[] args) {
        cycleConsumer(new UnicycleFactory());
        cycleConsumer(new BicycleFactory());
        cycleConsumer(new TricycleFactory());
    }
}

interface Cycle {
    void m1();
    void m2();
}

class Unicycle implements Cycle {
    public Unicycle() {
    }

    @Override
    public void m1() {
        System.out.println("m1() Unicycle");
    }

    @Override
    public void m2() {
        System.out.println("m2() Unicycle");
    }
}

class UnicycleFactory implements CycleFactory{
    public Cycle getCycle(){
     return new Unicycle();
    }
}

class Bicycle implements Cycle{
    public Bicycle() {
    }

    @Override
    public void m1() {
        System.out.println("m1() Bicycle");
    }

    @Override
    public void m2() {
        System.out.println("m2() Bicycle");
    }
}

class BicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    public Tricycle() {
    }

    @Override
    public void m1() {
        System.out.println("m1() Tricycle");
    }

    @Override
    public void m2() {
        System.out.println("m2() Tricycle");
    }
}

class TricycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Tricycle();
    }
}

interface CycleFactory{
    Cycle getCycle();
}