package Chestaci.TwoQueue;

public class ObjectBoxTQ {
    private Object object;
    private ObjectBoxTQ next;
    private ObjectBoxTQ prev;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ObjectBoxTQ getNext() {
        return next;
    }

    public void setNext(ObjectBoxTQ next) {
        this.next = next;
    }

    public ObjectBoxTQ getPrev() {
        return prev;
    }

    public void setPrev(ObjectBoxTQ prev) {
        this.prev = prev;
    }
}
