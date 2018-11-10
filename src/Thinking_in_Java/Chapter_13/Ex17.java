package Thinking_in_Java.Chapter_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex17 {
    public static void main(String[] args) {
        UsingTestEx16 us = new UsingTestEx16();
        //(//.*$) |
        //Pattern p = Pattern.compile("(?m)(/\\*.*\\*/)");
        Pattern p = Pattern.compile("(//.*$)|(//\\s*.*)|(?m)((/\\*)\\s*.*)|(\\*\\s*.*)");
        //Перебор строк входного файла:

        Matcher m = p.matcher("");
        us.dir(args [0],m);
    }
}
