package Thinking_in_Java.Chapter_16;

import java.util.Arrays;
import java.util.Locale;

public class Ex4 {
    public static double[][][] meth3(int i1, int i2, int i3, double s, double f){
        double [][][] doubles = new double[i1][i2][i3];
        double inc = (f - s) / (i1 * i2 * i3);
        double val = s;
        for (int i = 0; i < i1; i++){
            for (int j = 0; j < i2; j++){
                for (int k = 0; k < i3; k++) {
                    doubles[i][j][k] = val;
                    val += inc;
                }
            }
        }
        return doubles;
    }
    public static void meth4(double[][][] doubles){
        System.out.println(Arrays.deepToString(doubles));
        System.out.println();
        for(int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                for (int k = 0; k < doubles[i][j].length; k++) {
                    System.out.printf(Locale.US, "%.2f ", doubles[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        meth4(meth3(3,3,3,1,5));
    }
}
