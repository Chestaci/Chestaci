package Thinking_in_Java.Chapter_2;

public class Ex7 {

        static int i = 47;
     static void increment (){
        Ex7.i++;
    }
    public static void main(String[] args) {
      Ex7 x = new Ex7();
        System.out.println(i);
      x.increment();
        System.out.println(i);
        Ex7.increment();
        System.out.println(i);
    }
}
