package Thinking_in_Java.Chapter_17;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class Ex16_17 {
}

class Maps2 {
    public static void printKeys(Map<Integer, String> map) {
        printnb("Size = " + map.size() + ", ");
        printnb("Keys: ");
        print(map.keySet()); // Produce a Set of the keys
    }
    public static void printKeys2 (Map<Object, Object> map) {
        printnb("Size = " + map.size() + ", ");
        printnb("Keys: ");
        print(map.keySet()); // Produce a Set of the keys
    }

    public static void test(Map<Integer, String> map) {
        print(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
// Map has ‘Set’ behavior for keys:
        map.putAll(new CountingMapData(25));
        printKeys(map);
// Producing a Collection of the values:
        printnb("Values: ");
        print(map.values());
        print(map);
        print("map.containsKey(11): " + map.containsKey(11));
        print("map.get(11): " + map.get(11));
        print("map.containsValue(\"F0\"): "
                + map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        print("First key in map: " + key);
        map.remove(key);
        printKeys(map);
        map.clear();
        print("map.isEmpty(): " + map.isEmpty());
        map.putAll(new CountingMapData(25));
// Operations on the Set change the Map:
        map.keySet().removeAll(map.keySet());
        print("map.isEmpty(): " + map.isEmpty());
    }

    public static void test2 (Map<Object, Object> map) {
        print(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
// Map has ‘Set’ behavior for keys:
        map.putAll(new CountingMapData(25));
        printKeys2 (map);
// Producing a Collection of the values:
        printnb("Values: ");
        print(map.values());
        print(map);
        print("map.containsKey(11): " + map.containsKey(11));
        print("map.get(11): " + map.get(11));
        print("map.containsValue(\"F0\"): "
                + map.containsValue("F0"));
        Object key = map.keySet().iterator().next();
        print("First key in map: " + key);
        map.remove(key);
        printKeys2 (map);
        map.clear();
        print("map.isEmpty(): " + map.isEmpty());
        map.putAll(new CountingMapData(25));
// Operations on the Set change the Map:
        map.keySet().removeAll(map.keySet());
        print("map.isEmpty(): " + map.isEmpty());
    }


    public static void main(String[] args) {
        test(new HashMap<Integer, String>());
//        test(new TreeMap<Integer, String>());
//        test(new LinkedHashMap<Integer, String>());
//        test(new IdentityHashMap<Integer, String>());
//        test(new ConcurrentHashMap<Integer, String>());
//        test(new WeakHashMap<Integer, String>());
        System.out.println("**************************************************************************************************");
        test(new SlowMap<Integer, String>());
        test2(new SlowMap());

    }
}