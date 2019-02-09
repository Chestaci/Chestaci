package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

import java.util.ArrayList;

public class Pets {
    public static final PetCreator creator =
            new PetFactory();
    public static Pet randomPet(){
        return creator.randomPet();
    }
    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size){
        return creator.arrayList(size);
    }
}
