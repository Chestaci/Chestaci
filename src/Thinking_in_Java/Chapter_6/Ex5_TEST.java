package Thinking_in_Java.Chapter_6;

public class Ex5_TEST {
    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();
        System.out.println(ex5.s1);
       // System.out.println(ex5.s2);
        System.out.println(ex5.s3);
        System.out.println(ex5.s4);

        ex5.printPublic();
        //ex5.printPrivate();
        ex5.printProtected();
        ex5.printDefault();
    }
}
