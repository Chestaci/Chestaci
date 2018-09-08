package Thinking_in_Java.Chapter_11;

import java.util.*;

import static Thinking_in_Java.Chapter_11.StringGenerator.arrayList;

public class Ex6 {
}

class ListFeature2 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<String> pets = arrayList(7);
        System.out.println("1: " + pets);
        String h = new String("Hamster");
        pets.add(h);
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        pets.remove(h);
        String p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        String cymric = new String("Cymric");
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new String("Mouse"));
        System.out.println("9: " + pets);
        List<String> sub = pets.subList(1, 4);
        System.out.println("Частичный список: " + sub);
        System.out.println("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        System.out.println("После сортировки: " + sub);
        System.out.println("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<String> copy = new ArrayList<String>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<String>(pets);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, new String ("Mouse"));
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear();
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.addAll(arrayList(4));
        System.out.println("21: " + pets);
        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);
        String[] pa = pets.toArray(new String[0]);
        System.out.println("23: " + pa[3]);
    }
}

class StringGenerator {
    private static Random rand = new Random(47);
    public static String randomString(){
        int n = (rand.nextInt(20) + 1);
        return new Integer(n).toString();
    }
    public static String[] createArray(int size){
        String[] result = new String[size];
        for(int i = 0; i < size; i++){
            result[i] = randomString();
        }
        return result;
    }

    public static ArrayList<String> arrayList(int size) {
        ArrayList<String> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}