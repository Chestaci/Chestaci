package Thinking_in_Java.Chapter_19;

import net.mindview.util.Enums;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class Ex5 {
}

enum CharacterCategory {
    VOWEL('a', 'e', 'i', 'o', 'u') {
        public String toString() { return "vowel"; }
    },
    SOMETIMES_A_VOWEL('y', 'w') {
        public String toString() {
            return "sometimes a vowel";
        }
    },
    CONSONANT {
        public String toString() { return "consonant"; }
};
    private HashSet<Character> chars =
            new HashSet<Character>();
    private CharacterCategory(Character... chars) {
        if(chars != null)
            this.chars.addAll(Arrays.asList(chars));
    }
    public static CharacterCategory getCategory(Character c) {
        if(VOWEL.chars.contains(c))
            return VOWEL;
        if(SOMETIMES_A_VOWEL.chars.contains(c))
            return SOMETIMES_A_VOWEL;
        return CONSONANT;
    }
}
class E05_VowelsAndConsonants2 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for(int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            printnb((char)c + ", " + c + ": ");
            print(
                    CharacterCategory.getCategory((char)c).toString());
        }
    }
}


//
//enum VowelsAndConsonants {
//
////    VOWEL (Sound.Vowel.class),
//    VOWEL (Sound.Vowel.class),
//    CONSONANT (Sound.Consonant.class),
//    SOMETIMES_A_VOWEL (Sound.Sometimes_a_vowel.class);
////    private Sound[] values;
//
//
////    private VowelsAndConsonants (Class<? extends Sound> letter){
//    private VowelsAndConsonants (Sound... ch){
//             for(Sound v: ch){
//                 Class<? extends Sound> letter = v.getClass().getEnumConstants();
//             }
//
//    }
//
//    public interface Sound{
//        enum Vowel implements Sound{
//            A, E, I, O, U;
//        }
//        enum Consonant implements Sound{
//            Q, R, T, P, S, D, F, G, H, J, K, L, Z, X, C, V, B, N, M;
//        }
//        enum Sometimes_a_vowel implements Sound{
//            W, Y;
//        }
//    }
//
//
//    public Sound randomSelection() {
//        return Enums.random(values);
//    }
//
//
//    public static void main(String[] args) {
//        Random rand = new Random(47);
////        for(int i = 0; i < 100; i++) {
////            int c = rand.nextInt(26) + 'a';
////            printnb((char)c + ", " + c + ": ");
////            switch(c) {
////                case 'a':
////                case 'e':
////                case 'i':
////                case 'o':
////                case 'u': print("vowel");
////                    break;
////                case 'y':
////                case 'w': print("Sometimes a vowel");
////                    break;
////                default: print("consonant");
////            }
////        }
//
//        for (int i = 0; i < 100; i++ ) {
//            for (VowelsAndConsonants l : VowelsAndConsonants.values()){
//                Sound sound = l.randomSelection();
//                System.out.println(sound);
//            }
//            System.out.println("__________________________");
//        }
//    }
//}
