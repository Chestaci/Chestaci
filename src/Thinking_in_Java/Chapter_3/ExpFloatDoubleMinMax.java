package Thinking_in_Java.Chapter_3;

import static Thinking_in_Java.Chapter_3.Print.print;

public class ExpFloatDoubleMinMax {
    public static void main(String[] args) {
        float fMin = Float.MIN_VALUE;
        float fMax = Float.MAX_VALUE;
        double dMin = Double.MIN_VALUE;
        double dMax = Double.MAX_VALUE;
        print("fMin = " + fMin + "\n" +
                "fMax = " + fMax + "\n" +
                "dMin = " + dMin + "\n" +
                "dMax = " + dMax);
    }
}
