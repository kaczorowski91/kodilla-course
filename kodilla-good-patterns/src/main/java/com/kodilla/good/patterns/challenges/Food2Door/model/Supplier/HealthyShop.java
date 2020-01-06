package com.kodilla.good.patterns.challenges.Food2Door.model.Supplier;

import com.kodilla.good.patterns.challenges.Food2Door.model.Client;
import com.kodilla.good.patterns.challenges.Food2Door.model.Product;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {

    private final Map<Product, Integer> supplierProduct;

    public HealthyShop() {
        supplierProduct = createSupplierProduct();
    }

    private Map<Product, Integer> createSupplierProduct() {

        Map<Product, Integer> supplierProduct = new HashMap<>();

        supplierProduct.put(new Product("Herbs"), 150);
        supplierProduct.put(new Product("Bread"), 250);
        supplierProduct.put(new Product("Fish"), 131);

        return supplierProduct;
    }

    @Override
    public String supplierName() {
        return "ExtraFoodShop";
    }

    @Override
    public boolean process(Client client, Map<Product, Integer> clientOrders) {
        return false;
    }
}
