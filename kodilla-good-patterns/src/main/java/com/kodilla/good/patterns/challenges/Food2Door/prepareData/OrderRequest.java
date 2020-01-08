package com.kodilla.good.patterns.challenges.Food2Door.prepareData;

import com.kodilla.good.patterns.challenges.Food2Door.model.Client;
import com.kodilla.good.patterns.challenges.Food2Door.model.Product;
import com.kodilla.good.patterns.challenges.Food2Door.model.Supplier.Supplier;

import java.util.Map;

public class OrderRequest {

    private Client client;
    private Supplier supplier;
    private Map<Product, Integer> productOrder;

    public OrderRequest(Client client, Supplier supplier, Map<Product, Integer> productOrder) {
        this.client = client;
        this.supplier = supplier;
        this.productOrder = productOrder;
    }


    public Client getClient() {
        return client;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Map<Product, Integer> getProductOrder() {
        return productOrder;
    }


}
