package Thinking_in_Java.Chapter_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex25_26 {
    public static void main(String[] args) {


        Map<String, ArrayList<Integer>> words = new HashMap<>();

        String text = "Мистер Вайт и Саюри любят вкусный чай!"
                + " И вообще, они любят практически любой чай!"
                + " Или не так, Мистер Вайт и Саюри, считают,"
                + " что чай, любой, никак не может быть плохим, если его качественно и правильно заварить! =)";


        Integer count = 1;
        for (String word : text.split(" ")) {
            if(words.containsKey(word)){
                ArrayList<Integer> id = words.get(word);
            id.add(count++);
            }else {
                ArrayList<Integer> arrayList = new ArrayList<>();
                words.put(word, arrayList);
                arrayList.add(count++);
            }
        }
        System.out.println(words);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int count2 = 0;

        for (String word2 : words.keySet()) {

            for (Integer id2 : words.get(word2)) {

               count2++;
            }
        }
        System.out.println(count2);

        ArrayList<String> words2 = new ArrayList<>(count2);

        System.out.println(words2.size());

        for (int i = 0; i < count2; i++) {
            words2.add(null);
        }
        System.out.println(words2.size());

        for (String word2 : words.keySet()) {
       //     System.out.println(word2);
            for (Integer id2 : words.get(word2)) {
                //       System.out.println(id2);

                words2.set((id2 - 1), word2);

            }
        }
        System.out.println(words2);

        for (String word3 : words2) {
            System.out.print(word3 + " ");
        }

    }
}
