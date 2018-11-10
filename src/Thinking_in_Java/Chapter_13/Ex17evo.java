package Thinking_in_Java.Chapter_13;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex17evo {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }


////        String pattern1 = "(//(\\s|.)*)";                  //1    //
////        String pattern2 = "(/\\*(\\s|.)*)";                //2    /*
////        String pattern3 = "((\\s|.)*\\*/)";                //3    */
//
////        Pattern p = Pattern.compile("(//(\\s|.)*)|(/\\*(\\s|.)*)|((\\s|.)*\\*/)");
//        Pattern p = Pattern.compile("(/\\*(\\s|.)*\\*/)");
//
//        //Перебор строк входного файла:
////        int index = 0;
//        Matcher m = p.matcher("");
////        for (String line : new TextFile(args[0])) {
////            m.reset(line);
////            while (m.find()) {
////                System.out.println(index++ + ": " + m.group() + ": " + m.start());
////            }
////        }
//
////        boolean b = false;
//
//        StringBuilder stringBuilder = new StringBuilder();
//
//
//        for (String line : new TextFile(args[0])) {
//
//           stringBuilder.append(line + "\n");
//
//
////            m.reset(line);
////
////            while (m.find()) {
////                System.out.println(index++ + ": " + m.group());
////            }
//
//
//
////            if(line.matches(pattern2) && line.matches(pattern3)){
////                while (m.find()) {
////                    System.out.println(index++ + ": " + m.group());
////                }
////            }
////            if(line.matches(pattern2) && !line.matches(pattern3)){
////                while (m.find()) {
////                    System.out.println(index++ + ": " + m.group());
////                }
////                b = true;
////            }
////            if((b == true) && line.matches(pattern3)){
////                while (m.find()) {
////                    System.out.println(index++ + ": " + m.group());
////                }
////                b = false;
////            }
////            if((b == true) && !line.matches(pattern3)){
////                    System.out.println(index++ + ": " + line);
////            }
////            if(line.matches(pattern1)){
////                while (m.find()) {
////                    System.out.println(index++ + ": " + m.group());
////                }
////            }
//        }
//        m.reset(stringBuilder);
////        System.out.println(stringBuilder);
//        while (m.find()) {
//            System.out.println(m.group());
//        }

        Pattern p = Pattern.compile("(//(\\s|.)*)|(/\\*(\\s|.)*)|((\\s|.)*\\*/)");
        Pattern p1 = Pattern.compile("//(\\s|.)*");         //  //
        Pattern p2 = Pattern.compile("/\\*(\\s|.)*");       //  /*
        Pattern p3 = Pattern.compile("(\\s|.)*\\*/");       //  */

        Matcher m = p.matcher("");
        Matcher m1 = p1.matcher("");
        Matcher m2 = p2.matcher("");
        Matcher m3 = p3.matcher("");

        int index = 0;

        boolean b = false;
        //Перебор строк входного файла:

        for (String line : new TextFile(args[0])) {
            m.reset(line);
            m1.reset(line);
            m2.reset(line);
            m3.reset(line);
            if(m1.find()){
                m1.reset(line);
                while (m1.find()) {
                    System.out.println(index++ + ": " + m1.group());
                }
                m1.reset(line);
            }
            if(m2.find() && m3.find()){
                m2.reset(line);
                m3.reset(line);
                while (m2.find()) {
                    System.out.println(index++ + ": " + m2.group());
                }
                while (m3.find()) {
                    System.out.println(index++ + ": " + m3.group());
                }
                m2.reset(line);
                m3.reset(line);
            }
            if(m2.find() && !m3.find()){
                m2.reset(line);
                while (m2.find()) {
                    System.out.println(index++ + ": " + m2.group());
                }
                b = true;
                m2.reset(line);
                m3.reset(line);
            }
            if((b == true) && m3.find()){
                m3.reset(line);
                while (m3.find()) {
                    System.out.println(index++ + ": " + m3.group());
                }
                b = false;
                m3.reset(line);
            }
            if((b == true) && !m3.find()){
                    System.out.println(index++ + ": " + line);
                m3.reset(line);
            }
                    }

//        for (String line : new TextFile(args[0])) {
//            m.reset(line);
//            while (m.find()) {
//                System.out.println(index++ + ": " + m.group() + ": " + m.start());
//            }
//        }

    }
}
