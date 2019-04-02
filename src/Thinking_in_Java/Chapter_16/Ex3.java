package Thinking_in_Java.Chapter_16;

import java.util.Arrays;
import java.util.Locale;

public class Ex3 {
    public static double[][] meth1(int i1, int i2, double s, double f){
        double [][] doubles = new double[i1][i2];
        double inc = (f - s) / (i1 * i2);
        double val = s;
        for (int i = 0; i < i1; i++){
            for (int j = 0; j < i2; j++){
                doubles[i][j] = val;
                val += inc;
            }
        }
        return doubles;
    }
    public static void meth2(double[][] doubles){
        System.out.println(Arrays.deepToString(doubles));
        System.out.println();
        for(int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++)
                System.out.printf(Locale.US, "%.2f ", doubles[i][j]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
     meth2(meth1(3,2,1,5));
    }
}
