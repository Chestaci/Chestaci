package Thinking_in_Java.Chapter_15;

import java.util.ArrayList;
import java.util.List;

public class Ex27 {
    public static void main(String[] args) {
        //List<Number> list = new ArrayList<Integer>();
        List<? extends Number> list = new ArrayList<Integer>();
        //list.add(new Integer(0))
        list.add(null);
        System.out.println(list.get(0));

    }
}
