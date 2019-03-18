package Thinking_in_Java.Chapter_15;

public class Ex20 {
}

interface Ab{
    void a();
    void b();
}

class Abc implements Ab{

    @Override
    public void a() {
        System.out.println("method a");
    }

    @Override
    public void b() {
        System.out.println("method b");
    }

    public void c(){
        System.out.println("method c");
    }
}

class D{
    public static <T extends Ab> void d(T x){
        x.a();
        x.b();
    }

    public static void main(String[] args) {
        Abc abc = new Abc();
        d(abc);
    }
}