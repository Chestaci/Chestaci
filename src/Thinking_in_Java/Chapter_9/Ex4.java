package Thinking_in_Java.Chapter_9;

public class Ex4 extends B {
    void a(){
        System.out.println("А");
    }
    static void b(B b){
        //   ((Ex4)b).a();
        b.a();
    }

    public static void main(String[] args) {
        Ex4 c = new Ex4();
        // ((Ex4)c).a();
        b(c);
    }
}

abstract class B {
    abstract void a();

}