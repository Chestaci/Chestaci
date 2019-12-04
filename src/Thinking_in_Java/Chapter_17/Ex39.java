package Thinking_in_Java.Chapter_17;

import java.util.*;

public class Ex39 {
    public static void main(String[] args) {
//        SimpleHashMap11<String,String> m =
//                new SimpleHashMap11<String,String>();
//        m.putAll(Countries.capitals(50));
//        System.out.println(m);





        SimpleHashMap11<String,String> m2 =
                new SimpleHashMap11<String,String>();
        m2.putAll(Countries.capitals(9));
        System.out.println(m2);



    }
}

@SuppressWarnings("unchecked")
class SimpleHashMap11<K,V> extends SimpleHashMap<K,V> {
    private int count; // Number of elements
    private static final double loadFactor = 0.75;
    // Use a prime initial capacity; the JDK uses a number,
// which is a power of 2:
    private final static int initialCapacity = 11;
    private int capacity = initialCapacity;
    private int threshold = (int)(capacity * loadFactor);
    { buckets = new LinkedList[capacity]; }
    @Override public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % capacity;
///////////
System.out.println(index + " " + key.toString() + " до");
///////////
        if(buckets[index] == null){
///////////
System.out.println(index + " " + key.toString() + " если нулл");
///////////
            buckets[index] = new LinkedList<MapEntry<K,V>>();}
///////////
System.out.println(index + " " + key.toString() + " если не нулл");
///////////
        LinkedList<MapEntry<K,V>> bucket = buckets[index];
        MapEntry<K,V> pair = new MapEntry<K,V>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K,V>> it = bucket.listIterator();
        while(it.hasNext()) {
            MapEntry<K,V> iPair = it.next();
            if(iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair); // Replace old with new
                found = true;
                break;
            }
        }
        if(!found) {
            boolean b = false;
            if(count >= threshold){
///////////
System.out.println("Начался рехэш");
///////////
                rehash();
                b = true;
///////////
System.out.println("Кончился рехэш");
///////////
}
if (b){
    index = Math.abs(key.hashCode()) % capacity;
    b = false;
}
///////////
            if(!found){
System.out.println(index + " " + key.toString() + " после рехэша");}
///////////
            if(buckets[index] == null)
                buckets[index] = new LinkedList<MapEntry<K,V>>();
            buckets[index].add(pair);
            ++count;
        }
        return oldValue;
    }
    private boolean isPrime(int candidate) {
        for(int j = 2; j < candidate; j++)
            if(candidate % j == 0) return false;
        return true;
    }
    private int nextPrime(int candidate) {
        while(!isPrime(candidate))
            candidate++;
        return candidate;
    }
    private void rehash() {
// Points to a new Set of the entries, so it
// won't be bothered by what we're about to do:
        Iterator<Map.Entry<K,V>> it = entrySet().iterator();
// Get next prime capacity:
        capacity = nextPrime(capacity * 2);
        System.out.println(
                "Rehashing, new capacity = " + capacity);
        buckets = new LinkedList[capacity];
        threshold = (int)(capacity * loadFactor);
        count = 0;
// Fill new buckets (crude, but it works):
        while(it.hasNext()) {
            Map.Entry<K,V> me = it.next();
            put(me.getKey(), me.getValue());
        }
    }
}

class Captest{
    public static void main(String[] args) {
        int cap = 5;
        int val = 2;
        int newval = val*cap;
        System.out.println(newval);
        cap = 7;
        System.out.println(newval);

    }
}