package Thinking_in_Java.Chapter_4;

public class Ex10 {
    static void doYouHaveVampires(int v){
        int a = (v / 1000);
        int b = ((v - (a * 1000)) / 100);
        int c = ((v - (a * 1000) - (b * 100)) / 10);
        int d = (v - (a * 1000) - (b * 100) - (c * 10));
        //System.out.println(a + " " + b + " " + c + " " + d);
        calc(a, b, c, d, v);
        calc(a, b, d, c, v);
        calc(b, a, c, d, v);
        calc(b, a, d, c, v);
        calc(a, c, b, d, v);
        calc(a, c, d, b, v);
        calc(c, a, b, d, v);
        calc(c, a, d, b, v);
        calc(a, d, b, c, v);
        calc(a, d, c, b, v);
        calc(d, a, b, c, v);
        calc(d, a, c, b, v);
//        if((a * 10 + b) * (c * 10 + d) == v) {
//            System.out.println(v + " " + (a * 10 + b)  + " " + (c * 10 + d));
//        }
//        if((a * 10 + b) * (d * 10 + c) == v) {
//            System.out.println(v + " " + (a * 10 + b)  + " " + (d * 10 + c));
//        }
//        if((b * 10 + a) * (c * 10 + d) == v) {
//            System.out.println(v + " " + (b * 10 + a)  + " " + (c * 10 + d));
//        }
//        if((b * 10 + a) * (d * 10 + c) == v) {
//            System.out.println(v + " " + (b * 10 + a)  + " " + (d * 10 + c));
//        }
//        if((a * 10 + c) * (b * 10 + d) == v) {
//            System.out.println(v + " " + (a * 10 + c)  + " " + (b * 10 + d));
//        }
//        if((a * 10 + c) * (d * 10 + b) == v) {
//            System.out.println(v + " " + (a * 10 + c)  + " " + (d * 10 + b));
//        }
//        if((c * 10 + a) * (b * 10 + d) == v) {
//            System.out.println(v + " " + (c * 10 + a)  + " " + (b * 10 + d));
//        }
//        if((c * 10 + a) * (d * 10 + b) == v) {
//            System.out.println(v + " " + (c * 10 + a)  + " " + (d * 10 + b));
//        }
//        if((a * 10 + d) * (b * 10 + c) == v) {
//            System.out.println(v + " " + (a * 10 + d)  + " " + (b * 10 + c));
//        }
//        if((a * 10 + d) * (c * 10 + b) == v) {
//            System.out.println(v + " " + (a * 10 + d)  + " " + (c * 10 + b));
//        }
//        if((d * 10 + a) * (b * 10 + c) == v) {
//            System.out.println(v + " " + (d * 10 + a)  + " " + (b * 10 + c));
//        }
//        if((d * 10 + a) * (c * 10 + b) == v) {
//            System.out.println(v + " " + (d * 10 + a)  + " " + (c * 10 + b));
//        }
    }
    static void calc(int a, int b, int c, int d, int v){
        if((a * 10 + b) * (c * 10 + d) == v) {
            System.out.println(v + " = " + (a * 10 + b) + " " + "*" + " " + (c * 10 + d));
        }
    }

    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            doYouHaveVampires(i);
        }
    }
//1260 = 21 * 60
//1395 = 15 * 93
//1435 = 41 * 35
//1530 = 51 * 30
//1827 = 87 * 21
//2187 = 27 * 81
//6880 = 86 * 80
//6880 = 80 * 86
}

