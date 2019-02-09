package Thinking_in_Java.Chapter_15;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Cat;

public class Ex2<T> {
    T a;
    T b;
    T c;

    public Ex2(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(T a) {
        this.a = a;
    }

    public void setB(T b) {
        this.b = b;
    }

    public void setC(T c) {
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public T getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Ex2{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    public static void main(String[] args) {
        Ex2<Cat> cats = new Ex2(new Cat("Barsik"), new Cat("Murzik"), new Cat("Roma"));
        System.out.println(cats);
    }
}
