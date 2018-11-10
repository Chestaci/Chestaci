package Thinking_in_Java.Chapter_13;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Ex17Test {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        Pattern p = Pattern.compile("(//(\\s|.)*)|(/\\*(\\s|.)*)|((\\s|.)*\\*/)");
        //      (//(\s|.)*)|(/\*(\s|.)*)|(\*(\s|.)*)                     (//(\\s|.)*)|(/\\*(\\s|.)*)|((\\s|.)*\\*/)
        Pattern p1 = Pattern.compile("//(\\s|.)*");         //  //
        Pattern p2 = Pattern.compile("/\\*(\\s|.)*");       //  /*
        Pattern p3 = Pattern.compile("(\\s|.)*\\*/");       //  */


        Matcher m1 = p1.matcher("");
        Matcher m2 = p2.matcher("");
        Matcher m3 = p3.matcher("");
        //Перебор строк входного файла:
        int index = 0;
        Matcher m = p.matcher("");
        boolean b = false;
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            m1.reset(line);
            m2.reset(line);
            m3.reset(line);

            if((b == true) && m3.find()){
                b = false;
                m3.reset(line);
            }
            if((b == true) && !m3.find()){
                System.out.println(index++ + ": " + line);
                m3.reset(line);
            }
            if(m2.find() && !m3.find()){
                b = true;
                m2.reset(line);
                m3.reset(line);
            }

            while (m.find()) {
                System.out.println(index++ + ": " + m.group());
            }
        }
    }
}
