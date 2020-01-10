package com.kodilla.good.patterns.challenges.airline;

public class Application {

    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();

        flightService.availableFlight(flightRequestRetriever.retrieverFlightList());
        flightService.availableFlightFrom(flightRequestRetriever.retrieverFlightList(), flightRequestRetriever.flightRetriever());
        flightService.availableFlightTo(flightRequestRetriever.retrieverFlightList(),flightRequestRetriever.flightRetriever());
        flightService.availableFlightThrough(flightRequestRetriever.retrieverFlightList(),flightRequestRetriever.flightRetriever());
    }
}
