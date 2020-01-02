package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private double side;
    private double height;

    public Triangle(String name, int side, int height) {
        this.name = name;
        this.side = side;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (side * height) / 2;
    }

    @Override
    public String toString() {
        return "Name of shape " + name + ". Side of shape " + side + ". Height of shape " + height;
    }
}