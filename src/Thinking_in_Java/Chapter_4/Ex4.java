package Thinking_in_Java.Chapter_4;

public class Ex4 {
    public static void main(String[] args) {
        int n = 100;
        for (int a = 0; a <= n; a++) {
            int b = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    b++;
            }
            if (b <= 2){
                if(a != 0) {
                    if (a != 1) {
                        System.out.print(a + " ");
                    }
                }
            }
        }

        System.out.println();
        for(int i = 1; i < 1000; i++ ) {
            int factors = 0;
            for(int j = 1; j < (i + 2)/2; j++ ) {
                if((i % j) == 0) factors++;
            }
            if(factors < 2) System.out.println(i + " is prime");
        }

    }
}
