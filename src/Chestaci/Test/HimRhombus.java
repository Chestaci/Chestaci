package Chestaci.Test;

public class HimRhombus {
    public static void main(String[] args) {

        int a = 5;
        int z = ((a - 1) / 2);
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < a; y++) {
                if ((((y == (z - x)) | (y == (z + x)))) |  (((y == (z - ((a - 1) - x))) | (y == (z + ((a - 1) - x)))))) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}