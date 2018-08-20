package Thinking_in_Java.Chapter_10;

public class Ex5 {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
    }
}

class A{
    A(){
        System.out.println("Class A outer");
    }
    class B{
        B(){
            System.out.println("Class B inner");
        }
    }
}