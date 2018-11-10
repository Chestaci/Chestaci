package Thinking_in_Java.Chapter_13;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Ex7 {
    public static void main(String[] args) {
        String s = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring.";
        System.out.println(s.matches("^[\\p{Upper}].*[\\.]$"));
       // System.out.println(s.matches("^[A-Z].*[\\.]$"));
        //System.out.println(Arrays.toString(s.split("(\\p{Upper})(\\W+|\\w+)?\\.")));

    }
}
