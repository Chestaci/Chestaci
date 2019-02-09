package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {
    private Random rand = new Random(47);
    //Контейнер List с разными видами создаваемых объекта Pet:
    public abstract List<Class<? extends Pet>> types();
    public Pet randomPet(){ // Создание одного случайного объекта Pet
    int n = rand.nextInt(types().size());
    try{
        return types().get(n).newInstance();
    } catch (IllegalAccessException e) {
        throw new RuntimeException(e);
    } catch (InstantiationException e) {
        throw new RuntimeException(e);
    }
    }
    public Pet[] createArray(int size){
        Pet[] result = new Pet[size];
        for(int i = 0; i < size; i++){
            result[i] = randomPet();
        }
        return result;
    }
    public ArrayList<Pet> arrayList(int size){
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
