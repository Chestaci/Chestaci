package Thinking_in_Java.Chapter_18;

import net.mindview.util.TextFile;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class Ex26 {
}
class JGrep3 {
    public static void main(String[] args) throws Exception {
        String path = "src/Thinking_in_Java/Chapter_18/Ex26.java";
        String flags = "Pattern.MULTILINE";
//        if (args.length < 2) {
//            System.out.println("Usage: java JGrep file regex");
//            System.exit(0);
//        }

        int flag = 0;
        if (flags.equals("Pattern.CASE_INSENSITIVE")) flag = Pattern.CASE_INSENSITIVE;
        else if (flags.equals("Pattern.CANON_EQ")) flag = Pattern.CANON_EQ;
        else if (flags.equals("Pattern.COMMENTS")) flag = Pattern.COMMENTS;
        else if (flags.equals("Pattern.DOTALL")) flag = Pattern.DOTALL;
        else if (flags.equals("Pattern.LITERAL")) flag = Pattern.LITERAL;
        else if (flags.equals("Pattern.MULTILINE")) flag = Pattern.MULTILINE;
        else if (flags.equals("Pattern.UNICODE_CASE")) flag = Pattern.UNICODE_CASE;
        else if (flags.equals("Pattern.UNIX_LINES")) flag = Pattern.UNIX_LINES;
        Pattern p = Pattern.compile(path, flag);

        //Перебор строк входного файла:
        int index = 0;
        Matcher m = p.matcher("");
        FileChannel fc = new FileInputStream(path).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(2048);
            fc.read(buffer);
            buffer.flip();
            while(buffer.hasRemaining())
                System.out.print((char)buffer.get());


        System.out.println("***************************************************************");


//        for (String line : new TextFile(path)) {
//
//            m.reset(line);
//            while (m.find()) {
//                System.out.println(index++ + ": " + m.group() + ": " + m.start());
//            }
//        }
    }
}

