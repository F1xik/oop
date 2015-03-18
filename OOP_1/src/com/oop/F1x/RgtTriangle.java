package com.oop.F1x;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Андрей on 20.02.2015.
 */
public class RgtTriangle extends EqTriangle {
    private int a, b;



    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void Draw() {
        window.setSize(200, 200);
        window.setLocation(600, 0);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        System.out.println("RgtTriangle(" + a + ',' + b + ')');

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawLine(1, 100, 1, 100 - a);
                g.drawLine(1, 100, 1 + b, 100);
                g.drawLine(1, 100 - a, 1 + b, 100);
            }
        };
        window.add(panel);
        window.validate();
        window.repaint();


    }
}
