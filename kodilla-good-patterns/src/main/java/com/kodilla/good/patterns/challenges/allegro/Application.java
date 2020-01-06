package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.model.Order;
import com.kodilla.good.patterns.challenges.allegro.output.MailService;
import com.kodilla.good.patterns.challenges.allegro.prepareData.SaleDto;
import com.kodilla.good.patterns.challenges.allegro.prepareData.SaleRequestRetriever;
import com.kodilla.good.patterns.challenges.allegro.prepareSales.CarSalesService;
import com.kodilla.good.patterns.challenges.allegro.savingData.CarSalesRepository;

public class Application {

    public static void main(String[] args) {
        SaleRequestRetriever saleRequestRetriever = new SaleRequestRetriever();
        Order order = saleRequestRetriever.retrieve();

        SalesProcessor salesProcessor = new SalesProcessor(
                new MailService(), new CarSalesService(), new CarSalesRepository());
        SaleDto saleDto = salesProcessor.process(order);

        if (saleDto.isSold()) {
            System.out.println("Order is sending.");
        } else {
            System.out.println("Error");
        }

    }
}
