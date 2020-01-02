package com.kodilla.good.patterns.challenges.allegro.savingData;

import com.kodilla.good.patterns.challenges.allegro.model.Order;

import java.util.ArrayList;
import java.util.List;

public class CarSalesRepository implements SalesRepository {

    List<Order> carRepository = new ArrayList<>();

    public void addOrderToRepository(Order order) {
        carRepository.add(order);
        System.out.println("Order have been save in car order repository");
    }

}
