package Chestaci.Test;

public class Rhombustick {
    public static void main(String[] args) {
        int a = 12;
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                if ((i == ((a - 1) / 2) - j) || (i == ((a / 2) + j)) || (i == (j - (a / 2))) || (i == ((a - j) + ((a - 1))/2))){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
