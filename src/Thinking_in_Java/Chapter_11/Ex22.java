package Thinking_in_Java.Chapter_11;

import net.mindview.util.TextFile;

import java.util.*;

public class Ex22 {

    public static void main(String[] args) {
        Set<Box> set = new HashSet<>();
        String s = "Мистер Вайт и Саюри любят вкусный чай!" + " И вообще, они любят практически любой чай!" + " Или не так, Мистер Вайт и Саюри, считают," + " что чай, любой, никак не может быть плохим, если его качественно и правильно заварить! =) чай чай чай чай чай чай чай";
//        String s = "tea tea tea tea tea tea\n" + "Чай Чай Чай Чай Чай Чай Чай Чай Чай Чай Чай Чай\n" + "TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA TEA";
        for (String word : s.split(" ")) {
//        for (String word : new TextFile("Ex16.txt", "\\W+")) {
            Box b = new Box(word);
            if (set.contains(b)) {
                List<Box> list = new ArrayList<>(set);
                for (Box box : list) {
                    if (box.equals(b)) {
                        int c = (box.getCount() + 1);
                        set.remove(b);
                        b.setCount(c);
                        set.add(b);
                    }
                }
            } else {
                set.add(b);
            }
//             if (set.contains(b)) {
//                Iterator<Box> ob = set.iterator();
//                while (ob.hasNext()) {
//                    Box itOb = ob.next();
//                    if (b.equals(itOb)) {
//                        int c = (itOb.getCount() + 1);
//                        set.remove(b);
//                        b.setCount(c);
//                        set.add(b);
//                    }
//                }
//            } else {
//                set.add(b);
//            }
        }
        System.out.println(set);
    }
}

class Box {
    String word;
    int count = 0;

    public Box (String word) {
        this.word = word;
        this.count = 1;
    }

    @Override
    public String toString() {
        return "(" + word +  " = " + count + ")";
    }

    int getCount(){
        return count;
    }
    void setCount(int i){
        this.count = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;

        Box box = (Box) o;

        return word != null ? word.equals(box.word) : box.word == null;
    }

    @Override
    public int hashCode() {
        return word != null ? word.hashCode() : 0;
    }
}
