package Chestaci.Robot;

import Chestaci.TwoQueue.TwoQueue;
import FIFO.ObjectQueue;

import javax.swing.*;

public class RobotManager{
    public static void main(String[] args) {

//        RobotExt robot = new RobotExt(0,0, 0);
//        robot.printCoordinates();
//        robot.forward(20);
//        robot.printCoordinates();
//        robot.setCourse(90);
//        robot.forward(20);
//        robot.printCoordinates();
//        robot.setCourse(45);
//        robot.forward(20);
//        robot.printCoordinates();
//        robot.back(10);
//        robot.printCoordinates();

//        Robot robot1 = new Robot("Test Robot 1");
//        Robot robot2 = new Robot("Test Robot 2");
//        System.out.println(robot1.toString());
//        System.out.println(robot2.toString());

//        Robot robot = new RobotTotal(0, 0);
//        robot.forward(20);
//        robot.setCourse(90);
//        robot.forward(20);
//        robot.setCourse(90);
//        robot.forward(50);
//        // Напечатать координаты
//        robot.printCoordinates();
//        System.out.println(robot.getClass().getName());

        // Количество сторон многоугольника


//ЗВЁЗДОЧКА
//        final double COUNT = 5;
//        // Длина стороны
//        final int SIDE = 100;
//
//        Robot robot = new Robot(200, 50);
//        // Создаем замкнутую фигуру с количеством углов COUNT
//        for (int i = 0; i < COUNT; i++) {
//            robot.forward(SIDE);
//         //   robot.setCourse(robot.getCourse() + 360 / COUNT); // многоугольник
//            robot.setCourse(robot.getCourse() + (360 / (COUNT / 2))); // 5-конечная звезда
//            robot.printCoordinates();
//        }



// ТОЖЕ СПИРАЛЬКА
//        final double COUNT = 42;
//       // Длина стороны
//
//
//        final int SIDE = 450;
//
//        int chislo = SIDE;
//
//        Robot robot = new Robot(0, 0);
//        // Создаем замкнутую фигуру с количеством углов COUNT
//        while (chislo > 0) {
//            robot.forward(chislo);
//            robot.setCourse(robot.getCourse() + 90);
//            robot.forward(chislo);
//            robot.setCourse(robot.getCourse() + 90);
//            chislo -= 30;
//        }


//СПИРАЛЬКА
//        final int SIDE = 450;
//        final int STEP = 30;
//
//        int chislo = SIDE;
//
//        Robot robot = new Robot(0, 0);
//
//       while (chislo > 0) {
//            robot.forward(chislo);
//            robot.setCourse(robot.getCourse() + 90);
//            robot.forward(chislo);
//            robot.setCourse(robot.getCourse() + 90);
//            chislo -= STEP;
//        }




//
//        //Квадратище
//        // Количество сторон многоугольника
        final int COUNT = 4;
        // Длина стороны
        final int SIDE = 100;

        Robot robot = new Robot(200, 50);
        // Установка слушателя для робота
        RobotListener srl = new SimpleRobotListener();
        robot.setListener(srl);
        // Создаем замкнутую фигуру с количеством углов COUNT
        for (int i = 0; i < COUNT; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 360 / COUNT);
        }


       // Создаем форму для отрисовки пути нашего робота
        RobotFrame rf = new RobotFrame(robot);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);
    }

}
