package Thinking_in_Java.Chapter_11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ex16 {
    public static void main(String[] args) {
        Set<Character> vowels = new HashSet<>();
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y');
        String sentence = "Mr. White loves tea!";
        String[] words = sentence.split(" ");

//        String sentence = "package Thinking_in_Java.Chapter_11;\n" + "\n" + "\n" + "\n" + "import java.util.LinkedList;\n"
//                + "import java.util.List;\n" + "import java.util.ListIterator;\n" + "\n" + "public class Ex14 {\n" + "\n" + "\n" + "" +
//                "        static void addInMiddle (List<Integer> list, int i){\n" + "        ListIterator<Integer> it = list.listIterator((list.size())/2);\n" +
//                "        it.add(i);\n" + "    }\n" + "\n" + "    public static void main(String[] args) {\n" +
//                "        LinkedList<Integer> a = new LinkedList<>();\n" + "        for (int i = 0; i < 42; i++)\n" +
//                "            Ex14.addInMiddle(a,i);\n" + "        System.out.println(a);\n" + "    }\n" + "}\n" + "\n";

//        String[] words = sentence.split(" ");
        int count = 0;
        int count2 = 0;
        for (String s : words) {
            count2 = 0;
            char [] letters = s.toCharArray();

            for (Character s2 : letters) {
                if (vowels.contains(s2)) {
                    count++;
                    count2++;
                }
            }
            System.out.println("count2 = "+ count2);
        }
        System.out.println("count = "+ count);

        System.out.println("Чай Чай Чай Чай Чай Чай");
    }
}

