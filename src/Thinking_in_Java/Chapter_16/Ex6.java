package Thinking_in_Java.Chapter_16;

import java.util.Arrays;

public class Ex6 {
    public static void methodBer(int i, int j){
        BerylliumSphere[][] berylliumSpheres = new BerylliumSphere[i][j];
        for (int k = 0; k < berylliumSpheres.length; k++){
            for (int l = 0; l < berylliumSpheres[k].length; l++){
                berylliumSpheres[k][l] = new BerylliumSphere();
            }
        }
        System.out.println(Arrays.deepToString(berylliumSpheres));
    }

    public static void main(String[] args) {
        methodBer(3,3);
    }
}
