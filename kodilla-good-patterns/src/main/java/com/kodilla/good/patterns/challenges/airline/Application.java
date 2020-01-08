package com.kodilla.good.patterns.challenges.airline;

public class Application {

    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();

        flightService.availableFlight(flightRequestRetriever.retriever());
        flightService.availableFlightFrom(flightRequestRetriever.retriever(),flightRequestRetriever.flightRetriever());
        flightService.availableFlightToParis(flightRequestRetriever.retriever());
        flightService.availableFlightFromWarsawToParisThroughRome(flightRequestRetriever.retriever());
        flightService.availableFlightFromWarsawToParisThroughAnywhere(flightRequestRetriever.retriever());
    }
}
