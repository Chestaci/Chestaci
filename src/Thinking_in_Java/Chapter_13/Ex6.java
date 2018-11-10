package Thinking_in_Java.Chapter_13;

public class Ex6 {
    private int i = 1;
    private long l = 100;
    private float f = 5.3f;
    private double d = 5.215;

    public String toString() {
        return String.format("i=%d, l=%d, f=%.1f, d=%.3f", i, l, f, d);
    }

    public static void main(String[] args) {
        Ex6 ex6 = new Ex6();
        System.out.println(ex6.toString());
    }
}
