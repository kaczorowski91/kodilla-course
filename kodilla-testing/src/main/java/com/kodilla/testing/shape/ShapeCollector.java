package com.kodilla.testing.shape;

import com.kodilla.testing.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

public class ShapeCollector {

        ArrayList<Shape> shapeList = new ArrayList<>();

        Shape square = new Square("square", 12);
        Shape triangle = new Triangle("triangle", 5, 24);
        Shape circle = new Circle("circle", 2);

        public void addFigure(Shape shape){
            shapeList.add(shape);
        }
        public void removeFigure(Shape shape){
            shapeList.remove(shape);
        }
        public void getFigure(int n) {
            shapeList.get(n);
        }
        public void  showFigures(){
            System.out.println("Shape ");
        }

}

