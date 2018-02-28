package Thinking_in_Java.Chapter_7;

public class Ex8 extends Base{
    public Ex8() {
        super("argument default");
        System.out.println("Ex8() default");
    }

    public Ex8(String s) {
        super(s);
        System.out.println("Ex8() args + " + s);
    }

    public static void main(String[] args) {
        new Ex8();
        new Ex8("teapot");
    }
}

class Base{
    Base(String s){
        System.out.println("Base() args");
        System.out.println(s);
    }
}