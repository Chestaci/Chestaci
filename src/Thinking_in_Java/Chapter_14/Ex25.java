package Thinking_in_Java.Chapter_14;

import Thinking_in_Java.Chapter_14.ForEx25.ForEx25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex25 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ForEx25 f = new ForEx25();
//        Method m1 = f.getClass().getDeclaredMethod("c");
//        m1.setAccessible(true);
//        m1.invoke(f);
//        System.out.println(m1);

        for (Method m : f.getClass().getDeclaredMethods()) {
            m.setAccessible(true);
            m.invoke(f);

        }
    }
}
