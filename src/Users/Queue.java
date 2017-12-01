package Users;

public class Queue {
    private ListBox head = null;
    private ListBox tail = null;
    private int size = 0;

    public void push (List us1) {
        ListBox lb = new ListBox();
        lb.setUs1(us1);
        if (head == null) {
           head = lb;
        } else {


            tail.setNext(lb);

        }
        tail = lb;
        size++;
    }
    public List pull () {
        if (size == 0) {
            return null;
        }
        List us1 = head.getUs1();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return us1;
    }
    public int size () {
        return size;
    }
}
