package Thinking_in_Java.Chapter_12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Ex6 {
    static void a() throws Exception1{
        System.out.println("Ошибки в методе a()");
        throw new Exception1();
    }

    static void b() throws Exception2{
        System.out.println("Ошибки в методе b()");
        throw new Exception2();
    }

    public static void main(String[] args) {
        try{
            a();
        } catch (Exception1 exception1) {
            System.out.println("Перехвачено в a()");
        }
        try {
            b();
        } catch (Exception2 exception2) {
            System.out.println("Перехвачено в b()");
        }
    }
}

class Exception1 extends Exception {
    private static Logger logger = Logger.getLogger("Exception1");

    public Exception1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
    }
}

class Exception2 extends Exception{
    public Exception2() {
        //printStackTrace(System.err);
        System.out.println(getMessage());
    }

    @Override
    public String getMessage() {
        return "Подробное сообщение: class exception Exception2 " + super.getMessage();
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
    }
}