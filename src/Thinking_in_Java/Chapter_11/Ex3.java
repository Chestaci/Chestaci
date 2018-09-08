package Thinking_in_Java.Chapter_11;

import java.util.ArrayList;
import java.util.Collection;

public class Ex3 {
}

interface Selector{
    boolean end();
    Object current();
    void next();
}
class Sequence{
    private ArrayList <Object> items = new ArrayList<>();

    void add(Object x){
        items.add(x);
    }

    private class SequenceSelector implements Selector{
        private int i = 0;

        Sequence outer(){
            return Sequence.this;
        }

        @Override
        public boolean end(){
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if(i < items.size())
                i++;
        }
}
    Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
//        Collection<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            sequence.add(i);
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}