package Thinking_in_Java.Chapter_16;

import Chestaci.Array.Array;
import net.mindview.util.Generated;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.mindview.util.Print.print;

public class Ex15 {
    public static void main(String[] args) {

    }
}

class ContainerComparison {
    public static void main(String[] args) {
//        BerylliumSphere[] spheres = new BerylliumSphere[10];
//        for(int i = 0; i < 5; i++)
//            spheres[i] = new BerylliumSphere();
//        print(Arrays.toString(spheres));
//        print(spheres[4]);
//        List<BerylliumSphere> sphereList =
//                new ArrayList<BerylliumSphere>();
//        for(int i = 0; i < 5; i++)
//            sphereList.add(new BerylliumSphere());
//        print(sphereList);
//        print(sphereList.get(4));
//        int[] integers = { 0, 1, 2, 3, 4, 5 };
//        print(Arrays.toString(integers));
//        print(integers[4]);
//        List<Integer> intList = new ArrayList<Integer>(
//                Arrays.asList(0, 1, 2, 3, 4, 5));
//        intList.add(97);
//        print(intList);
//        print(intList.get(4));





        BerylliumSphere[] spheres2 = Generated.array(BerylliumSphere.class, new GeneratorBerylliumSphere(), 15);
        System.out.println(Arrays.deepToString(spheres2));
        System.out.println(Arrays.toString(spheres2));
        List<BerylliumSphere> berylliumSphereList = Arrays.asList(Generated.array(BerylliumSphere.class, new GeneratorBerylliumSphere(), 15));
        System.out.println(berylliumSphereList);
    }
}

class GeneratorBerylliumSphere implements Generator<BerylliumSphere>{
    public BerylliumSphere next(){
        return new BerylliumSphere();
    }

}