package Thinking_in_Java.Chapter_7;

public class Ex5_7 extends A{
    B b = new B("tea bag(s)");
//    B b;
    public Ex5_7(int i) {
        super(i);
        System.out.println("Ex5_7()");
//        b = new B("tea bag(s)");
    }

    public static void main(String[] args) {
        Ex5_7 x = new Ex5_7(11);
    }
}

class A{
    A(int i){
        System.out.println("A() + " + Integer.toString(i));
    }
}

class B{
    B(String s){
        System.out.println("B() + " + s);
    }
}