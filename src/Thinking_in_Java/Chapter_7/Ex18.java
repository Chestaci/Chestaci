package Thinking_in_Java.Chapter_7;

import java.util.Random;

public class Ex18 {
    static final int VALUE_ONE = 5;
    final int valueTwo;
    int valueTwo2;

    public Ex18(int i, int b) {
        //VALUE_ONE = 5;
        valueTwo = i;
        valueTwo2 = b;
    }

    @Override
    public String toString() {
        return "Ex18{" + "valueTwo = " + valueTwo + ", valueTwo2 = " + valueTwo2 + ", VALUE_ONE = " + VALUE_ONE + '}';
    }

    public static void main(String[] args) {
        Ex18 ex18 = new Ex18(5, 11);
        Ex18 ex181 = new Ex18(6, 12);
        System.out.println(ex18);
        System.out.println(ex181);
        ex18.valueTwo2 = 10;
        //ex18.valueTwo = 2;
        ex181.valueTwo2 = 8;
        //ex181.valueTwo = 2;
        System.out.println(ex18);
        System.out.println(ex181);
    }
}
class Test {
    int h;
    Test(int i) { h = i; System.out.println("Test() " + i); } // final - 2 ; static final - 1

    @Override
    public String toString() {
        return "Объект Test{" + "h=" + h + '}';
    }
}

class Difference {
    private String name;
    public Difference(String s) { name = s;
        System.out.println("Difference()"); }

    static final Test sft = new Test(1); // constant reference address
    private final Test ft = new Test(2);

    static final String SFS = "static final"; // class constant
    private final String fs = "final";

    private static Random rand = new Random();

    static final int SFI = rand.nextInt(20); // class constant
    private final int fi = rand.nextInt(20);

    public String toString() {
        return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);
    }

    public static void main(String[] args) {
        Difference d1 = new Difference("d1");
        Difference d2 = new Difference("d2");
        Difference d3 = new Difference("d3");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}