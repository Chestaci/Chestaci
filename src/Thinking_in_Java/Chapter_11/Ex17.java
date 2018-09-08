package Thinking_in_Java.Chapter_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex17 {
    public static void main(String[] args) {
        Map<String,Gerbil3> gerbil3Map = new HashMap<>();
        gerbil3Map.put("Stig", new Gerbil3(1));
        gerbil3Map.put("Sonya", new Gerbil3(2));
        gerbil3Map.put("Frosya", new Gerbil3(3));
        System.out.println(gerbil3Map.keySet());

        Iterator<String> it = gerbil3Map.keySet().iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
            gerbil3Map.get(s).hop();
            }
        }
}

class Gerbil3 {
    int gerbilNumber;

    public Gerbil3 (int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        System.out.println(gerbilNumber + " " + "Hi!");
    }

}