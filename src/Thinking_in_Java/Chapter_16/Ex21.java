package Thinking_in_Java.Chapter_16;

import java.util.Arrays;
import java.util.Collections;

public class Ex21 {
    public static void main(String[] args) {
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[10];
        berylliumSpheres[0] = new BerylliumSphere();
        berylliumSpheres[9] = new BerylliumSphere();
        berylliumSpheres[8] = new BerylliumSphere();
        berylliumSpheres[6] = new BerylliumSphere();
        berylliumSpheres[5] = new BerylliumSphere();
        berylliumSpheres[3] = new BerylliumSphere();
        berylliumSpheres[4] = new BerylliumSphere();
        berylliumSpheres[7] = new BerylliumSphere();
        berylliumSpheres[1] = new BerylliumSphere();
        berylliumSpheres[2] = new BerylliumSphere();

        System.out.println(Arrays.toString(berylliumSpheres));
        Arrays.sort(berylliumSpheres);
        System.out.println(Arrays.toString(berylliumSpheres));
        Arrays.sort(berylliumSpheres, Collections.reverseOrder());
        System.out.println(Arrays.toString(berylliumSpheres));
    }
}

class BerylliumSphereComparator implements Comparable<BerylliumSphere>{
    @Override
    public int compareTo(BerylliumSphere berylliumSphere) {
        return 0;
    }
}