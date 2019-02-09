package Thinking_in_Java.Chapter_15;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Cat;
import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Pet;
import net.mindview.util.New;

import java.util.List;
import java.util.Map;

public class Ex12 {
    static void m(Map<Cat,List<Pet>> catListMap){
        System.out.println("Сработало!");
    }
    public static void main(String[] args) {
        m(New.<Cat,List<Pet>>map());
    }
}
