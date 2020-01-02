package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.model.Order;
import com.kodilla.good.patterns.challenges.allegro.output.InformationService;
import com.kodilla.good.patterns.challenges.allegro.prepareDate.SaleDto;
import com.kodilla.good.patterns.challenges.allegro.prepareSales.SalesService;
import com.kodilla.good.patterns.challenges.allegro.savingData.SalesRepository;

public class SalesProcessor {

    private final InformationService informationService;
    private final SalesService salesService;
    private final SalesRepository salesRepository;

    public SalesProcessor(InformationService informationService, SalesService salesService,
                          SalesRepository salesRepository) {
        this.informationService = informationService;
        this.salesService = salesService;
        this.salesRepository = salesRepository;
    }

    public SaleDto process(final Order order) {

        boolean isSold = salesService.createOrder(order.getUser(), order.getProduct(),
                order.getOrderTime(), order.getDeliveryTime());

        if (isSold) {
            informationService.sendMessageToUser(order.getUser(), order.getProduct());
            salesRepository.addOrderToRepository(order);
            return new SaleDto(order.getUser(), order.getProduct(), true);
        } else {
            return new SaleDto(order.getUser(), order.getProduct(), false);
        }

    }

}
