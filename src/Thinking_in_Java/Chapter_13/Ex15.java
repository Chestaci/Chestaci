package Thinking_in_Java.Chapter_13;

import net.mindview.util.TextFile;
import java.util.regex.*;


public class Ex15 {
}

class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        int flag = 0;
        if (args[2].equals("Pattern.CASE_INSENSITIVE")) flag = Pattern.CASE_INSENSITIVE;
        else if (args[2].equals("Pattern.CANON_EQ")) flag = Pattern.CANON_EQ;
        else if (args[2].equals("Pattern.COMMENTS")) flag = Pattern.COMMENTS;
        else if (args[2].equals("Pattern.DOTALL")) flag = Pattern.DOTALL;
        else if (args[2].equals("Pattern.LITERAL")) flag = Pattern.LITERAL;
        else if (args[2].equals("Pattern.MULTILINE")) flag = Pattern.MULTILINE;
        else if (args[2].equals("Pattern.UNICODE_CASE")) flag = Pattern.UNICODE_CASE;
        else if (args[2].equals("Pattern.UNIX_LINES")) flag = Pattern.UNIX_LINES;
        Pattern p = Pattern.compile(args[1], flag);

        //Перебор строк входного файла:
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
        }
    }
}
