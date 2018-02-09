package Thinking_in_Java.Chapter_4;

public class Ex7 {
    public static void main(String[] args) {
////        for (int i = 1; i <= 100; i++) {
////            if (i == 99) break;
////            System.out.print(i + " ");
////        }
////
////        System.out.println();
////
//        Ex7 c = new Ex7();
////        for(int m : c.ex1(100))
////            if(m != 0)
////            System.out.print(m + " ");
////
////        System.out.println();
//
//        int n = c.ex1_2(100, 1, 100);
//
//        for (int i = 1; i <= n; i++) {
//            if (i == 99) break;
//            System.out.print(i + " ");
//        }

        for (int i = 1; i <= 100; i++) {
            if (i == 99) return;
            System.out.print(i + " ");
        }
    }

//    int[] ex1(int y){
//        int[]m = new int[y];
//        for (int i = 1; i <= y; i++) {
//            if (i == 99) break;
//            m[i] = i;
//        }
//        return m;
//    }

//    int ex1_2(int v, int b, int e){
//        if((v >= b) && (v <= e)){
//            return v;
//        }
//        System.out.println("Error");
//        return 99;
//    }
}
