package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.prepareData.OrderRequest;

public class OrderService {

    public void process(OrderRequest orderRequest) {

        System.out.println("Prepare Order from: " + orderRequest.getClient().getName() + " Product: " +
                orderRequest.getProductOrder() + " Supplier: " + orderRequest.getSupplier().supplierName());
    }
}
