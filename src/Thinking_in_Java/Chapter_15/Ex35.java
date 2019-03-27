package Thinking_in_Java.Chapter_15;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.*;
import Thinking_in_Java.Chapter_14.Ex12.coffee.*;

import java.util.*;

public class Ex35 {
}

class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyLatte) {
        probablyLatte.add(new Cappuccino());
    }
    public static void main(String[] args) {
        List<Latte> latte1 = new ArrayList<Latte>();
        oldStyleMethod(latte1); // Quietly accepts a Cat
        List<Latte> latte2 = Collections.checkedList(
                new ArrayList<Latte>(), Latte.class);
        try {
            oldStyleMethod(latte2); // Throws an exception
        } catch(Exception e) {
            System.out.println(e);
        }
// Derived types work fine:
        List<Coffee> coffees = Collections.checkedList(
                new ArrayList<Coffee>(), Coffee.class);
        coffees.add(new Latte());
        coffees.add(new Cappuccino());
    }
}
