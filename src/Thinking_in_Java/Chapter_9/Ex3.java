package Thinking_in_Java.Chapter_9;

public abstract class Ex3 {
    abstract void print();

    public Ex3() {
        print();
    }

    public static void main(String[] args) {
        A a = new A();
       a.print();
    }
}
class A extends Ex3 {
  int i = 5;
    @Override
    void print() {
        System.out.println(i);
    }
}