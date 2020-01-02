package com.kodilla.good.patterns.challenges.allegro.prepareSales;

import com.kodilla.good.patterns.challenges.allegro.model.Product;
import com.kodilla.good.patterns.challenges.allegro.model.User;

import java.time.LocalDateTime;

public interface SalesService {

    boolean createOrder(User user, Product product, LocalDateTime orderTime, LocalDateTime deliveryTime);

}
