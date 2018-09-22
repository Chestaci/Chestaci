package Thinking_in_Java.Chapter_4;

public class Ex8 {
    public static void main(String[] args) {

//        char a = 'y';
//        int d = (int) a;
//        System.out.println(d);
////        int w = d + 24;
////        char y = (char)w;
////        int r = (int)y;
////        System.out.println(y);
////        System.out.println(r);
        int c;
        for (int i = 0; i < 11; i++) {
            if(i == 0){
                c = 0;
            }else{
                if(i % 2 == 0){
                    c = 1;
                }else{
                    c = 2;
                }
            }
            switch (c) {
                case (1):
                    System.out.println("Четное число" + i);
                    break;
                case(2):
                    System.out.println("Нечетное число" + i);
                    break;
                default:
                    System.out.println("Нулевое число" + i);
                    break;
            }
        }
    }
}
