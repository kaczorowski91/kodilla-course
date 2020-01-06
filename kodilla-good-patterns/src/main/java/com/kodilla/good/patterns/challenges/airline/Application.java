package com.kodilla.good.patterns.challenges.airline;

public class Application {

    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        FlightRetriever flightRetriever = new FlightRetriever();

        flightService.availableFlight(flightRetriever.retriever());
      


    }
}
