package Thinking_in_Java.Chapter_2;
//: object/Documentation2.java

import java.util.Date;

/**
 * <pre>
 * System.out.println(new Date());
 * </pre>
 */
///:~

public class Documentation2 {
    Date d = new Date();
    void showDate() {
        System.out.println("Date = " + d);
    }
}
