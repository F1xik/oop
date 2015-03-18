package com.oop.F1x;
import java.awt.*;
import javax.swing.*;

/**
 * Created by Андрей on 20.02.2015.
 */
public class Ellips extends Circle {
    private int a, b;




    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void Draw()  {
        window.setSize(200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        System.out.println("Ellipse(" + a + ',' + b + ')');
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawOval(50, 50, a, b);
            }
        };

        window.add(panel);
        window.validate();
        window.repaint();


        }


    }

