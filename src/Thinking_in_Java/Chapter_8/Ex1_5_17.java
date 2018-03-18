package Thinking_in_Java.Chapter_8;

public class Ex1_5_17 {
    public static void ride(Cycle cycle){
        System.out.println("GOOO!!! RIDE!!!");
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
        System.out.println();
        System.out.println("#######################################################################");
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        //((Tricycle)cycles[2]).balance();

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
    public void balance(){
        System.out.println("balance() unicycle");
    }
}
class Bicycle extends Cycle{
    public Bicycle() {
        super(2);
    }
    public void balance(){
        System.out.println("balance() bicycle");
    }
}
class Tricycle extends Cycle{
    public Tricycle() {
        super(3);
    }
}
