package Pr;

import javax.swing.*;



public class Frame extends JFrame {
    public static void main(String[] args) {
        Shape sf = new Shape();
        sf.setTitle("First window");
        sf.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
//        sf.setBounds(100, 100, 400, 200);
        sf.setVisible(true);
        sf.setSize(500, 500);


    }
}