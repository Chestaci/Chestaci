package Thinking_in_Java.Chapter_11;

import Chestaci.Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex7 {

    String s;


    public Ex7(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }


}

class Ex7_1 {
    public static void main(String[] args) {

        Ex7[] a = {new Ex7("Hi"), new Ex7("Konichiwa"), new Ex7("Привет")};
        List<Ex7> b = new ArrayList<>();
        for (Ex7 e : a) b.add(e);
        System.out.println(b);
        List<Ex7> sub = b.subList(1,3);
        System.out.println(sub);
        sub = Arrays.asList(b.get(2));
        System.out.println(sub);
        List<Ex7> copy = new ArrayList<>(b);
        copy.removeAll(sub);
        System.out.println(copy);
    }

}