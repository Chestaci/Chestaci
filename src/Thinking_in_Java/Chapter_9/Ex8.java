package Thinking_in_Java.Chapter_9;

public class Ex8 {
    public static void main(String[] args) {
        Sandwich0.main(args);
    }
}
interface FastFood{
    void expired();
}

class Meal0{
    Meal0(){
        System.out.println("Meal0()");
    }
}

class Bread0{
    Bread0(){
        System.out.println("Bread0()");
    }
}

class Cheese0{
    Cheese0(){
        System.out.println("Cheese0()");
    }
}

class Lettuce0{
    Lettuce0(){
        System.out.println("Lettuce0()");
    }
}

class Pickle0{
    Pickle0(){
        System.out.println("Pickle0()");
    }
}

class Lunch0 extends Meal0{
    Lunch0(){
        System.out.println("Lunch0()");
    }
}

class PortableLunch0 extends Lunch0{
    PortableLunch0(){
        System.out.println("PortableLunch0()");
    }
}

class Sandwich0 extends PortableLunch0 implements FastFood{
    private Bread0 b = new Bread0();
    private Cheese0 c = new Cheese0();
    private Lettuce0 l = new Lettuce0();
    private Pickle0 p = new Pickle0();
    public Sandwich0(){
        System.out.println("Sandwich0()");
    }

    public static void main(String[] args) {
        Sandwich0 sandwich0 = new Sandwich0();
        sandwich0.expired();
    }

    @Override
    public void expired() {
        System.out.println("Ешь быстрее! Пока Sandwich0() не испортился!!!");
    }
}