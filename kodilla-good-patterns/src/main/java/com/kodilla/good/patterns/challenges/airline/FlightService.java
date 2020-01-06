package com.kodilla.good.patterns.challenges.airline;

public class FlightService {

    public void availableFlight(Flight flight) {
        System.out.println("Available Flight " + flight.getFlightList());
    }

/*    public void departureFlight(Flight flight) {
        Map<String, String> departureFlightMap =flight.getFlightList().entrySet().stream()
                .filter(map->map.)
    }*/
}
