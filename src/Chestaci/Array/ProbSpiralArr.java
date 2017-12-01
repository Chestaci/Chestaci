package Chestaci.Array;

public class ProbSpiralArr {
    public static void main(String[] args) {

        int SIZE = 4;
        int num = 1;

        if (SIZE > 1) {

        int[][] arr = new int[SIZE][SIZE];
        int q = SIZE * SIZE; //last num

        int a = SIZE;
        int l = 0; //line
        int c = 0; //column

           while (num < (q + 1)) {   //for (num = 1; num < (q + 1); )
                for (int i = l; i < a; i++) {
                    for (int j = c; j < a; j++) {
                        if ((i == l) || (j == (a - 1))) {
                            arr[i][j] = num++;
                        }
                    }
              }

                for (int i = (a - 1); i >= l; i--) {
                    for (int j = (a - 1); j >= c; j--) {
                        if (((i == (a - 1)) && (j != (a - 1))) || ((j == c) && (i != l))) {
                            arr[i][j] = num++;
                        }
                    }
                }

                a--;
                l++;
                c++;
            }


            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.format("%4d", arr[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Ошибка! Введены некорректные данные! " + "Введите размер массива целым числом и чтобы он был больше 2! ");
        }

    }
}