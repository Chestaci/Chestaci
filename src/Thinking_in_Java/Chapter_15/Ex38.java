package Thinking_in_Java.Chapter_15;

public class Ex38 {
}

class Coffee2{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Decorator extends Coffee2{
    protected Coffee2 coffee;

    public Decorator(Coffee2 coffee) {
        this.coffee = coffee;
    }

    public String get() {
        return coffee.getName();
    }

    public void set(String name) {
        coffee.setName(name);
    }
}

class Cappuccino2 extends Decorator{
    String foam = "пенка капучинистая";
    public Cappuccino2(Coffee2 coffee) {
        super(coffee);
    }
    public String getCappuccino(){
        return foam;
    }
}

class DecoratedFoam2 extends Decorator{
    String decoratedfoam = "пенка декорированная";
    public DecoratedFoam2(Coffee2 coffee) {
        super(coffee);
    }
    public String getDecoratedfoam(){
        return decoratedfoam;
    }
}

class Chocolate2 extends Decorator{
    String chocolate = "шоколадный";
    public Chocolate2(Coffee2 coffee) {
        super(coffee);
    }
    public String getChocolate(){
        return chocolate;
    }
}

class Caramel2 extends Decorator{
    String caramel = "карамельный";
    public Caramel2(Coffee2 coffee) {
        super(coffee);
    }
    public String getCaramel(){
        return caramel;
    }
}

class WhippedCream2 extends Decorator{
    String whippedCream = "взбитые сливки";
    public WhippedCream2(Coffee2 coffee) {
        super(coffee);
    }
    public String getWhippedCream(){
        return whippedCream;
    }
}

class Decoration{
    public static void main(String[] args) {
        Cappuccino2 cappuccino = new Cappuccino2(new Coffee2());
        Cappuccino2 cappuccino1 = new Cappuccino2(new Caramel2(new Coffee2()));
        Cappuccino2 cappuccino2 = new Cappuccino2(new Caramel2(new Chocolate2(new Coffee2())));
        Cappuccino2 cappuccino3 = new Cappuccino2(new Caramel2(new Chocolate2(new WhippedCream2(new Coffee2()))));
        Cappuccino2 cappuccino4 = new Cappuccino2(new WhippedCream2(new Caramel2(new Coffee2())));
        Chocolate2 chocolate = new Chocolate2(new Cappuccino2(new Coffee2()));
    }
}