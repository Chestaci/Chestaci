package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    //Типы, которые должны создаваться случайным образом:
    private static String[] typeNames = {
            "Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Mutt",
            "Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Pug",
            "Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.EgyptianMau",
            "Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Manx",
            "Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Cymric",
            "Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Rat",
            "Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Mouse",
            "Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Hamster",
            "Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Gerbil" ///////////////////// Ex11
    };
    @SuppressWarnings("unchecked")
    private static void loader(){
        try {
            for(String name : typeNames){
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static { loader(); }
    public List<Class<? extends Pet>> types() { return types; }
}
