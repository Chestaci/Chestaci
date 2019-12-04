package Thinking_in_Java.Chapter_17;

import java.util.Arrays;

public class Ex22 {
}

class SimpleHashMap4<K,V> extends SimpleHashMap3<K,V>{
    public V remove(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) return null;
//        if(buckets[index].size() > 1){
//            System.out.println("Внимание, имеет место быть - коллизия! Для полной проверки ключа на содержание значений " + key + " понадобится " + buckets[index].size() + " переборов");
//        }
//        int count = 0;
        for (MapEntry<K, V> iPair : buckets[index]) {
//            count++;
            if (iPair.getKey().equals(key)) {
//                System.out.println("Внимание! Для полной проверки ключа на содержание нужного значения " + key + " понадобилось " + count + " переборов");
                V value = iPair.getValue();
                buckets[index].remove(iPair);
                        if (buckets[index].size() == 0){
                        buckets[index] = null;
                        }
                        return value;
            }
        }
        return null;
    }

    public void clear(){
        Arrays.fill(buckets, null);
    }

    public static void main(String[] args) {
        SimpleHashMap4<String, String> m =
                new SimpleHashMap4<String, String>();
        m.putAll(Countries.capitals(25));
        m.putAll(Countries.capitals(25));
        m.putAll(Countries.capitals(25));
        System.out.println(m);
        System.out.println();
        System.out.println("*********************************************");
        System.out.println(m.get("ANGOLA"));
        System.out.println(m.remove("ANGOLA"));
        System.out.println(m);
        m.clear();
        System.out.println(m);
    }
}



























//