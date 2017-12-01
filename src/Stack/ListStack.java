package Stack;

import java.util.Iterator;

public class ListStack<T> implements Stack<T> {
    private Element head;

    //   private static int head2;


    private class Element {
        T value;
        Element next;

        Element(T value) {
            this.value = value;
        }

    }


    @Override
    public void push(T value) {
        Element el = new Element(value);
        if (head == null) {
            head = el;

        } else {
            el.next = head;
            head = el;
        }
    }

    @Override
    public T pop() {
        if (head == null) {
            throw new EmptyStackException("Empty Stack");
        }
        T value = head.value;
        head = head.next;

        return value;


    }


    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {            //анонимный класс
            private Element iteratorHead = head;
            @Override
            public boolean hasNext() {
                return iteratorHead != null;
            }
            @Override
            public T next() {
                T value = (T) iteratorHead.value;
                iteratorHead = iteratorHead.next;
                return value;
            }
        };
    }
}

