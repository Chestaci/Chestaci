package Thinking_in_Java.Chapter_16;

import java.util.Arrays;

public class Ex2 {
    public static BerylliumSphere[] createBerylliumSpheres (int i){
        if (i > 0){
            BerylliumSphere[] berylliumSpheres = new BerylliumSphere[i];
            for(int b = 0; b < i; b++){
                berylliumSpheres[b] = new BerylliumSphere();
            }
            return berylliumSpheres;
        }else {
            System.out.println("Что-то пошло не так... Попробуйте заварить вкусный чай, посидите немного, попейте его... и... попробуйте снова!");
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createBerylliumSpheres(-1)));
        System.out.println(Arrays.toString(createBerylliumSpheres(10)));
        System.out.println(Arrays.toString(createBerylliumSpheres(0)));
    }
}
