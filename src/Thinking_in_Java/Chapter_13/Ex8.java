package Thinking_in_Java.Chapter_13;

import java.util.Arrays;

public class Ex8 {
    public static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";
    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split("the");
        split("you");
        split("the|you");
    }
}
