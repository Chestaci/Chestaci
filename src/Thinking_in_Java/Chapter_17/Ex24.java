package Thinking_in_Java.Chapter_17;

import java.util.*;

public class Ex24 {
}

class SimpleHashSet<K> extends AbstractSet<K> {
    static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    LinkedList<K>[] buckets =
            new LinkedList[SIZE];

    @Override
    public boolean add(K key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<K>();
        }
        LinkedList<K> bucket = buckets[index];


        ListIterator<K> it = bucket.listIterator();
        while (it.hasNext()) {
            K iPair = it.next();
            if (iPair.equals(key)) {
                return false;
            }
        }
            it.add(key);
            return true;

    }

    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {
            private int count;
            private boolean canRemove;
            private int index1, index2;
            public boolean hasNext() { return count < size(); }
            public K next() {
                if(hasNext()) {
                    canRemove = true;
                    ++count;
                    for(;;) {
// Position of the next non-empty bucket
                        while(buckets[index1] == null)
                            ++index1;
// Position of the next item to return
                        try {
                            return buckets[index1].get(index2++);
                        } catch(IndexOutOfBoundsException e) {
// Continue search from the next bucket
                            ++index1;
                            index2 = 0;
                        }
                    }
                }
                throw new NoSuchElementException();
            }
            public void remove() {
                if(canRemove) {
                    canRemove = false;
                    buckets[index1].remove(--index2);
                    if(buckets[index1].isEmpty()) // Housekeeping...
                        buckets[index1++] = null;
                    --count;
                } else{
                    throw new IllegalStateException();
            }
            }
        };
    }


    @Override
    public int size() {
        int size = 0;
        for (LinkedList<K> l : buckets) {
            if (l != null) {
                size += l.size();
            }
        }
        return size;

    }




    public static void main(String[] args) {
        SimpleHashSet<Integer> s = new SimpleHashSet<>();

        s.add(11);
        s.add(5);
        s.add(8);
        s.add(7);
        s.add(3);
        s.add(9);
        System.out.println(s);
        Iterator<Integer> it = s.iterator();
        System.out.println(it.next());
        it.remove();
        System.out.println(it.next());
        System.out.println(s);
        s.remove(5);
        System.out.println(s);

    }
}
