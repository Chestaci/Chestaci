package Thinking_in_Java.Chapter_18;

import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex6 {
}

class ProcessFiles2 {
    public interface Strategy {
        void process(File file);
    }
    private Strategy strategy;
    private String regex;

    public ProcessFiles2(Strategy strategy, String regex) {
        this.strategy = strategy;
        this.regex = regex;
    }

    public void start(String[] args) {
        try {
            if(args.length == 0)
                processDirectoryTree(new File("."));
            else
                for(String arg : args) {
                    File fileArg = new File(arg);
                    if(fileArg.isDirectory())
                        processDirectoryTree(fileArg);
                    else {
// Allow user to leave off extension:
                        if(arg.matches(regex))
                            strategy.process(fileArg.getCanonicalFile());
                    }
                }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void
    processDirectoryTree(File root) throws IOException {
        for(File file : Directory.walk(
                root.getAbsolutePath(), regex))
            strategy.process(file.getCanonicalFile());
    }
    // Demonstration of how to use it:
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar(2019, Calendar.DECEMBER , 7);
        Date date = calendar.getTime();

        new ProcessFiles2(new ProcessFiles2.Strategy() {
            public void process(File file) {
                System.out.println(file);
            }
        }, ".*\\.java").start(args);
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
        new ProcessFiles2(new ProcessFiles2.Strategy() {
            public void process(File file) {
                if ((new Date(file.lastModified()).after(date))) {
                    System.out.println(file);
                }
            }
        }, ".*\\.java").start(args);
    }
}
//
//class FileDemo {
//    public static void main(String[] args) {
//        File f = null;
//        String path;
//        long millisec;
//        boolean bool = false;
//
//        try {
//
//            // create new file
//            f = new File("c:/test.txt");
//
//            // true if the file path is a file, else false
//            bool = f.exists();
//
//            // if path exists
//            if(bool) {
//                // returns the time file was last modified
//                millisec = f.lastModified();
//
//                // date and time
//                Date dt = new Date(millisec);
//
//                // path
//                path = f.getPath();
//
//                // print
//                System.out.print(path+" last modified at: "+dt);
//            }
//
//
//        } catch(Exception e) {
//            // if any error occurs
//            e.printStackTrace();
//        }
//    }
//}

//    можно вызвать метод Date.getTime().Он вернет количество миллисекунд, прошедших с полуночи 1 января 1970 года.

//https://javarush.ru/groups/posts/1941-kak-ne-poterjatjhsja-vo-vremeni--datetime-i-calendar