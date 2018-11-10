package Thinking_in_Java.Chapter_13;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingTestEx16 {
    private int index = 0;
    public void line(String l, Matcher matcher){
        for (String line : new TextFile(l)) {
            matcher.reset(line);
            while (matcher.find()) {
                System.out.println(this.index++ + ": " + matcher.group() + ": " + matcher.start());
            }
        }
    }
    public void dir(String d, Matcher matcher) {
        Matcher m = Pattern.compile("\\w+\\.{1}\\w+").matcher("");
        m.reset(d);
        if(m.find()){
            line(d, matcher);
        }else{
        File[] files = new File(d).listFiles();
        if (new File(d).listFiles() != null) {
            for (File f : files) {
                m.reset(f.getName());
                if (m.find()) {
                    System.out.println(f.getName());
                    System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
                    line(d + "\\" + f.getName(), matcher);
                    System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
                } else {
                    String q = d + "\\" + f.getName();
                    System.out.println(q);
                    dir(q, matcher);


                }
            }
        } else {
            System.out.println("no such directory: " + d);
            //System.exit(0);
        }
    }
    }

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
        UsingTestEx16 usingTestEx16 = new UsingTestEx16();
        usingTestEx16.dir(args[0], m);
    }
}
