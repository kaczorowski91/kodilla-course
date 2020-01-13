package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double total = calculator.add(8, 4);
        double sub = calculator.sub(8, 4);
        double mul = calculator.mul(8, 4);
        double div = calculator.div(8, 4);
        //Then
        Assert.assertEquals(12,total,0);
        Assert.assertEquals(4,sub,0);
        Assert.assertEquals(32,mul,0);
        Assert.assertEquals(2,div,0);



    }
}
