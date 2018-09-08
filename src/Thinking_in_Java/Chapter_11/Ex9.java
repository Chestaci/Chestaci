package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex9 {
    private String string;
    Ex9(String s){
        string = s;
    }
    public String toString(){
        return string;
    }
}

class Sequence2 {
    ArrayList<Object> items = new ArrayList<>();

    void add(Object x) {
        items.add(x);
    }

    public Iterator iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        Sequence2 s = new Sequence2();
        Ex9 e = new Ex9("Konichiva");
        for (int i = 0; i < 8; i++)
            s.add(Integer.toString(i));
        s.add(e);
        s.add(new Ex9("Hi"));
        s.add(new Ex9 ("Привет"));

        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

