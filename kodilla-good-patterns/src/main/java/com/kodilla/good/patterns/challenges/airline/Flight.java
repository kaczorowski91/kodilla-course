package com.kodilla.good.patterns.challenges.airline;

import java.util.Objects;

public class Flight {

    private final String departureFlight;
    private final String arrivalFlight;


    public Flight(String departureFlight, String arrivalFlight) {
        this.departureFlight = departureFlight;
        this.arrivalFlight = arrivalFlight;
    }

    public String getDepartureFlight() {
        return departureFlight;
    }

    public String getArrivalFlight() {
        return arrivalFlight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDepartureFlight(), flight.getDepartureFlight()) &&
                Objects.equals(getArrivalFlight(), flight.getArrivalFlight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureFlight(), getArrivalFlight());
    }

    @Override
    public String toString() {
        return departureFlight + " -> " +arrivalFlight+"\n";
    }
}
