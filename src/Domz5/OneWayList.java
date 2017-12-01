package Domz5;

public class OneWayList<T> implements CustomList<T> {

    private Element head;
    private Element tail;

    private class Element {
        Element next;
        T value;
        Element(T value) {
            this.value = value;
        }
    }

    @Override
    public void add(T value) {
        Element el = new Element(value);
        if (head == null) {
            head = el;
            tail = el;
        } else {
//            Element current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = el;

            // tail - текущий последний элемент
            // tail.next = null
            // добавляем новый элемент в конец
            tail.next = el; // пока еще последний элемент
            // ссылает на новый элемент
            tail = el;
        }
    }

    @Override
    public void delete(int index) {

    }

}