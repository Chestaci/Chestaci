package Chestaci.Test;

public class CheTable {
    public static void main(String[] args) {
        int a = 10;
        int i;
        int j;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a; j++) {
                int z = i * j;
                System.out.format("%4d", z);
            }
            System.out.println("");
        }
    }
}
