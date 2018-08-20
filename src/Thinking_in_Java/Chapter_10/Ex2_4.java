package Thinking_in_Java.Chapter_10;

public class Ex2_4 {
    private String string;
   Ex2_4(String s){
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
    Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Ex2_4 e = new Ex2_4("Konichiva");
        for (int i = 0; i < 8; i++)
            sequence.add(Integer.toString(i));
//        sequence.add(new Ex2("Коничива"));
        sequence.add(e.toString());
        sequence.add(new Ex2_4("Аригато Гадзаймасу"));
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}