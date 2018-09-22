package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex24a {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Россия", "Москва");
        map.put("Япония", "Токио");
        map.put("Англия", "Лондон");
        map.put("Париж", "Франция");
        map.put("Амстердам", "Нидерланды");
        Map<String, String> map2 = new HashMap<>(map);
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        map.clear();
        for (String s : list) {
            map.put(s, map2.get(s));
        }
        map2.clear();
        list.clear();
        System.out.println(map);
    }
}
