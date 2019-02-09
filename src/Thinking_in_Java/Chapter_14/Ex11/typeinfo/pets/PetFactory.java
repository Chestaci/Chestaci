package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory;

import java.util.ArrayList;
import java.util.List;


public class PetFactory extends PetCreator {
   //static List<Factory<? extends Pet>> types1 = new ArrayList<Factory<? extends Pet>>();
   public static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
   static {
       types.add(new Mutt.Factory().create().getClass());
       types.add(new Pug.Factory().create().getClass());
       types.add(new EgyptianMau.Factory().create().getClass());
       types.add(new Manx.Factory().create().getClass());
       types.add(new Cymric.Factory().create().getClass());
       types.add(new Rat.Factory().create().getClass());
       types.add(new Mouse.Factory().create().getClass());
       types.add(new Hamster.Factory().create().getClass());
   }
//    private static void loader(){
//        types1.getClass();
//    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
}
