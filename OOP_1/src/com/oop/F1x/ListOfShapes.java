package com.oop.F1x;

import java.util.ArrayList;

/**
 * Created by Андрей on 20.02.2015.
 */
public class ListOfShapes {
    ArrayList<Line> lstOfShapes = new ArrayList<Line>();

    public void addShape(Line fig){
        lstOfShapes.add(fig);
    }
}
