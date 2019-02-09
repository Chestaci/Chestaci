package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for(Pet pet : Pets.createArray(20)){
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}
