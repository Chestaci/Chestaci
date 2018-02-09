package Thinking_in_Java.Chapter_3;

public class Dog {
    String name;
    String say;

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Spot";
        d1.say = "woof-woof";
        Dog d2 = new Dog();
        d2.name = "Scruffy";
        d2.say = "waf-waf";
        System.out.println("The first dog named " + d1.name + " says " + d1.say + ". "
        + "\n" + "The second dog named " + d2.name + " says " + d2.say + ".");
        Dog d3 = new Dog();
        d3 = d1;
        System.out.println(d1 == d3);
        System.out.println(d1.equals(d3));

    }
}
