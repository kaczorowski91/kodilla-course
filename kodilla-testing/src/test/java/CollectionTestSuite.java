package com.kodilla.testing.collection;

        import com.kodilla.testing.collection.OddNumberExterminator;
        import org.junit.Assert;
        import org.junit.Test;
        import java.util.ArrayList;
        import org.junit.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
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
    public void testOddNumbersExterminatorEmptyList(){
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
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        ArrayList<Integer> myList1 = new ArrayList<>();
        myList1.add(5);
        myList1.add(10);
        myList1.add(11);
        myList1.add(20);
        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(10);
        myList2.add(20);
        //When
        ArrayList<Integer> result = oddNumberExterminator.exterminate(myList1);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(myList2, result);
    }
}
