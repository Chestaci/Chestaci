package Thinking_in_Java.Chapter_16;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

import java.math.BigDecimal;
import java.util.Arrays;

public class Ex17 {
}

class GeneratorBigDecimal implements Generator<BigDecimal>{
    public BigDecimal next(){
        return new BigDecimal(5);
    }

    public static void main(String[] args) {
        BigDecimal[] bigDecimals = Generated.array(BigDecimal.class, new GeneratorBigDecimal(), 5);
        System.out.println(Arrays.toString(bigDecimals));
    }
}