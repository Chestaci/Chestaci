package Chestaci.Graph;

import javax.swing.*;
import java.awt.*;

public class OvalComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
