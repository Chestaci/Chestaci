package Thinking_in_Java.Chapter_9.Test;

public class T extends B {
    void a() {
        System.out.println("А");
    }

    static void b(B b) {
        //   ((Ex4)b).a();
        b.a();
    }

//    public int num(String s) {
//        System.out.println(s);
//        return 2;
//    }

    public static void main(String[] args) {
        T c = new T();
        // ((Ex4)c).a();
        b(c);
        int a = c.num("?");
        System.out.println(a);
        int m = c.num("sd");
        System.out.println(m);
    }
}

    abstract class B {

        abstract void a();

        public int num(String s) {
            System.out.println(s);
            return 1;
        }

    }
