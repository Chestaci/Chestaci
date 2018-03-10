package Thinking_in_Java.Chapter_8;

public class Ex10 {
    void A(){
        System.out.println("method A");
        B();
    }
    void B(){
        System.out.println("method B");
    }
}
class M extends Ex10{
    @Override
    void B() {
        System.out.println("Override method B");
    }

    public static void main(String[] args) {
        M m = new M();
        Ex10 ex10 = m;
        ex10.A();
        ex10.B();
        Ex10 e = new Ex10();
        e.A();
        e.B();
        m.A();
        m.B();
    }
}
