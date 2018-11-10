package Thinking_in_Java.Chapter_13;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex19 {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

//        Pattern p = Pattern.compile("([A-Z]\\w*)");
//
//        int index = 0;
//        Matcher m = p.matcher("");
//
//        for (String line : new TextFile(args[0])) {
//            m.reset(line);
//
//            while (m.find()) {
//                System.out.println(index++ + ": " + m.group());
//            }
//        }

        // we want all class names:
        Pattern p = Pattern.compile("class \\w+\\s+");
        // not including those in comment lines:
        Pattern q = Pattern.compile("^(//|/\\*|\\*)");
        System.out.println("classes in " + args[0] + ":");
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher(""); // creates emtpy Matcher object
        Matcher n = q.matcher("");
        for(String line : new TextFile(args[0])) {
            m.reset(line);
            n.reset(line);
            while(m.find() && !n.find())
                System.out.println(index++ + ": " + m.group());
        }
    }
}

