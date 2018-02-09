package Thinking_in_Java.Chapter_4;

public class TestOnly {
    static void Count1(int n) {
        for(int i = 0; i < n; i++)
            System.out.print(i + 1);

    }
    static void Count2(int n) {
        for(int i = 0; i < n; i++) {
            if(i == 99)
                break;
            System.out.print(i + 1);
        }
    }
    static void Count3(int n) {
        for(int i = 0; i < n; i++) {
            if(i == 99)
                return;
            System.out.print(i + 1);
        }
    }
    public static void main(String[] args) {
        Count1(100);
        System.out.println();
        Count2(100);
        System.out.println();
        Count3(100);
    }
}
