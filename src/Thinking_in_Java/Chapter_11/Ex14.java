package Thinking_in_Java.Chapter_11;



import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex14 {


        static void addInMiddle (List<Integer> list, int i){
        ListIterator<Integer> it = list.listIterator((list.size())/2);
        it.add(i);
    }

    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        for (int i = 0; i < 42; i++)
            Ex14.addInMiddle(a,i);
        System.out.println(a);
    }
}

