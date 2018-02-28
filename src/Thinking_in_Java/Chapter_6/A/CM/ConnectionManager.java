package Thinking_in_Java.Chapter_6.A.CM;

import static Thinking_in_Java.Chapter_6.A.CM.Connection.makeConnection;

public class ConnectionManager {
    private static int lm = 3;
    private static Connection[] c = new Connection[lm];
    private static int i = 0;
    public static Connection ConstructorConection() {
        System.out.println("Работает метод конструирования объекта Connection()" +
                " и контролирования количества созданных объектов Connection()");
        //i++;
//        if((i - 1) < c.length) {
//            c[i - 1] = makeConnection();
            if((i) < c.length) {
                c[i] = makeConnection();
            i++;
            return c[i - 1];
        }else{
            System.out.println("Превышен лимит Connection()");

            return null;
        }
    }
}
