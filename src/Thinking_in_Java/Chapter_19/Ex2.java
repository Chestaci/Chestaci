package Thinking_in_Java.Chapter_19;

import net.mindview.util.Generator;

public class Ex2 {
}

//class EnumImplementation {
//    public static <T> void printNext(Generator<T> rg) {
//        System.out.print(rg.next() + ", ");
//    }
//    public static void main(String[] args) {
//// Choose any instance:
//        CartoonCharacter cc = CartoonCharacter.BOB;
//        for(int i = 0; i < 10; i++)
//            printNext(cc);
//    }
//}

class EnumImplementation {
    public static void printNext() {
        System.out.print(CartoonCharacter.next() + ", ");
    }
    public static void main(String[] args) {
// Choose any instance:
       // CartoonCharacter cc = CartoonCharacter.BOB;
        for(int i = 0; i < 10; i++)
            printNext();
    }
}
