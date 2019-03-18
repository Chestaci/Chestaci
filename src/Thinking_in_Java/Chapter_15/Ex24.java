package Thinking_in_Java.Chapter_15;

import java.util.HashMap;
import java.util.Map;

public class Ex24 {
}
interface FactoryII<T> {
    T create();
}

class Building1 {
    public static class BFactory implements FactoryII<Building1>{
        @Override
        public Building1 create() {
            return new Building1();
        }
    }
}

class House1 extends Building1 {
    public static class HFactory implements FactoryII<House1>{
        @Override
        public House1 create() {
            return new House1();
        }
    }
}

class ClassTypeCapture1<T> {

    Map<String,FactoryII<T>> map = new HashMap<>();

    void addType (String typeName, FactoryII<T> kind){
        map.put(typeName, kind);
    }

    public Object createNew(String typeName) {
        FactoryII<T> c = map.get(typeName);
        try {
            return c.create();
        } catch (NullPointerException e) {
            System.out.println("Not a registered factoryname: " + typeName);
            return null;
        }
    }

    public static void main(String[] args) {
        ClassTypeCapture1 ctc = new ClassTypeCapture1();
        ctc.addType("Building", new Building1.BFactory());
        ctc.addType("House", new House1.HFactory());
//        ctc.addType("Product", Product.class);
        System.out.println(ctc.createNew("Building").getClass());
        System.out.println(ctc.createNew("House").getClass());
//        ctc.createNew("Product");
        ctc.createNew("Car");
    }
}