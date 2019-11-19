package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {2, 2, 4, 5, 6};
        //When
        double streamAverage = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(3.8, streamAverage, 0.5);
    }
}
