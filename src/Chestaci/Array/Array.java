package Chestaci.Array;

public class Array {
    public static void main(String[] args) {
        int[] sample = {12, 56, 7, 34, 89, 43, 23, 9};

        int min = sample[0];
        int max = sample[0];

        for (int i = 0; i < sample.length; i++) {
            // Если впереди стоящее число больше, чем следующее
            if (sample[i] > max) {
                max = sample[i];
            }
        }

        for (int i = 0; i < sample.length; i++) {
            // Если впереди стоящее число больше, чем следующее
            if (min > sample[i]) {
                min = sample[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
