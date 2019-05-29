package Thinking_in_Java.Chapter_17;

import net.mindview.util.RandomGenerator;

import java.util.TreeSet;

public class Ex9 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        RandomGenerator.String d = new RandomGenerator.String(7);
        for (int i = 0; i < 5; i++) {
//            Collections.addAll(treeSet, d.next());
            treeSet.add(d.next());
            }
        System.out.println(treeSet);
    }
}
