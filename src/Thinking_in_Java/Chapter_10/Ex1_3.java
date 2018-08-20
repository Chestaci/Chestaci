package Thinking_in_Java.Chapter_10;

public class Ex1_3 {
    private String string;

    Ex1_3(String s) {
        string = s;
    }

    class Inner {
        public String toString() {
            return string;
        }
    }

    Inner m() {
        return new Inner();
    }

    public static void main(String[] args) {
        Ex1_3 ex1 = new Ex1_3("Строка");
        Ex1_3.Inner inner = ex1.m();
        System.out.println(inner.toString());
    }
}
