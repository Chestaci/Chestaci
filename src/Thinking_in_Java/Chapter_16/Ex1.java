package Thinking_in_Java.Chapter_16;

import java.util.Arrays;

public class Ex1 {
    public static void method(BerylliumSphere [] berylliumSphere){
        System.out.println("Я принял эту Бериливую сферу");
        System.out.println(Arrays.toString(berylliumSphere));
    }
    public static void main(String[] args) {
        //method({new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});
        method(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});
        BerylliumSphere[] berylliumSpheres = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        BerylliumSphere[] berylliumSpheres2 = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        method(berylliumSpheres);
        method(berylliumSpheres2);
    }
}

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Sphere " + id; }
}
