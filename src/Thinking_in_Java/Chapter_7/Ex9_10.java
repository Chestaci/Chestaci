package Thinking_in_Java.Chapter_7;

public class Ex9_10 {
    public static void main(String[] args) {
        Root x1 = new Root(111, "Teapot");
        System.out.println();
        Stem x2 = new Stem("Mr.White");
    }
}

class Root{
    Component1 c1 = new Component1(1);
    Component2 c2 = new Component2('x');
    Component3 c3 = new Component3(true);
    public Root(int i, String s) {
        System.out.println("Root() int, String + " + Integer.toString(i) + " + " + s);
    }
}

class Component1{
    public Component1(int i) {
        System.out.println("Component1() int + " + Integer.toString(i));
    }
}

class Component2{
    public Component2(char c) {
        System.out.println("Component2() char + " + c);
    }
}

class Component3{
    public Component3(boolean b) {
        System.out.println("Component3() boolean + " + b);
    }
}

class Stem extends Root{
    public Stem(String s) {
        super(42,"Tea-Tea");
        System.out.println("Stem() String + " + s);
    }
    Component1 c4 = new Component1(2);
    Component2 c5 = new Component2('Q');
    Component3 c6 = new Component3(false);
}