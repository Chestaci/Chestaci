package Thinking_in_Java.Chapter_12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Ex7 {
    private static Logger logger = Logger.getLogger("Exception!!!!!!");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        Integer[] integers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try{
            System.out.println(integers[11]);
        }catch (Exception e){
            System.out.println("Перехвачено!");
            e.printStackTrace();
            logException(e);
        }
    }
}
