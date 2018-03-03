package Thinking_in_Java.Chapter_7;

public class Ex16_17 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.toSwim(frog);
        Amphibian.toWalk(frog);
        Amphibian.grow(frog);
        frog.speak();
        frog.eat();
//        Amphibian f = frog;
//        f.eat();
        Frog.toSwim(frog);
        Frog.toWalk(frog);
        Frog.grow(frog);
    }
}

class Amphibian{
    public static void toSwim(Amphibian amphibian){
        System.out.println("I'm (Amphibian) swiming");
    }

    public static void toWalk(Amphibian amphibian){
        System.out.println("I'm (Amphibian) walking");
    }
    protected void speak() {
        System.out.println("Amphibian speaks");
    }
    void eat() {
        System.out.println("Amphibian eats");
    }
    static void grow(Amphibian a) {
        System.out.println("Amphibian grow");
        a.eat();
    }
}

class Frog extends Amphibian{
    @Override
    protected void speak() {
        System.out.println("Frog speaks");
    }

    @Override
    void eat() {
        System.out.println("Frog eats");
    }

    public static void toSwim(Amphibian amphibian){
        System.out.println("I'm (Frog) swiming");
    }

    public static void toWalk(Amphibian amphibian){
        System.out.println("I'm (Frog) walking");
    }
    static void grow(Amphibian a) {
        System.out.println("Frog grow");
        a.eat();
    }
}