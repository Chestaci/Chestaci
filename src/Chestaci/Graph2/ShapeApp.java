package Chestaci.Graph2;

import javax.swing.*;

public class ShapeApp {
    public static void main(String[] args) {
        // Создаем графическое окно
        ShapeFrame of = new ShapeFrame();
        // Задаем правидо, по которому приложение завершиться при
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
    }
}
