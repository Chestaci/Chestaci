package Thinking_in_Java.Chapter_17;

import java.util.*;

public class Ex21 {
}

class SimpleHashMap3<K,V> extends AbstractMap<K,V> {
    static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets =
            new LinkedList[SIZE];
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<MapEntry<K, V>>();
        }else {
            System.out.println(
                    "Collision while adding\n" + pair
                            + "\nBucket already contains:");
            Iterator<MapEntry<K,V>> it =
                    buckets[index].iterator();
            while(it.hasNext())
                System.out.println(it.next());
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        if(bucket.size() > 0) {
            System.out.println("Внимание, имеет место быть - коллизия! Для полной проверки пары ключ-значение " + key + "=" + value + " понадобится " + bucket.size() + " переборов");
        }
        boolean found = false;
        int probes = 0;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            probes++;
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                System.out.println("Внимание! Для полной проверки коллизии пары ключ-значение " + key + "=" + value + " понадобилось " + probes + " переборов");
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
        if(buckets[index].size() > 1){
            System.out.println("Внимание, имеет место быть - коллизия! Для полной проверки ключа на содержание значений " + key + " понадобится " + buckets[index].size() + " переборов");
        }
        int count = 0;
        for (MapEntry<K, V> iPair : buckets[index]) {
            count++;
            if (iPair.getKey().equals(key)) {
                System.out.println("Внимание! Для полной проверки ключа на содержание нужного значения " + key + " понадобилось " + count + " переборов");
                return iPair.getValue();
            }
        }
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

    public static void main(String[] args) {
        SimpleHashMap3<String, String> m =
                new SimpleHashMap3<String, String>();
        m.putAll(Countries.capitals(25));
        m.putAll(Countries.capitals(25));
        m.putAll(Countries.capitals(25));
//        m.put("ANGOLA", "Luanda1");
//        m.put("ANGOLA", "Luanda2");
//        m.put("ANGOLA", "Luanda3");
        System.out.println(m);
        System.out.println();
        System.out.println("*********************************************");
        System.out.println(m.get("ANGOLA"));
    }
}
