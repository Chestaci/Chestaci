package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex11 {
    public static void display2(Iterator<Rodent> it) {
        while (it.hasNext()) {
            Rodent r = it.next();
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Hamster(), new Rabbit()};
//        Integer [] rrr = {1, 2, 3};
        ArrayList<Rodent> r1 = new ArrayList<>(Arrays.asList(rodents));
        LinkedList<Rodent> r2 = new LinkedList<>(Arrays.asList(rodents));
        HashSet<Rodent> r3 = new HashSet<>(Arrays.asList(rodents));
        TreeSet<Rodent> r4 = new TreeSet<>(Arrays.asList(rodents));
       // List<Rodent> r0 = new ArrayList<>(Arrays.asList(rodents));


      //  display2(r0.iterator());
        display2(r1.iterator());
        display2(r2.iterator());
        display2(r3.iterator());
        display2(r4.iterator());
    }
}