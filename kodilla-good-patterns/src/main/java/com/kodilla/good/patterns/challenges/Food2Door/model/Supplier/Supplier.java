package com.kodilla.good.patterns.challenges.Food2Door.model.Supplier;

import com.kodilla.good.patterns.challenges.Food2Door.model.Client;
import com.kodilla.good.patterns.challenges.Food2Door.model.Product;

import java.util.Map;

public interface Supplier {

    String supplierName();

   void process(Client client, Map<Product, Integer> clientOrders);

}
