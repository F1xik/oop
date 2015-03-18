package com.oop.F1x;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Андрей on 20.02.2015.
 */
public class EqTriangle extends Line {
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void Draw() {
        window.setSize(200, 200);
        window.setLocation(800, 0);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        System.out.println("EqTriangle(" + a + ')');

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawLine(1, 100, 1 + a, 100);
                g.drawLine(1, 100, (1 + a)/2, (int)Math.round(100 - a * Math.sqrt(3)/2));
                g.drawLine((1 + a)/2,(int)Math.round(100 - a * Math.sqrt(3)/2), 1 + a, 100);

            }
        };
        window.add(panel);
        window.validate();
        window.repaint();



    }
}

