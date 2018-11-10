package Thinking_in_Java.Chapter_12;

public class Ex11 {
    void f() {
        try {
                g();
            } catch (Except3 except3) {
                System.out.println("Перехвачено во внутреннем блоке try");
                except3.printStackTrace();
                throw new RuntimeException(except3);
            }

    }

    void g() throws Except3 {
        throw new Except3("g()");
    }

    public static void main(String[] args) {
        Ex10 ex10 = new Ex10();
        ex10.f();
    }
}

class Except3 extends Exception{
    public Except3(String s) {
        super(s);
    }
}

