package com.kodilla.good.patterns.challenges.Food2Door.model.Supplier;

import com.kodilla.good.patterns.challenges.Food2Door.model.Client;
import com.kodilla.good.patterns.challenges.Food2Door.model.Product;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier {

    private final Map<Product, Integer> supplierProduct;

    public ExtraFoodShop() {
        supplierProduct = createSupplierProduct();
    }

    private Map<Product, Integer> createSupplierProduct() {

        Map<Product, Integer> supplierProduct = new HashMap<>();

        supplierProduct.put(new Product("Pizza"), 1500);
        supplierProduct.put(new Product("Hot Dog"), 2500);
        supplierProduct.put(new Product("Hamburger"), 1310);

        return supplierProduct;
    }

    @Override
    public String supplierName() {
        return "ExtraFoodShop";
    }


    @Override
    public void process(Client client, Map<Product, Integer> clientOrders) {

        for (Map.Entry<Product, Integer> entry : clientOrders.entrySet()) {

            Integer quantity = supplierProduct.get(entry.getKey());
            if (quantity == null) {
                System.out.println(entry.getKey()+" Order can't be realize. Supplier hasn't this products");
            }
            else if (entry.getValue() > quantity) {
                System.out.println(entry.getKey()+" Order can't be realize. Supplier hasn't enough quantity of products, supplier has only " + quantity);
            }
            else {
                System.out.println(entry.getKey()+" Order in progress ");
            }
        }
    }
}
