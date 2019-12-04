package Thinking_in_Java.Chapter_17;

import java.util.*;

public class Ex20 {

}

class SimpleHashMap2<K,V> extends AbstractMap<K,V> {
    // Choose a prime number for the hash table
// size, to achieve a uniform distribution:
    static final int SIZE = 997;
    // You can’t have a physical array of generics,
// but you can upcast to one:
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets =
            new LinkedList[SIZE];
//    HashMap<K,Integer> m = new HashMap<>();

    public V put(K key, V value) {
//        Integer freq = m.get(key);
//        m.put(key, freq == null ? 1 : freq + 1);

        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value); // перенесено снизу
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<MapEntry<K, V>>();
        }else {
            ///////////////////////////////////////////////////
            System.out.println(
                    "Collision while adding\n" + pair
                            + "\nBucket already contains:");
            Iterator<MapEntry<K,V>> it =
                    buckets[index].iterator();
            while(it.hasNext())
                System.out.println(it.next());
            ////////////////////////////////////////////
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
       // MapEntry<K, V> pair = new MapEntry<K, V>(key, value); // перенесено выше
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair); // Replace old with new
                found = true;
//                iPair.count++;
                break;
            }
        }
        if (!found)
            buckets[index].add(pair);
        return oldValue;
    }

    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) return null;
        for (MapEntry<K, V> iPair : buckets[index])
            if (iPair.getKey().equals(key))
                return iPair.getValue();
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) continue;
            for (MapEntry<K, V> mpair : bucket)
                set.add(mpair);
        }
        return set;
    }

//    public void showCount() {
//        if (buckets != null) {
//            for (LinkedList<MapEntry<K, V>> ll : buckets) {
//                if (ll != null){
//                for (MapEntry<K, V> me : ll) {
//                    if(me != null) {
//                        System.out.println(me.getKey() + " count = " + me.count);
//                    }
//                }
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        SimpleHashMap2<String, String> m =
                new SimpleHashMap2<String, String>();
        m.putAll(Countries.capitals(25));
        m.putAll(Countries.capitals(25));
        m.putAll(Countries.capitals(25));
        m.put("ANGOLA", "Luanda");
        System.out.println(m);
        System.out.println();
//        System.out.println(m.m);
//        m.showCount();
//        System.out.println(m.get("ERITREA"));
//        System.out.println(m.entrySet());
    }
}