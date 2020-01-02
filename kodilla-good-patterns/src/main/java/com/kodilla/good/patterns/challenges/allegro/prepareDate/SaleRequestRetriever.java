package com.kodilla.good.patterns.challenges.allegro.prepareDate;

import com.kodilla.good.patterns.challenges.allegro.model.Order;
import com.kodilla.good.patterns.challenges.allegro.model.Product;
import com.kodilla.good.patterns.challenges.allegro.model.User;

import java.time.LocalDateTime;

public class SaleRequestRetriever {

    public Order retrieve() {

        User user = new User("Jan", "Kowalski");
        Product product = new Product("Mazda 6", 150000);
        Integer quantity = 5;
        LocalDateTime orderTime = LocalDateTime.of(2020, 1, 1, 13, 55);
        LocalDateTime deliveryTime = LocalDateTime.of(2020, 1, 15, 23, 59);
        return new Order(user, product, quantity, orderTime, deliveryTime);
    }
}
