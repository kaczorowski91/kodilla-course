package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.model.Supplier.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.Food2Door.model.Supplier.Supplier;
import com.kodilla.good.patterns.challenges.Food2Door.prepareData.OrderRequestRetriever;

public class Application {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        orderService.process(orderRequestRetriever.retriever());

        Supplier supplier= new ExtraFoodShop();
        supplier.process(orderRequestRetriever.retriever().getClient(),orderRequestRetriever.retriever().getProductOrder());
    }
}
