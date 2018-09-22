package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex23 {
}

class Statistics{
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer,Integer> m =new HashMap<>();
        int maxKey = 0;
        int maxValue = 0;
        int b = 51;
        for(int j = 0; j < b; j++) {
            for (int i = 0; i < 10000; i++) {
                int r = rand.nextInt(20);
                Integer freq = m.get(r);
                m.put(r, freq == null ? 1 : freq + 1);
            }
        }
        Collection<Integer> values = m.values();
        ArrayList<Integer> val = new ArrayList<>(values);
        maxValue = val.get(0);
        for(int i = 0; i < val.size(); i++){
            if(maxValue < val.get(i))
                maxValue = val.get(i);
        }

        for (Integer a: m.keySet()) {
            if (m.get(a).equals(maxValue)){
                maxKey = a;
                System.out.println("Число " + maxKey + " появляется " + maxValue + " раз. Это число появляется чаще других.");
            }
        }

//        ///////////////////////////////////////////////////
//        Random rand2 = new Random(47);
//        Map<Integer,Integer> s =new HashMap<>();
//        for(int i = 0; i < 10000; i++){
//            int r = rand2.nextInt(20);
//            Integer freq = s.get(r);
//            s.put(r, freq == null ? 1 : freq + 1);
//        }
//        System.out.println(s);
//        ///////////////////////////////////////////////////////

        System.out.println(m);
     //   System.out.println(maxValue);
      //  System.out.println("Число " + maxKey + " появляется " + maxValue + "раз. Это число появляется чаще других.");
    }
}
