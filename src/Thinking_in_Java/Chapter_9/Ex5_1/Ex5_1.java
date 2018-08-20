package Thinking_in_Java.Chapter_9.Ex5_1;

import Thinking_in_Java.Chapter_9.Ex5;

public class Ex5_1 implements Ex5 {
    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String c() {
        return null;
    }

    public static void main(String[] args) {
        Ex5 s = new Ex5_1();
        s.a();
        System.out.println(s.b());
        System.out.println(s.c());

    }
}
