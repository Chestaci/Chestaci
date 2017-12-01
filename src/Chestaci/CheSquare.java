package Chestaci;

public class CheSquare {
    public static void main(String[] args) {
        int a = 20;
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                if((i == 0) || (j == 0) || ( i == (a - 1)) || (j == (a - 1)) || (i == j) || (i == ((a - 1) - j))){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
