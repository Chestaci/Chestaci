package Thinking_in_Java.Chapter_17;

public class Ex8 {
    public static void main(String[] args) {
        SList<String> stringSList = new SList<String>();
        SListIterator<String> it = stringSList.iterator();
        it.add("sdfsdf");
        it.add("sdfsdf");
        it.add("sdfsdf");
        it.add("sdfsdf");
        System.out.println(stringSList.toString());
        it.add("sdfsdf");
        it.add("sdfsdf");
        System.out.println(stringSList.toString());
        it.remove();
        it.remove();
        it.remove();
        System.out.println(stringSList.toString());
    }
}

class SList <T> {
    private Link<T> headLink = new Link<T>(null);

     SListIterator<T> iterator() {
        return new SListIterator<T>(headLink);
    }

    @Override
    public String toString() {
        if(headLink.next == null) {
            return "SList: []";
        }
        System.out.print("SList: [");
        SListIterator<T> it = this.iterator();
        StringBuilder s = new StringBuilder();
        while (it.hasNext()) {
            s.append(it.next() + (it.hasNext() ? ", " : ""));
        }
        return s + "]";
    }
}

class SListIterator<T> {
    private Link<T> head;

    public SListIterator(Link<T> head) {
        this.head = head;
    }

    public boolean hasNext() {
        return head.next != null;
    }

    public Link<T> next() {
        head = head.next;
        return head;
    }

    public void remove() {
        if (head.next == null) {
            System.out.println("Пустой список");
        } else {
            Link<T> current = head.next;
            if (current.next == null) {
                head.next = null;
            } else {
                current = current.next;
                head.next = current;
            }
        }
    }

    public void add(T element) {
        Link<T> el = new Link<T>(element);
        if (head.next == null) {
            head.next = el;
        } else {
            Link<T> current = head.next;
            while (current.next != null) {
                current = current.next;
            }
            current.next = el;
        }
    }
}

class Link <T> {
    T object;
    Link next;

    public Link(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        if(object == null) return "null";
        return object.toString();
    }
}
