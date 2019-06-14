package Thinking_in_Java.Chapter_17;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex10 <T> {
    LinkedList<T> a = new LinkedList<T>();

    @Override
    public String toString() {
        return a.toString();
    }

    public int compareTo (T o, T b) {
        return (o.hashCode() < b.hashCode() ? -1 : (o.hashCode() == b.hashCode() ? 0 : 1));
    }

    public void add (T c) {
        if (!a.contains(c)) {
//            System.out.println("Повтор");
            a.add(c);
            Collections.sort(a,Collections.reverseOrder());

//            if (a.isEmpty()) {
//                a.add(c);
//            } else {
//              //  for (T val : a) {
//
//                  for (int j = 0; j < a.size(); j++) {
//                      T val = a.get(j);
//                   int i = compareTo(c, val);
//                   if (i == -1) {
//                //       int d = a.indexOf(val) - 1;
//                       a.add(j, c);
//                   }
//                   if (compareTo(c,a.getLast()) != -1){ //get(a.size()-1)
////                      int s = a.size() - 1;
//                       a.add(a.indexOf(a.getLast()),c);
//                   }
//
//                }
//
//
//            }

//            Iterator it = a.iterator();
//            it.
        }
    }

    public static void main(String[] args) {
       Ex10<Integer> ex10 = new Ex10<>();

        ex10.add(1);
        ex10.add(5);
        ex10.add(3);
        ex10.add(8);
        ex10.add(2);
        ex10.add(1);
        ex10.add(5);

        ex10.add(1);
        ex10.add(5);
        ex10.add(3);
        ex10.add(8);
        ex10.add(2);
        ex10.add(1);
        ex10.add(5);

        System.out.println(ex10);

    }

}

class Test{
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        l.add(1, 9);
        l.add(3, 8);
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.add(11);
        System.out.println(l);
    }
}


class SortedSet10<E> extends LinkedList<E> {
    int compare(E e1, E e2) {
        int c = e1.hashCode() - e2.hashCode();
        return (c < 0) ? -1 : ((c == 0) ? 0 : 1);
    }
    public boolean add(E e) {
        if(!this.contains(e)) {
            Iterator<E> it = this.iterator();
            int index = 0;
            while(it.hasNext()) {
                if(compare(it.next(), e) < 1)
                    index++;
            }
            add(index, e);
            return true;
        }
        return false;
    }
}

class T {
    @Override
    public String toString() {
        return "T{}" + hashCode();
    }
}

class Ex10a {
    public static void main(String[] args) {
        SortedSet10<T> ss = new SortedSet10<T>();
        ss.add(new T());
        ss.add(new T());
        ss.add(new T());
        ss.add(new T());
        System.out.println(ss);
        SortedSet10<Integer> ss2 = new SortedSet10<Integer>();
        ss2.add(6);
        ss2.add(8);
        ss2.add(2);
        ss2.add(4);
        ss2.add(2);
        ss2.add(8);
        System.out.println(ss2);
        SortedSet10<String> ss3 = new SortedSet10<String>();
        ss3.add("three");
        ss3.add("three");
        ss3.add("seven");
        ss3.add("hi");
        ss3.add("two");
        ss3.add("one");
        System.out.println(ss3);
    }
}