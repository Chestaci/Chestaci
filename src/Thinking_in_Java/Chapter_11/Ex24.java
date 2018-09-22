package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex24 {
    public static void main(String[] args) {
        Map<String, String> map  = new LinkedHashMap <>();
        map.put("Россия", "Москва");
        map.put("Япония", "Токио");
        map.put("Англия", "Лондон");
        map.put("Париж", "Франция");
        map.put("Амстердам", "Нидерланды");

        System.out.println(map);

//        Map<String, String> map2  = new TreeMap<>(map);
//        System.out.println(map2);
//
//        Map<String, String> map3  = new LinkedHashMap <>(map2);
//        System.out.println(map3);
        Set<String> m = new TreeSet<>(map.keySet());

        System.out.println(m);

        Map<String,String> temp = new LinkedHashMap<>();

        Iterator<String> it = m.iterator();
        while(it.hasNext()) {
            String s = it.next();
            String s1 = map.get(s);
            map.remove(s);
            temp.put(s, s1);
        }

        System.out.println(temp);

        Set<String> temp1 = new TreeSet<>(temp.keySet());

        Iterator<String> it1 = temp1.iterator();
        while(it1.hasNext()) {
            String s = it1.next();
            String s1 = temp.get(s);
            temp.remove(s);
            map.put(s, s1);
        }

        temp.clear();
        System.out.println(map);
    }
}
