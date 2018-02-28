package Thinking_in_Java.Chapter_5;

public class Ex15 {
    public static void main(String[] args) {
        System.out.println("main");
        ExTest exTest2 = new ExTest();
        exTest2.print();
    }
}
class ExTest{
    String s;
    String s2;
    {
        s = "non-static s";
        s2 = "non-static s2";
        System.out.println("Block initialisation");
        System.out.println(s +" in block initialisation");
        System.out.println(s2 +" in block initialisation");
    }
    ExTest(){
        System.out.println("Constructor ExTest");
    }
    void print(){
        System.out.println("print(): " + s);
        System.out.println("print(): " + s2);
    }
}