package Chestaci;

public class AltRhombus {

    public static void main(String[] args) {

        int a = 11;
        int z = 0;
        for (int i = 0; i < a; i++) {
            if (i < a / 2) {
                z = a / 2 + i;
            } else {
                z = i - a / 2;
            }
            for (int j = 0; j < a; j++) {
                if (j == z || j == a - z - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}