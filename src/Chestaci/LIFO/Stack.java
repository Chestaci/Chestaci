package Chestaci.LIFO;

public class Stack {
    private ObjectBoxLifo head = null;
    private ObjectBoxLifo tail = null;
    private int size = 0;

    public ObjectBoxLifo getHead() {
        return head;
    }

    public void setHead(ObjectBoxLifo head) {
        this.head = head;
    }

    public ObjectBoxLifo getTail() {
        return tail;
    }

    public void setTail(ObjectBoxLifo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void pop (Object object){
        ObjectBoxLifo obj = new ObjectBoxLifo();
        obj.setObject(object);
        if (head == null){
            head = obj;
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
        Object obj = tail.getObject();
        tail = tail.getPrev();
        if (head == null){
            tail = null;
        }
        size--;
        return obj;
    }
    public int size(){
        return size;
    }
}
