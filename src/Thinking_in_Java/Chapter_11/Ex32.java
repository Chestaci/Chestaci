package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex32 {
    public static void main(String[] args) {
        NonCollectionSequence.main(args);
    }
}

class PetSequence{
    protected Pet[] pets = {new Pet("Rat"), new Pet("Manx"), new Pet("Cymric"), new Pet("Mutt"), new Pet("Pug"), new Pet("Cymric"), new Pet("Pug"), new Pet("Manx")};
}

class NonCollectionSequence extends PetSequence implements Iterable <Pet>{
    public Iterator<Pet> iterator(){
        return new Iterator<Pet>(){
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable <Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }
                };
            }
        };
    }

    public Iterable <Pet> randomized () {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List <Pet> shuffled = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
      //  InterfaceVsIterator.display(nc.iterator());

        for (Pet p : nc.reversed()) {
            System.out.print(p + " ");

        }
        System.out.println();
        for (Pet p : nc.randomized()) {
            System.out.print(p + " ");

        }
        System.out.println();

        for (Pet p : nc) {
            System.out.print(p + " ");

        }
        System.out.println();
    }
}