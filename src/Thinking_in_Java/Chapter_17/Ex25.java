package Thinking_in_Java.Chapter_17;

import java.util.*;

public class Ex25 {
}

class MapEntry2<K,V> implements Map.Entry<K,V> {
    private K key;
    private V value;
    MapEntry2<K, V> next;

    public MapEntry2(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() { return key; }
    public V getValue() { return value; }
    public V setValue(V v) {
        V result = value;
        value = v;
        return result;
    }
    public int hashCode() {
        return (key==null ? 0 : key.hashCode()) ^
                (value==null ? 0 : value.hashCode());
    }
    public boolean equals(Object o) {
        if(!(o instanceof MapEntry2)) return false;
        MapEntry2 me = (MapEntry2)o;
        return
                (key == null ?
                        me.getKey() == null : key.equals(me.getKey())) &&
                        (value == null ?
                                me.getValue()== null : value.equals(me.getValue()));
    }
    public String toString() { return key + "=" + value; }
}


class SimpleHashMap7<K,V> extends AbstractMap<K,V> {
    static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    MapEntry2<K, V> [] buckets = new MapEntry2[SIZE];

    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        MapEntry2<K, V> pair = new MapEntry2<K, V>(key, value);
        if (buckets[index] == null) {
            buckets[index] = pair;
        } else {
            MapEntry2<K, V> first = buckets[index];
            while (first.next != null) {
                if (first.getKey().equals(key)) {
                    oldValue = first.getValue();
                    first.setValue(value);
                    return oldValue;
                }
                first = first.next;
            }
            if (first.next == null) {
                if (first.getKey().equals(key)) {
                    oldValue = first.getValue();
                    first.setValue(value);
                    return oldValue;
                }
                first.next = pair;
            }
        }
        return oldValue;
    }

    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) return null;
        for(MapEntry2<K,V> pair = buckets[index]; pair != null; pair = pair.next)
            if (pair.getKey().equals(key)) {
                 return pair.getValue();
            }
        return null;
    }


    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
        for (MapEntry2<K, V> bucket : buckets) {
            for(MapEntry2<K,V> pair = bucket; pair != null; pair = pair.next)
                set.add(pair);
        }
        return set;
    }

    public V remove(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        MapEntry2<K, V> prev = null;
        if (buckets[index] == null) return null;
        for(MapEntry2<K,V> pair = buckets[index]; pair != null; pair = pair.next){
            if (pair.getKey().equals(key)) {
                V value = pair.getValue();
                if(prev != null) {
                    prev.next = pair.next;
                } else {
                    buckets[index] = pair.next;
                }
                return value;
            }
            if (prev == null){
                prev = pair;
            }else {
                prev = prev.next;
            }
        }
        return null;
    }

    public void clear(){
        Arrays.fill(buckets, null);
    }


    public boolean containsKey(Object k){
        for (MapEntry2<K, V> l : buckets) {
            for (MapEntry2<K, V> pair = l; pair != null; pair = pair.next) {
                 if (pair.getKey().equals(k)) {
                        return true;
                    }
                }
            } return false;
    }

    @Override
    public int size() {
        int size = 0;
        for (MapEntry2<K, V> l : buckets) {
            for(MapEntry2<K,V> pair = l ; pair != null; pair = pair.next){
            size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0)
            return true;
        return false;
    }



    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Map.Entry<? extends K, ? extends V> me : m.entrySet()) {
            put(me.getKey(), me.getValue());
        }
    }


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return entrySet().toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public static void main(String[] args) {
        SimpleHashMap7<String, String> m =
                new SimpleHashMap7<String, String>();
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


        SimpleHashMap7<String, String> m2 =
                new SimpleHashMap7<String, String>();
        m2.putAll(Countries.capitals(25));
        m2.putAll(Countries.capitals(25));
        m2.putAll(Countries.capitals(25));
        System.out.println(m2);
        System.out.println();
        System.out.println("*********************************************");
        System.out.println(m.equals(m2));
        System.out.println(m2.get("ANGOLA"));
        System.out.println(m2.remove("ANGOLA"));
        System.out.println(m2);
        m2.clear();
        System.out.println(m2);





        SimpleHashMap7<String,String> shm = new SimpleHashMap7<>();
        System.out.println(shm.size());
             System.out.println(shm.isEmpty());
        shm.put("a", "A");
        shm.put("b", "B");
        System.out.println(shm.size());
        shm.put("c", "C");
        shm.put("d", "D");
        shm.put("e", "E");
        shm.put("f", "F");
        shm.put("g", "G");
        shm.put("h", "H");
        shm.put("A", "a");
        System.out.println(shm.size());
               System.out.println(shm.isEmpty());
        System.out.println(shm.containsValue("A"));
        System.out.println(shm.containsValue("I"));
               System.out.println(shm.containsKey("A"));
        System.out.println(shm.containsKey("I"));
        System.out.println(shm.toString());

    }
}







































//class SimpleHashMap6<K,V> extends AbstractMap<K,V> {
//    // Choose a prime number for the hash table
//// size, to achieve a uniform distribution:
//    static final int SIZE = 997;
//    // You can’t have a physical array of generics,
//// but you can upcast to one:
//    @SuppressWarnings("unchecked")
//    LinkedList<MapEntry<K,V>>[] buckets =
//            new LinkedList[SIZE];
//    public V put(K key, V value) {
//        V oldValue = null;
//        int index = Math.abs(key.hashCode()) % SIZE;
//        if(buckets[index] == null)
//            buckets[index] = new LinkedList<MapEntry<K,V>>();
//        LinkedList<MapEntry<K,V>> bucket = buckets[index];
//        MapEntry<K,V> pair = new MapEntry<K,V>(key, value);
//        boolean found = false;
//        ListIterator<MapEntry<K,V>> it = bucket.listIterator();
//        while(it.hasNext()) {
//            MapEntry<K,V> iPair = it.next();
//            if(iPair.getKey().equals(key)) {
//                oldValue = iPair.getValue();
//                it.set(pair); // Replace old with new
//                found = true;
//                break;
//            }
//        }
//        if(!found)
//            buckets[index].add(pair);
//        return oldValue;
//    }
//    public V get(Object key) {
//        int index = Math.abs(key.hashCode()) % SIZE;
//        if(buckets[index] == null) return null;
//        for(MapEntry<K,V> iPair : buckets[index])
//            if(iPair.getKey().equals(key))
//                return iPair.getValue();
//        return null;
//    }
//    public Set<Entry<K,V>> entrySet() {
//        Set<Map.Entry<K,V>> set= new HashSet<Map.Entry<K,V>>();
//        for(LinkedList<MapEntry<K,V>> bucket : buckets) {
//            if(bucket == null) continue;
//            for(MapEntry<K,V> mpair : bucket)
//                set.add(mpair);
//        }
//        return set;
//    }
//    public static void main(String[] args) {
//        SimpleHashMap6<String,String> m =
//                new SimpleHashMap6<String,String>();
//        m.putAll(Countries.capitals(25));
//        System.out.println(m);
//        System.out.println(m.get("ERITREA"));
//        System.out.println(m.entrySet());
//    }
//}