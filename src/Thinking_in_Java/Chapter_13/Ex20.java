package Thinking_in_Java.Chapter_13;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

public class Ex20 {
    int i;
    long l;
    float f;
    double d;
    String s;

    public Ex20(String string) {
        Scanner scanner = new Scanner(string);
        s = scanner.nextLine();
        i = scanner.nextInt();
        l = scanner.nextLong();
        f = scanner.nextFloat();
        d = scanner.nextDouble();
            }

    @Override
    public String toString() {
        return "Ex20{" + "int i = " + i + ", long l = " + l + ", float f = " + f + ", double d = " + d + ", String s = '" + s + '\'' + '}';
    }

    public static void main(String[] args) {
        Ex20 ex20 = new Ex20("Мистер Вайт выпил чаю кружек\n33 21322 1,32 2,545");
        System.out.println(ex20.toString());
    }
}
