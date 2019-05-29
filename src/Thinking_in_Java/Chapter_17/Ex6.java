package Thinking_in_Java.Chapter_17;

import java.util.*;

public class Ex6 {
}

class Unsupported {
//    static void test(String msg, List<String> list) {
//        System.out.println("--- " + msg + " ---");
//        Collection<String> c = list;
//        Collection<String> subList = list.subList(1,8);
//// Copy of the sublist:
//        Collection<String> c2 = new ArrayList<String>(subList);
//        try { c.retainAll(c2); } catch(Exception e) {
//            System.out.println("retainAll(): " + e);
//        }
//        try { c.removeAll(c2); } catch(Exception e) {
//            System.out.println("removeAll(): " + e);
//        }
//        try { c.clear(); } catch(Exception e) {
//            System.out.println("clear(): " + e);
//        }
//        try { c.add("X"); } catch(Exception e) {
//            System.out.println("add(): " + e);
//        }
//        try { c.addAll(c2); } catch(Exception e) {
//            System.out.println("addAll(): " + e);
//        }
//        try { c.remove("C"); } catch(Exception e) {
//            System.out.println("remove(): " + e);
//        }
//// The List.set() method modifies the value but
//// doesn’t change the size of the data structure:
//        try {
//            list.set(0, "X");
//        } catch(Exception e) {
//            System.out.println("List.set(): " + e);
//        }
//
//        ///////////////////////////////////////////////////////////////////////////
////        list.add("Hi!");
////        list.addAll(c2);
////        list.clear();
////        list.remove(5);
//    }

    static void test2(String msg, List<String> list) {
        System.out.println("--- " + msg + " ---");
        List<String> c = list;
        List<String> subList = list.subList(1,8);
// Copy of the sublist:
        Collection<String> c2 = new ArrayList<String>(subList);
        try { c.add(2,"X"); } catch(Exception e) {
            System.out.println("add(): " + e);
        }
        try { c.addAll(3, c2); } catch(Exception e) {
            System.out.println("addAll(): " + e);
        }
        try { c.remove(2); } catch(Exception e) {
            System.out.println("remove(): " + e);
        }
        try { c.set(1,"Set"); } catch(Exception e) {
            System.out.println("set(): " + e);
        }
    }

    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("A B C D E F G H I J K L".split(" "));
        test2("Modifiable Copy", new ArrayList<String>(list));
        test2("Arrays.asList()", list);
        test2("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list)));
    }
}
