package Chestaci.Array;

public class MultiArray {
    public static void main(String[] args) {
        // Объявим коснтанту для размера массива
        int SIZE = 10;
        // Создаем двумерный массив
        char[][] graph = new char[SIZE][SIZE];

        // Цикл по первой размерности (первые квадратные скобки)
        for (int i = 0; i < SIZE; i++) {
            // Цикл по второй размерности (вторые квадратные скобки)
            for (int j = 0; j < SIZE; j++) {
                if ((i == 0) || (j == 0) || ( i == (SIZE - 1)) || (j == (SIZE - 1)) || (i == j) || (i == ((SIZE - 1) - j))) {
                    graph[i][j] = '#';
                } else {
                    graph[i][j] = ' ';
                }
            }
        }

        // Теперь выводим массив на экран
        // Цикл по первой размерности выводит строки
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
