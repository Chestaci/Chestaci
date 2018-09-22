package Thinking_in_Java.Chapter_11;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class Ex30 {
    public static void main(String[] args) {
        CollectionSequence.main(args);
    }
}

/** исходный код, до изменений
class CollectionSequence extends AbstractCollection{
private Pet[] pets = {new Pet("Rat"), new Pet("Manx"), new Pet("Cymric"), new Pet("Mutt"), new Pet("Pug"), new Pet("Cymric"), new Pet("Pug"), new Pet("Manx")};
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
            public void remove(){ // Не реализован
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}

class Pet{
    String name;

    public Pet(String name) {
        this.name = name;
    }
    int id() {
        return 777 * name.length();
    }

    @Override
    public String toString() {
        return name;
    }
}

class InterfaceVsIterator{
    public static void display(Iterator<Pet> it){
        while (it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void display(Collection<Pet> pets){
        for(Pet p : pets){
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
}
*/

class CollectionSequence implements Collection {
    private Pet[] pets = {new Pet("Rat"), new Pet("Manx"), new Pet("Cymric"), new Pet("Mutt"), new Pet("Pug"), new Pet("Cymric"), new Pet("Pug"), new Pet("Manx")};
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
            public void remove(){ // Не реализован
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public Object[] toArray() {
        return pets;
    }

    @Override
    public boolean add(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
if(this.size() != 0){
    for(Pet p: pets){
        p = null;
    }
}
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] objects) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        return ((this.size() == 0) ? true : false);
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}

class Pet{
    String name;

    public Pet(String name) {
        this.name = name;
    }
    int id() {
        return 777 * name.length();
    }

    @Override
    public String toString() {
        return name;
    }
}

class InterfaceVsIterator{
    public static void display(Iterator<Pet> it){
        while (it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void display(Collection<Pet> pets){
        for(Pet p : pets){
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
}
