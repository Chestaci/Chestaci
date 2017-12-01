package Chestaci.Array;

public class ArrayTriangle {
    public static void main(String[] args) {
        // Объявим коснтанту для размера массива
        int SIZE = 11;
        // Создаем двумерный массив
        char[][] graph = new char[SIZE][SIZE];
        // Цикл по первой размерности (первые квадратные скобки)
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j < (i + 1)) {
                    graph[i][j] = '#';
                } else {
                    graph[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            // Цикл по второй размерности выводит колонки - вывод одной строки
            for (int j = 0; j < SIZE; j++) {
                // Используем оператор print - без перехода на следующую строку
                System.out.print(graph[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }
}
