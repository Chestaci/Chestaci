package Thinking_in_Java.Chapter_4;

public class Ex9 {
    static void fibonacci(int f) {
//        if (f < 0) {
//            System.out.println("Error");
//        } else {
//            if (f == 0) {
//                System.out.println("0");
//            } else if (f == 1) {
//                System.out.println("1");
//            } else {
//               int[]ff = new int[f];
//                for (int i = 0; i < f; i++) {
//
//                    System.out.println(n);
//                }
//            }
//        }
        int q = 0;
        int w = 1;
        for (int i = 0; i < f; i++) {
            if (i > 0) {
                int n = q + w;
                System.out.print(n + " ");
                q = w;
                w = n;
            } else {
                System.out.print("1 ");
            }
        }
    }

    public static void main(String[] args) {
        fibonacci(Integer.parseInt(args[0]));
    }
}