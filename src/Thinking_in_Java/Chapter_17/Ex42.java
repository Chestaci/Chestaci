package Thinking_in_Java.Chapter_17;

import net.mindview.util.RandomGenerator;

import java.util.*;

public class Ex42 extends Ex40_41 {
    public Ex42(String s1, String s2) {
        super(s1, s2);
    }
    public int compareTo(Ex42 rv) {
        String rvi = rv.s1;
        return s1.toLowerCase().compareTo(rvi.toLowerCase());
    }
    public static class CompareSecondAlphabetic
            implements Comparator<Ex42> {
        public int compare(Ex42 sc1,
                           Ex42 sc2) {
            return sc1.s1.toLowerCase().compareTo(
                    sc2.s1.toLowerCase());
        }
    }

    public static void main(String[] args) {
        RandomGenerator.String r = new RandomGenerator.String();
        Ex42 a [] = new Ex42[11];
        ArrayList<Ex42> al = new ArrayList<>();
        Set<Ex42> as = new HashSet<>();
        Map<Ex42,Integer> am = new HashMap<>();
        for (int i = 0; i < a.length; i++){
            String s1 = r.next();
            String s2 = r.next();
            a[i] = new Ex42(s1,s2);
            al.add(new Ex42(s1,s2));
            as.add(new Ex42(s1,s2));
//            am.put(new Ex40(s1,s2), i);
        }
        Ex42 key1 = a[5];
        Ex42 key2 = al.get(5);
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println(al);
        System.out.println("///////////////////////////////////////////////////////////////////");
        Arrays.sort(a);
        Collections.sort(al, null);
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println(al);
        System.out.println("///////////////////////////////////////////////////////////////////");
        System.out.println(Arrays.binarySearch(a, key1));
        System.out.println(Collections.binarySearch(al, key2));
        Ex42.CompareSecondAlphabetic comparator = new Ex42.CompareSecondAlphabetic();


        System.out.println("///////////////////////////////////////////////////////////////////");
        Arrays.sort(a, comparator);
        Collections.sort(al, comparator);
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println(al);
        System.out.println("///////////////////////////////////////////////////////////////////");

        Arrays.binarySearch(a, key1, comparator);
        System.out.println(Arrays.binarySearch(a, key1, comparator));
        Collections.binarySearch(al, key2, comparator);
        System.out.println(Collections.binarySearch(al, key2, comparator));
        System.out.println("///////////////////////////////////////////////////////////////////");
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println(al);
        System.out.println("///////////////////////////////////////////////////////////////////");
        int i = 0;
        for(Ex42 re : as){
            am.put(re,i++);
        }
        System.out.println(as);
        System.out.println(am);

    }
}
