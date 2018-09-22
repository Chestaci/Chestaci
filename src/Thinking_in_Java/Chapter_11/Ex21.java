package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex21 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String s = "Мистер Вайт и Саюри любят вкусный чай!" +
                " И вообще, они любят практически любой чай!" +
                " Или не так, Мистер Вайт и Саюри, считают," +
                " что чай, любой, никак не может быть плохим, если его качественно и правильно заварить! =)";
        for (String word : s.split(" ")) {
            Integer freq = map.get(word);
            map.put(word, freq == null ? 1 : freq + 1);
        }
//        System.out.println(map);

//        Map<String,Integer> copymap = new TreeMap<>(map);
//        System.out.println(copymap);
        List<String> string = new ArrayList<>(map.keySet());
        Collections.sort(string, String.CASE_INSENSITIVE_ORDER);

//       System.out.println(string);

        for (String st : string) {
            System.out.print(st + ": " + map.get(st) + ", ");
        }
    }
}
