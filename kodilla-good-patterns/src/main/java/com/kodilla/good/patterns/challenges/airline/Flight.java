package com.kodilla.good.patterns.challenges.airline;

import java.util.Map;
import java.util.Objects;

public class Flight {

    private Map flightList;

    public Flight(Map<String, String> flightList) {
        this.flightList=flightList;
    }

    public Map getFlightList() {
        return flightList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getFlightList().equals(flight.getFlightList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightList());
    }
}
