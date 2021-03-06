package Thinking_in_Java.Chapter_15;

import Thinking_in_Java.Chapter_14.Ex12.coffee.Coffee;
import Thinking_in_Java.Chapter_14.Ex12.coffee.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.*;

public class Ex13 {
}

class Generators {
    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static <T> List<T>
fill(List<T> coll, Generator<T> gen, int n) {
    for(int i = 0; i < n; i++)
        coll.add(gen.next());
    return coll;
}

    public static <T> Queue<T>
    fill(Queue<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static <T> Set<T>
    fill(Set<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static <T> LinkedList<T>
    fill(LinkedList<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
//        Collection<Coffee> coffee = fill(
//                new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
//        for(Coffee c : coffee)
//            System.out.println(c);
//        Collection<Integer> fnumbers = fill(
//                new ArrayList<Integer>(), new Fibonacci(), 12);
//        for(int i : fnumbers)
//            System.out.print(i + ", ");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<Integer> list = fill(
                new ArrayList<>(), new Fibonacci(), 12);

            System.out.print(list + ", " + list.getClass());

        System.out.println();

        Queue<Integer> queue = fill(new ArrayDeque<>(), new Fibonacci(), 12);
            System.out.print(queue + ", " + queue.getClass());

        System.out.println();

        Set<Integer> set = fill(
                new HashSet<>(), new Fibonacci(), 12);
            System.out.print(set + ", " + set.getClass());

        System.out.println();

//        Collection<Integer> llist = fill(
        LinkedList<Integer> llist = fill(
                new LinkedList<Integer>(), new Fibonacci(), 12);
        System.out.print(llist + ", " + llist.getClass());
    }
}
