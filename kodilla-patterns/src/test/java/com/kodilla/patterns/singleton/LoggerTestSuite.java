package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public  static void openLogger(){
        Logger.getInstance().log("Error_01");
    }
    @Test
    public void testGetLastLog(){
        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        System.out.println("Test get last log: "+ log);
        //Then
        Assert.assertEquals("Error_01",log);
    }

}
