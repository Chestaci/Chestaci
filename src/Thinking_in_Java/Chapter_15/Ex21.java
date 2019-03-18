package Thinking_in_Java.Chapter_15;

import java.util.HashMap;
import java.util.Map;

public class Ex21 {
}

class Building {}

class House extends Building {}

 class ClassTypeCapture<T> {

    Map<String,Class<?>> map = new HashMap<>();

    void addType (String typeName, Class<?> kind){
        map.put(typeName, kind);
    }

    public Object createNew(String typeName){
        Class<?> c = map.get(typeName);
        try {
            return c.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Not a registered typename: " + typeName);
        } catch (IllegalAccessException e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public static void main(String[] args) {
        ClassTypeCapture ctc = new ClassTypeCapture();
        ctc.addType("Building", Building.class);
        ctc.addType("House", House.class);
        ctc.addType("Product", Product.class);
        System.out.println(ctc.createNew("Building").getClass());
        System.out.println(ctc.createNew("House").getClass());
        ctc.createNew("Product");
        ctc.createNew("Car");
    }
}
