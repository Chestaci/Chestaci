package Thinking_in_Java.Chapter_15;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
//    private String string;
//    Ex4(String s){
//        string = s;
//    }
//    public String toString(){
//        return string;
//    }
}

interface Selector{
    boolean end();
    Object current();
    void next();
}
class Sequence<T>{
    //private T[] items;
    private List<T> list = new ArrayList<T>();
    private int next = 0;
    Sequence(List<T> list) { this.list = list;
    }

    void add(T x){
        list.add(x);
    }
    private class SequenceSelector implements Selector{
        private int i = 0;

        Sequence outer(){
            return Sequence.this;
        }

        @Override
        public boolean end(){
            return i == list.size();
        }

        @Override
        public T current() {
            return list.get(i);
        }

        @Override
        public void next() {
            if(i < list.size())
                i++;
        }
    }
    Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        Sequence<String> sequence = new Sequence<String>(ls);
//        Ex4 e = new Ex4("Konichiva");
        for (int i = 0; i < 8; i++)
            sequence.add(Integer.toString(i));
//        sequence.add(new Ex4("Коничива"));
//        sequence.add(e.toString());
//        sequence.add(new Ex4("Аригато Гадзаймасу"));
//        sequence.add(e);
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }

    }
}