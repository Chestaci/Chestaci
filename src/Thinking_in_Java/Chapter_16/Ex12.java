package Thinking_in_Java.Chapter_16;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

import java.util.Arrays;

public class Ex12 {
    public static void main(String[] args) {
        double[] doubles = {1.00, 1.25, 1.50, 1.75, 2.00, 2.25, 2.50, 2.75, 3.00};
        System.out.println(Arrays.toString(doubles));
        CountingGenerator.Double generator =  new CountingGenerator.Double();
        double[] doubles2 = new double[10];
        for (int i = 0; i < 10; i++){
            doubles2[i] = generator.next();
        }
        for (int i = 0; i < 10; i++){
            System.out.print(doubles2[i] + " ");
        }
        System.out.println();
        double[] doubles3 = ConvertTo.primitive(Generated.array(
                Double.class, new CountingGenerator.Double(), 15));
        System.out.println(Arrays.toString(doubles3));
    }
}
