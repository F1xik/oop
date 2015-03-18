package com.oop.F1x;
import javax.swing.*;
import java.awt.*;
/**
 * Created by Андрей on 20.02.2015.
 */
public class Line extends JComponent{

    private int a;

    JFrame window = new JFrame();

    public void setA(int a) {
        this.a = a;
    }


    public void Draw() {
        window.setSize(200, 200);
        window.setLocation(1000, 0);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        System.out.println("Line(" + a + ')');

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawLine(1, 50, 1 + a, 50);

            }
        };
        window.add(panel);
        window.validate();
        window.repaint();


    }
}
