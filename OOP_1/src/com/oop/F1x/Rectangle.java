package com.oop.F1x;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Андрей on 20.02.2015.
 */
public class Rectangle extends Circle {
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
        window.setLocation(400, 0);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        System.out.println("Rectangle(" + a + ',' + b + ')');

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawRect(50, 50, a, b);
            }
        };

        window.add(panel);
        window.validate();
        window.repaint();

    }
}
