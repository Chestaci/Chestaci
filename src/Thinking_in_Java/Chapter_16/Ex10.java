package Thinking_in_Java.Chapter_16;

import java.util.*;

public class Ex10 {
}

class ArrayOfGenerics {

//    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<List<String>> ls = new ArrayList<>();
        ls.add(new ArrayList<String>());
        ls.get(0).add(("123123"));

        List<List<BerylliumSphere>> spheres = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            spheres.add(new ArrayList<BerylliumSphere>());
            spheres.get(i).add(new BerylliumSphere());
        }
        System.out.println(ls);
        System.out.println(spheres);




//    @SuppressWarnings("unchecked")
//
//        List<String>[] ls;
//        List[] la = new List[10];
//        ls = (List<String>[]) la; // "Unchecked" warning
//        ls[0] = new ArrayList<String>();
//// Compile-time checking produces an error:
////! ls[1] = new ArrayList<Integer>();
//// The problem: List<String> is a subtype of Object
//        Object[] objects = ls; // So assignment is OK
//// Compiles and runs without complaint:
//        objects[1] = new ArrayList<Integer>();
//// However, if your needs are straightforward it is
//// possible to create an array of generics, albeit
//// with an "unchecked" warning:
//        List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[]) new List[10];
//        for (int i = 0; i < spheres.length; i++)
//            spheres[i] = new ArrayList<BerylliumSphere>();
    }
}