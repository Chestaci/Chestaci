package Thinking_in_Java.Chapter_3;
//: object/Ex2.java

import java.util.Date;

import static Thinking_in_Java.Chapter_3.Print.print;

/** Первая собственная программа-пример с документацией.
 * Выводит строку.
 * @author Настенька и Вадом
 * @version 1.0
 */

public class HelloDate2 {
    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     * @throws exceptions Исключения не выдаются
     */
    public static void main(String[] args) {
        System.out.println("Привет, мир!");
        print("Привет, сегодня ");
        print(new Date());
    }
}///:~
