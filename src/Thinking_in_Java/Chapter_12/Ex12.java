package Thinking_in_Java.Chapter_12;

public class Ex12 {
    private String string;
    Ex12(String s){
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
    Sequence (int size){
        items = new Object[size];
    }

    void add (Object x) throws ArrayIndexOutOfBoundsException{
        if(next < items.length) {
            items[next++] = x;
        }else{
            throw new ArrayIndexOutOfBoundsException(); //"Нельзя добавить элементов в количестве большим чем SIZE"
        }
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
        Ex12 e = new Ex12("Konichiva");
        for (int i = 0; i < 8; i++)
            sequence.add(Integer.toString(i));
//        sequence.add(new Ex2("Коничива"));
        sequence.add(e.toString());
        sequence.add(new Ex12("Аригато Гадзаймасу"));
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}