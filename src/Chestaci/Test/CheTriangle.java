package Chestaci.Test;

public class CheTriangle {

    public static void main(String[] args) {

        int a = 11;
        int i = 0;
        while (i < a){
            int k = 0;
            while(k < (i + 1)){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }

    }
}