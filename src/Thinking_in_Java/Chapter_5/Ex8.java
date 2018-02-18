package Thinking_in_Java.Chapter_5;

public class Ex8 {
    void methodFirst(){
        System.out.println("Сработал метод 1");
    }
    void method_Second(){
        System.out.println("Сработал метод 2");
        methodFirst();
        this.methodFirst();
    }

    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        ex8.methodFirst();
        ex8.method_Second();
    }
}
