package Thinking_in_Java.Chapter_8;

import java.util.Random;

public class Ex12_14 {
    private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();

    public static void main(String[] args) {
        Rodent1[] rodents = new Rodent1[11];
        for (int i = 0; i < rodents.length; i++){
            rodents[i] = gen.next();
        }
        for( Rodent1 r: rodents){
            r.eat();
            r.gnaw();
        }
    }
}
class Characteristic {
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Создаём Characteristic " + s);
    }
}

class Desription {
    private String s;

    public Desription(String s) {
        this.s = s;
        System.out.println("Создаём Desription " + s);
    }
}

class Shared1 {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared1() {
        System.out.println("Создаем " + this);
    }

    public void addRef(){
        refcount++;
    }

//    protected void dispose(){
//        if(--refcount == 0){
//            System.out.println("Уничтожаем " + this);
//        }
//    }

    @Override
    public String toString() {
        return "Shared1 " + id;
    }
//    protected void finalize() throws Throwable {
//        if(refcount != 0){
//            System.out.println("error dispose");
////            try {
////                super.finalize();
////            } catch (Throwable throwable) {
////                throwable.printStackTrace();
////            }
//        }
//    }
}

class Rodent1{

    private Shared1 shared1;
    private static long counter = 0;
    private final long id = counter++;

    public Rodent1(Shared1 shared1) {
        System.out.println("Создаем " + this);
        this.shared1 = shared1;
        this.shared1.addRef();
    }

    void gnaw(){
        System.out.println("Hroomk!!!");
    }
    void eat(){
        System.out.println("Mnyam!!!");
    }
    private Characteristic p = new Characteristic("Грызун");
    private Desription t = new Desription("Любит грызть");
    @Override
    public String toString() {
        return "Rodent1 " + id;
    }
}

class Mouse1 extends Rodent1{
    public Mouse1(Shared1 shared1) {
        super(shared1);
        System.out.println("Mouse1()");
    }

    @Override
    void gnaw(){
        System.out.println("Hroomk like a mouse!!!");
    }
    @Override
    void eat(){
        System.out.println("Mnyam like a mouse!!!");
    }
    private Characteristic p = new Characteristic("Мышь");
    private Desription t = new Desription("Любит сыр");
}

class Hamster1 extends Rodent1{
    public Hamster1(Shared1 shared1) {
        super(shared1);
        System.out.println("Hamster1");
    }

    @Override
    void gnaw(){
        System.out.println("Hroomk like a hamster!!!");
    }
    @Override
    void eat(){
        System.out.println("Mnyam like a hamster!!!");
    }
    private Characteristic p = new Characteristic("Хомяк");
    private Desription t = new Desription("Любит бумагу");
}

class Rabbit1 extends Rodent1{
    public Rabbit1(Shared1 shared1) {
        super(shared1);
        System.out.println("Rabbit1()");
    }

    @Override
    void gnaw(){
        System.out.println("Hroomk like a rabbit!!!");
    }
    @Override
    void eat(){
        System.out.println("Mnyam like a rabbit!!!");
    }
    private Characteristic p = new Characteristic("Кролик");
    private Desription t = new Desription("Любит морковку");
}

class RandomRodentGenerator1{
    Shared1 shared1 = new Shared1();
    private Random rand = new Random(47);
    public Rodent1 next(){
        switch (rand.nextInt(3)){
            default:
            case 0: return new Mouse1(shared1);
            case 1: return new Hamster1(shared1);
            case 2: return new Rabbit1(shared1);
        }
    }
}