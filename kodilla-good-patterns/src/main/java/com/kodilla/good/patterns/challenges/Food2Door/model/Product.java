package com.kodilla.good.patterns.challenges.Food2Door.model;

public class Product {

    private final String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
