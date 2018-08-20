package Thinking_in_Java.Chapter_9;

public class Ex6 implements asd {
    //    private void a(){
//
//    }
//    protected void b(){
//
//    }
//    void c(){
//
//    }
    public void a() {
        System.out.println("я, метод a(), должен быть публичным");
    }

    public void b() {
        System.out.println("я, метод b(), должен быть публичным");
    }

    public void c() {
        System.out.println("я, метод c(), должен быть публичным");
    }

    public static void main(String[] args) {
    Ex6 e = new Ex6();
    e.a();
    e.b();
    e.c();
    }
}

interface asd{
    void a();
    void b();
    void c();
}