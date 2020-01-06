package com.kodilla.good.patterns.challenges.Food2Door.prepareData;


import com.kodilla.good.patterns.challenges.Food2Door.model.Client;
import com.kodilla.good.patterns.challenges.Food2Door.model.Product;
import com.kodilla.good.patterns.challenges.Food2Door.model.Supplier.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.Food2Door.model.Supplier.Supplier;

import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    public OrderRequest retriever() {

        Client client1 = new Client("Jan");
        Supplier supplier1 = new ExtraFoodShop();
        Map<Product, Integer> productOrder = new HashMap<>();
        productOrder.put(new Product("Pizza"), 5);
        productOrder.put(new Product("Hot Dog"), 3);

        return new OrderRequest(client1, supplier1, productOrder);
    }
}
