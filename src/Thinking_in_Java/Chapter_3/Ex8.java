package Thinking_in_Java.Chapter_3;

import static Thinking_in_Java.Chapter_3.Print.print;

public class Ex8 {
    public static void main(String[] args) {
        long n = 2018L;
        print(Long.toBinaryString(n));
        print();
        long n1 = 0X8F;//16-тиричное число
        long n2 = 0555;//8-миричное число
        print(Long.toBinaryString(n1));
        print(Long.toBinaryString(n2));

    }

}
