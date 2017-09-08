import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * n);
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println(" ");

        ArrayUtils a = new ArrayUtils(arr);
        System.out.println("Min = " + a.Min());
        System.out.println("Max = " + a.Max());
        System.out.println("Average = " + a.Average());
    }

}