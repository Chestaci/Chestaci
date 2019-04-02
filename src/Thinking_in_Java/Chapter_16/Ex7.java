package Thinking_in_Java.Chapter_16;

import java.util.Arrays;

public class Ex7 {

        public static void methodBer2(int i, int j, int z){
            BerylliumSphere[][][] berylliumSpheres = new BerylliumSphere[i][j][z];
            for (int k = 0; k < berylliumSpheres.length; k++){
                for (int l = 0; l < berylliumSpheres[k].length; l++){
                    for (int s = 0; s < berylliumSpheres[k].length; s++){
                        berylliumSpheres[k][l][s] = new BerylliumSphere();
                    }
                }
            }
            System.out.println(Arrays.deepToString(berylliumSpheres));
        }

        public static void main(String[] args) {
            methodBer2(3,3, 3);
        }

}
