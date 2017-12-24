package Chestaci.TwoQueue;

public class TwoQueue {
    private ObjectBoxTQ head = null;
    private ObjectBoxTQ tail = null;
    private int size = 0;

    public ObjectBoxTQ getHead() {
        return head;
    }

    public void setHead(ObjectBoxTQ head) {
        this.head = head;
    }

    public ObjectBoxTQ getTail() {
        return tail;
    }

    public void setTail(ObjectBoxTQ tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(Object object){
        ObjectBoxTQ obj = new ObjectBoxTQ();
        obj.setObject(object);
        if (head == null){
            head = obj;
            tail = obj;
        }else {
            tail.setNext(obj);
        }
        obj.setPrev(tail);

        tail = obj;
        size++;
    }

    public Object pull(){
        if (size == 0){
            return null;
        }
        Object obj = head.getObject();
        head = head.getNext();
        if (head == null){
            tail = null;
        }
        size--;
        return obj;
    }

    public Object get (int index){
        if((size == 0) || (index >= size) || (index < 0)){
            return null;
        }
        if(index <= (size/2)) {
            ObjectBoxTQ current = head;
            int pos = 0;
            while (pos < index) {
                current = current.getNext();
                pos++;
            }
            Object obj = current.getObject();
            return obj;

        }else{
            ObjectBoxTQ current = tail;
            int pos = (size - 1);
            while (pos > index){
                current = current.getPrev();
                pos--;
            }
            Object obj = current.getObject();
            return obj;
        }

    }

    public int size(){
        return size;
    }
}
