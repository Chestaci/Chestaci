package Thinking_in_Java.Chapter_16;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

import java.util.Arrays;

public class Ex13 {
    public static void main(String[] args) {
        String string = Arrays.toString(ConvertTo.primitive(Generated.array(Character.class, new CountingGenerator.Character(), 15)));
        String string2 = new CountingGenerator.String(15).next();
        System.out.println(string);
        System.out.println(string2);
    }
}
