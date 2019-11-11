package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {

    //Test suite for classes of ShapeCollector
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 12);
        Shape triangle = new Triangle("triangle", 5, 24);
        Shape circle = new Circle("circle", 2);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //When
        int numberOfShapes = shapeCollector.showFigures().size();
        //Then
        assertEquals(3, numberOfShapes);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 12);
        Shape triangle = new Triangle("triangle", 5, 24);
        Shape circle = new Circle("circle", 2);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(square);
        shapeCollector.removeFigure(circle);
        //When
        int numberOfShapes = shapeCollector.showFigures().size();
        //Then
        assertEquals(1, numberOfShapes);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 12);
        Shape triangle = new Triangle("triangle", 5, 24);
        Shape circle = new Circle("circle", 2);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //When
        Shape testGetShape = shapeCollector.getFigure(2);
        //Then
        assertEquals(circle, testGetShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square", 12);
        Shape triangle = new Triangle("triangle", 5, 24);
        Shape circle = new Circle("circle", 2);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        ArrayList<Shape> expectedList = new ArrayList<>();
        expectedList.add(square);
        expectedList.add(triangle);
        expectedList.add(circle);
        //When
        ArrayList<Shape> shapes = shapeCollector.showFigures();
        //Then
        assertEquals(expectedList, shapes);
    }
}