package Pr;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class Rectangle extends JComponent {

//    public static void main(String[] args) {
//
////        Line A = new Line(1, 2,1, 4);
////        Line B = new Line(-1, 2, -1, 3);
////
////    private Point2D getCrossing(Line otherLine) {
////
////    }
//
//        Point Avl = new Point(1, 2); // верхняя левая точка 1го прямоугольника
//        Point Anp = new Point(2, 4); // нижняя правая точка 1го прямоугольника
//        Point Bvl = new Point(-1, 2); // верхняя левая точка 2го прямоугольника
//        Point Bnp = new Point(0, 3); // нижняя правая точка 2го прямоугольника
//
//        if (((Avl.getX() <= Bvl.getX()) && (Bvl.getX() <= Anp.getX()) ||
//                ((Bvl.getX() <= Avl.getX()) && (Avl.getX() <= Bnp.getX()))) &&
//                ((Avl.getY() <= Bvl.getY()) && (Bvl.getY() <= Anp.getY()) ||
//                        ((Bvl.getY() <= Anp.getY()) && (Avl.getY() <= Bnp.getY())))){
//            System.out.println("Прямоугольники пересекаются!!!");
//        } else {
//            System.out.println("Прямоугольники не пересеклись!!!");
//        }
//
//    }


        @Override protected void paintComponent (Graphics graphics){
            super.paintComponent(graphics);
//        graphics.drawRect(10, 40, 10, 20);
//        graphics.drawRect(-10, 30, 10, 10);

            graphics.drawLine(10, 20, 10, 30);
            graphics.drawLine(10, 30, 20, 30);
            graphics.drawLine(20, 30, 20, 20);
            graphics.drawLine(20, 20, 10, 20);

            graphics.drawLine(30, 20, 30, 40);
            graphics.drawLine(30, 40, 40, 40);
            graphics.drawLine(40, 40, 40, 20);
            graphics.drawLine(40, 20, 30, 20);


        }
    }
