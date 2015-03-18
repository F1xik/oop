package com.oop.F1x;

/**
 * Created by Андрей on 20.02.2015.
 */
public class Main  {


    public static void main(String[] args) throws InterruptedException {
        Ellips ellips = new Ellips();
        ellips.setA(120);
        ellips.setB(70);

        Circle circle = new Circle();
        circle.setRad(50);


        Rectangle rectangle = new Rectangle();
        rectangle.setA(50);
        rectangle.setB(50);

        RgtTriangle rgtTriangle = new RgtTriangle();
        rgtTriangle.setA(80);
        rgtTriangle.setB(80);

        EqTriangle eqTriangle = new EqTriangle();
        eqTriangle.setA(50);

        Line line = new Line();
        line.setA(50);

        ListOfShapes listOfFigures = new ListOfShapes();

        listOfFigures.addShape(ellips);
        listOfFigures.addShape(circle);
        listOfFigures.addShape(rectangle);
        listOfFigures.addShape(rgtTriangle);
        listOfFigures.addShape(eqTriangle);
        listOfFigures.addShape(line);


        for (int i = 0; i < listOfFigures.lstOfShapes.size(); i++){
            listOfFigures.lstOfShapes.get(i).Draw();

        }


    }

}
