package Thinking_in_Java.Chapter_3;

import java.util.Random;

public class ThrowCoin {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(100);
        System.out.println(i);
        if (i == 0){
            System.out.println("Отлично! Монета упала ребром ^_^");
        }else {
            if (i % 2 != 0) {
                System.out.println("Монета упала решкой!");
            }
            if (i % 2 == 0) {
                System.out.println("Монета упала орлом!");
            }
        }
    }
}
