package Thinking_in_Java.Chapter_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
    public static void main(String[] args) {
        String s = "Java now has regular expressions";
        // ^Java
        // \Breg*
        // n.w\s+h(a|i)s
        // s?
        // s*
        // s+
        // s{4} не фурычит
        // s{1}
        // s{0,3}
        Pattern p = Pattern.compile("^Java");
        Matcher m = p.matcher(s);
        while(m.find()) {
            System.out.println(m.group());
        }
       // System.out.println(m.find());
    }
}
