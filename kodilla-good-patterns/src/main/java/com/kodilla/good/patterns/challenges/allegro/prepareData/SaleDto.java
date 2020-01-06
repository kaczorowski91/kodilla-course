package com.kodilla.good.patterns.challenges.allegro.prepareData;

import com.kodilla.good.patterns.challenges.allegro.model.Product;
import com.kodilla.good.patterns.challenges.allegro.model.User;

public class SaleDto {

    private final User user;
    private final Product product;
    public final boolean isSold;

    public SaleDto(User user, Product product, boolean isSold) {
        this.user = user;
        this.product = product;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSold() {
        return isSold;
    }
}
