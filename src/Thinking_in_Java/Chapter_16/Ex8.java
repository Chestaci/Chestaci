package Thinking_in_Java.Chapter_16;

import java.util.Arrays;

public class Ex8<T> {
    @SuppressWarnings("unchecked")
    T[] a = (T[])new Object[2]; // Compile warning: unchecked cast
    public static void main(String[] args) {
        String [] strings = new String[7];
        strings[0] = new String("");
        //strings[1] = new Integer(1);
        // strings[2] = new Double(1);
        //strings[3] = 1;
        strings[4] = new String("");
        strings[5] = new String("");
        strings[6] = new String("");

        Object [] objects = new Object[7];
        objects[0] = new String("");
        objects[1] = new Integer(1);
        objects[2] = new Double(1);
        objects[3] = (int) 1;
        objects[4] = new Character('1');
        objects[5] = new Boolean(true);
        objects[6] = new BerylliumSphere();
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(objects));
        System.out.println(objects[3].getClass().getName());
    }
}
