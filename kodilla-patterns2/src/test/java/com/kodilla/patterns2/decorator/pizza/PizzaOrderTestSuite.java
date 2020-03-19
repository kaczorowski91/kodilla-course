package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaWithHamWithPinneappleWithGarlicSauceWithTwoBeerWithDeliveryGetCostGetDescription(){
        //Given
        PizzaOrder thePizzaOrder = new BasicPizzaOrder();
        thePizzaOrder = new HamDecorator(thePizzaOrder);
        thePizzaOrder = new PineappleDecorator(thePizzaOrder);
        thePizzaOrder = new GarlicSauceDecorator(thePizzaOrder);
        thePizzaOrder = new BeerDecorator(thePizzaOrder);
        thePizzaOrder = new BeerDecorator(thePizzaOrder);
        thePizzaOrder = new DeliveryDecorator(thePizzaOrder);
        //When
        BigDecimal theCost = thePizzaOrder.getCost();
        String description = thePizzaOrder.getDescription();

        //Then
        Assert.assertEquals(new BigDecimal(48),theCost);
        Assert.assertEquals("Pizza with ham with pineapple with extra garlic sauce + beer + beer with delivery",description);
    }
}
