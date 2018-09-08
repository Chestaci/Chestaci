package Thinking_in_Java.Chapter_10.Ex20pack;

public class Ex20 {
    private String string;
    Ex20(String s){
        string = s;
    }
    public String toString(){
        return string;
    }
}

interface Selector{
    boolean end();
    Object current();
    void next();
}
class Sequence{
    private Object[] items;
    private int next = 0;
    Sequence(int size){
        items = new Object[size];
    }

    void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector{
        private int i = 0;

        Sequence outer(){
            return Sequence.this;
        }

        @Override
        public boolean end(){
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length)
                i++;
        }
    }
    private class SequenceReverseSelector implements Selector{
        private int j = (items.length);

        Sequence outer(){
            return Sequence.this;
        }

        @Override
        public boolean end(){
            return j == 0;
        }

        @Override
        public Object current() {
            return items[j - 1];
        }

        @Override
        public void next() {
            if(j >= 0)
                j--;
        }
    }
    Selector selector(){
        return new SequenceSelector();
    }
    Selector reverseSelector(){
        return new SequenceReverseSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Ex20 e = new Ex20("Konichiva");
        for (int i = 0; i < 8; i++)
            sequence.add(Integer.toString(i));
//        sequence.add(new Ex20("Коничива"));
        sequence.add(e.toString());
        sequence.add(new Ex20("Аригато Гадзаймасу"));
        Selector selector = sequence.selector();
        Selector reverseselector = sequence.reverseSelector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
        while(!reverseselector.end()){
            System.out.print(reverseselector.current() + " ");
            reverseselector.next();
        }
    }
}