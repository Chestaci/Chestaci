package Thinking_in_Java.Chapter_6;

import Thinking_in_Java.Chapter_6.A.CM.Connection;
import Thinking_in_Java.Chapter_6.A.CM.ConnectionManager;

import static Thinking_in_Java.Chapter_6.A.CM.ConnectionManager.ConstructorConection;

public class Ex8 {
    public static void main(String[] args) {
//        Connection c = new Connection();
//        Connection cс = makeConnection();
      //  ConnectionManager cm = new ConnectionManager();
//        Connection c1 = cm.ConstructorConection();
//        Connection c2 = cm.ConstructorConection();
//        Connection c3 = cm.ConstructorConection();
//        Connection c4 = cm.ConstructorConection();
//        Connection c5 = cm.ConstructorConection();
//        Connection c6 = cm.ConstructorConection();
//        Connection c7 = cm.ConstructorConection();
        Connection c1 = ConstructorConection();
        Connection c2 = ConstructorConection();
        Connection c3 = ConstructorConection();
        Connection c4 = ConstructorConection();
        Connection c5 = ConstructorConection();
        Connection c6 = ConstructorConection();
        Connection c7 = ConstructorConection();


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
    }
}
