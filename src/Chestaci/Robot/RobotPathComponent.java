package Chestaci.Robot;

import Chestaci.TeaProject.ObjectQueue;
import Chestaci.TwoQueue.TwoQueue;

import javax.swing.JComponent;
import java.awt.Graphics;

public class RobotPathComponent extends JComponent {
    private Robot robot;

    public RobotPathComponent(Robot robot) {
        this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Перебираем все линии, которые сохранились у робота
        // Несколько позже мы разберем эту конструкицю подробно
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ObjectQueue oq = robot.getOqLines();
        //System.out.println(oq.size());
        //while ((oq.size() > 0) || (oq.pull() != null)) {

            //проба
            //System.out.println(robot.getOqLines().size());
            //    while(robot.getOqLines().size() > 0){
            //      for(int i = robot.getOqLines().size(); i > 0; i--){
            //while(robot.getOqLines().get(0) != null){
            // for(int i = 0; i < 4; i++){
            //RobotLine rl = robot.getOqLines().pull();
            //проба
            //  do{
       // while ((oq.size() > 0) || (oq.pull() != null)) {
         //   RobotLine rl = (RobotLine) oq.pull();
            for(int i = 0; i < oq.size(); i++){
            RobotLine rl = (RobotLine) oq.get(i);
              //  RobotLine rl = (RobotLine) oq.pull();
            int x1 = (int) Math.round(rl.getX1());
            int y1 = (int) Math.round(rl.getY1());
            int x2 = (int) Math.round(rl.getX2());
            int y2 = (int) Math.round(rl.getY2());
            // И рисуем линию с координатами
            g.drawLine(x1, y1, x2, y2);
            //
          //  System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
           // System.out.println(robot.getOqLines().size());
            //
        }
      //  }while (oq.size() > 0);


//        /*
//        RobotLine rl2 = (RobotLine) oq.pull();
//        int x12 = (int) Math.round(rl2.getX1());
//        int y12 = (int) Math.round(rl2.getY1());
//        int x22 = (int) Math.round(rl2.getX2());
//        int y22 = (int) Math.round(rl2.getY2());
//        // И рисуем линию с координатами
//        g.drawLine(x12, y12, x22, y22);
//
//        RobotLine rl3 = (RobotLine) oq.pull();
//        int x13 = (int) Math.round(rl3.getX1());
//        int y13 = (int) Math.round(rl3.getY1());
//        int x23 = (int) Math.round(rl3.getX2());
//        int y23 = (int) Math.round(rl3.getY2());
//        // И рисуем линию с координатами
//        g.drawLine(x13, y13, x23, y23);
//
//        RobotLine rl4 = (RobotLine) oq.pull();
//        int x14 = (int) Math.round(rl4.getX1());
//        int y14 = (int) Math.round(rl4.getY1());
//        int x24 = (int) Math.round(rl4.getX2());
//        int y24 = (int) Math.round(rl4.getY2());
//        // И рисуем линию с координатами
//        g.drawLine(x14, y14, x24, y24);
//*/



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        for (RobotLine rl : robot.getLines()) {     //  для ArrayList
//        // Для каждой линии получаем координаты

       // TwoQueue t = robot.getQQQ();
    //    int yt = t.getSize();
     //   System.out.println(t.getSize());
    //                for (int i = 0; i < yt; i++) {
    //    while (t.getSize() > 0) {
           //     RobotLine rl = (RobotLine) t.pull();
                int x1 = (int) Math.round(rl.getX1());
                int y1 = (int) Math.round(rl.getY1());
                int x2 = (int) Math.round(rl.getX2());
                int y2 = (int) Math.round(rl.getY2());
                // И рисуем линию с координатами
                g.drawLine(x1, y1, x2, y2);
                System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/
    }
}
