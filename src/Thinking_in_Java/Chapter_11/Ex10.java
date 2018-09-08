package Thinking_in_Java.Chapter_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Ex10 {

    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void display(Iterator<Rodent> it) {
        while (it.hasNext()) {
            Rodent r = it.next();
            System.out.println(r);
            r.eat();
            r.gnaw();
        }
    }


    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            rodents.add(gen.next());
//        Iterator<Rodent> it = rodents.iterator();
//        while (it.hasNext()) {
//            Rodent r = it.next();
//            System.out.println(r + ": ");
//            r.eat();
//            r.gnaw();
//        }
        display(rodents.iterator());


    }
}

    class Rodent implements Comparable {
        String name = "Rodent";

        void gnaw() {
            System.out.println("Hroomk!!!");
        }

        void eat() {
            System.out.println("Mnyam!!!");
        }

        @Override
        public String toString() {
            return name;
        }


        @Override
        public int compareTo(Object o) {
            return 1;
        }
    }

    class Mouse extends Rodent {
        String name = "Mouse";

        @Override
        void gnaw() {
            System.out.println("Hroomk like a mouse!!!");
        }

        @Override
        void eat() {
            System.out.println("Mnyam like a mouse!!!");
        }

        @Override
        public String toString() {
            return name;
        }


    }

    class Hamster extends Rodent {
        String name = "Hamster";

        @Override
        void gnaw() {
            System.out.println("Hroomk like a hamster!!!");
        }

        @Override
        void eat() {
            System.out.println("Mnyam like a hamster!!!");
        }

        @Override
        public String toString() {
            return name;
        }
    }

    class Rabbit extends Rodent {
        String name = "Rabbit";

        @Override
        void gnaw() {
            System.out.println("Hroomk like a rabbit!!!");
        }

        @Override
        void eat() {
            System.out.println("Mnyam like a rabbit!!!");
        }

        @Override
        public String toString() {
            return name;
        }
    }


  class RandomRodentGenerator {
        private Random rand = new Random(47);

        public Rodent next() {
            switch (rand.nextInt(3)) {
                default:
                case 0:
                    return new Mouse();
                case 1:
                    return new Hamster();
                case 2:
                    return new Rabbit();
            }
        }
    }

