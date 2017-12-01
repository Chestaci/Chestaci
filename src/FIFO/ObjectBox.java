package FIFO;

public class ObjectBox {
    private Object object;
    private ObjectBox next;
    private ObjectBox prev;

    public ObjectBox getPrev() {
        return prev;
    }

    public void setPrev(ObjectBox prev) {
        this.prev = prev;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ObjectBox getNext() {
        return next;
    }

    public void setNext(ObjectBox next) {
        this.next = next;
    }
}
