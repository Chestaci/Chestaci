package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex4 {
 final String [] name =  {"Тоторо","Чернушки", "Мэй", "Котобус", "Сацуки", "Тацуо", "Ясуко", "Канта"};
 int i = 0;

 String next () {
     if (i < name.length) {
         return name[i++];
     } else {
         i = 0;
         return name [i++];
     }

 }

    public static void main(String[] args) {
        Ex4 ex = new Ex4();
          for (int i = 0; i < 11; i++){
        System.out.println(ex.next());
          }
    }
 }

 class Repository {
    Ex4 bbb = new Ex4();
    String [] a = new String [10];
    ArrayList<String> b = new ArrayList<>();
    LinkedList<String> c = new LinkedList<>();
    HashSet<String> d = new HashSet<>();
    LinkedHashSet<String> e = new LinkedHashSet<>();
    TreeSet<String> f = new TreeSet<>();

//    void fill () {
//        for (int i = 0; i < a.length; i++){
//            a[i] =  bbb.next();
//            System.out.print(a[i]+ " ");
//      }
//        System.out.println();
//
//         for (int i = 0; i < a.length; i++) {
//             b.add(bbb.next());
//             System.out.print(b.get(i)+ " ");
//         }
//        System.out.println();
//
//        for (int i = 0; i < a.length; i++) {
//            c.add(bbb.next());
//            System.out.print(c.get(i)+ " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < a.length; i++) {
//            d.add(bbb.next());
//
//        }
//
//
//        for (int i = 0; i < a.length; i++) {
//            e.add(bbb.next());
//
//        }
//
//
//        for (int i = 0; i < a.length; i++) {
//            f.add(bbb.next());
//
//        }
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//    }
void fill () {
    for (int i = 0; i < a.length; i++){
       String str = bbb.next();
        a[i] =  str;
        b.add(str);
        c.add(str);
        d.add(str);
        e.add(str);
        f.add(str);
    }

//    for (int i = 0; i < a.length; i++){
//        System.out.print(a[i] +" ");
//    }
//    System.out.println(b);
//    System.out.println(c);
//    System.out.println(d);
//    System.out.println(e);
//    System.out.println(f);
}
void show(){
    System.out.print("[");
    for (int i = 0; i < a.length; i++){
        if(i == (a.length - 1)){
            System.out.print(a[i]);
        }else {
            System.out.print(a[i] + ", ");
        }
    }
    System.out.print("]");
    System.out.println();
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
}

     public static void main(String[] args) {
         Repository r = new Repository();
        r.fill();
        r.show();
     }
 }