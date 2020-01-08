package com.kodilla.good.patterns.challenges.airline;

import java.util.List;

public class FlightRequest {


    private final List<Flight> flightList;

    public FlightRequest(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
