package Thinking_in_Java.Chapter_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex11 {
    public static void main(String[] args) {
        String string = "Arline ate eight apples and one orange while Anita hand't any";
        Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m = p.matcher(string);
//        System.out.println(m.find());
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
