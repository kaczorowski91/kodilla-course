package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;
    private double side;

    public Square(String name, int side){
        this.name=name;
        this.side=side;
    }
    @Override
    public String getShapeName(){return name;}
    @Override
    public double getField(){return side*side;}
    @Override
    public String toString (){
    return "Name of shape "+name + ". Side of shape "+side;
    }
}
