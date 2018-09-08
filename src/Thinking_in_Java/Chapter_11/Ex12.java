package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex12 {
    static Collection collAddInteger(Collection<Integer> col, int t){
        for (int i = 0 ; i < t; i++){
            col.add(i);
        }
        return col;
    }

    public static void main(String[] args) {
        //      List<Integer> list1 = new ArrayList<Integer>();
     //   collAddInteger(list1,10);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<Integer>();
      //  List<Integer> list3 = new ArrayList<Integer>();
        ListIterator<Integer> it = list1.listIterator(10);
//        while (it.hasNext()){
//          //  list2.add(it.next());
//            //        Integer list2
//            it.next();
//        }
        while (it.hasPrevious()){
            list2.add(it.previous());
            //        Integer list2
        }
        System.out.println(list2);
      //  System.out.println(list3);
    }
}
