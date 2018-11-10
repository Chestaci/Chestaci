package Thinking_in_Java.Chapter_12;

import java.util.Arrays;

public class Ex23 {
    public static void main(String[] args) {
        try {
            FailingConstructor2 constructor = new FailingConstructor2();
            try {
                System.out.println(constructor.toString());
            }catch (Exception e)  {
                System.out.println(e);
                e.printStackTrace();
            }finally {
                constructor.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}

class FailingConstructor2 {
    Dispose d1;
    Dispose d2;
    Integer[] integers = new Integer[1];
    public FailingConstructor2() throws Exception {

        d1 = new Dispose("1");
        try {
            integers[1] = 5;
        }catch (Exception e){
            System.out.println("Ошибка работы конструктора");
            e.printStackTrace();
            d1.dispose();
        }
        d2 = new Dispose("2");
    }
public void dispose(){
        d2.dispose();
        d1.dispose();
    System.out.println("Завершение класса FailingConstructor2");
}

    @Override
    public String toString() {
        return "FailingConstructor2{" + "d1=" + d1 + ", d2=" + d2 + ", integers=" + Arrays.toString(integers) + '}';
    }
}


class Dispose {
    String s;
    public Dispose(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Dispose{} " + s;
    }

    public void dispose() {
        System.out.println("Завершение класса Dispose");
    }
}