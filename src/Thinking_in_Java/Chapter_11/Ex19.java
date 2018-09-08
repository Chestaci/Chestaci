package Thinking_in_Java.Chapter_11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex19 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Tea");
        set.add("Beer");
        System.out.println(set);
        Set<String> set2 = new TreeSet<>(set);
        System.out.println(set2);
        Set<String> set3 = new LinkedHashSet<>(set2);
        System.out.println(set3);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Set<String> set4 = new LinkedHashSet<>();
        for (String s: set2){
            set4.add(s);
        }
        System.out.println(set4);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
