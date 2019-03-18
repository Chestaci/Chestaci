package Thinking_in_Java.Chapter_15;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ex22 {
//    public Ex22() {
//        System.out.println("1");
//    }
    public Ex22(String s) {
        System.out.println("2");
    }
}

class ClassTypeCreator<T> {
    Class<T> kind;
    public ClassTypeCreator(Class<T> kind) {
        this.kind = kind;
    }
    public Object createNew(Object ... args){
        Constructor [] con = kind.getConstructors();
        for (Constructor cr : con){
            System.out.println(cr.toString());
            Class[] cA = cr.getParameterTypes();
            if(cA.length == 0){
                try {
                    return kind.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            if(cA.length == 1) {
                if (cA[0] == args[0].getClass()) {
                    try {
                        return kind.getDeclaredConstructor(cA).newInstance(args[0]);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                } else {
                    throw new NullPointerException("Не подходящие значания аргумента передаваемого конструктору");
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ClassTypeCreator<Ex22> classTypeCreator = new ClassTypeCreator<>(Ex22.class);
        classTypeCreator.createNew("qwerty");
    }
}
