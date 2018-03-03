package Thinking_in_Java.Chapter_7;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Ex12 {
    public static void main(String[] args) {
        Root1 x1 = new Root1(111, "Teapot");
        System.out.println();
        Stem1 x2 = new Stem1("Mr.White");
        System.out.println();
        try {

        } finally {
            x2.dispose();
            System.out.println();
            x1.dispose();
        }
    }
}

class Root1{
    Component11 c1 = new Component11(1);
    Component21 c2 = new Component21('x');
    Component31 c3 = new Component31(true);
    public Root1(int i, String s) {
        System.out.println("Root() int, String + " + Integer.toString(i) + " + " + s);
    }
    void dispose() {
        System.out.println("Завершение Root1");
        c3.dispose();
        c2.dispose();
        c1.dispose();
     }
}

class Component11{
    public Component11(int i) {
        System.out.println("Component1() int + " + Integer.toString(i));
    }
    void dispose() {
        System.out.println("Завершение Component11");
    }
}

class Component21{
    public Component21(char c) {
        System.out.println("Component2() char + " + c);
    }
    void dispose() {
        System.out.println("Завершение Component21");
    }
}

class Component31{
    public Component31(boolean b) {
        System.out.println("Component3() boolean + " + b);
    }
    void dispose() {
        System.out.println("Завершение Component31");
    }
}

class Stem1 extends Root1{
    public Stem1(String s) {
        super(42,"Tea-Tea");
        System.out.println("Stem() String + " + s);
    }
    void dispose() {
        System.out.println("Стираем Stem1");
        c6.dispose();
        c5.dispose();
        c4.dispose();
        super.dispose();
    }

    Component11 c4 = new Component11(2);
    Component21 c5 = new Component21('Q');
    Component31 c6 = new Component31(false);
}