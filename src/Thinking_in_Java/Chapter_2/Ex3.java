package Thinking_in_Java.Chapter_2;

public class Ex3 {
    public static void main(String[] args) {
        class ATypeName {
            int a;
            char b;
            String c;
            boolean d;

            void show() {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
            }

        }
        ATypeName n = new ATypeName();
        n.a = 11;
        n.b = '#';
        n.c = "привет";
        n.d = true;
        n.show();
    }

}
