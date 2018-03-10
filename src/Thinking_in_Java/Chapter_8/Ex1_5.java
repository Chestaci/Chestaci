package Thinking_in_Java.Chapter_8;

public class Ex1_5 {
    public static void ride(Cycle cycle){
        System.out.println("GOOO! RIDE!!!!");
        System.out.println(cycle.wheels());
    }

    public static void main(String[] args) {
        Cycle c = new Cycle(0);
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(c);
        ride(u);
        ride(b);
        ride(t);
    }
}

class Cycle {
    private int wheels;

    public Cycle(int wheels) {
        this.wheels = wheels;
    }

    public int wheels(){
        return wheels;
    }
}
class Unicycle extends Cycle {
    public Unicycle() {
        super(1);
    }
}
class Bicycle extends Cycle{
    public Bicycle() {
        super(2);
    }
}
class Tricycle extends Cycle{
    public Tricycle() {
        super(3);
    }
}
