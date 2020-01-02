package com.kodilla.good.patterns.challenges.allegro.savingData;

import com.kodilla.good.patterns.challenges.allegro.model.Order;

import java.util.ArrayList;
import java.util.List;

public class ToySalesRepository implements SalesRepository {

    List<Order> toyRepository = new ArrayList<>();

    public void addOrderToRepository(Order order) {
        toyRepository.add(order);
        System.out.println("Order have been save in toy order repository");
    }

}
