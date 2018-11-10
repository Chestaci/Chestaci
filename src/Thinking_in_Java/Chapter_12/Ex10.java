package Thinking_in_Java.Chapter_12;

public class Ex10 {
    void f() {
        try {
            try {
                g();
            } catch (Except1 except1) {
                System.out.println("Перехвачено во внутреннем блоке try");
                except1.printStackTrace();
                throw new Except2("f(), из внутреннего блока try");
            }
        } catch (Except2 except2) {
            System.out.println("Перехвачено во внешнем блоке try");
            except2.printStackTrace();
        }
    }

    void g() throws Except1 {
        throw new Except1("g()");
    }

    public static void main(String[] args) {
        Ex10 ex10 = new Ex10();
        ex10.f();
    }
}

class Except1 extends Exception{
    public Except1(String s) {
        super(s);
    }
}

class Except2 extends Exception {
    public Except2(String s) {
        super(s);
    }
}
