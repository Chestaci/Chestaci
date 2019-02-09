package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.TypeCounter;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class Ex13 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
//        for(Part part : Part.createRandom()){
//            printnb(part.getClass().getSimpleName() + " ");
            counter.count(Part.createRandom());

//        }
        print();
        print(counter);
    }
}
