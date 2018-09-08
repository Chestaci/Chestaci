package Thinking_in_Java.Chapter_11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex18 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Tea", 8);
        map.put("Beer", 0);
        System.out.println(map);
        Map<String, Integer> map2 = new TreeMap<>(map);
        System.out.println(map2);
        Map<String, Integer> map3 = new LinkedHashMap<>(map2);
        System.out.println(map3);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Map<String, Integer> map4 = new LinkedHashMap<>();
        for (String s: map2.keySet()){
            map4.put(s, map2.get(s));
        }
        System.out.println(map4);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
