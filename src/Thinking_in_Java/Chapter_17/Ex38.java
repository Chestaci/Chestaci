package Thinking_in_Java.Chapter_17;

import java.util.*;

import static net.mindview.util.Print.print;

public class Ex38 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int l = 5;
        for (int i = 0 ; i < l; i++){
            hashMap.put(i,(i*10));
        }
        long t1 = System.currentTimeMillis();
        for(int j = 0; j < 10000000; j++) {
            hashMap.get(15);
            hashMap.get(48);
        }
        long t2 = System.currentTimeMillis();
        print("hashMap : " + (t2 - t1));
        double n1 = 16;
        double n2 = l;
        double n = n2 / n1;

        System.out.println("loadfactor hashMap = " + n);

        System.out.println();

        HashMap<Integer,Integer> hashMap2 = new HashMap<>(32);
        hashMap2.putAll(hashMap);
        t1 = System.currentTimeMillis();
        for(int j = 0; j < 10000000; j++) {
            hashMap.get(15);
            hashMap.get(48);
        }
        t2 = System.currentTimeMillis();
        n1 = 32;
        n2 = l;
        n = n2 / n1;
        print("hashMap2 : " + (t2 - t1));
        System.out.println("loadfactor hashMap = " + n);

    }
}

class E38_HashMapLoadFactor {
    public static
    void testGet(Map<String,String> filledMap, int n) {
        for(int tc = 0; tc < 1000000; tc++)
            for(int i = 0; i < Countries.DATA.length; i++) {
                String key = Countries.DATA[i][0];
                filledMap.get(key);
            }
    }
    public static void main(String args[]) {
// Initial capacity 16:
        HashMap<String,String> map1 =
                new HashMap<String,String>();
// Fill to less than threshold:
        map1.putAll(Countries.capitals(11));
// Initial capacity 32:
        HashMap<String,String> map2 =
                new HashMap<String,String>(32);
        map2.putAll(map1);
        long t1 = System.currentTimeMillis();
        testGet(map1, 11);
        long t2 = System.currentTimeMillis();
        print("map1 : " + (t2 - t1));
        t1 = System.currentTimeMillis();
        testGet(map2, 11);
        t2 = System.currentTimeMillis();
        print("map2 : " + (t2 - t1));
        System.out.println(map1);
        System.out.println(map2);
    }
}