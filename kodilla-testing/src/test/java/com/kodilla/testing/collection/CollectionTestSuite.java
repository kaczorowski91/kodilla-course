package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumberExterminator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import org.junit.*;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        //When
        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<Integer> result = oddNumberExterminator.exterminate(myList);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(10);
        testList.add(11);
        testList.add(20);
        ArrayList<Integer> evenTestList = new ArrayList<>();
        evenTestList.add(10);
        evenTestList.add(20);
        //When
        ArrayList<Integer> result = oddNumberExterminator.exterminate(testList);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(evenTestList, result);
    }
}
