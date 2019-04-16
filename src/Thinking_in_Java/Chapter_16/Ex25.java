package Thinking_in_Java.Chapter_16;

import java.util.*;

import static net.mindview.util.Print.print;

public class Ex25 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Ex25 ex25 = new Ex25();
        System.out.println(list.getClass().getName());
        System.out.println(list);
        System.out.println(list.get(4));
        list.add(6);
        System.out.println(list);
        list.addAll(Arrays.asList(7, 8));
        System.out.println(list);
        List list2 = list.subList(2, 4);
        System.out.println(list2);
        System.out.println(list);

        class MyArrayList<T> extends ArrayList<T> {
            MyArrayList(Collection<? extends T> c) { super(c); }
            MyArrayList(int initialCapacity) {
                super(initialCapacity);
            }
            List<T> getReversed() {
                List<T> reversed = new MyArrayList<T>(size());
                ListIterator<T> it = listIterator(size());
                while(it.hasPrevious())
                    reversed.add(it.previous());
                return reversed;
            }
        }

        MyArrayList<Integer> list3 =
        new MyArrayList<Integer>(list);
        print(list3.getClass().getSimpleName());
        print(list3.getReversed());
    }
}
//
//class MyList extends Ex25{
//    public void getReversed(){
//       ArrayList reversed = this.list;
//      Collections.sort(reversed, Collections.reverseOrder());
//        System.out.println(reversed);
//    }
//
//    public static void main(String[] args) {
//        MyList myList = new MyList();
//        System.out.println(myList.list.getClass().getName());
//        myList.getReversed();
//    }
//}