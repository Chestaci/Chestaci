package Chestaci.Robot;

import Chestaci.TeaProject.ObjectQueue;
import Chestaci.TwoQueue.TwoQueue;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private double x = 0;
    private double y = 0;
    protected double course = 0;
    private ArrayList<RobotLine> lines = new ArrayList<RobotLine>();

    //   private TwoQueue qqq = new TwoQueue();
    private ObjectQueue<RobotLine> oqLines = new ObjectQueue<RobotLine>();

    private Operator operator;

    private String name;

    public Robot(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "name= " + name;
    }

    public void printCoordinates() {
        System.out.println(x + "," + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    private RobotListener listener;

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setListener(RobotListener listener) {
        this.listener = listener;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void forward(int distance) {
        // Вызываем слушателя (если он установлен) в начале
        if (listener != null) {
            listener.startMove(x, y);
        }
        // Запоминаем координаты робота перед перемещением
        final double xOld = x;
        final double yOld = y;
        // Меняем координаты
        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);
        // Вызываем слушателя (если он установлен) после остановки
        if (listener != null) {
            listener.endMove(x, y);
        }
        // Запоминаем координаты пройденного пути в списке
        // Класс List позволяет добавить объект и хранить его
        lines.add(new RobotLine(xOld, yOld, x, y));// для ArrayList
        oqLines.push(new RobotLine(xOld, yOld, x, y)); // для очереди

        //      qqq.push(new RobotLine(xOld, yOld, x, y));

    }

//    public TwoQueue getQQQ() {
//        return qqq;
//
//
    //   }

    public ArrayList<RobotLine> getLines() {
        return lines;
    }

    public ObjectQueue<RobotLine> getOqLines() {
        return oqLines;
    }
}
