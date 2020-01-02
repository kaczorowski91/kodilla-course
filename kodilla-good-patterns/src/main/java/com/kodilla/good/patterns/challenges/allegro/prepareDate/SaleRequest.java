package com.kodilla.good.patterns.challenges.allegro.prepareDate;

import com.kodilla.good.patterns.challenges.allegro.model.Product;
import com.kodilla.good.patterns.challenges.allegro.model.User;

import java.time.LocalDateTime;

public class SaleRequest {

    private final User user;
    private final Product product;
    private final Integer quantity;
    private final LocalDateTime orderTime;
    private final LocalDateTime deliveryTime;

    public SaleRequest(User user, Product product, Integer quantity, LocalDateTime orderTime, LocalDateTime deliveryTime) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }
}
