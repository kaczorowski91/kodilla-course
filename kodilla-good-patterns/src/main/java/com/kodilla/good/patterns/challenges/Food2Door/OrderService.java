package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.prepareData.OrderRequest;

import java.util.stream.Collectors;

public class OrderService {

    public void process(OrderRequest orderRequest) {

        System.out.println("Prepare Order from: \n" + orderRequest.getClient().getName() + "\nProduct:\n" + this.orderRequest(orderRequest) + "\nSupplier:\n" + orderRequest.getSupplier().supplierName());
    }

    public String orderRequest(OrderRequest orderRequest) {
        String order = orderRequest.getProductOrder().entrySet().stream()
                .map(entry -> entry.getKey() + " -> " + entry.getValue())
                .collect(Collectors.joining(" , "));
        return order;
    }
}
