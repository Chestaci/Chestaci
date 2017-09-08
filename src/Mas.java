import java.util.Scanner;

public class Mas {
    public static void main(String[] args) {
        int n,arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        arr = new int [n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) ( Math.random() * n);
        for (int i: arr)
            System.out.print(i + " ");
        System.out.println(" ");

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr [i])
                min = arr [i];
                 }
        System.out.println("Минимальное значение: " + min);

        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr [i])
                max = arr [i];
        }
        System.out.println("Максимальное значение: " + max);
    }

    }

