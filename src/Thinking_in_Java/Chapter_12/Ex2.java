package Thinking_in_Java.Chapter_12;

public class Ex2 {
    void m(){
        System.out.println();
    }
}

class Example{
    public static void main(String[] args) {
        Ex2 ex2 = null;
        try {
            ex2.m();
        }catch (Exception e){
            System.err.println("Перехвачено!");
            e.printStackTrace();
        }

    }
}