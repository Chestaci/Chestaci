package Thinking_in_Java.Chapter_2;

public class Ex8 {
        static int a = 11;
    }

class I{
    static void increment (){
        Ex8.a++;
    }
}

class A {
    public static void main(String[] args) {
        Ex8 x = new Ex8();
        Ex8 y = new Ex8();
        Ex8 z = new Ex8();
        System.out.println(x.a);
        System.out.println(y.a);
        System.out.println(z.a);
        I.increment();
        System.out.println(x.a);
        System.out.println(y.a);
        System.out.println(z.a);
        x.a = 7;
        System.out.println(x.a);
        System.out.println(y.a);
        System.out.println(z.a);
        Ex8 w = new Ex8();
        System.out.println(w.a);
    }
}