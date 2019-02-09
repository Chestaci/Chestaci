package Thinking_in_Java.Chapter_14;

import java.lang.reflect.Field;

public class Ex9 {
    public static void a2 (Class obj){
            if (obj != null) {
            System.out.println(obj.getSimpleName());
            Class cc = obj.getSuperclass();
            Field f[] =obj.getDeclaredFields();
                for (int i = 0 ; i < f.length; i++){
                    System.out.println(f[i]);
                }
            a2(cc);
        }
    }

    public static void main(String[] args) {
        Circle1 cir = new Circle1();
        Class c = cir.getClass();
        a2(c);
    }
}

