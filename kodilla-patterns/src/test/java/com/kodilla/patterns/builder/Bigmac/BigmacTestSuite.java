package com.kodilla.patterns.builder.Bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("PRAWN")
                .ingredient("CHEESE")
                .sauce("THOUSANDISLANDDRESSING")
                .burgers(3)
                .bun("STANDARDROLL")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String ingredients = bigmac.getIngredients().toString();
        String sauce = bigmac.getSauce();
        int howManyBurgers =bigmac.getBurgers();
        String bun = bigmac.getBun();

        //Then
        Assert.assertEquals(2,howManyIngredients);
        Assert.assertEquals(ingredients, "[PRAWN, CHEESE]");
        Assert.assertEquals("THOUSANDISLANDDRESSING",sauce);
        Assert.assertEquals(3,howManyBurgers);
        Assert.assertEquals("STANDARDROLL",bun);


    }
}
