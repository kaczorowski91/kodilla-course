package com.kodilla.good.patterns.challenges.allegro.output;

import com.kodilla.good.patterns.challenges.allegro.model.Product;
import com.kodilla.good.patterns.challenges.allegro.model.User;

public interface InformationService {

    void sendMessageToUser(User user, Product product);

}
