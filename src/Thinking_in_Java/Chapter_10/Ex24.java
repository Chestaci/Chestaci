package Thinking_in_Java.Chapter_10;

public class Ex24 {
    public class Ex24_1{
        int i;
        String s;

        @Override
        public String toString() {
            return "Ex24_1{" + "i=" + i + ", s='" + s + '\'' + '}';
        }

        public Ex24_1(int i, String s) {
            this.i = i;
            this.s = s;
        }
    }
}

class Ex24_2 {
    public class Ex24_3 extends Ex24.Ex24_1 {

        public Ex24_3(Ex24 ex, int i, String s) {
            ex.super(i, s);
        }

    }

    public static void main(String[] args) {
        Ex24 e = new Ex24();
        Ex24_2 ee = new Ex24_2();
        Ex24_2.Ex24_3 eee = ee.new Ex24_3(e, 11, "Hi!");
        System.out.println(eee);
    }
}