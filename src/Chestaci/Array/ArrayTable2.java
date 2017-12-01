package Chestaci.Array;

public class ArrayTable2 {
    public static void main(String[] args) {
        int a = 5;
        int num = 1;
        int b = ((a * a) - ((a - 2) * (a - 2)));

        int[][] ar = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                ar[i][j] = num++;
            }
        }


        for (int j = 1; j <= a; j++) {
            System.out.format("%4d", j);
        }
        System.out.println();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.println(i);
            }
        }

    }
}
