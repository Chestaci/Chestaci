package Thinking_in_Java.Chapter_9;

import java.util.Random;

public class Ex7 {
    private static RandomRodentGenerator0 gen = new RandomRodentGenerator0();

    public static void main(String[] args) {
        Rodent0[] rodents = new Rodent0[11];
        for (int i = 0; i < rodents.length; i++){
            rodents[i] = gen.next();
        }
        for( Rodent0 r: rodents){
            r.eat();
            r.gnaw();
        }
    }
}

interface Rodent0{
    void gnaw();
    void eat();
}

class Mouse0 implements Rodent0 {
    @Override
    public void gnaw(){
        System.out.println("Hroomk like a mouse0!!!");
    }
    @Override
    public void eat(){
        System.out.println("Mnyam like a mouse0!!!");
    }
}

class Hamster0 implements Rodent0{
    @Override
    public void gnaw(){
        System.out.println("Hroomk like a hamster0!!!");
    }
    @Override
    public void eat(){
        System.out.println("Mnyam like a hamster0!!!");
    }
}

class Rabbit0 implements Rodent0{
    @Override
    public void gnaw(){
        System.out.println("Hroomk like a rabbit0!!!");
    }
    @Override
    public void eat(){
        System.out.println("Mnyam like a rabbit0!!!");
    }
}

class RandomRodentGenerator0{
    private Random rand = new Random(47);
    public Rodent0 next(){
        switch (rand.nextInt(3)){
            default:
            case 0: return new Mouse0();
            case 1: return new Hamster0();
            case 2: return new Rabbit0();
        }
    }
}