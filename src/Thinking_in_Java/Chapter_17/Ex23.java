package Thinking_in_Java.Chapter_17;

import java.util.*;


public class Ex23 {
}

class SimpleHashMap5<K,V> extends SimpleHashMap4<K,V>{

    public boolean containsKey(Object k){
        for (LinkedList<MapEntry<K, V>> l : buckets) {
            if (l != null) {
                for (MapEntry<K, V> m : l) {
                   if (m.getKey().equals(k)) {
                       return true;
                   }
                }
            }
        }

        return false;
    }

    @Override
    public int size() {
        int size = 0;
        for (LinkedList<MapEntry<K, V>> l : buckets) {
            if (l != null) {
                size += l.size();
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
    public boolean containsValue(Object value) {
        for (LinkedList<MapEntry<K, V>> l : buckets) {
            if (l != null) {
                for (MapEntry<K, V> m : l) {
                    if (m.getValue().equals(value)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (Map.Entry<? extends K, ? extends V> me : m.entrySet()) {
           put(me.getKey(), me.getValue());
        }
    }


    @Override
    public Set<K> keySet() {
        HashSet<K> set = new HashSet<>();
        for (LinkedList<MapEntry<K, V>> l : buckets) {
            if (l != null) {
                for (MapEntry<K, V> m : l) {
                    set.add(m.getKey());
                }
            }
        }
        return set;
    }

    @Override
    public Collection<V> values() {
        LinkedList<V> ll = new LinkedList<>();
        for (LinkedList<MapEntry<K, V>> l : buckets) {
            if (l != null) {
                for (MapEntry<K, V> m : l) {
                    ll.add(m.getValue());
                }
            }
        }
        return ll;
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
        SimpleHashMap5<String,String> shm = new SimpleHashMap5<>();
        System.out.println(shm.size());
   //     System.out.println(shm.isEmpty());
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
 //       System.out.println(shm.isEmpty());
        System.out.println(shm.containsValue("A"));
        System.out.println(shm.containsValue("I"));
 //       System.out.println(shm.containsKey("A"));
//        System.out.println(shm.containsKey("I"));
        System.out.println(shm.toString());
    }
}