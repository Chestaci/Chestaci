package Thinking_in_Java.Chapter_13;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex16 {
}
class JGrep2 {
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
        Pattern xp = Pattern.compile("\\w+\\.{1}\\w+");
        Matcher x = xp.matcher(args[0]);
        Pattern p = Pattern.compile(args[1], flag);
        //Перебор строк входного файла:
        int index = 0;
        Matcher m = p.matcher("");
        if(x.find()) {
            for (String line : new TextFile(args[0])) {
                m.reset(line);
                while (m.find()) {
                    System.out.println(index++ + ": " + m.group() + ": " + m.start());
                }
            }
        }else{
            File[] files = new File(args[0]).listFiles();
            System.out.println(files.length);
            System.out.println(args[0]);
            for (File f : files){
                System.out.println(f.getName());
                for (String line : new TextFile(args[0] + f.getName())) {
                    m.reset(line);
                    while (m.find()) {
                        System.out.println(index++ + ": " + m.group() + ": " + m.start());
                    }
                }
                System.out.println("");
            }
        }
    }
}
