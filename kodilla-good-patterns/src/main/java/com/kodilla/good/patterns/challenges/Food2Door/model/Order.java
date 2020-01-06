package com.kodilla.good.patterns.challenges.Food2Door.model;

import com.kodilla.good.patterns.challenges.Food2Door.model.Supplier.Supplier;

public class Order {

    private final Client client;
    private final Supplier supplier;
    private final Product product;
    private final Integer quantity;

    public Order(Client client, Supplier supplier, Product product, Integer quantity) {
        this.client = client;
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }


    public Client getClient() {
        return client;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
