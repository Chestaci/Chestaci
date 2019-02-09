package Thinking_in_Java.Chapter_15;

public class Ex5 {
}

class LinkedStack<T> {
//    private static class Node<U> {
    private class Node {
//        U item;
        T item;
//        Node<U> next;
        Node next;
        Node() { item = null; next = null; }
//        Node(U item, Node<U> next) {
        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
        boolean end() { return item == null && next == null; }
    }
//    private Node<T> top = new Node<T>(); // End sentinel
    private Node top = new Node(); // End sentinel
    public void push(T item) {
//        top = new Node<T>(item, top);
        top = new Node(item, top);

    }
    public T pop() {
        T result = top.item;
        if(!top.end())
            top = top.next;
        return result;
    }
    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<String>();
        for(String s : "Phasers on stun!".split(" "))
            lss.push(s);
        String s;
        while((s = lss.pop()) != null)
            System.out.println(s);
    }
}