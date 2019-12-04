package Thinking_in_Java.Chapter_17;

import java.util.*;


public class Ex18 {
}

class SlowSet<K> extends AbstractSet<K> {

    private List<K> keys = new ArrayList<K>();

    public boolean add(K key) {
        if(!keys.contains(key)) {
            keys.add(key);
            return true;
        } else
        return false;
    }

    @Override
    public Iterator<K> iterator() {
        return keys.iterator();
    }

    @Override
    public int size() {
        return keys.size();
    }

//    private List<K> keys = new ArrayList<K>();
//
//    public K put(K key) {
//        if(!keys.contains(key)) {
//            keys.add(key);
//        } else
//            keys.indexOf(key);
//        return key;
//    }
//    public K get(Object key) { // key is type Object, not K
//        if(!keys.contains(key))
//            return null;
//        return keys.get(keys.indexOf(key));
//    }
//
//    private EntrySet entries = new EntrySet();
//    public Set<Map.Entry<K>> entrySet() { return entries; }
//
//    private class EntrySet extends AbstractSet<Map.Entry<K>> {
//        public int size() { return keys.size(); }
//        public Iterator<Map.Entry<K>> iterator() {
//            return new Iterator<Map.Entry<K>>() {
//                private int index = -1;
//                public boolean hasNext() {
//                    return index < keys.size() - 1;
//                }
//                @SuppressWarnings("unchecked")
//                public Map.Entry<K> next() {
//                    int i = ++index;
//                    return new MapEntry(
//                            keys.get(i), values.get(i));
//                }
//                public void remove() {
//                    keys.remove(index);
//                    values.remove(index--);
//                }
//            };
//        }
//    }
    public static void main(String[] args) {
        SlowSet<String> m = new SlowSet<String>();
        m.addAll(Countries.names(15));
        System.out.println(m);
        System.out.println("********************************************************************************");
        m.addAll(Countries.names(15));
        m.addAll(Countries.names(15));
        System.out.println(m);
    }
}
