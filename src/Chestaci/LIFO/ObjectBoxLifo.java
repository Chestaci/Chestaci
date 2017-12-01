package Chestaci.LIFO;

public class ObjectBoxLifo {
    private Object object;
    private ObjectBoxLifo next;
    private ObjectBoxLifo prev;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ObjectBoxLifo getNext() {
        return next;
    }

    public void setNext(ObjectBoxLifo next) {
        this.next = next;
    }

    public ObjectBoxLifo getPrev() {
        return prev;
    }

    public void setPrev(ObjectBoxLifo prev) {
        this.prev = prev;
    }
}
