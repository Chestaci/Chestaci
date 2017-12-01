package Chestaci.Array;

public class ProbSpiralArrRectangle {
    public static void main(String[] args) {

        int SIZE_LINES = 5;
        int SIZE_COLUMN = 3;
        int num = 1;

        if ((SIZE_LINES > 1) && (SIZE_COLUMN > 1)) {

        int[][] arr = new int[SIZE_LINES][SIZE_COLUMN];
        int q = SIZE_LINES * SIZE_COLUMN; //last num

        int a = SIZE_LINES;
        int b = SIZE_COLUMN;
        int l = 0; //line
        int c = 0; //column

           while (num < (q + 1)) {   //for (num = 1; num < (q + 1); )
                   for (int i = l; i < a; i++) {
                       for (int j = c; j < b; j++) {
                           if ((i == l) && (j != b - 1)) {
                               arr[i][j] = num++;
                           }
                       }
                   }

                   for (int i = l; i < a; i++) {
                       for (int j = c; j < b; j++) {
                           if ((j == (b - 1))) {
                               arr[i][j] = num++;
                           }
                       }
                   }

                   for (int i = (a - 1); i >= l; i--) {
                       for (int j = (b - 1); j >= c; j--) {
                           if ((i == (a - 1))&&(j != (b - 1))) {
                               arr[i][j] = num++;
                           }
                       }
                   }

                   for (int i = (a - 1); i >= l; i--) {
                       for (int j = (b - 1); j >= c; j--) {
                           if (num < (q + 1)) {
                               if ((j == c)&&(i != l)&&(i != a - 1)) {
                                   arr[i][j] = num++;
                               }
                           }
                       }
                   }

                   a--;
                   b--;
                   l++;
                   c++;
           }


            for (int i = 0; i < SIZE_LINES; i++) {
                for (int j = 0; j < SIZE_COLUMN; j++) {
                    System.out.format("%4d", arr[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Ошибка! Введены некорректные данные! " + "Введите размер массива целым числом и чтобы он был больше 2! ");
        }

    }
}