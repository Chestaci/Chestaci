package Thinking_in_Java.Chapter_17;

import java.util.*;

public class Ex10_2 {
    public static void main(String[] args) {
        SortedSetOur<Integer> s1 = new SortedSetOur<>();
        s1.add(6);
        s1.add(2);
        s1.add(5);
        s1.add(9);
        s1.add(1);
        s1.add(5);
        s1.add(1);
        s1.add(9);
        s1.add(3);
        s1.add(7);
        s1.add(0);
//        s1.add(null);

        System.out.println(s1);
        s1.remove(5);
        s1.remove(8);
//        s1.remove(null);

        System.out.println(s1);
        System.out.println(s1.first());
        System.out.println(s1.last());
    }
}

class SortedSetOur<T> implements SortedSet<T> {

    private LinkedList<T> ll = new LinkedList<>();

    @Override
    public String toString() {
        return ll.toString();
    }

    @Override
    public Comparator<T> comparator() {
        return new ComparatorForSortedSetOur<T>();
    }

    @Override
    public SortedSet<T> subSet(T o, T e1) {
        return null;
    }

    @Override
    public SortedSet<T> headSet(T o) {
        return null;
    }

    @Override
    public SortedSet<T> tailSet(T o) {
        return null;
    }

    @Override
    public T first() {
        if (ll.isEmpty()) {
            return null;
        }
        return ll.getFirst();
    }

    @Override
    public T last() {
        if (ll.isEmpty()) {
            return null;
        }
        return ll.getLast();
    }

    @Override
    public int size() {
        return ll.size();
    }

    @Override
    public boolean isEmpty() {
        return ll.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return ll.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return ll.iterator();
    }

    @Override
    public Object[] toArray() {
        return ll.toArray();
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return ll.toArray(objects);
    }

    @Override
    public boolean add(T o) {
        if(!ll.contains(o)){
            boolean b = ll.add(o);
            ll.sort(comparator());
            return b;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return ll.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return ll.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return ll.addAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return ll.retainAll(collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return ll.removeAll(collection);
    }

    @Override
    public void clear() {
        ll.clear();
    }
}
class ComparatorForSortedSetOur<T> implements Comparator<T>{

    @Override
    public int compare(T t, T t1) {
        return t.hashCode() < t1.hashCode() ? -1 : (t.hashCode() == t1.hashCode() ? 0 : 1);
    }
}
