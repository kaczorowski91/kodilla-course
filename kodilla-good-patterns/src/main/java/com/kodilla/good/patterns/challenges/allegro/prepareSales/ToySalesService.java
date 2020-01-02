package com.kodilla.good.patterns.challenges.allegro.prepareSales;

import com.kodilla.good.patterns.challenges.allegro.model.Product;
import com.kodilla.good.patterns.challenges.allegro.model.User;

import java.time.LocalDateTime;

public class ToySalesService implements SalesService {

    public boolean createOrder(User user, Product product, LocalDateTime orderTime, LocalDateTime deliveryTime) {

        System.out.println(product.getProductName() + " purchase by " + user.getName() + user.getLastName() +
                " on " + orderTime + "will be delivery on " + deliveryTime);

        return true;
    }
}
