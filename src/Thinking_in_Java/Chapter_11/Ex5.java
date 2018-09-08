package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex5 {
}

/*
class ListFeature{
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new Mouse());
        System.out.println("9: " + pets);
        List<Pet> sub = pets.subList(1, 4);
        System.out.println("Частичный список: " + sub);
        System.out.println("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        System.out.println("После сортировки: " + sub);
        System.out.println("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, new Mouse());
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear();
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        System.out.println("21: " + pets);
        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println("23: " + pa[3].id());
    }
}
*/

class ListFeature{
    public static void main(String[] args) {
        Random rand = new Random(47);
        IntegerGenerator ig = new IntegerGenerator();
        List<Integer> pets = ig.arrayList(7);
        System.out.println("1: " + pets);
        Integer h = new Integer(111);
        pets.add(h);
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        pets.remove(h);
        Integer p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        Integer cymric = new Integer(131);
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, 45);
        System.out.println("9: " + pets);
        List<Integer> sub = pets.subList(1, 4);
        System.out.println("Частичный список: " + sub);
        System.out.println("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        System.out.println("После сортировки: " + sub);
        System.out.println("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<Integer>(pets);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, 91);
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear();
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.addAll(ig.arrayList(4));
        System.out.println("21: " + pets);
        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);
        Integer[] pa = pets.toArray(new Integer[0]);
       // System.out.println("23: " + pa[3].id());
    }
}

class IntegerGenerator {
    private Random rand = new Random(47);
    public Integer randomInteger(){
        int n = (rand.nextInt(20) + 1);
        return n;
    }
    public Integer[] createArray(int size){
        Integer[] result = new Integer[size];
        for(int i = 0; i < size; i++){
            result[i] = randomInteger();
        }
        return result;
    }

    public ArrayList<Integer> arrayList(int size) {
        ArrayList<Integer> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}

