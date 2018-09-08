package Thinking_in_Java.Chapter_11;

import java.util.LinkedList;

public class Ex15 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
//        for (String s: "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---".split("")){
//            //stack.
//            System.out.print(s);
//        }
        String[] strMass = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---".split("");

        for (int i = 0; i < strMass.length; i++){
            if (strMass[i].equals("+")){
                stack.push(strMass[i + 1]);
            }
            if (strMass[i].equals("-")){
                System.out.print(stack.pop());
            }
        }


    }
}

class Stack<T>{
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v){
        storage.addFirst(v);
    }
    public T peek(){
        return storage.getFirst();
    }
    public T pop(){
        return storage.removeFirst();
    }
    public boolean empty(){
        return storage.isEmpty();
    }
    @Override
    public String toString() {
        return storage.toString();
    }
}