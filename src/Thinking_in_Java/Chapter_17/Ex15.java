package Thinking_in_Java.Chapter_17;

import net.mindview.util.TextFile;

import java.util.*;

public class Ex15 {
    public static void main(String[] args) {

        List<String> words = new TextFile("src/Thinking_in_Java/Chapter_17/Ex15.java", "\\W+");

        SlowMap<String, Integer> sm = new SlowMap<>();

        for(String word : words) {
            Integer freq = sm.get(word);
            sm.put(word, freq == null ? 1 : freq + 1);
        }
        System.out.println(sm);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}

class SlowMap<K,V> extends AbstractMap<K,V> {
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();
    public V put(K key, V value) {
        V oldValue = get(key); // The old value or null
        if(!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else
            values.set(keys.indexOf(key), value);
        return oldValue;
    }
    public V get(Object key) { // key is type Object, not K
        if(!keys.contains(key))
            return null;
        return values.get(keys.indexOf(key));
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private EntrySet entries = new EntrySet();
    public Set<Map.Entry<K,V>> entrySet() { return entries; }

    private class EntrySet extends AbstractSet<Map.Entry<K,V>> {
        public int size() { return keys.size(); }
        public Iterator<Map.Entry<K,V>> iterator() {
            return new Iterator<Map.Entry<K,V>>() {
                private int index = -1;
                public boolean hasNext() {
                    return index < keys.size() - 1;
                }
                @SuppressWarnings("unchecked")
                public Map.Entry<K,V> next() {
                    int i = ++index;
                    return new MapEntry(
                            keys.get(i), values.get(i));
                }
                public void remove() {
                    keys.remove(index);
                    values.remove(index--);
                }
            };
        }
    }

//    @SuppressWarnings("unchecked")
//    @Override public boolean contains(Object o) {
//        if(o instanceof MapEntry) {
//            MapEntry<K,V> e = (MapEntry<K,V>)o;
//            K key = e.getKey();
//            if(keys.contains(key))
//                return e.equals(
//
//            new MapEntry<K,V>(key, get(key)));
//        }
//        return false;
//    }
//    @SuppressWarnings("unchecked")
//    @Override public boolean remove(Object o) {
//        if(contains(o)) {
//            MapEntry<K,V> e = (MapEntry<K,V>)o;
//            K key = e.getKey();
//            V val = e.getValue();
//            keys.remove(key);
//            values.remove(val);
//            return true;
//        }
//        return false;
//    }
//    @Override public int size() { return keys.size(); }
//    @Override public void clear() {
//        keys.clear();
//        values.clear();
//    }



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public Set<Map.Entry<K,V>> entrySet() {
//        Set<Map.Entry<K,V>> set= new HashSet<Map.Entry<K,V>>();
//        Iterator<K> ki = keys.iterator();
//        Iterator<V> vi = values.iterator();
//        while(ki.hasNext())
//            set.add(new MapEntry<K,V>(ki.next(), vi.next()));
//        return set;
//    }
    public static void main(String[] args) {
        SlowMap<String,String> m = new SlowMap<String,String>();
        m.putAll(Countries.capitals(15));
        System.out.println(m);
        System.out.println(m.get("EGYPT"));
        System.out.println(m.entrySet());
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    public V remove(Object key) {
//        if(!keys.contains(key))
//            return null;
//        int i = keys.indexOf(key);
//        keys.remove(key);
//       return values.remove(i);
//    }
//
//    public void removeAll(Map<K,V> key) {
//
//    }
//
//
//    public void clear() {
//        keys.clear();
//        values.clear();
//    }


}

class MapEntry<K,V> implements Map.Entry<K,V> {
    private K key;
    private V value;
    public MapEntry(K key, V value) {
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
        if(!(o instanceof MapEntry)) return false;
        MapEntry me = (MapEntry)o;
        return
                (key == null ?
                        me.getKey() == null : key.equals(me.getKey())) &&
                        (value == null ?
                                me.getValue()== null : value.equals(me.getValue()));
    }
    public String toString() { return key + "=" + value; }
}

