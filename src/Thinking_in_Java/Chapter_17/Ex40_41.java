package Thinking_in_Java.Chapter_17;

import net.mindview.util.*;

import java.util.*;


public class Ex40_41 implements Comparable<Ex40_41> {
    String s1;
    String s2;

    public Ex40_41(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "{" + s1  +
                "," + s2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex40_41 ex40 = (Ex40_41) o;
        return Objects.equals(s1, ex40.s1) &&
                Objects.equals(s2, ex40.s2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s1, s2);
    }

    @Override
    public int compareTo(Ex40_41 o) {
        return s1.compareTo(o.s1);
    }

    static public class CompEx40 implements Comparator<Ex40_41> {
            public int compare(Ex40_41 o1, Ex40_41 o2) {
                return o1.s2.compareTo(o2.s2);
            }
        };

    public static void main(String[] args) {
        RandomGenerator.String r = new RandomGenerator.String();
        Ex40_41 a [] = new Ex40_41[11];
        ArrayList<Ex40_41> al = new ArrayList<>();
        Set<Ex40_41> as = new HashSet<>();
        Map<Ex40_41,Integer> am = new HashMap<>();
        for (int i = 0; i < a.length; i++){
            String s1 = r.next();
            String s2 = r.next();
            a[i] = new Ex40_41(s1,s2);
            al.add(new Ex40_41(s1,s2));
            as.add(new Ex40_41(s1,s2));
//            am.put(new Ex40(s1,s2), i);
        }
        Ex40_41 key1 = a[5];
        Ex40_41 key2 = al.get(5);
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
        Ex40_41.CompEx40 comparator = new Ex40_41.CompEx40();


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
        for(Ex40_41 re : as){
            am.put(re,i++);
        }
        System.out.println(as);
        System.out.println(am);

    }
}
