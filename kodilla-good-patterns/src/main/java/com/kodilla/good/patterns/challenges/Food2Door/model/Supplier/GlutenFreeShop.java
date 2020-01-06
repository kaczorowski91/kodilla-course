package com.kodilla.good.patterns.challenges.Food2Door.model.Supplier;

import com.kodilla.good.patterns.challenges.Food2Door.model.Client;
import com.kodilla.good.patterns.challenges.Food2Door.model.Product;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {

    private final Map<Product, Integer> supplierProduct;

    public GlutenFreeShop() {
        supplierProduct = createSupplierProduct();
    }

    private Map<Product, Integer> createSupplierProduct() {

        Map<Product, Integer> supplierProduct = new HashMap<>();

        supplierProduct.put(new Product("Pizza gluten free"), 150);
        supplierProduct.put(new Product("Hot dog gluten free"), 250);
        supplierProduct.put(new Product("Hamburger gluten free"), 131);

        return supplierProduct;
    }

    @Override
    public String supplierName() {
        return "ExtraFoodShop";
    }

    @Override
    public boolean process(Client client, Map<Product, Integer> clientOrders) {
        return false;
    }
}
