package Chestaci.Test;

public class CheRhombus {
    public static void main(String[] args) {
        int a = 5;
        int z = ((a - 1) / 2);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == (j - z)) || (i == (z - j)) || (i == (j + z)) || (i == (((a - 1) - j) + z))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}