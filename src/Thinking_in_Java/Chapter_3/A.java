package Thinking_in_Java.Chapter_3;

public class A {
    static void f(B y){
        y.b = 50;
    }
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();
        B b3 = new B();
        b1.b = 3;
        b2.b = 2;
        b3.b = 47;
        System.out.println("b1.b = " + b1.b + " b2.b = " + b2.b  + " b3.b = " + b3.b);
        b1.b = b2.b;
        b3 = b1;
        System.out.println("b1.b = " + b1.b + " b2.b = " + b2.b  + " b3.b = " + b3.b);
        b3.b = 11;
        b2.b = 5;
        System.out.println("b1.b = " + b1.b + " b2.b = " + b2.b  + " b3.b = " + b3.b);
        //f(b1);
        f(b2);
        f(b3);
        System.out.println("b1.b = " + b1.b + " b2.b = " + b2.b  + " b3.b = " + b3.b);
    }
}
class B {
    float b;
}