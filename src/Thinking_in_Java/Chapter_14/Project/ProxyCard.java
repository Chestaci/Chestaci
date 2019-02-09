package Thinking_in_Java.Chapter_14.Project;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyCard implements InvocationHandler {
    private Object balance;
    Card conn;

    public ProxyCard(Object balance) {
        this.balance = balance;
        conn = (Card) balance;
    }

    @Override
    public Object invoke(Object balance, Method method, Object[] args) throws Throwable {
//        System.out.println("**** proxy: " + balance.getClass() +
//                ", method: " + method + ", args: " + args);
//        if(args != null)
//            for(Object arg : args)
//                System.out.println(" " + arg);

        Object o = null;
        System.out.print("Calling proxied obj");
        try {
            // Записывает args в текстовый файл
            o = method.invoke(this.balance, args);
            //    throw new IllegalAccessException();
            conn.writeFile();
            conn.commit();
        } catch (IllegalAccessException ex) {
            conn.rollback();
            ex.printStackTrace();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return o;
    }


        //return method.invoke(this.balance, args);
}

