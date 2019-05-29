package Thinking_in_Java.Chapter_17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static Thinking_in_Java.Chapter_17.Countries.names;

public class Ex3 {
    public static void main(String[] args) {
        Set set = new HashSet(names(6));
        set.addAll(names(6));
        set.addAll(names(6));
        System.out.println(set);
        System.out.println();
        Set set2 = new TreeSet(names(6));
        set2.addAll(names(6));
        set2.addAll(names(6));
        System.out.println(set2);
        System.out.println();
        Set set3 = new LinkedHashSet(names(6));
        set3.addAll(names(6));
        set3.addAll(names(6));
        System.out.println(set3);
    }
}
