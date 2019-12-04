package Thinking_in_Java.Chapter_17;

import net.mindview.util.CountingGenerator;

import java.util.*;

public class Ex37 {
}

class SimpleHashMap10<K,V> extends AbstractMap<K,V> {
    // Choose a prime number for the hash table
// size, to achieve a uniform distribution:
    static final int SIZE = 997;
    // You can’t have a physical array of generics,
// but you can upcast to one:
    @SuppressWarnings("unchecked")
    ArrayList<MapEntry<K,V>>[] buckets =
            new ArrayList[SIZE];
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null)
            buckets[index] = new ArrayList<MapEntry<K,V>>();
        ArrayList<MapEntry<K,V>> bucket = buckets[index];
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
        if(!found)
            buckets[index].add(pair);
        return oldValue;
    }
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null) return null;
        for(MapEntry<K,V> iPair : buckets[index])
            if(iPair.getKey().equals(key))
                return iPair.getValue();
        return null;
    }
    public Set<Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> set= new HashSet<Map.Entry<K,V>>();
        for(ArrayList<MapEntry<K,V>> bucket : buckets) {
            if(bucket == null) continue;
            for(MapEntry<K,V> mpair : bucket)
                set.add(mpair);
        }
        return set;
    }
    private void rehash(){

    }
    public static void main(String[] args) {
        SimpleHashMap10<String,String> m =
                new SimpleHashMap10<String,String>();
        m.putAll(Countries.capitals(25));
        System.out.println(m);
        System.out.println(m.get("ERITREA"));
        System.out.println(m.entrySet());
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester.run(new SimpleHashMap<Integer,Integer>(), MapPerformance.tests);
        Tester.run(new SimpleHashMap10<Integer,Integer>(), MapPerformance.tests);
    }
}