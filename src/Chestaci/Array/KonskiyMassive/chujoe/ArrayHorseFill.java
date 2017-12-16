package Chestaci.Array.KonskiyMassive.chujoe;

public class ArrayHorseFill {
    //IZ INTERNETA
    private static int deskSize = 8;
    private static int[][] desk = new int[deskSize][deskSize];
    private static int i = 0;
    private static int j = 0;
    private static int count = 1;
    private static int[] iStep = {2, 2, -2, -2, 1, -1, 1, -1};
    private static int[] jStep = {1, -1, -1, 1, -2, -2, 2, 2};
    private static int k;
    private static int[] minStep = {8, 0, 0};

    public static void main (String[] args){
        /* Заполняем массив нулями */
        for (i = 0; i < deskSize; i++){
            for ( j = 0; j < deskSize; j++) {
                desk[i][j] = 0;
            }
        }

        /* Заполняем массив "ходом коня" используя метод CheckHS() */
        i = 0;
        j = 0;
        desk[i][j] = 1;
        for (count=2; count<=Math.pow(deskSize, 2); count++){
            minStep[0] = 8;
            for (k=0; k<8; k++){
                if (0<=(i+iStep[k]) && (i+iStep[k])<deskSize &&
                        0<=(j+jStep[k]) && (j+jStep[k])<deskSize &&
                        desk[i+iStep[k]][j+jStep[k]]==0 &&
                        CheckHS(i+iStep[k],j+jStep[k])<=minStep[0]){
                    minStep[0] = CheckHS(i+iStep[k],j+jStep[k]);
                    minStep[1] = i+iStep[k];
                    minStep[2] = j+jStep[k];
                }
            }
            i = minStep[1];
            j = minStep[2];
            desk[i][j] = count;
        }

        /* Выводим массив на печать */
        for (i = 0; i < deskSize; i++){
            for (j = 0; j < deskSize; j++) {
                if (desk[i][j] == 0){
                    System.out.print("   X");
                } else {
                    System.out.format("%4d",desk[i][j]);
                }
            }
            System.out.println();
        }
    }

    /* Метод ChechHS(int, int) подсчитывает количество
     * возможных ходов на пустые клетки из квадрата с
     * заданными координатами
     */
    private static int CheckHS (int i, int j){
        int steps = 0;
        int n;

        for (n=0; n<8; n++){
            if (0<=(i+iStep[n]) && (i+iStep[n])<deskSize && 0<=(j+jStep[n]) &&
                    (j+jStep[n])<deskSize && desk[i+iStep[n]][j+jStep[n]]==0){
                steps++;
            }
        }
        return steps;
    }


}
