package com.kodilla.good.patterns.challenges.allegro.output;

import com.kodilla.good.patterns.challenges.allegro.model.Product;
import com.kodilla.good.patterns.challenges.allegro.model.User;

public class MailService implements InformationService {

    public void sendMessageToUser(User user, Product product) {
        System.out.println(user.getName() + " " + user.getLastName() + " your order " + product.getProductName());
    }

}
