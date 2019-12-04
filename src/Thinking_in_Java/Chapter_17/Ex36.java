package Thinking_in_Java.Chapter_17;

import java.util.*;

public class Ex36 {
}
class SlowMap3<K,V> extends AbstractMap<K,V> {

    public List<Map.Entry<K,V>> kv = new ArrayList<Map.Entry<K,V>>();

    public Map.Entry<K,V> getEntry(Object key){
        if(key == null){
            return null;
        }else {
            for (Map.Entry<K, V> entry : kv) {
                if (key.equals(entry.getKey())) {
                    return entry;
                }
            }
        }
        return null;
    }

    public V put(K key, V value) {
        Map.Entry<K,V> mp = new MapEntry3<K,V>(key, value);
        Map.Entry<K,V> oldM = getEntry(key);
        if(oldM != null) {
            V oldValue = oldM.getValue();
            oldM.setValue(value);
            return oldValue;
        }else {
            kv.add(mp);
            return null;
        }
    }
    public V get(Object key) {
        Map.Entry<K,V> oldM = getEntry(key);
       if(oldM != null){
           return oldM.getValue();
       }
       return null;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private EntrySet entries = new EntrySet();
    public Set<Entry<K,V>> entrySet() { return entries; }

    private class EntrySet extends AbstractSet<Map.Entry<K,V>> {
        public int size() { return kv.size(); }
        public Iterator<Map.Entry<K,V>> iterator() {
            return new Iterator<Map.Entry<K,V>>() {
                private int index = -1;
                public boolean hasNext() {
                    return index < kv.size() - 1;
                }
                @SuppressWarnings("unchecked")
                public Map.Entry<K,V> next() {
                    int i = ++index;
                    return new MapEntry(
                            kv.get(i).getKey(), kv.get(i).getValue());
                }
                public void remove() {
                    kv.remove(index--);
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

class MapEntry3<K,V> implements Map.Entry<K,V> {
    private K key;
    private V value;
    public MapEntry3(K key, V value) {
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
        if(!(o instanceof MapEntry3)) return false;
        MapEntry3 me = (MapEntry3)o;
        return
                (key == null ?
                        me.getKey() == null : key.equals(me.getKey())) &&
                        (value == null ?
                                me.getValue()== null : value.equals(me.getValue()));
    }
    public String toString() { return key + "=" + value; }
}

@SuppressWarnings("unchecked")
class MapEntryComp<K,V> implements
        Comparator<Map.Entry<K,V>> {
    public int compare(Map.Entry<K,V> o1, Map.Entry<K,V> o2) {
        Comparable<K> c1 = (Comparable<K>)o1.getKey();
        return c1.compareTo(o2.getKey());
    }
}

class SlowMap4<K,V> extends SlowMap3<K,V> {
    final private MapEntryComp<K, V> comp = new MapEntryComp<K, V>();

    public V put(K key, V value) {
        Map.Entry<K, V> mp = new MapEntry3<K, V>(key, value);
        Map.Entry<K, V> oldM = getEntry(key);
        if (oldM != null) {
            V oldValue = oldM.getValue();
            oldM.setValue(value);
            return oldValue;
        } else {
            kv.add(mp);
            Collections.sort(kv, comp);
            return null;
        }
    }
    @SuppressWarnings("unchecked")
    public V get(Object key) {
        MapEntry3<K,V> mapEntrySearch = new MapEntry3<K,V>((K) key, null);
        int i = Collections.binarySearch(kv, mapEntrySearch, comp);
        if (i >= 0) {
         return kv.get(i).getValue();
        }
        return null;
    }
}