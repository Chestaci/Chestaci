package Thinking_in_Java.Chapter_13;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex18 {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        Pattern p = Pattern.compile("\"(\\s|.)*\"");

        int index = 0;
        Matcher m = p.matcher("");

        for (String line : new TextFile(args[0])) {
            m.reset(line);

            while (m.find()) {
                System.out.println(index++ + ": " + m.group());
            }
        }
    }
}
