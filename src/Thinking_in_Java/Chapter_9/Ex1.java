package Thinking_in_Java.Chapter_9;
import java.util.Random;

public class Ex1 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[11];
        for (int i = 0; i < rodents.length; i++){
            rodents[i] = gen.next();
        }
        for( Rodent r: rodents){
            r.eat();
            r.gnaw();
        }
    }
}

abstract class Rodent{
   abstract void gnaw();
   abstract void eat();
}

class Mouse extends Rodent{
    @Override
    void gnaw(){
        System.out.println("Hroomk like a mouse!!!");
    }
    @Override
    void eat(){
        System.out.println("Mnyam like a mouse!!!");
    }
}

class Hamster extends Rodent{
    @Override
    void gnaw(){
        System.out.println("Hroomk like a hamster!!!");
    }
    @Override
    void eat(){
        System.out.println("Mnyam like a hamster!!!");
    }
}

class Rabbit extends Rodent{
    @Override
    void gnaw(){
        System.out.println("Hroomk like a rabbit!!!");
    }
    @Override
    void eat(){
        System.out.println("Mnyam like a rabbit!!!");
    }
}

class RandomRodentGenerator{
    private Random rand = new Random(47);
    public Rodent next(){
        switch (rand.nextInt(3)){
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
            case 2: return new Rabbit();
        }
    }
}
