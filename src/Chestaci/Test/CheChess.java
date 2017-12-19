package Chestaci.Test;

public class CheChess {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++) {
                if (((i % 2) == 0) || ((j % 2) == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
