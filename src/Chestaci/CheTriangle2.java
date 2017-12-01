package Chestaci;

public class CheTriangle2 {

    public static void main(String[] args) {

        int a = 10;
        for (int i = 0; i < a; i++){
          for(int j = 0; j < i + 1; j++){
              if ((j == 0) || (i == (a - 1)) || (j == i)) {
                  System.out.print("*");
              } else {
                  System.out.print(" ");
              }
          }
            System.out.println();
        }

    }
}