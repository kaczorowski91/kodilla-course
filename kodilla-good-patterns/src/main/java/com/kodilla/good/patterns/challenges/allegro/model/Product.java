package com.kodilla.good.patterns.challenges.allegro.model;

public class Product {

    private final String productName;
    private final double prize;

    public Product(String productName, double prize) {
        this.productName = productName;
        this.prize = prize;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrize() {
        return prize;
    }
}
