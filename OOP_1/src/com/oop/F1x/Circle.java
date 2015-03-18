package com.oop.F1x;
import javax.swing.*;
import java.awt.*;
/**
 * Created by Андрей on 20.02.2015.
 */
public class Circle extends Line  {
    private int rad;



    public void setRad(int rad) {
        this.rad = rad;
    }

    @Override
    public void Draw() {
        window.setSize(200, 200);
        window.setLocation(200, 0);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        System.out.println("Circle(" + rad + ')');
        JPanel panel1 = new JPanel() {
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawOval(50, 50, rad, rad);
            }
        };

        window.add(panel1);
        window.validate();
        window.repaint();


    }
}
