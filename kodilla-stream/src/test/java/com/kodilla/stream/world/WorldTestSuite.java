package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", BigDecimal.valueOf(36000000));
        Country russia = new Country("Russia", BigDecimal.valueOf(59500000));
        Country france = new Country("France", BigDecimal.valueOf(5900000));
        Country usa = new Country("USA", BigDecimal.valueOf(1000000009));
        Continent europe = new Continent(asList(poland, russia, france));
        Continent america = new Continent(asList(usa));
        World world = new World(asList(europe, america));
        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(BigDecimal.valueOf(1101400009), peopleQuantity);

    }
}
