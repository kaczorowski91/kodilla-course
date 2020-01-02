package com.kodilla.good.patterns.challenges.allegro.model;

import java.time.LocalDateTime;

public class Order {

    private final User user;
    private final Product product;
    private final int quantity;
    private final LocalDateTime orderTime;
    private final LocalDateTime deliveryTime;

    public Order(User user, Product product, int quantity, LocalDateTime orderTime, LocalDateTime deliveryTime) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.orderTime = orderTime;
        this.deliveryTime = deliveryTime;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }
}
