public class Single {
    public static void main(String[] args) {
        int a, b;
        for (a = 2; a <= 10000; a++) {
            b = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    b++;
            }
            if (b <= 2) {
                System.out.print(a + " ");
            }
        }
    }
}